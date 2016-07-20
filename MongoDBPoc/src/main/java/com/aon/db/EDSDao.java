package com.aon.db;

import java.util.List;

public interface EDSDao<T> {

 public boolean addMessage(T t); 
 
 public List<T>  searchMessag(String...msgList);
 
 public   T getMessageByID(String msgID);
 
}
