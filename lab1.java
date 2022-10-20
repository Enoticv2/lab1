public class lab1{
    public static double second(double x){
        return Math.pow((0.5 / (0.25 + x + (3 / (3 + Math.pow( (x/2),2) )))) , Math.sin(Math.pow((x/(Math.PI)),x)));
    }
    public static double third(double x){
        return (Math.pow((Math.log10(Math.exp(Math.pow((3/(Math.asin((x-0.5)/7))),3))))/(Math.cos((Math.sin(x+4))/(Math.asin((x-0.5)/7)))+1), Math.pow(Math.cbrt(Math.pow((x+0.25)/x,2)),Math.cbrt(Math.log10(Math.abs(x))))));
    }


    public static void main(String[]args){
        int[] a = new int[12];
        int n = 2;
        for(int i = 0; i <= 11; i++) {
            a[i] = n;
            n += 2;
        }

        double[] x = new double[11];
        for(int i = 0; i <= 10; i++){
            x[i] = Math.random() * 7 - 4;
        }

        double[][] b = new double[12][11];
        for(int i = 0; i <= 11; i++){
            for(int j = 0; j <= 10; j++){
                if (a[i] == 4) {
                    b[i][j] = Math.tan(Math.pow((3*(Math.log10(Math.abs(x[j]))+0.75)),Math.cbrt(x[j])));
                }
                else if (a[i] == 2 || a[i] == 10 || a[i] == 14 || a[i] == 16 || a[i] == 22 || a[i] == 24){
                    b[i][j] = lab1.second(x[j]);
                }
                else{
                    b[i][j] = lab1.third(x[j]);
                }
            }
        }
        for (int i = 0; i <= 11; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.printf(" %8.4f ", b[i][j]);
            }
            System.out.print("\n");
        }
    }
}