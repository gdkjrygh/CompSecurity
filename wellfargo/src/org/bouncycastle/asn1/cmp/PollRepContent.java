// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            PKIFreeText

public class PollRepContent extends ASN1Object
{

    private ASN1Integer certReqId[];
    private ASN1Integer checkAfter[];
    private PKIFreeText reason[];

    public PollRepContent(ASN1Integer asn1integer, ASN1Integer asn1integer1)
    {
        this(asn1integer, asn1integer1, null);
    }

    public PollRepContent(ASN1Integer asn1integer, ASN1Integer asn1integer1, PKIFreeText pkifreetext)
    {
        certReqId = new ASN1Integer[1];
        checkAfter = new ASN1Integer[1];
        reason = new PKIFreeText[1];
        certReqId[0] = asn1integer;
        checkAfter[0] = asn1integer1;
        reason[0] = pkifreetext;
    }

    private PollRepContent(ASN1Sequence asn1sequence)
    {
        certReqId = new ASN1Integer[asn1sequence.size()];
        checkAfter = new ASN1Integer[asn1sequence.size()];
        reason = new PKIFreeText[asn1sequence.size()];
        for (int i = 0; i != asn1sequence.size(); i++)
        {
            ASN1Sequence asn1sequence1 = ASN1Sequence.getInstance(asn1sequence.getObjectAt(i));
            certReqId[i] = ASN1Integer.getInstance(asn1sequence1.getObjectAt(0));
            checkAfter[i] = ASN1Integer.getInstance(asn1sequence1.getObjectAt(1));
            if (asn1sequence1.size() > 2)
            {
                reason[i] = PKIFreeText.getInstance(asn1sequence1.getObjectAt(2));
            }
        }

    }

    public static PollRepContent getInstance(Object obj)
    {
        if (obj instanceof PollRepContent)
        {
            return (PollRepContent)obj;
        }
        if (obj != null)
        {
            return new PollRepContent(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Integer getCertReqId(int i)
    {
        return certReqId[i];
    }

    public ASN1Integer getCheckAfter(int i)
    {
        return checkAfter[i];
    }

    public PKIFreeText getReason(int i)
    {
        return reason[i];
    }

    public int size()
    {
        return certReqId.length;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        for (int i = 0; i != certReqId.length; i++)
        {
            ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
            asn1encodablevector1.add(certReqId[i]);
            asn1encodablevector1.add(checkAfter[i]);
            if (reason[i] != null)
            {
                asn1encodablevector1.add(reason[i]);
            }
            asn1encodablevector.add(new DERSequence(asn1encodablevector1));
        }

        return new DERSequence(asn1encodablevector);
    }
}
