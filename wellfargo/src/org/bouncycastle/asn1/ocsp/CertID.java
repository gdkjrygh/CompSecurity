// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class CertID extends ASN1Object
{

    AlgorithmIdentifier hashAlgorithm;
    ASN1OctetString issuerKeyHash;
    ASN1OctetString issuerNameHash;
    ASN1Integer serialNumber;

    private CertID(ASN1Sequence asn1sequence)
    {
        hashAlgorithm = AlgorithmIdentifier.getInstance(asn1sequence.getObjectAt(0));
        issuerNameHash = (ASN1OctetString)asn1sequence.getObjectAt(1);
        issuerKeyHash = (ASN1OctetString)asn1sequence.getObjectAt(2);
        serialNumber = (ASN1Integer)asn1sequence.getObjectAt(3);
    }

    public CertID(AlgorithmIdentifier algorithmidentifier, ASN1OctetString asn1octetstring, ASN1OctetString asn1octetstring1, ASN1Integer asn1integer)
    {
        hashAlgorithm = algorithmidentifier;
        issuerNameHash = asn1octetstring;
        issuerKeyHash = asn1octetstring1;
        serialNumber = asn1integer;
    }

    public static CertID getInstance(Object obj)
    {
        if (obj instanceof CertID)
        {
            return (CertID)obj;
        }
        if (obj != null)
        {
            return new CertID(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static CertID getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public AlgorithmIdentifier getHashAlgorithm()
    {
        return hashAlgorithm;
    }

    public ASN1OctetString getIssuerKeyHash()
    {
        return issuerKeyHash;
    }

    public ASN1OctetString getIssuerNameHash()
    {
        return issuerNameHash;
    }

    public ASN1Integer getSerialNumber()
    {
        return serialNumber;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(hashAlgorithm);
        asn1encodablevector.add(issuerNameHash);
        asn1encodablevector.add(issuerKeyHash);
        asn1encodablevector.add(serialNumber);
        return new DERSequence(asn1encodablevector);
    }
}
