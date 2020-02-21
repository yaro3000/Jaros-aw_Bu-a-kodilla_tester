public class User {
    int userAge;
    String userName;

    public User(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public static void main(String[] args) {
        User dominik = new User("Dominik", 20);
        User kuba = new User("Kuba", 18);
        User anna = new User("Anna", 34);
        User kasia = new User("Kasia", 54);
        User krzysztof = new User("Krzysztof", 42);
        User emanuel = new User("Emanuel", 15);
        User seweryn = new User("Seweryn", 28);
        User gosia = new User("Gosia", 60);

        User[] users = {dominik, kuba, anna, kasia, krzysztof, emanuel, seweryn, gosia};

        int avarageAge = 0;
        for (int i = 0; i < users.length; i++) {
            avarageAge = avarageAge + users[i].userAge;
        }
        boolean showMidAvarage;
        int midAvarageAge = avarageAge / users.length;
        for (int n = 0; n < users.length; n++) {
            showMidAvarage = users[n].userAge < midAvarageAge;
            if (showMidAvarage) {
                System.out.println(users[n].userName);
            }
        }
    }
}


