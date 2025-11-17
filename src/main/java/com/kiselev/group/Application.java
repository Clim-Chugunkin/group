package com.kiselev.group;

public class Application{
  public static void main(String[] args){
    FilmStorage fs = new FilmDBStorage();
    System.out.println(fs.getName());
    System.out.println(fs.getDesc());
    System.out.println(fs.getRemove());
  }
}
