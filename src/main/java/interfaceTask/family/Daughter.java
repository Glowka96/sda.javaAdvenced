package interfaceTask.family;

public class Daughter implements FamilyMember{
    private String name;

    public Daughter(String name) {
        this.name = name;
    }

    @Override
    public void presentYourself() {
        System.out.println("I am daughter " + name);
    }

    @Override
    public boolean isAdult() {
        return false;
    }
}
