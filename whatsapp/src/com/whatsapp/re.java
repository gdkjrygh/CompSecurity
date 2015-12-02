// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.HashMap;

// Referenced classes of package com.whatsapp:
//            f6, aoz, q7, App

class re
    implements Runnable
{

    final f6 a;
    final HashMap b;

    re(f6 f6_1, HashMap hashmap)
    {
        a = f6_1;
        b = hashmap;
        super();
    }

    public void run()
    {
        aoz.c(a.b).a(a.a, b);
        App.S();
    }
}
