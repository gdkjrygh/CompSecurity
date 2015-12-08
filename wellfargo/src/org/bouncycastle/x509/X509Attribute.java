// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.x509.Attribute;

public class X509Attribute extends ASN1Object
{

    Attribute attr;

    public X509Attribute(String s, ASN1Encodable asn1encodable)
    {
        attr = new Attribute(new ASN1ObjectIdentifier(s), new DERSet(asn1encodable));
    }

    public X509Attribute(String s, ASN1EncodableVector asn1encodablevector)
    {
        attr = new Attribute(new ASN1ObjectIdentifier(s), new DERSet(asn1encodablevector));
    }

    X509Attribute(ASN1Encodable asn1encodable)
    {
        attr = Attribute.getInstance(asn1encodable);
    }

    public String getOID()
    {
        return attr.getAttrType().getId();
    }

    public ASN1Encodable[] getValues()
    {
        ASN1Set asn1set = attr.getAttrValues();
        ASN1Encodable aasn1encodable[] = new ASN1Encodable[asn1set.size()];
        for (int i = 0; i != asn1set.size(); i++)
        {
            aasn1encodable[i] = asn1set.getObjectAt(i);
        }

        return aasn1encodable;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return attr.toASN1Primitive();
    }
}
