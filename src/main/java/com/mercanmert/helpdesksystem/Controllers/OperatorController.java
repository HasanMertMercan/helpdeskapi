package com.mercanmert.helpdesksystem.Controllers;

import com.mercanmert.helpdesksystem.Entities.Operator;
import com.mercanmert.helpdesksystem.Services.OperatorService;
import com.mercanmert.valuetypes.enums.Department;
import com.mercanmert.valuetypes.enums.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OperatorController {

    @Autowired
    private OperatorService operatorService;

    @RequestMapping("/operators")
    public List<Operator> getAllOperators(){
        List<Operator> operatorList;
        operatorList = operatorService.getAllOperators();
        return operatorList;
    }

    @RequestMapping("/operators/location/{location}")
    public List<Operator> getOperatorsByLocation(@PathVariable Location location){
        List<Operator> operatorList;
        operatorList = operatorService.getAllByLocation(location);
        return operatorList;
    }

    @RequestMapping("/operators/department/{department}")
    public List<Operator> getOperatorsByDepartment(@PathVariable Department department){
        List<Operator> operatorList;
        operatorList = operatorService.getAllByDepartment(department);
        return operatorList;
    }

    @RequestMapping("/operators/operator/{id}")
    public Operator getOperatorById(@PathVariable int id){
        Operator operator;
        operator = operatorService.getOperatorById(id);
        return operator;
    }

    @RequestMapping("/operators/operator/{username}")
    public Operator getOperatorByUsername(@PathVariable String username){
        Operator operator;
        operator = operatorService.getOperatorByUsername(username);
        return operator;
    }

    @RequestMapping("/operators/operator/{email}")
    public Operator getOperatorByEmail(@PathVariable String email){
        Operator operator;
        operator = operatorService.getOperatorByEmail(email);
        return operator;
    }

    @RequestMapping("/operators/operator/{phonenumber}")
    public Operator getOperatorByPhonenumber(@PathVariable String phonenumber){
        Operator operator;
        operator = operatorService.getOperatorByPhonenumber(phonenumber);
        return operator;
    }

    @RequestMapping("/operators/operator/{id}/numberOfTicketsOnOperator")
    public int getNumberOfTicketsOnOperator(@PathVariable int id){
        int numberOfTicketsOnOperator;
        numberOfTicketsOnOperator = operatorService.getNumberOfTicketsOnOperator(id);
        return numberOfTicketsOnOperator;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/operators/add")
    public void addOperator(@RequestBody Operator operator){
        operatorService.addOperator(operator);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/operators/operator/update")
    public void updateOperator(@RequestBody Operator operator){
        operatorService.updateOperator(operator);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/operators/operator/{id}/delete")
    public void deleteOperator(@PathVariable int id){
        operatorService.deleteOperatorById(id);
    }




}
