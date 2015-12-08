// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.os.Handler;
import com.walmart.android.service.AsyncCallback;

// Referenced classes of package com.walmart.android.wmservice:
//            Authentication

private abstract class handler
    implements AsyncCallback
{

    private final Handler handler;
    private int id;
    final Authentication this$0;

    public int getID()
    {
        return id;
    }

    public void onCancelled()
    {
        handler.post(new Runnable() {

            final Authentication.SingleTaskAsyncCallbackOnThread this$1;

            public void run()
            {
                onCancelledSameThread();
                Authentication.access$900(this$0);
            }

            
            {
                this$1 = Authentication.SingleTaskAsyncCallbackOnThread.this;
                super();
            }
        });
    }

    public void onCancelledSameThread()
    {
    }

    public void onFailure(final Object error, final Object data)
    {
        handler.post(new Runnable() {

            final Authentication.SingleTaskAsyncCallbackOnThread this$1;
            final Object val$data;
            final Object val$error;

            public void run()
            {
                onFailureSameThread(error, data);
                Authentication.access$900(this$0);
            }

            
            {
                this$1 = Authentication.SingleTaskAsyncCallbackOnThread.this;
                error = obj;
                data = obj1;
                super();
            }
        });
    }

    public abstract void onFailureSameThread(Object obj, Object obj1);

    public void onSuccess(final Object data)
    {
        handler.post(new Runnable() {

            final Authentication.SingleTaskAsyncCallbackOnThread this$1;
            final Object val$data;

            public void run()
            {
                onSuccessSameThread(data);
                Authentication.access$900(this$0);
            }

            
            {
                this$1 = Authentication.SingleTaskAsyncCallbackOnThread.this;
                data = obj;
                super();
            }
        });
    }

    public abstract void onSuccessSameThread(Object obj);

    public void setID(int i)
    {
        id = i;
    }

    public _cls3.this._cls1(Handler handler1)
    {
        this$0 = Authentication.this;
        super();
        if (handler1 == null)
        {
            throw new IllegalArgumentException("Handler must not be null");
        } else
        {
            handler = handler1;
            return;
        }
    }
}
