// Given a string s, find the length of the longest substring without repeating characters.
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.

import java.util.*;


class SubString {

    static int LongestSubstring(String str) 
    {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxlength=0;
        int subStringEnd=0;
        for(int i=0;i<str.length();i++)
        {
            char currentChar=str.charAt(i);
            if(map.containsKey(currentChar))
            {
                subStringEnd=Math.max(subStringEnd,map.get(currentChar)+1);
            }
            map.put(currentChar,i);
            maxlength=Math.max(maxlength,i-subStringEnd+1);
        }
        return maxlength;
    }

    public static void main(String[] args) {
        String str = "pwwkhjhyuyuiiopopopopolkjhgfdslklkkk";

        System.out.println(LongestSubstring(str));
    }
}