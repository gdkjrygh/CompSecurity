// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            gZ, fw

public final class gr extends gZ
{

    private static final String z[];
    private final int c;
    private final int d;
    private final byte e[];
    private final int f;
    private final int g;

    public gr(byte abyte0[], int i, int j, int k, int l, int i1, int j1, 
            boolean flag)
    {
        super(i1, j1);
        if (k + i1 > i || l + j1 > j)
        {
            try
            {
                throw new IllegalArgumentException(z[0]);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        try
        {
            e = abyte0;
            f = i;
            d = j;
            c = k;
            g = l;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        a(i1, j1);
    }

    private void a(int i, int j)
    {
        boolean flag = fw.b;
        byte abyte0[] = e;
        int k = g;
        int l = f;
        k = c + k * l;
        l = 0;
        do
        {
label0:
            {
                if (l < j)
                {
                    int k1 = i / 2;
                    int i1 = (k + i) - 1;
                    int j1 = k;
                    do
                    {
                        if (j1 >= k + k1)
                        {
                            break;
                        }
                        byte byte0 = abyte0[j1];
                        abyte0[j1] = abyte0[i1];
                        abyte0[i1] = byte0;
                        j1++;
                        i1--;
                    } while (!flag);
                    k += f;
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return;
            }
            l++;
        } while (true);
    }

    public byte[] a(int i, byte abyte0[])
    {
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        if (i < d())
        {
            break MISSING_BLOCK_LABEL_45;
        }
        throw new IllegalArgumentException((new StringBuilder()).append(z[1]).append(i).toString());
        abyte0;
        throw abyte0;
label0:
        {
            int j = e();
            if (abyte0 != null)
            {
                int k;
                int l;
                int i1;
                try
                {
                    k = abyte0.length;
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[])
                {
                    throw abyte0;
                }
                if (k >= j)
                {
                    break label0;
                }
            }
            abyte0 = new byte[j];
        }
        k = g;
        l = f;
        i1 = c;
        System.arraycopy(e, (k + i) * l + i1, abyte0, 0, j);
        return abyte0;
    }

    public byte[] c()
    {
        int i;
        int l;
        int i1;
        boolean flag;
        i = 0;
        flag = fw.b;
        l = e();
        i1 = d();
        int j = f;
        IllegalArgumentException illegalargumentexception;
        if (l == j)
        {
            try
            {
                if (i1 == d)
                {
                    return e;
                }
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        break MISSING_BLOCK_LABEL_52;
        illegalargumentexception;
        throw illegalargumentexception;
        Object obj;
        int k;
label0:
        {
            int j1 = l * i1;
            obj = new byte[j1];
            k = g * f + c;
            try
            {
                if (l != f)
                {
                    break label0;
                }
                System.arraycopy(e, k, obj, 0, j1);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return ((byte []) (obj));
        }
        byte abyte0[] = e;
        do
        {
            if (i >= i1)
            {
                break;
            }
            System.arraycopy(abyte0, k, obj, i * l, l);
            k += f;
            i++;
        } while (!flag);
        return ((byte []) (obj));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "Qyld4`n``u|loq4vdfg4|dw4r{\177#c}fcjz4{fbsq2ob`u<";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "@nraqa\177fp4`dt4}a+la`abgq4fcf4}\177jdq.2";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 174;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_174;
_L3:
        byte byte0 = 20;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 18;
          goto _L9
_L5:
        byte0 = 11;
          goto _L9
_L6:
        byte0 = 3;
          goto _L9
        byte0 = 20;
          goto _L9
    }
}
