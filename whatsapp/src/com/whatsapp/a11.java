// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.whatsapp:
//            y6

class a11 extends Handler
{

    final y6 a;

    a11(y6 y6)
    {
        a = y6;
        super();
    }

    public void handleMessage(Message message)
    {
        sendMessage(obtainMessage());
    }
}
