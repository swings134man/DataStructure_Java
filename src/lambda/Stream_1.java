package lambda;

import java.util.Arrays;
import java.util.List;
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
	 * Lambda를 활용할 수 있는 기술중 하나
	 * 
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
	}
	
	public static void main(String[] args) {
		
		// Collection 스트림 
		// 인터페이스에 추가된 디폴트 method Stream 을 이용해서 만들수 있다.
		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> listStream = list.stream();
		Stream<String> parallelStream = list.parallelStream(); // 병렬 처리 스트림
		
		
		
		// 배열 스트림
		String[] arr = new String[] {"a","b","c"}; // 배열
		
		Stream<String> arrStream = Arrays.stream(arr); // 배열을 Stream 형태로 변환 -> 배열 전체
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3); // 인덱스 1포함, 3제외  (배열의 시작, 종료 인덱스{종료인덱스는 포함 안됨.}) 즉 1번부터 -> [b,c] 
		streamOfArrayPart.forEach(System.out::print); // 출력
		
	}

}
