package skyfall.section2week4.member;

// 객체 정의
public class Member {
    private Long memberId;
    private String email;
    private String name;
    private String phone;

    // 생성자
    public Member(Long memberId, String email, String name, String phone) {
        this.memberId = memberId;
        this.email = email;
        this.name = name;
        this.phone = phone;
    }

    // @게터 @세터
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getMemberId() {
        return memberId;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
