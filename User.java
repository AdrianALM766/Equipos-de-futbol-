public class User {
    private String Name;
    private int Id;
    public User(String name, int id) {
        Name = name;
        Id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    @Override
    public String toString() {
        return "Name=" + Name + ", Id=" + Id;
    }
    
}
