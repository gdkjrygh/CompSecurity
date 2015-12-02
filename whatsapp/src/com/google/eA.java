// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            e9, eH, gV, bQ, 
//            S

public final class eA extends e9
{

    private static final int i[];
    private static final int k[][];
    private static final String z[];
    private final int j[] = new int[4];

    public eA()
    {
    }

    public static String a(String s)
    {
        char c;
        char ac[];
        StringBuilder stringbuilder;
        boolean flag;
        flag = eH.a;
        ac = new char[6];
        s.getChars(1, 7, ac, 0);
        stringbuilder = new StringBuilder(12);
        stringbuilder.append(s.charAt(0));
        c = ac[5];
        c;
        JVM INSTR tableswitch 48 52: default 80
    //                   48 120
    //                   49 120
    //                   50 120
    //                   51 157
    //                   52 188;
           goto _L1 _L2 _L2 _L2 _L3 _L4
_L1:
        stringbuilder.append(ac, 0, 5);
        stringbuilder.append(z[1]);
        stringbuilder.append(c);
_L5:
        stringbuilder.append(s.charAt(7));
        return stringbuilder.toString();
_L2:
        stringbuilder.append(ac, 0, 2);
        stringbuilder.append(c);
        stringbuilder.append(z[3]);
        stringbuilder.append(ac, 2, 3);
        if (!flag) goto _L5; else goto _L3
_L3:
        stringbuilder.append(ac, 0, 3);
        stringbuilder.append(z[0]);
        stringbuilder.append(ac, 3, 2);
        if (!flag) goto _L5; else goto _L4
_L4:
        stringbuilder.append(ac, 0, 4);
        stringbuilder.append(z[2]);
        stringbuilder.append(ac[4]);
        if (!flag) goto _L5; else goto _L1
    }

    private static void a(StringBuilder stringbuilder, int l)
    {
        boolean flag = eH.a;
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 <= 1)
                {
                    int j1 = 0;
                    do
                    {
                        if (j1 >= 10)
                        {
                            break;
                        }
                        if (l == k[i1][j1])
                        {
                            stringbuilder.insert(0, (char)(i1 + 48));
                            stringbuilder.append((char)(j1 + 48));
                            return;
                        }
                        j1++;
                    } while (!flag);
                    if (!flag)
                    {
                        break label0;
                    }
                }
                throw gV.a();
            }
            i1++;
        } while (true);
    }

    protected int a(bQ bq, int ai[], StringBuilder stringbuilder)
    {
        boolean flag = eH.a;
        int ai1[] = j;
        ai1[0] = 0;
        ai1[1] = 0;
        ai1[2] = 0;
        ai1[3] = 0;
        int i2 = bq.b();
        int l = ai[1];
        int k1 = 0;
        int i1 = 0;
        do
        {
            int j1;
label0:
            {
                j1 = i1;
                int l1 = l;
                if (k1 < 6)
                {
                    j1 = i1;
                    l1 = l;
                    if (l < i2)
                    {
                        int j2 = a(bq, ai1, l, c);
                        stringbuilder.append((char)(j2 % 10 + 48));
                        int k2 = ai1.length;
                        l1 = 0;
                        j1 = l;
                        do
                        {
                            l = j1;
                            if (l1 >= k2)
                            {
                                break;
                            }
                            l = j1 + ai1[l1];
                            l1++;
                            j1 = l;
                        } while (!flag);
                        j1 = i1;
                        if (j2 >= 10)
                        {
                            j1 = i1 | 1 << 5 - k1;
                        }
                        if (!flag)
                        {
                            break label0;
                        }
                        l1 = l;
                    }
                }
                a(stringbuilder, j1);
                return l1;
            }
            k1++;
            i1 = j1;
        } while (true);
    }

    S a()
    {
        return S.UPC_E;
    }

    protected boolean a(String s)
    {
        return super.a(a(s));
    }

    protected int[] a(bQ bq, int l)
    {
        return a(bq, l, true, i);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int l;
        as = new String[4];
        obj = "E%\rL5";
        byte1 = -1;
        l = 0;
_L2:
        String as1[];
        int i1;
        int j1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        j1 = obj.length;
        i1 = 0;
_L8:
label0:
        {
            if (j1 > i1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[l] = ((String) (obj));
                obj = "E%\rL";
                l = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[l] = ((String) (obj));
                obj = "E%\rL5";
                l = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[l] = ((String) (obj));
                l = 3;
                obj = "E%\rL";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[l] = ((String) (obj));
                z = as;
                i = (new int[] {
                    1, 1, 1, 1, 1, 1
                });
                k = (new int[][] {
                    new int[] {
                        56, 52, 50, 49, 44, 38, 35, 42, 41, 37
                    }, new int[] {
                        7, 11, 13, 14, 19, 25, 28, 21, 22, 26
                    }
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 336
    //                   0 356
    //                   1 362
    //                   2 368
    //                   3 374;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_374;
_L3:
        byte byte0 = 5;
_L9:
        obj[i1] = (char)(byte0 ^ c);
        i1++;
          goto _L8
_L4:
        byte0 = 117;
          goto _L9
_L5:
        byte0 = 21;
          goto _L9
_L6:
        byte0 = 61;
          goto _L9
        byte0 = 124;
          goto _L9
    }
}
