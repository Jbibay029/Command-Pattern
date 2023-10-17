import java.util.Scanner;

public class ViewerApp {
    public static void main(String[] args) {
        TV tv = new TV();
        RemoteControl rc = new RemoteControl();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Press 1 to turn On TV ");
            System.out.println("Press 2 to turn Off TV ");
            int input = scan.nextInt();

            switch (input) {
                case 1:
                    boolean innerchoice = false;
                    int volume = 20;
                    PowerOn powerOn = new PowerOn(tv);
                    System.out.println(powerOn.execute());
                    while (!innerchoice) {
                        System.out.println("Press 1 to turn the TV volume up ");
                        System.out.println("Press 2 to turn the TV volume down ");
                        System.out.println("Press 3 to switch to the next channel ");
                        System.out.println("Press 4 to switch to the previous channel ");
                        System.out.println("Press 5 to go back ");
                        int choice = scan.nextInt();
                        switch (choice) {
                            case 1:
                                VolumeUp volumeup = new VolumeUp(tv);
                                System.out.println(volumeup.execute());
                                volume++;
                                System.out.println("Volume is " + volume);
                                break;
                            case 2:
                                VolumeDown volumedown = new VolumeDown(tv);
                                System.out.println(volumedown.execute());
                                volume--;
                                System.out.println("Volume is " + volume);
                                break;
                            case 3:
                                NextChannel nextchannel = new NextChannel(tv);
                                System.out.println(nextchannel.execute());
                                break;
                            case 4:
                                PrevChannel prevchannel = new PrevChannel(tv);
                                System.out.println(prevchannel.execute());
                                break;
                            case 5:
                                System.out.println("Going back to main menu");
                                innerchoice = true;
                                break;
                        }
                    }
                    break;
                case 2:
                    PowerOff powerOff = new PowerOff(tv);
                    System.out.println(powerOff.execute());
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
            }
        }
    }
}
