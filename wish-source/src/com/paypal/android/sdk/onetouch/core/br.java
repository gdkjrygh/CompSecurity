// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            bq

final class br extends Handler
{

    private bq a;

    br(bq bq1)
    {
        a = bq1;
        super();
    }

    public final void handleMessage(Message message)
    {
        a.a(message);
    }
}
