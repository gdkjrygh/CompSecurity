// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x500;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;

// Referenced classes of package org.bouncycastle.asn1.x500:
//            AttributeTypeAndValue

public class RDN extends ASN1Object
{

    private ASN1Set values;

    public RDN(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(asn1objectidentifier);
        asn1encodablevector.add(asn1encodable);
        values = new DERSet(new DERSequence(asn1encodablevector));
    }

    private RDN(ASN1Set asn1set)
    {
        values = asn1set;
    }

    public RDN(AttributeTypeAndValue attributetypeandvalue)
    {
        values = new DERSet(attributetypeandvalue);
    }

    public RDN(AttributeTypeAndValue aattributetypeandvalue[])
    {
        values = new DERSet(aattributetypeandvalue);
    }

    public static RDN getInstance(Object obj)
    {
        if (obj instanceof RDN)
        {
            return (RDN)obj;
        }
        if (obj != null)
        {
            return new RDN(ASN1Set.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public AttributeTypeAndValue getFirst()
    {
        if (values.size() == 0)
        {
            return null;
        } else
        {
            return AttributeTypeAndValue.getInstance(values.getObjectAt(0));
        }
    }

    public AttributeTypeAndValue[] getTypesAndValues()
    {
        AttributeTypeAndValue aattributetypeandvalue[] = new AttributeTypeAndValue[values.size()];
        for (int i = 0; i != aattributetypeandvalue.length; i++)
        {
            aattributetypeandvalue[i] = AttributeTypeAndValue.getInstance(values.getObjectAt(i));
        }

        return aattributetypeandvalue;
    }

    public boolean isMultiValued()
    {
        return values.size() > 1;
    }

    public int size()
    {
        return values.size();
    }

    public ASN1Primitive toASN1Primitive()
    {
        return values;
    }
}
