// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.provider.util.DigestFactory;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.rsa:
//            AlgorithmParametersSpi

public class  extends AlgorithmParametersSpi
{

    PSSParameterSpec currentSpec;

    protected byte[] engineGetEncoded()
    {
        PSSParameterSpec pssparameterspec = currentSpec;
        AlgorithmIdentifier algorithmidentifier = new AlgorithmIdentifier(DigestFactory.getOID(pssparameterspec.getDigestAlgorithm()), DERNull.INSTANCE);
        MGF1ParameterSpec mgf1parameterspec = (MGF1ParameterSpec)pssparameterspec.getMGFParameters();
        return (new RSASSAPSSparams(algorithmidentifier, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, new AlgorithmIdentifier(DigestFactory.getOID(mgf1parameterspec.getDigestAlgorithm()), DERNull.INSTANCE)), new ASN1Integer(pssparameterspec.getSaltLength()), new ASN1Integer(pssparameterspec.getTrailerField()))).getEncoded("DER");
    }

    protected byte[] engineGetEncoded(String s)
    {
        if (s.equalsIgnoreCase("X.509") || s.equalsIgnoreCase("ASN.1"))
        {
            return engineGetEncoded();
        } else
        {
            return null;
        }
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec)
    {
        if (!(algorithmparameterspec instanceof PSSParameterSpec))
        {
            throw new InvalidParameterSpecException("PSSParameterSpec required to initialise an PSS algorithm parameters object");
        } else
        {
            currentSpec = (PSSParameterSpec)algorithmparameterspec;
            return;
        }
    }

    protected void engineInit(byte abyte0[])
    {
        try
        {
            abyte0 = RSASSAPSSparams.getInstance(abyte0);
            currentSpec = new PSSParameterSpec(abyte0.getHashAlgorithm().getAlgorithm().getId(), abyte0.getMaskGenAlgorithm().getAlgorithm().getId(), new MGF1ParameterSpec(AlgorithmIdentifier.getInstance(abyte0.getMaskGenAlgorithm().getParameters()).getAlgorithm().getId()), abyte0.getSaltLength().intValue(), abyte0.getTrailerField().intValue());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException("Not a valid PSS Parameter encoding.");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException("Not a valid PSS Parameter encoding.");
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
        return "PSS Parameters";
    }

    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class1)
    {
        if (class1 == java/security/spec/PSSParameterSpec && currentSpec != null)
        {
            return currentSpec;
        } else
        {
            throw new InvalidParameterSpecException("unknown parameter spec passed to PSS parameters object.");
        }
    }

    public ()
    {
    }
}
