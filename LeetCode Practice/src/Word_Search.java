public class Word_Search {
    public static void main(String[] args) {
//        char[][] board = {{'A','B','C','D'}, {'S','F','C','S'},{'A','D','E','E'}};
//        String word = "ABCCED";
//        System.out.println(search(board,0,0,word));

        int[] height2 = {2,3,4,5,18,17,6};
        int[] height = {1,8,6,2,5,4,8,3,7};
        int ans = findWater(height,0,height.length - 1, 0);
        System.out.println(ans);

    }

    static int findWater(int[] height, int start, int end,int max){
        int water = 0;
        while(start != end){
            water = Math.min(height[start],height[end]) * (end - start);
            if(water > max){
                max = water;
            }
            if(height[start] > height[end]){
                end--;
            }
            else{
                start++;
            }
        }
        return max;
    }
}
