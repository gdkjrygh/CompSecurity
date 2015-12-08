// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

public class ParametersWithSalt
    implements CipherParameters
{

    private CipherParameters parameters;
    private byte salt[];

    public ParametersWithSalt(CipherParameters cipherparameters, byte abyte0[])
    {
        this(cipherparameters, abyte0, 0, abyte0.length);
    }

    public ParametersWithSalt(CipherParameters cipherparameters, byte abyte0[], int i, int j)
    {
        salt = new byte[j];
        parameters = cipherparameters;
        System.arraycopy(abyte0, i, salt, 0, j);
    }

    public CipherParameters getParameters()
    {
        return parameters;
    }

    public byte[] getSalt()
    {
        return salt;
    }
}
