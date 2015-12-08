// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.util.Log;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;

// Referenced classes of package com.google.android.apps.analytics:
//            GoogleAnalyticsTracker, Hit, Utils, NetworkDispatcher, 
//            PipelinedRequester

class hits
    implements Runnable
{

    private final LinkedList hits = new LinkedList();
    final this._cls0 this$0;

    private void dispatchSomePendingHits(boolean flag)
    {
        if (GoogleAnalyticsTracker.getInstance().getDebug() && flag)
        {
            Log.v("GoogleAnalyticsTracker", "dispatching hits in dry run mode");
        }
        int i = 0;
        while (i < hits.size() && i < hits(this._cls0.this)) 
        {
            Object obj1 = Utils.addQueueTimeParameter(((Hit)hits.get(i)).hitString, System.currentTimeMillis());
            int j = ((String) (obj1)).indexOf('?');
            String s;
            Object obj;
            String s1;
            if (j < 0)
            {
                s = "";
                obj = obj1;
            } else
            {
                if (j > 0)
                {
                    s = ((String) (obj1)).substring(0, j);
                } else
                {
                    s = "";
                }
                if (j < ((String) (obj1)).length() - 2)
                {
                    String s2 = ((String) (obj1)).substring(j + 1);
                    obj = s;
                    s = s2;
                } else
                {
                    obj = s;
                    s = "";
                }
            }
            if (s.length() < 2036)
            {
                obj = new BasicHttpEntityEnclosingRequest("GET", ((String) (obj1)));
            } else
            {
                obj = new BasicHttpEntityEnclosingRequest("POST", (new StringBuilder()).append("/p").append(((String) (obj))).toString());
                ((HttpEntityEnclosingRequest) (obj)).addHeader("Content-Length", Integer.toString(s.length()));
                ((HttpEntityEnclosingRequest) (obj)).addHeader("Content-Type", "text/plain");
                ((HttpEntityEnclosingRequest) (obj)).setEntity(new StringEntity(s));
            }
            s1 = NetworkDispatcher.access$200(hits(this._cls0.this)).getHostName();
            obj1 = s1;
            if (NetworkDispatcher.access$200(this._mth0(this._cls0.this)).getPort() != 80)
            {
                obj1 = (new StringBuilder()).append(s1).append(":").append(NetworkDispatcher.access$200(this._mth0(this._cls0.this)).getPort()).toString();
            }
            ((HttpEntityEnclosingRequest) (obj)).addHeader("Host", ((String) (obj1)));
            ((HttpEntityEnclosingRequest) (obj)).addHeader("User-Agent", this._mth0(this._cls0.this));
            if (GoogleAnalyticsTracker.getInstance().getDebug())
            {
                obj1 = new StringBuffer();
                org.apache.http.Header aheader[] = ((HttpEntityEnclosingRequest) (obj)).getAllHeaders();
                int k = aheader.length;
                for (j = 0; j < k; j++)
                {
                    ((StringBuffer) (obj1)).append(aheader[j].toString()).append("\n");
                }

                ((StringBuffer) (obj1)).append(((HttpEntityEnclosingRequest) (obj)).getRequestLine().toString()).append("\n");
                Log.i("GoogleAnalyticsTracker", ((StringBuffer) (obj1)).toString());
            }
            if (s.length() > 8192)
            {
                Log.w("GoogleAnalyticsTracker", "Hit too long (> 8192 bytes)--not sent");
                this._mth0(this._cls0.this).requestSent();
            } else
            if (flag)
            {
                .requestSent(this._cls0.this).requestSent();
            } else
            {
                .requestSent(this._cls0.this).addRequest(((HttpEntityEnclosingRequest) (obj)));
            }
            i++;
        }
        if (!flag)
        {
            this._mth0(this._cls0.this).sendRequests();
        }
    }

    public Hit removeNextHit()
    {
        return (Hit)hits.poll();
    }

    public void run()
    {
        int i;
        hits(this._cls0.this, this);
        i = 0;
_L5:
        long l;
        if (i >= 5 || hits.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        l = 0L;
        long l1;
        if (hits(this._cls0.this) != 500 && this._mth0(this._cls0.this) != 503)
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
        dispatchSomePendingHits(dispatchSomePendingHits(this._cls0.this).isDryRun());
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

    public (Hit ahit[])
    {
        this$0 = this._cls0.this;
        super();
        Collections.addAll(hits, ahit);
    }
}
