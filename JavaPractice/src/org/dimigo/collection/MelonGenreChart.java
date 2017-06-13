/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *  |_MelonGenreChart
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 13.
 * </pre>
 *
 * @author 이수연
 * @version : 1.0
 */
public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<String, List<Music>>();
		
		List<Music> balladlist = new ArrayList<Music>();
		List<Music> dancelist = new ArrayList<Music>();
			
		
		System.out.println("--<< 멜론 장르별 차트 >>--");
		map.put("발라드", balladlist);
		balladlist.add(new Music("팔레트", "아이유"));
		map.put("댄스", dancelist);
		dancelist.add(new Music("I LUV IT", "PSY"));
		dancelist.add(new Music("맞지?", "언니쓰"));
		
		printMap(map);
		
		System.out.println("--<< 댄스 2위 곡 변경 >>--");
		dancelist.set(1, new Music("SIGNAL", "트와이스"));
		
		printMap(map);
		
		System.out.println("--<< 댄스 1위 곡 삭제 >>--");
		dancelist.remove(0);
		
		printMap(map);
		
		System.out.println("--<< 전체 리스트 삭제 >>--");
		map.clear();
		printMap(map);
		
	}
	
	public static void printMap(Map<String, List<Music>>map){
		for(String key : map.keySet()){
			System.out.println("["+key+"]");
			int i = 1;
			for(Music m : map.get(key)){
				System.out.println(i+"."+m);
				i++;
			}
		}
		System.out.println();
	}

}
