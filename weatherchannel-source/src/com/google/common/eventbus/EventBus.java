// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.eventbus;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.SetMultimap;
import com.google.common.reflect.TypeToken;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.eventbus:
//            AnnotatedSubscriberFinder, SubscriberExceptionHandler, EventSubscriber, SubscriberExceptionContext, 
//            DeadEvent, SubscriberFindingStrategy

public class EventBus
{
    static class EventWithSubscriber
    {

        final Object event;
        final EventSubscriber subscriber;

        public EventWithSubscriber(Object obj, EventSubscriber eventsubscriber)
        {
            event = Preconditions.checkNotNull(obj);
            subscriber = (EventSubscriber)Preconditions.checkNotNull(eventsubscriber);
        }
    }

    private static final class LoggingSubscriberExceptionHandler
        implements SubscriberExceptionHandler
    {

        private final Logger logger;

        public void handleException(Throwable throwable, SubscriberExceptionContext subscriberexceptioncontext)
        {
            Logger logger1 = logger;
            Level level = Level.SEVERE;
            String s = String.valueOf(String.valueOf(subscriberexceptioncontext.getSubscriber()));
            subscriberexceptioncontext = String.valueOf(String.valueOf(subscriberexceptioncontext.getSubscriberMethod()));
            logger1.log(level, (new StringBuilder(s.length() + 30 + subscriberexceptioncontext.length())).append("Could not dispatch event: ").append(s).append(" to ").append(subscriberexceptioncontext).toString(), throwable.getCause());
        }

        public LoggingSubscriberExceptionHandler(String s)
        {
            String s1 = String.valueOf(String.valueOf(com/google/common/eventbus/EventBus.getName()));
            s = String.valueOf(String.valueOf((String)Preconditions.checkNotNull(s)));
            logger = Logger.getLogger((new StringBuilder(s1.length() + 1 + s.length())).append(s1).append(".").append(s).toString());
        }
    }


    private static final LoadingCache flattenHierarchyCache = CacheBuilder.newBuilder().weakKeys().build(new CacheLoader() {

        public volatile Object load(Object obj)
            throws Exception
        {
            return load((Class)obj);
        }

        public Set load(Class class1)
        {
            return TypeToken.of(class1).getTypes().rawTypes();
        }

    });
    private final ThreadLocal eventsToDispatch;
    private final SubscriberFindingStrategy finder;
    private final ThreadLocal isDispatching;
    private SubscriberExceptionHandler subscriberExceptionHandler;
    private final SetMultimap subscribersByType;
    private final ReadWriteLock subscribersByTypeLock;

    public EventBus()
    {
        this("default");
    }

    public EventBus(SubscriberExceptionHandler subscriberexceptionhandler)
    {
        subscribersByType = HashMultimap.create();
        subscribersByTypeLock = new ReentrantReadWriteLock();
        finder = new AnnotatedSubscriberFinder();
        eventsToDispatch = new ThreadLocal() {

            final EventBus this$0;

            protected volatile Object initialValue()
            {
                return initialValue();
            }

            protected Queue initialValue()
            {
                return new LinkedList();
            }

            
            {
                this$0 = EventBus.this;
                super();
            }
        };
        isDispatching = new ThreadLocal() {

            final EventBus this$0;

            protected Boolean initialValue()
            {
                return Boolean.valueOf(false);
            }

            protected volatile Object initialValue()
            {
                return initialValue();
            }

            
            {
                this$0 = EventBus.this;
                super();
            }
        };
        subscriberExceptionHandler = (SubscriberExceptionHandler)Preconditions.checkNotNull(subscriberexceptionhandler);
    }

    public EventBus(String s)
    {
        this(((SubscriberExceptionHandler) (new LoggingSubscriberExceptionHandler(s))));
    }

    void dispatch(Object obj, EventSubscriber eventsubscriber)
    {
        try
        {
            eventsubscriber.handleEvent(obj);
            return;
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            try
            {
                subscriberExceptionHandler.handleException(invocationtargetexception.getCause(), new SubscriberExceptionContext(this, obj, eventsubscriber.getSubscriber(), eventsubscriber.getMethod()));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logger.getLogger(com/google/common/eventbus/EventBus.getName()).log(Level.SEVERE, String.format("Exception %s thrown while handling exception: %s", new Object[] {
                    obj, invocationtargetexception.getCause()
                }), ((Throwable) (obj)));
            }
        }
    }

    void dispatchQueuedEvents()
    {
        if (((Boolean)isDispatching.get()).booleanValue())
        {
            return;
        }
        isDispatching.set(Boolean.valueOf(true));
        Queue queue = (Queue)eventsToDispatch.get();
_L1:
        EventWithSubscriber eventwithsubscriber = (EventWithSubscriber)queue.poll();
        if (eventwithsubscriber == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        dispatch(eventwithsubscriber.event, eventwithsubscriber.subscriber);
          goto _L1
        Exception exception;
        exception;
        isDispatching.remove();
        eventsToDispatch.remove();
        throw exception;
        isDispatching.remove();
        eventsToDispatch.remove();
        return;
    }

    void enqueueEvent(Object obj, EventSubscriber eventsubscriber)
    {
        ((Queue)eventsToDispatch.get()).offer(new EventWithSubscriber(obj, eventsubscriber));
    }

    Set flattenHierarchy(Class class1)
    {
        try
        {
            class1 = (Set)flattenHierarchyCache.getUnchecked(class1);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw Throwables.propagate(class1.getCause());
        }
        return class1;
    }

    public void post(Object obj)
    {
        Object obj1;
        boolean flag;
        obj1 = flattenHierarchy(obj.getClass());
        flag = false;
        obj1 = ((Set) (obj1)).iterator();
_L5:
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        Object obj2;
        obj2 = (Class)((Iterator) (obj1)).next();
        subscribersByTypeLock.readLock().lock();
        obj2 = subscribersByType.get(obj2);
        if (((Set) (obj2)).isEmpty())
        {
            continue; /* Loop/switch isn't completed */
        }
        boolean flag1 = true;
        obj2 = ((Set) (obj2)).iterator();
_L4:
        flag = flag1;
        if (!((Iterator) (obj2)).hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        enqueueEvent(obj, (EventSubscriber)((Iterator) (obj2)).next());
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        subscribersByTypeLock.readLock().unlock();
        throw obj;
        subscribersByTypeLock.readLock().unlock();
          goto _L5
_L2:
        if (!flag && !(obj instanceof DeadEvent))
        {
            post(new DeadEvent(this, obj));
        }
        dispatchQueuedEvents();
        return;
    }

    public void register(Object obj)
    {
        obj = finder.findAllSubscribers(obj);
        subscribersByTypeLock.writeLock().lock();
        subscribersByType.putAll(((Multimap) (obj)));
        subscribersByTypeLock.writeLock().unlock();
        return;
        obj;
        subscribersByTypeLock.writeLock().unlock();
        throw obj;
    }

    public void unregister(Object obj)
    {
        Iterator iterator = finder.findAllSubscribers(obj).asMap().entrySet().iterator();
_L2:
        Object obj1;
        Object obj2;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (java.util.Map.Entry)iterator.next();
        obj1 = (Class)((java.util.Map.Entry) (obj2)).getKey();
        obj2 = (Collection)((java.util.Map.Entry) (obj2)).getValue();
        subscribersByTypeLock.writeLock().lock();
        obj1 = subscribersByType.get(obj1);
        if (!((Set) (obj1)).containsAll(((Collection) (obj2))))
        {
            obj = String.valueOf(String.valueOf(obj));
            throw new IllegalArgumentException((new StringBuilder(((String) (obj)).length() + 65)).append("missing event subscriber for an annotated method. Is ").append(((String) (obj))).append(" registered?").toString());
        }
        break MISSING_BLOCK_LABEL_171;
        obj;
        subscribersByTypeLock.writeLock().unlock();
        throw obj;
        ((Set) (obj1)).removeAll(((Collection) (obj2)));
        subscribersByTypeLock.writeLock().unlock();
        if (true) goto _L2; else goto _L1
_L1:
    }

}
