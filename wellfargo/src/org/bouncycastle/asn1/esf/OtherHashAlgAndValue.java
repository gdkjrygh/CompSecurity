// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class OtherHashAlgAndValue extends ASN1Object
{

    private AlgorithmIdentifier hashAlgorithm;
    private ASN1OctetString hashValue;

    private OtherHashAlgAndValue(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        } else
        {
            hashAlgorithm = AlgorithmIdentifier.getInstance(asn1sequence.getObjectAt(0));
            hashValue = ASN1OctetString.getInstance(asn1sequence.getObjectAt(1));
            return;
        }
    }

    public OtherHashAlgAndValue(AlgorithmIdentifier algorithmidentifier, ASN1OctetString asn1octetstring)
    {
        hashAlgorithm = algorithmidentifier;
        hashValue = asn1octetstring;
    }

    public static OtherHashAlgAndValue getInstance(Object obj)
    {
        if (obj instanceof OtherHashAlgAndValue)
        {
            return (OtherHashAlgAndValue)obj;
        }
        if (obj != null)
        {
            return new OtherHashAlgAndValue(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public AlgorithmIdentifier getHashAlgorithm()
    {
        return hashAlgorithm;
    }

    public ASN1OctetString getHashValue()
    {
        return hashValue;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(hashAlgorithm);
        asn1encodablevector.add(hashValue);
        return new DERSequence(asn1encodablevector);
    }
}
