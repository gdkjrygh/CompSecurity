// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.CertificateList;

public class CRLAnnContent extends ASN1Object
{

    private ASN1Sequence content;

    private CRLAnnContent(ASN1Sequence asn1sequence)
    {
        content = asn1sequence;
    }

    public CRLAnnContent(CertificateList certificatelist)
    {
        content = new DERSequence(certificatelist);
    }

    public static CRLAnnContent getInstance(Object obj)
    {
        if (obj instanceof CRLAnnContent)
        {
            return (CRLAnnContent)obj;
        }
        if (obj != null)
        {
            return new CRLAnnContent(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public CertificateList[] getCertificateLists()
    {
        CertificateList acertificatelist[] = new CertificateList[content.size()];
        for (int i = 0; i != acertificatelist.length; i++)
        {
            acertificatelist[i] = CertificateList.getInstance(content.getObjectAt(i));
        }

        return acertificatelist;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return content;
    }
}
