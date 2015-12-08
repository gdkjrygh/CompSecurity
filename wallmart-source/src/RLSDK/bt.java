// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Hashtable;
import java.util.Vector;

// Referenced classes of package RLSDK:
//            bu, q, bo, bp, 
//            by, u, bv, y, 
//            aa, bx, ab, z, 
//            aj

public final class bt extends bu
{

    private final Vector a;

    public bt(Hashtable hashtable)
    {
        if (hashtable == null)
        {
            hashtable = null;
        } else
        {
            hashtable = (Vector)hashtable.get(u.c);
        }
        a = new Vector();
        if (hashtable == null) goto _L2; else goto _L1
_L1:
        if (!hashtable.contains(q.h)) goto _L4; else goto _L3
_L3:
        a.addElement(new bo());
_L6:
        if (hashtable.contains(q.g))
        {
            a.addElement(new bp());
        }
        if (hashtable.contains(q.o))
        {
            a.addElement(new by());
        }
_L2:
        if (a.isEmpty())
        {
            a.addElement(new bo());
            a.addElement(new bp());
            a.addElement(new by());
        }
        return;
_L4:
        if (hashtable.contains(q.n))
        {
            a.addElement(new bv());
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final ab a(int i, aj aj, Hashtable hashtable)
        throws y
    {
        int ai[];
        int j;
        int k;
        ai = bx.a(aj);
        k = a.size();
        j = 0;
_L2:
        Object obj;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (bx)a.elementAt(j);
        obj = ((bx) (obj)).a(i, aj, ai, hashtable);
        if (q.h.equals(((ab) (obj)).c()) && ((ab) (obj)).a().charAt(0) == '0')
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (hashtable == null)
        {
            aj = null;
        } else
        {
            aj = (Vector)hashtable.get(u.c);
        }
        if (aj == null || aj.contains(q.n))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (i != 0 && j != 0)
        {
            return new ab(((ab) (obj)).a().substring(1), null, ((ab) (obj)).b(), q.n);
        } else
        {
            return ((ab) (obj));
        }
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
