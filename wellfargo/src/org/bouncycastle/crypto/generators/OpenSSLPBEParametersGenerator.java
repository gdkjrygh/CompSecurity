// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class OpenSSLPBEParametersGenerator extends PBEParametersGenerator
{

    private Digest digest;

    public OpenSSLPBEParametersGenerator()
    {
        digest = new MD5Digest();
    }

    private byte[] generateDerivedKey(int i)
    {
        byte abyte0[] = new byte[digest.getDigestSize()];
        byte abyte1[] = new byte[i];
        int j = 0;
        do
        {
            digest.update(password, 0, password.length);
            digest.update(salt, 0, salt.length);
            digest.doFinal(abyte0, 0);
            int k;
            if (i > abyte0.length)
            {
                k = abyte0.length;
            } else
            {
                k = i;
            }
            System.arraycopy(abyte0, 0, abyte1, j, k);
            j += k;
            i -= k;
            if (i == 0)
            {
                return abyte1;
            }
            digest.reset();
            digest.update(abyte0, 0, abyte0.length);
        } while (true);
    }

    public CipherParameters generateDerivedMacParameters(int i)
    {
        return generateDerivedParameters(i);
    }

    public CipherParameters generateDerivedParameters(int i)
    {
        i /= 8;
        return new KeyParameter(generateDerivedKey(i), 0, i);
    }

    public CipherParameters generateDerivedParameters(int i, int j)
    {
        i /= 8;
        j /= 8;
        byte abyte0[] = generateDerivedKey(i + j);
        return new ParametersWithIV(new KeyParameter(abyte0, 0, i), abyte0, i, j);
    }

    public void init(byte abyte0[], byte abyte1[])
    {
        super.init(abyte0, abyte1, 1);
    }
}
