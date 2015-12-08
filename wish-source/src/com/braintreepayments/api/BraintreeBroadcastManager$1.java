// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.braintreepayments.api:
//            BraintreeBroadcastManager

class this._cls0 extends Handler
{

    final BraintreeBroadcastManager this$0;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            super.handleMessage(message);
            return;

        case 1: // '\001'
            BraintreeBroadcastManager.access$000(BraintreeBroadcastManager.this);
            break;
        }
    }

    (Looper looper)
    {
        this$0 = BraintreeBroadcastManager.this;
        super(looper);
    }
}
