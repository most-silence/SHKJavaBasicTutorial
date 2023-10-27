package chapter08;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class CodeBlockExercise {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    User user1 = new User();
    System.out.println(user1.getInfo());

        User user2 = new User("song", "888");
        System.out.println(user2.getInfo());

    }
}

class User{
    private String username;
    private String password;
    private long registratonTime;

    public User(){
        System.out.println("New User");
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String formattedTime = currentTime.format(formatter);

        //System.out.println("当前本地时间: " + currentTime);
        //System.out.println("当前本地时间（格式化后）： " + formattedTime);

        username = formattedTime;
        password = "123456";
        try{
            registratonTime = Long.parseLong(formattedTime);
        } catch (NumberFormatException e) {
            registratonTime = 0;
        } finally {

        }
    }
    public User(String username, String password){
        System.out.println("New User");
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String formattedTime = currentTime.format(formatter);
        registratonTime = Long.parseLong(formattedTime);

        this.username = username;
        this.password = password;
    }


    public void setUsername(String username){

    }

    public String getUsername(){
        return username;
    }

    public void setPassword(String password){

    }

    public String getPassword(){
        return password;
    }

    public long getRegistratonTime(){
        return registratonTime;
    }

    public String getInfo(){
        return "Usename:" + username + " Password:" + password
                + " RegisterTime:" + registratonTime + "\n";
    }

}