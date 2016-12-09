import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list = makeList();
		Map<Integer,int[]> map = new HashMap();
		map = arrayMap(list);	
		show(list,map);
	}
	
	//产生List
	public static List makeList(){
		List<Integer> list= new ArrayList();		
		for(int i=0; i<50; ++i){
		 int a = (int)(Math.random()*100);
		 list.add(a);
		}
		return list;
	}
	
	//产生Map
	public static Map<Integer,int[]> arrayMap(List<Integer> list){
		Map<Integer,int[]> map = new HashMap();
		for(int i=1; i<=10; ++i){
			int[] arry={};			
			Iterator<Integer> iter = list.iterator();  
	        while(iter.hasNext()){
	        	Integer a = iter.next();
	        	if((int)a/10 == i){
	        	arry = Arrays.copyOf(arry, arry.length+1);
				arry[arry.length-1]= a;
	        	}
	        }
			map.put(i,arry);
		}
		return map;
	}
	
	public static Map sortMap(Map<Integer,int[]> map){
		Map<Integer,int[]> maps = map;
		
		return maps;
	}
	
	//显示功能
	public static void show(List<Integer> list,Map<Integer,int[]> map){
		System.out.print("随机生成50个小于100的数，分别为：");
		
		Iterator<Integer> iter = list.iterator();  
        while(iter.hasNext()){
        	System.out.print(iter.next()+",");
        	}
        System.out.println();
        
        StringBuilder str = new StringBuilder("Map中的数据为:{");


        	Iterator<Integer> it = map.keySet().iterator();
        	while (it.hasNext()) {
            	str.append(it.next()+"=>");
            	int[] arry =map.get(it.next());
            	str.append("[");
            	for(int i=0; i<arry.length; ++i){
            		str.append(arry[i]+",");
            	}
        		str.append("],");
        	}
        System.out.println(str);
        }
		
		
	
	
	
	
}
