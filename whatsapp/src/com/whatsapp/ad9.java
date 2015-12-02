// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            adk, td, App, k, 
//            oh

class ad9 extends adk
{

    final td a;

    ad9(td td1)
    {
        a = td1;
        super();
    }

    public void b(c4 c4_1, int i)
    {
        if (c4_1.w == 0 && c4_1.M == 6 && td.g(a).equals(c4_1.y.a) && App.az.f().a.equals(c4_1.G) && (c4_1.t == 5L || c4_1.t == 7L))
        {
            com.whatsapp.td.a(a).finish();
        }
    }
}
