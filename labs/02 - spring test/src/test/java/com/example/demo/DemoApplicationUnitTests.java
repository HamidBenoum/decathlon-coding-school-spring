package com.example.demo;

import com.example.demo.service.TransferService;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class DemoApplicationUnitTests {

	@Test
	public void should_return_5() {
		TransferService transferService = new TransferService();
		int transferCount = transferService.getTransferCount();
		Assertions.assertThat(transferCount).isEqualTo(5);
	}

}
