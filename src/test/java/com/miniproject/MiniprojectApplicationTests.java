/*
 * package com.miniproject;
 * 
 * import org.junit.jupiter.api.Test; import
 * org.springframework.boot.test.context.SpringBootTest;
 * 
 * @SpringBootTest class MiniprojectApplicationTests {
 * 
 * @Test void contextLoads() { }
 * 
 * }
 */
package com.miniproject;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MiniprojectApplicationTests {
	 public static void main(String[] args)
	 {
		 List<Integer> ls= Arrays.asList(1,2,10,26,0,7,3,4,9);
	       System.out.println("---------highest number----------");
	       int num= ls.stream().max(Integer::compare).get();
	        System.out.println(num);
	       System.out.println("---------sortred numbers----------");
	        List<Integer> sorted = ls.stream()
	                               .sorted()
	                               .collect(Collectors.toList());
	        System.out.println(sorted);
	 }
 }
 