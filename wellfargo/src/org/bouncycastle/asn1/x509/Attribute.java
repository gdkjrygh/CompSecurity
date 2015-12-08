// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

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

    private Attribute(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        } else
        {
            attrType = ASN1ObjectIdentifier.getInstance(asn1sequence.getObjectAt(0));
            attrValues = ASN1Set.getInstance(asn1sequence.getObjectAt(1));
            return;
        }
    }

    public static Attribute getInstance(Object obj)
    {
        if (obj instanceof Attribute)
        {
            return (Attribute)obj;
        }
        if (obj != null)
        {
            return new Attribute(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1ObjectIdentifier getAttrType()
    {
        return new ASN1ObjectIdentifier(attrType.getId());
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
