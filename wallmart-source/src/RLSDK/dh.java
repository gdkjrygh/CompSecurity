// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            do, dl

final class dh
{

    private final int a;
    private final byte b[];

    private dh(int i, byte abyte0[])
    {
        a = i;
        b = abyte0;
    }

    static dh[] a(byte abyte0[], do do1, dl dl)
    {
        if (abyte0.length != do1.c())
        {
            throw new IllegalArgumentException();
        }
        do1 = do1.a(dl);
        dl = do1.b();
        int i = 0;
        int k = 0;
        for (; i < dl.length; i++)
        {
            k += dl[i].a();
        }

        dh adh[] = new dh[k];
        i = 0;
        int l = 0;
        for (; i < dl.length; i++)
        {
            do.a a1 = dl[i];
            for (k = 0; k < a1.a();)
            {
                int i1 = a1.b();
                adh[l] = new dh(i1, new byte[do1.a() + i1]);
                k++;
                l++;
            }

        }

        k = adh[0].b.length;
        for (i = adh.length - 1; i >= 0 && adh[i].b.length != k; i--) { }
        int k2 = i + 1;
        int i2 = k - do1.a();
        k = 0;
        i = 0;
        for (; k < i2; k++)
        {
            for (int j1 = 0; j1 < l;)
            {
                adh[j1].b[k] = abyte0[i];
                j1++;
                i++;
            }

        }

        int k1 = k2;
        for (k = i; k1 < l; k++)
        {
            adh[k1].b[i2] = abyte0[k];
            k1++;
        }

        int l2 = adh[0].b.length;
        for (int j = i2; j < l2; j++)
        {
            int l1 = 0;
            while (l1 < l) 
            {
                int j2;
                if (l1 < k2)
                {
                    j2 = j;
                } else
                {
                    j2 = j + 1;
                }
                adh[l1].b[j2] = abyte0[k];
                k++;
                l1++;
            }
        }

        return adh;
    }

    final int a()
    {
        return a;
    }

    final byte[] b()
    {
        return b;
    }
}
