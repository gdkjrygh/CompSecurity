// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Hashtable;

// Referenced classes of package RLSDK:
//            u

public final class ax
{

    private static final String a = System.getProperty("file.encoding");
    private static final boolean b;

    public static String a(byte abyte0[], Hashtable hashtable)
    {
        int i;
        int j;
        int l;
        int j1;
        int k1;
        boolean flag;
        int l1;
        int i2;
        int j2;
        int l2;
        int j3;
        if (hashtable != null)
        {
            hashtable = (String)hashtable.get(u.e);
            if (hashtable != null)
            {
                return hashtable;
            }
        }
        if (abyte0.length > 3 && abyte0[0] == -17 && abyte0[1] == -69 && abyte0[2] == -65)
        {
            return "UTF8";
        }
        j3 = abyte0.length;
        l = 0;
        l1 = 0;
        j2 = 0;
        l2 = 0;
        j1 = 0;
        flag = false;
        k1 = 0;
        i = 1;
        j = 1;
        i2 = 1;
_L3:
        int i3;
        if (j1 >= j3 || i2 == 0 && j == 0 && i == 0)
        {
            break MISSING_BLOCK_LABEL_566;
        }
        i3 = abyte0[j1] & 0xff;
        if (i3 < 128 || i3 > 191) goto _L2; else goto _L1
_L1:
        int k;
        int i1;
        int k2;
        if (l > 0)
        {
            k = l - 1;
            k2 = l2;
        } else
        {
            k2 = l2;
            k = l;
        }
label0:
        {
            if (i3 != 194)
            {
                l2 = j2;
                if (i3 != 195)
                {
                    break label0;
                }
            }
            l2 = j2;
            if (j1 >= j3 - 1)
            {
                break label0;
            }
            l = abyte0[j1 + 1] & 0xff;
            l2 = j2;
            if (l > 191)
            {
                break label0;
            }
            if (i3 != 194 || l < 160)
            {
                l2 = j2;
                if (i3 != 195)
                {
                    break label0;
                }
                l2 = j2;
                if (l < 128)
                {
                    break label0;
                }
            }
            l2 = 1;
        }
label1:
        {
            j2 = i2;
            if (i3 >= 127)
            {
                j2 = i2;
                if (i3 <= 159)
                {
                    j2 = 0;
                }
            }
            i2 = l1;
            if (i3 >= 161)
            {
                i2 = l1;
                if (i3 <= 223)
                {
                    i2 = l1;
                    if (!flag)
                    {
                        i2 = l1 + 1;
                    }
                }
            }
            l = j;
            if (flag)
            {
                break label1;
            }
            if ((i3 < 240 || i3 > 255) && i3 != 128)
            {
                l = j;
                if (i3 != 160)
                {
                    break label1;
                }
            }
            l = 0;
        }
        if ((i3 >= 129 && i3 <= 159 || i3 >= 224 && i3 <= 239) && !flag)
        {
            i1 = 1;
            if (j1 >= abyte0.length - 1)
            {
                j = 0;
            } else
            {
                j = abyte0[j1 + 1] & 0xff;
                if (j < 64 || j > 252)
                {
                    j = 0;
                } else
                {
                    k1++;
                    j = l;
                }
            }
        } else
        {
            i1 = 0;
            j = l;
        }
        j1++;
        l1 = i2;
        i2 = j2;
        j2 = l2;
        l2 = k2;
        l = k;
        flag = i1;
        if (true) goto _L3; else goto _L2
_L2:
        if (l > 0)
        {
            i1 = 0;
        } else
        {
            i1 = i;
        }
        k2 = l2;
        k = l;
        i = i1;
        if (i3 < 192)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        k2 = l2;
        k = l;
        i = i1;
        if (i3 <= 253)
        {
            i = l;
            for (k = i3; (k & 0x40) != 0;)
            {
                k <<= 1;
                i++;
            }

            break MISSING_BLOCK_LABEL_638;
        } else
        {
            break MISSING_BLOCK_LABEL_147;
        }
        if (l > 0)
        {
            i = 0;
        }
        if (j != 0 && b)
        {
            return "SJIS";
        }
        if (i != 0 && l2 != 0)
        {
            return "UTF8";
        }
        if (j != 0 && (k1 >= 3 || l1 * 20 > j3))
        {
            return "SJIS";
        }
        if (j2 == 0 && i2 != 0)
        {
            return "ISO8859_1";
        } else
        {
            return a;
        }
        k2 = 1;
        k = i;
        i = i1;
        break MISSING_BLOCK_LABEL_147;
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
