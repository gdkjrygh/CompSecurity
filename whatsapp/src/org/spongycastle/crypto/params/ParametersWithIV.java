// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

public class ParametersWithIV
    implements CipherParameters
{

    public static boolean a;
    private byte iv[];
    private CipherParameters parameters;

    public ParametersWithIV(CipherParameters cipherparameters, byte abyte0[])
    {
        this(cipherparameters, abyte0, 0, abyte0.length);
    }

    public ParametersWithIV(CipherParameters cipherparameters, byte abyte0[], int i, int j)
    {
        boolean flag = false;
        boolean flag1 = a;
        super();
        iv = new byte[j];
        parameters = cipherparameters;
        System.arraycopy(abyte0, i, iv, 0, j);
        if (flag1)
        {
            if (!BaseKeyGenerator.a)
            {
                flag = true;
            }
            BaseKeyGenerator.a = flag;
        }
    }

    public byte[] getIV()
    {
        return iv;
    }

    public CipherParameters getParameters()
    {
        return parameters;
    }
}
