package com.example.Spring_JPA;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJpaApplicationTests {

	@Autowired
	private ChuyenBayInterface chuyenBayInterface;
	
	@Test
	public void printAllChuyenBayDiDad() {
		chuyenBayInterface.findChuyenBaystoGaDiDAD().forEach(System.out::println);
	}
	
	@Test
	public void printAllChuyenBayDoDaiHon8VaNhoHon10() {
		chuyenBayInterface.findChuyenBayDoDaiHon8VaNhoHon10().forEach(System.out::println);
	}
	 
	@Test
	public void printAllChuyenBayTuSGNToiBMT() {
		chuyenBayInterface.findChuyenBaySGtoiBMT().forEach(System.out::println);
	}
}
