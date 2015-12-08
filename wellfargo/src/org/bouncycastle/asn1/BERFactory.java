// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;


// Referenced classes of package org.bouncycastle.asn1:
//            BERSequence, BERSet, ASN1EncodableVector

class BERFactory
{

    static final BERSequence EMPTY_SEQUENCE = new BERSequence();
    static final BERSet EMPTY_SET = new BERSet();

    BERFactory()
    {
    }

    static BERSequence createSequence(ASN1EncodableVector asn1encodablevector)
    {
        if (asn1encodablevector.size() < 1)
        {
            return EMPTY_SEQUENCE;
        } else
        {
            return new BERSequence(asn1encodablevector);
        }
    }

    static BERSet createSet(ASN1EncodableVector asn1encodablevector)
    {
        if (asn1encodablevector.size() < 1)
        {
            return EMPTY_SET;
        } else
        {
            return new BERSet(asn1encodablevector);
        }
    }

}
