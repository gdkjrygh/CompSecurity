// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.util.Enumeration;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1TaggedObject, BERSequence, ASN1OutputStream, ASN1OctetString, 
//            BEROctetString, ASN1Encodable, ASN1Sequence, ASN1Set, 
//            ASN1Primitive, StreamUtil

public class BERTaggedObject extends ASN1TaggedObject
{

    public BERTaggedObject(int i)
    {
        super(false, i, new BERSequence());
    }

    public BERTaggedObject(int i, ASN1Encodable asn1encodable)
    {
        super(true, i, asn1encodable);
    }

    public BERTaggedObject(boolean flag, int i, ASN1Encodable asn1encodable)
    {
        super(flag, i, asn1encodable);
    }

    void encode(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.writeTag(160, tagNo);
        asn1outputstream.write(128);
        if (!empty)
        {
            if (!explicit)
            {
                Enumeration enumeration;
                if (obj instanceof ASN1OctetString)
                {
                    if (obj instanceof BEROctetString)
                    {
                        enumeration = ((BEROctetString)obj).getObjects();
                    } else
                    {
                        enumeration = (new BEROctetString(((ASN1OctetString)obj).getOctets())).getObjects();
                    }
                } else
                if (obj instanceof ASN1Sequence)
                {
                    enumeration = ((ASN1Sequence)obj).getObjects();
                } else
                if (obj instanceof ASN1Set)
                {
                    enumeration = ((ASN1Set)obj).getObjects();
                } else
                {
                    throw new RuntimeException((new StringBuilder()).append("not implemented: ").append(obj.getClass().getName()).toString());
                }
                for (; enumeration.hasMoreElements(); asn1outputstream.writeObject((ASN1Encodable)enumeration.nextElement())) { }
            } else
            {
                asn1outputstream.writeObject(obj);
            }
        }
        asn1outputstream.write(0);
        asn1outputstream.write(0);
    }

    int encodedLength()
    {
        if (!empty)
        {
            int i = obj.toASN1Primitive().encodedLength();
            if (explicit)
            {
                return i + (StreamUtil.calculateTagLength(tagNo) + StreamUtil.calculateBodyLength(i));
            } else
            {
                return (i - 1) + StreamUtil.calculateTagLength(tagNo);
            }
        } else
        {
            return StreamUtil.calculateTagLength(tagNo) + 1;
        }
    }

    boolean isConstructed()
    {
        if (empty || explicit)
        {
            return true;
        } else
        {
            return obj.toASN1Primitive().toDERObject().isConstructed();
        }
    }
}
