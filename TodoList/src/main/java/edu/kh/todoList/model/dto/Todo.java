package edu.kh.todoList.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// dto는 테이블(DB)의 데이터를 가져오기 위한 class.
@Data // Getter+Setter+toString
@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든 필드 매개변수 생성자
@Builder
public class Todo {
	private int todoNo; 			// todo 번호
	private String todoTitle; 		// todo 제목
	private String todoDetail; 		// todo 상세내용
	private boolean todoComplete; 	// todo 완료여부
	private String regDate; 		// todo 등록일
}
