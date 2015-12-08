// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            PKIFreeText, PKIStatus, PKIFailureInfo

public class PKIStatusInfo extends ASN1Object
{

    DERBitString failInfo;
    ASN1Integer status;
    PKIFreeText statusString;

    private PKIStatusInfo(ASN1Sequence asn1sequence)
    {
        status = ASN1Integer.getInstance(asn1sequence.getObjectAt(0));
        statusString = null;
        failInfo = null;
        if (asn1sequence.size() > 2)
        {
            statusString = PKIFreeText.getInstance(asn1sequence.getObjectAt(1));
            failInfo = DERBitString.getInstance(asn1sequence.getObjectAt(2));
        } else
        if (asn1sequence.size() > 1)
        {
            asn1sequence = asn1sequence.getObjectAt(1);
            if (asn1sequence instanceof DERBitString)
            {
                failInfo = DERBitString.getInstance(asn1sequence);
                return;
            } else
            {
                statusString = PKIFreeText.getInstance(asn1sequence);
                return;
            }
        }
    }

    public PKIStatusInfo(PKIStatus pkistatus)
    {
        status = ASN1Integer.getInstance(pkistatus.toASN1Primitive());
    }

    public PKIStatusInfo(PKIStatus pkistatus, PKIFreeText pkifreetext)
    {
        status = ASN1Integer.getInstance(pkistatus.toASN1Primitive());
        statusString = pkifreetext;
    }

    public PKIStatusInfo(PKIStatus pkistatus, PKIFreeText pkifreetext, PKIFailureInfo pkifailureinfo)
    {
        status = ASN1Integer.getInstance(pkistatus.toASN1Primitive());
        statusString = pkifreetext;
        failInfo = pkifailureinfo;
    }

    public static PKIStatusInfo getInstance(Object obj)
    {
        if (obj instanceof PKIStatusInfo)
        {
            return (PKIStatusInfo)obj;
        }
        if (obj != null)
        {
            return new PKIStatusInfo(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static PKIStatusInfo getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public DERBitString getFailInfo()
    {
        return failInfo;
    }

    public BigInteger getStatus()
    {
        return status.getValue();
    }

    public PKIFreeText getStatusString()
    {
        return statusString;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(status);
        if (statusString != null)
        {
            asn1encodablevector.add(statusString);
        }
        if (failInfo != null)
        {
            asn1encodablevector.add(failInfo);
        }
        return new DERSequence(asn1encodablevector);
    }
}
