package com.lufin.server.common.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

	MISSING_REQUIRED_VALUE("E400001", "필수 입력 값이 누락되었습니다."),
	INVALID_PASSWORD_FORMAT("E400002", "비밀번호는 최소 8자리 이상이어야 하며, 특수문자를 포함해야 합니다."),
	INVALID_EMAIL_FORMAT("E400003", "잘못된 이메일 형식입니다."),
	INVALID_ROLE_SELECTION("E400004", "정확한 역할을 선택해주세요."),
	INSUFFICIENT_STOCK("E400005", "아이템 재고가 부족합니다."),
	INVALID_PURCHASE_QUANTITY("E400006", "유효하지 않은 구매 수량입니다."),
	INVALID_INPUT_VALUE("E400007", "잘못된 입력 값입니다."),
	INVALID_DEPOSIT_AMOUNT("E400008", "입금 금액은 0보다 커야 합니다."),
	INVALID_WITHDRAWAL_AMOUNT("E400009", "출금 금액은 0보다 커야 합니다."),
	CLASS_CODE_INVALID("E400010", "클래스 입장 코드가 잘못되었습니다."),
	INVALID_FILE_NAME_FORMAT("E400011", "파일 이름 형식이 잘못되었습니다."),
	PURCHASE_STATUS_NOT_BUY("E400012", "아이템 구매 상태가 BUY가 아니어서 처리할 수 없습니다."),
	REQUEST_ALREADY_HANDLED("E400013", "이미 처리된 요청입니다."),
	INVALID_ENUM("E400014", "잘못된 입력 값입니다."),
	MISSION_CAPACITY_FULL("E400015", "미션 참여 인원이 모두 찼습니다."),
	ALREADY_CLOSED_ACCOUNT("E400016", "이미 해지된 계좌입니다."),
	INVALID_UPDATE_REQUEST("E400017", "같은 상태로는 업데이트할 수 없습니다."),
	CANNOT_CLOSE_RECENT_ACCOUNT("E400018", "생성일로부터 1년 이내 계좌는 해지할 수 없습니다."),

	INVALID_CREDENTIALS("E401001", "이메일 또는 패스워드를 확인해주세요."),
	UNAUTHORIZED_ACCESS("E401002", "인증이 필요합니다."),
	TOKEN_EXPIRED("E401003", "인증이 만료되었습니다. 다시 로그인해 주세요."),
	INVALID_AUTH_HEADER("E401004", "Authorization 헤더가 없거나 형식이 잘못되었습니다."),
	INVALID_TOKEN("E401005", "유효하지 않은 토큰입니다."),
	INVALID_TOKEN_TYPE("E401006", "토큰 타입이 잘못되었습니다."),

	FORBIDDEN_REQUEST("E403001", "요청을 처리할 수 없습니다."),
	REQUEST_DENIED("E403002", "요청이 거부되었습니다."),
	MEMBER_ALREADY_DELETED("E403003", "탈퇴된 사용자입니다."),
	STUDENT_NOT_IN_TEACHER_CLASS("E403004", "해당 학생은 교사의 반에 속하지 않습니다."),

	CLASS_NOT_FOUND("E404001", "해당 클래스가 존재하지 않습니다."),
	PURCHASE_RECORD_NOT_FOUND("E404002", "해당 구매 내역을 찾을 수 없습니다."),
	MEMBER_NOT_FOUND("E404003", "사용자를 찾을 수 없습니다."),
	INVESTMENT_PRODUCT_NOT_FOUND("E404004", "해당 투자 상품을 찾을 수 없습니다."),
	MISSION_NOT_FOUND("E404005", "해당 미션을 찾을 수 없습니다."),
	LOAN_APPLICATION_NOT_FOUND("E404006", "해당 대출 신청 정보를 찾을 수 없습니다."),
	ITEM_NOT_FOUND("E404007", "해당 아이템을 찾을 수 없습니다."),
	LOAN_PRODUCT_NOT_FOUND("E404008", "해당 대출 상품을 찾을 수 없습니다."),
	ACCOUNT_NOT_FOUND("E404009", "계좌를 찾을 수 없습니다."),
	ITEM_REQUEST_NOT_FOUND("E404010", "해당 아이템 사용 요청을 찾을 수 없습니다."),
	TRANSACTION_NOT_FOUND("E404011", "거래 내역을 찾을 수 없습니다."),
	CREDIT_SCORE_NOT_FOUND("E404012", "해당 회원의 신용 점수를 찾을 수 없습니다."),
	INVESTMENT_NEWS_NOT_FOUND("E404013", "해당 투자 공시 정보를 찾을 수 없습니다."),
	INVESTMENT_PRICE_NOT_FOUND("E404014", "해당 투자 가격 정보를 찾을 수 없습니다."),

	EMAIL_ALREADY_REGISTERED("E409001", "이미 가입된 이메일입니다."),
	DUPLICATE_COUPON_USAGE("E409002", "이미 등록된 교번/학번 입니다."),
	DUPLICATE_CLASSROOM("E409003", "이미 등록된 클래스입니다."),
	LOAN_APPLICATION_ALREADY_EXISTS("E409004", "이미 진행중인 대출이 존재합니다."),
	DUPLICATE_NEWS("E409005", "이미 생성된 공시정보가 존재합니다."),
	DUPLICATE_UPDATE("E409006", "이미 생성된 가격 변동이 존재합니다."),
	MISSION_APPLICATION_ALREADY_EXISTS("E409007", "이미 진행중인 미션이 존재합니다."),

	INSUFFICIENT_CREDIT_SCORE("E422001", "신용 점수가 부족하여 이용할 수 없습니다."),
	INSUFFICIENT_BALANCE("E422002", "잔액이 부족합니다."),
	ACCOUNT_TEMPORARILY_LOCKED("E422003", "해당 계정은 5분간 로그인할 수 없습니다."),
	INVALID_EXTENSION("E422004", "허용되지 않은 확장자입니다."),
	LOAN_AMOUNT_EXCEEDS_MAX("E422005", "요청 금액이 대출 상품의 최대 한도를 초과합니다."),
	CLASS_HAS_STUDENTS("E422006", "사용자가 남아있어 클래스를 삭제할 수 없습니다."),
	INSUFFICIENT_STOCK_AMOUNT("E422007", "주식 개수가 부족합니다."),
	CREDIT_RECOVERY_NOT_ALLOWED("E422009", "신용 상태가 복구 대상이 아닙니다."),

	SERVER_ERROR("E500001", "요청을 처리할 수 없습니다. 다시 시도해 주세요."),
	CREDIT_SCORE_UPDATE_FAILED("E500002", "신용 점수 업데이트에 실패했습니다."),
	SERVICE_UNAVAILABLE("E503001", "현재 서비스를 이용할 수 없습니다. 잠시 후 다시 시도해 주세요."),

	// 웹소켓 관련 에러 코드 추가
	WEBSOCKET_CONNECTION_FAILED("WS400001", "웹소켓 연결에 실패했습니다."),
	WEBSOCKET_MESSAGE_ERROR("WS400002", "웹소켓 메시지 처리 중 오류가 발생했습니다."),
	WEBSOCKET_AUTH_REQUIRED("WS401001", "웹소켓 연결에 인증이 필요합니다."),
	WEBSOCKET_UNAUTHORIZED("WS403001", "웹소켓 작업 권한이 없습니다."),
	WEBSOCKET_DEST_NOT_FOUND("WS404001", "웹소켓 대상을 찾을 수 없습니다."),
	WEBSOCKET_INTERNAL_ERROR("WS500001", "웹소켓 서버 오류가 발생했습니다."),

	// AI 관련 에러 코드 추가
	GENERATE_FAILED("AI500001", "AI를 활용한 생성에 실패했습니다. 잠시 후 다시 시도해 주십시오.");

	private final String code;
	private final String message;
}
