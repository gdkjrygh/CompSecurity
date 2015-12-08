// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.http;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.contextlogic.wish.http:
//            HttpResponseHandler

class this._cls0 extends Handler
{

    final HttpResponseHandler this$0;

    public void handleMessage(Message message)
    {
        HttpResponseHandler.this.handleMessage(message);
    }

    (Looper looper)
    {
        this$0 = HttpResponseHandler.this;
        super(looper);
    }
}
