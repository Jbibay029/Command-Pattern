public class NextChannel implements Command {
    private TV tv;

    public NextChannel(TV tv) {
        this.tv = tv;
    }

    @Override
    public String execute() {
        return tv.nxtChannel();
    }
}
