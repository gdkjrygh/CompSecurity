// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

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

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            br

public class bq
{

    private Handler a;

    public bq()
    {
        if (Looper.myLooper() != null)
        {
            a = new br(this);
        }
    }

    protected final Message a(int i, Object obj)
    {
        if (a != null)
        {
            return a.obtainMessage(i, obj);
        } else
        {
            Message message = Message.obtain();
            message.what = i;
            message.obj = obj;
            return message;
        }
    }

    protected final void a()
    {
        b(a(2, null));
    }

    protected void a(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            message = ((Message) ((Object[])message.obj));
            ((Integer)message[0]).intValue();
            a((String)message[1], (String)message[2]);
            return;

        case 1: // '\001'
            message = ((Message) ((Object[])message.obj));
            break;
        }
        a((Throwable)message[0], (String)message[1], (String)message[2]);
    }

    public void a(String s, String s1)
    {
    }

    public void a(Throwable throwable, String s)
    {
    }

    public void a(Throwable throwable, String s, String s1)
    {
        a(throwable, s1);
    }

    protected void a(Throwable throwable, byte abyte0[], String s)
    {
        b(a(1, ((Object) (new Object[] {
            throwable, abyte0, s
        }))));
    }

    void a(HttpResponse httpresponse)
    {
        Object obj2;
        StatusLine statusline;
        obj2 = null;
        statusline = httpresponse.getStatusLine();
        Object obj = httpresponse.getEntity();
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = EntityUtils.toString(new BufferedHttpEntity(((org.apache.http.HttpEntity) (obj))), "UTF-8");
        Header aheader[] = httpresponse.getHeaders("Paypal-Debug-Id");
        Object obj1;
        obj1 = obj2;
        httpresponse = ((HttpResponse) (obj));
        if (aheader == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        obj1 = obj2;
        httpresponse = ((HttpResponse) (obj));
        if (aheader.length <= 0)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        obj1 = aheader[0].getValue();
        httpresponse = ((HttpResponse) (obj));
_L5:
        if (statusline.getStatusCode() >= 300)
        {
            b(new HttpResponseException(statusline.getStatusCode(), statusline.getReasonPhrase()), httpresponse, ((String) (obj1)));
            return;
        } else
        {
            b(a(0, ((Object) (new Object[] {
                Integer.valueOf(statusline.getStatusCode()), httpresponse, obj1
            }))));
            return;
        }
        obj;
        httpresponse = null;
_L3:
        b(((Throwable) (obj)), null, null);
        obj1 = obj2;
        continue; /* Loop/switch isn't completed */
        obj1;
        httpresponse = ((HttpResponse) (obj));
        obj = obj1;
        if (true) goto _L3; else goto _L2
_L2:
        httpresponse = null;
        obj1 = obj2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected final void b()
    {
        b(a(3, null));
    }

    protected final void b(Message message)
    {
        if (a != null)
        {
            a.sendMessage(message);
            return;
        } else
        {
            a(message);
            return;
        }
    }

    protected final void b(Throwable throwable, String s, String s1)
    {
        b(a(1, ((Object) (new Object[] {
            throwable, s, s1
        }))));
    }
}
