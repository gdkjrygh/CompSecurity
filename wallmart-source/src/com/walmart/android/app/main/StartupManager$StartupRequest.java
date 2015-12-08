// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.content.Context;
import com.walmart.android.service.AsyncCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.walmart.android.app.main:
//            StartupManager

private static abstract class <init>
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



    private _cls1.this._cls0()
    {
        mError = -1;
        mClientCallbacks = new ArrayList();
        mCallback = new AsyncCallback() {

            final StartupManager.StartupRequest this$0;

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
                this$0 = StartupManager.StartupRequest.this;
                super();
            }
        };
    }

    _cls1(_cls1 _pcls1)
    {
        this();
    }
}
