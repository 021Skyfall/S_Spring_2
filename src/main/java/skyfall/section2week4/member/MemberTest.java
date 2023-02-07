package skyfall.section2week4.member;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import skyfall.section2week4.DependencyConfig;

//public class MemberTest {
//    public static void main(String[] args) {
//        DependencyConfig dependencyConfig = new DependencyConfig();
//        MemberService memberService = dependencyConfig.memberService();
//        Member member = new Member(0L, "lucky@codestates.com", "KimLucky", "010-1234-5678");
//        memberService.createMember(member);
//
//        Member currentMember = memberService.getMember(0L);
//
//        System.out.println("회원 가입한 유저 : " + member.getName());
//        System.out.println("현재 첫번째 유저 : " + currentMember.getName());
//
//        if (member.getName().equals(currentMember.getName())) {
//            System.out.println("새롭게 가입한 사용자와 현재 사용자가 같습니다.");
//        }
//
//        // 계-삭
//        memberService.deleteMember(0L);
//
//        if (memberService.getMember(0L) == null) {
//            System.out.println("회원 탈퇴가 정상적으로 완료되었습니다.");
//        }
//    }
//}
// 기존 코드

public class MemberTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DependencyConfig.class);
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        Member member = new Member(0L, "lucky@codestates.com", "KimLucky", "010-1234-5678");
        memberService.createMember(member);

        Member currentMember = memberService.getMember(0L);

        System.out.println("회원 가입한 유저 : " + member.getName());
        System.out.println("현재 첫번째 유저 : " + currentMember.getName());

        if (member.getName().equals(currentMember.getName())) {
            System.out.println("새롭게 가입한 사용자와 현재 사용자가 같습니다.");
        }

        // 계-삭
        memberService.deleteMember(0L);

        if (memberService.getMember(0L) == null) {
            System.out.println("회원 탈퇴가 정상적으로 완료되었습니다.");
        }
    }
}
// 결과
//15:17:05.387 [main] DEBUG org.springframework.context.annotation.AnnotationConfigApplicationContext - Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@76a3e297
//15:17:05.400 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.annotation.internalConfigurationAnnotationProcessor'
//15:17:05.503 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.event.internalEventListenerProcessor'
//15:17:05.505 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.event.internalEventListenerFactory'
//15:17:05.506 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.annotation.internalAutowiredAnnotationProcessor'
//15:17:05.507 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.annotation.internalCommonAnnotationProcessor'
//15:17:05.514 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'dependencyConfig'
//15:17:05.517 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'memberRepository'
//15:17:05.532 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'memberService'
//15:17:05.533 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'coffeeRepository'
//15:17:05.534 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'coffeeService'
//회원 가입한 유저 : KimLucky
//현재 첫번째 유저 : KimLucky
//새롭게 가입한 사용자와 현재 사용자가 같습니다.
//회원 탈퇴가 정상적으로 완료되었습니다.