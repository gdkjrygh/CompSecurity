// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder.a;

import com.google.zxing.ChecksumException;

// Referenced classes of package com.google.zxing.pdf417.decoder.a:
//            b, c

public final class a
{

    private final b a;

    public a()
    {
        a = b.a;
    }

    public final int a(int ai[], int i, int ai1[])
    {
        Object obj = new c(a, ai);
        int ai2[] = new int[i];
        boolean flag = false;
        for (int j = i; j > 0; j--)
        {
            int k2 = ((c) (obj)).b(a.a(j));
            ai2[i - j] = k2;
            if (k2 != 0)
            {
                flag = true;
            }
        }

        if (!flag)
        {
            return 0;
        }
        obj = a.b();
        int k1 = ai1.length;
        for (int k = 0; k < k1; k++)
        {
            int l2 = ai1[k];
            l2 = a.a(ai.length - 1 - l2);
            obj = ((c) (obj)).c(new c(a, new int[] {
                a.c(0, l2), 1
            }));
        }

        ai1 = new c(a, ai2);
        Object obj1 = a.a(i, 1);
        Object obj2;
        int ai3[];
        int ai4[];
        int i1;
        int j3;
        if (((c) (obj1)).a() < ai1.a())
        {
            obj = ai1;
            ai1 = ((int []) (obj1));
        } else
        {
            obj = obj1;
        }
        obj2 = a.a();
        obj1 = a.b();
        ai4 = ai1;
        ai1 = ((int []) (obj1));
        Object obj3;
        for (obj1 = ai4; ((c) (obj1)).a() >= i / 2; obj1 = obj3)
        {
            if (((c) (obj1)).b())
            {
                throw ChecksumException.getChecksumInstance();
            }
            obj3 = a.a();
            int l = ((c) (obj1)).a(((c) (obj1)).a());
            l = a.c(l);
            int l1;
            int i3;
            for (; ((c) (obj)).a() >= ((c) (obj1)).a() && !((c) (obj)).b(); obj = ((c) (obj)).b(((c) (obj1)).a(l1, i3)))
            {
                l1 = ((c) (obj)).a() - ((c) (obj1)).a();
                i3 = a.d(((c) (obj)).a(((c) (obj)).a()), l);
                obj3 = ((c) (obj3)).a(a.a(l1, i3));
            }

            obj3 = ((c) (obj3)).c(ai1).b(((c) (obj2))).c();
            obj2 = ai1;
            ai1 = ((int []) (obj3));
            obj3 = obj;
            obj = obj1;
        }

        i = ai1.a(0);
        if (i == 0)
        {
            throw ChecksumException.getChecksumInstance();
        }
        i = a.c(i);
        ai1 = ai1.c(i);
        obj1 = ((c) (obj1)).c(i);
        obj = new c[2];
        obj[0] = ai1;
        obj[1] = ((c) (obj1));
        obj1 = obj[0];
        ai1 = obj[1];
        j3 = ((c) (obj1)).a();
        obj = new int[j3];
        i1 = 0;
        int i2;
        for (i = 1; i < a.c() && i1 < j3; i1 = i2)
        {
            i2 = i1;
            if (((c) (obj1)).b(i) == 0)
            {
                obj[i1] = a.c(i);
                i2 = i1 + 1;
            }
            i++;
        }

        if (i1 != j3)
        {
            throw ChecksumException.getChecksumInstance();
        }
        i1 = ((c) (obj1)).a();
        ai3 = new int[i1];
        for (i = 1; i <= i1; i++)
        {
            ai3[i1 - i] = a.d(i, ((c) (obj1)).a(i));
        }

        obj1 = new c(a, ai3);
        i1 = obj.length;
        ai3 = new int[i1];
        for (i = 0; i < i1; i++)
        {
            int k3 = a.c(obj[i]);
            int j2 = a.c(0, ai1.b(k3));
            k3 = a.c(((c) (obj1)).b(k3));
            ai3[i] = a.d(j2, k3);
        }

        for (i = 0; i < obj.length; i++)
        {
            int j1 = ai.length - 1 - a.b(obj[i]);
            if (j1 < 0)
            {
                throw ChecksumException.getChecksumInstance();
            }
            ai[j1] = a.c(ai[j1], ai3[i]);
        }

        return obj.length;
    }
}
