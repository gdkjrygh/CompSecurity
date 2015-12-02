// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.backport.util;

import java.io.UnsupportedEncodingException;

public class Base64
{

    static final boolean $assertionsDisabled;
    public static int a;
    private static final String z[];

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
        Decoder decoder;
label0:
        {
            decoder = new Decoder(k, new byte[(j * 3) / 4]);
            try
            {
                if (!decoder.process(abyte0, i, j, true))
                {
                    throw new IllegalArgumentException(z[0]);
                }
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            try
            {
                if (decoder.op != decoder.output.length)
                {
                    break label0;
                }
                abyte0 = decoder.output;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            return abyte0;
        }
        abyte0 = new byte[decoder.op];
        System.arraycopy(decoder.output, 0, abyte0, 0, decoder.op);
        return abyte0;
    }

    public static byte[] encode(byte abyte0[], int i)
    {
        return encode(abyte0, 0, abyte0.length, i);
    }

    public static byte[] encode(byte abyte0[], int i, int j, int k)
    {
        Encoder encoder;
        int l;
        int j1;
        j1 = a;
        encoder = new Encoder(k, null);
        int i1 = (j / 3) * 4;
        boolean flag;
        try
        {
            flag = encoder.do_padding;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            try
            {
                throw abyte0;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[]) { }
            try
            {
                throw abyte0;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[]) { }
            try
            {
                throw abyte0;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[]) { }
            try
            {
                throw abyte0;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[]) { }
            try
            {
                throw abyte0;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        l = i1;
        if (!flag) goto _L2; else goto _L1
_L1:
        k = i1;
        if (j % 3 <= 0) goto _L4; else goto _L3
_L3:
        l = i1 + 4;
        k = l;
        if (j1 == 0) goto _L4; else goto _L2
_L2:
        k = l;
        j % 3;
        JVM INSTR tableswitch 0 2: default 96
    //                   0 214
    //                   1 222
    //                   2 239;
           goto _L5 _L6 _L7 _L8
_L5:
        k = l;
_L4:
        flag = encoder.do_newline;
        if (flag && j > 0)
        {
            try
            {
                i1 = (j - 1) / 57;
                flag = encoder.do_cr;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            if (flag)
            {
                l = 2;
            } else
            {
                l = 1;
            }
            k = l * (i1 + 1) + k;
        }
        encoder.output = new byte[k];
        encoder.process(abyte0, i, j, true);
        flag = $assertionsDisabled;
        if (!flag)
        {
            try
            {
                if (encoder.op != k)
                {
                    throw new AssertionError();
                }
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        break; /* Loop/switch isn't completed */
_L6:
        k = l;
        if (j1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L7:
        l += 2;
        k = l;
        if (j1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = l;
_L8:
        k += 3;
        if (true) goto _L4; else goto _L9
        abyte0;
        try
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        throw abyte0;
        abyte0;
        throw abyte0;
_L9:
        return encoder.output;
    }

    public static String encodeToString(byte abyte0[], int i)
    {
        try
        {
            abyte0 = new String(encode(abyte0, i), z[1]);
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
        Object obj;
        String as[];
        byte byte1;
        int i;
        boolean flag;
        flag = true;
        as = new String[2];
        obj = "lP\004\0016oB\005\fb:";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "[bM`\007Mx)";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                byte byte0;
                char c;
                boolean flag1;
                try
                {
                    flag1 = android/backport/util/Base64.desiredAssertionStatus();
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    throw illegalargumentexception;
                }
                if (flag1)
                {
                    flag = false;
                }
                $assertionsDisabled = flag;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte0 = 84;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 14;
          goto _L9
_L5:
        byte0 = 49;
          goto _L9
_L6:
        byte0 = 96;
          goto _L9
        byte0 = 33;
          goto _L9
    }

    private class Decoder extends Coder
    {
        private class Coder
        {

            public int op;
            public byte output[];

            Coder()
            {
            }
        }


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
        private final int alphabet[];
        private int state;
        private int value;

        public boolean process(byte abyte0[], int i, int j, boolean flag)
        {
            byte abyte1[];
            int ai[];
            int k;
            int l;
            int j2;
            if (state == 6)
            {
                return false;
            }
            j2 = j + i;
            l = state;
            j = value;
            k = 0;
            abyte1 = output;
            ai = alphabet;
            break MISSING_BLOCK_LABEL_42;
            j = ai[abyte0[i2] & 0xff];
            l;
            JVM INSTR tableswitch 0 5: default 292
        //                       0 313
        //                       1 342
        //                       2 379
        //                       3 446
        //                       4 556
        //                       5 590;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            i = l;
            j = k1;
            k = i1;
_L8:
            l = i;
            i = i2 + 1;
            continue; /* Loop/switch isn't completed */
_L2:
            if (j < 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            i = l + 1;
            k = i1;
              goto _L8
            if (j == -1) goto _L1; else goto _L9
_L9:
            state = 6;
            return false;
_L3:
            if (j < 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            j = k1 << 6 | j;
            i = l + 1;
            k = i1;
              goto _L8
            if (j == -1) goto _L1; else goto _L10
_L10:
            state = 6;
            return false;
_L4:
            if (j >= 0)
            {
                j = k1 << 6 | j;
                i = l + 1;
                k = i1;
            } else
            {
                if (j != -2)
                {
                    continue; /* Loop/switch isn't completed */
                }
                abyte1[i1] = (byte)(k1 >> 4);
                i = 4;
                k = i1 + 1;
                j = k1;
            }
              goto _L8
            if (j == -1) goto _L1; else goto _L11
_L11:
            state = 6;
            return false;
_L5:
            if (j >= 0)
            {
                j = k1 << 6 | j;
                abyte1[i1 + 2] = (byte)j;
                abyte1[i1 + 1] = (byte)(j >> 8);
                abyte1[i1] = (byte)(j >> 16);
                k = i1 + 3;
                i = 0;
            } else
            {
                if (j != -2)
                {
                    continue; /* Loop/switch isn't completed */
                }
                abyte1[i1 + 1] = (byte)(k1 >> 2);
                abyte1[i1] = (byte)(k1 >> 10);
                k = i1 + 2;
                i = 5;
                j = k1;
            }
              goto _L8
            if (j == -1) goto _L1; else goto _L12
_L12:
            state = 6;
            return false;
_L6:
            if (j != -2)
            {
                continue; /* Loop/switch isn't completed */
            }
            i = l + 1;
            k = i1;
            j = k1;
              goto _L8
            if (j == -1) goto _L1; else goto _L13
_L13:
            state = 6;
            return false;
_L7:
            if (j == -1) goto _L1; else goto _L14
_L14:
            state = 6;
            return false;
_L23:
            int i1;
            int k1;
            int i2;
            if (i < j2)
            {
                i1 = k;
                k1 = j;
                i2 = i;
                if (l != 0)
                {
                    break MISSING_BLOCK_LABEL_238;
                }
                int l1 = i;
                i = j;
                do
                {
                    if (l1 + 4 > j2)
                    {
                        break;
                    }
                    j = ai[abyte0[l1] & 0xff] << 18 | ai[abyte0[l1 + 1] & 0xff] << 12 | ai[abyte0[l1 + 2] & 0xff] << 6 | ai[abyte0[l1 + 3] & 0xff];
                    i = j;
                    if (j < 0)
                    {
                        break;
                    }
                    abyte1[k + 2] = (byte)j;
                    abyte1[k + 1] = (byte)(j >> 8);
                    abyte1[k] = (byte)(j >> 16);
                    k += 3;
                    l1 += 4;
                    i = j;
                } while (true);
                i1 = k;
                k1 = i;
                i2 = l1;
                if (l1 < j2)
                {
                    break MISSING_BLOCK_LABEL_238;
                }
                j = i;
            }
            if (!flag)
            {
                state = l;
                value = j;
                op = k;
                return true;
            }
            i = k;
            l;
            JVM INSTR tableswitch 0 4: default 644
        //                       0 647
        //                       1 660
        //                       2 668
        //                       3 685
        //                       4 718;
               goto _L15 _L16 _L17 _L18 _L19 _L20
_L16:
            break; /* Loop/switch isn't completed */
_L15:
            i = k;
_L21:
            state = l;
            op = i;
            return true;
_L17:
            state = 6;
            return false;
_L18:
            abyte1[k] = (byte)(j >> 4);
            i = k + 1;
            continue; /* Loop/switch isn't completed */
_L19:
            int j1 = k + 1;
            abyte1[k] = (byte)(j >> 10);
            i = j1 + 1;
            abyte1[j1] = (byte)(j >> 2);
            if (true) goto _L21; else goto _L20
_L20:
            state = 6;
            return false;
            if (true) goto _L23; else goto _L22
_L22:
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


    private class Encoder extends Coder
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
        //                       0 905
        //                       1 916
        //                       2 1003;
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

        public Encoder(int i, byte abyte0[])
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

}
