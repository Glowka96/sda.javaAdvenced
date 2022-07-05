package interfaceTask.family;

public class Mother implements FamilyMember{
    private String name;

    public Mother(String name) {
        this.name = name;
    }

    @Override
    public void presentYourself() {
        System.out.println("I am mother");
    }

    @Override
    public boolean isAdult() {
        return true;
    }
}
