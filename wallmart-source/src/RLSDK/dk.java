// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Hashtable;

// Referenced classes of package RLSDK:
//            bb, az, v, t, 
//            bc, dg, dm, dh, 
//            dj, ak, ap

public final class dk
{

    private final bb a;

    public dk()
    {
        a = new bb(az.e);
    }

    public final ap a(ak ak, Hashtable hashtable)
        throws v, t
    {
        dg dg1 = new dg(ak);
        ak = dg1.b();
        dl dl = dg1.a().a();
        dh adh[] = dh.a(dg1.c(), ak, dl);
        int i = 0;
        int j = 0;
        for (; i < adh.length; i++)
        {
            j += adh[i].a();
        }

        byte abyte0[] = new byte[j];
        i = 0;
        j = 0;
        for (; i < adh.length; i++)
        {
            dh dh1 = adh[i];
            byte abyte1[] = dh1.b();
            int j1 = dh1.a();
            int k1 = abyte1.length;
            int ai[] = new int[k1];
            for (int k = 0; k < k1; k++)
            {
                ai[k] = abyte1[k] & 0xff;
            }

            int l = abyte1.length;
            try
            {
                a.a(ai, l - j1);
            }
            // Misplaced declaration of an exception variable
            catch (ak ak)
            {
                throw t.a();
            }
            for (l = 0; l < j1; l++)
            {
                abyte1[l] = (byte)ai[l];
            }

            for (int i1 = 0; i1 < j1;)
            {
                abyte0[j] = abyte1[i1];
                i1++;
                j++;
            }

        }

        return dj.a(abyte0, ak, dl, hashtable);
    }
}
