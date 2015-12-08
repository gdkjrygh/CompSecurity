// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.walmartlabs.kangaroo:
//            Callback, Result, Request

public abstract class CallbackSameThread
    implements Callback
{

    private static final ThreadLocal sHandler = new ThreadLocal() {

        protected Handler initialValue()
        {
            return new Handler();
        }

        protected volatile Object initialValue()
        {
            return initialValue();
        }

    };
    private final AtomicBoolean mCancelled;
    private final ConnectivityManager mConnectivityManager;
    private final Handler mHandler;

    public CallbackSameThread()
    {
        this(null);
    }

    public CallbackSameThread(Context context)
    {
        mHandler = (Handler)sHandler.get();
        mCancelled = new AtomicBoolean(false);
        if (context != null)
        {
            mConnectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
            return;
        } else
        {
            mConnectivityManager = null;
            return;
        }
    }

    private boolean shouldClassifyConnectionError(Result result)
    {
        return mConnectivityManager != null && result.hasError() && Result.Error.ERROR_CONNECT_UNCLASSIFIED.equals(result.getError());
    }

    private Result updateResultIfUnclassifiedError(Result result)
    {
        Object obj = result;
        if (shouldClassifyConnectionError(result))
        {
            Result.Error error = Result.Error.ERROR_NOT_CONNECTED;
            NetworkInfo networkinfo = mConnectivityManager.getActiveNetworkInfo();
            obj = error;
            if (networkinfo != null)
            {
                obj = error;
                if (networkinfo.isConnected())
                {
                    obj = Result.Error.ERROR_CONNECT_OTHER;
                }
            }
            obj = result.builder().error(((Result.Error) (obj)), result.getException()).build();
        }
        return ((Result) (obj));
    }

    public void onCancelled(final Request request)
    {
        mCancelled.set(true);
        mHandler.post(new Runnable() {

            final CallbackSameThread this$0;
            final Request val$request;

            public void run()
            {
                onCancelledSameThread(request);
            }

            
            {
                this$0 = CallbackSameThread.this;
                request = request1;
                super();
            }
        });
    }

    public void onCancelledSameThread(Request request)
    {
    }

    public void onResult(final Request request, final Result updated)
    {
        updated = updateResultIfUnclassifiedError(updated);
        mHandler.post(new Runnable() {

            final CallbackSameThread this$0;
            final Request val$request;
            final Result val$updated;

            public void run()
            {
                if (!mCancelled.get())
                {
                    onResultSameThread(request, updated);
                }
            }

            
            {
                this$0 = CallbackSameThread.this;
                request = request1;
                updated = result;
                super();
            }
        });
    }

    public void onResultSameThread(Request request, Result result)
    {
    }


}
