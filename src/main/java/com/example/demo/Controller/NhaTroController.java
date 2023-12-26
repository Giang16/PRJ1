package com.example.demo.Controller;

import com.example.demo.JpaRepository.NhaTroRepository;
import com.example.demo.Model.NhaTro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NhaTroController {

    @Autowired
    private NhaTroRepository nhaTroRepository;

    @RequestMapping("/CreateNhaTro")
    public int CreateNhaTro(@RequestBody NhaTro nhatro){
        String reqtennt = nhatro.getTennt();
        String reqdiachi = nhatro.getDiachi();

        if(reqtennt != null && reqdiachi != null){
            NhaTro newNhaTro = new NhaTro(reqtennt, reqdiachi);
            nhaTroRepository.save(newNhaTro);
            return 1; //Tạo NhaTro thành công
        }
        else{
            return 0; //Không thành công
        }
    }

    @RequestMapping("/UpdateNhaTro")
    public int UpdateNhaTro(@RequestBody NhaTro nhatro){
        Integer mant = nhatro.getMant();

        String reqtennt = nhatro.getTennt();
        String reqdiachi = nhatro.getDiachi();

        //Kiểm tra tồn tại mant không
        NhaTro existingNhaTro = nhaTroRepository.findByMant(mant);
        if(existingNhaTro != null){
            existingNhaTro.setTennt(reqtennt);
            existingNhaTro.setDiachi(reqdiachi);
            nhaTroRepository.save(existingNhaTro);
            return 1;// Update thành công
        }
        else{
            return 0; // ERROR
        }
    }

//    @DeleteMapping("/DeleteNhaTro")
//    public int DeleteNhaTro(){
//
//    }
}
