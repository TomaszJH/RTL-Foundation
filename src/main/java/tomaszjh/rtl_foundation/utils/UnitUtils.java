package tomaszjh.rtl_foundation.utils;

public class UnitUtils {

    public enum RadiationUnit implements Unit {
        SV("Sv"),
        GY("Gy"),
        REM("Rem");

        private final String symbol;

        RadiationUnit(String symbol) {
            this.symbol = symbol;
        }
        @Override
        public String  getSymbol() {
            return symbol;
        }
    }

    public interface Unit {
        String getSymbol();
    }

}
