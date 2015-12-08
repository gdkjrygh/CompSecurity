// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.os.Build;
import android.os.Looper;
import java.util.Locale;
import org.apache.http.HttpHost;

// Referenced classes of package com.google.android.apps.analytics:
//            Dispatcher, Hit, PipelinedRequester, HitStore

class NetworkDispatcher
    implements Dispatcher
{

    private static final String GOOGLE_ANALYTICS_HOST_NAME = "www.google-analytics.com";
    private static final int GOOGLE_ANALYTICS_HOST_PORT = 80;
    private static final int MAX_EVENTS_PER_PIPELINE = 30;
    private static final int MAX_GET_LENGTH = 2036;
    private static final int MAX_POST_LENGTH = 8192;
    private static final int MAX_SEQUENTIAL_REQUESTS = 5;
    private static final long MIN_RETRY_INTERVAL = 2L;
    private static final String USER_AGENT_TEMPLATE = "%s/%s (Linux; U; Android %s; %s-%s; %s Build/%s)";
    private DispatcherThread dispatcherThread;
    private boolean dryRun;
    private final HttpHost googleAnalyticsHost;
    private final String userAgent;

    public NetworkDispatcher()
    {
        this("GoogleAnalytics", "1.4.2");
    }

    public NetworkDispatcher(String s, String s1)
    {
        this(s, s1, "www.google-analytics.com", 80);
    }

    NetworkDispatcher(String s, String s1, String s2, int i)
    {
        dryRun = false;
        googleAnalyticsHost = new HttpHost(s2, i);
        Object obj = Locale.getDefault();
        String s3 = android.os.Build.VERSION.RELEASE;
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

    public void dispatchHits(Hit ahit[])
    {
        if (dispatcherThread == null)
        {
            return;
        } else
        {
            dispatcherThread.dispatchHits(ahit);
            return;
        }
    }

    String getUserAgent()
    {
        return userAgent;
    }

    public void init(Dispatcher.Callbacks callbacks)
    {
        stop();
        dispatcherThread = new DispatcherThread(callbacks, userAgent, this, null);
        dispatcherThread.start();
    }

    public void init(Dispatcher.Callbacks callbacks, PipelinedRequester pipelinedrequester, HitStore hitstore)
    {
        stop();
        dispatcherThread = new DispatcherThread(callbacks, pipelinedrequester, userAgent, this, null);
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

    void waitForThreadLooper()
    {
        dispatcherThread.getLooper();
        while (dispatcherThread.handlerExecuteOnDispatcherThread == null) 
        {
            Thread.yield();
        }
    }


    private class DispatcherThread extends HandlerThread
    {

        private final Dispatcher.Callbacks callbacks;
        private AsyncDispatchTask currentTask;
        volatile Handler handlerExecuteOnDispatcherThread;
        private int lastStatusCode;
        private int maxEventsPerRequest;
        private final NetworkDispatcher parent;
        private final PipelinedRequester pipelinedRequester;
        private final RequesterCallbacks requesterCallBacks;
        private long retryInterval;
        private final String userAgent;

        public void dispatchHits(Hit ahit[])
        {
            if (handlerExecuteOnDispatcherThread == null)
            {
                return;
            } else
            {
                handlerExecuteOnDispatcherThread.post(new AsyncDispatchTask(ahit));
                return;
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




        private DispatcherThread(Dispatcher.Callbacks callbacks1, PipelinedRequester pipelinedrequester, String s, NetworkDispatcher networkdispatcher)
        {
            super("DispatcherThread");
            maxEventsPerRequest = 30;
            currentTask = null;
            callbacks = callbacks1;
            userAgent = s;
            pipelinedRequester = pipelinedrequester;
            class RequesterCallbacks
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
                    class AsyncDispatchTask
                        implements Runnable
                    {

                        private final LinkedList hits = new LinkedList();
                        final DispatcherThread this$0;

                        private void dispatchSomePendingHits(boolean flag)
                        {
                            if (GoogleAnalyticsTracker.getInstance().getDebug() && flag)
                            {
                                Log.v("GoogleAnalyticsTracker", "dispatching hits in dry run mode");
                            }
                            int i = 0;
                            while (i < hits.size() && i < maxEventsPerRequest) 
                            {
                                Object obj1 = Utils.addQueueTimeParameter(((Hit)hits.get(i)).hitString, System.currentTimeMillis());
                                int j = ((String) (obj1)).indexOf('?');
                                String s1;
                                Object obj;
                                String s2;
                                if (j < 0)
                                {
                                    s1 = "";
                                    obj = obj1;
                                } else
                                {
                                    if (j > 0)
                                    {
                                        s1 = ((String) (obj1)).substring(0, j);
                                    } else
                                    {
                                        s1 = "";
                                    }
                                    if (j < ((String) (obj1)).length() - 2)
                                    {
                                        String s3 = ((String) (obj1)).substring(j + 1);
                                        obj = s1;
                                        s1 = s3;
                                    } else
                                    {
                                        obj = s1;
                                        s1 = "";
                                    }
                                }
                                if (s1.length() < 2036)
                                {
                                    obj = new BasicHttpEntityEnclosingRequest("GET", ((String) (obj1)));
                                } else
                                {
                                    obj = new BasicHttpEntityEnclosingRequest("POST", (new StringBuilder()).append("/p").append(((String) (obj))).toString());
                                    ((HttpEntityEnclosingRequest) (obj)).addHeader("Content-Length", Integer.toString(s1.length()));
                                    ((HttpEntityEnclosingRequest) (obj)).addHeader("Content-Type", "text/plain");
                                    ((HttpEntityEnclosingRequest) (obj)).setEntity(new StringEntity(s1));
                                }
                                s2 = parent.googleAnalyticsHost.getHostName();
                                obj1 = s2;
                                if (parent.googleAnalyticsHost.getPort() != 80)
                                {
                                    obj1 = (new StringBuilder()).append(s2).append(":").append(parent.googleAnalyticsHost.getPort()).toString();
                                }
                                ((HttpEntityEnclosingRequest) (obj)).addHeader("Host", ((String) (obj1)));
                                ((HttpEntityEnclosingRequest) (obj)).addHeader("User-Agent", userAgent);
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
                                if (s1.length() > 8192)
                                {
                                    Log.w("GoogleAnalyticsTracker", "Hit too long (> 8192 bytes)--not sent");
                                    requesterCallBacks.requestSent();
                                } else
                                if (flag)
                                {
                                    requesterCallBacks.requestSent();
                                } else
                                {
                                    pipelinedRequester.addRequest(((HttpEntityEnclosingRequest) (obj)));
                                }
                                i++;
                            }
                            if (!flag)
                            {
                                pipelinedRequester.sendRequests();
                            }
                        }

                        public Hit removeNextHit()
                        {
                            return (Hit)hits.poll();
                        }

                        public void run()
                        {
                            int i;
                            currentTask = this;
                            i = 0;
_L5:
                            long l;
                            if (i >= 5 || hits.size() <= 0)
                            {
                                break MISSING_BLOCK_LABEL_154;
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
                            <no variable> = 
// JavaClassFileOutputException: get_constant: invalid tag

                            public AsyncDispatchTask(Hit ahit[])
                            {
                                this$0 = DispatcherThread.this;
                                super();
                                Collections.addAll(hits, ahit);
                            }
                    }

                    Hit hit;
                    if (currentTask != null)
                    {
                        if ((hit = currentTask.removeNextHit()) != null)
                        {
                            callbacks.hitDispatched(hit.hitId);
                            return;
                        }
                    }
                }

                public void serverError(int i)
                {
                    lastStatusCode = i;
                }

                private RequesterCallbacks()
                {
                    this$0 = DispatcherThread.this;
                    super();
                }

                RequesterCallbacks(_cls1 _pcls1)
                {
                    this();
                }
            }

            requesterCallBacks = new RequesterCallbacks(null);
            pipelinedRequester.installCallbacks(requesterCallBacks);
            parent = networkdispatcher;
        }

        DispatcherThread(Dispatcher.Callbacks callbacks1, PipelinedRequester pipelinedrequester, String s, NetworkDispatcher networkdispatcher, _cls1 _pcls1)
        {
            DispatcherThread(callbacks1, pipelinedrequester, s, networkdispatcher);
        }

        private DispatcherThread(Dispatcher.Callbacks callbacks1, String s, NetworkDispatcher networkdispatcher)
        {
            DispatcherThread(callbacks1, new PipelinedRequester(networkdispatcher.googleAnalyticsHost), s, networkdispatcher);
        }

        DispatcherThread(Dispatcher.Callbacks callbacks1, String s, NetworkDispatcher networkdispatcher, _cls1 _pcls1)
        {
            DispatcherThread(callbacks1, s, networkdispatcher);
        }
    }

}
