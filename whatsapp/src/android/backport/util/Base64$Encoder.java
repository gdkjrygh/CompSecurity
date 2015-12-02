// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.backport.util;

import com.whatsapp.DialogToastActivity;

// Referenced classes of package android.backport.util:
//            Base64

class count extends count
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
    private final byte alphabet[];
    private int count;
    public final boolean do_cr;
    public final boolean do_newline;
    public final boolean do_padding;
    private final byte tail[] = new byte[2];
    int tailLen;

    public boolean process(byte abyte0[], int i, int j, boolean flag)
    {
        byte abyte1[];
        byte abyte2[];
        int k;
        int l;
        int j1;
        boolean flag1;
        int l1;
        int i2;
        l1 = Base64.a;
        abyte1 = alphabet;
        abyte2 = output;
        flag1 = false;
        j1 = count;
        i2 = j + i;
        l = -1;
        j = l;
        k = i;
        tailLen;
        JVM INSTR tableswitch 0 2: default 72
    //                   0 905
    //                   1 916
    //                   2 1003;
           goto _L1 _L2 _L3 _L4
_L1:
        k = i;
        j = l;
_L15:
        int i1 = j;
_L23:
        i = j1;
        l = k;
        j = ((flag1) ? 1 : 0);
        if (i1 != -1)
        {
            abyte2[0] = abyte1[i1 >> 18 & 0x3f];
            abyte2[1] = abyte1[i1 >> 12 & 0x3f];
            abyte2[2] = abyte1[i1 >> 6 & 0x3f];
            j = 4;
            abyte2[3] = abyte1[i1 & 0x3f];
            i1 = j1 - 1;
            i = i1;
            l = k;
            if (i1 == 0)
            {
                byte abyte3[];
                int k1;
                if (do_cr)
                {
                    i = 5;
                    abyte2[4] = 13;
                } else
                {
                    i = 4;
                }
                j = i + 1;
                abyte2[i] = 10;
                i = 19;
                l = k;
            }
        }
label0:
        do
        {
            do
            {
                k1 = i;
                i1 = l;
                k = j;
                if (l + 3 > i2)
                {
                    break label0;
                }
                k = (abyte0[l] & 0xff) << 16 | (abyte0[l + 1] & 0xff) << 8 | abyte0[l + 2] & 0xff;
                abyte2[j] = abyte1[k >> 18 & 0x3f];
                abyte2[j + 1] = abyte1[k >> 12 & 0x3f];
                abyte2[j + 2] = abyte1[k >> 6 & 0x3f];
                abyte2[j + 3] = abyte1[k & 0x3f];
                i1 = l + 3;
                k = j + 4;
                k1 = i - 1;
                i = k1;
                j = k;
                l = i1;
            } while (k1 != 0);
            if (do_cr)
            {
                i = k + 1;
                abyte2[k] = 13;
            } else
            {
                i = k;
            }
            k = i + 1;
            abyte2[i] = 10;
            k1 = 19;
            i = k1;
            l = i1;
            j = k;
        } while (l1 == 0);
        if (!flag) goto _L6; else goto _L5
_L5:
        if (i1 - tailLen != i2 - 1) goto _L8; else goto _L7
_L7:
        if (tailLen > 0)
        {
            abyte3 = tail;
            j = 1;
            l = abyte3[0];
            i = i1;
        } else
        {
            l = abyte0[i1];
            i = i1 + 1;
            j = 0;
        }
        l = (l & 0xff) << 4;
        tailLen = tailLen - j;
        j = k + 1;
        abyte2[k] = abyte1[l >> 6 & 0x3f];
        k = j + 1;
        abyte2[j] = abyte1[l & 0x3f];
        j = k;
        if (do_padding)
        {
            l = k + 1;
            abyte2[k] = 61;
            j = l + 1;
            abyte2[l] = 61;
        }
        k = j;
        if (do_newline)
        {
            k = j;
            if (do_cr)
            {
                abyte2[j] = 13;
                k = j + 1;
            }
            abyte2[k] = 10;
            k++;
        }
        if (l1 == 0) goto _L10; else goto _L9
_L9:
        if (i - tailLen != i2 - 2) goto _L12; else goto _L11
_L11:
        if (tailLen > 1)
        {
            l = tail[0];
            i1 = 1;
            j = i;
            i = i1;
        } else
        {
            j = i + 1;
            l = abyte0[i];
            i = 0;
        }
        if (tailLen > 0)
        {
            i1 = tail[i];
            i++;
        } else
        {
            i1 = abyte0[j];
            j++;
        }
        l = (l & 0xff) << 10 | (i1 & 0xff) << 2;
        tailLen = tailLen - i;
        i = k + 1;
        abyte2[k] = abyte1[l >> 12 & 0x3f];
        k = i + 1;
        abyte2[i] = abyte1[l >> 6 & 0x3f];
        i = k + 1;
        abyte2[k] = abyte1[l & 0x3f];
        if (do_padding)
        {
            k = i + 1;
            abyte2[i] = 61;
            i = k;
        }
        k = i;
        if (do_newline)
        {
            k = i;
            if (do_cr)
            {
                abyte2[i] = 13;
                k = i + 1;
            }
            abyte2[k] = 10;
            k++;
        }
        i = k;
        l = j;
        if (l1 == 0) goto _L14; else goto _L13
_L13:
        i = k;
        l = j;
        if (do_newline)
        {
            i = k;
            l = j;
            if (k > 0)
            {
                i = k;
                l = j;
                if (k1 != 19)
                {
                    i = k;
                    if (do_cr)
                    {
                        abyte2[k] = 13;
                        i = k + 1;
                    }
                    abyte2[i] = 10;
                    i++;
                    l = j;
                }
            }
        }
          goto _L14
_L2:
        j = l;
        k = i;
        if (l1 == 0) goto _L15; else goto _L3
_L3:
        j = l;
        k = i;
        if (i + 2 > i2) goto _L15; else goto _L16
_L16:
        j = tail[0];
        k = i + 1;
        l = abyte0[i];
        i = k + 1;
        l = (j & 0xff) << 16 | (l & 0xff) << 8 | abyte0[k] & 0xff;
        tailLen = 0;
        j = l;
        k = i;
        if (l1 == 0) goto _L15; else goto _L17
_L17:
        k = i;
        j = l;
_L4:
        if (k + 1 > i2) goto _L19; else goto _L18
_L18:
        j = tail[0];
        l = tail[1];
        i = k + 1;
        j = (j & 0xff) << 16 | (l & 0xff) << 8 | abyte0[k] & 0xff;
        tailLen = 0;
        k = i;
          goto _L15
_L14:
        if (!$assertionsDisabled && tailLen != 0)
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && l != i2)
        {
            throw new AssertionError();
        }
          goto _L20
_L6:
        if (i1 != i2 - 1) goto _L22; else goto _L21
_L21:
        abyte1 = tail;
        i = tailLen;
        tailLen = i + 1;
        abyte1[i] = abyte0[i1];
        i = k;
        if (l1 == 0) goto _L20; else goto _L22
_L22:
        i = k;
        if (i1 == i2 - 2)
        {
            abyte1 = tail;
            i = tailLen;
            tailLen = i + 1;
            abyte1[i] = abyte0[i1];
            abyte1 = tail;
            i = tailLen;
            tailLen = i + 1;
            abyte1[i] = abyte0[i1 + 1];
            i = k;
        }
_L20:
        op = i;
        count = k1;
        if (DialogToastActivity.g != 0)
        {
            Base64.a = l1 + 1;
        }
        return true;
_L12:
        j = i;
          goto _L13
_L10:
        l = i;
        i = k;
          goto _L14
_L8:
        i = i1;
          goto _L9
_L19:
        i1 = j;
          goto _L23
    }

    static 
    {
        boolean flag;
        if (!android/backport/util/Base64.desiredAssertionStatus())
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
        int j = Base64.a;
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
        if (j != 0)
        {
            DialogToastActivity.g++;
        }
    }
}
