// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class OtherKeyAttribute extends ASN1Object
{

    private ASN1Encodable keyAttr;
    private ASN1ObjectIdentifier keyAttrId;

    public OtherKeyAttribute(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        keyAttrId = asn1objectidentifier;
        keyAttr = asn1encodable;
    }

    public OtherKeyAttribute(ASN1Sequence asn1sequence)
    {
        keyAttrId = (ASN1ObjectIdentifier)asn1sequence.getObjectAt(0);
        keyAttr = asn1sequence.getObjectAt(1);
    }

    public static OtherKeyAttribute getInstance(Object obj)
    {
        if (obj == null || (obj instanceof OtherKeyAttribute))
        {
            return (OtherKeyAttribute)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new OtherKeyAttribute((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown object in factory: ").append(obj.getClass().getName()).toString());
        }
    }

    public ASN1Encodable getKeyAttr()
    {
        return keyAttr;
    }

    public ASN1ObjectIdentifier getKeyAttrId()
    {
        return keyAttrId;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(keyAttrId);
        asn1encodablevector.add(keyAttr);
        return new DERSequence(asn1encodablevector);
    }
}
