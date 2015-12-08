// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo.service;

import com.walmartlabs.kangaroo.Callback;
import com.walmartlabs.kangaroo.CheckedIllegalStateException;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

abstract class ExecutableRequest
    implements Request
{

    private final ArrayList mCallbacks;
    private boolean mCancelled;
    private final ReentrantLock mLock;
    private final Request mPriorRequest;
    private Result mResult;
    private final CountDownLatch mResultLatch;

    public ExecutableRequest()
    {
        this(null);
    }

    public ExecutableRequest(ExecutableRequest executablerequest)
    {
        mCallbacks = new ArrayList();
        mLock = new ReentrantLock();
        mResultLatch = new CountDownLatch(1);
        mPriorRequest = executablerequest;
    }

    public Request addCallback(Callback callback)
    {
        Result result;
        result = null;
        mLock.lock();
        if (mResult != null) goto _L2; else goto _L1
_L1:
        mCallbacks.add(callback);
_L4:
        mLock.unlock();
        if (result != null)
        {
            callback.onResult(this, result);
        }
        return this;
_L2:
        result = mResult;
        if (true) goto _L4; else goto _L3
_L3:
        callback;
        mLock.unlock();
        throw callback;
    }

    public void cancel()
    {
        Object obj;
        obj = Collections.emptyList();
        mLock.lock();
        if (!mCancelled)
        {
            mCancelled = true;
            obj = Collections.unmodifiableList(mCallbacks);
        }
        mLock.unlock();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Callback)((Iterator) (obj)).next()).onCancelled(this)) { }
        break MISSING_BLOCK_LABEL_82;
        Exception exception;
        exception;
        mLock.unlock();
        throw exception;
        mResultLatch.countDown();
        return;
    }

    protected abstract ExecutableRequest copy();

    abstract Request execute();

    public Request getPriorRequest()
    {
        return mPriorRequest;
    }

    public Result getResult()
        throws InterruptedException
    {
        mResultLatch.await();
        mLock.lock();
        Object obj;
        obj = mResult;
        if (mCancelled)
        {
            throw new InterruptedException("Cancelled");
        }
        break MISSING_BLOCK_LABEL_46;
        obj;
        mLock.unlock();
        throw obj;
        mLock.unlock();
        return ((Result) (obj));
    }

    public boolean hasPriorRequest()
    {
        return mPriorRequest != null;
    }

    public Request retry()
        throws CheckedIllegalStateException
    {
        Collections.emptyList();
        mLock.lock();
        if (mCancelled)
        {
            throw new CheckedIllegalStateException("Cancelled");
        }
        break MISSING_BLOCK_LABEL_38;
        Exception exception;
        exception;
        mLock.unlock();
        throw exception;
        List list;
        if (mResult == null)
        {
            throw new CheckedIllegalStateException("Still executing");
        }
        list = Collections.unmodifiableList(mCallbacks);
        ExecutableRequest executablerequest;
        mLock.unlock();
        executablerequest = copy();
        executablerequest.mLock.lock();
        executablerequest.mCallbacks.addAll(list);
        executablerequest.mLock.unlock();
        Exception exception1;
        if (executablerequest.mPriorRequest != this)
        {
            throw new AssertionError("copy() must call copy constructor");
        } else
        {
            return executablerequest.execute();
        }
        exception1;
        executablerequest.mLock.unlock();
        throw exception1;
    }

    protected void setAndNotifyResult(Result result)
    {
        mLock.lock();
        if (mCancelled) goto _L2; else goto _L1
_L1:
        Object obj;
        mResult = result;
        obj = Collections.unmodifiableList(mCallbacks);
_L4:
        mLock.unlock();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Callback)((Iterator) (obj)).next()).onResult(this, result)) { }
        break; /* Loop/switch isn't completed */
_L2:
        obj = Collections.emptyList();
        if (true) goto _L4; else goto _L3
        result;
        mLock.unlock();
        throw result;
_L3:
        mResultLatch.countDown();
        return;
    }
}
