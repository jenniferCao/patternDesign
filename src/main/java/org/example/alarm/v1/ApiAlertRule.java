package org.example.alarm.v1;

public class ApiAlertRule extends AlertRule {
    public ApiAlertRule() {
    }

    @Override
    public long getMaxErrorCount() {
        return 14L;
    }

}
