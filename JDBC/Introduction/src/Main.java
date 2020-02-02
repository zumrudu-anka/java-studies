import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        JDBCIntroductionWithDelete();
    }

    public static void JDBCIntroductionWithDelete(){
        Connection connection = null;
        DBHelper dbHelper = new DBHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = dbHelper.getConnection();
            String sql = "Delete from city where id = ?";
            statement = connection.prepareStatement(sql); // Buradaki soru isareti kullanicidan veri bekler. Istersek biz de doldurabiliriz
            statement.setInt(1,4082); // Birinci sayisal parametre kac numarali soru isaretinin degerini giriyoruz onu temsil ediyor.
            int result = statement.executeUpdate(); // Kayittan sonra etkilenen satir sayisi doner
            System.out.println("Kayit Silindi");
        } catch (SQLException e) {
            dbHelper.showErrorMessage(e);
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void JDBCIntroductionWithUpdate(){
        Connection connection = null;
        DBHelper dbHelper = new DBHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = dbHelper.getConnection();
            String sql = "Update city set Population = 50000, District = 'Duzce' where id = ?";
            statement = connection.prepareStatement(sql); // Buradaki soru isareti kullanicidan veri bekler. Istersek biz de doldurabiliriz
            statement.setInt(1,4082); // Birinci sayisal parametre kac numarali soru isaretinin degerini giriyoruz onu temsil ediyor.
            int result = statement.executeUpdate(); // Kayittan sonra etkilenen satir sayisi doner
            System.out.println("Kayit Güncellendi");
        } catch (SQLException e) {
            dbHelper.showErrorMessage(e);
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void JDBCIntroductionWithInsert(){
        Connection connection = null;
        DBHelper dbHelper = new DBHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = dbHelper.getConnection();
            String sql = "Insert into city (Name, CountryCode, District, Population) values (? , ?, ?, ?)";
            statement = connection.prepareStatement(sql); // Buradaki soru isareti kullanicidan veri bekler. Istersek biz de doldurabiliriz
            statement.setString(1,"Duzce 2"); // BU sekilde ? biraktigimiz alanlari dolduruyoruz
            statement.setString(2,"TUR");
            statement.setString(3,"Turkey");
            statement.setInt(4,100000);
            int result = statement.executeUpdate(); // Kayittan sonra etkilenen satir sayisi doner
            System.out.println("Kayit Eklendi");
        } catch (SQLException e) {
            dbHelper.showErrorMessage(e);
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void JDBCIntroductionWithSelect(){
        Connection connection = null;
        DBHelper dbHelper = new DBHelper();
        Statement statement = null;
        ResultSet resultSet;
        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("Select * from country");
            ArrayList<Country> countries = new ArrayList<Country>();
            while(resultSet.next()){
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")
                ));
            }
            System.out.println(countries.size());
            System.out.println("Baglanti olustu");
        } catch (SQLException e) {
            dbHelper.showErrorMessage(e);
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
