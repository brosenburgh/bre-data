package org.bre.data.util;

import org.bre.data.entity.Account;
import org.bre.data.entity.Address;
import org.bre.data.entity.Device;
import org.bre.data.enumeration.DeviceStatus;
import org.bre.data.enumeration.DeviceType;
import org.bre.data.repository.AccountRepository;
import org.bre.data.repository.DeviceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Profile("dataloader")
@SpringBootApplication
@EnableMongoRepositories(basePackageClasses=AccountRepository.class)
@ConfigurationProperties
public class DBLoader implements CommandLineRunner {
	
	Logger log = LoggerFactory.getLogger(DBLoader.class);
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private DeviceRepository deviceRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DBLoader.class, args);
	}
	
	/**
	 * Refresh and seed DB with some accounts
	 */
	public void run(String... args) throws Exception {

		accountRepository.deleteAll();
		deviceRepository.deleteAll();

		// save a couple of accounts
		Account dto1 = new Account("Bob", "Rosenburgh", "robert.rosenburgh@gmail.com", "robert.rosenburgh@gmail.com", "password");
		dto1.getProfile().setAddress(new Address("2250 11TH ST NW", "#102", "Washington", "DC", "20001", "US"));
		Account a1 = accountRepository.save(dto1);
		deviceRepository.save(new Device(null, "X0013XNO8T", "Bobby's PI", DeviceStatus.ACTIVE, DeviceType.RASPBERRYPI, a1.getId()));
		
		Account dto2 = new Account("Mike", "Hoyt", "mikehoyt@gmail.com", "mikehoyt@gmail.com", "password");
		dto2.getProfile().setAddress(new Address("11462 nantucket park way", null, "San Diego", "CA", "92130", "US"));
		Account a2 = accountRepository.save(dto2);
		deviceRepository.save(new Device(null, "X00_???", "Mikey's PI", DeviceStatus.ACTIVE, DeviceType.RASPBERRYPI, a2.getId()));
		
		// fetch all accounts
		log.debug("Accounts loaded:");
		log.debug("-------------------------------");
		for (Account account : accountRepository.findAll()) {
			log.debug(account.toString());
		}

		// fetch all devices
		log.debug("Devices loaded:");
		log.debug("-------------------------------");
		for (Device device : deviceRepository.findAll()) {
			log.debug(device.toString());
		}
	}
}
