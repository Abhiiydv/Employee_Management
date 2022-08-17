package com.emp.exception;

public class ResourceNotFoundException extends RuntimeException {
	
	
	private String resourceName;
	private String fieldName;
	private Object fieldValue;
	public String getResourceName() {
		return resourceName;
	}
	
	public String getFieldName() {
		return fieldName;
	}
	
	public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
		super(String.format("%s not found with the %s : %s", resourceName, fieldName, fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public Object getFieldValue() {
		return fieldValue;
	}
		

}
