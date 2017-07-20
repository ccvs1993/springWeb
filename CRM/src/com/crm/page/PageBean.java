package com.crm.page;

import java.util.List;

/**
 * Created by wangfei on 2017/7/8.
 */
public class PageBean<T> {
    private int pageNum;
    private int pageSize;
    private int totalRecord;

    private int startIndex;//开始索引
    private int totalPage;//总分页数

    //分页后当前页的数据
    private List<T> data;

    //动态显示条
    private int start;
    private int end;



    public PageBean(int pageNum, int pageSize, int totalRecord) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalRecord=totalRecord;

        this.startIndex = (pageNum-1)*pageSize;
        this.totalPage=(this.totalRecord+this.pageSize-1)/this.pageSize;

        //动态显示条
        this.start=1;
        this.end=6;//显示6个分页

        if(this.totalPage<=6){
            this.end=this.totalPage;
        }else{
            //当前页 前2后3
            this.start=this.pageNum-2;
            this.end=this.pageNum+3;

            if(this.start<1){
                this.start=1;
                this.end=6;
            }

            if(this.end>this.totalPage){
                this.end=this.totalPage;
                this.start=this.end-5;
            }
        }

    }


    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
