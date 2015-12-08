// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class InfoTypeAndValue extends ASN1Object
{

    private ASN1ObjectIdentifier infoType;
    private ASN1Encodable infoValue;

    public InfoTypeAndValue(ASN1ObjectIdentifier asn1objectidentifier)
    {
        infoType = asn1objectidentifier;
        infoValue = null;
    }

    public InfoTypeAndValue(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        infoType = asn1objectidentifier;
        infoValue = asn1encodable;
    }

    private InfoTypeAndValue(ASN1Sequence asn1sequence)
    {
        infoType = ASN1ObjectIdentifier.getInstance(asn1sequence.getObjectAt(0));
        if (asn1sequence.size() > 1)
        {
            infoValue = asn1sequence.getObjectAt(1);
        }
    }

    public static InfoTypeAndValue getInstance(Object obj)
    {
        if (obj instanceof InfoTypeAndValue)
        {
            return (InfoTypeAndValue)obj;
        }
        if (obj != null)
        {
            return new InfoTypeAndValue(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1ObjectIdentifier getInfoType()
    {
        return infoType;
    }

    public ASN1Encodable getInfoValue()
    {
        return infoValue;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(infoType);
        if (infoValue != null)
        {
            asn1encodablevector.add(infoValue);
        }
        return new DERSequence(asn1encodablevector);
    }
}
