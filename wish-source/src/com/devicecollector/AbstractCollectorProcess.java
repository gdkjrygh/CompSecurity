// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;
import java.util.EnumSet;

public abstract class AbstractCollectorProcess extends AsyncTask
{

    protected Activity activity;
    protected boolean finished;
    protected DeviceCollector.StatusListener lstnr;
    protected EnumSet skipList;
    private long timeout;
    private boolean timeoutOverridden;

    public AbstractCollectorProcess(Activity activity1, DeviceCollector.StatusListener statuslistener, EnumSet enumset)
    {
        finished = true;
        timeout = 10000L;
        timeoutOverridden = false;
        lstnr = statuslistener;
        activity = activity1;
        skipList = enumset;
        finished = false;
    }

    transient void debug(String s, Object aobj[])
    {
        String s1 = getClass().getSimpleName();
        Log.v(s1, (new StringBuilder()).append("[").append(s1).append("]").append(String.format(s, aobj)).toString());
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient abstract Void doInBackground(String as[]);

    public long getTimeoutMs()
    {
        return timeout;
    }

    public boolean getTimeoutOverridden()
    {
        return timeoutOverridden;
    }

    public boolean isFinished()
    {
        return finished;
    }

    protected void onPreExecute()
    {
        if (lstnr != null)
        {
            lstnr.onCollectorStart();
        }
        finished = false;
    }

    public void setListener(DeviceCollector.StatusListener statuslistener)
    {
        lstnr = statuslistener;
    }

    public void setTimoutMs(long l)
    {
        if (l > 5000L)
        {
            timeout = l;
            timeoutOverridden = true;
        }
    }
}
