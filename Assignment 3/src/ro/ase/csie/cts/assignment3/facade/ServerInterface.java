package ro.ase.csie.cts.assignment3.facade;

public interface ServerInterface extends Cloneable {

    public String getIpAddress();
    public int getPort();
    public int getMaxConnections();

    public boolean connect();
    public boolean disconnect();

}