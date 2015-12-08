// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.MaxBytesExceededException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.util.Pack;
import org.bouncycastle.util.Strings;

public class Salsa20Engine
    implements StreamCipher
{

    private static final int STATE_SIZE = 16;
    private static final byte sigma[] = Strings.toByteArray("expand 32-byte k");
    private static final byte tau[] = Strings.toByteArray("expand 16-byte k");
    private int cW0;
    private int cW1;
    private int cW2;
    private int engineState[];
    private int index;
    private boolean initialised;
    private byte keyStream[];
    private byte workingIV[];
    private byte workingKey[];
    private int x[];

    public Salsa20Engine()
    {
        index = 0;
        engineState = new int[16];
        x = new int[16];
        keyStream = new byte[64];
        workingKey = null;
        workingIV = null;
        initialised = false;
    }

    private void generateKeyStream(byte abyte0[])
    {
        salsaCore(20, engineState, x);
        Pack.intToLittleEndian(x, abyte0, 0);
    }

    private boolean limitExceeded()
    {
        boolean flag1 = false;
        int i = cW0 + 1;
        cW0 = i;
        boolean flag = flag1;
        if (i == 0)
        {
            int j = cW1 + 1;
            cW1 = j;
            flag = flag1;
            if (j == 0)
            {
                int k = cW2 + 1;
                cW2 = k;
                flag = flag1;
                if ((k & 0x20) != 0)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    private boolean limitExceeded(int i)
    {
        boolean flag1 = false;
        cW0 = cW0 + i;
        boolean flag = flag1;
        if (cW0 < i)
        {
            flag = flag1;
            if (cW0 >= 0)
            {
                i = cW1 + 1;
                cW1 = i;
                flag = flag1;
                if (i == 0)
                {
                    i = cW2 + 1;
                    cW2 = i;
                    flag = flag1;
                    if ((i & 0x20) != 0)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    private void resetCounter()
    {
        cW0 = 0;
        cW1 = 0;
        cW2 = 0;
    }

    private static int rotl(int i, int j)
    {
        return i << j | i >>> -j;
    }

    public static void salsaCore(int i, int ai[], int ai1[])
    {
        boolean flag = false;
        System.arraycopy(ai, 0, ai1, 0, ai.length);
        int j;
        do
        {
            j = ((flag) ? 1 : 0);
            if (i <= 0)
            {
                break;
            }
            ai1[4] = ai1[4] ^ rotl(ai1[0] + ai1[12], 7);
            ai1[8] = ai1[8] ^ rotl(ai1[4] + ai1[0], 9);
            ai1[12] = ai1[12] ^ rotl(ai1[8] + ai1[4], 13);
            ai1[0] = ai1[0] ^ rotl(ai1[12] + ai1[8], 18);
            ai1[9] = ai1[9] ^ rotl(ai1[5] + ai1[1], 7);
            ai1[13] = ai1[13] ^ rotl(ai1[9] + ai1[5], 9);
            ai1[1] = ai1[1] ^ rotl(ai1[13] + ai1[9], 13);
            ai1[5] = ai1[5] ^ rotl(ai1[1] + ai1[13], 18);
            ai1[14] = ai1[14] ^ rotl(ai1[10] + ai1[6], 7);
            ai1[2] = ai1[2] ^ rotl(ai1[14] + ai1[10], 9);
            ai1[6] = ai1[6] ^ rotl(ai1[2] + ai1[14], 13);
            ai1[10] = ai1[10] ^ rotl(ai1[6] + ai1[2], 18);
            ai1[3] = ai1[3] ^ rotl(ai1[15] + ai1[11], 7);
            ai1[7] = ai1[7] ^ rotl(ai1[3] + ai1[15], 9);
            ai1[11] = ai1[11] ^ rotl(ai1[7] + ai1[3], 13);
            ai1[15] = ai1[15] ^ rotl(ai1[11] + ai1[7], 18);
            ai1[1] = ai1[1] ^ rotl(ai1[0] + ai1[3], 7);
            ai1[2] = ai1[2] ^ rotl(ai1[1] + ai1[0], 9);
            ai1[3] = ai1[3] ^ rotl(ai1[2] + ai1[1], 13);
            ai1[0] = ai1[0] ^ rotl(ai1[3] + ai1[2], 18);
            ai1[6] = ai1[6] ^ rotl(ai1[5] + ai1[4], 7);
            ai1[7] = ai1[7] ^ rotl(ai1[6] + ai1[5], 9);
            ai1[4] = ai1[4] ^ rotl(ai1[7] + ai1[6], 13);
            ai1[5] = ai1[5] ^ rotl(ai1[4] + ai1[7], 18);
            ai1[11] = ai1[11] ^ rotl(ai1[10] + ai1[9], 7);
            ai1[8] = ai1[8] ^ rotl(ai1[11] + ai1[10], 9);
            ai1[9] = ai1[9] ^ rotl(ai1[8] + ai1[11], 13);
            ai1[10] = ai1[10] ^ rotl(ai1[9] + ai1[8], 18);
            ai1[12] = ai1[12] ^ rotl(ai1[15] + ai1[14], 7);
            ai1[13] = ai1[13] ^ rotl(ai1[12] + ai1[15], 9);
            ai1[14] = ai1[14] ^ rotl(ai1[13] + ai1[12], 13);
            ai1[15] = ai1[15] ^ rotl(ai1[14] + ai1[13], 18);
            i -= 2;
        } while (true);
        for (; j < 16; j++)
        {
            ai1[j] = ai1[j] + ai[j];
        }

    }

    private void setKey(byte abyte0[], byte abyte1[])
    {
        workingKey = abyte0;
        workingIV = abyte1;
        index = 0;
        resetCounter();
        engineState[1] = Pack.littleEndianToInt(workingKey, 0);
        engineState[2] = Pack.littleEndianToInt(workingKey, 4);
        engineState[3] = Pack.littleEndianToInt(workingKey, 8);
        engineState[4] = Pack.littleEndianToInt(workingKey, 12);
        byte byte0;
        if (workingKey.length == 32)
        {
            abyte0 = sigma;
            byte0 = 16;
        } else
        {
            abyte0 = tau;
            byte0 = 0;
        }
        engineState[11] = Pack.littleEndianToInt(workingKey, byte0);
        engineState[12] = Pack.littleEndianToInt(workingKey, byte0 + 4);
        engineState[13] = Pack.littleEndianToInt(workingKey, byte0 + 8);
        engineState[14] = Pack.littleEndianToInt(workingKey, byte0 + 12);
        engineState[0] = Pack.littleEndianToInt(abyte0, 0);
        engineState[5] = Pack.littleEndianToInt(abyte0, 4);
        engineState[10] = Pack.littleEndianToInt(abyte0, 8);
        engineState[15] = Pack.littleEndianToInt(abyte0, 12);
        engineState[6] = Pack.littleEndianToInt(workingIV, 0);
        engineState[7] = Pack.littleEndianToInt(workingIV, 4);
        abyte0 = engineState;
        engineState[9] = 0;
        abyte0[8] = 0;
        initialised = true;
    }

    public String getAlgorithmName()
    {
        return "Salsa20";
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof ParametersWithIV))
        {
            throw new IllegalArgumentException("Salsa20 Init parameters must include an IV");
        }
        cipherparameters = (ParametersWithIV)cipherparameters;
        byte abyte0[] = cipherparameters.getIV();
        if (abyte0 == null || abyte0.length != 8)
        {
            throw new IllegalArgumentException("Salsa20 requires exactly 8 bytes of IV");
        }
        if (!(cipherparameters.getParameters() instanceof KeyParameter))
        {
            throw new IllegalArgumentException("Salsa20 Init parameters must include a key");
        } else
        {
            workingKey = ((KeyParameter)cipherparameters.getParameters()).getKey();
            workingIV = abyte0;
            setKey(workingKey, workingIV);
            return;
        }
    }

    public void processBytes(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        if (!initialised)
        {
            throw new IllegalStateException((new StringBuilder()).append(getAlgorithmName()).append(" not initialised").toString());
        }
        if (i + j > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (k + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (limitExceeded(j))
        {
            throw new MaxBytesExceededException("2^70 byte limit per IV would be exceeded; Change IV");
        }
        for (int l = 0; l < j; l++)
        {
            if (index == 0)
            {
                generateKeyStream(keyStream);
                int ai[] = engineState;
                int i1 = ai[8] + 1;
                ai[8] = i1;
                if (i1 == 0)
                {
                    int ai1[] = engineState;
                    ai1[9] = ai1[9] + 1;
                }
            }
            abyte1[l + k] = (byte)(keyStream[index] ^ abyte0[l + i]);
            index = index + 1 & 0x3f;
        }

    }

    public void reset()
    {
        setKey(workingKey, workingIV);
    }

    public byte returnByte(byte byte0)
    {
        if (limitExceeded())
        {
            throw new MaxBytesExceededException("2^70 byte limit per IV; Change IV");
        }
        if (index == 0)
        {
            generateKeyStream(keyStream);
            int ai[] = engineState;
            int i = ai[8] + 1;
            ai[8] = i;
            if (i == 0)
            {
                int ai1[] = engineState;
                ai1[9] = ai1[9] + 1;
            }
        }
        byte byte1 = (byte)(keyStream[index] ^ byte0);
        index = index + 1 & 0x3f;
        return byte1;
    }

}
