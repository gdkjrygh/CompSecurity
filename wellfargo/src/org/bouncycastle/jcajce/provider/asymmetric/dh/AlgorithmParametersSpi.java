// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.asn1.pkcs.DHParameter;

public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi
{

    DHParameterSpec currentSpec;

    public AlgorithmParametersSpi()
    {
    }

    protected byte[] engineGetEncoded()
    {
        DHParameter dhparameter = new DHParameter(currentSpec.getP(), currentSpec.getG(), currentSpec.getL());
        byte abyte0[];
        try
        {
            abyte0 = dhparameter.getEncoded("DER");
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException("Error encoding DHParameters");
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

    protected AlgorithmParameterSpec engineGetParameterSpec(Class class1)
    {
        if (class1 == null)
        {
            throw new NullPointerException("argument to getParameterSpec must not be null");
        } else
        {
            return localEngineGetParameterSpec(class1);
        }
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec)
    {
        if (!(algorithmparameterspec instanceof DHParameterSpec))
        {
            throw new InvalidParameterSpecException("DHParameterSpec required to initialise a Diffie-Hellman algorithm parameters object");
        } else
        {
            currentSpec = (DHParameterSpec)algorithmparameterspec;
            return;
        }
    }

    protected void engineInit(byte abyte0[])
    {
        try
        {
            abyte0 = DHParameter.getInstance(abyte0);
            if (abyte0.getL() != null)
            {
                currentSpec = new DHParameterSpec(abyte0.getP(), abyte0.getG(), abyte0.getL().intValue());
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException("Not a valid DH Parameter encoding.");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException("Not a valid DH Parameter encoding.");
        }
        currentSpec = new DHParameterSpec(abyte0.getP(), abyte0.getG());
        return;
    }

    protected void engineInit(byte abyte0[], String s)
    {
        if (isASN1FormatString(s))
        {
            engineInit(abyte0);
            return;
        } else
        {
            throw new IOException((new StringBuilder()).append("Unknown parameter format ").append(s).toString());
        }
    }

    protected String engineToString()
    {
        return "Diffie-Hellman Parameters";
    }

    protected boolean isASN1FormatString(String s)
    {
        return s == null || s.equals("ASN.1");
    }

    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class1)
    {
        if (class1 == javax/crypto/spec/DHParameterSpec)
        {
            return currentSpec;
        } else
        {
            throw new InvalidParameterSpecException("unknown parameter spec passed to DH parameters object.");
        }
    }
}
