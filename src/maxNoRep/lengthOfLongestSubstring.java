package maxNoRep;

import java.util.*;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
	    System.out.println("Input your string.");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] strchar = str.toCharArray();
        int position;
        int[] value;
        value = new int[strchar.length];
        for(position = 0; position<strchar.length; position++){
            Map m = new HashMap<Integer,Character>();
            for(int cnt = 0; cnt < strchar.length - position; cnt ++){
                if(!m.containsValue(strchar[cnt])){
                    m.put(cnt, strchar[cnt]);
                }else value[position] = m.size();
            }
        }
        Arrays.sort(value);
        System.out.println(value[strchar.length - 1]);
    }
}
