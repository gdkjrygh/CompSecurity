// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;

// Referenced classes of package com.whatsapp:
//            vj, hm

class abp
    implements Runnable
{

    final vj a;
    final boolean b;
    final boolean c;

    abp(vj vj1, boolean flag, boolean flag1)
    {
        a = vj1;
        c = flag;
        b = flag1;
        super();
    }

    public void run()
    {
        vj.a(a).runOnUiThread(new hm(this));
    }
}
