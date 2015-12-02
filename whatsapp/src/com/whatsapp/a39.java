// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.HashMap;

// Referenced classes of package com.whatsapp:
//            aoz

class a39
    implements Runnable
{

    final Runnable a;
    final int b;
    final aoz c;

    a39(aoz aoz1, int i, Runnable runnable)
    {
        c = aoz1;
        b = i;
        a = runnable;
        super();
    }

    public void run()
    {
        if (aoz.i(c).size() == b && a != null)
        {
            a.run();
        }
    }
}
