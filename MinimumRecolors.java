class MinimumRecolors {
    public int minimumRecolors(String blocks, int k) {
        int out = Integer.MAX_VALUE;
        int count = 0;

        for(int i=0; i<k; i++){
            char ch = blocks.charAt(i);
            if(ch == 'W'){
                count++;
            }
        }
        if(count < out){
            out = count;
        }

        for(int i=1; i<=blocks.length()-k; i++){
            if(blocks.charAt(i-1) == 'W'){
                count--;
            }
            if(blocks.charAt(i+k-1)=='W'){
                count++;
            }
            if(count < out){
                out = count;
            }
        }
        return out;
    }
}
