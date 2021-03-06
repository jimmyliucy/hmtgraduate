package com.hmt.graduate.paper.utils;

public class Result<T> {

	private String status;// 响应状态编码
	private String message;// 响应信息
	private T data;// 返回成功信息

	/**
	 * 响应status和message
	 * @param status
	 * @param message
	 */
	public Result(String status, String message) {
		this.status = status;
		this.message = message;
	}

	/**
	 * 响应status、message和result
	 * @param status
	 * @param message
	 * @param data
	 */
	public Result(String status, String message, T data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Result [status=" + status + ", message=" + message + ", data="
				+ data + "]";
	}

}