package interfaceTask.family;

public interface FamilyMember {
    public default void presentYourself(){
        System.out.println("I am just a simple family member");
    }
    boolean isAdult();
}
