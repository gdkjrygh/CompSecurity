// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.fieldstats.j;
import com.whatsapp.fieldstats.z;
import java.util.Vector;

// Referenced classes of package com.whatsapp:
//            x8, App, NewGroup

class vz
    implements Runnable
{

    final NewGroup a;
    final String b;
    final String c;
    final Vector d;

    vz(NewGroup newgroup, String s, String s1, Vector vector)
    {
        a = newgroup;
        b = s;
        c = s1;
        d = vector;
        super();
    }

    public void run()
    {
        try
        {
            Thread.sleep(300L);
            App.g(new x8(this, b, c, d, 12));
            z.a(App.au, j.GROUP_CREATE_C, Integer.valueOf(1));
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}
