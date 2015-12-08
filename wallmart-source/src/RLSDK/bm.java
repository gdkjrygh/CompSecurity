// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Hashtable;

// Referenced classes of package RLSDK:
//            bu, y, v, t, 
//            aj, ad, q, ab

public final class bm extends bu
{

    static final int a[];
    private static final char b[] = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".toCharArray();
    private static final int c;
    private final boolean d;
    private final boolean e;

    public bm()
    {
        d = false;
        e = false;
    }

    public bm(boolean flag)
    {
        d = flag;
        e = false;
    }

    private static char a(int i)
        throws y
    {
        for (int j = 0; j < a.length; j++)
        {
            if (a[j] == i)
            {
                return b[j];
            }
        }

        throw y.a();
    }

    private static int a(int ai[])
    {
        int k3 = ai.length;
        int j = 0;
        do
        {
            int i = 0x7fffffff;
            for (int k = 0; k < k3;)
            {
                int k1 = ai[k];
                int i1 = i;
                if (k1 < i)
                {
                    i1 = i;
                    if (k1 > j)
                    {
                        i1 = k1;
                    }
                }
                k++;
                i = i1;
            }

            int l1 = 0;
            j = 0;
            int j1 = 0;
            int l;
            int j2;
            for (l = 0; l1 < k3; l = j2)
            {
                int l3 = ai[l1];
                int j3 = j;
                int l2 = j1;
                j2 = l;
                if (ai[l1] > i)
                {
                    j3 = j | 1 << k3 - 1 - l1;
                    j2 = l + 1;
                    l2 = j1 + l3;
                }
                l1++;
                j = j3;
                j1 = l2;
            }

            if (l == 3)
            {
                int i2 = l;
                l = 0;
                do
                {
                    int k2;
label0:
                    {
                        k2 = j;
                        if (l < k3)
                        {
                            k2 = j;
                            if (i2 > 0)
                            {
                                int i3 = ai[l];
                                k2 = i2;
                                if (ai[l] <= i)
                                {
                                    break label0;
                                }
                                k2 = i2 - 1;
                                if (i3 << 1 < j1)
                                {
                                    break label0;
                                }
                                k2 = -1;
                            }
                        }
                        return k2;
                    }
                    l++;
                    i2 = k2;
                } while (true);
            }
            if (l <= 3)
            {
                return -1;
            }
            j = i;
        } while (true);
    }

    private static String a(StringBuffer stringbuffer)
        throws v
    {
        StringBuffer stringbuffer1;
        int i;
        int j;
        j = stringbuffer.length();
        stringbuffer1 = new StringBuffer(j);
        i = 0;
_L9:
        char c1;
        char c2;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_285;
        }
        c1 = stringbuffer.charAt(i);
        if (c1 != '+' && c1 != '$' && c1 != '%' && c1 != '/')
        {
            break MISSING_BLOCK_LABEL_276;
        }
        c2 = stringbuffer.charAt(i + 1);
        c1;
        JVM INSTR lookupswitch 4: default 108
    //                   36: 155
    //                   37: 183
    //                   43: 127
    //                   47: 235;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        c1 = '\0';
_L6:
        stringbuffer1.append(c1);
        i++;
_L7:
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        if (c2 >= 'A' && c2 <= 'Z')
        {
            c1 = (char)(c2 + 32);
        } else
        {
            throw v.a();
        }
          goto _L6
_L2:
        if (c2 >= 'A' && c2 <= 'Z')
        {
            c1 = (char)(c2 - 64);
        } else
        {
            throw v.a();
        }
          goto _L6
_L3:
        if (c2 >= 'A' && c2 <= 'E')
        {
            c1 = (char)(c2 - 38);
        } else
        if (c2 >= 'F' && c2 <= 'W')
        {
            c1 = (char)(c2 - 11);
        } else
        {
            throw v.a();
        }
          goto _L6
_L5:
        if (c2 >= 'A' && c2 <= 'O')
        {
            c1 = (char)(c2 - 32);
        } else
        if (c2 == 'Z')
        {
            c1 = ':';
        } else
        {
            throw v.a();
        }
          goto _L6
        stringbuffer1.append(c1);
          goto _L7
        return stringbuffer1.toString();
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final ab a(int i, aj aj1, Hashtable hashtable)
        throws y, t, v
    {
        int j;
        int l2;
label0:
        {
            int j3 = aj1.b;
            for (j = 0; j < j3 && !aj1.a(j); j++) { }
            l2 = 0;
            hashtable = new int[9];
            int i2 = 0;
            int k3 = hashtable.length;
            int i1 = j;
            while (i1 < j3) 
            {
                int k;
                if ((aj1.a(i1) ^ i2) != 0)
                {
                    hashtable[l2] = hashtable[l2] + 1;
                    k = i2;
                    i2 = j;
                } else
                {
                    if (l2 == k3 - 1)
                    {
                        if (a(((int []) (hashtable))) == c && aj1.a(Math.max(0, j - (i1 - j) / 2), j))
                        {
                            hashtable = new int[2];
                            hashtable[0] = j;
                            hashtable[1] = i1;
                            j = hashtable[1];
                            for (l2 = aj1.b; j < l2 && !aj1.a(j); j++) { }
                            break label0;
                        }
                        k = j + (hashtable[0] + hashtable[1]);
                        for (j = 2; j < k3; j++)
                        {
                            hashtable[j - 2] = hashtable[j];
                        }

                        hashtable[k3 - 2] = 0;
                        hashtable[k3 - 1] = 0;
                        j = l2 - 1;
                    } else
                    {
                        l2++;
                        k = j;
                        j = l2;
                    }
                    hashtable[j] = 1;
                    if (i2 == 0)
                    {
                        boolean flag = true;
                        i2 = k;
                        l2 = j;
                        k = ((flag) ? 1 : 0);
                    } else
                    {
                        boolean flag1 = false;
                        i2 = k;
                        l2 = j;
                        k = ((flag1) ? 1 : 0);
                    }
                }
                i1++;
                j = i2;
                i2 = k;
            }
            throw y.a();
        }
        Object obj = new StringBuffer(20);
        int ai[] = new int[9];
        do
        {
            a(aj1, j, ai);
            int l = a(ai);
            if (l < 0)
            {
                throw y.a();
            }
            char c1 = a(l);
            ((StringBuffer) (obj)).append(c1);
            int j1 = 0;
            l = j;
            for (; j1 < ai.length; j1++)
            {
                l += ai[j1];
            }

            for (; l < l2 && !aj1.a(l); l++) { }
            if (c1 == '*')
            {
                ((StringBuffer) (obj)).deleteCharAt(((StringBuffer) (obj)).length() - 1);
                int j2 = 0;
                for (int k1 = 0; k1 < ai.length; k1++)
                {
                    j2 += ai[k1];
                }

                if (l != l2 && (l - j - j2) / 2 < j2)
                {
                    throw y.a();
                }
                if (d)
                {
                    int i3 = ((StringBuffer) (obj)).length() - 1;
                    int k2 = 0;
                    for (int l1 = 0; l1 < i3; l1++)
                    {
                        k2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(((StringBuffer) (obj)).charAt(l1));
                    }

                    if (((StringBuffer) (obj)).charAt(i3) != b[k2 % 43])
                    {
                        throw t.a();
                    }
                    ((StringBuffer) (obj)).deleteCharAt(i3);
                }
                if (((StringBuffer) (obj)).length() == 0)
                {
                    throw y.a();
                }
                float f;
                float f1;
                q q1;
                if (e)
                {
                    aj1 = a(((StringBuffer) (obj)));
                } else
                {
                    aj1 = ((StringBuffer) (obj)).toString();
                }
                f = (float)(hashtable[1] + hashtable[0]) / 2.0F;
                f1 = (float)(j + l) / 2.0F;
                hashtable = new ad(f, i);
                obj = new ad(f1, i);
                q1 = q.c;
                return new ab(aj1, null, new ad[] {
                    hashtable, obj
                }, q1);
            }
            j = l;
        } while (true);
    }

    static 
    {
        int ai[] = new int[44];
        int[] _tmp = ai;
        ai[0] = 52;
        ai[1] = 289;
        ai[2] = 97;
        ai[3] = 352;
        ai[4] = 49;
        ai[5] = 304;
        ai[6] = 112;
        ai[7] = 37;
        ai[8] = 292;
        ai[9] = 100;
        ai[10] = 265;
        ai[11] = 73;
        ai[12] = 328;
        ai[13] = 25;
        ai[14] = 280;
        ai[15] = 88;
        ai[16] = 13;
        ai[17] = 268;
        ai[18] = 76;
        ai[19] = 28;
        ai[20] = 259;
        ai[21] = 67;
        ai[22] = 322;
        ai[23] = 19;
        ai[24] = 274;
        ai[25] = 82;
        ai[26] = 7;
        ai[27] = 262;
        ai[28] = 70;
        ai[29] = 22;
        ai[30] = 385;
        ai[31] = 193;
        ai[32] = 448;
        ai[33] = 145;
        ai[34] = 400;
        ai[35] = 208;
        ai[36] = 133;
        ai[37] = 388;
        ai[38] = 196;
        ai[39] = 148;
        ai[40] = 168;
        ai[41] = 162;
        ai[42] = 138;
        ai[43] = 42;
        a = ai;
        c = ai[39];
    }
}
