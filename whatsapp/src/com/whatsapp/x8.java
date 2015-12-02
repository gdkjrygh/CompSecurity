// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.io.File;
import java.util.Vector;

// Referenced classes of package com.whatsapp:
//            wc, vz, NewGroup, og, 
//            aw

class x8 extends wc
{

    final vz j;

    x8(vz vz1, String s, String s1, Vector vector, int i)
    {
        j = vz1;
        super(s, s1, vector, i);
    }

    public void a(String s)
    {
        if (NewGroup.b(j.a).c().exists())
        {
            j.a.runOnUiThread(new aw(this, s));
        }
        super.a(s);
    }
}
