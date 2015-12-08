// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.util.Enumeration;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Sequence, ASN1OutputStream, ASN1Encodable, ASN1Primitive, 
//            ASN1EncodableVector

public class BERSequence extends ASN1Sequence
{

    public BERSequence()
    {
    }

    public BERSequence(ASN1Encodable asn1encodable)
    {
        super(asn1encodable);
    }

    public BERSequence(ASN1EncodableVector asn1encodablevector)
    {
        super(asn1encodablevector);
    }

    public BERSequence(ASN1Encodable aasn1encodable[])
    {
        super(aasn1encodable);
    }

    void encode(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.write(48);
        asn1outputstream.write(128);
        for (Enumeration enumeration = getObjects(); enumeration.hasMoreElements(); asn1outputstream.writeObject((ASN1Encodable)enumeration.nextElement())) { }
        asn1outputstream.write(0);
        asn1outputstream.write(0);
    }

    int encodedLength()
    {
        Enumeration enumeration = getObjects();
        int i;
        for (i = 0; enumeration.hasMoreElements(); i = ((ASN1Encodable)enumeration.nextElement()).toASN1Primitive().encodedLength() + i) { }
        return i + 2 + 2;
    }
}
