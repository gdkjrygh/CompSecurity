// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Hashtable;
import java.util.Vector;

// Referenced classes of package RLSDK:
//            bu, u, q, bt, 
//            bm, bn, bl, br, 
//            bk, cd, cg, y, 
//            aa, z, aj, ab

public final class bs extends bu
{

    private final Vector a = new Vector();

    public bs(Hashtable hashtable)
    {
        Vector vector;
        boolean flag;
        if (hashtable == null)
        {
            vector = null;
        } else
        {
            vector = (Vector)hashtable.get(u.c);
        }
        if (hashtable != null && hashtable.get(u.g) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (vector != null)
        {
            if (vector.contains(q.h) || vector.contains(q.n) || vector.contains(q.g) || vector.contains(q.o))
            {
                a.addElement(new bt(hashtable));
            }
            if (vector.contains(q.c))
            {
                a.addElement(new bm(flag));
            }
            if (vector.contains(q.d))
            {
                a.addElement(new bn());
            }
            if (vector.contains(q.e))
            {
                a.addElement(new bl());
            }
            if (vector.contains(q.i))
            {
                a.addElement(new br());
            }
            if (vector.contains(q.b))
            {
                a.addElement(new bk());
            }
            if (vector.contains(q.l))
            {
                a.addElement(new cd());
            }
            if (vector.contains(q.m))
            {
                a.addElement(new cg());
            }
        }
        if (a.isEmpty())
        {
            a.addElement(new bt(hashtable));
            a.addElement(new bm());
            a.addElement(new bn());
            a.addElement(new bl());
            a.addElement(new br());
            a.addElement(new cd());
            a.addElement(new cg());
        }
    }

    public final ab a(int i, aj aj, Hashtable hashtable)
        throws y
    {
        int j;
        int k;
        k = a.size();
        j = 0;
_L2:
        Object obj;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (bu)a.elementAt(j);
        obj = ((bu) (obj)).a(i, aj, hashtable);
        return ((ab) (obj));
        aa aa1;
        aa1;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        throw y.a();
    }

    public final void a()
    {
        int j = a.size();
        for (int i = 0; i < j; i++)
        {
            ((z)a.elementAt(i)).a();
        }

    }
}
