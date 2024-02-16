package Factory;

import Core.Server;

/**
 * ServerFactory implements AbstractComputerFactory and AbstractComputerFactory returns
 * reference of super interface Computer which shows one extra layer of abstraction.
 *
 * @author KK JavaTutorials
 */
public class ServerFactory implements AbstractComputerFactory {

    private String ram;
    private String hdd;
    private String cpu;
    private boolean isGraphicsEnabled;
    private boolean isBluetoothEnabled;


    public ServerFactory(String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
        super();
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.isGraphicsEnabled = isGraphicsEnabled;
        this.isBluetoothEnabled = isBluetoothEnabled;
    }

    /**
     * Overridden method of AbstractComputerFactory
     * which returns reference of super interface Computer
     */
    @Override
    public Computer createComputer() {

        return new Server(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
    }

}