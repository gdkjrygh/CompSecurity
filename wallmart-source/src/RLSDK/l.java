// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            w

public final class l extends w
{

    private final byte a[];
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public l(byte abyte0[], int i, int j, int k, int i1, int j1, int k1)
    {
        super(j1, k1);
        if (k + j1 > i || i1 + k1 > j)
        {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        } else
        {
            a = abyte0;
            b = i;
            c = j;
            d = k;
            e = i1;
            return;
        }
    }

    public final byte[] a()
    {
        int i;
        int k;
        int i1;
        i = 0;
        k = b();
        i1 = c();
        if (k != b || i1 != c) goto _L2; else goto _L1
_L1:
        byte abyte0[] = a;
_L4:
        return abyte0;
_L2:
        int j1 = k * i1;
        byte abyte1[] = new byte[j1];
        int j = e * b + d;
        if (k == b)
        {
            System.arraycopy(a, j, abyte1, 0, j1);
            return abyte1;
        }
        byte abyte2[] = a;
        do
        {
            abyte0 = abyte1;
            if (i >= i1)
            {
                continue;
            }
            System.arraycopy(abyte2, j, abyte1, i * k, k);
            j += b;
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final byte[] a(int i, byte abyte0[])
    {
        byte abyte1[];
        int j;
label0:
        {
            if (i < 0 || i >= c())
            {
                throw new IllegalArgumentException((new StringBuilder("Requested row is outside the image: ")).append(i).toString());
            }
            j = b();
            if (abyte0 != null)
            {
                abyte1 = abyte0;
                if (abyte0.length >= j)
                {
                    break label0;
                }
            }
            abyte1 = new byte[j];
        }
        int k = e;
        int i1 = b;
        int j1 = d;
        System.arraycopy(a, (k + i) * i1 + j1, abyte1, 0, j);
        return abyte1;
    }
}
