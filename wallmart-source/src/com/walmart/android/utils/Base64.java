// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import java.io.UnsupportedEncodingException;

public class Base64
{
    static abstract class Coder
    {

        public int op;
        public byte output[];

        public abstract int maxOutputSize(int i);

        public abstract boolean process(byte abyte0[], int i, int j, boolean flag);

        Coder()
        {
        }
    }

    static class Decoder extends Coder
    {

        private static final int DECODE[] = {
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 
            54, 55, 56, 57, 58, 59, 60, 61, -1, -1, 
            -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 
            5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
            15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
            25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 
            29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
            39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
            49, 50, 51, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1
        };
        private static final int DECODE_WEBSAFE[] = {
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 
            54, 55, 56, 57, 58, 59, 60, 61, -1, -1, 
            -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 
            5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
            15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
            25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 
            29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
            39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
            49, 50, 51, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
            -1, -1, -1, -1, -1, -1
        };
        private static final int EQUALS = -2;
        private static final int SKIP = -1;
        private final int alphabet[];
        private int state;
        private int value;

        public int maxOutputSize(int i)
        {
            return (i * 3) / 4 + 10;
        }

        public boolean process(byte abyte0[], int i, int j, boolean flag)
        {
            byte abyte1[];
            int ai[];
            int k;
            int l;
            int k1;
            int i2;
            if (state == 6)
            {
                return false;
            }
            l = i;
            i2 = j + i;
            k1 = state;
            j = value;
            k = 0;
            abyte1 = output;
            ai = alphabet;
_L12:
            int i1;
            int j1;
            int l1;
            if (l >= i2)
            {
                break MISSING_BLOCK_LABEL_806;
            }
            i1 = k;
            l1 = l;
            j1 = j;
            if (k1 != 0) goto _L2; else goto _L1
_L1:
            i = j;
            do
            {
                if (l + 4 > i2)
                {
                    break;
                }
                j = ai[abyte0[l] & 0xff] << 18 | ai[abyte0[l + 1] & 0xff] << 12 | ai[abyte0[l + 2] & 0xff] << 6 | ai[abyte0[l + 3] & 0xff];
                i = j;
                if (j < 0)
                {
                    break;
                }
                abyte1[k + 2] = (byte)j;
                abyte1[k + 1] = (byte)(j >> 8);
                abyte1[k] = (byte)(j >> 16);
                k += 3;
                l += 4;
                i = j;
            } while (true);
            i1 = k;
            l1 = l;
            j1 = i;
            if (l < i2) goto _L2; else goto _L3
_L3:
            j = i;
            i = k;
_L25:
            if (!flag)
            {
                state = k1;
                value = j;
                op = i;
                return true;
            }
              goto _L4
_L2:
            l = ai[abyte0[l1] & 0xff];
            k1;
            JVM INSTR tableswitch 0 5: default 296
        //                       0 318
        //                       1 362
        //                       2 412
        //                       3 493
        //                       4 617
        //                       5 663;
               goto _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L5:
            j = j1;
            i = k1;
            k = i1;
_L13:
            l = l1 + 1;
            k1 = i;
              goto _L12
_L6:
label0:
            {
                if (l < 0)
                {
                    break label0;
                }
                j = l;
                i = k1 + 1;
                k = i1;
            }
              goto _L13
            k = i1;
            i = k1;
            j = j1;
            if (l == -1) goto _L13; else goto _L14
_L14:
            state = 6;
            return false;
_L7:
label1:
            {
                if (l < 0)
                {
                    break label1;
                }
                j = j1 << 6 | l;
                i = k1 + 1;
                k = i1;
            }
              goto _L13
            k = i1;
            i = k1;
            j = j1;
            if (l == -1) goto _L13; else goto _L15
_L15:
            state = 6;
            return false;
_L8:
            if (l >= 0)
            {
                j = j1 << 6 | l;
                i = k1 + 1;
                k = i1;
            } else
            {
label2:
                {
                    if (l != -2)
                    {
                        break label2;
                    }
                    abyte1[i1] = (byte)(j1 >> 4);
                    i = 4;
                    k = i1 + 1;
                    j = j1;
                }
            }
              goto _L13
            k = i1;
            i = k1;
            j = j1;
            if (l == -1) goto _L13; else goto _L16
_L16:
            state = 6;
            return false;
_L9:
            if (l >= 0)
            {
                j = j1 << 6 | l;
                abyte1[i1 + 2] = (byte)j;
                abyte1[i1 + 1] = (byte)(j >> 8);
                abyte1[i1] = (byte)(j >> 16);
                k = i1 + 3;
                i = 0;
            } else
            {
label3:
                {
                    if (l != -2)
                    {
                        break label3;
                    }
                    abyte1[i1 + 1] = (byte)(j1 >> 2);
                    abyte1[i1] = (byte)(j1 >> 10);
                    k = i1 + 2;
                    i = 5;
                    j = j1;
                }
            }
              goto _L13
            k = i1;
            i = k1;
            j = j1;
            if (l == -1) goto _L13; else goto _L17
_L17:
            state = 6;
            return false;
_L10:
label4:
            {
                if (l != -2)
                {
                    break label4;
                }
                i = k1 + 1;
                k = i1;
                j = j1;
            }
              goto _L13
            k = i1;
            i = k1;
            j = j1;
            if (l == -1) goto _L13; else goto _L18
_L18:
            state = 6;
            return false;
_L11:
            k = i1;
            i = k1;
            j = j1;
            if (l == -1) goto _L13; else goto _L19
_L19:
            state = 6;
            return false;
_L4:
            k1;
            JVM INSTR tableswitch 0 4: default 724
        //                       0 737
        //                       1 740
        //                       2 748
        //                       3 767
        //                       4 798;
               goto _L20 _L20 _L21 _L22 _L23 _L24
_L20:
            state = k1;
            op = i;
            return true;
_L21:
            state = 6;
            return false;
_L22:
            k = i + 1;
            abyte1[i] = (byte)(j >> 4);
            i = k;
            continue; /* Loop/switch isn't completed */
_L23:
            k = i + 1;
            abyte1[i] = (byte)(j >> 10);
            abyte1[k] = (byte)(j >> 2);
            i = k + 1;
            if (true) goto _L20; else goto _L24
_L24:
            state = 6;
            return false;
            i = k;
              goto _L25
        }


        public Decoder(int i, byte abyte0[])
        {
            output = abyte0;
            if ((i & 8) == 0)
            {
                abyte0 = DECODE;
            } else
            {
                abyte0 = DECODE_WEBSAFE;
            }
            alphabet = abyte0;
            state = 0;
            value = 0;
        }
    }

    static class Encoder extends Coder
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
        //                       0 74
        //                       1 408
        //                       2 484;
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
            if (!com/walmart/android/utils/Base64.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $assertionsDisabled = flag;
        }

        public Encoder(int i, byte abyte0[])
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


    static final boolean $assertionsDisabled;
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;

    private Base64()
    {
    }

    public static byte[] decode(String s, int i)
    {
        return decode(s.getBytes(), i);
    }

    public static byte[] decode(byte abyte0[], int i)
    {
        return decode(abyte0, 0, abyte0.length, i);
    }

    public static byte[] decode(byte abyte0[], int i, int j, int k)
    {
        Decoder decoder = new Decoder(k, new byte[(j * 3) / 4]);
        if (!decoder.process(abyte0, i, j, true))
        {
            throw new IllegalArgumentException("bad base-64");
        }
        if (decoder.op == decoder.output.length)
        {
            return decoder.output;
        } else
        {
            abyte0 = new byte[decoder.op];
            System.arraycopy(decoder.output, 0, abyte0, 0, decoder.op);
            return abyte0;
        }
    }

    public static byte[] encode(byte abyte0[], int i)
    {
        return encode(abyte0, 0, abyte0.length, i);
    }

    public static byte[] encode(byte abyte0[], int i, int j, int k)
    {
        Encoder encoder;
        int l;
        encoder = new Encoder(k, null);
        l = (j / 3) * 4;
        if (!encoder.do_padding) goto _L2; else goto _L1
_L1:
        k = l;
        if (j % 3 > 0)
        {
            k = l + 4;
        }
_L4:
        l = k;
        if (encoder.do_newline)
        {
            l = k;
            if (j > 0)
            {
                int i1 = (j - 1) / 57;
                if (encoder.do_cr)
                {
                    l = 2;
                } else
                {
                    l = 1;
                }
                l = k + l * (i1 + 1);
            }
        }
        encoder.output = new byte[l];
        encoder.process(abyte0, i, j, true);
        if (!$assertionsDisabled && encoder.op != l)
        {
            throw new AssertionError();
        } else
        {
            return encoder.output;
        }
_L2:
        k = l;
        switch (j % 3)
        {
        default:
            k = l;
            break;

        case 1: // '\001'
            k = l + 2;
            break;

        case 2: // '\002'
            k = l + 3;
            break;

        case 0: // '\0'
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String encodeToString(byte abyte0[], int i)
    {
        try
        {
            abyte0 = new String(encode(abyte0, i), "US-ASCII");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AssertionError(abyte0);
        }
        return abyte0;
    }

    public static String encodeToString(byte abyte0[], int i, int j, int k)
    {
        try
        {
            abyte0 = new String(encode(abyte0, i, j, k), "US-ASCII");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AssertionError(abyte0);
        }
        return abyte0;
    }

    static 
    {
        boolean flag;
        if (!com/walmart/android/utils/Base64.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
