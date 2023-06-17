package com.hotelService.Exceptions;

public class ResourceNotFoundException extends  RuntimeException{
   public ResourceNotFoundException(){
       super("id not found");
   }
    public ResourceNotFoundException(String s){
        super(s);
    }

}
