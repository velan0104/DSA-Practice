public class ExcelSheetFormat {
    public static void main(String[] args) {
        int num = 701;
        double value = num;
        String result ="";
        while(num > 1){
            int n = num % 26;
            char x= (char) (n-1 + 'A');
            String ans = Character.toString(x);
            result = ans + result;
            value = (double) num / 26;
            num = (int) Math.ceil(value);
        }
        System.out.println(result);
    }
}
