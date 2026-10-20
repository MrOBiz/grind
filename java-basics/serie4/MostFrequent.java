package serie4;

class MostFrequent {

    public static void main(String[] args) {
        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int size = tab1.length;

        int freq = 1;
        int elt = tab1[0];
        for(int i = 0; i < size; i++){
            int newFreq = 1;
            for(int k = i+1; k < size; k++){
                if(tab1[i] == tab1[k]){
                    newFreq++;
                }
            }

            if(newFreq > freq){
                freq = newFreq;
                elt = tab1[i];
            }
        }

        System.out.println("##Most repeated element: " + elt);
        System.out.println("##number of times: " + freq);

    }
}
