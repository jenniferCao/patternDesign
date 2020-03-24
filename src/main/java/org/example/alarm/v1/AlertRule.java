package org.example.alarm.v1;

public class AlertRule {
    public AlertRule getMatchedRule(String api) {
        if (api.equals("api")){
            return new ApiAlertRule();
        }
        return null;
    }

    public long getMaxErrorCount() {
        return 10L;
    }

    public long getMaxTps(){
        return 50L;
    }
}
