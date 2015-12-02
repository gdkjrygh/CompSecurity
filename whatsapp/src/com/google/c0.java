// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

// Referenced classes of package com.google:
//            aQ, aI, d9, a3, 
//            gB

class c0
    implements Iterator
{

    private aI a;
    private final Stack b;

    private c0(a3 a3)
    {
        b = new Stack();
        a = a(a3);
    }

    c0(a3 a3, gB gb)
    {
        this(a3);
    }

    private aI a()
    {
        do
        {
            boolean flag;
            try
            {
                flag = b.isEmpty();
            }
            catch (NoSuchElementException nosuchelementexception)
            {
                throw nosuchelementexception;
            }
            if (flag)
            {
                return null;
            }
            aI ai = a(aQ.a((aQ)b.pop()));
            try
            {
                flag = ai.b();
            }
            catch (NoSuchElementException nosuchelementexception1)
            {
                throw nosuchelementexception1;
            }
        } while (flag);
        return ai;
    }

    private aI a(a3 a3)
    {
        int i = d9.c;
        a3 a3_1;
        do
        {
            a3_1 = a3;
            if (!(a3 instanceof aQ))
            {
                break;
            }
            a3 = (aQ)a3;
            b.push(a3);
            a3_1 = aQ.b(a3);
            a3 = a3_1;
        } while (i == 0);
        return (aI)a3_1;
    }

    public aI b()
    {
        try
        {
            if (a == null)
            {
                throw new NoSuchElementException();
            }
        }
        catch (NoSuchElementException nosuchelementexception)
        {
            throw nosuchelementexception;
        }
        aI ai = a;
        a = a();
        return ai;
    }

    public boolean hasNext()
    {
        aI ai;
        try
        {
            ai = a;
        }
        catch (NoSuchElementException nosuchelementexception)
        {
            throw nosuchelementexception;
        }
        return ai != null;
    }

    public Object next()
    {
        return b();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
