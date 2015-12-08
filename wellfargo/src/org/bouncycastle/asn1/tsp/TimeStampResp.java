// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.tsp;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cmp.PKIStatusInfo;
import org.bouncycastle.asn1.cms.ContentInfo;

public class TimeStampResp extends ASN1Object
{

    PKIStatusInfo pkiStatusInfo;
    ContentInfo timeStampToken;

    private TimeStampResp(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        pkiStatusInfo = PKIStatusInfo.getInstance(asn1sequence.nextElement());
        if (asn1sequence.hasMoreElements())
        {
            timeStampToken = ContentInfo.getInstance(asn1sequence.nextElement());
        }
    }

    public TimeStampResp(PKIStatusInfo pkistatusinfo, ContentInfo contentinfo)
    {
        pkiStatusInfo = pkistatusinfo;
        timeStampToken = contentinfo;
    }

    public static TimeStampResp getInstance(Object obj)
    {
        if (obj instanceof TimeStampResp)
        {
            return (TimeStampResp)obj;
        }
        if (obj != null)
        {
            return new TimeStampResp(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public PKIStatusInfo getStatus()
    {
        return pkiStatusInfo;
    }

    public ContentInfo getTimeStampToken()
    {
        return timeStampToken;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(pkiStatusInfo);
        if (timeStampToken != null)
        {
            asn1encodablevector.add(timeStampToken);
        }
        return new DERSequence(asn1encodablevector);
    }
}
