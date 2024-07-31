package AccessModifier;

public class Q1 {
    private static String name="vikash";
    private static String location="Bihar";
    private  static String jobs="software developer";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getJobs() {
        return jobs;
    }
    public void setJobs(String jobs) {
        this.jobs = jobs;
    }
    private static  void help(){
        System.out.println("this is private methodes");
    }
    public static void main(String[] args) {
        System.out.println("name is "+name);
        System.out.println("location is"+location);
        System.out.println("jobs "+jobs);
        help();

    }

    
}

