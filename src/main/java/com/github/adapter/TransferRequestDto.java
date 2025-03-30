package com.github.adapter;

public record TransferRequestDto(String senderId, String receiverId, int amount) {

}
