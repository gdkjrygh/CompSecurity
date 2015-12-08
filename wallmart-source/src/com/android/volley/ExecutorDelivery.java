// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.android.volley:
//            ResponseDelivery, Request, Response, VolleyError

public class ExecutorDelivery
    implements ResponseDelivery
{
    private class ResponseDeliveryRunnable
        implements Runnable
    {

        private final Request mRequest;
        private final Response mResponse;
        private final Runnable mRunnable;
        final ExecutorDelivery this$0;

        public void run()
        {
            if (mRequest.isCanceled())
            {
                mRequest.finish("canceled-at-delivery");
            } else
            {
                if (mResponse.isSuccess())
                {
                    mRequest.deliverResponse(mResponse.result);
                } else
                {
                    mRequest.deliverError(mResponse.error);
                }
                if (mResponse.intermediate)
                {
                    mRequest.addMarker("intermediate-response");
                } else
                {
                    mRequest.finish("done");
                }
                if (mRunnable != null)
                {
                    mRunnable.run();
                    return;
                }
            }
        }

        public ResponseDeliveryRunnable(Request request, Response response, Runnable runnable)
        {
            this$0 = ExecutorDelivery.this;
            super();
            mRequest = request;
            mResponse = response;
            mRunnable = runnable;
        }
    }


    private final Executor mResponsePoster;

    public ExecutorDelivery(final Handler handler)
    {
        mResponsePoster = new Executor() {

            final ExecutorDelivery this$0;
            final Handler val$handler;

            public void execute(Runnable runnable)
            {
                handler.post(runnable);
            }

            
            {
                this$0 = ExecutorDelivery.this;
                handler = handler1;
                super();
            }
        };
    }

    public ExecutorDelivery(Executor executor)
    {
        mResponsePoster = executor;
    }

    public void postError(Request request, VolleyError volleyerror)
    {
        request.addMarker("post-error");
        volleyerror = Response.error(volleyerror);
        mResponsePoster.execute(new ResponseDeliveryRunnable(request, volleyerror, null));
    }

    public void postResponse(Request request, Response response)
    {
        postResponse(request, response, null);
    }

    public void postResponse(Request request, Response response, Runnable runnable)
    {
        request.markDelivered();
        request.addMarker("post-response");
        mResponsePoster.execute(new ResponseDeliveryRunnable(request, response, runnable));
    }
}
