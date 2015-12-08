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
//            ESSCertID

public class SigningCertificate extends ASN1Object
{

    ASN1Sequence certs;
    ASN1Sequence policies;

    private SigningCertificate(ASN1Sequence asn1sequence)
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

    public SigningCertificate(ESSCertID esscertid)
    {
        certs = new DERSequence(esscertid);
    }

    public static SigningCertificate getInstance(Object obj)
    {
        if (obj instanceof SigningCertificate)
        {
            return (SigningCertificate)obj;
        }
        if (obj != null)
        {
            return new SigningCertificate(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ESSCertID[] getCerts()
    {
        ESSCertID aesscertid[] = new ESSCertID[certs.size()];
        for (int i = 0; i != certs.size(); i++)
        {
            aesscertid[i] = ESSCertID.getInstance(certs.getObjectAt(i));
        }

        return aesscertid;
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
