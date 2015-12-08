// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class AttCertValidityPeriod extends ASN1Object
{

    ASN1GeneralizedTime notAfterTime;
    ASN1GeneralizedTime notBeforeTime;

    public AttCertValidityPeriod(ASN1GeneralizedTime asn1generalizedtime, ASN1GeneralizedTime asn1generalizedtime1)
    {
        notBeforeTime = asn1generalizedtime;
        notAfterTime = asn1generalizedtime1;
    }

    private AttCertValidityPeriod(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        } else
        {
            notBeforeTime = ASN1GeneralizedTime.getInstance(asn1sequence.getObjectAt(0));
            notAfterTime = ASN1GeneralizedTime.getInstance(asn1sequence.getObjectAt(1));
            return;
        }
    }

    public static AttCertValidityPeriod getInstance(Object obj)
    {
        if (obj instanceof AttCertValidityPeriod)
        {
            return (AttCertValidityPeriod)obj;
        }
        if (obj != null)
        {
            return new AttCertValidityPeriod(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1GeneralizedTime getNotAfterTime()
    {
        return notAfterTime;
    }

    public ASN1GeneralizedTime getNotBeforeTime()
    {
        return notBeforeTime;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(notBeforeTime);
        asn1encodablevector.add(notAfterTime);
        return new DERSequence(asn1encodablevector);
    }
}
