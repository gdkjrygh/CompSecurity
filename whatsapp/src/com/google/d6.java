// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Arrays;

// Referenced classes of package com.google:
//            bQ

public final class d6
    implements Cloneable
{

    private static final String z[];
    private final int a;
    private final int b;
    private final int c;
    private final int d[];

    public d6(int i)
    {
        this(i, i);
    }

    public d6(int i, int j)
    {
        if (i < 1 || j < 1)
        {
            try
            {
                throw new IllegalArgumentException(z[3]);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        } else
        {
            c = i;
            b = j;
            a = (i + 31) / 32;
            d = new int[a * j];
            return;
        }
    }

    private d6(int i, int j, int k, int ai[])
    {
        c = i;
        b = j;
        a = k;
        d = ai;
    }

    public bQ a(int i, bQ bq)
    {
label0:
        {
label1:
            {
                boolean flag = bQ.a;
                if (bq != null)
                {
                    bQ bq1;
                    int j;
                    int k;
                    try
                    {
                        j = bq.b();
                        k = c;
                    }
                    // Misplaced declaration of an exception variable
                    catch (bQ bq)
                    {
                        throw bq;
                    }
                    if (j >= k)
                    {
                        break label1;
                    }
                }
                bq = new bQ(c);
                bq1 = bq;
                if (!flag)
                {
                    break label0;
                }
            }
            try
            {
                bq.a();
            }
            // Misplaced declaration of an exception variable
            catch (bQ bq)
            {
                throw bq;
            }
            bq1 = bq;
        }
        k = a;
        j = 0;
        do
        {
            if (j >= a)
            {
                break;
            }
            bq1.a(j * 32, d[i * k + j]);
            j++;
        } while (!flag);
        return bq1;
    }

    public void a()
    {
        boolean flag = bQ.a;
        int i = b();
        int j = c();
        bQ bq1 = new bQ(i);
        bQ bq = new bQ(i);
        i = 0;
        do
        {
            if (i >= (j + 1) / 2)
            {
                break;
            }
            bq1 = a(i, bq1);
            bq = a(j - 1 - i, bq);
            bq1.c();
            bq.c();
            b(i, bq);
            b(j - 1 - i, bq1);
            i++;
        } while (!flag);
    }

    public void a(int i, int j)
    {
        j = a * j + i / 32;
        int ai[] = d;
        ai[j] = ai[j] ^ 1 << (i & 0x1f);
    }

    public void a(int i, int j, int k, int l)
    {
        int i1;
        boolean flag;
        flag = bQ.a;
        if (j < 0 || i < 0)
        {
            try
            {
                throw new IllegalArgumentException(z[2]);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        }
        if (l < 1 || k < 1)
        {
            try
            {
                throw new IllegalArgumentException(z[0]);
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        i1 = i + k;
        l = j + l;
        IllegalArgumentException illegalargumentexception2;
        try
        {
            k = b;
        }
        catch (IllegalArgumentException illegalargumentexception3)
        {
            try
            {
                throw illegalargumentexception3;
            }
            // Misplaced declaration of an exception variable
            catch (IllegalArgumentException illegalargumentexception2)
            {
                throw illegalargumentexception2;
            }
        }
        if (l > k)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        if (i1 <= c)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        throw new IllegalArgumentException(z[1]);
        do
        {
            if (j >= l)
            {
                break;
            }
            int j1 = a;
            k = i;
            do
            {
                if (k >= i1)
                {
                    break;
                }
                int ai[] = d;
                int k1 = k / 32 + j * j1;
                ai[k1] = ai[k1] | 1 << (k & 0x1f);
                k++;
            } while (!flag);
            j++;
        } while (!flag);
        return;
    }

    public int b()
    {
        return c;
    }

    public void b(int i, bQ bq)
    {
        System.arraycopy(bq.d(), 0, d, a * i, a);
    }

    public boolean b(int i, int j)
    {
        int k = a;
        int l = i / 32;
        try
        {
            j = d[k * j + l];
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        return (j >>> (i & 0x1f) & 1) != 0;
    }

    public int c()
    {
        return b;
    }

    public void c(int i, int j)
    {
        j = a * j + i / 32;
        int ai[] = d;
        ai[j] = ai[j] | 1 << (i & 0x1f);
    }

    public Object clone()
    {
        return f();
    }

    public int[] d()
    {
        boolean flag = bQ.a;
        int i = d.length - 1;
        int j;
        do
        {
            j = i;
            if (i < 0)
            {
                break;
            }
            int k;
            try
            {
                k = d[i];
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            j = i;
            if (k != 0)
            {
                break;
            }
            j = i - 1;
            i = j;
        } while (!flag);
        if (j < 0)
        {
            return null;
        }
        int i1 = j / a;
        int j1 = a;
        int k1 = d[j];
        i = 31;
        int l;
        do
        {
            l = i;
            if (k1 >>> i != 0)
            {
                break;
            }
            l = i - 1;
            i = l;
        } while (!flag);
        return (new int[] {
            (j % j1) * 32 + l, i1
        });
    }

    public int[] e()
    {
        boolean flag = bQ.a;
        int i1 = c;
        int l = b;
        int k = -1;
        int j = -1;
        int i = 0;
        int j1;
        int k1;
        int i2;
        int j2;
        do
        {
            j1 = j;
            k1 = k;
            i2 = l;
            j2 = i1;
            if (i >= b)
            {
                break;
            }
            j1 = j;
            int k2 = 0;
            j = i1;
            i1 = k;
            k = j1;
            int l1;
            do
            {
                j1 = k;
                l1 = i1;
                i2 = l;
                j2 = j;
                if (k2 >= a)
                {
                    break;
                }
                int i3 = d[a * i + k2];
                k1 = k;
                l1 = i1;
                i2 = l;
                j2 = j;
                if (i3 != 0)
                {
                    j1 = l;
                    if (i < l)
                    {
                        j1 = i;
                    }
                    l = k;
                    if (i > k)
                    {
                        l = i;
                    }
                    k = j;
                    if (k2 * 32 < j)
                    {
                        k = 0;
                        do
                        {
                            k1 = k;
                            if (i3 << 31 - k != 0)
                            {
                                break;
                            }
                            k1 = k + 1;
                            k = k1;
                        } while (!flag);
                        k = j;
                        if (k2 * 32 + k1 < j)
                        {
                            k = k2 * 32 + k1;
                        }
                    }
                    k1 = l;
                    l1 = i1;
                    i2 = j1;
                    j2 = k;
                    if (k2 * 32 + 31 > i1)
                    {
                        j = 31;
                        int l2;
                        do
                        {
                            l2 = j;
                            if (i3 >>> j != 0)
                            {
                                break;
                            }
                            l2 = j - 1;
                            j = l2;
                        } while (!flag);
                        k1 = l;
                        l1 = i1;
                        i2 = j1;
                        j2 = k;
                        if (k2 * 32 + l2 > i1)
                        {
                            l1 = k2 * 32 + l2;
                            j2 = k;
                            i2 = j1;
                            k1 = l;
                        }
                    }
                }
                k2++;
                k = k1;
                i1 = l1;
                l = i2;
                j = j2;
                if (!flag)
                {
                    continue;
                }
                j1 = k1;
                break;
            } while (true);
            k1 = l1;
            i++;
            j = j1;
            k = k1;
            l = i2;
            i1 = j2;
        } while (!flag);
        i = k1 - j2;
        j = j1 - i2;
        if (i < 0 || j < 0)
        {
            return null;
        } else
        {
            return (new int[] {
                j2, i2, i, j
            });
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag;
        try
        {
            flag = obj instanceof d6;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        obj = (d6)obj;
        int i;
        int j;
        i = c;
        j = ((d6) (obj)).c;
        if (i != j)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = b;
        j = ((d6) (obj)).b;
        if (i != j)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = a;
        j = ((d6) (obj)).a;
        if (i == j)
        {
            boolean flag1;
            try
            {
                flag1 = Arrays.equals(d, ((d6) (obj)).d);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (flag1)
            {
                return true;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
    }

    public d6 f()
    {
        return new d6(c, b, a, (int[])d.clone());
    }

    public int[] g()
    {
        boolean flag = bQ.a;
        int i = 0;
        int j;
        do
        {
            j = i;
            if (i >= d.length)
            {
                break;
            }
            int k;
            try
            {
                k = d[i];
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            j = i;
            if (k != 0)
            {
                break;
            }
            j = i + 1;
            i = j;
        } while (!flag);
        try
        {
            i = d.length;
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        if (j == i)
        {
            return null;
        }
        int i1 = j / a;
        int j1 = a;
        int k1 = d[j];
        i = 0;
        int l;
        do
        {
            l = i;
            if (k1 << 31 - i != 0)
            {
                break;
            }
            l = i + 1;
            i = l;
        } while (!flag);
        return (new int[] {
            (j % j1) * 32 + l, i1
        });
    }

    public int hashCode()
    {
        return (((c * 31 + c) * 31 + b) * 31 + a) * 31 + Arrays.hashCode(d);
    }

    public String toString()
    {
        StringBuilder stringbuilder;
        int i;
        boolean flag;
        flag = bQ.a;
        stringbuilder = new StringBuilder(b * (c + 1));
        i = 0;
_L4:
        int j;
        if (i >= b)
        {
            break; /* Loop/switch isn't completed */
        }
        j = 0;
_L2:
        Object obj;
label0:
        {
            if (j >= c)
            {
                break; /* Loop/switch isn't completed */
            }
            try
            {
                if (!b(j, i))
                {
                    break label0;
                }
                obj = z[5];
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
_L5:
        stringbuilder.append(((String) (obj)));
        j++;
        if (!flag) goto _L2; else goto _L1
_L1:
        stringbuilder.append('\n');
        i++;
        if (!flag) goto _L4; else goto _L3
_L3:
        return stringbuilder.toString();
        obj = z[4];
          goto _L5
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "BIQfi~\fYoe*[Qeub\fUtr~\fZd!kX\030mdk_L!0";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "^D]!soKQno*AMru*JQu!cBKheo\fLid*AYuscT";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "FI^u!kB\\!ue\\\030ltyX\030cd*BWoooKYuh|I";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "HCLi!nEUdoyEWor*AMru*N]!fxIYudx\fLi`d\f\b";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "*\f";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "R\f";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 238
    //                   1 245
    //                   2 252
    //                   3 259;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_259;
_L3:
        byte byte1 = 1;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 10;
          goto _L9
_L5:
        byte1 = 44;
          goto _L9
_L6:
        byte1 = 56;
          goto _L9
        byte1 = 1;
          goto _L9
    }
}
