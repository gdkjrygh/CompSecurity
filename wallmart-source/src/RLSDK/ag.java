// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Hashtable;

// Referenced classes of package RLSDK:
//            z, y, v, ai, 
//            s, af, u, ae, 
//            ah, ab, ap, q, 
//            ac

public final class ag
    implements z
{

    public ag()
    {
    }

    public final ab a(s s1, Hashtable hashtable)
        throws y, v
    {
        af af1 = (new ai(s1.c())).a();
        s1 = af1.e();
        if (hashtable != null && af1.e() != null)
        {
            hashtable = (ae)hashtable.get(u.h);
            if (hashtable != null)
            {
                for (int i = 0; i < af1.e().length; i++)
                {
                    hashtable.a(af1.e()[i]);
                }

            }
        }
        hashtable = (new ah()).a(af1);
        s1 = new ab(hashtable.b(), hashtable.a(), s1, q.a);
        if (hashtable.c() != null)
        {
            s1.a(ac.c, hashtable.c());
        }
        if (hashtable.d() != null)
        {
            s1.a(ac.d, hashtable.d().toString());
        }
        return s1;
    }

    public final void a()
    {
    }
}
