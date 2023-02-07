package skyfall.section2week4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;
import skyfall.section2week4.member.Member;

import java.util.Optional;

//public class AutowiredTest {
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
//    }
//
//    static class TestBean {
//        // 자동 주입할 대상이 없는 경우 -> 수정자 메서드 자체가 호출되지 않음
//        @Autowired(required = false)
//        public void setNoBean1(Member noBean1) {
//            System.out.println("noBean1 : " + noBean1);
//        }
//        // 자동 주입 대상이 없는 경우 null 입력
//        @Autowired
//        public void setNoBean2(@Nullable Member noBean2) {
//            System.out.println("noBean2 : " + noBean2);
//        }
//        // 자동 주입 대상이 없는 경우 Optional.empty 입력
//        @Autowired
//        public void setNoBean3(Optional<Member> noBean3) {
//            System.out.println("noBean3 : " + noBean3);
//        }
//    }
//}
//// 결과
//// noBean2 : null
//// noBean3 : Optional.empty