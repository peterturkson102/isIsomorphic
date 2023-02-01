class Solution {
    public boolean isIsomorphic(String s, String t) {
        boolean isIso = false;
if(checkUnique(s).equals(checkUnique(t))){
    return true;
}
return isIso;
    }


    public Map<Integer,Integer> checkUnique(String s){
     Map<Integer,Integer> indexes  = new HashMap(){};
        for(int a =0;a<s.length()-1;a++){
            for(int b =a+1;b<s.length();b++){
                if(s.charAt(a)== s.charAt(b)){
                    indexes.put(a, b);
                }
            }
        }
    return indexes;
    }


}
