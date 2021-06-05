package Naruto;

public class Test {
    String value;

    public Test(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "Test{" +
                "value='" + value + '\'' +
                '}';
    }

    public void setValue(String value) {
        this.value = value;
    }


}
