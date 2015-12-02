// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org;

import java.io.Serializable;
import java.util.EventListener;
import java.util.Iterator;

// Referenced classes of package org:
//            P, U, z, y

public class C
    implements Serializable
{

    private static final long serialVersionUID = 0x90bb6eeebac35896L;
    private final P a = new P();
    private final Object b;

    public C(Object obj)
    {
        b = obj;
    }

    public int a()
    {
        return a.a();
    }

    public void a(int i, String s)
    {
        int j = U.b;
        s = new z(b, i, s);
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((y)(EventListener)iterator.next()).b(s);
        } while (j == 0);
    }

    public void a(String s, String s1)
    {
        int i = U.b;
        s = new z(b, s, s1);
        s1 = a.iterator();
        do
        {
            if (!s1.hasNext())
            {
                break;
            }
            ((y)(EventListener)s1.next()).a(s);
        } while (i == 0);
    }

    public void a(y y1)
    {
        a.a(y1);
    }

    public void b(y y1)
    {
        a.b(y1);
    }
}
