package cn.itcast.ssm.exception;

public class CustomException extends Exception{

	//�쳣��Ϣ
	public String message;
	
	public CustomException(String message)
	{
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
