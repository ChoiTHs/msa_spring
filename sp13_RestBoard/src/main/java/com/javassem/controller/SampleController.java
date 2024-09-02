package com.javassem.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javassem.domain.SampleVO;

//@Controller
@RestController
//@RequestMapping("/sample")
public class SampleController {

    //1. 문자열 반환
//    @ResponseBody
    @GetMapping(value="/getText", produces = "text/plain; charset=UTF-8")
    public String getTest() {
        return "컨트롤러에서 보냈어요!";
    }

    //2. 객체 반환
    @GetMapping("/getObject")
    public SampleVO getObject(Model model){
        SampleVO vo = new SampleVO("김연아", 33, "우리는 지금 레스트 테스트", "000", "PPP");
        model.addAttribute("vo",vo);
        return vo;
    }

    //3. 리스트 객체 반환
    @GetMapping("/getList")
    public List<SampleVO> getList(){
        List<SampleVO> list = new ArrayList<>();
        list.add(new SampleVO("김연아", 33, "우리는 지금 레스트 테스트", "111", "AAA"));
        list.add(new SampleVO("박태환", 22, "수영선수", "222", "BBB"));
        list.add(new SampleVO("세종대왕", 7, "한글창제", "333", "CCC"));
        return list;
    }

    //4. URL 에서 정보 얻기 /sample/{cate}/{no}
    @GetMapping(value="/sample/{cate}/{cno}")
//    public String[] getPath(String cate, Integer cno){
        public String[] getPath(@PathVariable String cate, @PathVariable Integer cno){
        return new String[]{"카테고리 : "+cate, "번호:" + cno};
    }
    
    // http://localhost:8080/rest/query-param?name=aa&age=88&message=hi
    @GetMapping(path = "query-param")  //  @GetMapping("/query-param")
    public String queryParam(
    						@RequestParam String name, 
    						@RequestParam String age, 
    						@RequestParam String message,
    						@RequestParam String phoneNumer,
    						@RequestParam String PINNUMBER
    						
    			) {
    	System.out.println(name);
    	System.out.println(age);
    	System.out.println(message);
    	System.out.println(phoneNumer);
    	System.out.println(PINNUMBER);
    	
    	return name +", " + age+", " + message+", " +phoneNumer +", " + PINNUMBER;
    }
    
    // http://localhost:8080/rest/query-param2?name=doyeon&age=22&message=hello
    @GetMapping(path = "query-param2") 
    public String queryParam2(SampleVO  dto) {  // 객체 타입으로 리턴할때는 @RequestParam 안쓴다. 권장하는 방식
    	
    	System.out.println(dto.getMessage());
    	System.out.println(dto.getName());
    	System.out.println(dto.getAge());
    	System.out.println(dto.getPhoneNumber());
    	
    	return  dto.toString(); 
    }
    
    
    
    @PostMapping(value = "/sample/data")   //http://localhost:8080/rest/sample/data
    public SampleVO post(@RequestBody  SampleVO vo) {
    	
    	System.out.println(vo.getMessage());  // 받아온 객체 각각 멤버변수 출력
    	System.out.println(vo.getName());
    	System.out.println(vo.getAge());
    	
    	System.out.println(vo);  // 받은 객체 바로 출력
    	
    	System.out.println("[확인]");
    	
    	    	
    	return vo;
    }
    
    @PostMapping("/post")
    public void postSample(@RequestBody Map<String, Object>  vo) {
    	
//    	vo.entrySet().forEach(objEntry->{
//    		System.out.println("key : " + objEntry.getKey());
//    		System.out.println("value : " + objEntry.getValue());
//    	});
    	
    	vo.forEach( (key, value)->{
    		System.out.println("key : " + key);
    		System.out.println("value : " + value);
    	});
    }
    
    @DeleteMapping("/sample/delete/{name}")  // http://localhost:8080/rest/sample/delete/yuna
    public void delete(@PathVariable String name) {
    	System.out.println(name);
    }
    
    @PutMapping("/sample/put-name/{name}")
    public SampleVO put(@RequestBody SampleVO dto, @PathVariable(name = "name") String irum) {
    	
    	System.out.println(irum);
    	
    	System.out.println(dto.getMessage());
    	System.out.println(dto.getPhoneNumber());
    	System.out.println(dto.getPINNUMBER());
    	
    	return dto;
    }
    
}





