// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import android.util.Log;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.walmart.android.service:
//            CancellableRunnable, AsyncCallback, ServiceException, HttpRequestExecutor, 
//            ServiceDataValidator, ServiceData, ReturnDataValidator

public abstract class GetServiceDataRunnable
    implements CancellableRunnable
{

    private static final int CANCELLED = 1;
    private static final int DONE = 2;
    private static final int NOT_STARTED_OR_RUNNING = 0;
    private static final String TAG = com/walmart/android/service/GetServiceDataRunnable.getSimpleName();
    private long mCacheMaxAge;
    private boolean mCachingEnabled;
    private final AsyncCallback mCallback;
    private int mErrorCode;
    private boolean mForceCacheClean;
    private boolean mHasError;
    private boolean mHasResult;
    private final HttpRequestExecutor mHttpRequestExecutor;
    private final HttpUriRequest mRequest;
    private Object mResultData;
    private volatile ReturnDataValidator mReturnDataValidator;
    private volatile ServiceDataValidator mServiceDataValidator;
    private final AtomicInteger mState = new AtomicInteger(0);
    private boolean mUseCacheHeaders;

    public GetServiceDataRunnable(HttpRequestExecutor httprequestexecutor, HttpUriRequest httpurirequest, AsyncCallback asynccallback)
    {
        mResultData = null;
        mHttpRequestExecutor = httprequestexecutor;
        mRequest = httpurirequest;
        mCallback = asynccallback;
    }

    public boolean cancel()
    {
        if (mState.compareAndSet(0, 1))
        {
            Log.w(TAG, "sending onCancelled");
            mRequest.abort();
            mCallback.onCancelled();
            return true;
        } else
        {
            return false;
        }
    }

    public void enableCaching(long l)
    {
        if (l > 0L)
        {
            mCachingEnabled = true;
            mCacheMaxAge = l;
            return;
        } else
        {
            Log.e(TAG, (new StringBuilder()).append("enableCaching() inable non-positive maxAge value: ").append(l).toString());
            return;
        }
    }

    public void enableCachingHeader()
    {
        mCachingEnabled = true;
        mUseCacheHeaders = true;
    }

    public void forceCacheClean(boolean flag)
    {
        mForceCacheClean = true;
    }

    public abstract Object onServiceDataReceived(ServiceData servicedata)
        throws ServiceException, IOException;

    public void run()
    {
        mErrorCode = -1;
        if (mHasResult) goto _L2; else goto _L1
_L1:
        Object obj = mHttpRequestExecutor.execute(mRequest, mCachingEnabled, mForceCacheClean, mCacheMaxAge, mUseCacheHeaders);
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (mServiceDataValidator == null || mServiceDataValidator.validate(((ServiceData) (obj)))) goto _L4; else goto _L5
_L5:
        mErrorCode = mServiceDataValidator.getErrorCode();
_L2:
        if (mState.compareAndSet(0, 2))
        {
            if (mResultData == null || mHasError)
            {
                break; /* Loop/switch isn't completed */
            }
            mCallback.onSuccess(mResultData);
        }
        return;
_L4:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        if (!((ServiceData) (obj)).hasHttpError() && ((ServiceData) (obj)).getContent() != null)
        {
            System.currentTimeMillis();
            mResultData = onServiceDataReceived(((ServiceData) (obj)));
            if (mResultData != null && mReturnDataValidator != null && !mReturnDataValidator.shouldCache(mResultData))
            {
                mHttpRequestExecutor.deleteCache(mRequest);
            }
            continue; /* Loop/switch isn't completed */
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_308;
        }
        IOException ioexception;
        if (((ServiceData) (obj)).hasHttpError())
        {
            setErrorCode(((ServiceData) (obj)).getHttpStatusCode());
            if (((ServiceData) (obj)).getContent() != null)
            {
                mResultData = onServiceDataReceived(((ServiceData) (obj)));
            }
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            mErrorCode = 0x15f92;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            mErrorCode = 0x15f93;
            Log.e(TAG, (new StringBuilder()).append("Service error: ").append(((ServiceException) (obj)).toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            mErrorCode = 0x15f93;
            Log.e(TAG, (new StringBuilder()).append("IOException: ").append(ioexception.toString()).toString());
        }
        catch (Exception exception)
        {
            Log.e(TAG, (new StringBuilder()).append("Unknown exception: ").append(exception.toString()).toString());
            mErrorCode = 0x15f91;
        }
        if (true) goto _L2; else goto _L6
_L6:
        if (mCachingEnabled)
        {
            Log.w(TAG, "deleting potentially cached error response");
            mHttpRequestExecutor.deleteCache(mRequest);
        }
        Log.w(TAG, "sending onFailure");
        mCallback.onFailure(Integer.valueOf(mErrorCode), mResultData);
        return;
    }

    protected final void setErrorCode(int i)
    {
        mErrorCode = i;
        mHasError = true;
    }

    protected final void setResult(Object obj)
    {
        mResultData = obj;
        mHasResult = true;
    }

    public void setReturnDataValidator(ReturnDataValidator returndatavalidator)
    {
        mReturnDataValidator = returndatavalidator;
    }

    public void setServiceDataValidator(ServiceDataValidator servicedatavalidator)
    {
        mServiceDataValidator = servicedatavalidator;
    }

}
