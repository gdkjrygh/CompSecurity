// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Hashtable;
import java.util.Vector;

// Referenced classes of package RLSDK:
//            z, y, aa, u, 
//            q, bs, df, bd, 
//            ag, da, s, ab

public final class x
    implements z
{

    private Hashtable a;
    private Vector b;

    public x()
    {
    }

    private ab b(s s)
        throws y
    {
        int i;
        int j;
        j = b.size();
        i = 0;
_L2:
        Object obj;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (z)b.elementAt(i);
        obj = ((z) (obj)).a(s, a);
        return ((ab) (obj));
        aa aa1;
        aa1;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        throw y.a();
    }

    public final ab a(s s)
        throws y
    {
        if (b == null)
        {
            a(((Hashtable) (null)));
        }
        return b(s);
    }

    public final ab a(s s, Hashtable hashtable)
        throws y
    {
        a(hashtable);
        return b(s);
    }

    public final void a()
    {
        int j = b.size();
        for (int i = 0; i < j; i++)
        {
            ((z)b.elementAt(i)).a();
        }

    }

    public final void a(Hashtable hashtable)
    {
        boolean flag1 = false;
        a = hashtable;
        Vector vector;
        boolean flag;
        if (hashtable != null && hashtable.containsKey(u.d))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (hashtable == null)
        {
            vector = null;
        } else
        {
            vector = (Vector)hashtable.get(u.c);
        }
        b = new Vector();
        if (vector != null)
        {
            if (vector.contains(q.n) || vector.contains(q.o) || vector.contains(q.h) || vector.contains(q.g) || vector.contains(q.b) || vector.contains(q.c) || vector.contains(q.d) || vector.contains(q.e) || vector.contains(q.i) || vector.contains(q.l) || vector.contains(q.m))
            {
                flag1 = true;
            }
            if (flag1 && !flag)
            {
                b.addElement(new bs(hashtable));
            }
            if (vector.contains(q.k))
            {
                b.addElement(new df());
            }
            if (vector.contains(q.f))
            {
                b.addElement(new bd());
            }
            if (vector.contains(q.a))
            {
                b.addElement(new ag());
            }
            if (vector.contains(q.j))
            {
                b.addElement(new da());
            }
            if (flag1 && flag)
            {
                b.addElement(new bs(hashtable));
            }
        }
    }
}
