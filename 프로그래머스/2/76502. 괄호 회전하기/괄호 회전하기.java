class Solution {
    public int solution(String s) {
        int length = s.length();
        
        if (length % 2 == 1) {
            return 0;
        }
        
        char[] brackets = s.toCharArray();
        char[] stack = new char[length];
        int answer = 0;
        
        for (int rotation = 0; rotation < length; rotation++) {
            int top = 0;
            boolean valid = true;
            
            for (int i = 0; i < length; i++) {
                // 문자열을 직접 회전하지 않고, 회전된 위치만 계산
                char bracket = brackets[(rotation + i) % length];
                
                if (bracket == '(' || bracket == '[' || bracket == '{') {
                    stack[top++] = bracket;
                } else {
                    // 닫는 괄호와 여는 괄호가 짝이 아닌 경우
                    if (top == 0) {
                        valid = false;
                        break;
                    }
                    
                    char open = stack[--top];
                    
                    if (!isPair(open, bracket)) {
                        valid = false;
                        break;
                    }
                }
            }
            
            if (valid && top == 0) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean isPair(char open, char close) {
            return (open == '(' && close == ')')
                || (open == '[' && close == ']')
                || (open == '{' && close == '}');
    }
}