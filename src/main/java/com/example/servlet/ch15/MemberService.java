package com.example.servlet.ch15;

import com.example.bean.Member;

public class MemberService {

    MemberDAO dao = new MemberDAO();

    public void memberInsert(Member member) {
        dao.insertMember(member);
    }
}
