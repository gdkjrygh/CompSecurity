// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            Attribute, AttCertValidityPeriod, AttributeCertificateInfo, X509Extensions, 
//            Extensions, Holder, AttCertIssuer, AlgorithmIdentifier

public class V2AttributeCertificateInfoGenerator
{

    private ASN1EncodableVector attributes;
    private ASN1GeneralizedTime endDate;
    private Extensions extensions;
    private Holder holder;
    private AttCertIssuer issuer;
    private DERBitString issuerUniqueID;
    private ASN1Integer serialNumber;
    private AlgorithmIdentifier signature;
    private ASN1GeneralizedTime startDate;
    private ASN1Integer version;

    public V2AttributeCertificateInfoGenerator()
    {
        version = new ASN1Integer(1L);
        attributes = new ASN1EncodableVector();
    }

    public void addAttribute(String s, ASN1Encodable asn1encodable)
    {
        attributes.add(new Attribute(new ASN1ObjectIdentifier(s), new DERSet(asn1encodable)));
    }

    public void addAttribute(Attribute attribute)
    {
        attributes.add(attribute);
    }

    public AttributeCertificateInfo generateAttributeCertificateInfo()
    {
        if (serialNumber == null || signature == null || issuer == null || startDate == null || endDate == null || holder == null || attributes == null)
        {
            throw new IllegalStateException("not all mandatory fields set in V2 AttributeCertificateInfo generator");
        }
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(version);
        asn1encodablevector.add(holder);
        asn1encodablevector.add(issuer);
        asn1encodablevector.add(signature);
        asn1encodablevector.add(serialNumber);
        asn1encodablevector.add(new AttCertValidityPeriod(startDate, endDate));
        asn1encodablevector.add(new DERSequence(attributes));
        if (issuerUniqueID != null)
        {
            asn1encodablevector.add(issuerUniqueID);
        }
        if (extensions != null)
        {
            asn1encodablevector.add(extensions);
        }
        return AttributeCertificateInfo.getInstance(new DERSequence(asn1encodablevector));
    }

    public void setEndDate(ASN1GeneralizedTime asn1generalizedtime)
    {
        endDate = asn1generalizedtime;
    }

    public void setExtensions(Extensions extensions1)
    {
        extensions = extensions1;
    }

    public void setExtensions(X509Extensions x509extensions)
    {
        extensions = Extensions.getInstance(x509extensions.toASN1Primitive());
    }

    public void setHolder(Holder holder1)
    {
        holder = holder1;
    }

    public void setIssuer(AttCertIssuer attcertissuer)
    {
        issuer = attcertissuer;
    }

    public void setIssuerUniqueID(DERBitString derbitstring)
    {
        issuerUniqueID = derbitstring;
    }

    public void setSerialNumber(ASN1Integer asn1integer)
    {
        serialNumber = asn1integer;
    }

    public void setSignature(AlgorithmIdentifier algorithmidentifier)
    {
        signature = algorithmidentifier;
    }

    public void setStartDate(ASN1GeneralizedTime asn1generalizedtime)
    {
        startDate = asn1generalizedtime;
    }
}
