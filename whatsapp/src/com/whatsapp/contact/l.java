// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.contact;

import android.text.TextUtils;
import com.whatsapp.dh;
import com.whatsapp.og;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.whatsapp.contact:
//            b, c

class l
{

    private final List a;
    private final List b;
    private final List c;
    private final List d;

    private l()
    {
        d = new ArrayList();
        a = new ArrayList();
        b = new ArrayList();
        c = new ArrayList();
    }

    l(c c1)
    {
        this();
    }

    private void a(Collection collection, Collection collection1)
    {
        boolean flag = b.b;
        collection1 = collection1.iterator();
        do
        {
            if (!collection1.hasNext())
            {
                break;
            }
            og og1 = (og)collection1.next();
            if (og1.z != null && !TextUtils.isEmpty(og1.z.a()))
            {
                collection.add(og1.z.a());
            }
        } while (!flag);
    }

    private void b(Collection collection, Collection collection1)
    {
        boolean flag = b.b;
        collection1 = collection1.iterator();
        do
        {
            if (!collection1.hasNext())
            {
                break;
            }
            og og1 = (og)collection1.next();
            if (og1.t && !TextUtils.isEmpty(og1.a))
            {
                collection.add(og1);
            }
        } while (!flag);
    }

    public List a()
    {
        return b;
    }

    public void a(og og1)
    {
        a.add(og1);
    }

    public ArrayList b()
    {
        boolean flag = b.b;
        ArrayList arraylist = new ArrayList();
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            og og1 = (og)iterator.next();
            if (!TextUtils.isEmpty(og1.a))
            {
                arraylist.add(og1.a);
            }
        } while (!flag);
        return arraylist;
    }

    public void b(og og1)
    {
        c.add(og1);
    }

    public void c(og og1)
    {
        d.add(og1);
    }

    public og[] c()
    {
        ArrayList arraylist = new ArrayList();
        b(arraylist, d);
        return (og[])arraylist.toArray(new og[arraylist.size()]);
    }

    public void d(og og1)
    {
        b.add(og1);
    }

    public boolean d()
    {
        return d.isEmpty() && a.isEmpty() && b.isEmpty();
    }

    public ArrayList e()
    {
        ArrayList arraylist = new ArrayList();
        a(arraylist, d);
        return arraylist;
    }

    public og[] f()
    {
        ArrayList arraylist = new ArrayList();
        b(arraylist, d);
        b(arraylist, a);
        b(arraylist, c);
        return (og[])arraylist.toArray(new og[arraylist.size()]);
    }

    public ArrayList g()
    {
        ArrayList arraylist = new ArrayList();
        a(arraylist, d);
        a(arraylist, a);
        a(arraylist, c);
        return arraylist;
    }

    public List h()
    {
        return c;
    }

    public List i()
    {
        return d;
    }

    public List j()
    {
        return a;
    }
}
