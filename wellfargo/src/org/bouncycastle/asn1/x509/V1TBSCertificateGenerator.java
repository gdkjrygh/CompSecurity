// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            TBSCertificate, Time, X509Name, AlgorithmIdentifier, 
//            SubjectPublicKeyInfo

public class V1TBSCertificateGenerator
{

    Time endDate;
    X500Name issuer;
    ASN1Integer serialNumber;
    AlgorithmIdentifier signature;
    Time startDate;
    X500Name subject;
    SubjectPublicKeyInfo subjectPublicKeyInfo;
    DERTaggedObject version;

    public V1TBSCertificateGenerator()
    {
        version = new DERTaggedObject(true, 0, new ASN1Integer(0L));
    }

    public TBSCertificate generateTBSCertificate()
    {
        if (serialNumber == null || signature == null || issuer == null || startDate == null || endDate == null || subject == null || subjectPublicKeyInfo == null)
        {
            throw new IllegalStateException("not all mandatory fields set in V1 TBScertificate generator");
        } else
        {
            ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
            asn1encodablevector.add(serialNumber);
            asn1encodablevector.add(signature);
            asn1encodablevector.add(issuer);
            ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
            asn1encodablevector1.add(startDate);
            asn1encodablevector1.add(endDate);
            asn1encodablevector.add(new DERSequence(asn1encodablevector1));
            asn1encodablevector.add(subject);
            asn1encodablevector.add(subjectPublicKeyInfo);
            return TBSCertificate.getInstance(new DERSequence(asn1encodablevector));
        }
    }

    public void setEndDate(ASN1UTCTime asn1utctime)
    {
        endDate = new Time(asn1utctime);
    }

    public void setEndDate(Time time)
    {
        endDate = time;
    }

    public void setIssuer(X500Name x500name)
    {
        issuer = x500name;
    }

    public void setIssuer(X509Name x509name)
    {
        issuer = X500Name.getInstance(x509name.toASN1Primitive());
    }

    public void setSerialNumber(ASN1Integer asn1integer)
    {
        serialNumber = asn1integer;
    }

    public void setSignature(AlgorithmIdentifier algorithmidentifier)
    {
        signature = algorithmidentifier;
    }

    public void setStartDate(ASN1UTCTime asn1utctime)
    {
        startDate = new Time(asn1utctime);
    }

    public void setStartDate(Time time)
    {
        startDate = time;
    }

    public void setSubject(X500Name x500name)
    {
        subject = x500name;
    }

    public void setSubject(X509Name x509name)
    {
        subject = X500Name.getInstance(x509name.toASN1Primitive());
    }

    public void setSubjectPublicKeyInfo(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        subjectPublicKeyInfo = subjectpublickeyinfo;
    }
}
