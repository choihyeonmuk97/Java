package p0627;

public class C0627_04 {
    public static void main(String[] args) {
        try{
//            Exception e = new Exception("고의로 발생시켰음.");
//            throw e;
            System.out.println(0/0);

        }catch(Exception e){
            System.out.println("에러메세지 : "+e.getMessage());
            e.printStackTrace(); // 보통 얘만 적음.
        } finally {
            // 예외의 발생여부에 관계 없이 항상 수행되어야하는 문장을 넣음.
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
