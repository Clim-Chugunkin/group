package com.kiselev.group;
public class FilmDBStorage implements FilmStorage{

  @Override
  public String getName(){
    return "This is my name";
  }

  @Override
  public String getDesc(){
    return "This is description";
  }

  @Override
  public String getRemove(){
    return "remove";
  }

  @Override
  public String getPopular(){
    return "Popular";
  }

  @Override
  public String getCreated(){
    return "Created";
  }
}
