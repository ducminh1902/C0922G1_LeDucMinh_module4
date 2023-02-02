package com.example.reponsitory;

import com.example.model.Email;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmailReponsitory implements IEmailReponsitory {
    static List<Email> emailList = new ArrayList<>();

    static {
        emailList.add(new Email(1,"English",25,true,"Michael"));
        emailList.add(new Email(2,"VietNam",25,true,"Minh"));
        emailList.add(new Email(3,"Chinese",25,true,"YingJun"));
        emailList.add(new Email(4,"Janpanese",25,true,"kamito"));
    }

    @Override
    public List<Email> display() {
        return emailList;
    }

    @Override
    public Email findById(int id) {
        for (Email x:emailList) {
          if (x.getId()== id){
              return x;
          }
        }
        return null;
    }

    @Override
    public boolean update(Email email) {
        for (Email x:emailList) {
            if (x.getId()== email.getId()){
                  x.setLanguage(email.getLanguage());
                  x.setPageSize(email.getPageSize());
                  x.setSpamsFilter(email.isSpamsFilter());
                  x.setSignature(email.getSignature());
                  return true;
            }
        }
        return false;
    }


}
