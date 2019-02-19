class BitManipulation {

    public int singleNumber(int[] nums) {
        int a = 0;
        for(int i : nums) {
            a ^= i;
        }
        return a;
    }

}


////////////////////////////////////////////////////////////
///////////////  DO NOT TOUCH TEST BELOW!!!  ///////////////
////////////////////////////////////////////////////////////

class Main  {
    public static void main(String[] args) {
        BitManipulation bitManipulation = new BitManipulation();
        int[] nums = new int[]{4,1,2,1,2};
        System.out.println(bitManipulation.singleNumber(nums));
    }
}
