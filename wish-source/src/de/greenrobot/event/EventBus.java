// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package de.greenrobot.event:
//            HandlerPoster, BackgroundPoster, AsyncPoster, SubscriberMethodFinder, 
//            Subscription, NoSubscriberEvent, SubscriberExceptionEvent, SubscriberMethod, 
//            ThreadMode, EventBusException, PendingPost

public class EventBus
{
    static interface PostCallback
    {

        public abstract void onPostCompleted(List list);
    }

    static final class PostingThreadState
    {

        boolean canceled;
        Object event;
        List eventQueue;
        boolean isMainThread;
        boolean isPosting;
        Subscription subscription;

        PostingThreadState()
        {
            eventQueue = new ArrayList();
        }
    }


    public static String TAG = "Event";
    private static volatile EventBus defaultInstance;
    private static final Map eventTypesCache = new HashMap();
    static ExecutorService executorService = Executors.newCachedThreadPool();
    private final AsyncPoster asyncPoster = new AsyncPoster(this);
    private final BackgroundPoster backgroundPoster = new BackgroundPoster(this);
    private final ThreadLocal currentPostingThreadState = new ThreadLocal() {

        final EventBus this$0;

        protected PostingThreadState initialValue()
        {
            return new PostingThreadState();
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
    private String defaultMethodName;
    private boolean logSubscriberExceptions;
    private final HandlerPoster mainThreadPoster = new HandlerPoster(this, Looper.getMainLooper(), 10);
    private final Map stickyEvents = new ConcurrentHashMap();
    private boolean subscribed;
    private final SubscriberMethodFinder subscriberMethodFinder = new SubscriberMethodFinder();
    private final Map subscriptionsByEventType = new HashMap();
    private final Map typesBySubscriber = new HashMap();

    public EventBus()
    {
        defaultMethodName = "onEvent";
        logSubscriberExceptions = true;
    }

    static void addInterfaces(List list, Class aclass[])
    {
        int j = aclass.length;
        for (int i = 0; i < j; i++)
        {
            Class class1 = aclass[i];
            if (!list.contains(class1))
            {
                list.add(class1);
                addInterfaces(list, class1.getInterfaces());
            }
        }

    }

    public static void clearCaches()
    {
        SubscriberMethodFinder.clearCaches();
        eventTypesCache.clear();
    }

    public static void clearSkipMethodNameVerifications()
    {
        SubscriberMethodFinder.clearSkipMethodVerifications();
    }

    private List findEventTypes(Class class1)
    {
        Map map = eventTypesCache;
        map;
        JVM INSTR monitorenter ;
        Object obj1 = (List)eventTypesCache.get(class1);
        Object obj;
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        obj1 = new ArrayList();
        obj = class1;
_L1:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        ((List) (obj1)).add(obj);
        addInterfaces(((List) (obj1)), ((Class) (obj)).getInterfaces());
        obj = ((Class) (obj)).getSuperclass();
          goto _L1
        eventTypesCache.put(class1, obj1);
        obj = obj1;
        map;
        JVM INSTR monitorexit ;
        return ((List) (obj));
        class1;
        map;
        JVM INSTR monitorexit ;
        throw class1;
    }

    public static EventBus getDefault()
    {
        if (defaultInstance != null) goto _L2; else goto _L1
_L1:
        de/greenrobot/event/EventBus;
        JVM INSTR monitorenter ;
        if (defaultInstance == null)
        {
            defaultInstance = new EventBus();
        }
        de/greenrobot/event/EventBus;
        JVM INSTR monitorexit ;
_L2:
        return defaultInstance;
        Exception exception;
        exception;
        de/greenrobot/event/EventBus;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void postSingleEvent(Object obj, PostingThreadState postingthreadstate)
        throws Error
    {
        Class class1;
        List list;
        int i;
        boolean flag;
        int j;
        class1 = obj.getClass();
        list = findEventTypes(class1);
        flag = false;
        j = list.size();
        i = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = (Class)list.get(i);
        this;
        JVM INSTR monitorenter ;
        obj1 = (CopyOnWriteArrayList)subscriptionsByEventType.get(obj1);
        this;
        JVM INSTR monitorexit ;
        boolean flag1;
        flag1 = flag;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        flag1 = flag;
        if (((CopyOnWriteArrayList) (obj1)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_169;
        }
        obj1 = ((CopyOnWriteArrayList) (obj1)).iterator();
_L2:
        Subscription subscription;
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        subscription = (Subscription)((Iterator) (obj1)).next();
        postingthreadstate.event = obj;
        postingthreadstate.subscription = subscription;
        boolean flag2;
        postToSubscription(subscription, obj, postingthreadstate.isMainThread);
        flag2 = postingthreadstate.canceled;
        postingthreadstate.event = null;
        postingthreadstate.subscription = null;
        postingthreadstate.canceled = false;
        if (!flag2) goto _L2; else goto _L1
_L1:
        flag1 = true;
        i++;
        flag = flag1;
        if (true) goto _L4; else goto _L3
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        postingthreadstate.event = null;
        postingthreadstate.subscription = null;
        postingthreadstate.canceled = false;
        throw obj;
_L3:
        if (!flag)
        {
            Log.d(TAG, (new StringBuilder()).append("No subscribers registered for event ").append(class1).toString());
            if (class1 != de/greenrobot/event/NoSubscriberEvent && class1 != de/greenrobot/event/SubscriberExceptionEvent)
            {
                post(new NoSubscriberEvent(this, obj));
            }
        }
        return;
    }

    private void postToSubscription(Subscription subscription, Object obj, boolean flag)
    {
        static class _cls2
        {

            static final int $SwitchMap$de$greenrobot$event$ThreadMode[];

            static 
            {
                $SwitchMap$de$greenrobot$event$ThreadMode = new int[ThreadMode.values().length];
                try
                {
                    $SwitchMap$de$greenrobot$event$ThreadMode[ThreadMode.PostThread.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$de$greenrobot$event$ThreadMode[ThreadMode.MainThread.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$de$greenrobot$event$ThreadMode[ThreadMode.BackgroundThread.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$de$greenrobot$event$ThreadMode[ThreadMode.Async.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2..SwitchMap.de.greenrobot.event.ThreadMode[subscription.subscriberMethod.threadMode.ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown thread mode: ").append(subscription.subscriberMethod.threadMode).toString());

        case 1: // '\001'
            invokeSubscriber(subscription, obj);
            return;

        case 2: // '\002'
            if (flag)
            {
                invokeSubscriber(subscription, obj);
                return;
            } else
            {
                mainThreadPoster.enqueue(subscription, obj);
                return;
            }

        case 3: // '\003'
            if (flag)
            {
                backgroundPoster.enqueue(subscription, obj);
                return;
            } else
            {
                invokeSubscriber(subscription, obj);
                return;
            }

        case 4: // '\004'
            asyncPoster.enqueue(subscription, obj);
            return;
        }
    }

    private void register(Object obj, String s, boolean flag, int i)
    {
        this;
        JVM INSTR monitorenter ;
        for (s = subscriberMethodFinder.findSubscriberMethods(obj.getClass(), s).iterator(); s.hasNext(); subscribe(obj, (SubscriberMethod)s.next(), flag, i)) { }
        break MISSING_BLOCK_LABEL_54;
        obj;
        throw obj;
        this;
        JVM INSTR monitorexit ;
    }

    private transient void register(Object obj, String s, boolean flag, Class class1, Class aclass[])
    {
        this;
        JVM INSTR monitorenter ;
        Class class2 = obj.getClass();
        s = subscriberMethodFinder.findSubscriberMethods(class2, s).iterator();
_L4:
        SubscriberMethod subscribermethod;
        if (s.hasNext())
        {
            subscribermethod = (SubscriberMethod)s.next();
            if (class1 == subscribermethod.eventType)
            {
                subscribe(obj, subscribermethod, flag, 0);
                continue; /* Loop/switch isn't completed */
            }
            break MISSING_BLOCK_LABEL_71;
        }
          goto _L1
        obj;
        throw obj;
        if (aclass == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        int j = aclass.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (aclass[i] == subscribermethod.eventType)
        {
            subscribe(obj, subscribermethod, flag, 0);
            continue; /* Loop/switch isn't completed */
        }
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void skipMethodVerificationFor(Class class1)
    {
        SubscriberMethodFinder.skipMethodVerificationFor(class1);
    }

    private void subscribe(Object obj, SubscriberMethod subscribermethod, boolean flag, int i)
    {
        Object obj1;
        Class class1;
        Subscription subscription;
        subscribed = true;
        class1 = subscribermethod.eventType;
        obj1 = (CopyOnWriteArrayList)subscriptionsByEventType.get(class1);
        subscription = new Subscription(obj, subscribermethod, i);
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        subscribermethod = new CopyOnWriteArrayList();
        subscriptionsByEventType.put(class1, subscribermethod);
_L4:
        int j;
        j = subscribermethod.size();
        i = 0;
_L7:
        if (i <= j)
        {
            if (i != j && subscription.priority <= ((Subscription)subscribermethod.get(i)).priority)
            {
                break MISSING_BLOCK_LABEL_298;
            }
            subscribermethod.add(i, subscription);
        }
        obj1 = (List)typesBySubscriber.get(obj);
        subscribermethod = ((SubscriberMethod) (obj1));
        if (obj1 == null)
        {
            subscribermethod = new ArrayList();
            typesBySubscriber.put(obj, subscribermethod);
        }
        subscribermethod.add(class1);
        if (flag)
        {
            synchronized (stickyEvents)
            {
                subscribermethod = ((SubscriberMethod) (stickyEvents.get(class1)));
            }
            if (subscribermethod != null)
            {
                Iterator iterator;
                if (Looper.getMainLooper() == Looper.myLooper())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                postToSubscription(subscription, subscribermethod, flag);
            }
        }
        return;
_L2:
        iterator = ((CopyOnWriteArrayList) (obj1)).iterator();
_L6:
        subscribermethod = ((SubscriberMethod) (obj1));
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        if (!((Subscription)iterator.next()).equals(subscription)) goto _L6; else goto _L5
_L5:
        throw new EventBusException((new StringBuilder()).append("Subscriber ").append(obj.getClass()).append(" already registered to event ").append(class1).toString());
        i++;
          goto _L7
        subscribermethod;
        obj;
        JVM INSTR monitorexit ;
        throw subscribermethod;
    }

    private void unubscribeByEventType(Object obj, Class class1)
    {
        class1 = (List)subscriptionsByEventType.get(class1);
        if (class1 != null)
        {
            int j = class1.size();
            int k;
            for (int i = 0; i < j; j = k)
            {
                Subscription subscription = (Subscription)class1.get(i);
                int l = i;
                k = j;
                if (subscription.subscriber == obj)
                {
                    subscription.active = false;
                    class1.remove(i);
                    l = i - 1;
                    k = j - 1;
                }
                i = l + 1;
            }

        }
    }

    public void cancelEventDelivery(Object obj)
    {
        PostingThreadState postingthreadstate = (PostingThreadState)currentPostingThreadState.get();
        if (!postingthreadstate.isPosting)
        {
            throw new EventBusException("This method may only be called from inside event handling methods on the posting thread");
        }
        if (obj == null)
        {
            throw new EventBusException("Event may not be null");
        }
        if (postingthreadstate.event != obj)
        {
            throw new EventBusException("Only the currently handled event may be aborted");
        }
        if (postingthreadstate.subscription.subscriberMethod.threadMode != ThreadMode.PostThread)
        {
            throw new EventBusException(" event handlers may only abort the incoming event");
        } else
        {
            postingthreadstate.canceled = true;
            return;
        }
    }

    public void configureLogSubscriberExceptions(boolean flag)
    {
        if (subscribed)
        {
            throw new EventBusException("This method must be called before any registration");
        } else
        {
            logSubscriberExceptions = flag;
            return;
        }
    }

    public Object getStickyEvent(Class class1)
    {
        synchronized (stickyEvents)
        {
            class1 = ((Class) (class1.cast(stickyEvents.get(class1))));
        }
        return class1;
        class1;
        map;
        JVM INSTR monitorexit ;
        throw class1;
    }

    void invokeSubscriber(PendingPost pendingpost)
    {
        Object obj = pendingpost.event;
        Subscription subscription = pendingpost.subscription;
        PendingPost.releasePendingPost(pendingpost);
        if (subscription.active)
        {
            invokeSubscriber(subscription, obj);
        }
    }

    void invokeSubscriber(Subscription subscription, Object obj)
        throws Error
    {
        Throwable throwable;
        try
        {
            subscription.subscriberMethod.method.invoke(subscription.subscriber, new Object[] {
                obj
            });
            return;
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throwable = invocationtargetexception.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Subscription subscription)
        {
            throw new IllegalStateException("Unexpected exception", subscription);
        }
        if (obj instanceof SubscriberExceptionEvent)
        {
            Log.e(TAG, (new StringBuilder()).append("SubscriberExceptionEvent subscriber ").append(subscription.subscriber.getClass()).append(" threw an exception").toString(), throwable);
            subscription = (SubscriberExceptionEvent)obj;
            Log.e(TAG, (new StringBuilder()).append("Initial event ").append(((SubscriberExceptionEvent) (subscription)).causingEvent).append(" caused exception in ").append(((SubscriberExceptionEvent) (subscription)).causingSubscriber).toString(), ((SubscriberExceptionEvent) (subscription)).throwable);
            return;
        }
        if (logSubscriberExceptions)
        {
            Log.e(TAG, (new StringBuilder()).append("Could not dispatch event: ").append(obj.getClass()).append(" to subscribing class ").append(subscription.subscriber.getClass()).toString(), throwable);
        }
        post(new SubscriberExceptionEvent(this, throwable, obj, subscription.subscriber));
    }

    public boolean isRegistered(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = typesBySubscriber.containsKey(obj);
        this;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        throw obj;
    }

    public void post(Object obj)
    {
        PostingThreadState postingthreadstate;
        List list;
        postingthreadstate = (PostingThreadState)currentPostingThreadState.get();
        list = postingthreadstate.eventQueue;
        list.add(obj);
        if (postingthreadstate.isPosting)
        {
            return;
        }
        boolean flag;
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        postingthreadstate.isMainThread = flag;
        postingthreadstate.isPosting = true;
        if (postingthreadstate.canceled)
        {
            throw new EventBusException("Internal error. Abort state was not reset");
        }
        for (; !list.isEmpty(); postSingleEvent(list.remove(0), postingthreadstate)) { }
        break MISSING_BLOCK_LABEL_116;
        obj;
        postingthreadstate.isPosting = false;
        postingthreadstate.isMainThread = false;
        throw obj;
        postingthreadstate.isPosting = false;
        postingthreadstate.isMainThread = false;
        return;
    }

    public void postSticky(Object obj)
    {
        synchronized (stickyEvents)
        {
            stickyEvents.put(obj.getClass(), obj);
        }
        post(obj);
        return;
        obj;
        map;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void register(Object obj)
    {
        register(obj, defaultMethodName, false, 0);
    }

    public void register(Object obj, int i)
    {
        register(obj, defaultMethodName, false, i);
    }

    public transient void register(Object obj, Class class1, Class aclass[])
    {
        register(obj, defaultMethodName, false, class1, aclass);
    }

    public void register(Object obj, String s)
    {
        register(obj, s, false, 0);
    }

    public transient void register(Object obj, String s, Class class1, Class aclass[])
    {
        register(obj, s, false, class1, aclass);
    }

    public void registerSticky(Object obj)
    {
        register(obj, defaultMethodName, true, 0);
    }

    public void registerSticky(Object obj, int i)
    {
        register(obj, defaultMethodName, true, i);
    }

    public transient void registerSticky(Object obj, Class class1, Class aclass[])
    {
        register(obj, defaultMethodName, true, class1, aclass);
    }

    public void registerSticky(Object obj, String s)
    {
        register(obj, s, true, 0);
    }

    public transient void registerSticky(Object obj, String s, Class class1, Class aclass[])
    {
        register(obj, s, true, class1, aclass);
    }

    public void removeAllStickyEvents()
    {
        synchronized (stickyEvents)
        {
            stickyEvents.clear();
        }
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object removeStickyEvent(Class class1)
    {
        synchronized (stickyEvents)
        {
            class1 = ((Class) (class1.cast(stickyEvents.remove(class1))));
        }
        return class1;
        class1;
        map;
        JVM INSTR monitorexit ;
        throw class1;
    }

    public boolean removeStickyEvent(Object obj)
    {
        Map map = stickyEvents;
        map;
        JVM INSTR monitorenter ;
        Class class1 = obj.getClass();
        if (!obj.equals(stickyEvents.get(class1)))
        {
            break MISSING_BLOCK_LABEL_44;
        }
        stickyEvents.remove(class1);
        return true;
        map;
        JVM INSTR monitorexit ;
        return false;
        obj;
        map;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void unregister(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj1 = (List)typesBySubscriber.get(obj);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); unubscribeByEventType(obj, (Class)((Iterator) (obj1)).next())) { }
        break MISSING_BLOCK_LABEL_58;
        obj;
        throw obj;
        typesBySubscriber.remove(obj);
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Log.w(TAG, (new StringBuilder()).append("Subscriber to unregister was not registered before: ").append(obj.getClass()).toString());
          goto _L1
    }

    public transient void unregister(Object obj, Class aclass[])
    {
        this;
        JVM INSTR monitorenter ;
        if (aclass.length == 0)
        {
            throw new IllegalArgumentException("Provide at least one event class");
        }
        break MISSING_BLOCK_LABEL_23;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        List list = (List)typesBySubscriber.get(obj);
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        int j = aclass.length;
        int i = 0;
_L2:
        Class class1;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        class1 = aclass[i];
        unubscribeByEventType(obj, class1);
        list.remove(class1);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (list.isEmpty())
        {
            typesBySubscriber.remove(obj);
        }
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
        Log.w(TAG, (new StringBuilder()).append("Subscriber to unregister was not registered before: ").append(obj.getClass()).toString());
          goto _L3
    }

}
