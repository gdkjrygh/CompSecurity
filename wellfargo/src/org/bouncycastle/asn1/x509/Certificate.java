// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.x500.X500Name;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            TBSCertificate, AlgorithmIdentifier, Time, SubjectPublicKeyInfo

public class Certificate extends ASN1Object
{

    ASN1Sequence seq;
    DERBitString sig;
    AlgorithmIdentifier sigAlgId;
    TBSCertificate tbsCert;

    private Certificate(ASN1Sequence asn1sequence)
    {
        seq = asn1sequence;
        if (asn1sequence.size() == 3)
        {
            tbsCert = TBSCertificate.getInstance(asn1sequence.getObjectAt(0));
            sigAlgId = AlgorithmIdentifier.getInstance(asn1sequence.getObjectAt(1));
            sig = DERBitString.getInstance(asn1sequence.getObjectAt(2));
            return;
        } else
        {
            throw new IllegalArgumentException("sequence wrong size for a certificate");
        }
    }

    public static Certificate getInstance(Object obj)
    {
        if (obj instanceof Certificate)
        {
            return (Certificate)obj;
        }
        if (obj != null)
        {
            return new Certificate(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static Certificate getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public Time getEndDate()
    {
        return tbsCert.getEndDate();
    }

    public X500Name getIssuer()
    {
        return tbsCert.getIssuer();
    }

    public ASN1Integer getSerialNumber()
    {
        return tbsCert.getSerialNumber();
    }

    public DERBitString getSignature()
    {
        return sig;
    }

    public AlgorithmIdentifier getSignatureAlgorithm()
    {
        return sigAlgId;
    }

    public Time getStartDate()
    {
        return tbsCert.getStartDate();
    }

    public X500Name getSubject()
    {
        return tbsCert.getSubject();
    }

    public SubjectPublicKeyInfo getSubjectPublicKeyInfo()
    {
        return tbsCert.getSubjectPublicKeyInfo();
    }

    public TBSCertificate getTBSCertificate()
    {
        return tbsCert;
    }

    public ASN1Integer getVersion()
    {
        return tbsCert.getVersion();
    }

    public int getVersionNumber()
    {
        return tbsCert.getVersionNumber();
    }

    public ASN1Primitive toASN1Primitive()
    {
        return seq;
    }
}
