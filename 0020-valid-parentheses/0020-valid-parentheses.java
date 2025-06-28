class Solution {
    public boolean isValid(String s) {
        int count1=0;
        int count2=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
                count1++;
            }
            else if(ch==')'||ch==']'||ch=='}'){
                count2++;
            }
            if(!st.isEmpty()){
            if(ch==']'&&st.peek()=='['){
                st.pop();
               // count2++;
            }
            else if(ch=='}'&&st.peek()=='{'){
                st.pop();
               // count2++;
            }
            else if(ch==')'&&st.peek()=='('){
                st.pop();
               // count2++;
            }
            }
        }
        if((st.isEmpty()&&(count1==count2))&&(s.length()%2==0)){
            return true;
        }
        return false;
    }
}