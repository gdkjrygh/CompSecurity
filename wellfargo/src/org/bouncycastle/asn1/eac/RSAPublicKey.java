// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.eac;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.eac:
//            PublicKeyDataObject, UnsignedInteger

public class RSAPublicKey extends PublicKeyDataObject
{

    private static int exponentValid = 2;
    private static int modulusValid = 1;
    private BigInteger exponent;
    private BigInteger modulus;
    private ASN1ObjectIdentifier usage;
    private int valid;

    public RSAPublicKey(ASN1ObjectIdentifier asn1objectidentifier, BigInteger biginteger, BigInteger biginteger1)
    {
        valid = 0;
        usage = asn1objectidentifier;
        modulus = biginteger;
        exponent = biginteger1;
    }

    RSAPublicKey(ASN1Sequence asn1sequence)
    {
        valid = 0;
        asn1sequence = asn1sequence.getObjects();
        usage = ASN1ObjectIdentifier.getInstance(asn1sequence.nextElement());
        do
        {
            if (asn1sequence.hasMoreElements())
            {
                UnsignedInteger unsignedinteger = UnsignedInteger.getInstance(asn1sequence.nextElement());
                switch (unsignedinteger.getTagNo())
                {
                default:
                    throw new IllegalArgumentException((new StringBuilder()).append("Unknown DERTaggedObject :").append(unsignedinteger.getTagNo()).append("-> not an Iso7816RSAPublicKeyStructure").toString());

                case 1: // '\001'
                    setModulus(unsignedinteger);
                    break;

                case 2: // '\002'
                    setExponent(unsignedinteger);
                    break;
                }
                continue;
            }
            if (valid != 3)
            {
                throw new IllegalArgumentException("missing argument -> not an Iso7816RSAPublicKeyStructure");
            }
            break;
        } while (true);
    }

    private void setExponent(UnsignedInteger unsignedinteger)
    {
        if ((valid & exponentValid) == 0)
        {
            valid = valid | exponentValid;
            exponent = unsignedinteger.getValue();
            return;
        } else
        {
            throw new IllegalArgumentException("Exponent already set");
        }
    }

    private void setModulus(UnsignedInteger unsignedinteger)
    {
        if ((valid & modulusValid) == 0)
        {
            valid = valid | modulusValid;
            modulus = unsignedinteger.getValue();
            return;
        } else
        {
            throw new IllegalArgumentException("Modulus already set");
        }
    }

    public BigInteger getModulus()
    {
        return modulus;
    }

    public BigInteger getPublicExponent()
    {
        return exponent;
    }

    public ASN1ObjectIdentifier getUsage()
    {
        return usage;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(usage);
        asn1encodablevector.add(new UnsignedInteger(1, getModulus()));
        asn1encodablevector.add(new UnsignedInteger(2, getPublicExponent()));
        return new DERSequence(asn1encodablevector);
    }

}
