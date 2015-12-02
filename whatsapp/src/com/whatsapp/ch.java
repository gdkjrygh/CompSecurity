// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;

// Referenced classes of package com.whatsapp:
//            e5, App, tt, p3

class ch
    implements Runnable
{

    final e5 a;

    ch(e5 e5_1)
    {
        a = e5_1;
        super();
    }

    public void run()
    {
        e5.a(a).aq.d();
        e5.a(a).ab().post(new p3(this));
    }
}
