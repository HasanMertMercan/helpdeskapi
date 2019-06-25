package com.mercanmert.helpdesksystem.Services;

import com.mercanmert.helpdesksystem.Entities.Operator;
import com.mercanmert.helpdesksystem.Repositories.OperatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OperatorService {

    @Autowired
    private OperatorRepository operatorRepository;

    public List<Operator> getAllOperators(){
        List<Operator> operators = new ArrayList<>();
        operatorRepository.findAll().forEach(operators::add);
        return operators;
    }

    public Operator getOperatorById(int operatorId){
        Operator operator = new Operator();
        operator = operatorRepository.findById(operatorId).orElse(null);
        return operator;
    }

    public void addOperator(Operator operator){
        operatorRepository.save(operator);
    }

    public void updateOperator(Operator operator){
        operatorRepository.save(operator);
    }

    public void deleteOperator(Operator operator){
        operatorRepository.delete(operator);
    }

    public void deleteOperatorById(int operatorId){
        operatorRepository.deleteById(operatorId);
    }
}
