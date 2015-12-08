// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;

public class ResponderID extends ASN1Object
    implements ASN1Choice
{

    private ASN1Encodable value;

    public ResponderID(ASN1OctetString asn1octetstring)
    {
        value = asn1octetstring;
    }

    public ResponderID(X500Name x500name)
    {
        value = x500name;
    }

    public static ResponderID getInstance(Object obj)
    {
        if (obj instanceof ResponderID)
        {
            return (ResponderID)obj;
        }
        if (obj instanceof DEROctetString)
        {
            return new ResponderID((DEROctetString)obj);
        }
        if (obj instanceof ASN1TaggedObject)
        {
            obj = (ASN1TaggedObject)obj;
            if (((ASN1TaggedObject) (obj)).getTagNo() == 1)
            {
                return new ResponderID(X500Name.getInstance(((ASN1TaggedObject) (obj)), true));
            } else
            {
                return new ResponderID(ASN1OctetString.getInstance(((ASN1TaggedObject) (obj)), true));
            }
        } else
        {
            return new ResponderID(X500Name.getInstance(obj));
        }
    }

    public static ResponderID getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(asn1taggedobject.getObject());
    }

    public byte[] getKeyHash()
    {
        if (value instanceof ASN1OctetString)
        {
            return ((ASN1OctetString)value).getOctets();
        } else
        {
            return null;
        }
    }

    public X500Name getName()
    {
        if (value instanceof ASN1OctetString)
        {
            return null;
        } else
        {
            return X500Name.getInstance(value);
        }
    }

    public ASN1Primitive toASN1Primitive()
    {
        if (value instanceof ASN1OctetString)
        {
            return new DERTaggedObject(true, 2, value);
        } else
        {
            return new DERTaggedObject(true, 1, value);
        }
    }
}
