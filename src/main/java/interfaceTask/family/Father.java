package interfaceTask.family;

public class Father implements FamilyMember {
    private String name;

    public Father(String name) {
        this.name = name;
    }

    @Override
    public void presentYourself() {
        System.out.println("I am father");
    }

    @Override
    public boolean isAdult() {
        return true;
    }
}
