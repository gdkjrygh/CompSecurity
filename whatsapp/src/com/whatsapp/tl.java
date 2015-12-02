// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.whatsapp:
//            afn, za

class tl extends Handler
{

    final afn a;

    tl(afn afn1)
    {
        a = afn1;
        super();
    }

    public void handleMessage(Message message)
    {
        if (afn.d(a) != null)
        {
            afn.d(a).a();
            sendEmptyMessageDelayed(0, afn.e());
        }
    }
}
