package skyfall.section2week4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import skyfall.section2week4.coffee.CoffeeRepository;
import skyfall.section2week4.member.MemberRepository;

// 생성자 주입
// 컴포넌트에 객체를 담아 스프링 컨테이너가 관리하게 두고
//@Component
//public class Dependency_Constructor {
//    private final MemberRepository memberRepository;
//    private final CoffeeRepository coffeeRepository;
//
//    // 생성자에 오토와이어드를 입력해 자동 주입하게끔 만듦
//    @Autowired
//    public Dependency_Constructor(MemberRepository memberRepository, CoffeeRepository coffeeRepository) {
//        this.memberRepository = memberRepository;
//        this.coffeeRepository = coffeeRepository;
//    }
//}
