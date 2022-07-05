package interfaceTask.family;

public class Son implements FamilyMember{
    private String name;

    public Son(String name) {
        this.name = name;
    }

    @Override
    public void presentYourself() {
        System.out.println("Who’s asking?");
    }

    @Override
    public boolean isAdult() {
        return false;
    }
}
