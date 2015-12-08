// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

public class RSAPrivateKey extends ASN1Object
{

    private BigInteger coefficient;
    private BigInteger exponent1;
    private BigInteger exponent2;
    private BigInteger modulus;
    private ASN1Sequence otherPrimeInfos;
    private BigInteger prime1;
    private BigInteger prime2;
    private BigInteger privateExponent;
    private BigInteger publicExponent;
    private BigInteger version;

    public RSAPrivateKey(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3, BigInteger biginteger4, BigInteger biginteger5, BigInteger biginteger6, 
            BigInteger biginteger7)
    {
        otherPrimeInfos = null;
        version = BigInteger.valueOf(0L);
        modulus = biginteger;
        publicExponent = biginteger1;
        privateExponent = biginteger2;
        prime1 = biginteger3;
        prime2 = biginteger4;
        exponent1 = biginteger5;
        exponent2 = biginteger6;
        coefficient = biginteger7;
    }

    private RSAPrivateKey(ASN1Sequence asn1sequence)
    {
        otherPrimeInfos = null;
        asn1sequence = asn1sequence.getObjects();
        BigInteger biginteger = ((ASN1Integer)asn1sequence.nextElement()).getValue();
        if (biginteger.intValue() != 0 && biginteger.intValue() != 1)
        {
            throw new IllegalArgumentException("wrong version for RSA private key");
        }
        version = biginteger;
        modulus = ((ASN1Integer)asn1sequence.nextElement()).getValue();
        publicExponent = ((ASN1Integer)asn1sequence.nextElement()).getValue();
        privateExponent = ((ASN1Integer)asn1sequence.nextElement()).getValue();
        prime1 = ((ASN1Integer)asn1sequence.nextElement()).getValue();
        prime2 = ((ASN1Integer)asn1sequence.nextElement()).getValue();
        exponent1 = ((ASN1Integer)asn1sequence.nextElement()).getValue();
        exponent2 = ((ASN1Integer)asn1sequence.nextElement()).getValue();
        coefficient = ((ASN1Integer)asn1sequence.nextElement()).getValue();
        if (asn1sequence.hasMoreElements())
        {
            otherPrimeInfos = (ASN1Sequence)asn1sequence.nextElement();
        }
    }

    public static RSAPrivateKey getInstance(Object obj)
    {
        if (obj instanceof RSAPrivateKey)
        {
            return (RSAPrivateKey)obj;
        }
        if (obj != null)
        {
            return new RSAPrivateKey(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static RSAPrivateKey getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public BigInteger getCoefficient()
    {
        return coefficient;
    }

    public BigInteger getExponent1()
    {
        return exponent1;
    }

    public BigInteger getExponent2()
    {
        return exponent2;
    }

    public BigInteger getModulus()
    {
        return modulus;
    }

    public BigInteger getPrime1()
    {
        return prime1;
    }

    public BigInteger getPrime2()
    {
        return prime2;
    }

    public BigInteger getPrivateExponent()
    {
        return privateExponent;
    }

    public BigInteger getPublicExponent()
    {
        return publicExponent;
    }

    public BigInteger getVersion()
    {
        return version;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(new ASN1Integer(version));
        asn1encodablevector.add(new ASN1Integer(getModulus()));
        asn1encodablevector.add(new ASN1Integer(getPublicExponent()));
        asn1encodablevector.add(new ASN1Integer(getPrivateExponent()));
        asn1encodablevector.add(new ASN1Integer(getPrime1()));
        asn1encodablevector.add(new ASN1Integer(getPrime2()));
        asn1encodablevector.add(new ASN1Integer(getExponent1()));
        asn1encodablevector.add(new ASN1Integer(getExponent2()));
        asn1encodablevector.add(new ASN1Integer(getCoefficient()));
        if (otherPrimeInfos != null)
        {
            asn1encodablevector.add(otherPrimeInfos);
        }
        return new DERSequence(asn1encodablevector);
    }
}
