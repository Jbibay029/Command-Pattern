public class PowerOn implements Command {
    private TV tv;

    public PowerOn(TV tv) {
        this.tv = tv;
    }

    @Override
    public String execute() {
        return tv.switchOn();
    }
}
