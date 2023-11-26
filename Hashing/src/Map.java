//import java.util.Arrays;
//
//public class Map {
//    public static void main(String[] args){
//        int[] arr ={1, 5, 8, 9, 5};
//        System.out.println(Arrays.toString(getFrequencies(arr,10)));
//    }
//   public static int[] getFrequencies(int []v, int max) {
//       int[] freq = new int[2];
////       for (int j : v) {
////           if (j > max) {
////               max = j;
////           }
////       }
//       int[] hash = new int[max];
//       for (int i = 0; i < max; i++) hash[v[i] - 1] += 1;
//       int highest = 0;
//       for (int i = 1; i < max; i++) {
//           int lowest = hash[i];
//           if (hash[i] < lowest) {
//               lowest = i;
//               freq[1] = lowest;
//           }
//           if (hash[i] > highest) {
//               highest = i;
//               freq[0] = highest;
//           }
//       }
//       return freq;
//
//
//   }
//
//}
