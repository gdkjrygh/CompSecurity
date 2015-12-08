// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common;

import com.google.zxing.DecodeHintType;
import java.util.Map;

public final class k
{

    private static final String a = System.getProperty("file.encoding");
    private static final boolean b;

    public static String a(byte abyte0[], Map map)
    {
        int i;
        int j;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        boolean flag;
        int k3;
        int l3;
        int i4;
        int j4;
        int k5;
        if (map != null)
        {
            map = (String)map.get(DecodeHintType.CHARACTER_SET);
            if (map != null)
            {
                return map;
            }
        }
        k5 = abyte0.length;
        l2 = 1;
        j = 1;
        k1 = 1;
        i4 = 0;
        l3 = 0;
        k3 = 0;
        j1 = 0;
        i1 = 0;
        l1 = 0;
        k2 = 0;
        l = 0;
        i = 0;
        i3 = 0;
        int j3;
        int l4;
        if (abyte0.length > 3 && abyte0[0] == -17 && abyte0[1] == -69 && abyte0[2] == -65)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j3 = 0;
        i2 = 0;
        if (j3 >= k5 || l2 == 0 && j == 0 && k1 == 0) goto _L2; else goto _L1
_L1:
        j4 = abyte0[j3] & 0xff;
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_1024;
        }
        if (i2 <= 0) goto _L4; else goto _L3
_L3:
        j2 = i2;
        if ((j4 & 0x80) == 0) goto _L6; else goto _L5
_L5:
        i2--;
        j2 = k1;
_L14:
        if (l2 == 0) goto _L8; else goto _L7
_L7:
        if (j4 <= 127 || j4 >= 160) goto _L10; else goto _L9
_L9:
        l2 = i3;
        i3 = 0;
_L12:
        if (j != 0)
        {
            if (j1 > 0)
            {
                if (j4 < 64 || j4 == 127 || j4 > 252)
                {
                    j = l;
                    l = k2;
                    k2 = l1;
                    l1 = 0;
                    k1 = j1;
                    j1 = i1;
                    i1 = k2;
                } else
                {
                    j4 = j;
                    k1 = i1;
                    int i5 = j1 - 1;
                    j = l;
                    l = k2;
                    i1 = l1;
                    j1 = k1;
                    k1 = i5;
                    l1 = j4;
                }
            } else
            if (j4 == 128 || j4 == 160 || j4 > 239)
            {
                j = l;
                l = k2;
                k1 = i1;
                k2 = j1;
                j4 = 0;
                i1 = l1;
                j1 = k1;
                k1 = k2;
                l1 = j4;
            } else
            if (j4 > 160 && j4 < 224)
            {
                k1 = i1 + 1;
                i1 = l1 + 1;
                boolean flag1;
                if (i1 > l)
                {
                    l = 0;
                    j4 = i1;
                    l1 = j1;
                    k2 = j;
                    j = i1;
                    i1 = j4;
                    j1 = k1;
                    k1 = l1;
                    l1 = k2;
                } else
                {
                    l1 = j1;
                    k2 = j;
                    j = l;
                    l = 0;
                    j1 = k1;
                    k1 = l1;
                    l1 = k2;
                }
            } else
            if (j4 > 127)
            {
                l1 = j1 + 1;
                j1 = k2 + 1;
                if (j1 > i)
                {
                    j4 = l;
                    flag1 = false;
                    l = j1;
                    k1 = i1;
                    k2 = j;
                    i = j1;
                    j = j4;
                    i1 = ((flag1) ? 1 : 0);
                    j1 = k1;
                    k1 = l1;
                    l1 = k2;
                } else
                {
                    j4 = 0;
                    k1 = i1;
                    k2 = j;
                    j = l;
                    l = j1;
                    i1 = j4;
                    j1 = k1;
                    k1 = l1;
                    l1 = k2;
                }
            } else
            {
                j4 = 0;
                k1 = i1;
                l1 = j1;
                k2 = j;
                j = l;
                l = 0;
                i1 = j4;
                j1 = k1;
                k1 = l1;
                l1 = k2;
            }
        } else
        {
            k1 = i1;
            int k4 = j1;
            int j5 = j;
            j = l;
            l = k2;
            i1 = l1;
            j1 = k1;
            k1 = k4;
            l1 = j5;
        }
        l4 = j3 + 1;
        j3 = i3;
        i3 = l1;
        j4 = k1;
        k1 = j2;
        k2 = l;
        l = j;
        l1 = i1;
        i1 = j1;
        j1 = j4;
        j = i3;
        i3 = l2;
        l2 = j3;
        j3 = l4;
        break MISSING_BLOCK_LABEL_103;
_L4:
        if ((j4 & 0x80) == 0)
        {
            break MISSING_BLOCK_LABEL_1024;
        }
        j2 = i2;
        if ((j4 & 0x40) != 0)
        {
            i2++;
            if ((j4 & 0x20) == 0)
            {
                i4++;
                j2 = k1;
            } else
            {
label0:
                {
                    i2++;
                    if ((j4 & 0x10) != 0)
                    {
                        break label0;
                    }
                    l3++;
                    j2 = k1;
                }
            }
            continue; /* Loop/switch isn't completed */
        }
          goto _L6
        i2++;
        j2 = i2;
        if ((j4 & 8) == 0)
        {
            k3++;
            j2 = k1;
            continue; /* Loop/switch isn't completed */
        }
_L6:
        i2 = j2;
        j2 = 0;
        continue; /* Loop/switch isn't completed */
_L10:
        if (j4 > 159 && (j4 < 192 || j4 == 215 || j4 == 247))
        {
            k1 = i3 + 1;
            i3 = l2;
            l2 = k1;
            continue; /* Loop/switch isn't completed */
        }
          goto _L8
_L2:
        if (k1 != 0 && i2 > 0)
        {
            k1 = 0;
        }
        l1 = j;
        if (j != 0)
        {
            l1 = j;
            if (j1 > 0)
            {
                l1 = 0;
            }
        }
        if (k1 != 0 && (flag || i4 + l3 + k3 > 0))
        {
            return "UTF8";
        }
        if (l1 != 0 && (b || l >= 3 || i >= 3))
        {
            return "SJIS";
        }
        if (l2 != 0 && l1 != 0)
        {
            if (l == 2 && i1 == 2 || i3 * 10 >= k5)
            {
                return "SJIS";
            } else
            {
                return "ISO8859_1";
            }
        }
        if (l2 != 0)
        {
            return "ISO8859_1";
        }
        if (l1 != 0)
        {
            return "SJIS";
        }
        if (k1 != 0)
        {
            return "UTF8";
        } else
        {
            return a;
        }
_L8:
        k1 = l2;
        l2 = i3;
        i3 = k1;
        if (true) goto _L12; else goto _L11
_L11:
        j2 = k1;
        if (true) goto _L14; else goto _L13
_L13:
    }

    static 
    {
        boolean flag;
        if ("SJIS".equalsIgnoreCase(a) || "EUC_JP".equalsIgnoreCase(a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
