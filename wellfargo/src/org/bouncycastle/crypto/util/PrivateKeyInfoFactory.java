// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.util;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSAPrivateKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;

public class PrivateKeyInfoFactory
{

    public PrivateKeyInfoFactory()
    {
    }

    public static PrivateKeyInfo createPrivateKeyInfo(AsymmetricKeyParameter asymmetrickeyparameter)
    {
        if (asymmetrickeyparameter instanceof RSAKeyParameters)
        {
            asymmetrickeyparameter = (RSAPrivateCrtKeyParameters)asymmetrickeyparameter;
            return new PrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE), new RSAPrivateKey(asymmetrickeyparameter.getModulus(), asymmetrickeyparameter.getPublicExponent(), asymmetrickeyparameter.getExponent(), asymmetrickeyparameter.getP(), asymmetrickeyparameter.getQ(), asymmetrickeyparameter.getDP(), asymmetrickeyparameter.getDQ(), asymmetrickeyparameter.getQInv()));
        }
        if (asymmetrickeyparameter instanceof DSAPrivateKeyParameters)
        {
            asymmetrickeyparameter = (DSAPrivateKeyParameters)asymmetrickeyparameter;
            DSAParameters dsaparameters = asymmetrickeyparameter.getParameters();
            return new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_dsa, new DSAParameter(dsaparameters.getP(), dsaparameters.getQ(), dsaparameters.getG())), new ASN1Integer(asymmetrickeyparameter.getX()));
        } else
        {
            throw new IOException("key parameters not recognised.");
        }
    }
}
