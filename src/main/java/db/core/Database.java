package db.core;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import db.gen.Account;
import db.gen.Order;

import java.util.List;

/**
 * Created by jerry on 2016/10/31.
 */
public class Database {
    BaseDaoImpl test;
//    public static void main(String[] args) {
//        try {
//            Dao<EquipType,Void> equipTypeDao = DaoManager.createDao(ConnectionSources.getInstance().getLocalConn(), EquipType.class);
//            TableUtils.createTable(ConnectionSources.getInstance().getLocalConn(), EquipType.class);
//            for (EquipType equipType : equipTypeDao) {
//                System.out.println(equipType);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
    // we are using the in-memory H2 database
    private final static String DATABASE_URL = "jdbc:sqlite://e:/tim.db";//"jdbc:h2:mem:account";

    private Dao<Account, Integer> accountDao;
    private Dao<Order, Integer> orderDao;
    public static void main(String[] args) throws Exception {
        // turn our static method into an instance of Main
        Database db = new Database();
        db.doMain(args);
    }

    private void doMain(String[] args) throws Exception {
        ConnectionSource connectionSource = null;
        try {
            // create our data-source for the database
            connectionSource = new JdbcConnectionSource(DATABASE_URL);
            // setup our database and DAOs
            setupDatabase(connectionSource);
//            // read and write some data
            readWriteData();
//            // do a bunch of bulk operations
//            readWriteBunch();
//            // show how to use the SelectArg object
//            useSelectArgFeature();
//            // show how to use the SelectArg object
//            useTransactions(connectionSource);
            System.out.println("\n\nIt seems to have worked\n\n");
        } finally {
            // destroy the data source which should close underlying connections
            if (connectionSource != null) {
                connectionSource.close();
            }
        }
    }

    private void readWriteData() throws Exception {
        // create an instance of Account
        String name = "Buzz Lightyear";
        Account account = new Account(name);

        // persist the account object to the database
        accountDao.create(account);

        // create an associated Order for the Account
        // Buzz bought 2 of item #21312 for a price of $12.32
        int quantity1 = 2;
        int itemNumber1 = 21312;
        float price1 = 12.32F;
        Order order1 = new Order(account, itemNumber1, price1, quantity1);
        orderDao.create(order1);

        // create another Order for the Account
        // Buzz also bought 1 of item #785 for a price of $7.98
        int quantity2 = 1;
        int itemNumber2 = 785;
        float price2 = 7.98F;
        Order order2 = new Order(account, itemNumber2, price2, quantity2);
        orderDao.create(order2);

        // construct a query using the QueryBuilder
        QueryBuilder<Order, Integer> statementBuilder = orderDao.queryBuilder();
        // should find both of the orders that match the account
        // ORMLite extracts the id from the account for the query automagically
        statementBuilder.where().eq(Order.ACCOUNT_ID_FIELD_NAME, account);
        List<Order> orders = orderDao.query(statementBuilder.prepare());
    }
    /**
     * Setup our database and DAOs
     */
    private void setupDatabase(ConnectionSource connectionSource) throws Exception {

        accountDao = DaoManager.createDao(connectionSource, Account.class);
        orderDao = DaoManager.createDao(connectionSource, Order.class);
        // if you need to create the table
        TableUtils.createTable(connectionSource, Account.class);
        TableUtils.createTable(connectionSource, Order.class);
    }

//    /**
//     * Read and write some example data.
//     */
//    private void readWriteData() throws Exception {
//        // create an instance of Account
//        String name = "Jim Coakley";
//        Account account = new Account(name);
//
//        // persist the account object to the database
//        accountDao.create(account);
//        int id = account.getId();
//        verifyDb(id, account);
//
//        // assign a password
//        account.setPassword("_secret");
//        // update the database after changing the object
//        accountDao.update(account);
//        verifyDb(id, account);
//
//        // query for all items in the database
//        List<Account> accounts = accountDao.queryForAll();
//        assertEquals("Should have found 1 account matching our query", 1, accounts.size());
//        verifyAccount(account, accounts.get(0));
//
//        // loop through items in the database
//        int accountC = 0;
//        for (Account account2 : accountDao) {
//            verifyAccount(account, account2);
//            accountC++;
//        }
//        assertEquals("Should have found 1 account in for loop", 1, accountC);
//
//        // construct a query using the QueryBuilder
//        QueryBuilder<Account, Integer> statementBuilder = accountDao.queryBuilder();
//        // shouldn't find anything: name LIKE 'hello" does not match our account
//        statementBuilder.where().like(Account.NAME_FIELD_NAME, "hello");
//        accounts = accountDao.query(statementBuilder.prepare());
//        assertEquals("Should not have found any accounts matching our query", 0, accounts.size());
//
//        // should find our account: name LIKE 'Jim%' should match our account
//        statementBuilder.where().like(Account.NAME_FIELD_NAME, name.substring(0, 3) + "%");
//        accounts = accountDao.query(statementBuilder.prepare());
//        assertEquals("Should have found 1 account matching our query", 1, accounts.size());
//        verifyAccount(account, accounts.get(0));
//
//        // delete the account since we are done with it
//        accountDao.delete(account);
//        // we shouldn't find it now
//        assertNull("account was deleted, shouldn't find any", accountDao.queryForId(id));
//    }
//
//    /**
//     * Example of reading and writing a large(r) number of objects.
//     */
//    private void readWriteBunch() throws Exception {
//
//        Map<String, Account> accounts = new HashMap<String, Account>();
//        for (int i = 1; i <= 100; i++) {
//            String name = Integer.toString(i);
//            Account account = new Account(name);
//            // persist the account object to the database, it should return 1
//            accountDao.create(account);
//            accounts.put(name, account);
//        }
//
//        // query for all items in the database
//        List<Account> all = accountDao.queryForAll();
//        assertEquals("Should have found same number of accounts in map", accounts.size(), all.size());
//        for (Account account : all) {
//            assertTrue("Should have found account in map", accounts.containsValue(account));
//            verifyAccount(accounts.get(account.getName()), account);
//        }
//
//        // loop through items in the database
//        int accountC = 0;
//        for (Account account : accountDao) {
//            assertTrue("Should have found account in map", accounts.containsValue(account));
//            verifyAccount(accounts.get(account.getName()), account);
//            accountC++;
//        }
//        assertEquals("Should have found the right number of accounts in for loop", accounts.size(), accountC);
//    }
//
//    /**
//     * Example of created a query with a ? argument using the {@link SelectArg} object. You then can set the value of
//     * this object at a later time.
//     */
//    private void useSelectArgFeature() throws Exception {
//
//        String name1 = "foo";
//        String name2 = "bar";
//        String name3 = "baz";
//        assertEquals(1, accountDao.create(new Account(name1)));
//        assertEquals(1, accountDao.create(new Account(name2)));
//        assertEquals(1, accountDao.create(new Account(name3)));
//
//        QueryBuilder<Account, Integer> statementBuilder = accountDao.queryBuilder();
//        SelectArg selectArg = new SelectArg();
//        // build a query with the WHERE clause set to 'name = ?'
//        statementBuilder.where().like(Account.NAME_FIELD_NAME, selectArg);
//        PreparedQuery<Account> preparedQuery = statementBuilder.prepare();
//
//        // now we can set the select arg (?) and run the query
//        selectArg.setValue(name1);
//        List<Account> results = accountDao.query(preparedQuery);
//        assertEquals("Should have found 1 account matching our query", 1, results.size());
//        assertEquals(name1, results.get(0).getName());
//
//        selectArg.setValue(name2);
//        results = accountDao.query(preparedQuery);
//        assertEquals("Should have found 1 account matching our query", 1, results.size());
//        assertEquals(name2, results.get(0).getName());
//
//        selectArg.setValue(name3);
//        results = accountDao.query(preparedQuery);
//        assertEquals("Should have found 1 account matching our query", 1, results.size());
//        assertEquals(name3, results.get(0).getName());
//    }

//    /**
//     * Example of created a query with a ? argument using the {@link SelectArg} object. You then can set the value of
//     * this object at a later time.
//     */
//    private void useTransactions(ConnectionSource connectionSource) throws Exception {
//        String name = "trans1";
//        final Account account = new Account(name);
//        assertEquals(1, accountDao.create(account));
//
//        TransactionManager transactionManager = new TransactionManager(connectionSource);
//        try {
//            // try something in a transaction
//            transactionManager.callInTransaction(new Callable<Void>() {
//                @Override
//                public Void call() throws Exception {
//                    // we do the delete
//                    assertEquals(1, accountDao.delete(account));
//                    assertNull(accountDao.queryForId(account.getId()));
//                    // but then (as an example) we throw an exception which rolls back the delete
//                    throw new Exception("We throw to roll back!!");
//                }
//            });
//            fail("This should have thrown");
//        } catch (SQLException e) {
//            // expected
//        }
//
//        assertNotNull(accountDao.queryForId(account.getId()));
//    }

//    /**
//     * Verify that the account stored in the database was the same as the expected object.
//     */
//    private void verifyDb(int id, Account expected) throws SQLException, Exception {
//        // make sure we can read it back
//        Account account2 = accountDao.queryForId(id);
//        if (account2 == null) {
//            throw new Exception("Should have found id '" + id + "' in the database");
//        }
//        verifyAccount(expected, account2);
//    }

//    /**
//     * Verify that the account is the same as expected.
//     */
//    private static void verifyAccount(Account expected, Account account2) {
//        assertEquals("expected name does not equal account name", expected, account2);
//        assertEquals("expected password does not equal account name", expected.getPassword(), account2.getPassword());
//    }
}
