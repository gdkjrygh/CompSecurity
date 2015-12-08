// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.oiw.ElGamalParameter;
import org.bouncycastle.jce.provider.JDKAlgorithmParameters;
import org.bouncycastle.jce.spec.ElGamalParameterSpec;

public class AlgorithmParametersSpi extends JDKAlgorithmParameters
{

    ElGamalParameterSpec currentSpec;

    public AlgorithmParametersSpi()
    {
    }

    protected byte[] engineGetEncoded()
    {
        ElGamalParameter elgamalparameter = new ElGamalParameter(currentSpec.getP(), currentSpec.getG());
        byte abyte0[];
        try
        {
            abyte0 = elgamalparameter.getEncoded("DER");
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException("Error encoding ElGamalParameters");
        }
        return abyte0;
    }

    protected byte[] engineGetEncoded(String s)
    {
        if (isASN1FormatString(s) || s.equalsIgnoreCase("X.509"))
        {
            return engineGetEncoded();
        } else
        {
            return null;
        }
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec)
    {
        if (!(algorithmparameterspec instanceof ElGamalParameterSpec) && !(algorithmparameterspec instanceof DHParameterSpec))
        {
            throw new InvalidParameterSpecException("DHParameterSpec required to initialise a ElGamal algorithm parameters object");
        }
        if (algorithmparameterspec instanceof ElGamalParameterSpec)
        {
            currentSpec = (ElGamalParameterSpec)algorithmparameterspec;
            return;
        } else
        {
            algorithmparameterspec = (DHParameterSpec)algorithmparameterspec;
            currentSpec = new ElGamalParameterSpec(algorithmparameterspec.getP(), algorithmparameterspec.getG());
            return;
        }
    }

    protected void engineInit(byte abyte0[])
    {
        try
        {
            abyte0 = new ElGamalParameter((ASN1Sequence)ASN1Primitive.fromByteArray(abyte0));
            currentSpec = new ElGamalParameterSpec(abyte0.getP(), abyte0.getG());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException("Not a valid ElGamal Parameter encoding.");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException("Not a valid ElGamal Parameter encoding.");
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
        return "ElGamal Parameters";
    }

    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class1)
    {
        if (class1 == org/bouncycastle/jce/spec/ElGamalParameterSpec)
        {
            return currentSpec;
        }
        if (class1 == javax/crypto/spec/DHParameterSpec)
        {
            return new DHParameterSpec(currentSpec.getP(), currentSpec.getG());
        } else
        {
            throw new InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
        }
    }
}
