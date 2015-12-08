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
//            PKIHeader, PKIBody

public class ProtectedPart extends ASN1Object
{

    private PKIBody body;
    private PKIHeader header;

    private ProtectedPart(ASN1Sequence asn1sequence)
    {
        header = PKIHeader.getInstance(asn1sequence.getObjectAt(0));
        body = PKIBody.getInstance(asn1sequence.getObjectAt(1));
    }

    public ProtectedPart(PKIHeader pkiheader, PKIBody pkibody)
    {
        header = pkiheader;
        body = pkibody;
    }

    public static ProtectedPart getInstance(Object obj)
    {
        if (obj instanceof ProtectedPart)
        {
            return (ProtectedPart)obj;
        }
        if (obj != null)
        {
            return new ProtectedPart(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public PKIBody getBody()
    {
        return body;
    }

    public PKIHeader getHeader()
    {
        return header;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(header);
        asn1encodablevector.add(body);
        return new DERSequence(asn1encodablevector);
    }
}
