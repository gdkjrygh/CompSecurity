// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package org.whispersystems:
//            al, ac, au, ay

public class bZ
{

    private LinkedList a;
    private al b;
    private boolean c;

    public bZ()
    {
        b = new al();
        a = new LinkedList();
        c = false;
        c = true;
    }

    public bZ(byte abyte0[])
    {
        int i = ac.H;
        super();
        b = new al();
        a = new LinkedList();
        c = false;
        abyte0 = au.a(abyte0);
        b = new al(abyte0.l());
        c = false;
        abyte0 = abyte0.m().iterator();
        do
        {
            if (!abyte0.hasNext())
            {
                break;
            }
            ac ac1 = (ac)abyte0.next();
            a.add(new al(ac1));
        } while (i == 0);
    }

    public void a(al al1)
    {
        a.addFirst(b);
        b = al1;
        if (a.size() > 40)
        {
            a.removeLast();
        }
    }

    public boolean a(int i, byte abyte0[])
    {
        int j = ac.H;
        if (b.b() == i && Arrays.equals(abyte0, b.n()))
        {
            return true;
        }
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            al al1 = (al)iterator.next();
            if (al1.b() == i && Arrays.equals(abyte0, al1.n()))
            {
                return true;
            }
        } while (j == 0);
        return false;
    }

    public byte[] a()
    {
        int i = ac.H;
        LinkedList linkedlist = new LinkedList();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            linkedlist.add(((al)iterator.next()).j());
        } while (i == 0);
        return au.h().a(b.j()).a(linkedlist).h().e();
    }

    public void b()
    {
        a(new al());
    }

    public void b(al al1)
    {
        b = al1;
    }

    public List c()
    {
        return a;
    }

    public boolean d()
    {
        return c;
    }

    public al e()
    {
        return b;
    }
}
