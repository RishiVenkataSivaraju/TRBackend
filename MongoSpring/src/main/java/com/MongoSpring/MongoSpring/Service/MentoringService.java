package com.MongoSpring.MongoSpring.Service;

import com.MongoSpring.MongoSpring.Model.MntoringRegister;
import com.MongoSpring.MongoSpring.Repository.MentoringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MentoringService {

    private final MentoringRepository mentoringRepository;

    @Autowired
    public MentoringService(MentoringRepository mentoringRepository) {
        this.mentoringRepository = mentoringRepository;
    }

    public MntoringRegister saveMentoringRegister(MntoringRegister mntoringRegister) {
        return mentoringRepository.save(mntoringRegister);
    }

    public List<MntoringRegister> getAllMentoringRegisters() {
        return mentoringRepository.findAll();
    }

    public MntoringRegister getMentoringRegisterById(String id) {
        Optional<MntoringRegister> register = mentoringRepository.findById(id);
        return register.orElse(null);
    }



    public void deleteMentoringRegister(String id) {
        mentoringRepository.deleteById(id);
    }
}
