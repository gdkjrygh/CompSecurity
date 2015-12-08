// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Hashtable;

// Referenced classes of package RLSDK:
//            z, ad, dd, y, 
//            v, u, s, ak, 
//            ab, ap, q, de, 
//            ar

public final class da
    implements z
{

    private static final ad a[] = new ad[0];
    private final dd b = new dd();

    public da()
    {
    }

    public final ab a(s s1, Hashtable hashtable)
        throws y, v
    {
        boolean flag1 = true;
        if (hashtable != null && hashtable.containsKey(u.b))
        {
            s1 = s1.c();
            hashtable = s1.a();
            int ai[] = s1.b();
            if (hashtable == null || ai == null)
            {
                throw y.a();
            }
            int i = hashtable[0];
            int l = hashtable[1];
            int i1;
            for (i1 = ((ak) (s1)).a; i < i1 && s1.a(i, l); i++) { }
            if (i == i1)
            {
                throw y.a();
            }
            int l1 = i - hashtable[0] >>> 3;
            if (l1 == 0)
            {
                throw y.a();
            }
            int i2 = hashtable[1];
            int j2 = ai[1];
            l = hashtable[0];
            int k1 = ((ak) (s1)).a;
            boolean flag = true;
            for (i = 0; l < k1 - 1 && i < 8; l = i1)
            {
                i1 = l + 1;
                boolean flag3 = s1.a(i1, i2);
                l = i;
                if (flag != flag3)
                {
                    l = i + 1;
                }
                flag = flag3;
                i = l;
            }

            if (l == k1 - 1)
            {
                throw y.a();
            }
            int k2 = hashtable[0];
            for (i = ((ak) (s1)).a - 1; i > k2 && !s1.a(i, i2); i--) { }
            k1 = 0;
            i1 = i;
            flag = flag1;
            for (int j = k1; i1 > k2 && j < 9; i1 = k1)
            {
                k1 = i1 - 1;
                boolean flag2 = s1.a(k1, i2);
                i1 = j;
                if (flag != flag2)
                {
                    i1 = j + 1;
                }
                flag = flag2;
                j = i1;
            }

            if (i1 == k2)
            {
                throw y.a();
            }
            k1 = ((i1 - l) + 1) / l1;
            j2 = ((j2 - i2) + 1) / l1;
            if (k1 == 0 || j2 == 0)
            {
                throw y.a();
            }
            k2 = l1 >> 1;
            hashtable = new ak(k1, j2);
            for (int k = 0; k < j2; k++)
            {
                for (int j1 = 0; j1 < k1; j1++)
                {
                    if (s1.a(j1 * l1 + (l + k2), i2 + k2 + k * l1))
                    {
                        hashtable.b(j1, k);
                    }
                }

            }

            s1 = b;
            hashtable = dd.a(hashtable);
            s1 = a;
        } else
        {
            s1 = (new de(s1)).a();
            hashtable = b;
            hashtable = dd.a(s1.d());
            s1 = s1.e();
        }
        return new ab(hashtable.b(), hashtable.a(), s1, q.j);
    }

    public final void a()
    {
    }

}
