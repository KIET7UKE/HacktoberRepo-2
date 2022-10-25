public class swap {
    public static void main(String[] args) {
        int[][] arr =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        int r = arr.length;
        int c = arr[0].length;
        int[][] ans = new int[c][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
//                    arr[rows][cols] = ans[rows][cols];
                ans[j][i] = arr[i][j];
            }
        }
        System.out.println(ans);
    }
}
