// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

public class RijndaelEngine
    implements BlockCipher
{

    private static final int MAXKC = 64;
    private static final int MAXROUNDS = 14;
    private static final byte S[] = {
        99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 
        103, 43, -2, -41, -85, 118, -54, -126, -55, 125, 
        -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 
        114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 
        52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 
        35, -61, 24, -106, 5, -102, 7, 18, -128, -30, 
        -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 
        90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 
        83, -47, 0, -19, 32, -4, -79, 91, 106, -53, 
        -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 
        67, 77, 51, -123, 69, -7, 2, 127, 80, 60, 
        -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, 
        -68, -74, -38, 33, 16, -1, -13, -46, -51, 12, 
        19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 
        100, 93, 25, 115, 96, -127, 79, -36, 34, 42, 
        -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, 
        -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, 
        -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, 
        -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, 
        -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, 
        -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, 
        -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, 
        -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, 
        -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, 
        -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 
        45, 15, -80, 84, -69, 22
    };
    private static final byte Si[] = {
        82, 9, 106, -43, 48, 54, -91, 56, -65, 64, 
        -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, 
        -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, 
        -23, -53, 84, 123, -108, 50, -90, -62, 35, 61, 
        -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, 
        -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 
        109, -117, -47, 37, 114, -8, -10, 100, -122, 104, 
        -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 
        108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 
        70, 87, -89, -115, -99, -124, -112, -40, -85, 0, 
        -116, -68, -45, 10, -9, -28, 88, 5, -72, -77, 
        69, 6, -48, 44, 30, -113, -54, 63, 15, 2, 
        -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 
        17, 65, 79, 103, -36, -22, -105, -14, -49, -50, 
        -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 
        53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 
        71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 
        98, 14, -86, 24, -66, 27, -4, 86, 62, 75, 
        -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 
        90, -12, 31, -35, -88, 51, -120, 7, -57, 49, 
        -79, 18, 16, 89, 39, -128, -20, 95, 96, 81, 
        127, -87, 25, -75, 74, 13, 45, -27, 122, -97, 
        -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, 
        -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 
        23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 
        20, 99, 85, 33, 12, 125
    };
    private static final byte aLogtable[] = {
        0, 3, 5, 15, 17, 51, 85, -1, 26, 46, 
        114, -106, -95, -8, 19, 53, 95, -31, 56, 72, 
        -40, 115, -107, -92, -9, 2, 6, 10, 30, 34, 
        102, -86, -27, 52, 92, -28, 55, 89, -21, 38, 
        106, -66, -39, 112, -112, -85, -26, 49, 83, -11, 
        4, 12, 20, 60, 68, -52, 79, -47, 104, -72, 
        -45, 110, -78, -51, 76, -44, 103, -87, -32, 59, 
        77, -41, 98, -90, -15, 8, 24, 40, 120, -120, 
        -125, -98, -71, -48, 107, -67, -36, 127, -127, -104, 
        -77, -50, 73, -37, 118, -102, -75, -60, 87, -7, 
        16, 48, 80, -16, 11, 29, 39, 105, -69, -42, 
        97, -93, -2, 25, 43, 125, -121, -110, -83, -20, 
        47, 113, -109, -82, -23, 32, 96, -96, -5, 22, 
        58, 78, -46, 109, -73, -62, 93, -25, 50, 86, 
        -6, 21, 63, 65, -61, 94, -30, 61, 71, -55, 
        64, -64, 91, -19, 44, 116, -100, -65, -38, 117, 
        -97, -70, -43, 100, -84, -17, 42, 126, -126, -99, 
        -68, -33, 122, -114, -119, -128, -101, -74, -63, 88, 
        -24, 35, 101, -81, -22, 37, 111, -79, -56, 67, 
        -59, 84, -4, 31, 33, 99, -91, -12, 7, 9, 
        27, 45, 119, -103, -80, -53, 70, -54, 69, -49, 
        74, -34, 121, -117, -122, -111, -88, -29, 62, 66, 
        -58, 81, -13, 14, 18, 54, 90, -18, 41, 123, 
        -115, -116, -113, -118, -123, -108, -89, -14, 13, 23, 
        57, 75, -35, 124, -124, -105, -94, -3, 28, 36, 
        108, -76, -57, 82, -10, 1, 3, 5, 15, 17, 
        51, 85, -1, 26, 46, 114, -106, -95, -8, 19, 
        53, 95, -31, 56, 72, -40, 115, -107, -92, -9, 
        2, 6, 10, 30, 34, 102, -86, -27, 52, 92, 
        -28, 55, 89, -21, 38, 106, -66, -39, 112, -112, 
        -85, -26, 49, 83, -11, 4, 12, 20, 60, 68, 
        -52, 79, -47, 104, -72, -45, 110, -78, -51, 76, 
        -44, 103, -87, -32, 59, 77, -41, 98, -90, -15, 
        8, 24, 40, 120, -120, -125, -98, -71, -48, 107, 
        -67, -36, 127, -127, -104, -77, -50, 73, -37, 118, 
        -102, -75, -60, 87, -7, 16, 48, 80, -16, 11, 
        29, 39, 105, -69, -42, 97, -93, -2, 25, 43, 
        125, -121, -110, -83, -20, 47, 113, -109, -82, -23, 
        32, 96, -96, -5, 22, 58, 78, -46, 109, -73, 
        -62, 93, -25, 50, 86, -6, 21, 63, 65, -61, 
        94, -30, 61, 71, -55, 64, -64, 91, -19, 44, 
        116, -100, -65, -38, 117, -97, -70, -43, 100, -84, 
        -17, 42, 126, -126, -99, -68, -33, 122, -114, -119, 
        -128, -101, -74, -63, 88, -24, 35, 101, -81, -22, 
        37, 111, -79, -56, 67, -59, 84, -4, 31, 33, 
        99, -91, -12, 7, 9, 27, 45, 119, -103, -80, 
        -53, 70, -54, 69, -49, 74, -34, 121, -117, -122, 
        -111, -88, -29, 62, 66, -58, 81, -13, 14, 18, 
        54, 90, -18, 41, 123, -115, -116, -113, -118, -123, 
        -108, -89, -14, 13, 23, 57, 75, -35, 124, -124, 
        -105, -94, -3, 28, 36, 108, -76, -57, 82, -10, 
        1
    };
    private static final byte logtable[] = {
        0, 0, 25, 1, 50, 2, 26, -58, 75, -57, 
        27, 104, 51, -18, -33, 3, 100, 4, -32, 14, 
        52, -115, -127, -17, 76, 113, 8, -56, -8, 105, 
        28, -63, 125, -62, 29, -75, -7, -71, 39, 106, 
        77, -28, -90, 114, -102, -55, 9, 120, 101, 47, 
        -118, 5, 33, 15, -31, 36, 18, -16, -126, 69, 
        53, -109, -38, -114, -106, -113, -37, -67, 54, -48, 
        -50, -108, 19, 92, -46, -15, 64, 70, -125, 56, 
        102, -35, -3, 48, -65, 6, -117, 98, -77, 37, 
        -30, -104, 34, -120, -111, 16, 126, 110, 72, -61, 
        -93, -74, 30, 66, 58, 107, 40, 84, -6, -123, 
        61, -70, 43, 121, 10, 21, -101, -97, 94, -54, 
        78, -44, -84, -27, -13, 115, -89, 87, -81, 88, 
        -88, 80, -12, -22, -42, 116, 79, -82, -23, -43, 
        -25, -26, -83, -24, 44, -41, 117, 122, -21, 22, 
        11, -11, 89, -53, 95, -80, -100, -87, 81, -96, 
        127, 12, -10, 111, 23, -60, 73, -20, -40, 67, 
        31, 45, -92, 118, 123, -73, -52, -69, 62, 90, 
        -5, 96, -79, -122, 59, 82, -95, 108, -86, 85, 
        41, -99, -105, -78, -121, -112, 97, -66, -36, -4, 
        -68, -107, -49, -51, 55, 63, 91, -47, 83, 57, 
        -124, 60, 65, -94, 109, 71, 20, 42, -98, 93, 
        86, -14, -45, -85, 68, 17, -110, -39, 35, 32, 
        46, -119, -76, 124, -72, 38, 119, -103, -29, -91, 
        103, 74, -19, -34, -59, 49, -2, 24, 13, 99, 
        -116, -128, -64, -9, 112, 7
    };
    private static final int rcon[] = {
        1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 
        108, 216, 171, 77, 154, 47, 94, 188, 99, 198, 
        151, 53, 106, 212, 179, 125, 250, 239, 197, 145
    };
    static byte shifts0[][] = {
        {
            0, 8, 16, 24
        }, {
            0, 8, 16, 24
        }, {
            0, 8, 16, 24
        }, {
            0, 8, 16, 32
        }, {
            0, 8, 24, 32
        }
    };
    static byte shifts1[][];
    private long A0;
    private long A1;
    private long A2;
    private long A3;
    private int BC;
    private long BC_MASK;
    private int ROUNDS;
    private int blockBits;
    private boolean forEncryption;
    private byte shifts0SC[];
    private byte shifts1SC[];
    private long workingKey[][];

    public RijndaelEngine()
    {
        this(128);
    }

    public RijndaelEngine(int i)
    {
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   128: 67
    //                   160: 104
    //                   192: 138
    //                   224: 172
    //                   256: 206;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        throw new IllegalArgumentException("unknown blocksize to Rijndael");
_L2:
        BC = 32;
        BC_MASK = 0xffffffffL;
        shifts0SC = shifts0[0];
        shifts1SC = shifts1[0];
_L8:
        blockBits = i;
        return;
_L3:
        BC = 40;
        BC_MASK = 0xffffffffffL;
        shifts0SC = shifts0[1];
        shifts1SC = shifts1[1];
        continue; /* Loop/switch isn't completed */
_L4:
        BC = 48;
        BC_MASK = 0xffffffffffffL;
        shifts0SC = shifts0[2];
        shifts1SC = shifts1[2];
        continue; /* Loop/switch isn't completed */
_L5:
        BC = 56;
        BC_MASK = 0xffffffffffffffL;
        shifts0SC = shifts0[3];
        shifts1SC = shifts1[3];
        continue; /* Loop/switch isn't completed */
_L6:
        BC = 64;
        BC_MASK = -1L;
        shifts0SC = shifts0[4];
        shifts1SC = shifts1[4];
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void InvMixColumn()
    {
        long l1 = 0L;
        int i = 0;
        long l2 = 0L;
        long l3 = 0L;
        long l4 = 0L;
        while (i < BC) 
        {
            int j = (int)(A0 >> i & 255L);
            int k = (int)(A1 >> i & 255L);
            int l = (int)(A2 >> i & 255L);
            int i1 = (int)(A3 >> i & 255L);
            if (j != 0)
            {
                j = logtable[j & 0xff] & 0xff;
            } else
            {
                j = -1;
            }
            if (k != 0)
            {
                k = logtable[k & 0xff] & 0xff;
            } else
            {
                k = -1;
            }
            if (l != 0)
            {
                l = logtable[l & 0xff] & 0xff;
            } else
            {
                l = -1;
            }
            if (i1 != 0)
            {
                i1 = logtable[i1 & 0xff] & 0xff;
            } else
            {
                i1 = -1;
            }
            l4 |= (long)((mul0xe(j) ^ mul0xb(k) ^ mul0xd(l) ^ mul0x9(i1)) & 0xff) << i;
            l3 |= (long)((mul0xe(k) ^ mul0xb(l) ^ mul0xd(i1) ^ mul0x9(j)) & 0xff) << i;
            l2 |= (long)((mul0xe(l) ^ mul0xb(i1) ^ mul0xd(j) ^ mul0x9(k)) & 0xff) << i;
            l1 |= (long)((mul0xe(i1) ^ mul0xb(j) ^ mul0xd(k) ^ mul0x9(l)) & 0xff) << i;
            i += 8;
        }
        A0 = l4;
        A1 = l3;
        A2 = l2;
        A3 = l1;
    }

    private void KeyAddition(long al[])
    {
        A0 = A0 ^ al[0];
        A1 = A1 ^ al[1];
        A2 = A2 ^ al[2];
        A3 = A3 ^ al[3];
    }

    private void MixColumn()
    {
        long l1 = 0L;
        int i = 0;
        long l2 = 0L;
        long l3 = 0L;
        long l4 = 0L;
        for (; i < BC; i += 8)
        {
            int j = (int)(A0 >> i & 255L);
            int k = (int)(A1 >> i & 255L);
            int l = (int)(A2 >> i & 255L);
            int i1 = (int)(A3 >> i & 255L);
            l4 |= (long)((mul0x2(j) ^ mul0x3(k) ^ l ^ i1) & 0xff) << i;
            l3 |= (long)((mul0x2(k) ^ mul0x3(l) ^ i1 ^ j) & 0xff) << i;
            l2 |= (long)((mul0x2(l) ^ mul0x3(i1) ^ j ^ k) & 0xff) << i;
            i1 = mul0x2(i1);
            l1 |= (long)((mul0x3(j) ^ i1 ^ k ^ l) & 0xff) << i;
        }

        A0 = l4;
        A1 = l3;
        A2 = l2;
        A3 = l1;
    }

    private void ShiftRow(byte abyte0[])
    {
        A1 = shift(A1, abyte0[1]);
        A2 = shift(A2, abyte0[2]);
        A3 = shift(A3, abyte0[3]);
    }

    private void Substitution(byte abyte0[])
    {
        A0 = applyS(A0, abyte0);
        A1 = applyS(A1, abyte0);
        A2 = applyS(A2, abyte0);
        A3 = applyS(A3, abyte0);
    }

    private long applyS(long l, byte abyte0[])
    {
        long l1 = 0L;
        for (int i = 0; i < BC; i += 8)
        {
            l1 |= (long)(abyte0[(int)(l >> i & 255L)] & 0xff) << i;
        }

        return l1;
    }

    private void decryptBlock(long al[][])
    {
        KeyAddition(al[ROUNDS]);
        Substitution(Si);
        ShiftRow(shifts1SC);
        for (int i = ROUNDS - 1; i > 0; i--)
        {
            KeyAddition(al[i]);
            InvMixColumn();
            Substitution(Si);
            ShiftRow(shifts1SC);
        }

        KeyAddition(al[0]);
    }

    private void encryptBlock(long al[][])
    {
        KeyAddition(al[0]);
        for (int i = 1; i < ROUNDS; i++)
        {
            Substitution(S);
            ShiftRow(shifts0SC);
            MixColumn();
            KeyAddition(al[i]);
        }

        Substitution(S);
        ShiftRow(shifts0SC);
        KeyAddition(al[ROUNDS]);
    }

    private long[][] generateWorkingKey(byte abyte0[])
    {
        byte abyte1[][];
        long al[][];
        int i;
        i = abyte0.length * 8;
        abyte1 = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            4, 64
        });
        al = (long[][])Array.newInstance(Long.TYPE, new int[] {
            15, 4
        });
        i;
        JVM INSTR lookupswitch 5: default 104
    //                   128: 115
    //                   160: 179
    //                   192: 185
    //                   224: 192
    //                   256: 199;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_199;
_L1:
        throw new IllegalArgumentException("Key length not 128/160/192/224/256 bits.");
_L2:
        byte byte0 = 4;
_L7:
        if (i >= blockBits)
        {
            ROUNDS = byte0 + 6;
        } else
        {
            ROUNDS = BC / 8 + 6;
        }
        i = 0;
        for (int j = 0; j < abyte0.length;)
        {
            abyte1[j % 4][j / 4] = abyte0[i];
            j++;
            i++;
        }

        break MISSING_BLOCK_LABEL_223;
_L3:
        byte0 = 5;
          goto _L7
_L4:
        byte0 = 6;
          goto _L7
_L5:
        byte0 = 7;
          goto _L7
        byte0 = 8;
          goto _L7
        int k = 0;
        for (i = 0; k < byte0 && i < (ROUNDS + 1) * (BC / 8); k++)
        {
            for (int i1 = 0; i1 < 4; i1++)
            {
                abyte0 = al[i / (BC / 8)];
                abyte0[i1] = abyte0[i1] | (long)(abyte1[i1][k] & 0xff) << (i * 8) % BC;
            }

            i++;
        }

          goto _L8
_L9:
        int l;
        l++;
_L10:
        if (i < (ROUNDS + 1) * (BC / 8))
        {
            for (int j1 = 0; j1 < 4; j1++)
            {
                abyte0 = abyte1[j1];
                abyte0[0] = (byte)(abyte0[0] ^ S[abyte1[(j1 + 1) % 4][byte0 - 1] & 0xff]);
            }

            abyte0 = abyte1[0];
            int k1 = abyte0[0];
            abyte0[0] = (byte)(rcon[l] ^ k1);
            if (byte0 <= 6)
            {
                for (k1 = 1; k1 < byte0; k1++)
                {
                    for (int l1 = 0; l1 < 4; l1++)
                    {
                        abyte0 = abyte1[l1];
                        abyte0[k1] = (byte)(abyte0[k1] ^ abyte1[l1][k1 - 1]);
                    }

                }

            } else
            {
                for (k1 = 1; k1 < 4; k1++)
                {
                    for (int i2 = 0; i2 < 4; i2++)
                    {
                        abyte0 = abyte1[i2];
                        abyte0[k1] = (byte)(abyte0[k1] ^ abyte1[i2][k1 - 1]);
                    }

                }

                for (k1 = 0; k1 < 4; k1++)
                {
                    abyte0 = abyte1[k1];
                    abyte0[4] = (byte)(abyte0[4] ^ S[abyte1[k1][3] & 0xff]);
                }

                for (k1 = 5; k1 < byte0; k1++)
                {
                    for (int j2 = 0; j2 < 4; j2++)
                    {
                        abyte0 = abyte1[j2];
                        abyte0[k1] = (byte)(abyte0[k1] ^ abyte1[j2][k1 - 1]);
                    }

                }

            }
            k1 = 0;
            while (k1 < byte0 && i < (ROUNDS + 1) * (BC / 8)) 
            {
                for (int k2 = 0; k2 < 4; k2++)
                {
                    abyte0 = al[i / (BC / 8)];
                    abyte0[k2] = abyte0[k2] | (long)(abyte1[k2][k1] & 0xff) << (i * 8) % BC;
                }

                i++;
                k1++;
            }
        } else
        {
            return al;
        }
        if (true) goto _L9; else goto _L8
_L8:
        l = 0;
          goto _L10
    }

    private byte mul0x2(int i)
    {
        if (i != 0)
        {
            return aLogtable[(logtable[i] & 0xff) + 25];
        } else
        {
            return 0;
        }
    }

    private byte mul0x3(int i)
    {
        if (i != 0)
        {
            return aLogtable[(logtable[i] & 0xff) + 1];
        } else
        {
            return 0;
        }
    }

    private byte mul0x9(int i)
    {
        if (i >= 0)
        {
            return aLogtable[i + 199];
        } else
        {
            return 0;
        }
    }

    private byte mul0xb(int i)
    {
        if (i >= 0)
        {
            return aLogtable[i + 104];
        } else
        {
            return 0;
        }
    }

    private byte mul0xd(int i)
    {
        if (i >= 0)
        {
            return aLogtable[i + 238];
        } else
        {
            return 0;
        }
    }

    private byte mul0xe(int i)
    {
        if (i >= 0)
        {
            return aLogtable[i + 223];
        } else
        {
            return 0;
        }
    }

    private void packBlock(byte abyte0[], int i)
    {
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i != BC; i += 8)
        {
            int k = j + 1;
            abyte0[j] = (byte)(int)(A0 >> i);
            j = k + 1;
            abyte0[k] = (byte)(int)(A1 >> i);
            k = j + 1;
            abyte0[j] = (byte)(int)(A2 >> i);
            j = k + 1;
            abyte0[k] = (byte)(int)(A3 >> i);
        }

    }

    private long shift(long l, int i)
    {
        return (l >>> i | l << BC - i) & BC_MASK;
    }

    private void unpackBlock(byte abyte0[], int i)
    {
        int j = i + 1;
        A0 = abyte0[i] & 0xff;
        i = j + 1;
        A1 = abyte0[j] & 0xff;
        int k = i + 1;
        A2 = abyte0[i] & 0xff;
        j = k + 1;
        A3 = abyte0[k] & 0xff;
        for (i = 8; i != BC; i += 8)
        {
            long l1 = A0;
            int l = j + 1;
            A0 = l1 | (long)(abyte0[j] & 0xff) << i;
            l1 = A1;
            j = l + 1;
            A1 = l1 | (long)(abyte0[l] & 0xff) << i;
            l1 = A2;
            l = j + 1;
            A2 = l1 | (long)(abyte0[j] & 0xff) << i;
            l1 = A3;
            j = l + 1;
            A3 = l1 | (long)(abyte0[l] & 0xff) << i;
        }

    }

    public String getAlgorithmName()
    {
        return "Rijndael";
    }

    public int getBlockSize()
    {
        return BC / 2;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof KeyParameter)
        {
            workingKey = generateWorkingKey(((KeyParameter)cipherparameters).getKey());
            forEncryption = flag;
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid parameter passed to Rijndael init - ").append(cipherparameters.getClass().getName()).toString());
        }
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (workingKey == null)
        {
            throw new IllegalStateException("Rijndael engine not initialised");
        }
        if (BC / 2 + i > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (BC / 2 + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (forEncryption)
        {
            unpackBlock(abyte0, i);
            encryptBlock(workingKey);
            packBlock(abyte1, j);
        } else
        {
            unpackBlock(abyte0, i);
            decryptBlock(workingKey);
            packBlock(abyte1, j);
        }
        return BC / 2;
    }

    public void reset()
    {
    }

    static 
    {
        byte abyte0[] = {
            0, 24, 16, 8
        };
        byte abyte1[] = {
            0, 32, 24, 16
        };
        byte abyte2[] = {
            0, 56, 40, 32
        };
        shifts1 = (new byte[][] {
            abyte0, abyte1, new byte[] {
                0, 40, 32, 24
            }, new byte[] {
                0, 48, 40, 24
            }, abyte2
        });
    }
}
