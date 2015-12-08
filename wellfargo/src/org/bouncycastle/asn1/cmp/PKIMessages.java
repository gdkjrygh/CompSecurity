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
//            PKIMessage

public class PKIMessages extends ASN1Object
{

    private ASN1Sequence content;

    private PKIMessages(ASN1Sequence asn1sequence)
    {
        content = asn1sequence;
    }

    public PKIMessages(PKIMessage pkimessage)
    {
        content = new DERSequence(pkimessage);
    }

    public PKIMessages(PKIMessage apkimessage[])
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        for (int i = 0; i < apkimessage.length; i++)
        {
            asn1encodablevector.add(apkimessage[i]);
        }

        content = new DERSequence(asn1encodablevector);
    }

    public static PKIMessages getInstance(Object obj)
    {
        if (obj instanceof PKIMessages)
        {
            return (PKIMessages)obj;
        }
        if (obj != null)
        {
            return new PKIMessages(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Primitive toASN1Primitive()
    {
        return content;
    }

    public PKIMessage[] toPKIMessageArray()
    {
        PKIMessage apkimessage[] = new PKIMessage[content.size()];
        for (int i = 0; i != apkimessage.length; i++)
        {
            apkimessage[i] = PKIMessage.getInstance(content.getObjectAt(i));
        }

        return apkimessage;
    }
}
