// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.X500Name;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            TBSCertList, AlgorithmIdentifier, Time

public class CertificateList extends ASN1Object
{

    DERBitString sig;
    AlgorithmIdentifier sigAlgId;
    TBSCertList tbsCertList;

    public CertificateList(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() == 3)
        {
            tbsCertList = TBSCertList.getInstance(asn1sequence.getObjectAt(0));
            sigAlgId = AlgorithmIdentifier.getInstance(asn1sequence.getObjectAt(1));
            sig = DERBitString.getInstance(asn1sequence.getObjectAt(2));
            return;
        } else
        {
            throw new IllegalArgumentException("sequence wrong size for CertificateList");
        }
    }

    public static CertificateList getInstance(Object obj)
    {
        if (obj instanceof CertificateList)
        {
            return (CertificateList)obj;
        }
        if (obj != null)
        {
            return new CertificateList(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static CertificateList getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public X500Name getIssuer()
    {
        return tbsCertList.getIssuer();
    }

    public Time getNextUpdate()
    {
        return tbsCertList.getNextUpdate();
    }

    public Enumeration getRevokedCertificateEnumeration()
    {
        return tbsCertList.getRevokedCertificateEnumeration();
    }

    public TBSCertList.CRLEntry[] getRevokedCertificates()
    {
        return tbsCertList.getRevokedCertificates();
    }

    public DERBitString getSignature()
    {
        return sig;
    }

    public AlgorithmIdentifier getSignatureAlgorithm()
    {
        return sigAlgId;
    }

    public TBSCertList getTBSCertList()
    {
        return tbsCertList;
    }

    public Time getThisUpdate()
    {
        return tbsCertList.getThisUpdate();
    }

    public int getVersionNumber()
    {
        return tbsCertList.getVersionNumber();
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(tbsCertList);
        asn1encodablevector.add(sigAlgId);
        asn1encodablevector.add(sig);
        return new DERSequence(asn1encodablevector);
    }
}
