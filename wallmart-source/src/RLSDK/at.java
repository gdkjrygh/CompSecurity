// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            r, y, w, aj, 
//            ak

public class at extends r
{

    private byte a[];
    private int b[];

    public at(w w1)
    {
        super(w1);
        a = null;
        b = null;
    }

    private static int a(int ai[])
        throws y
    {
        int j2 = ai.length;
        int j = 0;
        int i1 = 0;
        int i = 0;
        int j1;
        int k1;
        for (j1 = 0; j < j2; j1 = k1)
        {
            int k = i1;
            if (ai[j] > i1)
            {
                k = ai[j];
                i = j;
            }
            k1 = j1;
            if (ai[j] > j1)
            {
                k1 = ai[j];
            }
            j++;
            i1 = k;
        }

        int l = 0;
        j = 0;
        i1 = 0;
        while (l < j2) 
        {
            int l1 = l - i;
            l1 *= ai[l] * l1;
            if (l1 > i1)
            {
                i1 = l;
                j = l1;
            } else
            {
                int i2 = i1;
                i1 = j;
                j = i2;
            }
            l++;
            l1 = j;
            j = i1;
            i1 = l1;
        }
        if (i > j)
        {
            l1 = j;
            i1 = i;
        } else
        {
            i1 = j;
            l1 = i;
        }
        if (i1 - l1 <= j2 >> 4)
        {
            throw y.a();
        }
        j = i1 - 1;
        l = -1;
        i = i1 - 1;
        while (i > l1) 
        {
            j2 = i - l1;
            j2 = j2 * j2 * (i1 - i) * (j1 - ai[i]);
            if (j2 > l)
            {
                l = i;
                j = j2;
            } else
            {
                j2 = j;
                j = l;
                l = j2;
            }
            i--;
            j2 = l;
            l = j;
            j = j2;
        }
        return j << 3;
    }

    private void a(int i)
    {
        if (a == null || a.length < i)
        {
            a = new byte[i];
        }
        if (b == null)
        {
            b = new int[32];
        } else
        {
            i = 0;
            while (i < 32) 
            {
                b[i] = 0;
                i++;
            }
        }
    }

    public final aj a(int i, aj aj1)
        throws y
    {
        w w1;
        boolean flag;
        int l1;
        flag = true;
        w1 = a();
        l1 = w1.b();
        if (aj1 != null && aj1.b >= l1) goto _L2; else goto _L1
_L1:
        aj aj2 = new aj(l1);
_L4:
        int ai[];
        a(l1);
        aj1 = w1.a(i, a);
        ai = b;
        for (i = 0; i < l1; i++)
        {
            int j = (aj1[i] & 0xff) >> 3;
            ai[j] = ai[j] + 1;
        }

        break MISSING_BLOCK_LABEL_136;
_L2:
        int i1 = aj1.a.length;
        int k = 0;
        do
        {
            aj2 = aj1;
            if (k >= i1)
            {
                break;
            }
            aj1.a[k] = 0;
            k++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        int i2 = a(ai);
        int j1 = aj1[0] & 0xff;
        i = aj1[1] & 0xff;
        for (int l = ((flag) ? 1 : 0); l < l1 - 1;)
        {
            int k1 = aj1[l + 1] & 0xff;
            if ((i << 2) - j1 - k1 >> 1 < i2)
            {
                aj2.b(l);
            }
            l++;
            j1 = i;
            i = k1;
        }

        return aj2;
    }

    public ak b()
        throws y
    {
        w w1 = a();
        int i1 = w1.b();
        int j1 = w1.c();
        ak ak1 = new ak(i1, j1);
        a(i1);
        int ai[] = b;
        for (int i = 1; i < 5; i++)
        {
            byte abyte1[] = w1.a((j1 * i) / 5, a);
            int k1 = (i1 << 2) / 5;
            for (int k = i1 / 5; k < k1; k++)
            {
                int i2 = (abyte1[k] & 0xff) >> 3;
                ai[i2] = ai[i2] + 1;
            }

        }

        int l1 = a(ai);
        byte abyte0[] = w1.a();
        for (int j = 0; j < j1; j++)
        {
            for (int l = 0; l < i1; l++)
            {
                if ((abyte0[j * i1 + l] & 0xff) < l1)
                {
                    ak1.b(l, j);
                }
            }

        }

        return ak1;
    }
}
