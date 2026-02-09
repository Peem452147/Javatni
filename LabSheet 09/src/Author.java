public class Author {
    private String name;
    private String nationality;
    private int birhyear;

    public Author(String name,String nationality,int birthyear) {
        this.name = name;
        this.nationality = nationality;
        this.birhyear = birthyear;
    }
    public Author(String name, String nationality) {
        this(name,nationality,0);
    }
    public Author(String name) {
        this(name,"",0);
    }
    public Author() {
        this("","",0);
    }
    public String getName() {
        return this.name;
    }
    public String showAuthorInfo() {
        if (this.birhyear == 0)
            return this.name + "(" +this.nationality + ")";
        if (this.nationality.equals(""))
            return this.name;
        return this.name + "(" + this.nationality + ")" + ", born " + this.birhyear + ")";
    }
}
