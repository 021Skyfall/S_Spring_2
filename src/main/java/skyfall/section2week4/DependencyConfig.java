package skyfall.section2week4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import skyfall.section2week4.coffee.CoffeeRepository;
import skyfall.section2week4.coffee.CoffeeService;
import skyfall.section2week4.member.MemberRepository;
import skyfall.section2week4.member.MemberService;

// Spring DI
//public class DependencyConfig {
    // new 키워드롤 사용해 같은 객체를 두 번 만드는 문제
//    public MemberService memberService() {
//        return new MemberService(new MemberRepository());
//    }
//    public CoffeeService coffeeService() {
//        return new CoffeeService(new CoffeeRepository());
//    }

    // 수정
//    public MemberRepository memberRepository() {
//        return new MemberRepository();
//    }
//    public MemberService memberService() {
//        return new MemberService(memberRepository());
//    }
//    public CoffeeRepository coffeeRepository() {
//        return new CoffeeRepository();
//    }
//    public CoffeeService coffeeService() {
//        return new CoffeeService(coffeeRepository());
//    }

    // 싱글톤 컨테이너 적용
@Configuration
public class DependencyConfig {
    @Bean
    public MemberRepository memberRepository() {
        return new MemberRepository();
    }
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
    @Bean
    public CoffeeRepository coffeeRepository() {
        return new CoffeeRepository();
    }
    @Bean
    public CoffeeService coffeeService() {
        return new CoffeeService(coffeeRepository());
    }
}
// 기존 코드에서 애너테이션 추가
