// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class hru
    implements hrt
{

    private final List a = new ArrayList();

    public hru()
    {
    }

    public final Object a(Object obj)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            Object obj1 = ((hrt)iterator.next()).a(obj);
            if (obj1 != null)
            {
                return obj1;
            }
        }

        return null;
    }

    public final void a(hrt hrt1)
    {
        a.add(hrt1);
    }
}
