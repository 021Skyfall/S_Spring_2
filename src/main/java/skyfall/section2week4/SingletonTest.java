package skyfall.section2week4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import skyfall.section2week4.member.MemberService;
import skyfall.section2week4.singleton.SingletonService;

// 싱글톤 패턴 적용 전
//public class SingletonTest {
//    static DependencyConfig dependencyConfig = new DependencyConfig();
//
//    static MemberService memberService1 = dependencyConfig.memberService();
//    static MemberService memberService2 = dependencyConfig.memberService();
//
//    public static void main(String[] args) {
//        System.out.println("memberService1 : " + memberService1);
//        System.out.println("memberService2 : " + memberService2);
//    }
//}
/*
* 같은 memberService 를 사용하지만 뒤에 붙은 주소값이 다름
* 수 많은 객체를 생성하게 되면 위에 방식은 메모리 낭비와 효율성이 떨어지게 됨
* 이 문제에 대한 해결법으로 싱글톤 패턴 사용 가능
*/

// singletonService 객체 싱글톤 패턴 적용 후
//public class SingletonTest {
//    static SingletonService singletonService1 = SingletonService.getInstance();
//    static SingletonService singletonService2 = SingletonService.getInstance();
//
//    public static void main(String[] args) {
//        System.out.println("singletonService1 : " + singletonService1);
//        System.out.println("singletonService2 : " + singletonService2);
//    }
//}
// 모두 같은 인스턴스를 참조
// 단, 착각하지 말아야할게 지금 이전에 작성해둔 memberService 객체를 참조하는게 아니고 새로 singleton 클래스를 만들어서 해당 인스턴스를 참조하고 있는 것임
// 즉, 그냥 싱글톤 패턴 예시를 들려고 작성한 소스코드임

// 기존 소스코드에 싱글톤 컨테이너 적용
public class SingletonTest {
    // 스프링 소환
    static AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DependencyConfig.class);

    // 각 객체를 getBean 메소드로 호출
    static MemberService memberService1 = ac.getBean("memberService", MemberService.class);
    static MemberService memberService2 = ac.getBean("memberService",MemberService.class);

    public static void main(String[] args) {
        System.out.println("memberService1 : " + memberService1);
        System.out.println("memberService2 : " + memberService2);
    }
}
// 결과
// memberService1 : skyfall.section2week4.member.MemberService@68c9d179
// memberService2 : skyfall.section2week4.member.MemberService@68c9d179