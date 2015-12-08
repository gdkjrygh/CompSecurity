// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import android.os.Handler;

// Referenced classes of package com.walmart.android.service:
//            AsyncCallback

public abstract class AsyncCallbackOnThread
    implements AsyncCallback
{

    private Handler handler;
    private int id;

    public AsyncCallbackOnThread(Handler handler1)
    {
        if (handler1 == null)
        {
            throw new IllegalArgumentException("Handler must not be null");
        } else
        {
            handler = handler1;
            return;
        }
    }

    public int getID()
    {
        return id;
    }

    public void onCancelled()
    {
        if (handler != null)
        {
            handler.post(new Runnable() {

                final AsyncCallbackOnThread this$0;

                public void run()
                {
                    onCancelledSameThread();
                }

            
            {
                this$0 = AsyncCallbackOnThread.this;
                super();
            }
            });
        }
    }

    public void onCancelledSameThread()
    {
    }

    public void onFailure(final Object error, final Object data)
    {
        if (handler != null)
        {
            handler.post(new Runnable() {

                final AsyncCallbackOnThread this$0;
                final Object val$data;
                final Object val$error;

                public void run()
                {
                    onFailureSameThread(error, data);
                }

            
            {
                this$0 = AsyncCallbackOnThread.this;
                error = obj;
                data = obj1;
                super();
            }
            });
        }
    }

    public abstract void onFailureSameThread(Object obj, Object obj1);

    public void onSuccess(final Object data)
    {
        if (handler != null)
        {
            handler.post(new Runnable() {

                final AsyncCallbackOnThread this$0;
                final Object val$data;

                public void run()
                {
                    onSuccessSameThread(data);
                }

            
            {
                this$0 = AsyncCallbackOnThread.this;
                data = obj;
                super();
            }
            });
        }
    }

    public abstract void onSuccessSameThread(Object obj);

    public void setID(int i)
    {
        id = i;
    }
}
