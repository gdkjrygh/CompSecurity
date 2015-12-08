// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Hashtable;

// Referenced classes of package RLSDK:
//            z, ad, dk, y, 
//            t, v, u, s, 
//            ak, ab, ap, q, 
//            ac, dr, ar

public final class df
    implements z
{

    private static final ad a[] = new ad[0];
    private final dk b = new dk();

    public df()
    {
    }

    public final ab a(s s1, Hashtable hashtable)
        throws y, t, v
    {
        if (hashtable != null && hashtable.containsKey(u.b))
        {
            s1 = s1.c();
            int ai[] = s1.a();
            int ai1[] = s1.b();
            if (ai == null || ai1 == null)
            {
                throw y.a();
            }
            int i1 = ((ak) (s1)).b;
            int j1 = ((ak) (s1)).a;
            int k = ai[0];
            int i;
            for (i = ai[1]; k < j1 && i < i1 && s1.a(k, i); i++)
            {
                k++;
            }

            if (k == j1 || i == i1)
            {
                throw y.a();
            }
            i1 = k - ai[0];
            if (i1 == 0)
            {
                throw y.a();
            }
            j1 = ai[1];
            i = ai1[1];
            int k1 = ai[0];
            int l1 = ((ai1[0] - k1) + 1) / i1;
            int i2 = ((i - j1) + 1) / i1;
            if (l1 == 0 || i2 == 0)
            {
                throw y.a();
            }
            if (i2 != l1)
            {
                throw y.a();
            }
            int j2 = i1 >> 1;
            ak ak1 = new ak(l1, i2);
            for (int j = 0; j < i2; j++)
            {
                for (int l = 0; l < l1; l++)
                {
                    if (s1.a(l * i1 + (k1 + j2), j1 + j2 + j * i1))
                    {
                        ak1.b(l, j);
                    }
                }

            }

            s1 = b.a(ak1, hashtable);
            hashtable = a;
        } else
        {
            ar ar1 = (new dr(s1.c())).a(hashtable);
            s1 = b.a(ar1.d(), hashtable);
            hashtable = ar1.e();
        }
        hashtable = new ab(s1.b(), s1.a(), hashtable, q.k);
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
