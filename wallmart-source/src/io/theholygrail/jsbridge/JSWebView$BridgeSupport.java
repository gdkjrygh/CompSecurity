// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.jsbridge;

import android.webkit.ValueCallback;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package io.theholygrail.jsbridge:
//            JSWebView

public class mResultCallback
{

    private ValueCallback mResultCallback;
    private final Lock resultLock = new ReentrantLock();
    final JSWebView this$0;

    protected void expectResult(ValueCallback valuecallback)
    {
        resultLock.lock();
        mResultCallback = valuecallback;
    }

    public void passResult(String s)
    {
        if (mResultCallback != null)
        {
            mResultCallback.onReceiveValue(s);
            resultLock.unlock();
        }
    }

    public ()
    {
        this$0 = JSWebView.this;
        super();
        mResultCallback = null;
    }
}
