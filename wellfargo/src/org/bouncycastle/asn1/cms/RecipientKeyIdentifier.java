// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            OtherKeyAttribute

public class RecipientKeyIdentifier extends ASN1Object
{

    private DERGeneralizedTime date;
    private OtherKeyAttribute other;
    private ASN1OctetString subjectKeyIdentifier;

    public RecipientKeyIdentifier(ASN1OctetString asn1octetstring, DERGeneralizedTime dergeneralizedtime, OtherKeyAttribute otherkeyattribute)
    {
        subjectKeyIdentifier = asn1octetstring;
        date = dergeneralizedtime;
        other = otherkeyattribute;
    }

    public RecipientKeyIdentifier(ASN1Sequence asn1sequence)
    {
        subjectKeyIdentifier = ASN1OctetString.getInstance(asn1sequence.getObjectAt(0));
        asn1sequence.size();
        JVM INSTR tableswitch 1 3: default 48
    //                   1 81
    //                   2 58
    //                   3 95;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException("Invalid RecipientKeyIdentifier");
_L3:
        if (!(asn1sequence.getObjectAt(1) instanceof DERGeneralizedTime)) goto _L6; else goto _L5
_L5:
        date = (DERGeneralizedTime)asn1sequence.getObjectAt(1);
_L2:
        return;
_L6:
        other = OtherKeyAttribute.getInstance(asn1sequence.getObjectAt(2));
        return;
_L4:
        date = (DERGeneralizedTime)asn1sequence.getObjectAt(1);
        other = OtherKeyAttribute.getInstance(asn1sequence.getObjectAt(2));
        return;
    }

    public RecipientKeyIdentifier(byte abyte0[])
    {
        this(abyte0, null, null);
    }

    public RecipientKeyIdentifier(byte abyte0[], DERGeneralizedTime dergeneralizedtime, OtherKeyAttribute otherkeyattribute)
    {
        subjectKeyIdentifier = new DEROctetString(abyte0);
        date = dergeneralizedtime;
        other = otherkeyattribute;
    }

    public static RecipientKeyIdentifier getInstance(Object obj)
    {
        if (obj == null || (obj instanceof RecipientKeyIdentifier))
        {
            return (RecipientKeyIdentifier)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new RecipientKeyIdentifier((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid RecipientKeyIdentifier: ").append(obj.getClass().getName()).toString());
        }
    }

    public static RecipientKeyIdentifier getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public DERGeneralizedTime getDate()
    {
        return date;
    }

    public OtherKeyAttribute getOtherKeyAttribute()
    {
        return other;
    }

    public ASN1OctetString getSubjectKeyIdentifier()
    {
        return subjectKeyIdentifier;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(subjectKeyIdentifier);
        if (date != null)
        {
            asn1encodablevector.add(date);
        }
        if (other != null)
        {
            asn1encodablevector.add(other);
        }
        return new DERSequence(asn1encodablevector);
    }
}
