// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.crmf:
//            CertRequest, ProofOfPossession, AttributeTypeAndValue

public class CertReqMsg extends ASN1Object
{

    private CertRequest certReq;
    private ProofOfPossession pop;
    private ASN1Sequence regInfo;

    private CertReqMsg(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        certReq = CertRequest.getInstance(asn1sequence.nextElement());
        while (asn1sequence.hasMoreElements()) 
        {
            Object obj = asn1sequence.nextElement();
            if ((obj instanceof ASN1TaggedObject) || (obj instanceof ProofOfPossession))
            {
                pop = ProofOfPossession.getInstance(obj);
            } else
            {
                regInfo = ASN1Sequence.getInstance(obj);
            }
        }
    }

    public CertReqMsg(CertRequest certrequest, ProofOfPossession proofofpossession, AttributeTypeAndValue aattributetypeandvalue[])
    {
        if (certrequest == null)
        {
            throw new IllegalArgumentException("'certReq' cannot be null");
        }
        certReq = certrequest;
        pop = proofofpossession;
        if (aattributetypeandvalue != null)
        {
            regInfo = new DERSequence(aattributetypeandvalue);
        }
    }

    private void addOptional(ASN1EncodableVector asn1encodablevector, ASN1Encodable asn1encodable)
    {
        if (asn1encodable != null)
        {
            asn1encodablevector.add(asn1encodable);
        }
    }

    public static CertReqMsg getInstance(Object obj)
    {
        if (obj instanceof CertReqMsg)
        {
            return (CertReqMsg)obj;
        }
        if (obj != null)
        {
            return new CertReqMsg(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public CertRequest getCertReq()
    {
        return certReq;
    }

    public ProofOfPossession getPop()
    {
        return pop;
    }

    public ProofOfPossession getPopo()
    {
        return pop;
    }

    public AttributeTypeAndValue[] getRegInfo()
    {
        if (regInfo == null)
        {
            return null;
        }
        AttributeTypeAndValue aattributetypeandvalue[] = new AttributeTypeAndValue[regInfo.size()];
        for (int i = 0; i != aattributetypeandvalue.length; i++)
        {
            aattributetypeandvalue[i] = AttributeTypeAndValue.getInstance(regInfo.getObjectAt(i));
        }

        return aattributetypeandvalue;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(certReq);
        addOptional(asn1encodablevector, pop);
        addOptional(asn1encodablevector, regInfo);
        return new DERSequence(asn1encodablevector);
    }
}
