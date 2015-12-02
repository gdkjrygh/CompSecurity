// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ewj
{

    private final gmg a;
    private final Set b = new HashSet();
    private final Set c = new HashSet();
    private boolean d;
    private boolean e;

    public ewj(gmg gmg1)
    {
        a = gmg1;
    }

    private void b()
    {
        if (d)
        {
            for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ewl)iterator.next()).a()) { }
        } else
        {
            for (Iterator iterator1 = b.iterator(); iterator1.hasNext(); ((ewl)iterator1.next()).b()) { }
        }
    }

    public final void a()
    {
        if (e)
        {
            Iterator iterator = c.iterator();
            while (iterator.hasNext()) 
            {
                ((ewk)iterator.next()).g();
            }
        }
    }

    public final void a(ewk ewk1)
    {
        c.add(ewk1);
    }

    public final void a(ewl ewl1)
    {
        b.add(ewl1);
    }

    public final void a(boolean flag)
    {
        while (!a.a(dbf.bK) || d == flag) 
        {
            return;
        }
        d = flag;
        b();
    }

    public final void b(ewk ewk1)
    {
        c.remove(ewk1);
    }

    public final void b(boolean flag)
    {
        if (flag != e)
        {
            e = flag;
        }
    }
}
