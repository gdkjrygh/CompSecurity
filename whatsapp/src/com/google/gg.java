// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            a6, am, fA, gh

public final class gg
{

    private static final String z[];
    private final a6 a;

    public gg(a6 a6_1)
    {
        a = a6_1;
    }

    private int[] a(am am1)
    {
        int i = 0;
        int k = 1;
        int l = a6.n;
        int i1 = am1.a();
        if (i1 == 1)
        {
            try
            {
                i = am1.c(1);
            }
            // Misplaced declaration of an exception variable
            catch (am am1)
            {
                throw am1;
            }
            return (new int[] {
                i
            });
        }
        int ai[] = new int[i1];
label0:
        do
        {
label1:
            {
                int j = i;
                if (k >= a.c())
                {
                    break label0;
                }
                j = i;
                if (i >= i1)
                {
                    break label0;
                }
                j = i;
                try
                {
                    if (am1.b(k) != 0)
                    {
                        break label1;
                    }
                    ai[i] = a.c(k);
                }
                // Misplaced declaration of an exception variable
                catch (am am1)
                {
                    throw am1;
                }
                j = i + 1;
            }
            k++;
            i = j;
        } while (l == 0);
        if (j != i1)
        {
            try
            {
                throw new fA(z[4]);
            }
            // Misplaced declaration of an exception variable
            catch (am am1)
            {
                throw am1;
            }
        } else
        {
            return ai;
        }
    }

    private int[] a(am am1, int ai[])
    {
        int ai1[];
        int j;
        int i1;
        int j1;
        i1 = a6.n;
        j1 = ai.length;
        ai1 = new int[j1];
        j = 0;
_L4:
        if (j >= j1) goto _L2; else goto _L1
_L1:
        int i;
        int k;
        int k1;
        k1 = a.c(ai[j]);
        i = 1;
        k = 0;
_L5:
        if (k < j1)
        {
            if (j != k)
            {
                int l = a.c(ai[k], k1);
                if ((l & 1) == 0)
                {
                    l |= 1;
                } else
                {
                    l &= -2;
                }
                i = a.c(i, l);
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_185;
            }
        }
        try
        {
            ai1[j] = a.c(am1.b(k1), a.c(i));
            if (a.a() != 0)
            {
                ai1[j] = a.c(ai1[j], k1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (am am1)
        {
            throw am1;
        }
        if (i1 == 0) goto _L3; else goto _L2
_L2:
        return ai1;
_L3:
        j++;
          goto _L4
        k++;
          goto _L5
    }

    private am[] a(am am1, am am2, int i)
    {
        int j = a6.n;
        am am3;
        am am5;
        am am6;
        am am7;
        am am8;
        int k;
        int l;
        int i1;
        if (am1.a() >= am2.a())
        {
            am am4 = am1;
            am1 = am2;
            am2 = am4;
        }
        am7 = a.d();
        am5 = a.b();
        am3 = am2;
        am2 = am5;
        if (am1.a() < i / 2)
        {
            break MISSING_BLOCK_LABEL_338;
        }
        try
        {
            if (am1.b())
            {
                throw new fA(z[0]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (am am1)
        {
            throw am1;
        }
        am5 = a.d();
        k = am1.c(am1.a());
        k = a.c(k);
        do
        {
            am8 = am5;
            am6 = am3;
            if (am3.a() < am1.a())
            {
                break;
            }
            am8 = am5;
            am6 = am3;
            if (am3.b())
            {
                break;
            }
            l = am3.a() - am1.a();
            i1 = a.c(am3.c(am3.a()), k);
            am8 = am5.a(a.a(l, i1));
            am6 = am3.a(am1.a(l, i1));
            am5 = am8;
            am3 = am6;
        } while (j == 0);
        am5 = am8.b(am2).a(am7);
        try
        {
            if (am6.a() >= am1.a())
            {
                throw new IllegalStateException(z[1]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (am am1)
        {
            throw am1;
        }
        if (j == 0) goto _L2; else goto _L1
_L1:
        i = am5.c(0);
        if (i == 0)
        {
            try
            {
                throw new fA(z[2]);
            }
            // Misplaced declaration of an exception variable
            catch (am am1)
            {
                throw am1;
            }
        } else
        {
            i = a.c(i);
            return (new am[] {
                am5.a(i), am6.a(i)
            });
        }
_L2:
        am3 = am1;
        am1 = am6;
        am7 = am2;
        am2 = am5;
        break MISSING_BLOCK_LABEL_40;
        am5 = am2;
        am6 = am1;
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void a(int ai[], int i)
    {
        boolean flag2 = false;
        int l = a6.n;
        am am1 = new am(a, ai);
        Object aobj[] = new int[i];
        int k = 0;
        boolean flag = true;
        boolean flag1;
        do
        {
            flag1 = flag;
            if (k >= i)
            {
                break;
            }
            int i1 = am1.b(a.a(a.a() + k));
            aobj[aobj.length - 1 - k] = i1;
            flag1 = flag;
            if (i1 != 0)
            {
                flag1 = false;
            }
            k++;
            flag = flag1;
            if (l == 0)
            {
                continue;
            }
            gh.a++;
            break;
        } while (true);
        if (!flag1)
        {
            am am2 = new am(a, ((int []) (aobj)));
            aobj = a(a.a(i, 1), am2, i);
            am2 = aobj[0];
            am am3 = aobj[1];
            int ai1[] = a(am2);
            am3 = a(am3, ai1);
            i = ((flag2) ? 1 : 0);
            do
            {
                if (i >= ai1.length)
                {
                    continue;
                }
                int j = ai.length - 1 - a.b(ai1[i]);
                if (j < 0)
                {
                    try
                    {
                        throw new fA(z[3]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (int ai[])
                    {
                        throw ai;
                    }
                }
                ai[j] = a6.b(ai[j], am3[i]);
                i++;
            } while (l == 0);
        }
        break MISSING_BLOCK_LABEL_247;
        while (true) 
        {
            return;
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "\\ /R\n\037\002tLF]_.^UA";
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
                obj = "j\026\"RTG\020:\033FB\030;INZ\0279\033AO\0268^C\016\013;\033UK\033!XB\016\017;W^@\0209RFB@";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "]\0263VFz\0268_B\006O}\033PO\ftAB\\\020";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "l\0360\033B\\\r;I\007B\0207ZSG\020:";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "k\r&TU\016\023;XFZ\020&\033CK\030&^B\016\033;^T\016\021;O\007C\036 XO\016\021!VEK\rtTA\016\r;TS]";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 39;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 46;
          goto _L9
_L5:
        byte1 = 127;
          goto _L9
_L6:
        byte1 = 84;
          goto _L9
        byte1 = 59;
          goto _L9
    }
}
