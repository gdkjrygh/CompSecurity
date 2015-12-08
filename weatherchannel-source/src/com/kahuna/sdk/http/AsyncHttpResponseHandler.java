// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk.http;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.util.EntityUtils;

public class AsyncHttpResponseHandler
{

    protected static final int FAILURE_MESSAGE = 1;
    protected static final int FINISH_MESSAGE = 3;
    protected static final int START_MESSAGE = 2;
    protected static final int SUCCESS_MESSAGE = 0;
    private Handler handler;

    public AsyncHttpResponseHandler()
    {
        if (Looper.myLooper() != null)
        {
            handler = new _cls1();
        }
    }

    protected void handleFailureMessage(Throwable throwable, String s)
    {
        onFailure(throwable, s);
    }

    protected void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            message = ((Message) ((Object[])(Object[])message.obj));
            handleSuccessMessage(((Integer)message[0]).intValue(), (Header[])(Header[])message[1], (String)message[2]);
            return;

        case 1: // '\001'
            message = ((Message) ((Object[])(Object[])message.obj));
            handleFailureMessage((Throwable)message[0], (String)message[1]);
            return;

        case 2: // '\002'
            onStart();
            return;

        case 3: // '\003'
            onFinish();
            break;
        }
    }

    protected void handleSuccessMessage(int i, Header aheader[], String s)
    {
        onSuccess(i, aheader, s);
    }

    protected Message obtainMessage(int i, Object obj)
    {
        if (handler != null)
        {
            return handler.obtainMessage(i, obj);
        } else
        {
            Message message = Message.obtain();
            message.what = i;
            message.obj = obj;
            return message;
        }
    }

    public void onFailure(Throwable throwable)
    {
    }

    public void onFailure(Throwable throwable, String s)
    {
        onFailure(throwable);
    }

    public void onFinish()
    {
    }

    public void onStart()
    {
    }

    public void onSuccess(int i, String s)
    {
        onSuccess(s);
    }

    public void onSuccess(int i, Header aheader[], String s)
    {
        onSuccess(i, s);
    }

    public void onSuccess(String s)
    {
    }

    protected void sendFailureMessage(Throwable throwable, String s)
    {
        sendMessage(obtainMessage(1, ((Object) (new Object[] {
            throwable, s
        }))));
    }

    protected void sendFailureMessage(Throwable throwable, byte abyte0[])
    {
        sendMessage(obtainMessage(1, ((Object) (new Object[] {
            throwable, abyte0
        }))));
    }

    protected void sendFinishMessage()
    {
        sendMessage(obtainMessage(3, null));
    }

    protected void sendMessage(Message message)
    {
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

    void sendResponseMessage(HttpResponse httpresponse)
    {
        Object obj1;
        StatusLine statusline;
        statusline = httpresponse.getStatusLine();
        obj1 = null;
        org.apache.http.HttpEntity httpentity = httpresponse.getEntity();
        Object obj;
        obj = obj1;
        if (httpentity == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        obj = new BufferedHttpEntity(httpentity);
        obj = EntityUtils.toString(((org.apache.http.HttpEntity) (obj)), "UTF-8");
_L1:
        if (statusline.getStatusCode() >= 300)
        {
            sendFailureMessage(new HttpResponseException(statusline.getStatusCode(), statusline.getReasonPhrase()), ((String) (obj)));
            return;
        } else
        {
            sendSuccessMessage(statusline.getStatusCode(), httpresponse.getAllHeaders(), ((String) (obj)));
            return;
        }
        obj;
_L2:
        sendFailureMessage(((Throwable) (obj)), (String)null);
        obj = obj1;
          goto _L1
        obj;
          goto _L2
    }

    protected void sendStartMessage()
    {
        sendMessage(obtainMessage(2, null));
    }

    protected void sendSuccessMessage(int i, Header aheader[], String s)
    {
        sendMessage(obtainMessage(0, ((Object) (new Object[] {
            new Integer(i), aheader, s
        }))));
    }

    /* member class not found */
    class _cls1 {}

}
