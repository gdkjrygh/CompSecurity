// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.ocsp.ResponderID;

public class OcspIdentifier extends ASN1Object
{

    private ResponderID ocspResponderID;
    private ASN1GeneralizedTime producedAt;

    private OcspIdentifier(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        } else
        {
            ocspResponderID = ResponderID.getInstance(asn1sequence.getObjectAt(0));
            producedAt = (ASN1GeneralizedTime)asn1sequence.getObjectAt(1);
            return;
        }
    }

    public OcspIdentifier(ResponderID responderid, ASN1GeneralizedTime asn1generalizedtime)
    {
        ocspResponderID = responderid;
        producedAt = asn1generalizedtime;
    }

    public static OcspIdentifier getInstance(Object obj)
    {
        if (obj instanceof OcspIdentifier)
        {
            return (OcspIdentifier)obj;
        }
        if (obj != null)
        {
            return new OcspIdentifier(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ResponderID getOcspResponderID()
    {
        return ocspResponderID;
    }

    public ASN1GeneralizedTime getProducedAt()
    {
        return producedAt;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(ocspResponderID);
        asn1encodablevector.add(producedAt);
        return new DERSequence(asn1encodablevector);
    }
}
