// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.Context;
import android.content.Intent;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.analytics.tracking.android:
//            ServiceProxy, Log, AnalyticsClient, AnalyticsStore, 
//            AnalyticsThread, Clock, GAServiceManager, AnalyticsGmsCoreClient

class GAServiceProxy
    implements ServiceProxy, AnalyticsGmsCoreClient.OnConnectedListener, AnalyticsGmsCoreClient.OnConnectionFailedListener
{
    private static final class ConnectState extends Enum
    {

        private static final ConnectState $VALUES[];
        public static final ConnectState BLOCKED;
        public static final ConnectState CONNECTED_LOCAL;
        public static final ConnectState CONNECTED_SERVICE;
        public static final ConnectState CONNECTING;
        public static final ConnectState DISCONNECTED;
        public static final ConnectState PENDING_CONNECTION;
        public static final ConnectState PENDING_DISCONNECT;

        public static ConnectState valueOf(String s)
        {
            return (ConnectState)Enum.valueOf(com/google/analytics/tracking/android/GAServiceProxy$ConnectState, s);
        }

        public static ConnectState[] values()
        {
            return (ConnectState[])$VALUES.clone();
        }

        static 
        {
            CONNECTING = new ConnectState("CONNECTING", 0);
            CONNECTED_SERVICE = new ConnectState("CONNECTED_SERVICE", 1);
            CONNECTED_LOCAL = new ConnectState("CONNECTED_LOCAL", 2);
            BLOCKED = new ConnectState("BLOCKED", 3);
            PENDING_CONNECTION = new ConnectState("PENDING_CONNECTION", 4);
            PENDING_DISCONNECT = new ConnectState("PENDING_DISCONNECT", 5);
            DISCONNECTED = new ConnectState("DISCONNECTED", 6);
            $VALUES = (new ConnectState[] {
                CONNECTING, CONNECTED_SERVICE, CONNECTED_LOCAL, BLOCKED, PENDING_CONNECTION, PENDING_DISCONNECT, DISCONNECTED
            });
        }

        private ConnectState(String s, int i)
        {
            super(s, i);
        }
    }

    private class DisconnectCheckTask extends TimerTask
    {

        final GAServiceProxy this$0;

        public void run()
        {
            if (state == ConnectState.CONNECTED_SERVICE && queue.isEmpty() && lastRequestTime + idleTimeout < clock.currentTimeMillis())
            {
                Log.iDebug("Disconnecting due to inactivity");
                disconnectFromService();
                return;
            } else
            {
                disconnectCheckTimer.schedule(new DisconnectCheckTask(), idleTimeout);
                return;
            }
        }

        private DisconnectCheckTask()
        {
            this$0 = GAServiceProxy.this;
            super();
        }

    }

    private class FailedConnectTask extends TimerTask
    {

        final GAServiceProxy this$0;

        public void run()
        {
            if (state == ConnectState.CONNECTING)
            {
                useStore();
            }
        }

        private FailedConnectTask()
        {
            this$0 = GAServiceProxy.this;
            super();
        }

    }

    private static class HitParams
    {

        private final List commands;
        private final long hitTimeInMilliseconds;
        private final String path;
        private final Map wireFormatParams;

        public List getCommands()
        {
            return commands;
        }

        public long getHitTimeInMilliseconds()
        {
            return hitTimeInMilliseconds;
        }

        public String getPath()
        {
            return path;
        }

        public Map getWireFormatParams()
        {
            return wireFormatParams;
        }

        public HitParams(Map map, long l, String s, List list)
        {
            wireFormatParams = map;
            hitTimeInMilliseconds = l;
            path = s;
            commands = list;
        }
    }

    private class ReconnectTask extends TimerTask
    {

        final GAServiceProxy this$0;

        public void run()
        {
            connectToService();
        }

        private ReconnectTask()
        {
            this$0 = GAServiceProxy.this;
            super();
        }

    }


    private static final long FAILED_CONNECT_WAIT_TIME = 3000L;
    private static final int MAX_TRIES = 2;
    private static final long RECONNECT_WAIT_TIME = 5000L;
    private static final long SERVICE_CONNECTION_TIMEOUT = 0x493e0L;
    private volatile AnalyticsClient client;
    private Clock clock = new Clock() {

        final GAServiceProxy this$0;

        public long currentTimeMillis()
        {
            return System.currentTimeMillis();
        }

            
            {
                this$0 = GAServiceProxy.this;
                super();
            }
    };
    private volatile int connectTries;
    private final Context ctx;
    private volatile Timer disconnectCheckTimer;
    private volatile Timer failedConnectTimer;
    private long idleTimeout;
    private volatile long lastRequestTime;
    private boolean pendingClearHits;
    private boolean pendingDispatch;
    private final Queue queue;
    private volatile Timer reConnectTimer;
    private volatile ConnectState state;
    private AnalyticsStore store;
    private AnalyticsStore testStore;
    private final AnalyticsThread thread;

    GAServiceProxy(Context context, AnalyticsThread analyticsthread)
    {
        this(context, analyticsthread, null);
    }

    GAServiceProxy(Context context, AnalyticsThread analyticsthread, AnalyticsStore analyticsstore)
    {
        queue = new ConcurrentLinkedQueue();
        idleTimeout = 0x493e0L;
        testStore = analyticsstore;
        ctx = context;
        thread = analyticsthread;
        connectTries = 0;
        state = ConnectState.DISCONNECTED;
    }

    private Timer cancelTimer(Timer timer)
    {
        if (timer != null)
        {
            timer.cancel();
        }
        return null;
    }

    private void clearAllTimers()
    {
        reConnectTimer = cancelTimer(reConnectTimer);
        failedConnectTimer = cancelTimer(failedConnectTimer);
        disconnectCheckTimer = cancelTimer(disconnectCheckTimer);
    }

    private void connectToService()
    {
        this;
        JVM INSTR monitorenter ;
        ConnectState connectstate;
        ConnectState connectstate1;
        if (client == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        connectstate = state;
        connectstate1 = ConnectState.CONNECTED_LOCAL;
        if (connectstate == connectstate1)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        connectTries = connectTries + 1;
        cancelTimer(failedConnectTimer);
        state = ConnectState.CONNECTING;
        failedConnectTimer = new Timer("Failed Connect");
        failedConnectTimer.schedule(new FailedConnectTask(), 3000L);
        Log.iDebug("connecting to Analytics service");
        client.connect();
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.w("security exception on connectToService");
        useStore();
          goto _L1
        obj;
        throw obj;
        Log.w("client not initialized.");
        useStore();
          goto _L1
    }

    private void disconnectFromService()
    {
        this;
        JVM INSTR monitorenter ;
        if (client != null && state == ConnectState.CONNECTED_SERVICE)
        {
            state = ConnectState.PENDING_DISCONNECT;
            client.disconnect();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void dispatchToStore()
    {
        store.dispatch();
        pendingDispatch = false;
    }

    private void fireReconnectAttempt()
    {
        reConnectTimer = cancelTimer(reConnectTimer);
        reConnectTimer = new Timer("Service Reconnect");
        reConnectTimer.schedule(new ReconnectTask(), 5000L);
    }

    private void sendQueue()
    {
        this;
        JVM INSTR monitorenter ;
        if (Thread.currentThread().equals(thread.getThread())) goto _L2; else goto _L1
_L1:
        thread.getQueue().add(new Runnable() {

            final GAServiceProxy this$0;

            public void run()
            {
                sendQueue();
            }

            
            {
                this$0 = GAServiceProxy.this;
                super();
            }
        });
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (pendingClearHits)
        {
            clearHits();
        }
        static class _cls3
        {

            static final int $SwitchMap$com$google$analytics$tracking$android$GAServiceProxy$ConnectState[];

            static 
            {
                $SwitchMap$com$google$analytics$tracking$android$GAServiceProxy$ConnectState = new int[ConnectState.values().length];
                try
                {
                    $SwitchMap$com$google$analytics$tracking$android$GAServiceProxy$ConnectState[ConnectState.CONNECTED_LOCAL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$analytics$tracking$android$GAServiceProxy$ConnectState[ConnectState.CONNECTED_SERVICE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$analytics$tracking$android$GAServiceProxy$ConnectState[ConnectState.DISCONNECTED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3..SwitchMap.com.google.analytics.tracking.android.GAServiceProxy.ConnectState[state.ordinal()];
        JVM INSTR tableswitch 1 3: default 283
    //                   1 92
    //                   2 171
    //                   3 257;
           goto _L3 _L4 _L5 _L6
_L4:
        HitParams hitparams;
        for (; !queue.isEmpty(); store.putHit(hitparams.getWireFormatParams(), hitparams.getHitTimeInMilliseconds(), hitparams.getPath(), hitparams.getCommands()))
        {
            hitparams = (HitParams)queue.poll();
            Log.iDebug("Sending hit to store");
        }

          goto _L7
        Exception exception;
        exception;
        throw exception;
_L7:
        if (!pendingDispatch) goto _L3; else goto _L8
_L8:
        dispatchToStore();
          goto _L3
_L5:
        for (; !queue.isEmpty(); queue.poll())
        {
            HitParams hitparams1 = (HitParams)queue.peek();
            Log.iDebug("Sending hit to service");
            client.sendHit(hitparams1.getWireFormatParams(), hitparams1.getHitTimeInMilliseconds(), hitparams1.getPath(), hitparams1.getCommands());
        }

        lastRequestTime = clock.currentTimeMillis();
          goto _L3
_L6:
        Log.iDebug("Need to reconnect");
        if (!queue.isEmpty())
        {
            connectToService();
        }
          goto _L3
    }

    private void useStore()
    {
        this;
        JVM INSTR monitorenter ;
        ConnectState connectstate;
        ConnectState connectstate1;
        connectstate = state;
        connectstate1 = ConnectState.CONNECTED_LOCAL;
        if (connectstate != connectstate1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        clearAllTimers();
        Log.iDebug("falling back to local store");
        if (testStore == null)
        {
            break; /* Loop/switch isn't completed */
        }
        store = testStore;
_L4:
        state = ConnectState.CONNECTED_LOCAL;
        sendQueue();
        if (true) goto _L1; else goto _L3
        Exception exception;
        exception;
        throw exception;
_L3:
        GAServiceManager gaservicemanager = GAServiceManager.getInstance();
        gaservicemanager.initialize(ctx, thread);
        store = gaservicemanager.getStore();
          goto _L4
    }

    public void clearHits()
    {
        Log.iDebug("clearHits called");
        queue.clear();
        switch (_cls3..SwitchMap.com.google.analytics.tracking.android.GAServiceProxy.ConnectState[state.ordinal()])
        {
        default:
            pendingClearHits = true;
            return;

        case 1: // '\001'
            store.clearHits();
            pendingClearHits = false;
            return;

        case 2: // '\002'
            client.clearHits();
            break;
        }
        pendingClearHits = false;
    }

    public void createService()
    {
        if (client != null)
        {
            return;
        } else
        {
            client = new AnalyticsGmsCoreClient(ctx, this, this);
            connectToService();
            return;
        }
    }

    void createService(AnalyticsClient analyticsclient)
    {
        if (client != null)
        {
            return;
        } else
        {
            client = analyticsclient;
            connectToService();
            return;
        }
    }

    public void dispatch()
    {
        switch (_cls3..SwitchMap.com.google.analytics.tracking.android.GAServiceProxy.ConnectState[state.ordinal()])
        {
        default:
            pendingDispatch = true;
            // fall through

        case 2: // '\002'
            return;

        case 1: // '\001'
            dispatchToStore();
            break;
        }
    }

    public void onConnected()
    {
        this;
        JVM INSTR monitorenter ;
        failedConnectTimer = cancelTimer(failedConnectTimer);
        connectTries = 0;
        Log.iDebug("Connected to service");
        state = ConnectState.CONNECTED_SERVICE;
        sendQueue();
        disconnectCheckTimer = cancelTimer(disconnectCheckTimer);
        disconnectCheckTimer = new Timer("disconnect check");
        disconnectCheckTimer.schedule(new DisconnectCheckTask(), idleTimeout);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void onConnectionFailed(int i, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        Log.w((new StringBuilder()).append("Connection to service failed ").append(i).toString());
        state = ConnectState.PENDING_CONNECTION;
        if (connectTries >= 2) goto _L2; else goto _L1
_L1:
        fireReconnectAttempt();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        useStore();
        if (true) goto _L4; else goto _L3
_L3:
        intent;
        throw intent;
    }

    public void onDisconnected()
    {
        this;
        JVM INSTR monitorenter ;
        if (state != ConnectState.PENDING_DISCONNECT) goto _L2; else goto _L1
_L1:
        Log.iDebug("Disconnected from service");
        clearAllTimers();
        state = ConnectState.DISCONNECTED;
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.iDebug("Unexpected disconnect.");
        state = ConnectState.PENDING_CONNECTION;
        if (connectTries >= 2)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        fireReconnectAttempt();
          goto _L3
        Exception exception;
        exception;
        throw exception;
        useStore();
          goto _L3
    }

    public void putHit(Map map, long l, String s, List list)
    {
        Log.iDebug("putHit called");
        queue.add(new HitParams(map, l, s, list));
        sendQueue();
    }

    void setClock(Clock clock1)
    {
        clock = clock1;
    }

    public void setIdleTimeout(long l)
    {
        idleTimeout = l;
    }










}
