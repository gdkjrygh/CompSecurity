// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;

public class RC4Engine
    implements StreamCipher
{

    private static final int STATE_LENGTH = 256;
    private byte engineState[];
    private byte workingKey[];
    private int x;
    private int y;

    public RC4Engine()
    {
        engineState = null;
        x = 0;
        y = 0;
        workingKey = null;
    }

    private void setKey(byte abyte0[])
    {
        int k = 0;
        workingKey = abyte0;
        x = 0;
        y = 0;
        if (engineState == null)
        {
            engineState = new byte[256];
        }
        for (int i = 0; i < 256; i++)
        {
            engineState[i] = (byte)i;
        }

        int l = 0;
        int j = 0;
        for (; k < 256; k++)
        {
            l = l + ((abyte0[j] & 0xff) + engineState[k]) & 0xff;
            byte byte0 = engineState[k];
            engineState[k] = engineState[l];
            engineState[l] = byte0;
            j = (j + 1) % abyte0.length;
        }

    }

    public String getAlgorithmName()
    {
        return "RC4";
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof KeyParameter)
        {
            workingKey = ((KeyParameter)cipherparameters).getKey();
            setKey(workingKey);
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid parameter passed to RC4 init - ").append(cipherparameters.getClass().getName()).toString());
        }
    }

    public void processBytes(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        if (i + j > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (k + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        for (int l = 0; l < j; l++)
        {
            x = x + 1 & 0xff;
            y = engineState[x] + y & 0xff;
            byte byte0 = engineState[x];
            engineState[x] = engineState[y];
            engineState[y] = byte0;
            abyte1[l + k] = (byte)(abyte0[l + i] ^ engineState[engineState[x] + engineState[y] & 0xff]);
        }

    }

    public void reset()
    {
        setKey(workingKey);
    }

    public byte returnByte(byte byte0)
    {
        x = x + 1 & 0xff;
        y = engineState[x] + y & 0xff;
        byte byte1 = engineState[x];
        engineState[x] = engineState[y];
        engineState[y] = byte1;
        return (byte)(engineState[engineState[x] + engineState[y] & 0xff] ^ byte0);
    }
}
