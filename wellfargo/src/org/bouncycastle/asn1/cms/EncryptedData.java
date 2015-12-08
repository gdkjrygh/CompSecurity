// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            EncryptedContentInfo

public class EncryptedData extends ASN1Object
{

    private EncryptedContentInfo encryptedContentInfo;
    private ASN1Set unprotectedAttrs;
    private ASN1Integer version;

    private EncryptedData(ASN1Sequence asn1sequence)
    {
        version = ASN1Integer.getInstance(asn1sequence.getObjectAt(0));
        encryptedContentInfo = EncryptedContentInfo.getInstance(asn1sequence.getObjectAt(1));
        if (asn1sequence.size() == 3)
        {
            unprotectedAttrs = ASN1Set.getInstance(asn1sequence.getObjectAt(2));
        }
    }

    public EncryptedData(EncryptedContentInfo encryptedcontentinfo)
    {
        this(encryptedcontentinfo, null);
    }

    public EncryptedData(EncryptedContentInfo encryptedcontentinfo, ASN1Set asn1set)
    {
        long l;
        if (asn1set == null)
        {
            l = 0L;
        } else
        {
            l = 2L;
        }
        version = new ASN1Integer(l);
        encryptedContentInfo = encryptedcontentinfo;
        unprotectedAttrs = asn1set;
    }

    public static EncryptedData getInstance(Object obj)
    {
        if (obj instanceof EncryptedData)
        {
            return (EncryptedData)obj;
        }
        if (obj != null)
        {
            return new EncryptedData(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public EncryptedContentInfo getEncryptedContentInfo()
    {
        return encryptedContentInfo;
    }

    public ASN1Set getUnprotectedAttrs()
    {
        return unprotectedAttrs;
    }

    public ASN1Integer getVersion()
    {
        return version;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(version);
        asn1encodablevector.add(encryptedContentInfo);
        if (unprotectedAttrs != null)
        {
            asn1encodablevector.add(new BERTaggedObject(false, 1, unprotectedAttrs));
        }
        return new BERSequence(asn1encodablevector);
    }
}
