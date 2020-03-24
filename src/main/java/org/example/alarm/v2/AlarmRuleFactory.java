package org.example.alarm.v2;

public class AlarmRuleFactory {
    public static AlarmRule createAlarmRule(String name){
        if (name.equals("api")){
            return new ApiAlarmRule();
        }else if (name.equals("others")){
            return new OthersAlarmRule();
        }
        return null;
    }
}
