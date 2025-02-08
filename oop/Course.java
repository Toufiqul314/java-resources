public class Course {
    String code;
    String title;

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }
    public Course(String code) {
        this.code = code;
        this.title = "Not setted yet";
    }

}
