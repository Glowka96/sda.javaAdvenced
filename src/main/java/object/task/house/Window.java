package object.task.house;

public class Window {
    private boolean isOpenWindow;

    Window() {
        isOpenWindow = false;
    }

    public void setOpenWindow() {
        this.isOpenWindow = true;
    }

    @Override
    public String toString() {
        return "\nWindow{" +
                "isOpenWindow=" + isOpenWindow +
                "}";
    }
}
