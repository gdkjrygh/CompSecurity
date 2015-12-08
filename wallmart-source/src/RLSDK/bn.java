// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Hashtable;

// Referenced classes of package RLSDK:
//            bu, y, v, t, 
//            aj, ad, q, ab

public final class bn extends bu
{

    private static final char a[] = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
    private static final int b[];
    private static final int c;

    public bn()
    {
    }

    private static char a(int i)
        throws y
    {
        for (int j = 0; j < b.length; j++)
        {
            if (b[j] == i)
            {
                return a[j];
            }
        }

        throw y.a();
    }

    private static int a(int ai[])
    {
        int i2 = ai.length;
        int i = 0;
        int j;
        int i1;
        for (i1 = 0; i < i2; i1 = j + i1)
        {
            j = ai[i];
            i++;
        }

        int j1 = 0;
        i = 0;
        do
        {
            int k1;
label0:
            {
                int k = i;
                if (j1 < i2)
                {
                    k = ((ai[j1] << 8) * 9) / i1;
                    k1 = k >> 8;
                    if ((k & 0xff) > 127)
                    {
                        k1++;
                    }
                    if (k1 > 0 && k1 <= 4)
                    {
                        break label0;
                    }
                    k = -1;
                }
                return k;
            }
            int l;
            if ((j1 & 1) == 0)
            {
                int l1 = 0;
                do
                {
                    l = i;
                    if (l1 >= k1)
                    {
                        break;
                    }
                    l1++;
                    i = i << 1 | 1;
                } while (true);
            } else
            {
                l = i << k1;
            }
            j1++;
            i = l;
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
            break MISSING_BLOCK_LABEL_261;
        }
        c1 = stringbuffer.charAt(i);
        if (c1 < 'a' || c1 > 'd')
        {
            break MISSING_BLOCK_LABEL_252;
        }
        c2 = stringbuffer.charAt(i + 1);
        c1;
        JVM INSTR tableswitch 97 100: default 84
    //                   97 131
    //                   98 159
    //                   99 211
    //                   100 103;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        c1 = '\0';
_L6:
        stringbuffer1.append(c1);
        i++;
_L7:
        i++;
        continue; /* Loop/switch isn't completed */
_L5:
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
_L4:
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

    private static void a(StringBuffer stringbuffer, int i, int j)
        throws t
    {
        int k = 1;
        int i1 = i - 1;
        int l = 0;
        do
        {
            int j1 = k;
            if (i1 < 0)
            {
                break;
            }
            int l1 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(stringbuffer.charAt(i1));
            int k1 = j1 + 1;
            k = k1;
            if (k1 > j)
            {
                k = 1;
            }
            i1--;
            l = l1 * j1 + l;
        } while (true);
        if (stringbuffer.charAt(i) != a[l % 47])
        {
            throw t.a();
        } else
        {
            return;
        }
    }

    public final ab a(int i, aj aj1, Hashtable hashtable)
        throws y, t, v
    {
        int j;
        int l1;
label0:
        {
            int j2 = aj1.b;
            for (j = 0; j < j2 && !aj1.a(j); j++) { }
            int i2 = 0;
            hashtable = new int[6];
            l1 = 0;
            int k2 = hashtable.length;
            int i1 = j;
            while (i1 < j2) 
            {
                int k;
                if ((aj1.a(i1) ^ l1) != 0)
                {
                    hashtable[i2] = hashtable[i2] + 1;
                    k = l1;
                    l1 = j;
                } else
                {
                    if (i2 == k2 - 1)
                    {
                        if (a(((int []) (hashtable))) == c)
                        {
                            hashtable = new int[2];
                            hashtable[0] = j;
                            hashtable[1] = i1;
                            j = hashtable[1];
                            for (l1 = aj1.b; j < l1 && !aj1.a(j); j++) { }
                            break label0;
                        }
                        k = j + (hashtable[0] + hashtable[1]);
                        for (j = 2; j < k2; j++)
                        {
                            hashtable[j - 2] = hashtable[j];
                        }

                        hashtable[k2 - 2] = 0;
                        hashtable[k2 - 1] = 0;
                        j = i2 - 1;
                    } else
                    {
                        i2++;
                        k = j;
                        j = i2;
                    }
                    hashtable[j] = 1;
                    if (l1 == 0)
                    {
                        boolean flag = true;
                        l1 = k;
                        i2 = j;
                        k = ((flag) ? 1 : 0);
                    } else
                    {
                        boolean flag1 = false;
                        l1 = k;
                        i2 = j;
                        k = ((flag1) ? 1 : 0);
                    }
                }
                i1++;
                j = l1;
                l1 = k;
            }
            throw y.a();
        }
        Object obj = new StringBuffer(20);
        int ai[] = new int[6];
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

            for (; l < l1 && !aj1.a(l); l++) { }
            if (c1 == '*')
            {
                ((StringBuffer) (obj)).deleteCharAt(((StringBuffer) (obj)).length() - 1);
                if (l == l1 || !aj1.a(l))
                {
                    throw y.a();
                }
                if (((StringBuffer) (obj)).length() < 2)
                {
                    throw y.a();
                } else
                {
                    int k1 = ((StringBuffer) (obj)).length();
                    a(((StringBuffer) (obj)), k1 - 2, 20);
                    a(((StringBuffer) (obj)), k1 - 1, 15);
                    ((StringBuffer) (obj)).setLength(((StringBuffer) (obj)).length() - 2);
                    aj1 = a(((StringBuffer) (obj)));
                    k1 = hashtable[1];
                    float f = (float)(hashtable[0] + k1) / 2.0F;
                    float f1 = (float)(j + l) / 2.0F;
                    hashtable = new ad(f, i);
                    obj = new ad(f1, i);
                    q q1 = q.d;
                    return new ab(aj1, null, new ad[] {
                        hashtable, obj
                    }, q1);
                }
            }
            j = l;
        } while (true);
    }

    static 
    {
        int ai[] = new int[48];
        int[] _tmp = ai;
        ai[0] = 276;
        ai[1] = 328;
        ai[2] = 324;
        ai[3] = 322;
        ai[4] = 296;
        ai[5] = 292;
        ai[6] = 290;
        ai[7] = 336;
        ai[8] = 274;
        ai[9] = 266;
        ai[10] = 424;
        ai[11] = 420;
        ai[12] = 418;
        ai[13] = 404;
        ai[14] = 402;
        ai[15] = 394;
        ai[16] = 360;
        ai[17] = 356;
        ai[18] = 354;
        ai[19] = 308;
        ai[20] = 282;
        ai[21] = 344;
        ai[22] = 332;
        ai[23] = 326;
        ai[24] = 300;
        ai[25] = 278;
        ai[26] = 436;
        ai[27] = 434;
        ai[28] = 428;
        ai[29] = 422;
        ai[30] = 406;
        ai[31] = 410;
        ai[32] = 364;
        ai[33] = 358;
        ai[34] = 310;
        ai[35] = 314;
        ai[36] = 302;
        ai[37] = 468;
        ai[38] = 466;
        ai[39] = 458;
        ai[40] = 366;
        ai[41] = 374;
        ai[42] = 430;
        ai[43] = 294;
        ai[44] = 474;
        ai[45] = 470;
        ai[46] = 306;
        ai[47] = 350;
        b = ai;
        c = ai[47];
    }
}
