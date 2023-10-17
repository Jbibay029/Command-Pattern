public class PowerOff implements Command {
    private TV tv;

    public PowerOff(TV tv) {
        this.tv = tv;
    }

    @Override
    public String execute() {
        return tv.switchOff();
    }
}
