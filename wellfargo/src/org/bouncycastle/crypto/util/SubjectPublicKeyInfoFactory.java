// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.util;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSAPublicKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;

public class SubjectPublicKeyInfoFactory
{

    public SubjectPublicKeyInfoFactory()
    {
    }

    public static SubjectPublicKeyInfo createSubjectPublicKeyInfo(AsymmetricKeyParameter asymmetrickeyparameter)
    {
        if (asymmetrickeyparameter instanceof RSAKeyParameters)
        {
            asymmetrickeyparameter = (RSAKeyParameters)asymmetrickeyparameter;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE), new RSAPublicKey(asymmetrickeyparameter.getModulus(), asymmetrickeyparameter.getExponent()));
        }
        if (asymmetrickeyparameter instanceof DSAPublicKeyParameters)
        {
            asymmetrickeyparameter = (DSAPublicKeyParameters)asymmetrickeyparameter;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_dsa), new ASN1Integer(asymmetrickeyparameter.getY()));
        } else
        {
            throw new IOException("key parameters not recognised.");
        }
    }
}
