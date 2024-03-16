import java.sql.*; // Use classes in java.sql package

public class JdbcDeleteTest { // Save as "JdbcDeleteTest.java"
    public static void main(String[] args) {
        try (
                // Step 1: Allocate a database 'Connection' object
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "myUser", "1234"); // for MySQL only

                // Step 2: Allocate a 'Statement' object in the Connection
                Statement stmt = conn.createStatement();
        ) {
            // Step 3 & 4: Execute a SQL DELETE statement via executeUpdate(),
            //   which returns an int indicating the number of rows affected.

            // DELETE records with id>=3000 and id<4000
            String sqlDelete = "delete from books where id >= 3000 and id < 4000";
            System.out.println("The SQL statement is: " + sqlDelete + "\n"); // Echo for debugging
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted.\n");

            // Step 5: Issue a SELECT (via executeQuery()) to check the changes
            String strSelect = "select from books";
            System.out.println("The SQL statement is: " + strSelect + "\n"); // Echo For debugging
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()) { // Move the cursor to the next row
                System.out.println(rset.getInt("id") + ", "
                        + rset.getString("author") + ", "
                        + rset.getString("title") + ", "
                        + rset.getDouble("price") + ", "
                        + rset.getInt("qty"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } // Step 5: Close conn and stmt - Done automatically by try-with-resources
    }
}