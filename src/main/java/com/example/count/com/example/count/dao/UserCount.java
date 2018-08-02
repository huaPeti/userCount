package com.example.count.com.example.count.dao;

/**
 * @author chen1
 * @annotation:用户统计实体
 * @create 2018-07-31 14:06
 **/
public class UserCount {
    private  int countId;
    //访问次数
    private String counts;
    //按钮名称
    private String buttonName;

    public String getCounts() {
        return counts;
    }

    public void setCounts(String counts) {
        this.counts = counts;
    }

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    public int getCountId() {
        return countId;
    }

    public void setCountId(int countId) {
        this.countId = countId;
    }
}

