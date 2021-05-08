import java.util.Locale;

public class Name {
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int methodRetornar(){
        int count = name.length();
        return count;
    }
    public String methodRevez(){
        String methodRevez = "";
        for(int i= name.length() - 1; i>=0; i--){
            methodRevez += name.charAt(i);
        }
        return methodRevez;
    }
}
