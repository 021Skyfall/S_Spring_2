package skyfall.section2week4.singleton;

public class SingletonService {
    // static 영역에 객체를 1개만 생성
    private static final SingletonService instance = new SingletonService();

    // 객체 인스턴스가 필요하면 아래 public static 메소드를 통해서만 조회할 수 있도록 함
    public static SingletonService getInstance() {
        return instance;
    }

    // 생성자를 private 으로 선언하고 외부에서 new 키워드를 통해 객체 생성 불가하게 작성
    private SingletonService() {}
}
