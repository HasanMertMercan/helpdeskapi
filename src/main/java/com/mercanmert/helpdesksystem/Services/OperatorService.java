package com.mercanmert.helpdesksystem.Services;

import com.mercanmert.helpdesksystem.Entities.Operator;
import com.mercanmert.helpdesksystem.Repositories.OperatorRepository;
import com.mercanmert.helpdesksystem.Repositories.TicketRepository;
import com.mercanmert.valuetypes.enums.Department;
import com.mercanmert.valuetypes.enums.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OperatorService {

    @Autowired
    private OperatorRepository operatorRepository;

    @Autowired
    private TicketRepository ticketRepository;

    public List<Operator> getAllOperators(){
        List<Operator> operators = new ArrayList<>();
        operatorRepository.findAll().forEach(operators::add);
        return operators;
    }

    public List<Operator> getAllByDepartment(Department department){
        List<Operator> operatorList;
        operatorList = operatorRepository.findByDepartment(department);
        return operatorList;
    }

    public List<Operator> getAllByLocation(Location location){
        List<Operator> operatorList;
        operatorList = operatorRepository.findByLocation(location);
        return operatorList;
    }

    public Operator getOperatorById(int operatorId){
        Operator operator = new Operator();
        operator = operatorRepository.findById(operatorId).orElse(null);
        return operator;
    }

    public Operator getOperatorByUsername(String username){
        Operator operator;
        operator = operatorRepository.findByUsername(username);
        return operator;
    }

    public Operator getOperatorByEmail(String email){
        Operator operator;
        operator = operatorRepository.findByEmail(email);
        return operator;
    }

    public Operator getOperatorByPhonenumber(String phoneNumber){
        Operator operator;
        operator = operatorRepository.findByPhoneNumber(phoneNumber);
        return operator;
    }

    public int getNumberOfTicketsOnOperator(int operatorId){
        int numberOfTicketsOnOperator;
        numberOfTicketsOnOperator = ticketRepository.findByOperatorId(operatorId).size();
        return numberOfTicketsOnOperator;
    }

    public void addOperator(Operator operator){
        operatorRepository.save(operator);
    }

    public void updateOperator(Operator operator){
        operatorRepository.save(operator);
    }

    public void deleteOperatorById(int operatorId){
        operatorRepository.deleteById(operatorId);
    }
}
