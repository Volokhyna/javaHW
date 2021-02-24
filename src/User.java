import java.util.Arrays;

public class User {
    private int id;
    private String name;
    private String[] skills;
    private Wallet wallet;

    public User() {
        //дефолтний конструктор
    }

    public User(int id, String name, String[] skills) {
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    public User(int id, String name, Wallet wallet) {
        this.id = id;
        this.name = name;
        this.wallet = wallet;
    }

    public User(int id, String name, String[] skills, Wallet wallet) {
        this.id = id;
        this.name = name;
        this.skills = skills;
        this.wallet = wallet;
    }

    public User(int id, String name, String[] skills, String type, int sum) {
        this.id = id;
        this.name = name;
        this.skills = skills;
        this.wallet = new Wallet(type, sum);
    }

    public void setId(int id) {
        if ( id < 0) {
            System.out.println("error");
        } else {
            this.id = id;
        }
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skills=" + Arrays.toString(skills) +
                ", wallet=" + wallet +
                '}';
    }
}
