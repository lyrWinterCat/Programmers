package level_1;

public class FindKim {
    public String solution(String[] seoul) {
        String answer = "";
        int position=0;
        for (int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")){
                position=i;
            }
        }
        answer="김서방은 "+position+"에 있다";
        return answer;
    }
}
