package com.eibfs.bankingapp.dto;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
//@ToString(exclude="accountCreeated")
public class Account {
	// ecapsulation. 
	// we will have all props in private. 
	
	private String accountHolderName; 
	private String accountNumber;
	private float balance;
	
	private String accountType; 
	private String contactNumber; 
	private String address;
	@Getter(value = AccessLevel.NONE)
	@Setter(value = AccessLevel.NONE)
	private LocalDateTime accountCreated = LocalDateTime.now();
	private boolean isActive; 
    // toString method is overridden

	
	@Override
	public String toString() {
		return "Account [accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber + ", balance="
				+ balance + ", accountType=" + accountType + ", contactNumber=" + contactNumber + ", address=" + address
				+ ", accountCreated=" 
				+ accountCreated.format(DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:SS"))+ "]";
				
				
				
	} 


}
