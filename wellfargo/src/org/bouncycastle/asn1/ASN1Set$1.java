// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;


// Referenced classes of package org.bouncycastle.asn1:
//            ASN1SetParser, ASN1Set, ASN1Sequence, ASN1Primitive, 
//            ASN1Encodable

class ze
    implements ASN1SetParser
{

    private int index;
    private final int max;
    final ASN1Set this$0;
    final ASN1Set val$outer;

    public ASN1Primitive getLoadedObject()
    {
        return val$outer;
    }

    public ASN1Encodable readObject()
    {
        Object obj;
        if (index == max)
        {
            obj = null;
        } else
        {
            obj = ASN1Set.this;
            int i = index;
            index = i + 1;
            ASN1Encodable asn1encodable = ((ASN1Set) (obj)).getObjectAt(i);
            if (asn1encodable instanceof ASN1Sequence)
            {
                return ((ASN1Sequence)asn1encodable).parser();
            }
            obj = asn1encodable;
            if (asn1encodable instanceof ASN1Set)
            {
                return ((ASN1Set)asn1encodable).parser();
            }
        }
        return ((ASN1Encodable) (obj));
    }

    public ASN1Primitive toASN1Primitive()
    {
        return val$outer;
    }

    ive()
    {
        this$0 = final_asn1set;
        val$outer = ASN1Set.this;
        super();
        max = size();
    }
}
