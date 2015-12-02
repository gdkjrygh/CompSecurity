// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.cr;
import java.util.Comparator;

// Referenced classes of package com.whatsapp:
//            ac

class b5
    implements Comparator
{

    final ac a;
    final double b;
    final double c;

    b5(ac ac, double d, double d1)
    {
        a = ac;
        b = d;
        c = d1;
        super();
    }

    public int a(cr cr1, cr cr2)
    {
        return Double.compare((cr1.e - b) * (cr1.e - b) + (cr1.d - c) * (cr1.d - c), (cr2.e - b) * (cr2.e - b) + (cr2.d - c) * (cr2.d - c));
    }

    public int compare(Object obj, Object obj1)
    {
        return a((cr)obj, (cr)obj1);
    }
}
