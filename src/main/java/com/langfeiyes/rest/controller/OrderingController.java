package com.langfeiyes.rest.controller;

import com.langfeiyes.rest.domain.Ordering;
import com.langfeiyes.rest.util.JsonResult;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RestController  // @Controller  + @ResponseBody
@RequestMapping("ordering")
public class OrderingController {
    @GetMapping
    public List<Ordering> list(){
        List<Ordering> list = Arrays.asList(new Ordering(1L,"货单1","dafei","xiaofei","goods1","2023-04-30","nothing"), new Ordering(2L,"货单2","dafei","xiaofei","goods1","2023-04-30","2nd"));
        return list;
    }
    @GetMapping("/{id}")
    public Ordering detail(@PathVariable Long id){
        return new Ordering(id,"货单1","dafei","xiaofei","goods1","2023-04-30","nothing");
    }

    @GetMapping("/listId/{id}")
    public Ordering listId(@PathVariable Long id){
        return new Ordering(id,"货单1","dafei","xiaofei","goods1","2023-04-30","nothing");
    }

    @GetMapping("/listCarrier/{carrier}")
    public Ordering listCarrier(@PathVariable String carrier){
        return new Ordering(5L,"货单1","dafei",carrier,"goods1","2023-04-30","nothing");
    }

    @PostMapping("/save")
    public Ordering save(Ordering ordering){
        ordering.setId(1L);
        return ordering;
    }
    @PutMapping
    public Ordering update(Ordering ordering){
        ordering.setTitle(ordering.getTitle() + "_update");
        return ordering;
    }
    @DeleteMapping
    public JsonResult delete(Long id){
        return JsonResult.success();
    }
}
