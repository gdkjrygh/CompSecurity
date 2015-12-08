// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.http;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.client.methods.HttpUriRequest;
import java.util.HashMap;

public abstract class HttpResponseHandler
{
    private static final class ResponseMessageType extends Enum
    {

        private static final ResponseMessageType $VALUES[];
        public static final ResponseMessageType CachedResponse;
        public static final ResponseMessageType RequestFailed;
        public static final ResponseMessageType RequestFinished;
        public static final ResponseMessageType RequestStarted;
        public static final ResponseMessageType RequestSucceeded;

        public static ResponseMessageType valueOf(String s)
        {
            return (ResponseMessageType)Enum.valueOf(com/contextlogic/wish/http/HttpResponseHandler$ResponseMessageType, s);
        }

        public static ResponseMessageType[] values()
        {
            return (ResponseMessageType[])$VALUES.clone();
        }

        static 
        {
            RequestStarted = new ResponseMessageType("RequestStarted", 0);
            RequestSucceeded = new ResponseMessageType("RequestSucceeded", 1);
            RequestFailed = new ResponseMessageType("RequestFailed", 2);
            RequestFinished = new ResponseMessageType("RequestFinished", 3);
            CachedResponse = new ResponseMessageType("CachedResponse", 4);
            $VALUES = (new ResponseMessageType[] {
                RequestStarted, RequestSucceeded, RequestFailed, RequestFinished, CachedResponse
            });
        }

        private ResponseMessageType(String s, int i)
        {
            super(s, i);
        }
    }


    private Handler handler;
    private final ResponseMessageType messageTypeValues[] = ResponseMessageType.values();
    private HashMap responseCookies;
    private boolean responseReceived;

    public HttpResponseHandler()
    {
        responseReceived = false;
        responseCookies = new HashMap();
        if (Looper.getMainLooper() != null)
        {
            handler = new Handler(Looper.getMainLooper()) {

                final HttpResponseHandler this$0;

                public void handleMessage(Message message)
                {
                    HttpResponseHandler.this.handleMessage(message);
                }

            
            {
                this$0 = HttpResponseHandler.this;
                super(looper);
            }
            };
        }
    }

    private void sendMessage(Message message)
    {
        if (Thread.currentThread().isInterrupted())
        {
            return;
        }
        if (handler != null)
        {
            handler.sendMessage(message);
            return;
        } else
        {
            handleMessage(message);
            return;
        }
    }

    public HashMap getResponseCookies()
    {
        return responseCookies;
    }

    public abstract void handleCachedResponse(Object obj);

    public abstract void handleFailure(HttpUriRequest httpurirequest, Throwable throwable, Object obj);

    protected void handleMessage(Message message)
    {
        static class _cls2
        {

            static final int $SwitchMap$com$contextlogic$wish$http$HttpResponseHandler$ResponseMessageType[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$http$HttpResponseHandler$ResponseMessageType = new int[ResponseMessageType.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$http$HttpResponseHandler$ResponseMessageType[ResponseMessageType.RequestStarted.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$http$HttpResponseHandler$ResponseMessageType[ResponseMessageType.RequestFailed.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$http$HttpResponseHandler$ResponseMessageType[ResponseMessageType.RequestSucceeded.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$http$HttpResponseHandler$ResponseMessageType[ResponseMessageType.RequestFinished.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$http$HttpResponseHandler$ResponseMessageType[ResponseMessageType.CachedResponse.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.contextlogic.wish.http.HttpResponseHandler.ResponseMessageType[messageTypeValues[message.what].ordinal()];
        JVM INSTR tableswitch 1 5: default 52
    //                   1 53
    //                   2 65
    //                   3 101
    //                   4 131
    //                   5 143;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return;
_L2:
        handleStart((HttpUriRequest)message.obj);
        return;
_L3:
        responseReceived = true;
        message = ((Message) ((Object[])(Object[])message.obj));
        handleFailure((HttpUriRequest)message[0], (Throwable)message[1], message[2]);
        return;
_L4:
        responseReceived = true;
        message = ((Message) ((Object[])(Object[])message.obj));
        handleSuccess((HttpUriRequest)message[0], message[1]);
        return;
_L5:
        if (!responseReceived)
        {
            onCancelled();
            return;
        }
          goto _L1
_L6:
        handleCachedResponse(message.obj);
        return;
    }

    public abstract void handleStart(HttpUriRequest httpurirequest);

    public abstract void handleSuccess(HttpUriRequest httpurirequest, Object obj);

    public boolean hasCachedResponse(String s)
    {
        return false;
    }

    public boolean loadResponseFromCache(String s)
    {
        return false;
    }

    protected Message obtainMessage(ResponseMessageType responsemessagetype, Object obj)
    {
        if (handler != null)
        {
            return handler.obtainMessage(responsemessagetype.ordinal(), obj);
        } else
        {
            Message message = new Message();
            message.what = responsemessagetype.ordinal();
            message.obj = obj;
            return message;
        }
    }

    public void onCancelled()
    {
    }

    public abstract Object preprocessFailure(Throwable throwable, Object obj);

    public abstract Object preprocessSuccess(Object obj);

    public abstract void receiveResponse(HttpUriRequest httpurirequest, HttpResponse httpresponse);

    public void requestFailed(HttpUriRequest httpurirequest, Throwable throwable, Object obj)
    {
        obj = preprocessFailure(throwable, obj);
        sendMessage(obtainMessage(ResponseMessageType.RequestFailed, ((Object) (new Object[] {
            httpurirequest, throwable, obj
        }))));
    }

    public void requestFinished(HttpUriRequest httpurirequest)
    {
        sendMessage(obtainMessage(ResponseMessageType.RequestFinished, httpurirequest));
    }

    public void requestStarted(HttpUriRequest httpurirequest)
    {
        sendMessage(obtainMessage(ResponseMessageType.RequestStarted, httpurirequest));
    }

    public void requestSucceeded(HttpUriRequest httpurirequest, Object obj)
    {
        obj = preprocessSuccess(obj);
        sendMessage(obtainMessage(ResponseMessageType.RequestSucceeded, ((Object) (new Object[] {
            httpurirequest, obj
        }))));
    }

    public void responseLoadedFromCache(Object obj)
    {
        sendMessage(obtainMessage(ResponseMessageType.CachedResponse, obj));
    }

    public void setResponseCookies(HashMap hashmap)
    {
        responseCookies = hashmap;
    }
}
