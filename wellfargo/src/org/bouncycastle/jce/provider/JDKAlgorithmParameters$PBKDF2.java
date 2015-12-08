// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKAlgorithmParameters

public class A extends JDKAlgorithmParameters
{

    PBKDF2Params params;

    protected byte[] engineGetEncoded()
    {
        byte abyte0[];
        try
        {
            abyte0 = params.getEncoded("DER");
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException((new StringBuilder()).append("Oooops! ").append(ioexception.toString()).toString());
        }
        return abyte0;
    }

    protected byte[] engineGetEncoded(String s)
    {
        if (isASN1FormatString(s))
        {
            return engineGetEncoded();
        } else
        {
            return null;
        }
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec)
    {
        if (!(algorithmparameterspec instanceof PBEParameterSpec))
        {
            throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PKCS12 PBE parameters algorithm parameters object");
        } else
        {
            algorithmparameterspec = (PBEParameterSpec)algorithmparameterspec;
            params = new PBKDF2Params(algorithmparameterspec.getSalt(), algorithmparameterspec.getIterationCount());
            return;
        }
    }

    protected void engineInit(byte abyte0[])
    {
        params = PBKDF2Params.getInstance(ASN1Primitive.fromByteArray(abyte0));
    }

    protected void engineInit(byte abyte0[], String s)
    {
        if (isASN1FormatString(s))
        {
            engineInit(abyte0);
            return;
        } else
        {
            throw new IOException("Unknown parameters format in PWRIKEK parameters object");
        }
    }

    protected String engineToString()
    {
        return "PBKDF2 Parameters";
    }

    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class1)
    {
        if (class1 == javax/crypto/spec/PBEParameterSpec)
        {
            return new PBEParameterSpec(params.getSalt(), params.getIterationCount().intValue());
        } else
        {
            throw new InvalidParameterSpecException("unknown parameter spec passed to PKCS12 PBE parameters object.");
        }
    }

    public A()
    {
    }
}
