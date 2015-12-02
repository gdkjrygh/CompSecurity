// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            App, k, og

final class auv
    implements Runnable
{

    final og a;

    auv(og og)
    {
        a = og;
        super();
    }

    public void run()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(a);
        App.az.c(arraylist);
    }
}
