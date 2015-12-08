// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface.execute.photobillpay;


public class responseWaitTimeoutSeconds
{

    private String actionMethod;
    private String activitySource;
    private long responseWaitTimeoutSeconds;
    private long timeoutSeconds;

    public String getActionMethod()
    {
        return actionMethod;
    }

    public String getActivitySource()
    {
        return activitySource;
    }

    public long getResponseWaitTimeoutSeconds()
    {
        return responseWaitTimeoutSeconds;
    }

    public long getTimeoutSeconds()
    {
        return timeoutSeconds;
    }

    public void setActionMethod(String s)
    {
        actionMethod = s;
    }

    public void setActivitySource(String s)
    {
        activitySource = s;
    }

    public void setResponseWaitTimeoutSeconds(int i)
    {
        responseWaitTimeoutSeconds = i;
    }

    public void setTimeoutSeconds(int i)
    {
        timeoutSeconds = i;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ScanData{activitySource='").append(activitySource).append('\'').append(", actionMethod='").append(actionMethod).append('\'').append(", timeoutSeconds=").append(timeoutSeconds).append(", responseWaitTimeoutSeconds=").append(responseWaitTimeoutSeconds).append('}').toString();
    }





    public ()
    {
        timeoutSeconds = 0L;
        responseWaitTimeoutSeconds = 0L;
    }
}
