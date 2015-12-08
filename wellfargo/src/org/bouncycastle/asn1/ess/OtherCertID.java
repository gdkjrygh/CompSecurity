// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ess;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.asn1.x509.IssuerSerial;

public class OtherCertID extends ASN1Object
{

    private IssuerSerial issuerSerial;
    private ASN1Encodable otherCertHash;

    private OtherCertID(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() < 1 || asn1sequence.size() > 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
        if (asn1sequence.getObjectAt(0).toASN1Primitive() instanceof ASN1OctetString)
        {
            otherCertHash = ASN1OctetString.getInstance(asn1sequence.getObjectAt(0));
        } else
        {
            otherCertHash = DigestInfo.getInstance(asn1sequence.getObjectAt(0));
        }
        if (asn1sequence.size() > 1)
        {
            issuerSerial = IssuerSerial.getInstance(asn1sequence.getObjectAt(1));
        }
    }

    public OtherCertID(AlgorithmIdentifier algorithmidentifier, byte abyte0[])
    {
        otherCertHash = new DigestInfo(algorithmidentifier, abyte0);
    }

    public OtherCertID(AlgorithmIdentifier algorithmidentifier, byte abyte0[], IssuerSerial issuerserial)
    {
        otherCertHash = new DigestInfo(algorithmidentifier, abyte0);
        issuerSerial = issuerserial;
    }

    public static OtherCertID getInstance(Object obj)
    {
        if (obj instanceof OtherCertID)
        {
            return (OtherCertID)obj;
        }
        if (obj != null)
        {
            return new OtherCertID(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public AlgorithmIdentifier getAlgorithmHash()
    {
        if (otherCertHash.toASN1Primitive() instanceof ASN1OctetString)
        {
            return new AlgorithmIdentifier("1.3.14.3.2.26");
        } else
        {
            return DigestInfo.getInstance(otherCertHash).getAlgorithmId();
        }
    }

    public byte[] getCertHash()
    {
        if (otherCertHash.toASN1Primitive() instanceof ASN1OctetString)
        {
            return ((ASN1OctetString)otherCertHash.toASN1Primitive()).getOctets();
        } else
        {
            return DigestInfo.getInstance(otherCertHash).getDigest();
        }
    }

    public IssuerSerial getIssuerSerial()
    {
        return issuerSerial;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(otherCertHash);
        if (issuerSerial != null)
        {
            asn1encodablevector.add(issuerSerial);
        }
        return new DERSequence(asn1encodablevector);
    }
}
