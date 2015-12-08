// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class VMPCEngine
    implements StreamCipher
{

    protected byte P[];
    protected byte n;
    protected byte s;
    protected byte workingIV[];
    protected byte workingKey[];

    public VMPCEngine()
    {
        n = 0;
        P = null;
        s = 0;
    }

    public String getAlgorithmName()
    {
        return "VMPC";
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof ParametersWithIV))
        {
            throw new IllegalArgumentException("VMPC init parameters must include an IV");
        }
        cipherparameters = (ParametersWithIV)cipherparameters;
        KeyParameter keyparameter = (KeyParameter)cipherparameters.getParameters();
        if (!(cipherparameters.getParameters() instanceof KeyParameter))
        {
            throw new IllegalArgumentException("VMPC init parameters must include a key");
        }
        workingIV = cipherparameters.getIV();
        if (workingIV == null || workingIV.length < 1 || workingIV.length > 768)
        {
            throw new IllegalArgumentException("VMPC requires 1 to 768 bytes of IV");
        } else
        {
            workingKey = keyparameter.getKey();
            initKey(workingKey, workingIV);
            return;
        }
    }

    protected void initKey(byte abyte0[], byte abyte1[])
    {
        s = 0;
        P = new byte[256];
        for (int i = 0; i < 256; i++)
        {
            P[i] = (byte)i;
        }

        for (int j = 0; j < 768; j++)
        {
            s = P[s + P[j & 0xff] + abyte0[j % abyte0.length] & 0xff];
            byte byte0 = P[j & 0xff];
            P[j & 0xff] = P[s & 0xff];
            P[s & 0xff] = byte0;
        }

        for (int k = 0; k < 768; k++)
        {
            s = P[s + P[k & 0xff] + abyte1[k % abyte1.length] & 0xff];
            byte byte1 = P[k & 0xff];
            P[k & 0xff] = P[s & 0xff];
            P[s & 0xff] = byte1;
        }

        n = 0;
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
            s = P[s + P[n & 0xff] & 0xff];
            byte byte1 = P[P[P[s & 0xff] & 0xff] + 1 & 0xff];
            byte byte0 = P[n & 0xff];
            P[n & 0xff] = P[s & 0xff];
            P[s & 0xff] = byte0;
            n = (byte)(n + 1 & 0xff);
            abyte1[l + k] = (byte)(byte1 ^ abyte0[l + i]);
        }

    }

    public void reset()
    {
        initKey(workingKey, workingIV);
    }

    public byte returnByte(byte byte0)
    {
        s = P[s + P[n & 0xff] & 0xff];
        byte byte2 = P[P[P[s & 0xff] & 0xff] + 1 & 0xff];
        byte byte1 = P[n & 0xff];
        P[n & 0xff] = P[s & 0xff];
        P[s & 0xff] = byte1;
        n = (byte)(n + 1 & 0xff);
        return (byte)(byte2 ^ byte0);
    }
}
