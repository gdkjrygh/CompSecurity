// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DLSequence;

// Referenced classes of package org.bouncycastle.asn1.pkcs:
//            ContentInfo

public class AuthenticatedSafe extends ASN1Object
{

    private ContentInfo info[];
    private boolean isBer;

    private AuthenticatedSafe(ASN1Sequence asn1sequence)
    {
        isBer = true;
        info = new ContentInfo[asn1sequence.size()];
        for (int i = 0; i != info.length; i++)
        {
            info[i] = ContentInfo.getInstance(asn1sequence.getObjectAt(i));
        }

        isBer = asn1sequence instanceof BERSequence;
    }

    public AuthenticatedSafe(ContentInfo acontentinfo[])
    {
        isBer = true;
        info = acontentinfo;
    }

    public static AuthenticatedSafe getInstance(Object obj)
    {
        if (obj instanceof AuthenticatedSafe)
        {
            return (AuthenticatedSafe)obj;
        }
        if (obj != null)
        {
            return new AuthenticatedSafe(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ContentInfo[] getContentInfo()
    {
        return info;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        for (int i = 0; i != info.length; i++)
        {
            asn1encodablevector.add(info[i]);
        }

        if (isBer)
        {
            return new BERSequence(asn1encodablevector);
        } else
        {
            return new DLSequence(asn1encodablevector);
        }
    }
}
