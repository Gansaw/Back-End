<%@ page import="model1.board.BoardDAO"%>
<%@ page import="model1.board.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./IsLoggedIn.jsp"%>
<%
// 폼값 받기
String title = request.getParameter("title");
String content = request.getParameter("content");

// 폼값을 DTO 객체에 저장
BoardDTO dto = new BoardDTO();
dto.setTitle(title);
dto.setContent(content);
dto.setId(session.getAttribute("UserId").toString());

//DAO 객체를 통해 DB에 DTO 저장
BoardDAO dao = null;
try {
    dao = new BoardDAO(application); // BoardDAO 객체 생성
    int iResult = dao.insertWrite(dto); // 글쓰기 메서드 호출
    // 성공 or 실패 여부에 따라 처리
    if (iResult == 1) {
        response.sendRedirect("List.jsp"); // 리스트 페이지로 이동
    } else {
        out.println("<script>alert('글쓰기에 실패하였습니다.'); history.back();</script>"); // 실패 알림창 출력 후 이전 페이지로 이동
    }
} catch (Exception e) {
    e.printStackTrace();
} finally {
    if (dao != null) {
        dao.close(); // 데이터베이스 연결 종료
    }
}

/* //더미 데이터를 삽입하기 위한 코드
iResult = 0;
for (int i = 1; i <= 100; i++) {
    dto.setTitle(title + "-" + i); 
    iResult = dao.insertWrite(dto);
}  */
%>