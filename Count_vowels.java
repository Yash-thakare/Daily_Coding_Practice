class Main {
    public static void main(String[] args) {
        
        String str ="sbuvvobvihv";
        str= str.toLowerCase();
        char ch []= str.toCharArray();
        int vowel =0, cons =0;
        for(int i=0;i<ch.length;i++){
             if(ch[i] == 'a' || ch[i]== 'e'|| ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){
                
                vowel =vowel+1;
                
            }
            else{
                cons = cons+1;
            }
        }
        
        
        
        System.out.println("vowel"+vowel);
        System.out.println("cons"+cons);
    }
}