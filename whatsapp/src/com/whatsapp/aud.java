// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.fieldstats.m;
import java.util.HashMap;
import java.util.TimerTask;

// Referenced classes of package com.whatsapp:
//            a9g

class aud extends TimerTask
{

    final a9g a;

    public aud(a9g a9g1)
    {
        a = a9g1;
        super();
    }

    public void run()
    {
        if (a9g.a(a))
        {
            return;
        }
        a.k = true;
        a9g.a().remove(a9g.b(a).toString());
        if (!a.m)
        {
            a9g.g.obtainMessage(2, a.a).sendToTarget();
        }
        a9g.a(a, m.TIMEOUT);
    }
}
