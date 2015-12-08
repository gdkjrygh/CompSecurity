// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Hashtable;

// Referenced classes of package RLSDK:
//            bx, bo, v, ab, 
//            q, y, t, aj, 
//            s

public final class bv extends bx
{

    private final bx a = new bo();

    public bv()
    {
    }

    private static ab a(ab ab1)
        throws v
    {
        String s = ab1.a();
        if (s.charAt(0) == '0')
        {
            return new ab(s.substring(1), null, ab1.b(), q.n);
        } else
        {
            throw v.a();
        }
    }

    protected final int a(aj aj, int ai[], StringBuffer stringbuffer)
        throws y
    {
        return a.a(aj, ai, stringbuffer);
    }

    public final ab a(int i, aj aj, Hashtable hashtable)
        throws y, v, t
    {
        return a(a.a(i, aj, hashtable));
    }

    public final ab a(int i, aj aj, int ai[], Hashtable hashtable)
        throws y, v, t
    {
        return a(a.a(i, aj, ai, hashtable));
    }

    public final ab a(s s, Hashtable hashtable)
        throws y, v
    {
        return a(a.a(s, hashtable));
    }

    final q b()
    {
        return q.n;
    }
}
