// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;


public final class ByteUtils
{

    private static final char HEX_CHARS[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };

    private ByteUtils()
    {
    }

    public static byte[] clone(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        } else
        {
            byte abyte1[] = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
            return abyte1;
        }
    }

    public static byte[] concatenate(byte abyte0[], byte abyte1[])
    {
        byte abyte2[] = new byte[abyte0.length + abyte1.length];
        System.arraycopy(abyte0, 0, abyte2, 0, abyte0.length);
        System.arraycopy(abyte1, 0, abyte2, abyte0.length, abyte1.length);
        return abyte2;
    }

    public static byte[] concatenate(byte abyte0[][])
    {
        int k = abyte0[0].length;
        byte abyte1[] = new byte[abyte0.length * k];
        int i = 0;
        int j = 0;
        for (; i < abyte0.length; i++)
        {
            System.arraycopy(abyte0[i], 0, abyte1, j, k);
            j += k;
        }

        return abyte1;
    }

    public static int deepHashCode(byte abyte0[])
    {
        int j = 1;
        for (int i = 0; i < abyte0.length; i++)
        {
            j = j * 31 + abyte0[i];
        }

        return j;
    }

    public static int deepHashCode(byte abyte0[][])
    {
        int j = 1;
        for (int i = 0; i < abyte0.length; i++)
        {
            j = j * 31 + deepHashCode(abyte0[i]);
        }

        return j;
    }

    public static int deepHashCode(byte abyte0[][][])
    {
        int j = 1;
        for (int i = 0; i < abyte0.length; i++)
        {
            j = j * 31 + deepHashCode(abyte0[i]);
        }

        return j;
    }

    public static boolean equals(byte abyte0[], byte abyte1[])
    {
        boolean flag1 = true;
        boolean flag3 = false;
        if (abyte0 == null)
        {
            if (abyte1 != null)
            {
                flag1 = false;
            }
        } else
        {
            flag1 = flag3;
            if (abyte1 != null)
            {
                flag1 = flag3;
                if (abyte0.length == abyte1.length)
                {
                    int i = abyte0.length - 1;
                    boolean flag2 = true;
                    while (i >= 0) 
                    {
                        boolean flag;
                        if (abyte0[i] == abyte1[i])
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        flag2 &= flag;
                        i--;
                    }
                    return flag2;
                }
            }
        }
        return flag1;
    }

    public static boolean equals(byte abyte0[][], byte abyte1[][])
    {
        if (abyte0.length == abyte1.length) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L4:
        return flag1;
_L2:
        int i = abyte0.length;
        boolean flag = true;
        i--;
        do
        {
            flag1 = flag;
            if (i < 0)
            {
                continue;
            }
            flag1 = equals(abyte0[i], abyte1[i]);
            i--;
            flag = flag1 & flag;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean equals(byte abyte0[][][], byte abyte1[][][])
    {
        if (abyte0.length == abyte1.length) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        boolean flag;
        int i = abyte0.length - 1;
        flag = true;
label0:
        do
        {
label1:
            {
                if (i < 0)
                {
                    break label1;
                }
                if (abyte0[i].length != abyte1[i].length)
                {
                    break label0;
                }
                int j = abyte0[i].length;
                for (j--; j >= 0; j--)
                {
                    flag &= equals(abyte0[i][j], abyte1[i][j]);
                }

                i--;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return flag;
    }

    public static byte[] fromHexString(String s)
    {
        byte abyte0[];
        int i;
        int j;
        boolean flag = false;
        s = s.toUpperCase().toCharArray();
        i = 0;
        int k;
        for (j = 0; i < s.length; j = k)
        {
label0:
            {
                if (s[i] < '0' || s[i] > '9')
                {
                    k = j;
                    if (s[i] < 'A')
                    {
                        break label0;
                    }
                    k = j;
                    if (s[i] > 'F')
                    {
                        break label0;
                    }
                }
                k = j + 1;
            }
            i++;
        }

        abyte0 = new byte[j + 1 >> 1];
        j &= 1;
        i = ((flag) ? 1 : 0);
_L10:
        if (i >= s.length) goto _L2; else goto _L1
_L1:
        if (s[i] < '0' || s[i] > '9') goto _L4; else goto _L3
_L3:
        int l = j >> 1;
        abyte0[l] = (byte)(abyte0[l] << 4);
        l = j >> 1;
        abyte0[l] = (byte)(abyte0[l] | s[i] - 48);
_L8:
        int i1 = j + 1;
_L6:
        i++;
        j = i1;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = j;
        if (s[i] < 'A') goto _L6; else goto _L5
_L5:
        i1 = j;
        if (s[i] > 'F') goto _L6; else goto _L7
_L7:
        int j1 = j >> 1;
        abyte0[j1] = (byte)(abyte0[j1] << 4);
        j1 = j >> 1;
        abyte0[j1] = (byte)(abyte0[j1] | (s[i] - 65) + 10);
        if (true) goto _L8; else goto _L2
_L2:
        return abyte0;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public static byte[][] split(byte abyte0[], int i)
    {
        if (i > abyte0.length)
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            byte abyte1[][] = new byte[2][];
            abyte1[0] = new byte[i];
            abyte1[1] = new byte[abyte0.length - i];
            System.arraycopy(abyte0, 0, abyte1[0], 0, i);
            System.arraycopy(abyte0, i, abyte1[1], 0, abyte0.length - i);
            return abyte1;
        }
    }

    public static byte[] subArray(byte abyte0[], int i)
    {
        return subArray(abyte0, i, abyte0.length);
    }

    public static byte[] subArray(byte abyte0[], int i, int j)
    {
        byte abyte1[] = new byte[j - i];
        System.arraycopy(abyte0, i, abyte1, 0, j - i);
        return abyte1;
    }

    public static String toBinaryString(byte abyte0[])
    {
        String s = "";
        for (int i = 0; i < abyte0.length;)
        {
            byte byte0 = abyte0[i];
            for (int j = 0; j < 8; j++)
            {
                s = (new StringBuilder()).append(s).append(byte0 >>> j & 1).toString();
            }

            String s1 = s;
            if (i != abyte0.length - 1)
            {
                s1 = (new StringBuilder()).append(s).append(" ").toString();
            }
            i++;
            s = s1;
        }

        return s;
    }

    public static char[] toCharArray(byte abyte0[])
    {
        char ac[] = new char[abyte0.length];
        for (int i = 0; i < abyte0.length; i++)
        {
            ac[i] = (char)abyte0[i];
        }

        return ac;
    }

    public static String toHexString(byte abyte0[])
    {
        String s = "";
        for (int i = 0; i < abyte0.length; i++)
        {
            s = (new StringBuilder()).append(s).append(HEX_CHARS[abyte0[i] >>> 4 & 0xf]).toString();
            s = (new StringBuilder()).append(s).append(HEX_CHARS[abyte0[i] & 0xf]).toString();
        }

        return s;
    }

    public static String toHexString(byte abyte0[], String s, String s1)
    {
        s = new String(s);
        for (int i = 0; i < abyte0.length; i++)
        {
            s = (new StringBuilder()).append(s).append(HEX_CHARS[abyte0[i] >>> 4 & 0xf]).toString();
            String s2 = (new StringBuilder()).append(s).append(HEX_CHARS[abyte0[i] & 0xf]).toString();
            s = s2;
            if (i < abyte0.length - 1)
            {
                s = (new StringBuilder()).append(s2).append(s1).toString();
            }
        }

        return s;
    }

    public static byte[] xor(byte abyte0[], byte abyte1[])
    {
        byte abyte2[] = new byte[abyte0.length];
        for (int i = abyte0.length - 1; i >= 0; i--)
        {
            abyte2[i] = (byte)(abyte0[i] ^ abyte1[i]);
        }

        return abyte2;
    }

}
