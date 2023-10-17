public class VolumeDown implements Command {
    private TV tv;

    public VolumeDown(TV tv) {
        this.tv = tv;
    }

    @Override
    public String execute() {
        return tv.VolumeDecreases();
    }
}
