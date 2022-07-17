package p1;

public class LaserBeams {
    public static void main(String[] args) {
        int beams = numberOfBeams(new String[]{"011001", "000000", "010100", "001000"});
        System.out.println("Number of beams : " + beams);
    }

    public static int numberOfBeams(String[] bank) {
        int beams = 0;
        int rowSecurityDevice = 0;
        int previousSecurityDevice = 0;

        for (String string : bank) {
            rowSecurityDevice = 0;
            for (char ch : string.toCharArray()) {
                if (ch == '1') {
                    rowSecurityDevice++;
                }
            }
            if (rowSecurityDevice > 0) {
                beams += (rowSecurityDevice * previousSecurityDevice);
                previousSecurityDevice = rowSecurityDevice;
            }
        }
        return beams;
    }
}



