import java.util.HashMap;
import java.util.Map;


class Main {
    public static void main(String[] args) {
String str ="my name is tom . my home is delhi, i am haappy";
String []s=str.split("");
Map <String,Integer> map =new HashMap<String, Integer> ();


for(int i=0;i<s.length;i++){
    if(map.containsKey(s[i]))
    {
    int count = map.get(s[i]);
    map.put(s[i],count+1);
    }
    else{
        map.put(s[i],1);
    }
}
System.out.println(map);

    }
}