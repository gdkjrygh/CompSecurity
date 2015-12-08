// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            CMPCertificate, CertResponse

public class CertRepMessage extends ASN1Object
{

    private ASN1Sequence caPubs;
    private ASN1Sequence response;

    private CertRepMessage(ASN1Sequence asn1sequence)
    {
        int i = 0;
        if (asn1sequence.size() > 1)
        {
            caPubs = ASN1Sequence.getInstance((ASN1TaggedObject)asn1sequence.getObjectAt(0), true);
            i = 1;
        }
        response = ASN1Sequence.getInstance(asn1sequence.getObjectAt(i));
    }

    public CertRepMessage(CMPCertificate acmpcertificate[], CertResponse acertresponse[])
    {
        boolean flag = false;
        super();
        if (acertresponse == null)
        {
            throw new IllegalArgumentException("'response' cannot be null");
        }
        if (acmpcertificate != null)
        {
            ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
            for (int i = 0; i < acmpcertificate.length; i++)
            {
                asn1encodablevector.add(acmpcertificate[i]);
            }

            caPubs = new DERSequence(asn1encodablevector);
        }
        acmpcertificate = new ASN1EncodableVector();
        for (int j = ((flag) ? 1 : 0); j < acertresponse.length; j++)
        {
            acmpcertificate.add(acertresponse[j]);
        }

        response = new DERSequence(acmpcertificate);
    }

    public static CertRepMessage getInstance(Object obj)
    {
        if (obj instanceof CertRepMessage)
        {
            return (CertRepMessage)obj;
        }
        if (obj != null)
        {
            return new CertRepMessage(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public CMPCertificate[] getCaPubs()
    {
        if (caPubs == null)
        {
            return null;
        }
        CMPCertificate acmpcertificate[] = new CMPCertificate[caPubs.size()];
        for (int i = 0; i != acmpcertificate.length; i++)
        {
            acmpcertificate[i] = CMPCertificate.getInstance(caPubs.getObjectAt(i));
        }

        return acmpcertificate;
    }

    public CertResponse[] getResponse()
    {
        CertResponse acertresponse[] = new CertResponse[response.size()];
        for (int i = 0; i != acertresponse.length; i++)
        {
            acertresponse[i] = CertResponse.getInstance(response.getObjectAt(i));
        }

        return acertresponse;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (caPubs != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 1, caPubs));
        }
        asn1encodablevector.add(response);
        return new DERSequence(asn1encodablevector);
    }
}
