package com.github.adapter;

/**
 * 인바운드 컨트롤러
 */
public class TransferController {
    private final TransferService transferService;

    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }

    public void transfer(TransferRequestDto dto) {
        transferService.completeTransfer(dto.senderId(), dto.receiverId(), dto.amount());
    }
}
