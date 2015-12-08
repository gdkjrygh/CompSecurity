// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;


// Referenced classes of package org.bouncycastle.asn1:
//            DERSequence, DERSet, ASN1EncodableVector, DLSequence, 
//            DLSet, ASN1Sequence, ASN1Set

class DERFactory
{

    static final ASN1Sequence EMPTY_SEQUENCE = new DERSequence();
    static final ASN1Set EMPTY_SET = new DERSet();

    DERFactory()
    {
    }

    static ASN1Sequence createSequence(ASN1EncodableVector asn1encodablevector)
    {
        if (asn1encodablevector.size() < 1)
        {
            return EMPTY_SEQUENCE;
        } else
        {
            return new DLSequence(asn1encodablevector);
        }
    }

    static ASN1Set createSet(ASN1EncodableVector asn1encodablevector)
    {
        if (asn1encodablevector.size() < 1)
        {
            return EMPTY_SET;
        } else
        {
            return new DLSet(asn1encodablevector);
        }
    }

}
