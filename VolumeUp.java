public class VolumeUp implements Command {
    private TV tv;

    public VolumeUp(TV tv) {
        this.tv = tv;
    }

    @Override
    public String execute() {
        return tv.VolumeIncrease();
    }
}
