package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : JAVA Stream  
 * @File    : Stream_1.java
 * @Package : lambda
 * @author  : seokjunkang
 * @Date    : 2022. 8. 17. 오전 1:25:41
 */
public class Stream_1 {

	/*
	 * Stream 이란 
	 * 
	 * 1. 다양한 데이토 소스를 표준화된 방법으로 다루기 위한 것.
	 * Lambda를 활용할 수 있는 기술중 하나
	 * 
	 * 2. 스트림은 Iterator 처럼 일회용임 -> 최종 연산이 끝나면 스트림은 닫혀버린다. 
	 * 	-> 필요하다면 다시 스트림을 생성해야함.
	 *  
	 *  -> EX) strStream.foreach(System.out::println); // 모든 요소를 화면에 출력함(최종연산)
	 *  ->>>   int numofSum = strStream.scount(); // 에러 -> 스트림이 이미 닫혔음. 
	 * * 아래 main 의 예외 케이스 1번 임
	 * 
	 * 3. 스트림은 최종 연산 전까지 중간연산이 수행되지 않는다 - 지연된 연산
	 * 
	 * * 예외케이스 2번 문항.
	 * 
	 * 
	 * 특이점
	 * !! 배열 & 컬렉션 인스턴스는 for , foreach로 하나씩 돌면서 꺼낸다. 
	 *   -> 간단한 경우가 아니면 로직이 섞이고 복잡해진다.  
	 * 
	 * Stream의 3가지로 나누면 
	 *   - 생성하기 : 스트림 인스턴스 생성
	 *   - 가공하기 : 필터링(filtering) 및 맵핑 원하는 결과를 만들어가는 중간 작업
	 *   - 결과 만들기 : 최종적으로 결과를 만들어 내는 작업 .
	 * 
	 * 순서 : 전체 -> 맵핑 -> 필터링1 -> 필터링2 -> 결과 만들기 -> 최종 결과물
	 * 
	 */
	
	// Collection 스트림을 위한 인터페이스
	public interface Collection<E> extends Iterable<E> {
		default Stream<E> stream() {
			return StreamSupport.stream(spliterator(), false);
		}
	} // interface 
	
	public static void main(String[] args) {
		
		// Collection 스트림 --------------------------------------------------------------------------------------------------
		// 인터페이스에 추가된 디폴트 method Stream 을 이용해서 만들수 있다.
		List<Integer> list = Arrays.asList(1,3,4,5,2);
		Stream<Integer> listStream = list.stream();
		Stream<Integer> parallelStream = list.parallelStream(); // 병렬 처리 스트림
		
		System.out.println(list + " 원본 list"); // list
		
		// 예외 케이스 1번
		//listStream.sorted().forEach(System.out::print); // 스트림 내부 정렬 -> 최종연산이므로 listStream 은 다시 사용 불가. 
		//System.out.println(listStream.count()); // 에러가 발생함.
		
		// Stream 연산을 정렬 후 새로운 list에 결과를 담는다.
		List<Integer> resultList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(resultList + " Stream 작업 List");
		
		
		
		
		// 배열 스트림 ----------------------------------------------------------------------------------------------------------------------------------------
		String[] arr = new String[] {"a","b","c"}; // 배열
		
		Stream<String> arrStream = Arrays.stream(arr); // 배열을 Stream 형태로 변환 -> 배열 전체
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3); // 인덱스 1포함, 3제외  (배열의 시작, 종료 인덱스{종료인덱스는 포함 안됨.}) 즉 1번부터 -> [b,c] 
		streamOfArrayPart.forEach(System.out::print); // 출력
		
		
		System.out.println();
		// 예외 케이스 2번----------------------------------------------------------------------------------------------------------------------------------------
		IntStream intStream = new Random().ints(1, 46); // 1~ 45 범위의 무한 스트림 --> 무한히 숫자를 반환해줌. 
		intStream.distinct().limit(6).sorted() 			// 중간 연산 -> distinct(중복제거) , limit(자르기) , sorted(정렬)
					.forEach(i -> System.out.print(i + " "));  // 최종연산
		
		
		
	} // main

} //class
