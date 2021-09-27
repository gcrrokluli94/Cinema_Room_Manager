class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        String[] insert = input.nextLine().split(" ");
        int size = insert.length;
        int[] arr = new int[size];
	     for (int i = 0; i < arr.length; i++) {
	         arr[i] = Integer.parseInt(insert[i]);
         }
        int rotation = input.nextInt();
        rotation %= arr.length;
        for (int i = 0; i < rotation; i++) {
            int temp = arr[arr.length - 1];
            for ( int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
        for(int v : arr){
            System.out.print(v + " ");
        }
    }
}
