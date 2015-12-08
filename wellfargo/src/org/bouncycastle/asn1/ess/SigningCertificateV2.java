// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ess;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.PolicyInformation;

// Referenced classes of package org.bouncycastle.asn1.ess:
//            ESSCertIDv2

public class SigningCertificateV2 extends ASN1Object
{

    ASN1Sequence certs;
    ASN1Sequence policies;

    private SigningCertificateV2(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() < 1 || asn1sequence.size() > 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
        certs = ASN1Sequence.getInstance(asn1sequence.getObjectAt(0));
        if (asn1sequence.size() > 1)
        {
            policies = ASN1Sequence.getInstance(asn1sequence.getObjectAt(1));
        }
    }

    public SigningCertificateV2(ESSCertIDv2 aesscertidv2[])
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        for (int i = 0; i < aesscertidv2.length; i++)
        {
            asn1encodablevector.add(aesscertidv2[i]);
        }

        certs = new DERSequence(asn1encodablevector);
    }

    public SigningCertificateV2(ESSCertIDv2 aesscertidv2[], PolicyInformation apolicyinformation[])
    {
        boolean flag = false;
        super();
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        for (int i = 0; i < aesscertidv2.length; i++)
        {
            asn1encodablevector.add(aesscertidv2[i]);
        }

        certs = new DERSequence(asn1encodablevector);
        if (apolicyinformation != null)
        {
            aesscertidv2 = new ASN1EncodableVector();
            for (int j = ((flag) ? 1 : 0); j < apolicyinformation.length; j++)
            {
                aesscertidv2.add(apolicyinformation[j]);
            }

            policies = new DERSequence(aesscertidv2);
        }
    }

    public static SigningCertificateV2 getInstance(Object obj)
    {
        if (obj == null || (obj instanceof SigningCertificateV2))
        {
            return (SigningCertificateV2)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new SigningCertificateV2((ASN1Sequence)obj);
        } else
        {
            return null;
        }
    }

    public ESSCertIDv2[] getCerts()
    {
        ESSCertIDv2 aesscertidv2[] = new ESSCertIDv2[certs.size()];
        for (int i = 0; i != certs.size(); i++)
        {
            aesscertidv2[i] = ESSCertIDv2.getInstance(certs.getObjectAt(i));
        }

        return aesscertidv2;
    }

    public PolicyInformation[] getPolicies()
    {
        if (policies == null)
        {
            return null;
        }
        PolicyInformation apolicyinformation[] = new PolicyInformation[policies.size()];
        for (int i = 0; i != policies.size(); i++)
        {
            apolicyinformation[i] = PolicyInformation.getInstance(policies.getObjectAt(i));
        }

        return apolicyinformation;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(certs);
        if (policies != null)
        {
            asn1encodablevector.add(policies);
        }
        return new DERSequence(asn1encodablevector);
    }
}
