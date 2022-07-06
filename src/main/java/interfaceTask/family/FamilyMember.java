package interfaceTask.family;

public interface FamilyMember {
    default void presentYourself(){
        System.out.println("I am just a simple family member");
    }
    boolean isAdult();
}
