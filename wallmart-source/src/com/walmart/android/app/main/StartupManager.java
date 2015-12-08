// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.content.Context;
import android.os.Handler;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.events.AutoLoginEvent;
import com.walmart.android.data.AppConfig;
import com.walmart.android.events.StartupAppConfigEvent;
import com.walmart.android.events.StartupFinishedEvent;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.MessageBus;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.WalmartNetService;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

public class StartupManager
{
    private class LoginRequest extends StartupRequest
    {

        final StartupManager this$0;

        protected void execute(Context context, AsyncCallback asynccallback)
        {
            if (mMitigateStartupRequests)
            {
                asynccallback.onCancelled();
                return;
            } else
            {
                mHandler.post(new Runnable() {

                    final LoginRequest this$1;

                    public void run()
                    {
                        Authentication authentication = Services.get().getAuthentication();
                        authentication.renewSession(authentication. new com.walmart.android.wmservice.Authentication.AuthCallback() {

                            final LoginRequest._cls1 this$2;
                            final Authentication val$auth;

                            public void onFailure(int i)
                            {
                                setError(i);
                            }

                            public void onSuccess()
                            {
                                setResult(Boolean.valueOf(true));
                                MessageBus.getBus().post(new AutoLoginEvent(auth.getCustomerId()));
                            }

            
            {
                this$2 = final__pcls1;
                auth = Authentication.this;
                super();
            }
                        });
                    }

            
            {
                this$1 = LoginRequest.this;
                super();
            }
                });
                return;
            }
        }

        private LoginRequest()
        {
            this$0 = StartupManager.this;
            super();
        }

    }

    private static abstract class StartupRequest
    {

        private final AsyncCallback mCallback;
        private final ArrayList mClientCallbacks;
        private volatile int mError;
        private volatile boolean mIsFinished;
        private CountDownLatch mLatch;
        private volatile Object mResult;

        private void deliver()
        {
            ArrayList arraylist = mClientCallbacks;
            arraylist;
            JVM INSTR monitorenter ;
            if (mClientCallbacks.isEmpty())
            {
                break MISSING_BLOCK_LABEL_158;
            }
            if (mResult != null)
            {
                for (Iterator iterator = mClientCallbacks.iterator(); iterator.hasNext(); ((AsyncCallback)iterator.next()).onSuccess(mResult)) { }
                break MISSING_BLOCK_LABEL_151;
            }
            break MISSING_BLOCK_LABEL_67;
            Exception exception;
            exception;
            arraylist;
            JVM INSTR monitorexit ;
            throw exception;
            if (mError != -1)
            {
                for (Iterator iterator1 = mClientCallbacks.iterator(); iterator1.hasNext(); ((AsyncCallback)iterator1.next()).onFailure(Integer.valueOf(mError), null)) { }
                break MISSING_BLOCK_LABEL_151;
            }
            for (Iterator iterator2 = mClientCallbacks.iterator(); iterator2.hasNext(); ((AsyncCallback)iterator2.next()).onCancelled()) { }
            mClientCallbacks.clear();
            arraylist;
            JVM INSTR monitorexit ;
        }

        private void finish()
        {
            mIsFinished = true;
            mLatch.countDown();
        }

        private void reset()
        {
            mIsFinished = false;
            mError = -1;
            mResult = null;
            mLatch = new CountDownLatch(1);
        }

        private void waitForResult()
            throws InterruptedException
        {
            mLatch.await();
        }

        public void addCallback(AsyncCallback asynccallback)
        {
            synchronized (mClientCallbacks)
            {
                mClientCallbacks.add(asynccallback);
            }
            if (mIsFinished)
            {
                deliver();
            }
            return;
            asynccallback;
            arraylist;
            JVM INSTR monitorexit ;
            throw asynccallback;
        }

        protected abstract void execute(Context context, AsyncCallback asynccallback);

        public final boolean run(Context context)
            throws InterruptedException
        {
            reset();
            execute(context, mCallback);
            if (!mIsFinished)
            {
                try
                {
                    waitForResult();
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    mIsFinished = true;
                    throw context;
                }
            }
            if (mError == 0x15f92)
            {
                return false;
            } else
            {
                deliver();
                return true;
            }
        }

        protected final void setError(int i)
        {
            mError = i;
            finish();
        }

        protected final void setResult(Object obj)
        {
            mResult = obj;
            if (mResult == null)
            {
                mError = 0x15f91;
            }
            finish();
        }



        private StartupRequest()
        {
            mError = -1;
            mClientCallbacks = new ArrayList();
            mCallback = new _cls1();
        }

    }


    private static final long RETRY_TIME_MS = 5000L;
    private static final String TAG = com/walmart/android/app/main/StartupManager.getSimpleName();
    private static StartupManager sInstance;
    private volatile Context mContext;
    private final Handler mHandler = new Handler();
    private StartupRequest mLoginRequest;
    private volatile boolean mMitigateStartupRequests;
    private volatile boolean mShutdown;
    private StartupFinishedEvent mStartupFinishedEvent;
    private Thread mThread;

    private StartupManager()
    {
    }

    private boolean getLoginResult()
    {
        Boolean boolean1 = (Boolean)mLoginRequest.mResult;
        if (boolean1 != null)
        {
            return boolean1.booleanValue();
        } else
        {
            return false;
        }
    }

    private void init(Context context)
    {
        mContext = context;
        mLoginRequest = new LoginRequest();
        MessageBus.getBus().register(this);
    }

    private void innerStart(final Context context)
    {
        init(context);
        AppConfigManager.get().start(context, new com.walmart.android.wmservice.AppConfigManager.AppConfigCallback() {

            final StartupManager this$0;
            final Context val$context;

            public void onAppConfig(AppConfig appconfig)
            {
                if (appconfig != null)
                {
                    mMitigateStartupRequests = appconfig.mitigateStartupRequests;
                }
                MessageBus.getBus().post(new StartupAppConfigEvent(appconfig));
                startRequests(context, appconfig);
            }

            
            {
                this$0 = StartupManager.this;
                context = context1;
                super();
            }
        });
    }

    private void shutdown()
    {
        WLog.d(TAG, "shutdown");
        MessageBus.getBus().unregister(this);
        mShutdown = true;
        if (mThread != null)
        {
            mThread.interrupt();
        }
    }

    public static void start(Context context)
    {
        if (sInstance != null)
        {
            sInstance.shutdown();
        }
        sInstance = new StartupManager();
        sInstance.innerStart(context);
    }

    private void startRequests(final Context context, final AppConfig appConfig)
    {
        mThread = new Thread() {

            final StartupManager this$0;
            final AppConfig val$appConfig;
            final Context val$context;

            public void run()
            {
                if (mLoginRequest == null || mLoginRequest.run(context))
                {
                    break MISSING_BLOCK_LABEL_41;
                }
                WLog.d(StartupManager.TAG, "no network available. retrying in 5000ms");
                Thread.sleep(5000L);
_L2:
                mHandler.post(new Runnable() {

                    final _cls2 this$1;

                    public void run()
                    {
                        WLog.d(StartupManager.TAG, "Startup finished");
                        mStartupFinishedEvent = new StartupFinishedEvent(appConfig, Boolean.valueOf(getLoginResult()));
                        MessageBus.getBus().post(mStartupFinishedEvent);
                        Services.get().getWalmartService().printCookies();
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                });
                return;
                InterruptedException interruptedexception;
                interruptedexception;
                try
                {
                    if (mShutdown)
                    {
                        WLog.d(StartupManager.TAG, "Interrupted after shutdown. Exiting");
                        return;
                    }
                }
                catch (InterruptedException interruptedexception1)
                {
                    if (mShutdown)
                    {
                        WLog.d(StartupManager.TAG, "Interrupted after shutdown. Exiting");
                        return;
                    }
                }
                catch (Exception exception)
                {
                    WLog.w(StartupManager.TAG, exception.toString());
                }
                if (true) goto _L2; else goto _L1
_L1:
            }

            
            {
                this$0 = StartupManager.this;
                context = context1;
                appConfig = appconfig;
                super();
            }
        };
        mThread.start();
    }

    public StartupFinishedEvent getStartupFinishedEvent()
    {
        return mStartupFinishedEvent;
    }




/*
    static boolean access$102(StartupManager startupmanager, boolean flag)
    {
        startupmanager.mMitigateStartupRequests = flag;
        return flag;
    }

*/







/*
    static StartupFinishedEvent access$602(StartupManager startupmanager, StartupFinishedEvent startupfinishedevent)
    {
        startupmanager.mStartupFinishedEvent = startupfinishedevent;
        return startupfinishedevent;
    }

*/



    // Unreferenced inner class com/walmart/android/app/main/StartupManager$StartupRequest$1

/* anonymous class */
    class StartupRequest._cls1
        implements AsyncCallback
    {

        final StartupRequest this$0;

        public int getID()
        {
            return 0;
        }

        public void onCancelled()
        {
            if (mIsFinished)
            {
                return;
            } else
            {
                setError(-1);
                return;
            }
        }

        public void onFailure(Integer integer, Object obj)
        {
            if (mIsFinished)
            {
                return;
            } else
            {
                setError(integer.intValue());
                return;
            }
        }

        public volatile void onFailure(Object obj, Object obj1)
        {
            onFailure((Integer)obj, obj1);
        }

        public void onSuccess(Object obj)
        {
            if (mIsFinished)
            {
                return;
            } else
            {
                setResult(obj);
                return;
            }
        }

        public void setID(int i)
        {
        }

            
            {
                this$0 = StartupRequest.this;
                super();
            }
    }

}
