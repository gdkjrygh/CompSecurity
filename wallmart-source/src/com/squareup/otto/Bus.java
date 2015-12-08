// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.otto;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.squareup.otto:
//            HandlerFinder, ThreadEnforcer, EventProducer, EventHandler, 
//            DeadEvent

public class Bus
{
    static class EventWithHandler
    {

        final Object event;
        final EventHandler handler;

        public EventWithHandler(Object obj, EventHandler eventhandler)
        {
            event = obj;
            handler = eventhandler;
        }
    }


    public static final String DEFAULT_IDENTIFIER = "default";
    private static final String TAG = com/squareup/otto/Bus.getSimpleName();
    private final ThreadEnforcer enforcer;
    private final ThreadLocal eventsToDispatch;
    private final Map flattenHierarchyCache;
    private final HandlerFinder handlerFinder;
    private final ConcurrentMap handlersByType;
    private final String identifier;
    private final ThreadLocal isDispatching;
    private final ConcurrentMap producersByType;

    public Bus()
    {
        this("default");
    }

    public Bus(ThreadEnforcer threadenforcer)
    {
        this(threadenforcer, "default");
    }

    public Bus(ThreadEnforcer threadenforcer, String s)
    {
        this(threadenforcer, s, HandlerFinder.ANNOTATED);
    }

    Bus(ThreadEnforcer threadenforcer, String s, HandlerFinder handlerfinder)
    {
        handlersByType = new ConcurrentHashMap();
        producersByType = new ConcurrentHashMap();
        eventsToDispatch = new ThreadLocal() {

            final Bus this$0;

            protected volatile Object initialValue()
            {
                return initialValue();
            }

            protected ConcurrentLinkedQueue initialValue()
            {
                return new ConcurrentLinkedQueue();
            }

            
            {
                this$0 = Bus.this;
                super();
            }
        };
        isDispatching = new ThreadLocal() {

            final Bus this$0;

            protected Boolean initialValue()
            {
                return Boolean.valueOf(false);
            }

            protected volatile Object initialValue()
            {
                return initialValue();
            }

            
            {
                this$0 = Bus.this;
                super();
            }
        };
        flattenHierarchyCache = new HashMap();
        enforcer = threadenforcer;
        identifier = s;
        handlerFinder = handlerfinder;
    }

    public Bus(String s)
    {
        this(ThreadEnforcer.MAIN, s);
    }

    private void dispatchProducerResultToHandler(EventHandler eventhandler, EventProducer eventproducer)
    {
        Object obj = null;
        Object obj1 = eventproducer.produceEvent();
        eventproducer = ((EventProducer) (obj1));
_L1:
        InvocationTargetException invocationtargetexception;
        if (eventproducer == null)
        {
            return;
        } else
        {
            dispatch(eventproducer, eventhandler);
            return;
        }
        invocationtargetexception;
        throwRuntimeException((new StringBuilder()).append("Producer ").append(eventproducer).append(" threw an exception.").toString(), invocationtargetexception);
        eventproducer = obj;
          goto _L1
    }

    private Set getClassesFor(Class class1)
    {
        LinkedList linkedlist = new LinkedList();
        HashSet hashset = new HashSet();
        linkedlist.add(class1);
        do
        {
            if (linkedlist.isEmpty())
            {
                break;
            }
            class1 = (Class)linkedlist.remove(0);
            hashset.add(class1);
            class1 = class1.getSuperclass();
            if (class1 != null)
            {
                linkedlist.add(class1);
            }
        } while (true);
        return hashset;
    }

    private static void throwRuntimeException(String s, InvocationTargetException invocationtargetexception)
    {
        invocationtargetexception = invocationtargetexception.getCause();
        if (invocationtargetexception != null)
        {
            throw new RuntimeException(s, invocationtargetexception);
        } else
        {
            throw new RuntimeException(s);
        }
    }

    protected void dispatch(Object obj, EventHandler eventhandler)
    {
        try
        {
            eventhandler.handleEvent(obj);
            return;
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throwRuntimeException((new StringBuilder()).append("Could not dispatch event: ").append(obj.getClass()).append(" to handler ").append(eventhandler).toString(), invocationtargetexception);
        }
    }

    protected void dispatchQueuedEvents()
    {
        if (((Boolean)isDispatching.get()).booleanValue())
        {
            return;
        }
        isDispatching.set(Boolean.valueOf(true));
_L2:
        EventWithHandler eventwithhandler = (EventWithHandler)((ConcurrentLinkedQueue)eventsToDispatch.get()).poll();
        if (eventwithhandler == null)
        {
            isDispatching.set(Boolean.valueOf(false));
            return;
        }
        if (!eventwithhandler.handler.isValid()) goto _L2; else goto _L1
_L1:
        dispatch(eventwithhandler.event, eventwithhandler.handler);
          goto _L2
        Exception exception;
        exception;
        isDispatching.set(Boolean.valueOf(false));
        throw exception;
    }

    protected void enqueueEvent(Object obj, EventHandler eventhandler)
    {
        ((ConcurrentLinkedQueue)eventsToDispatch.get()).offer(new EventWithHandler(obj, eventhandler));
    }

    Set flattenHierarchy(Class class1)
    {
        Set set1 = (Set)flattenHierarchyCache.get(class1);
        Set set = set1;
        if (set1 == null)
        {
            set = getClassesFor(class1);
            flattenHierarchyCache.put(class1, set);
        }
        return set;
    }

    Set getHandlersForEventType(Class class1)
    {
        return (Set)handlersByType.get(class1);
    }

    EventProducer getProducerForEventType(Class class1)
    {
        return (EventProducer)producersByType.get(class1);
    }

    public void post(Object obj)
    {
        boolean flag;
        enforcer.enforce(this);
        Object obj1 = flattenHierarchy(obj.getClass());
        flag = false;
        obj1 = ((Set) (obj1)).iterator();
        do
        {
label0:
            {
                Object obj2;
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break label0;
                    }
                    obj2 = getHandlersForEventType((Class)((Iterator) (obj1)).next());
                } while (obj2 == null || ((Set) (obj2)).isEmpty());
                boolean flag1 = true;
                obj2 = ((Set) (obj2)).iterator();
                do
                {
                    flag = flag1;
                    if (!((Iterator) (obj2)).hasNext())
                    {
                        break;
                    }
                    enqueueEvent(obj, (EventHandler)((Iterator) (obj2)).next());
                } while (true);
            }
        } while (true);
        if (!flag && !(obj instanceof DeadEvent))
        {
            post(new DeadEvent(this, obj));
        }
        dispatchQueuedEvents();
        return;
    }

    public void printHandlers()
    {
        for (Iterator iterator = handlersByType.entrySet().iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((Set)((java.util.Map.Entry)iterator.next()).getValue()).iterator();
            while (iterator1.hasNext()) 
            {
                EventHandler eventhandler = (EventHandler)iterator1.next();
                Log.d(TAG, eventhandler.toString());
            }
        }

    }

    public void register(Object obj)
    {
        enforcer.enforce(this);
        Map map = handlerFinder.findAllProducers(obj);
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj4 = (Class)iterator.next();
            EventProducer eventproducer = (EventProducer)map.get(obj4);
            Object obj5 = (EventProducer)producersByType.putIfAbsent(obj4, eventproducer);
            if (obj5 != null)
            {
                obj5 = (new StringBuilder()).append("Producer method for type ").append(obj4).append(" found on type ").append(eventproducer.target.getClass()).append(", but already registered by type ").append(((EventProducer) (obj5)).target.getClass()).append(".").toString();
                Log.e(TAG, ((String) (obj5)));
            }
            obj4 = (Set)handlersByType.get(obj4);
            if (obj4 != null && !((Set) (obj4)).isEmpty())
            {
                obj4 = ((Set) (obj4)).iterator();
                while (((Iterator) (obj4)).hasNext()) 
                {
                    dispatchProducerResultToHandler((EventHandler)((Iterator) (obj4)).next(), eventproducer);
                }
            }
        } while (true);
        Map map1 = handlerFinder.findAllSubscribers(obj);
        Class class1;
        for (Iterator iterator1 = map1.keySet().iterator(); iterator1.hasNext(); ((Set) (obj)).addAll((Set)map1.get(class1)))
        {
            class1 = (Class)iterator1.next();
            Object obj1 = (Set)handlersByType.get(class1);
            obj = obj1;
            if (obj1 != null)
            {
                continue;
            }
            obj1 = new CopyOnWriteArraySet();
            Set set = (Set)handlersByType.putIfAbsent(class1, obj1);
            obj = set;
            if (set == null)
            {
                obj = obj1;
            }
        }

        obj = map1.entrySet().iterator();
_L2:
        Object obj2;
        Object obj3;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_480;
            }
            obj3 = (java.util.Map.Entry)((Iterator) (obj)).next();
            obj2 = (Class)((java.util.Map.Entry) (obj3)).getKey();
            obj2 = (EventProducer)producersByType.get(obj2);
        } while (obj2 == null || !((EventProducer) (obj2)).isValid());
        obj3 = ((Set)((java.util.Map.Entry) (obj3)).getValue()).iterator();
_L4:
        if (!((Iterator) (obj3)).hasNext()) goto _L2; else goto _L1
_L1:
        EventHandler eventhandler = (EventHandler)((Iterator) (obj3)).next();
        if (!((EventProducer) (obj2)).isValid()) goto _L2; else goto _L3
_L3:
        if (eventhandler.isValid())
        {
            dispatchProducerResultToHandler(eventhandler, ((EventProducer) (obj2)));
        }
          goto _L4
    }

    public String toString()
    {
        return (new StringBuilder()).append("[Bus \"").append(identifier).append("\"]").toString();
    }

    public void unregister(Object obj)
    {
        Iterator iterator;
        enforcer.enforce(this);
        iterator = handlerFinder.findAllProducers(obj).entrySet().iterator();
_L3:
        Class class1;
        EventProducer eventproducer;
        Object obj2;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_154;
        }
        obj2 = (java.util.Map.Entry)iterator.next();
        class1 = (Class)((java.util.Map.Entry) (obj2)).getKey();
        eventproducer = getProducerForEventType(class1);
        obj2 = (EventProducer)((java.util.Map.Entry) (obj2)).getValue();
        if (obj2 != null && ((EventProducer) (obj2)).equals(eventproducer)) goto _L2; else goto _L1
_L1:
        obj = (new StringBuilder()).append("Missing event producer for an annotated method. Is ").append(obj.getClass()).append(" registered?").toString();
        Log.e(TAG, ((String) (obj)));
_L4:
        return;
_L2:
        ((EventProducer)producersByType.remove(class1)).invalidate();
          goto _L3
        Iterator iterator1 = handlerFinder.findAllSubscribers(obj).entrySet().iterator();
        while (iterator1.hasNext()) 
        {
            Object obj1 = (java.util.Map.Entry)iterator1.next();
            Set set = getHandlersForEventType((Class)((java.util.Map.Entry) (obj1)).getKey());
            obj1 = (Collection)((java.util.Map.Entry) (obj1)).getValue();
            if (set == null || !set.containsAll(((Collection) (obj1))))
            {
                obj = (new StringBuilder()).append("Missing event handler for an annotated method. Is ").append(obj.getClass()).append(" registered?").toString();
                Log.e(TAG, ((String) (obj)));
                return;
            }
            Iterator iterator2 = set.iterator();
            do
            {
                if (!iterator2.hasNext())
                {
                    break;
                }
                EventHandler eventhandler = (EventHandler)iterator2.next();
                if (((Collection) (obj1)).contains(eventhandler))
                {
                    eventhandler.invalidate();
                }
            } while (true);
            set.removeAll(((Collection) (obj1)));
        }
          goto _L4
    }

}
