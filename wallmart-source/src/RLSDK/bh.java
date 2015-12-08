// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            bb, az, v, t, 
//            bc, be, bf, bg, 
//            ak, ap

public final class bh
{

    private final bb a;

    public bh()
    {
        a = new bb(az.f);
    }

    public final ap a(ak ak)
        throws v, t
    {
        ak = new be(ak);
        bi bi = ak.a();
        ak = bf.a(ak.b(), bi);
        int k1 = ak.length;
        int i = 0;
        int k = 0;
        for (; i < k1; i++)
        {
            k += ak[i].a();
        }

        byte abyte0[] = new byte[k];
        for (int j = 0; j < k1; j++)
        {
            bf bf1 = ak[j];
            byte abyte1[] = bf1.b();
            int l1 = bf1.a();
            int i2 = abyte1.length;
            int ai[] = new int[i2];
            for (int l = 0; l < i2; l++)
            {
                ai[l] = abyte1[l] & 0xff;
            }

            int i1 = abyte1.length;
            try
            {
                a.a(ai, i1 - l1);
            }
            // Misplaced declaration of an exception variable
            catch (ak ak)
            {
                throw t.a();
            }
            for (i1 = 0; i1 < l1; i1++)
            {
                abyte1[i1] = (byte)ai[i1];
            }

            for (int j1 = 0; j1 < l1; j1++)
            {
                abyte0[j1 * k1 + j] = abyte1[j1];
            }

        }

        return bg.a(abyte0);
    }
}
