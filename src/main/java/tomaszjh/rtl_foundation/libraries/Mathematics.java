package tomaszjh.rtl_foundation.libraries;

public class Mathematics {

    public double getPowerFromRotationalForce(double torque, double rotationalSpeed) {
        return (torque * rotationalSpeed);
    }

    public double getResistance(double volts, double amperes) {
        return (volts / amperes);
    }

    public double getAmperage(double volts, double ohms) {
        return (volts / ohms);
    }


}
