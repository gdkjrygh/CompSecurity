// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.util.a3;

// Referenced classes of package com.whatsapp:
//            og, App, k, u8, 
//            an

class aty
    implements Runnable
{

    final an a;
    final og b;

    aty(an an, og og1)
    {
        a = an;
        b = og1;
        super();
    }

    public void run()
    {
        b.i = 0L;
        App.az.n(b);
        App.E.b(b.a);
        App.at.b(b.a);
        App.au.ab().post(new u8(this));
    }
}
