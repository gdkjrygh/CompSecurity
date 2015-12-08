// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Hashtable;

// Referenced classes of package RLSDK:
//            z, ad, bh, y, 
//            t, v, u, s, 
//            ak, ab, ap, q, 
//            ac, bj, ar

public final class bd
    implements z
{

    private static final ad a[] = new ad[0];
    private final bh b = new bh();

    public bd()
    {
    }

    public final ab a(s s1, Hashtable hashtable)
        throws y, t, v
    {
        if (hashtable != null && hashtable.containsKey(u.b))
        {
            s1 = s1.c();
            hashtable = s1.a();
            int ai[] = s1.b();
            if (hashtable == null || ai == null)
            {
                throw y.a();
            }
            int k = ((ak) (s1)).a;
            int i = hashtable[0];
            for (int i1 = hashtable[1]; i < k && s1.a(i, i1); i++) { }
            if (i == k)
            {
                throw y.a();
            }
            int j1 = i - hashtable[0];
            if (j1 == 0)
            {
                throw y.a();
            }
            int k1 = hashtable[1];
            i = ai[1];
            int l1 = hashtable[0];
            int i2 = ((ai[0] - l1) + 1) / j1;
            int j2 = ((i - k1) + 1) / j1;
            if (i2 == 0 || j2 == 0)
            {
                throw y.a();
            }
            int k2 = j1 >> 1;
            hashtable = new ak(i2, j2);
            for (int j = 0; j < j2; j++)
            {
                for (int l = 0; l < i2; l++)
                {
                    if (s1.a(l * j1 + (k2 + l1), k1 + k2 + j * j1))
                    {
                        hashtable.b(l, j);
                    }
                }

            }

            s1 = b.a(hashtable);
            hashtable = a;
        } else
        {
            hashtable = (new bj(s1.c())).a();
            s1 = b.a(hashtable.d());
            hashtable = hashtable.e();
        }
        hashtable = new ab(s1.b(), s1.a(), hashtable, q.f);
        if (s1.c() != null)
        {
            hashtable.a(ac.c, s1.c());
        }
        if (s1.d() != null)
        {
            hashtable.a(ac.d, s1.d().toString());
        }
        return hashtable;
    }

    public final void a()
    {
    }

}
