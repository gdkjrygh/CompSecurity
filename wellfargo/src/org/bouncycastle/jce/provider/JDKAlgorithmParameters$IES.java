// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.jce.spec.IESParameterSpec;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKAlgorithmParameters

public class  extends JDKAlgorithmParameters
{

    IESParameterSpec currentSpec;

    protected byte[] engineGetEncoded()
    {
        byte abyte0[];
        try
        {
            ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
            asn1encodablevector.add(new DEROctetString(currentSpec.getDerivationV()));
            asn1encodablevector.add(new DEROctetString(currentSpec.getEncodingV()));
            asn1encodablevector.add(new DERInteger(currentSpec.getMacKeySize()));
            abyte0 = (new DERSequence(asn1encodablevector)).getEncoded("DER");
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException("Error encoding IESParameters");
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
        if (!(algorithmparameterspec instanceof IESParameterSpec))
        {
            throw new InvalidParameterSpecException("IESParameterSpec required to initialise a IES algorithm parameters object");
        } else
        {
            currentSpec = (IESParameterSpec)algorithmparameterspec;
            return;
        }
    }

    protected void engineInit(byte abyte0[])
    {
        try
        {
            abyte0 = (ASN1Sequence)ASN1Primitive.fromByteArray(abyte0);
            currentSpec = new IESParameterSpec(((ASN1OctetString)abyte0.getObjectAt(0)).getOctets(), ((ASN1OctetString)abyte0.getObjectAt(0)).getOctets(), ((DERInteger)abyte0.getObjectAt(0)).getValue().intValue());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException("Not a valid IES Parameter encoding.");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException("Not a valid IES Parameter encoding.");
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
        return "IES Parameters";
    }

    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class1)
    {
        if (class1 == org/bouncycastle/jce/spec/IESParameterSpec)
        {
            return currentSpec;
        } else
        {
            throw new InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
        }
    }

    public ()
    {
    }
}
