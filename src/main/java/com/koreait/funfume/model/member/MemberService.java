package com.koreait.funfume.model.member;

import java.util.List;

import org.springframework.stereotype.Service;

import com.koreait.funfume.domain.Member;

@Service
public interface MemberService {
	public List selectAll(); //모든회원목록
	public Member signIn(Member member); 
	public Member select(int member_id);
	//public Member passCheck(String pass);
	public int emailCheck(String email);
	public void join(Member member); //insert
	public void update(Member member);
	public void delete(int member_id);
}
