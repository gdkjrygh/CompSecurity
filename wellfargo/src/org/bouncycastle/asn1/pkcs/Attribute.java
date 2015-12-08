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
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERSequence;

public class Attribute extends ASN1Object
{

    private ASN1ObjectIdentifier attrType;
    private ASN1Set attrValues;

    public Attribute(ASN1ObjectIdentifier asn1objectidentifier, ASN1Set asn1set)
    {
        attrType = asn1objectidentifier;
        attrValues = asn1set;
    }

    public Attribute(ASN1Sequence asn1sequence)
    {
        attrType = (ASN1ObjectIdentifier)asn1sequence.getObjectAt(0);
        attrValues = (ASN1Set)asn1sequence.getObjectAt(1);
    }

    public static Attribute getInstance(Object obj)
    {
        if (obj == null || (obj instanceof Attribute))
        {
            return (Attribute)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new Attribute((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown object in factory: ").append(obj.getClass().getName()).toString());
        }
    }

    public ASN1ObjectIdentifier getAttrType()
    {
        return attrType;
    }

    public ASN1Set getAttrValues()
    {
        return attrValues;
    }

    public ASN1Encodable[] getAttributeValues()
    {
        return attrValues.toArray();
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(attrType);
        asn1encodablevector.add(attrValues);
        return new DERSequence(asn1encodablevector);
    }
}
