public class Function {
    private String name;
    private String body;

    public Function(String name, String body) {
        this.name = name;
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        String temp = "";
        temp = name + ": " + body;
        return temp;
    }
}
