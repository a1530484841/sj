package com.aaa.sujiexiche.sj.entity;

import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class Fenye<T> {
 private Integer page;
 private Integer pagesize;
 private Integer total;
 private List<T> rows;
 private T t;

 public Integer getPage() {
  return page;
 }

 public void setPage(Integer page) {
  this.page = page;
 }

 public Integer getPagesize() {
  return pagesize;
 }

 public void setPagesize(Integer pagesize) {
  this.pagesize = pagesize;
 }

 public Integer getTotal() {
  return total;
 }

 public void setTotal(Integer total) {
  this.total = total;
 }

 public List<T> getRows() {
  return rows;
 }

 public void setRows(List<T> rows) {
  this.rows = rows;
 }

 public T getT() {
  return t;
 }

 public void setT(T t) {
  this.t = t;
 }

 @Override
 public String toString() {
  return "Fenye{" +
          "page=" + page +
          ", pagesize=" + pagesize +
          ", total=" + total +
          ", rows=" + rows +
          ", t=" + t +
          '}';
 }
}
