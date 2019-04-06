package com.example.demo;

import com.example.demo.repository.TransferRepository;
import com.example.demo.service.TransferService;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class DemoApplicationUnitTests {

	@Test
	public void should_return_5() {
		TransferRepository transferRepository = new TransferRepository();
		TransferService transferService = new TransferService(transferRepository);
		int transferCount = transferService.getTransferCount();
		Assertions.assertThat(transferCount).isEqualTo(5);
	}

}
