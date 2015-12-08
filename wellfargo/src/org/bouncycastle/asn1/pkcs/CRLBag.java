// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

public class CRLBag extends ASN1Object
{

    private ASN1ObjectIdentifier crlId;
    private ASN1Encodable crlValue;

    public CRLBag(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        crlId = asn1objectidentifier;
        crlValue = asn1encodable;
    }

    private CRLBag(ASN1Sequence asn1sequence)
    {
        crlId = (ASN1ObjectIdentifier)asn1sequence.getObjectAt(0);
        crlValue = ((DERTaggedObject)asn1sequence.getObjectAt(1)).getObject();
    }

    public static CRLBag getInstance(Object obj)
    {
        if (obj instanceof CRLBag)
        {
            return (CRLBag)obj;
        }
        if (obj != null)
        {
            return new CRLBag(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Encodable getCRLValue()
    {
        return crlValue;
    }

    public ASN1ObjectIdentifier getcrlId()
    {
        return crlId;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(crlId);
        asn1encodablevector.add(new DERTaggedObject(0, crlValue));
        return new DERSequence(asn1encodablevector);
    }
}
