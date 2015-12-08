// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.analytics.tracking.android:
//            ServiceManager, Log, GAUsage, AnalyticsThread, 
//            PersistentAnalyticsStore, AnalyticsStore, AnalyticsStoreStateListener

public class GAServiceManager
    implements ServiceManager
{

    private static final int MSG_KEY = 1;
    private static final Object MSG_OBJECT = new Object();
    private static GAServiceManager instance;
    private Context ctx;
    private int dispatchPeriodInSeconds;
    private Handler handler;
    private AnalyticsStoreStateListener listener = new AnalyticsStoreStateListener() {

        final GAServiceManager this$0;

        public void reportStoreIsEmpty(boolean flag)
        {
            updatePowerSaveMode(flag);
        }

            
            {
                this$0 = GAServiceManager.this;
                super();
            }
    };
    private boolean pendingDispatch;
    private boolean powerSaveMode;
    private AnalyticsStore store;
    private volatile AnalyticsThread thread;

    private GAServiceManager()
    {
        dispatchPeriodInSeconds = 1800;
        pendingDispatch = true;
        powerSaveMode = false;
    }

    GAServiceManager(Context context, AnalyticsThread analyticsthread, AnalyticsStore analyticsstore)
    {
        dispatchPeriodInSeconds = 1800;
        pendingDispatch = true;
        powerSaveMode = false;
        store = analyticsstore;
        thread = analyticsthread;
        initialize(context, analyticsthread);
    }

    public static GAServiceManager getInstance()
    {
        if (instance == null)
        {
            instance = new GAServiceManager();
        }
        return instance;
    }

    private void initializeHandler()
    {
        handler = new Handler(ctx.getMainLooper(), new android.os.Handler.Callback() {

            final GAServiceManager this$0;

            public boolean handleMessage(Message message)
            {
                if (1 == message.what && GAServiceManager.MSG_OBJECT.equals(message.obj))
                {
                    GAUsage.getInstance().setDisableUsage(true);
                    dispatch();
                    GAUsage.getInstance().setDisableUsage(false);
                    if (dispatchPeriodInSeconds > 0 && !powerSaveMode)
                    {
                        handler.sendMessageDelayed(handler.obtainMessage(1, GAServiceManager.MSG_OBJECT), dispatchPeriodInSeconds * 1000);
                    }
                }
                return true;
            }

            
            {
                this$0 = GAServiceManager.this;
                super();
            }
        });
        if (dispatchPeriodInSeconds > 0)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, MSG_OBJECT), dispatchPeriodInSeconds * 1000);
        }
    }

    public void dispatch()
    {
        this;
        JVM INSTR monitorenter ;
        if (thread != null) goto _L2; else goto _L1
_L1:
        Log.w("dispatch call queued.  Need to call GAServiceManager.getInstance().initialize().");
        pendingDispatch = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        GAUsage.getInstance().setUsage(GAUsage.Field.DISPATCH);
        thread.dispatch();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    AnalyticsStoreStateListener getListener()
    {
        return listener;
    }

    AnalyticsStore getStore()
    {
        this;
        JVM INSTR monitorenter ;
        if (store != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (ctx == null)
        {
            throw new IllegalStateException("Cant get a store unless we have a context");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        store = new PersistentAnalyticsStore(listener, ctx);
        AnalyticsStore analyticsstore;
        if (handler == null)
        {
            initializeHandler();
        }
        analyticsstore = store;
        this;
        JVM INSTR monitorexit ;
        return analyticsstore;
    }

    void initialize(Context context, AnalyticsThread analyticsthread)
    {
        this;
        JVM INSTR monitorenter ;
        Context context1 = ctx;
        if (context1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ctx = context.getApplicationContext();
        if (thread == null)
        {
            thread = analyticsthread;
            if (pendingDispatch)
            {
                analyticsthread.dispatch();
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    public void setDispatchPeriod(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (handler != null) goto _L2; else goto _L1
_L1:
        Log.w("Need to call initialize() and be in fallback mode to start dispatch.");
        dispatchPeriodInSeconds = i;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_DISPATCH_PERIOD);
        if (!powerSaveMode && dispatchPeriodInSeconds > 0)
        {
            handler.removeMessages(1, MSG_OBJECT);
        }
        dispatchPeriodInSeconds = i;
        if (i <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!powerSaveMode)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, MSG_OBJECT), i * 1000);
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    void setThrottlingEnabled(boolean flag)
    {
        store.setThrottlingEnabled(flag);
    }

    void updatePowerSaveMode(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = powerSaveMode;
        if (flag1 != flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        if (dispatchPeriodInSeconds > 0)
        {
            handler.removeMessages(1, MSG_OBJECT);
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        if (dispatchPeriodInSeconds > 0)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, MSG_OBJECT), dispatchPeriodInSeconds * 1000);
        }
        StringBuilder stringbuilder = (new StringBuilder()).append("PowerSaveMode ");
        Object obj;
        if (flag)
        {
            obj = "initiated.";
        } else
        {
            obj = "terminated.";
        }
        Log.iDebug(stringbuilder.append(((String) (obj))).toString());
        powerSaveMode = flag;
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        throw obj;
    }





}
