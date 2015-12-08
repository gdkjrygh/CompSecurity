// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.util;

import java.io.InputStream;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.nist.NISTNamedCurves;
import org.bouncycastle.asn1.oiw.ElGamalParameter;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.DHParameter;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSAPrivateKey;
import org.bouncycastle.asn1.sec.ECPrivateKey;
import org.bouncycastle.asn1.sec.SECNamedCurves;
import org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.asn1.x9.X962NamedCurves;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;

public class PrivateKeyFactory
{

    public PrivateKeyFactory()
    {
    }

    public static AsymmetricKeyParameter createKey(InputStream inputstream)
    {
        return createKey(PrivateKeyInfo.getInstance((new ASN1InputStream(inputstream)).readObject()));
    }

    public static AsymmetricKeyParameter createKey(PrivateKeyInfo privatekeyinfo)
    {
        Object obj2 = privatekeyinfo.getPrivateKeyAlgorithm();
        if (((AlgorithmIdentifier) (obj2)).getAlgorithm().equals(PKCSObjectIdentifiers.rsaEncryption))
        {
            privatekeyinfo = RSAPrivateKey.getInstance(privatekeyinfo.parsePrivateKey());
            return new RSAPrivateCrtKeyParameters(privatekeyinfo.getModulus(), privatekeyinfo.getPublicExponent(), privatekeyinfo.getPrivateExponent(), privatekeyinfo.getPrime1(), privatekeyinfo.getPrime2(), privatekeyinfo.getExponent1(), privatekeyinfo.getExponent2(), privatekeyinfo.getCoefficient());
        }
        if (((AlgorithmIdentifier) (obj2)).getAlgorithm().equals(PKCSObjectIdentifiers.dhKeyAgreement))
        {
            Object obj = DHParameter.getInstance(((AlgorithmIdentifier) (obj2)).getParameters());
            privatekeyinfo = (ASN1Integer)privatekeyinfo.parsePrivateKey();
            obj2 = ((DHParameter) (obj)).getL();
            int i;
            if (obj2 == null)
            {
                i = 0;
            } else
            {
                i = ((BigInteger) (obj2)).intValue();
            }
            obj = new DHParameters(((DHParameter) (obj)).getP(), ((DHParameter) (obj)).getG(), null, i);
            return new DHPrivateKeyParameters(privatekeyinfo.getValue(), ((DHParameters) (obj)));
        }
        if (((AlgorithmIdentifier) (obj2)).getAlgorithm().equals(OIWObjectIdentifiers.elGamalAlgorithm))
        {
            ElGamalParameter elgamalparameter = new ElGamalParameter((ASN1Sequence)((AlgorithmIdentifier) (obj2)).getParameters());
            return new ElGamalPrivateKeyParameters(((ASN1Integer)privatekeyinfo.parsePrivateKey()).getValue(), new ElGamalParameters(elgamalparameter.getP(), elgamalparameter.getG()));
        }
        if (((AlgorithmIdentifier) (obj2)).getAlgorithm().equals(X9ObjectIdentifiers.id_dsa))
        {
            Object obj1 = (ASN1Integer)privatekeyinfo.parsePrivateKey();
            privatekeyinfo = ((AlgorithmIdentifier) (obj2)).getParameters();
            ASN1ObjectIdentifier asn1objectidentifier;
            if (privatekeyinfo != null)
            {
                privatekeyinfo = DSAParameter.getInstance(privatekeyinfo.toASN1Primitive());
                privatekeyinfo = new DSAParameters(privatekeyinfo.getP(), privatekeyinfo.getQ(), privatekeyinfo.getG());
            } else
            {
                privatekeyinfo = null;
            }
            return new DSAPrivateKeyParameters(((ASN1Integer) (obj1)).getValue(), privatekeyinfo);
        }
        if (((AlgorithmIdentifier) (obj2)).getAlgorithm().equals(X9ObjectIdentifiers.id_ecPublicKey))
        {
            obj1 = new X962Parameters((ASN1Primitive)((AlgorithmIdentifier) (obj2)).getParameters());
            if (((X962Parameters) (obj1)).isNamedCurve())
            {
                asn1objectidentifier = ASN1ObjectIdentifier.getInstance(((X962Parameters) (obj1)).getParameters());
                obj2 = X962NamedCurves.getByOID(asn1objectidentifier);
                obj1 = obj2;
                if (obj2 == null)
                {
                    obj2 = SECNamedCurves.getByOID(asn1objectidentifier);
                    obj1 = obj2;
                    if (obj2 == null)
                    {
                        obj2 = NISTNamedCurves.getByOID(asn1objectidentifier);
                        obj1 = obj2;
                        if (obj2 == null)
                        {
                            obj1 = TeleTrusTNamedCurves.getByOID(asn1objectidentifier);
                        }
                    }
                }
            } else
            {
                obj1 = X9ECParameters.getInstance(((X962Parameters) (obj1)).getParameters());
            }
            return new ECPrivateKeyParameters(ECPrivateKey.getInstance(privatekeyinfo.parsePrivateKey()).getKey(), new ECDomainParameters(((X9ECParameters) (obj1)).getCurve(), ((X9ECParameters) (obj1)).getG(), ((X9ECParameters) (obj1)).getN(), ((X9ECParameters) (obj1)).getH(), ((X9ECParameters) (obj1)).getSeed()));
        } else
        {
            throw new RuntimeException("algorithm identifier in key not recognised");
        }
    }

    public static AsymmetricKeyParameter createKey(byte abyte0[])
    {
        return createKey(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray(abyte0)));
    }
}
