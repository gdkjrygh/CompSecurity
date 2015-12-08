// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            Preconditions

public final class Utf8
{

    private Utf8()
    {
    }

    public static int encodedLength(CharSequence charsequence)
    {
        int j;
        int i1;
label0:
        {
            i1 = charsequence.length();
            int l = i1;
            j = 0;
            int i;
            int k;
            do
            {
                k = j;
                i = l;
                if (j >= i1)
                {
                    break;
                }
                k = j;
                i = l;
                if (charsequence.charAt(j) >= '\200')
                {
                    break;
                }
                j++;
            } while (true);
            do
            {
                j = i;
                if (k >= i1)
                {
                    break label0;
                }
                j = charsequence.charAt(k);
                if (j >= 2048)
                {
                    break;
                }
                i += 127 - j >>> 31;
                k++;
            } while (true);
            j = i + encodedLengthGeneral(charsequence, k);
        }
        if (j < i1)
        {
            long l1 = j;
            throw new IllegalArgumentException((new StringBuilder(54)).append("UTF-8 length does not fit in int: ").append(l1 + 0x100000000L).toString());
        } else
        {
            return j;
        }
    }

    private static int encodedLengthGeneral(CharSequence charsequence, int i)
    {
        int i1 = charsequence.length();
        int j = 0;
        while (i < i1) 
        {
            char c = charsequence.charAt(i);
            int k;
            if (c < '\u0800')
            {
                j += 127 - c >>> 31;
                k = i;
            } else
            {
                int l = j + 2;
                k = i;
                j = l;
                if ('\uD800' <= c)
                {
                    k = i;
                    j = l;
                    if (c <= '\uDFFF')
                    {
                        if (Character.codePointAt(charsequence, i) < 0x10000)
                        {
                            throw new IllegalArgumentException((new StringBuilder(39)).append("Unpaired surrogate at index ").append(i).toString());
                        }
                        k = i + 1;
                        j = l;
                    }
                }
            }
            i = k + 1;
        }
        return j;
    }

    public static boolean isWellFormed(byte abyte0[])
    {
        return isWellFormed(abyte0, 0, abyte0.length);
    }

    public static boolean isWellFormed(byte abyte0[], int i, int j)
    {
        j = i + j;
        Preconditions.checkPositionIndexes(i, j, abyte0.length);
        for (; i < j; i++)
        {
            if (abyte0[i] < 0)
            {
                return isWellFormedSlowPath(abyte0, i, j);
            }
        }

        return true;
    }

    private static boolean isWellFormedSlowPath(byte abyte0[], int i, int j)
    {
        boolean flag1 = false;
_L20:
        if (i < j) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L6:
        return flag;
_L2:
        int i1;
        byte byte0;
        i1 = i + 1;
        byte0 = abyte0[i];
        if (byte0 >= 0)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        if (byte0 >= -32) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (i1 == j) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (byte0 < -62) goto _L6; else goto _L7
_L7:
        int k = i1 + 1;
        i = k;
        if (abyte0[i1] <= -65)
        {
            break; /* Loop/switch isn't completed */
        }
        i = k;
_L10:
        return false;
_L4:
        if (byte0 >= -16)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        flag = flag1;
        if (i1 + 1 >= j) goto _L6; else goto _L8
_L8:
        int l;
        l = i1 + 1;
        i1 = abyte0[i1];
        i = l;
        if (i1 > -65) goto _L10; else goto _L9
_L9:
        if (byte0 != -32)
        {
            break; /* Loop/switch isn't completed */
        }
        i = l;
        if (i1 < -96) goto _L10; else goto _L11
_L11:
        if (byte0 != -19)
        {
            break; /* Loop/switch isn't completed */
        }
        i = l;
        if (-96 <= i1) goto _L10; else goto _L12
_L12:
        i = l + 1;
        flag = flag1;
        if (abyte0[l] > -65) goto _L6; else goto _L13
_L13:
        continue; /* Loop/switch isn't completed */
        flag = flag1;
        if (i1 + 2 >= j) goto _L6; else goto _L14
_L14:
        l = i1 + 1;
        i1 = abyte0[i1];
        i = l;
        if (i1 > -65) goto _L10; else goto _L15
_L15:
        i = l;
        if ((byte0 << 28) + (i1 + 112) >> 30 != 0) goto _L10; else goto _L16
_L16:
        i1 = l + 1;
        flag = flag1;
        if (abyte0[l] > -65) goto _L6; else goto _L17
_L17:
        l = i1 + 1;
        i = l;
        if (abyte0[i1] > -65) goto _L10; else goto _L18
_L18:
        i = l;
        continue; /* Loop/switch isn't completed */
        i = i1;
        if (true) goto _L20; else goto _L19
_L19:
    }
}
