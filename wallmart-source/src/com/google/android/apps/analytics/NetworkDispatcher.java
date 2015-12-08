// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Locale;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.ParseException;
import org.apache.http.message.BasicHttpRequest;

// Referenced classes of package com.google.android.apps.analytics:
//            Dispatcher, Event, PipelinedRequester, GoogleAnalyticsTracker, 
//            NetworkRequestUtil

class NetworkDispatcher
    implements Dispatcher
{
    private static class DispatcherThread extends HandlerThread
    {

        private final Dispatcher.Callbacks callbacks;
        private AsyncDispatchTask currentTask;
        private Handler handlerExecuteOnDispatcherThread;
        private int lastStatusCode;
        private int maxEventsPerRequest;
        private final NetworkDispatcher parent;
        private final PipelinedRequester pipelinedRequester;
        private final String referrer;
        private final RequesterCallbacks requesterCallBacks;
        private long retryInterval;
        private final String userAgent;

        public void dispatchEvents(Event aevent[])
        {
            if (handlerExecuteOnDispatcherThread != null)
            {
                handlerExecuteOnDispatcherThread.post(new AsyncDispatchTask(aevent));
            }
        }

        protected void onLooperPrepared()
        {
            handlerExecuteOnDispatcherThread = new Handler();
        }



/*
        static int access$1002(DispatcherThread dispatcherthread, int i)
        {
            dispatcherthread.maxEventsPerRequest = i;
            return i;
        }

*/






/*
        static AsyncDispatchTask access$402(DispatcherThread dispatcherthread, AsyncDispatchTask asyncdispatchtask)
        {
            dispatcherthread.currentTask = asyncdispatchtask;
            return asyncdispatchtask;
        }

*/



/*
        static int access$502(DispatcherThread dispatcherthread, int i)
        {
            dispatcherthread.lastStatusCode = i;
            return i;
        }

*/



/*
        static long access$602(DispatcherThread dispatcherthread, long l)
        {
            dispatcherthread.retryInterval = l;
            return l;
        }

*/


/*
        static long access$630(DispatcherThread dispatcherthread, long l)
        {
            l = dispatcherthread.retryInterval * l;
            dispatcherthread.retryInterval = l;
            return l;
        }

*/




        private DispatcherThread(Dispatcher.Callbacks callbacks1, PipelinedRequester pipelinedrequester, String s, String s1, NetworkDispatcher networkdispatcher)
        {
            super("DispatcherThread");
            maxEventsPerRequest = 30;
            currentTask = null;
            callbacks = callbacks1;
            referrer = s;
            userAgent = s1;
            pipelinedRequester = pipelinedrequester;
            requesterCallBacks = new RequesterCallbacks();
            pipelinedRequester.installCallbacks(requesterCallBacks);
            parent = networkdispatcher;
        }


        private DispatcherThread(Dispatcher.Callbacks callbacks1, String s, String s1, NetworkDispatcher networkdispatcher)
        {
            this(callbacks1, new PipelinedRequester(NetworkDispatcher.GOOGLE_ANALYTICS_HOST), s, s1, networkdispatcher);
        }

    }

    private class DispatcherThread.AsyncDispatchTask
        implements Runnable
    {

        private final LinkedList events = new LinkedList();
        final DispatcherThread this$0;

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
                ((HttpRequest) (obj)).addHeader("Host", NetworkDispatcher.GOOGLE_ANALYTICS_HOST.getHostName());
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
            continue; /* Loop/switch isn't completed */
            retryInterval = 2L;
              goto _L1
            Object obj;
            obj;
            Log.w("GoogleAnalyticsTracker", "Couldn't sleep.", ((Throwable) (obj)));
_L3:
            pipelinedRequester.finishedCurrentRequests();
            callbacks.dispatchFinished();
            currentTask = null;
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

        public DispatcherThread.AsyncDispatchTask(Event aevent[])
        {
            this$0 = DispatcherThread.this;
            super();
            Collections.addAll(events, aevent);
        }
    }

    private class DispatcherThread.RequesterCallbacks
        implements PipelinedRequester.Callbacks
    {

        final DispatcherThread this$0;

        public void pipelineModeChanged(boolean flag)
        {
            if (flag)
            {
                maxEventsPerRequest = 30;
                return;
            } else
            {
                maxEventsPerRequest = 1;
                return;
            }
        }

        public void requestSent()
        {
            Event event;
            if (currentTask != null)
            {
                if ((event = currentTask.removeNextEvent()) != null)
                {
                    callbacks.eventDispatched(event.eventId);
                    return;
                }
            }
        }

        public void serverError(int i)
        {
            lastStatusCode = i;
        }

        private DispatcherThread.RequesterCallbacks()
        {
            this$0 = DispatcherThread.this;
            super();
        }

    }


    private static final HttpHost GOOGLE_ANALYTICS_HOST = new HttpHost("www.google-analytics.com", 80);
    private static final int MAX_EVENTS_PER_PIPELINE = 30;
    private static final int MAX_SEQUENTIAL_REQUESTS = 5;
    private static final long MIN_RETRY_INTERVAL = 2L;
    private static final String USER_AGENT_TEMPLATE = "%s/%s (Linux; U; Android %s; %s-%s; %s Build/%s)";
    private DispatcherThread dispatcherThread;
    private boolean dryRun;
    private final String userAgent;

    public NetworkDispatcher()
    {
        this("GoogleAnalytics", "1.2");
    }

    public NetworkDispatcher(String s, String s1)
    {
        dryRun = false;
        Object obj = Locale.getDefault();
        String s3 = android.os.Build.VERSION.RELEASE;
        String s2;
        if (((Locale) (obj)).getLanguage() != null)
        {
            s2 = ((Locale) (obj)).getLanguage().toLowerCase();
        } else
        {
            s2 = "en";
        }
        if (((Locale) (obj)).getCountry() != null)
        {
            obj = ((Locale) (obj)).getCountry().toLowerCase();
        } else
        {
            obj = "";
        }
        userAgent = String.format("%s/%s (Linux; U; Android %s; %s-%s; %s Build/%s)", new Object[] {
            s, s1, s3, s2, obj, Build.MODEL, Build.ID
        });
    }

    public void dispatchEvents(Event aevent[])
    {
        if (dispatcherThread != null)
        {
            dispatcherThread.dispatchEvents(aevent);
        }
    }

    String getUserAgent()
    {
        return userAgent;
    }

    public void init(Dispatcher.Callbacks callbacks, PipelinedRequester pipelinedrequester, String s)
    {
        stop();
        dispatcherThread = new DispatcherThread(callbacks, pipelinedrequester, s, userAgent, this);
        dispatcherThread.start();
    }

    public void init(Dispatcher.Callbacks callbacks, String s)
    {
        stop();
        dispatcherThread = new DispatcherThread(callbacks, s, userAgent, this);
        dispatcherThread.start();
    }

    public boolean isDryRun()
    {
        return dryRun;
    }

    public void setDryRun(boolean flag)
    {
        dryRun = flag;
    }

    public void stop()
    {
        if (dispatcherThread != null && dispatcherThread.getLooper() != null)
        {
            dispatcherThread.getLooper().quit();
            dispatcherThread = null;
        }
    }

    public void waitForThreadLooper()
    {
        dispatcherThread.getLooper();
    }


}
