package chapter07;

public class EuqalsTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        User a = new User();
        User  b = a;
        String c = new String();
        System.out.println("a = b ? "+ a.equals(b) );
        System.out.println("a = c ? "+ a.equals(c) );

        int it = 65;
        float fl = 65.0f;
        System.out.println("65 和 65.0f 是否相等？" + (it == fl)); //
        char ch1 = 'A'; char ch2 = 12;
        System.out.println("65 和'A'是否相等？" + (it == ch1));//
        System.out.println("12 和 ch2 是否相等？" + (12 == ch2));//
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("str1 和 str2 是否相等？"+ (str1 == str2));//
        System.out.println("str1 是否 equals str2？"+(str1.equals(str2)));//
        //System.out.println("hello" == new java.util.Date()); //

    }
}

class User{
    private String host;
    private  String username;
    private String password;
    public User(String host, String username, String password){
        super();
        this.username = username;
        this.password = password;

    }
    public User(){
        super();
    }
    public String getHost(){
        return host;
    }
    public void setHost(String host){
        this.host = host;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    //@Override
    public String tpString(){
        return "user [host=" + host + ", username=" + username + ", password" +
                ":" + password + "]";
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;

        if(obj == null) return false;

        if(getClass() != obj.getClass()) return false;
        User other = (User)  obj;
        if(host == null){
            if(other.host != null) return false;
        }else if(!host.equals(other.host)) return false;

        if(password == null){
            if(other.password !=null) return false;
        }else if(!password.equals(other.password)) return false;

        if(username ==null){
            if(other.username != null) return false;
        }else if(!username.equals(other.username)) return false;

        return true;
    }

}
