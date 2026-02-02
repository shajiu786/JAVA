

	import java.sql.Connection;
	import java.sql.PreparedStatement;

	public class StudentTable {

	    public static void main(String[] args) {

	        try {
	            // ✅ Step 1: Get Connection
	            Connection con = DBconnection.getConnection();

	            // ✅ Step 2: SQL Insert Query
	            String sql = "INSERT INTO student(name, age, department) VALUES(?,?,?)";

	            // ✅ Step 3: PreparedStatement
	            PreparedStatement pst = con.prepareStatement(sql);

	            pst.setString(1, "Shaji");
	            pst.setInt(2, 21);
	            pst.setString(3, "CSE");

	            // ✅ Step 4: Execute
	            int rows = pst.executeUpdate();

	            System.out.println(rows + " ✅ Student Inserted Successfully!");

	            // ✅ Step 5: Close Connection
	            con.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


