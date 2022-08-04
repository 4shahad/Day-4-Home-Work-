public class Customer {
    int Id ;
    String Name ;
    char Gender;

    public Customer(int id, String name, char gender)throws Exception {
        Id = id;
        Name = name;
        if (gender=='F'||gender=='M'||gender=='f'||gender=='m'){
            throw new Exception("there is Just F and M Gender ");
        }else {
        Gender = gender;}
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public char getGender() {
        return Gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Gender=" + Gender +
                '}';
    }
}
