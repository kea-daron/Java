package nested_classes.example;

class User{
    private int id;
    private String name;
    private String email;
    private String profile;
    public User(Builder builder){
        id = builder.id;
        name = builder.name;
        email = builder.email;
        profile = builder.profile;
    }
    static class Builder{
        private int id;
        private String name;
        private String email;
        private String profile;
        Builder builder(){
            return this;
        }
        Builder setId(int id){
            this.id = id;
            return this;
        }
        Builder setName(String name){
            this.name = name;
            return this;
        }
        Builder setEmail(String email){
            this.email = email;
            return this;
        }
        Builder setProfile(String profile){
            this.profile = profile;
            return this;
        }
        User build(){
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", profile='" + profile + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args){
        User user = new User.Builder().builder()
                .setId(12)
                .build();
        System.out.println(user);
    }
}

