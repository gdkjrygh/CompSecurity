// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector.collectors;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;
import com.devicecollector.DataCollection;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.devicecollector.collectors:
//            CollectorStatusListener, SoftErrorCode, CollectorEnum

public abstract class AbstractAsyncCollectorTask extends AsyncTask
{

    protected Activity activity;
    protected DataCollection dc;
    protected Exception errorCause;
    protected SoftErrorCode errorCode;
    protected boolean finished;
    protected CollectorStatusListener lstnr;
    private long timeoutMs;
    protected CollectorEnum type;

    public AbstractAsyncCollectorTask(Activity activity1, CollectorStatusListener collectorstatuslistener, DataCollection datacollection, CollectorEnum collectorenum, long l)
    {
        activity = activity1;
        dc = datacollection;
        lstnr = collectorstatuslistener;
        type = collectorenum;
        if (l < 1000L)
        {
            setTimeoutMs(5000L);
            return;
        } else
        {
            setTimeoutMs(l);
            return;
        }
    }

    transient void debug(String s, Object aobj[])
    {
        Log.v(getClass().getSimpleName(), (new StringBuilder()).append("[").append(type).append("]").append(String.format(s, aobj)).toString());
    }

    protected transient DataCollection doInBackground(Void avoid[])
    {
        debug("Starting runner...", new Object[0]);
        if (!finished)
        {
            run();
        }
        return dc;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected void endProcess(SoftErrorCode softerrorcode, Exception exception)
    {
        debug((new StringBuilder()).append("end process:").append(softerrorcode).toString(), new Object[0]);
        finished = true;
        if (softerrorcode == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        dc.addError(type, softerrorcode);
        errorCode = softerrorcode;
        errorCause = exception;
        this;
        JVM INSTR monitorenter ;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        softerrorcode;
        this;
        JVM INSTR monitorexit ;
        throw softerrorcode;
    }

    public CollectorEnum getCollectorType()
    {
        return type;
    }

    public Exception getErrorCause()
    {
        return errorCause;
    }

    public SoftErrorCode getErrorCode()
    {
        return errorCode;
    }

    public long getTimeoutMs()
    {
        return timeoutMs;
    }

    public boolean isFinished()
    {
        return finished;
    }

    void notifyListener()
    {
        debug("Notifying listener...", new Object[0]);
        if (lstnr == null) goto _L2; else goto _L1
_L1:
        if (errorCode == null)
        {
            lstnr.onCollectorSuccess(type);
        } else
        {
            lstnr.onCollectorError(type, errorCode, errorCause);
        }
        this;
        JVM INSTR monitorenter ;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
_L2:
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void onPostExecute(DataCollection datacollection)
    {
        debug("Post Execute...", new Object[0]);
        notifyListener();
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((DataCollection)obj);
    }

    protected void onPreExecute()
    {
        debug("Pre Execute...", new Object[0]);
        if (lstnr != null)
        {
            lstnr.onCollectorStart(type);
        }
        finished = false;
    }

    protected abstract void run();

    public void setTimeoutMs(long l)
    {
        timeoutMs = l;
    }

    public void timeout()
    {
        if (!finished)
        {
            debug("Timed out. Cancelling...", new Object[0]);
            endProcess(SoftErrorCode.TIMEOUT, new TimeoutException("Timed out."));
            finished = true;
            cancel(true);
            notifyListener();
            return;
        } else
        {
            debug("No need to timeout, already finished", new Object[0]);
            return;
        }
    }
}
