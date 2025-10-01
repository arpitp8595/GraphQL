package com.example.model;

public class ProcessResult {

    private boolean success;
    private String message;
    private String transactionId;
    private String status;

    public ProcessResult() {}

    public ProcessResult(boolean success, String message, String transactionId, String status) {
        this.success = success;
        this.message = message;
        this.transactionId = transactionId;
        this.status = status;
    }

    // Getters and setters
    public boolean isSuccess() { return success; }
    public void setSuccess(boolean success) { this.success = success; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getTransactionId() { return transactionId; }
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
