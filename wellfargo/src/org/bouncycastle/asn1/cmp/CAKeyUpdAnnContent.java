// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            CMPCertificate

public class CAKeyUpdAnnContent extends ASN1Object
{

    private CMPCertificate newWithNew;
    private CMPCertificate newWithOld;
    private CMPCertificate oldWithNew;

    private CAKeyUpdAnnContent(ASN1Sequence asn1sequence)
    {
        oldWithNew = CMPCertificate.getInstance(asn1sequence.getObjectAt(0));
        newWithOld = CMPCertificate.getInstance(asn1sequence.getObjectAt(1));
        newWithNew = CMPCertificate.getInstance(asn1sequence.getObjectAt(2));
    }

    public CAKeyUpdAnnContent(CMPCertificate cmpcertificate, CMPCertificate cmpcertificate1, CMPCertificate cmpcertificate2)
    {
        oldWithNew = cmpcertificate;
        newWithOld = cmpcertificate1;
        newWithNew = cmpcertificate2;
    }

    public static CAKeyUpdAnnContent getInstance(Object obj)
    {
        if (obj instanceof CAKeyUpdAnnContent)
        {
            return (CAKeyUpdAnnContent)obj;
        }
        if (obj != null)
        {
            return new CAKeyUpdAnnContent(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public CMPCertificate getNewWithNew()
    {
        return newWithNew;
    }

    public CMPCertificate getNewWithOld()
    {
        return newWithOld;
    }

    public CMPCertificate getOldWithNew()
    {
        return oldWithNew;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(oldWithNew);
        asn1encodablevector.add(newWithOld);
        asn1encodablevector.add(newWithNew);
        return new DERSequence(asn1encodablevector);
    }
}
