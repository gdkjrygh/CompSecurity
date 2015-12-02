// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import com.whatsapp.App;
import com.whatsapp.og;

// Referenced classes of package com.whatsapp.notification:
//            AndroidWear

class s
    implements Runnable
{

    final String a;
    final AndroidWear b;
    final og c;

    s(AndroidWear androidwear, og og, String s1)
    {
        b = androidwear;
        c = og;
        a = s1;
        super();
    }

    public void run()
    {
        App.a(c, a);
        App.a(c, false, true);
        App.a(false, true, true, true);
    }
}
