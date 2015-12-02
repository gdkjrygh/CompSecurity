// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;

// Referenced classes of package com.whatsapp:
//            tr, og, al

class tm extends tr
{

    final al b;

    tm(al al, Context context)
    {
        b = al;
        super(context);
    }

    public int a(og og1, og og2)
    {
        if (og1.t && !og2.t)
        {
            return -1;
        }
        if (!og1.t && og2.t)
        {
            return 1;
        } else
        {
            return super.a(og1, og2);
        }
    }

    public int compare(Object obj, Object obj1)
    {
        return a((og)obj, (og)obj1);
    }
}
