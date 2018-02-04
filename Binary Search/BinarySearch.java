class BinarySearch {
	public static void main(String args []) {
		int[]arr = new int[10];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;
		arr[9] = 10;

		System.out.println(""+binarySearch(arr, 4));

	}

	public static Boolean binarySearch(int[] arr, int n){
    if(arr.length == 0) {
        return false;
    } else {
        if(n<arr[arr.length/2]) {
            int[] firstarray = new int[arr.length/2];
            for(int i= 0;i<arr.length/2;i++){
                firstarray[i]=arr[i];
                System.out.println("first : " + arr[i]);
            }
            return binarySearch(firstarray,n);
        } else if(n == arr[arr.length/2]) {
            return true;
        } else {
            int[] secondarray = new int[arr.length/2];
            int j=0;
            for(int i= arr.length/2 + 1;i<arr.length;i++){
                secondarray[j]=arr[i];
                System.out.println("second : " + arr[i]);
                j++;
            }
            return binarySearch(secondarray,n);
        }
    }
}
}