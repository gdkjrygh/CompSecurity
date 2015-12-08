// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.system;

import com.google.common.base.Preconditions;
import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.util.AtomicUtils;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class TwcBus
{
    private static final class BusThreadFactory
        implements ThreadFactory
    {

        public Thread newThread(Runnable runnable)
        {
            runnable = new Thread(runnable, "BusEvent");
            runnable.setDaemon(true);
            return runnable;
        }

        private BusThreadFactory()
        {
        }

    }

    private static class PostableTimeStamp
    {

        private final Object objectToPost;
        private final long startTime;



        private PostableTimeStamp(Object obj)
        {
            startTime = System.currentTimeMillis();
            objectToPost = obj;
        }

    }


    protected static final String TAG = "TwcBus";
    private static final AtomicInteger maxQueueDepth = new AtomicInteger();
    private static final AtomicLong queueCount = new AtomicLong();
    private final Bus bus;
    private final ExecutorService executorService = Executors.newSingleThreadExecutor(new BusThreadFactory());
    private final BlockingQueue queue = new LinkedBlockingDeque();
    private boolean started;

    public TwcBus()
    {
        bus = new Bus(ThreadEnforcer.ANY, "DataAccessLayer Bus");
    }

    public void clear()
    {
        queue.clear();
    }

    public void post(Object obj)
    {
        if (!queue.offer(new PostableTimeStamp(Preconditions.checkNotNull(obj))))
        {
            throw new RuntimeException("Unable to post object to bus");
        } else
        {
            long l = queueCount.incrementAndGet();
            int i = queue.size();
            AtomicUtils.setIfHigher(maxQueueDepth, i);
            LogUtil.d("TwcBus", LoggingMetaTags.TWC_DAL, "post() object:%s, size:%d, max:%d, total:%d", new Object[] {
                obj, Integer.valueOf(i), Integer.valueOf(maxQueueDepth.get()), Long.valueOf(l)
            });
            return;
        }
    }

    public void register(Object obj)
    {
        bus.register(Preconditions.checkNotNull(obj));
    }

    public void shutdown()
    {
        Preconditions.checkState(started, "Bus can not be shutdown if it is not started");
        executorService.shutdownNow();
    }

    public void start()
    {
        boolean flag;
        if (!started)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Bus can only be started once");
        started = true;
        executorService.execute(new Runnable() {

            final TwcBus this$0;

            public void run()
            {
_L2:
                PostableTimeStamp postabletimestamp;
                long l;
                long l1;
                do
                {
                    if (Thread.currentThread().isInterrupted())
                    {
                        break MISSING_BLOCK_LABEL_193;
                    }
                    postabletimestamp = (PostableTimeStamp)queue.take();
                    l1 = System.currentTimeMillis();
                    l = l1 - postabletimestamp.startTime;
                    bus.post(postabletimestamp.objectToPost);
                    l1 = System.currentTimeMillis() - l1;
                    LogUtil.d("TwcBus", LoggingMetaTags.TWC_DAL, "Posted: %s, hash: %d,queuingTime:%s, processTime: %s", new Object[] {
                        postabletimestamp.objectToPost, Integer.valueOf(postabletimestamp.objectToPost.hashCode()), Long.valueOf(l), Long.valueOf(l1)
                    });
                } while (l1 <= 1000L);
                EventLog.e("TwcBus", (new StringBuilder()).append("SLOW POST TO BUS: queuingTime=").append(l).append(",processTime=").append(l1).append(", ").append("p=").append(postabletimestamp.objectToPost).append(" QueueSize:").append(queue.size()).toString());
                if (true) goto _L2; else goto _L1
_L1:
                InterruptedException interruptedexception;
                interruptedexception;
            }

            
            {
                this$0 = TwcBus.this;
                super();
            }
        });
    }

    public void startIfNotStarted()
    {
        if (!started)
        {
            start();
        }
    }

    public void unregister(Object obj)
    {
        try
        {
            bus.unregister(Preconditions.checkNotNull(obj));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            LogUtil.d("TwcBus", LoggingMetaTags.TWC_GENERAL, "Could not unregister: %s", new Object[] {
                obj
            });
        }
    }



}
