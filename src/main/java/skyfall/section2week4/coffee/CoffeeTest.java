package skyfall.section2week4.coffee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import skyfall.section2week4.DependencyConfig;
import skyfall.section2week4.member.MemberService;

// 기존 코드
//public class CoffeeTest {
//    public static void main(String[] args) {
//        DependencyConfig dependencyConfig = new DependencyConfig();
//        CoffeeService coffeeService = dependencyConfig.coffeeService();
//        Coffee coffee = new Coffee(0L,"바닐라 라떼","vanilla latte", 5000);
//        coffeeService.createCoffee(coffee);
//
//        if (coffeeService.getCoffee(0L).equals(coffee.getKorName())) {
//            System.out.println("바닐라 라떼가 등록되었습니다.");
//        }
//        coffeeService.editCoffee(0L,"바닐라 라떼",3000);
//
//        if (coffeeService.getCoffee(0L).getPrice() == 3000) {
//            System.out.println("바닐라 라떼의 가격이 정상 변경 되었습니다.");
//        }
//        coffeeService.deleteCoffee(0L);
//        if (coffeeService.getCoffee(0L) == null) {
//            System.out.println("바닐라 라떼가 정상 삭제 되었습니다.");
//        }
//    }
//}
public class CoffeeTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DependencyConfig.class);
        CoffeeService coffeeService = ac.getBean("coffeeService", CoffeeService.class);
        Coffee coffee = new Coffee(0L,"바닐라 라떼","vanilla latte", 5000);
        coffeeService.createCoffee(coffee);

        if (coffeeService.getCoffee(0L).equals(coffee.getKorName())) {
            System.out.println("바닐라 라떼가 등록되었습니다.");
        }
        coffeeService.editCoffee(0L,"바닐라 라떼",3000);

        if (coffeeService.getCoffee(0L).getPrice() == 3000) {
            System.out.println("바닐라 라떼의 가격이 정상 변경 되었습니다.");
        }
        coffeeService.deleteCoffee(0L);
        if (coffeeService.getCoffee(0L) == null) {
            System.out.println("바닐라 라떼가 정상 삭제 되었습니다.");
        }
    }
}
//15:20:39.907 [main] DEBUG org.springframework.context.annotation.AnnotationConfigApplicationContext - Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@76a3e297
//15:20:39.923 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.annotation.internalConfigurationAnnotationProcessor'
//15:20:40.031 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.event.internalEventListenerProcessor'
//15:20:40.033 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.event.internalEventListenerFactory'
//15:20:40.034 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.annotation.internalAutowiredAnnotationProcessor'
//15:20:40.035 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.annotation.internalCommonAnnotationProcessor'
//15:20:40.041 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'dependencyConfig'
//15:20:40.045 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'memberRepository'
//15:20:40.057 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'memberService'
//15:20:40.058 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'coffeeRepository'
//15:20:40.059 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'coffeeService'
//바닐라 라떼의 가격이 정상 변경 되었습니다.
//바닐라 라떼가 정상 삭제 되었습니다.