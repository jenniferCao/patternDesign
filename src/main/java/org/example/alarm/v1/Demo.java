package org.example.alarm.v1;

import org.example.alarm.v1.ApiStatInfo;
import org.example.alarm.v1.ApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApiStatInfo apiStatInfo = new ApiStatInfo();
        // ...省略设置apiStatInfo数据值的代码
        ApplicationContext.getInstance().getAlert().check(apiStatInfo);
    }
}