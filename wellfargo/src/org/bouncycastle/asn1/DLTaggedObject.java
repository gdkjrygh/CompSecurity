// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;


// Referenced classes of package org.bouncycastle.asn1:
//            ASN1TaggedObject, ASN1Encodable, ASN1Primitive, ASN1OutputStream, 
//            StreamUtil

public class DLTaggedObject extends ASN1TaggedObject
{

    private static final byte ZERO_BYTES[] = new byte[0];

    public DLTaggedObject(boolean flag, int i, ASN1Encodable asn1encodable)
    {
        super(flag, i, asn1encodable);
    }

    void encode(ASN1OutputStream asn1outputstream)
    {
        char c = '\240';
        if (!empty)
        {
            ASN1Primitive asn1primitive = obj.toASN1Primitive().toDLObject();
            if (explicit)
            {
                asn1outputstream.writeTag(160, tagNo);
                asn1outputstream.writeLength(asn1primitive.encodedLength());
                asn1outputstream.writeObject(asn1primitive);
                return;
            }
            if (!asn1primitive.isConstructed())
            {
                c = '\200';
            }
            asn1outputstream.writeTag(c, tagNo);
            asn1outputstream.writeImplicitObject(asn1primitive);
            return;
        } else
        {
            asn1outputstream.writeEncoded(160, tagNo, ZERO_BYTES);
            return;
        }
    }

    int encodedLength()
    {
        if (!empty)
        {
            int i = obj.toASN1Primitive().toDLObject().encodedLength();
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
            return obj.toASN1Primitive().toDLObject().isConstructed();
        }
    }

}
