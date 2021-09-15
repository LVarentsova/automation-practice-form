package guru.qa.tests;

public class TestData {
    public static String firstName = "Egor";
    public static String lastName = "Ivanov";
    public static String userEmail = "egor.ivanov@yandex.ru";
    public static String gender = "Male";
    public static String phone = "8912345678";
    public static String month = "July";
    public static String year = "2005";
    public static String day = "012";
    public static String dayShort = day.substring(1, 3);
    public static String subject = "Math";
    public static String hobby = "Reading";
    public static String fileName = "img/img1.jpg";
    public static String fileNameShort = fileName.replaceAll("^(.+/)", "");
    public static String currentAddress = "main street";
    public static String state = "NCR";
    public static String city = "Delhi";
}
