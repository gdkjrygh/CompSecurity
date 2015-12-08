// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.esf:
//            SigPolicyQualifierInfo

public class SigPolicyQualifiers extends ASN1Object
{

    ASN1Sequence qualifiers;

    private SigPolicyQualifiers(ASN1Sequence asn1sequence)
    {
        qualifiers = asn1sequence;
    }

    public SigPolicyQualifiers(SigPolicyQualifierInfo asigpolicyqualifierinfo[])
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        for (int i = 0; i < asigpolicyqualifierinfo.length; i++)
        {
            asn1encodablevector.add(asigpolicyqualifierinfo[i]);
        }

        qualifiers = new DERSequence(asn1encodablevector);
    }

    public static SigPolicyQualifiers getInstance(Object obj)
    {
        if (obj instanceof SigPolicyQualifiers)
        {
            return (SigPolicyQualifiers)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new SigPolicyQualifiers(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public SigPolicyQualifierInfo getInfoAt(int i)
    {
        return SigPolicyQualifierInfo.getInstance(qualifiers.getObjectAt(i));
    }

    public int size()
    {
        return qualifiers.size();
    }

    public ASN1Primitive toASN1Primitive()
    {
        return qualifiers;
    }
}
