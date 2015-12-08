// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.crmf.CertTemplate;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.X509Extensions;

public class RevDetails extends ASN1Object
{

    private CertTemplate certDetails;
    private Extensions crlEntryDetails;

    private RevDetails(ASN1Sequence asn1sequence)
    {
        certDetails = CertTemplate.getInstance(asn1sequence.getObjectAt(0));
        if (asn1sequence.size() > 1)
        {
            crlEntryDetails = Extensions.getInstance(asn1sequence.getObjectAt(1));
        }
    }

    public RevDetails(CertTemplate certtemplate)
    {
        certDetails = certtemplate;
    }

    public RevDetails(CertTemplate certtemplate, Extensions extensions)
    {
        certDetails = certtemplate;
        crlEntryDetails = extensions;
    }

    public RevDetails(CertTemplate certtemplate, X509Extensions x509extensions)
    {
        certDetails = certtemplate;
        crlEntryDetails = Extensions.getInstance(x509extensions.toASN1Primitive());
    }

    public static RevDetails getInstance(Object obj)
    {
        if (obj instanceof RevDetails)
        {
            return (RevDetails)obj;
        }
        if (obj != null)
        {
            return new RevDetails(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public CertTemplate getCertDetails()
    {
        return certDetails;
    }

    public Extensions getCrlEntryDetails()
    {
        return crlEntryDetails;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(certDetails);
        if (crlEntryDetails != null)
        {
            asn1encodablevector.add(crlEntryDetails);
        }
        return new DERSequence(asn1encodablevector);
    }
}
