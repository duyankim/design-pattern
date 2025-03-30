package com.github.adapter;

/**
 * 도메인 모델 : 송금 완료 알림 DTO
 */
public record TransferCompletedNotificationDto (String transferId, String receiverId, int amount) {

}
