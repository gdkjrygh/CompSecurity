// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            App, k

final class h7
    implements Runnable
{

    final String a;
    final boolean b;

    h7(String s, boolean flag)
    {
        a = s;
        b = flag;
        super();
    }

    public void run()
    {
        Object obj = new ArrayList();
        Object obj1 = new ArrayList();
        App.az.e(((ArrayList) (obj1)));
        ArrayList arraylist = App.az.b();
        arraylist.removeAll(((java.util.Collection) (obj1)));
        ((ArrayList) (obj1)).addAll(arraylist);
        App.az.a(((ArrayList) (obj1)));
        obj = App.b(((java.util.List) (obj1)), ((java.util.List) (obj)), true);
        obj1 = a;
        byte byte0;
        if (b)
        {
            byte0 = 8;
        } else
        {
            byte0 = 2;
        }
        App.a(((String) (obj1)), ((java.util.List) (obj)), byte0, b);
    }
}
