package skyfall.section2week4.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

// 해쉬맵 형태로
// 가입, 조회, 삭제 기능 구현
@Component
public class MemberRepository {
    private static Map<Long, Member> members = new HashMap<>();

    public void postMember(Member member) {
        members.put(member.getMemberId(), member);
    }
    public Member getMember(Long memberId) {
        return members.get(memberId);
    }
    public void deleteMember(Long memberId) {
        members.remove(memberId);
    }
}
