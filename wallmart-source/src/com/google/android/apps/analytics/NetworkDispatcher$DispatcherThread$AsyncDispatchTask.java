// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.util.Log;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.ParseException;
import org.apache.http.message.BasicHttpRequest;

// Referenced classes of package com.google.android.apps.analytics:
//            NetworkDispatcher, GoogleAnalyticsTracker, Event, NetworkRequestUtil, 
//            PipelinedRequester

private class events
    implements Runnable
{

    private final LinkedList events = new LinkedList();
    final this._cls0 this$0;

    private void dispatchSomePendingEvents(boolean flag)
        throws IOException, ParseException, HttpException
    {
        if (GoogleAnalyticsTracker.getInstance().getDebug() && flag)
        {
            Log.v("GoogleAnalyticsTracker", "dispatching events in dry run mode");
        }
        int i = 0;
        while (i < events.size() && i < events(this._cls0.this)) 
        {
            Object obj = (Event)events.get(i);
            if ("__##GOOGLEPAGEVIEW##__".equals(((Event) (obj)).category))
            {
                obj = NetworkRequestUtil.constructPageviewRequestPath(((Event) (obj)), events(this._cls0.this));
            } else
            if ("__##GOOGLETRANSACTION##__".equals(((Event) (obj)).category))
            {
                obj = NetworkRequestUtil.constructTransactionRequestPath(((Event) (obj)), this._mth0(this._cls0.this));
            } else
            if ("__##GOOGLEITEM##__".equals(((Event) (obj)).category))
            {
                obj = NetworkRequestUtil.constructItemRequestPath(((Event) (obj)), this._mth0(this._cls0.this));
            } else
            {
                obj = NetworkRequestUtil.constructEventRequestPath(((Event) (obj)), this._mth0(this._cls0.this));
            }
            obj = new BasicHttpRequest("GET", ((String) (obj)));
            ((HttpRequest) (obj)).addHeader("Host", NetworkDispatcher.access$200().getHostName());
            ((HttpRequest) (obj)).addHeader("User-Agent", this._mth0(this._cls0.this));
            if (GoogleAnalyticsTracker.getInstance().getDebug())
            {
                Log.i("GoogleAnalyticsTracker", ((HttpRequest) (obj)).getRequestLine().toString());
            }
            if (flag)
            {
                this._mth0(this._cls0.this).requestSent();
            } else
            {
                .requestSent(this._cls0.this).addRequest(((HttpRequest) (obj)));
            }
            i++;
        }
        if (!flag)
        {
            this._mth0(this._cls0.this).sendRequests();
        }
    }

    public Event removeNextEvent()
    {
        return (Event)events.poll();
    }

    public void run()
    {
        int i;
        events(this._cls0.this, this);
        i = 0;
_L5:
        long l;
        if (i >= 5 || events.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        l = 0L;
        long l1;
        if (events(this._cls0.this) != 500 && this._mth0(this._cls0.this) != 503)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        l1 = (long)(Math.random() * (double)this._mth0(this._cls0.this));
        l = l1;
        if (this._mth0(this._cls0.this) >= 256L)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        this._mth0(this._cls0.this, 2L);
        l = l1;
_L1:
        Thread.sleep(l * 1000L);
        dispatchSomePendingEvents(dispatchSomePendingEvents(this._cls0.this).isDryRun());
        i++;
        continue; /* Loop/switch isn't completed */
        this._mth0(this._cls0.this, 2L);
          goto _L1
        Object obj;
        obj;
        Log.w("GoogleAnalyticsTracker", "Couldn't sleep.", ((Throwable) (obj)));
_L3:
        this._mth0(this._cls0.this).finishedCurrentRequests();
        this._mth0(this._cls0.this)._mth0();
        this._mth0(this._cls0.this, null);
        return;
        obj;
        Log.w("GoogleAnalyticsTracker", "Problem with socket or streams.", ((Throwable) (obj)));
        continue; /* Loop/switch isn't completed */
        obj;
        Log.w("GoogleAnalyticsTracker", "Problem with http streams.", ((Throwable) (obj)));
        if (true) goto _L3; else goto _L2
_L2:
        if (true) goto _L5; else goto _L4
_L4:
    }

    public (Event aevent[])
    {
        this$0 = this._cls0.this;
        super();
        Collections.addAll(events, aevent);
    }
}
