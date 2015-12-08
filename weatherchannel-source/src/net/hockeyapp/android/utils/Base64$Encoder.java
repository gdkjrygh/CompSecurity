// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.utils;


// Referenced classes of package net.hockeyapp.android.utils:
//            Base64

static class count extends count
{

    static final boolean $assertionsDisabled;
    private static final byte ENCODE[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47
    };
    private static final byte ENCODE_WEBSAFE[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 45, 95
    };
    public static final int LINE_GROUPS = 19;
    private final byte alphabet[];
    private int count;
    public final boolean do_cr;
    public final boolean do_newline;
    public final boolean do_padding;
    private final byte tail[] = new byte[2];
    int tailLen;

    public int maxOutputSize(int i)
    {
        return (i * 8) / 5 + 10;
    }

    public boolean process(byte abyte0[], int i, int j, boolean flag)
    {
        byte abyte1[];
        byte abyte4[];
        int k;
        int l;
        int l1;
        int i3;
        int j3;
        abyte1 = alphabet;
        abyte4 = output;
        l1 = 0;
        i3 = count;
        k = i;
        j3 = j + i;
        j = -1;
        i = k;
        l = j;
        tailLen;
        JVM INSTR tableswitch 0 2: default 68
    //                   0 74
    //                   1 408
    //                   2 484;
           goto _L1 _L2 _L3 _L4
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        l = j;
        i = k;
_L6:
        j = i3;
        k = l1;
        l1 = i;
        if (l == -1)
        {
            break MISSING_BLOCK_LABEL_1242;
        }
        k = 0 + 1;
        abyte4[0] = abyte1[l >> 18 & 0x3f];
        j = k + 1;
        abyte4[k] = abyte1[l >> 12 & 0x3f];
        k = j + 1;
        abyte4[j] = abyte1[l >> 6 & 0x3f];
        int i2 = k + 1;
        abyte4[k] = abyte1[l & 0x3f];
        l = i3 - 1;
        j = l;
        k = i2;
        l1 = i;
        if (l != 0)
        {
            break MISSING_BLOCK_LABEL_1242;
        }
        j = i2;
        if (do_cr)
        {
            abyte4[i2] = 13;
            j = i2 + 1;
        }
        k = j + 1;
        abyte4[j] = 10;
        l1 = 19;
        j = i;
        i = k;
_L15:
        for (; j + 3 <= j3; j = l)
        {
            k = (abyte0[j] & 0xff) << 16 | (abyte0[j + 1] & 0xff) << 8 | abyte0[j + 2] & 0xff;
            abyte4[i] = abyte1[k >> 18 & 0x3f];
            abyte4[i + 1] = abyte1[k >> 12 & 0x3f];
            abyte4[i + 2] = abyte1[k >> 6 & 0x3f];
            abyte4[i + 3] = abyte1[k & 0x3f];
            l = j + 3;
            i += 4;
            int j2 = l1 - 1;
            j = j2;
            k = i;
            l1 = l;
            if (j2 != 0)
            {
                break MISSING_BLOCK_LABEL_1242;
            }
            j = i;
            if (do_cr)
            {
                abyte4[i] = 13;
                j = i + 1;
            }
            i = j + 1;
            abyte4[j] = 10;
            l1 = 19;
        }

          goto _L5
_L3:
        i = k;
        l = j;
        if (k + 2 <= j3)
        {
            j = tail[0];
            l = k + 1;
            k = abyte0[k];
            i = l + 1;
            l = (j & 0xff) << 16 | (k & 0xff) << 8 | abyte0[l] & 0xff;
            tailLen = 0;
        }
          goto _L6
_L4:
        i = k;
        l = j;
        if (k + 1 <= j3)
        {
            l = (tail[0] & 0xff) << 16 | (tail[1] & 0xff) << 8 | abyte0[k] & 0xff;
            tailLen = 0;
            i = k + 1;
        }
          goto _L6
_L5:
        if (!flag) goto _L8; else goto _L7
_L7:
        if (j - tailLen != j3 - 1) goto _L10; else goto _L9
_L9:
        k = 0;
        int i1;
        if (tailLen > 0)
        {
            i1 = tail[0];
            k = 0 + 1;
        } else
        {
            int k2 = j + 1;
            i1 = abyte0[j];
            j = k2;
        }
        i1 = (i1 & 0xff) << 4;
        tailLen = tailLen - k;
        k = i + 1;
        abyte4[i] = abyte1[i1 >> 6 & 0x3f];
        i = k + 1;
        abyte4[k] = abyte1[i1 & 0x3f];
        i1 = i;
        if (do_padding)
        {
            k = i + 1;
            abyte4[i] = 61;
            i1 = k + 1;
            abyte4[k] = 61;
        }
        i = i1;
        k = j;
        if (!do_newline) goto _L12; else goto _L11
_L11:
        i = i1;
        if (do_cr)
        {
            abyte4[i1] = 13;
            i = i1 + 1;
        }
        k = i + 1;
        abyte4[i] = 10;
        i = k;
_L14:
        k = j;
_L12:
        if (!$assertionsDisabled && tailLen != 0)
        {
            throw new AssertionError();
        }
        break; /* Loop/switch isn't completed */
_L10:
        if (j - tailLen == j3 - 2)
        {
            k = 0;
            int j1;
            int l2;
            if (tailLen > 1)
            {
                j1 = tail[0];
                k = 0 + 1;
            } else
            {
                l2 = j + 1;
                j1 = abyte0[j];
                j = l2;
            }
            if (tailLen > 0)
            {
                l2 = tail[k];
                k++;
            } else
            {
                l2 = abyte0[j];
                j++;
            }
            j1 = (j1 & 0xff) << 10 | (l2 & 0xff) << 2;
            tailLen = tailLen - k;
            k = i + 1;
            abyte4[i] = abyte1[j1 >> 12 & 0x3f];
            l2 = k + 1;
            abyte4[k] = abyte1[j1 >> 6 & 0x3f];
            i = l2 + 1;
            abyte4[l2] = abyte1[j1 & 0x3f];
            j1 = i;
            if (do_padding)
            {
                abyte4[i] = 61;
                j1 = i + 1;
            }
            i = j1;
            k = j;
            if (!do_newline)
            {
                continue; /* Loop/switch isn't completed */
            }
            i = j1;
            if (do_cr)
            {
                abyte4[j1] = 13;
                i = j1 + 1;
            }
            k = i + 1;
            abyte4[i] = 10;
            i = k;
            continue; /* Loop/switch isn't completed */
        }
        k = i;
        if (do_newline)
        {
            k = i;
            if (i > 0)
            {
                k = i;
                if (l1 != 19)
                {
                    if (do_cr)
                    {
                        k = i + 1;
                        abyte4[i] = 13;
                        i = k;
                    }
                    k = i + 1;
                    abyte4[i] = 10;
                }
            }
        }
        i = k;
        k = j;
        if (true) goto _L12; else goto _L13
_L13:
        j = i;
        if (!$assertionsDisabled)
        {
            j = i;
            if (k != j3)
            {
                throw new AssertionError();
            }
        }
        break MISSING_BLOCK_LABEL_1155;
        if (true) goto _L14; else goto _L8
_L8:
        if (j == j3 - 1)
        {
            byte abyte2[] = tail;
            k = tailLen;
            tailLen = k + 1;
            abyte2[k] = abyte0[j];
            j = i;
        } else
        {
            if (j == j3 - 2)
            {
                byte abyte3[] = tail;
                k = tailLen;
                tailLen = k + 1;
                abyte3[k] = abyte0[j];
                abyte3 = tail;
                k = tailLen;
                tailLen = k + 1;
                abyte3[k] = abyte0[j + 1];
            }
            j = i;
        }
        op = j;
        count = l1;
        return true;
        int k1 = l1;
        i = k;
        l1 = j;
        j = k1;
          goto _L15
    }

    static 
    {
        boolean flag;
        if (!net/hockeyapp/android/utils/Base64.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    public (int i, byte abyte0[])
    {
        boolean flag1 = true;
        super();
        output = abyte0;
        boolean flag;
        if ((i & 1) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        do_padding = flag;
        if ((i & 2) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        do_newline = flag;
        if ((i & 4) != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        do_cr = flag;
        if ((i & 8) == 0)
        {
            abyte0 = ENCODE;
        } else
        {
            abyte0 = ENCODE_WEBSAFE;
        }
        alphabet = abyte0;
        tailLen = 0;
        if (do_newline)
        {
            i = 19;
        } else
        {
            i = -1;
        }
        count = i;
    }
}
