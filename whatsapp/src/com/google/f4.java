// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.EnumMap;
import java.util.Map;

// Referenced classes of package com.google:
//            eH, gV, bC, bQ, 
//            e9, fw, S, c6

final class f4
{

    private static final int a[];
    private static final String z[];
    private final int b[] = new int[4];
    private final StringBuilder c = new StringBuilder();

    f4()
    {
    }

    private static int a(int i)
    {
        boolean flag = eH.a;
        int j = 0;
        do
        {
            if (j >= 10)
            {
                break;
            }
            if (i == a[j])
            {
                return j;
            }
            j++;
        } while (!flag);
        throw gV.a();
    }

    private static int a(CharSequence charsequence)
    {
        boolean flag = eH.a;
        int l = charsequence.length();
        int i = 0;
        int j = l - 2;
        int k;
        do
        {
            k = i;
            if (j < 0)
            {
                break;
            }
            k = i + (charsequence.charAt(j) - 48);
            j -= 2;
            i = k;
        } while (!flag);
        i = k * 3;
        j = l - 1;
        do
        {
            k = i;
            if (j < 0)
            {
                break;
            }
            k = i + (charsequence.charAt(j) - 48);
            j -= 2;
            i = k;
        } while (!flag);
        return (k * 3) % 10;
    }

    private static String a(String s)
    {
        boolean flag = eH.a;
        s.charAt(0);
        JVM INSTR lookupswitch 3: default 44
    //                   48: 123
    //                   53: 131
    //                   57: 139;
           goto _L1 _L2 _L3 _L4
_L1:
        String s1 = "";
_L5:
        int j = Integer.parseInt(s.substring(1));
        int i = j / 100;
        j %= 100;
        if (j < 10)
        {
            s = (new StringBuilder()).append("0").append(j).toString();
        } else
        {
            s = String.valueOf(j);
        }
        return (new StringBuilder()).append(s1).append(String.valueOf(i)).append('.').append(s).toString();
_L2:
        s1 = "\243";
        if (!flag) goto _L5; else goto _L3
_L3:
        s1 = "$";
        if (!flag) goto _L5; else goto _L4
_L4:
        if (z[2].equals(s))
        {
            return null;
        }
        if (z[4].equals(s))
        {
            return z[0];
        }
        if (z[3].equals(s))
        {
            return z[1];
        }
        s1 = "";
        if (!flag) goto _L5; else goto _L1
    }

    private static Map b(String s)
    {
        if (s.length() == 5)
        {
            if ((s = a(s)) != null)
            {
                EnumMap enummap = new EnumMap(com/google/bC);
                enummap.put(bC.SUGGESTED_PRICE, s);
                return enummap;
            }
        }
        return null;
    }

    int a(bQ bq, int ai[], StringBuilder stringbuilder)
    {
        boolean flag = eH.a;
        int ai1[] = b;
        ai1[0] = 0;
        ai1[1] = 0;
        ai1[2] = 0;
        ai1[3] = 0;
        int j1 = bq.b();
        int i = ai[1];
        int i1 = 0;
        int j = 0;
        do
        {
            int l;
label0:
            {
                l = j;
                int k = i;
                if (i1 < 5)
                {
                    l = j;
                    k = i;
                    if (i < j1)
                    {
                        int k1 = e9.a(bq, ai1, i, e9.c);
                        stringbuilder.append((char)(k1 % 10 + 48));
                        int l1 = ai1.length;
                        l = 0;
                        do
                        {
                            k = i;
                            if (l >= l1)
                            {
                                break;
                            }
                            k = i + ai1[l];
                            l++;
                            i = k;
                        } while (!flag);
                        l = j;
                        if (k1 >= 10)
                        {
                            l = j | 1 << 4 - i1;
                        }
                        i = k;
                        if (i1 != 4)
                        {
                            i = bq.a(bq.c(k));
                        }
                        if (!flag)
                        {
                            break label0;
                        }
                        k = i;
                    }
                }
                if (stringbuilder.length() != 5)
                {
                    throw gV.a();
                }
                i = a(l);
                if (a(((CharSequence) (stringbuilder.toString()))) != i)
                {
                    throw gV.a();
                } else
                {
                    return k;
                }
            }
            i1++;
            j = l;
        } while (true);
    }

    c6 a(int i, bQ bq, int ai[])
    {
        Object obj = c;
        ((StringBuilder) (obj)).setLength(0);
        int j = a(bq, ai, ((StringBuilder) (obj)));
        obj = ((StringBuilder) (obj)).toString();
        bq = b(((String) (obj)));
        ai = new fw((float)(ai[0] + ai[1]) / 2.0F, i);
        fw fw1 = new fw(j, i);
        S s = S.UPC_EAN_EXTENSION;
        ai = new c6(((String) (obj)), null, new fw[] {
            ai, fw1
        }, s);
        if (bq != null)
        {
            ai.a(bq);
        }
        return ai;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "N \0165";
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
                obj = "+}[a";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "G>\0165s";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "G7\007<s";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "G7\007<r";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                a = (new int[] {
                    24, 20, 18, 17, 12, 6, 3, 10, 9, 5
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 248
    //                   0 271
    //                   1 278
    //                   2 285
    //                   3 292;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_292;
_L3:
        byte byte1 = 67;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 126;
          goto _L9
_L5:
        byte1 = 14;
          goto _L9
_L6:
        byte1 = 62;
          goto _L9
        byte1 = 5;
          goto _L9
    }
}
