// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

public class PrivateKeyUsagePeriod extends ASN1Object
{

    private DERGeneralizedTime _notAfter;
    private DERGeneralizedTime _notBefore;

    private PrivateKeyUsagePeriod(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        do
        {
            if (!asn1sequence.hasMoreElements())
            {
                break;
            }
            ASN1TaggedObject asn1taggedobject = (ASN1TaggedObject)asn1sequence.nextElement();
            if (asn1taggedobject.getTagNo() == 0)
            {
                _notBefore = DERGeneralizedTime.getInstance(asn1taggedobject, false);
            } else
            if (asn1taggedobject.getTagNo() == 1)
            {
                _notAfter = DERGeneralizedTime.getInstance(asn1taggedobject, false);
            }
        } while (true);
    }

    public static PrivateKeyUsagePeriod getInstance(Object obj)
    {
        if (obj instanceof PrivateKeyUsagePeriod)
        {
            return (PrivateKeyUsagePeriod)obj;
        }
        if (obj != null)
        {
            return new PrivateKeyUsagePeriod(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public DERGeneralizedTime getNotAfter()
    {
        return _notAfter;
    }

    public DERGeneralizedTime getNotBefore()
    {
        return _notBefore;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (_notBefore != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 0, _notBefore));
        }
        if (_notAfter != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 1, _notAfter));
        }
        return new DERSequence(asn1encodablevector);
    }
}
