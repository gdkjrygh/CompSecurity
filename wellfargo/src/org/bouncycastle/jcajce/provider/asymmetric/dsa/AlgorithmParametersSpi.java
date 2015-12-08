// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x509.DSAParameter;

public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi
{

    DSAParameterSpec currentSpec;

    public AlgorithmParametersSpi()
    {
    }

    protected byte[] engineGetEncoded()
    {
        DSAParameter dsaparameter = new DSAParameter(currentSpec.getP(), currentSpec.getQ(), currentSpec.getG());
        byte abyte0[];
        try
        {
            abyte0 = dsaparameter.getEncoded("DER");
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException("Error encoding DSAParameters");
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
        if (!(algorithmparameterspec instanceof DSAParameterSpec))
        {
            throw new InvalidParameterSpecException("DSAParameterSpec required to initialise a DSA algorithm parameters object");
        } else
        {
            currentSpec = (DSAParameterSpec)algorithmparameterspec;
            return;
        }
    }

    protected void engineInit(byte abyte0[])
    {
        try
        {
            abyte0 = DSAParameter.getInstance(ASN1Primitive.fromByteArray(abyte0));
            currentSpec = new DSAParameterSpec(abyte0.getP(), abyte0.getQ(), abyte0.getG());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException("Not a valid DSA Parameter encoding.");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException("Not a valid DSA Parameter encoding.");
        }
    }

    protected void engineInit(byte abyte0[], String s)
    {
        if (isASN1FormatString(s) || s.equalsIgnoreCase("X.509"))
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
        return "DSA Parameters";
    }

    protected boolean isASN1FormatString(String s)
    {
        return s == null || s.equals("ASN.1");
    }

    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class1)
    {
        if (class1 == java/security/spec/DSAParameterSpec)
        {
            return currentSpec;
        } else
        {
            throw new InvalidParameterSpecException("unknown parameter spec passed to DSA parameters object.");
        }
    }
}
