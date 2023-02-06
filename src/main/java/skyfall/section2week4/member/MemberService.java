package skyfall.section2week4.member;

// 구현된 기능 객체에 의존해 기능을 실행할 객체
public class MemberService {
    private final MemberRepository memberRepository = new MemberRepository();

    public void createMember(Member member) {
        memberRepository.postMember(member);
    }
    public Member getMember(Long memberId) {
        return memberRepository.getMember(memberId);
    }
    public void deleteMember(Long memberId) {
        memberRepository.deleteMember(memberId);
    }
}