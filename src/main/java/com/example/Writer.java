package com.example;


public class Writer {

	private String writerName;
	private int writerNumber;

	public String getWriterName() {
		return writerName;
	}

	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}

	public int getWriterNumber() {
		return writerNumber;
	}

	public void setWriterNumber(int writerNumber) {
		this.writerNumber = writerNumber;
	}

	public String WriteGreenLantern() {
		String message = "green lantern";
		return message;
	}

	public String WriteNumberPlusNumber(int numberToAdd, int anotherNumberToAdd) {
		int result = numberToAdd + anotherNumberToAdd;
		return Integer.toString(numberToAdd) + " + " + Integer.toString(anotherNumberToAdd) + " equals "
				+ Integer.toString(result);
	}

	public String WriteSubtractNumber(int firstNumber, int numberToSubtract) {
		int result = firstNumber - numberToSubtract;
		return Integer.toString(firstNumber) + " - " + Integer.toString(numberToSubtract) + " is gelijk aan "
				+ Integer.toString(result);
	}
}
