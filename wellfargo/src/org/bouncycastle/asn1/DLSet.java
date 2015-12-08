// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.util.Enumeration;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Set, ASN1Encodable, ASN1Primitive, ASN1OutputStream, 
//            StreamUtil, ASN1EncodableVector

public class DLSet extends ASN1Set
{

    private int bodyLength;

    public DLSet()
    {
        bodyLength = -1;
    }

    public DLSet(ASN1Encodable asn1encodable)
    {
        super(asn1encodable);
        bodyLength = -1;
    }

    public DLSet(ASN1EncodableVector asn1encodablevector)
    {
        super(asn1encodablevector, false);
        bodyLength = -1;
    }

    public DLSet(ASN1Encodable aasn1encodable[])
    {
        super(aasn1encodable, false);
        bodyLength = -1;
    }

    private int getBodyLength()
    {
        if (bodyLength < 0)
        {
            Enumeration enumeration = getObjects();
            int i;
            for (i = 0; enumeration.hasMoreElements(); i = ((ASN1Encodable)enumeration.nextElement()).toASN1Primitive().toDLObject().encodedLength() + i) { }
            bodyLength = i;
        }
        return bodyLength;
    }

    void encode(ASN1OutputStream asn1outputstream)
    {
        ASN1OutputStream asn1outputstream1 = asn1outputstream.getDLSubStream();
        int i = getBodyLength();
        asn1outputstream.write(49);
        asn1outputstream.writeLength(i);
        for (asn1outputstream = getObjects(); asn1outputstream.hasMoreElements(); asn1outputstream1.writeObject((ASN1Encodable)asn1outputstream.nextElement())) { }
    }

    int encodedLength()
    {
        int i = getBodyLength();
        return i + (StreamUtil.calculateBodyLength(i) + 1);
    }
}
