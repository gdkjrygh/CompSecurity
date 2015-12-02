// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.Comparator;

// Referenced classes of package com.whatsapp:
//            nb, mk

final class a31
    implements Comparator
{

    a31()
    {
    }

    public int a(nb nb1, nb nb2)
    {
        if (!nb1.a.equals(mk.d()))
        {
            if (nb2.a.equals(mk.d()))
            {
                return 1;
            }
            long l = nb1.b;
            long l1 = nb2.b;
            if (l == l1)
            {
                return nb1.a.compareTo(nb2.a);
            }
            if (l < l1)
            {
                return 1;
            }
        }
        return -1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((nb)obj, (nb)obj1);
    }
}
