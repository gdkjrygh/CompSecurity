// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.eventbus;

import com.google.common.base.Preconditions;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.common.eventbus:
//            EventBus, SubscriberExceptionHandler, EventSubscriber

public class AsyncEventBus extends EventBus
{

    private final ConcurrentLinkedQueue eventsToDispatch;
    private final Executor executor;

    public AsyncEventBus(String s, Executor executor1)
    {
        super(s);
        eventsToDispatch = new ConcurrentLinkedQueue();
        executor = (Executor)Preconditions.checkNotNull(executor1);
    }

    public AsyncEventBus(Executor executor1)
    {
        super("default");
        eventsToDispatch = new ConcurrentLinkedQueue();
        executor = (Executor)Preconditions.checkNotNull(executor1);
    }

    public AsyncEventBus(Executor executor1, SubscriberExceptionHandler subscriberexceptionhandler)
    {
        super(subscriberexceptionhandler);
        eventsToDispatch = new ConcurrentLinkedQueue();
        executor = (Executor)Preconditions.checkNotNull(executor1);
    }

    void dispatch(final Object event, final EventSubscriber subscriber)
    {
        Preconditions.checkNotNull(event);
        Preconditions.checkNotNull(subscriber);
        executor.execute(new Runnable() {

            final AsyncEventBus this$0;
            final Object val$event;
            final EventSubscriber val$subscriber;

            public void run()
            {
                dispatch(event, subscriber);
            }

            
            {
                this$0 = AsyncEventBus.this;
                event = obj;
                subscriber = eventsubscriber;
                super();
            }
        });
    }

    protected void dispatchQueuedEvents()
    {
        do
        {
            EventBus.EventWithSubscriber eventwithsubscriber = (EventBus.EventWithSubscriber)eventsToDispatch.poll();
            if (eventwithsubscriber == null)
            {
                return;
            }
            dispatch(eventwithsubscriber.event, eventwithsubscriber.subscriber);
        } while (true);
    }

    void enqueueEvent(Object obj, EventSubscriber eventsubscriber)
    {
        eventsToDispatch.offer(new EventBus.EventWithSubscriber(obj, eventsubscriber));
    }

}
