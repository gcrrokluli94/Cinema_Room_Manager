class ArrayOperations {
    public static int[][][] createCube() {
        int element = 0;
        final int n = 3;
        int[][][] cube = new int[n][n][n];
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    cube[i][j][k] = element++;
                }
            }
            element = 0;
        }
        return cube;
    }
}