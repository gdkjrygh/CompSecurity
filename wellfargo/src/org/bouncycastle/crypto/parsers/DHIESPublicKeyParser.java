// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.parsers;

import java.io.InputStream;
import java.math.BigInteger;
import org.bouncycastle.crypto.KeyParser;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;

public class DHIESPublicKeyParser
    implements KeyParser
{

    private DHParameters dhParams;

    public DHIESPublicKeyParser(DHParameters dhparameters)
    {
        dhParams = dhparameters;
    }

    public AsymmetricKeyParameter readKey(InputStream inputstream)
    {
        byte abyte0[] = new byte[(dhParams.getP().bitLength() + 7) / 8];
        inputstream.read(abyte0, 0, abyte0.length);
        return new DHPublicKeyParameters(new BigInteger(1, abyte0), dhParams);
    }
}
