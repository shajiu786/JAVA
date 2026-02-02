

	import java.sql.Connection;
	import java.sql.Statement;
	import java.sql.ResultSet;

	public class StudentView {

	    public static void main(String[] args) {

	        try {
	            // ✅ Step 1: Get Connection
	            Connection con = DBconnection.getConnection();

	            // ✅ Step 2: SQL Select Query
	            String sql = "SELECT * FROM student";

	            Statement st = con.createStatement();
	            ResultSet rs = st.executeQuery(sql);

	            System.out.println("📌 Student Table Records:");
	            System.out.println("--------------------------");

	            // ✅ Step 3: Read Data
	            while (rs.next()) {

	                System.out.println(
	                        "ID: " + rs.getInt("id") +
	                        " | Name: " + rs.getString("name") +
	                        " | Age: " + rs.getInt("age") +
	                        " | Dept: " + rs.getString("department")
	                );
	            }

	            // ✅ Step 4: Close Connection
	            con.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

