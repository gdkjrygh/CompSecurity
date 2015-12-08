// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import java.util.ArrayList;

// Referenced classes of package com.a.a:
//            b

public abstract class a
    implements Cloneable
{

    ArrayList a;

    public a()
    {
        a = null;
    }

    public abstract a a(long l);

    public void a()
    {
    }

    public void a(b b1)
    {
        if (a == null)
        {
            a = new ArrayList();
        }
        a.add(b1);
    }

    public void a(Object obj)
    {
    }

    public void b()
    {
    }

    public void b(b b1)
    {
        if (a != null)
        {
            a.remove(b1);
            if (a.size() == 0)
            {
                a = null;
                return;
            }
        }
    }

    public void c()
    {
    }

    public Object clone()
    {
        return g();
    }

    public abstract boolean d();

    public boolean e()
    {
        return d();
    }

    public ArrayList f()
    {
        return a;
    }

    public a g()
    {
        Object obj;
        ArrayList arraylist;
        int j;
        obj = (a)super.clone();
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        arraylist = a;
        obj.a = new ArrayList();
        j = arraylist.size();
        int i = 0;
        while (i < j) 
        {
            try
            {
                ((a) (obj)).a.add(arraylist.get(i));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new AssertionError();
            }
            i++;
        }
        return ((a) (obj));
    }
}
