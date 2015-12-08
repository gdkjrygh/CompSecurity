// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.os.Handler;
import android.os.HandlerThread;
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
//            NetworkDispatcher, PipelinedRequester, Event, GoogleAnalyticsTracker, 
//            NetworkRequestUtil

private static class <init> extends HandlerThread
{
    private class AsyncDispatchTask
        implements Runnable
    {

        private final LinkedList events = new LinkedList();
        final NetworkDispatcher.DispatcherThread this$0;

        private void dispatchSomePendingEvents(boolean flag)
            throws IOException, ParseException, HttpException
        {
            if (GoogleAnalyticsTracker.getInstance().getDebug() && flag)
            {
                Log.v("GoogleAnalyticsTracker", "dispatching events in dry run mode");
            }
            int i = 0;
            while (i < events.size() && i < maxEventsPerRequest) 
            {
                Object obj = (Event)events.get(i);
                if ("__##GOOGLEPAGEVIEW##__".equals(((Event) (obj)).category))
                {
                    obj = NetworkRequestUtil.constructPageviewRequestPath(((Event) (obj)), referrer);
                } else
                if ("__##GOOGLETRANSACTION##__".equals(((Event) (obj)).category))
                {
                    obj = NetworkRequestUtil.constructTransactionRequestPath(((Event) (obj)), referrer);
                } else
                if ("__##GOOGLEITEM##__".equals(((Event) (obj)).category))
                {
                    obj = NetworkRequestUtil.constructItemRequestPath(((Event) (obj)), referrer);
                } else
                {
                    obj = NetworkRequestUtil.constructEventRequestPath(((Event) (obj)), referrer);
                }
                obj = new BasicHttpRequest("GET", ((String) (obj)));
                ((HttpRequest) (obj)).addHeader("Host", NetworkDispatcher.access$200().getHostName());
                ((HttpRequest) (obj)).addHeader("User-Agent", userAgent);
                if (GoogleAnalyticsTracker.getInstance().getDebug())
                {
                    Log.i("GoogleAnalyticsTracker", ((HttpRequest) (obj)).getRequestLine().toString());
                }
                if (flag)
                {
                    requesterCallBacks.requestSent();
                } else
                {
                    pipelinedRequester.addRequest(((HttpRequest) (obj)));
                }
                i++;
            }
            if (!flag)
            {
                pipelinedRequester.sendRequests();
            }
        }

        public Event removeNextEvent()
        {
            return (Event)events.poll();
        }

        public void run()
        {
            int i;
            currentTask = this;
            i = 0;
_L5:
            long l;
            if (i >= 5 || events.size() <= 0)
            {
                break MISSING_BLOCK_LABEL_153;
            }
            l = 0L;
            long l1;
            if (lastStatusCode != 500 && lastStatusCode != 503)
            {
                break MISSING_BLOCK_LABEL_129;
            }
            l1 = (long)(Math.random() * (double)retryInterval);
            l = l1;
            if (retryInterval >= 256L)
            {
                break MISSING_BLOCK_LABEL_100;
            }
            <no variable> = ((NetworkRequestUtil) (this)).constructPageviewRequestPath * <no variable>;
            l = l1;
_L1:
            Thread.sleep(l * 1000L);
            dispatchSomePendingEvents(parent.isDryRun());
            i++;
 