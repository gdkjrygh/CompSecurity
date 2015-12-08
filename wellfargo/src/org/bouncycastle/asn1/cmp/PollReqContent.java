// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class PollReqContent extends ASN1Object
{

    private ASN1Sequence content;

    public PollReqContent(ASN1Integer asn1integer)
    {
        this(((ASN1Sequence) (new DERSequence(new DERSequence(asn1integer)))));
    }

    private PollReqContent(ASN1Sequence asn1sequence)
    {
        content = asn1sequence;
    }

    public static PollReqContent getInstance(Object obj)
    {
        if (obj instanceof PollReqContent)
        {
            return (PollReqContent)obj;
        }
        if (obj != null)
        {
            return new PollReqContent(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    private static ASN1Integer[] sequenceToASN1IntegerArray(ASN1Sequence asn1sequence)
    {
        ASN1Integer aasn1integer[] = new ASN1Integer[asn1sequence.size()];
        for (int i = 0; i != aasn1integer.length; i++)
        {
            aasn1integer[i] = ASN1Integer.getInstance(asn1sequence.getObjectAt(i));
        }

        return aasn1integer;
    }

    public ASN1Integer[][] getCertReqIds()
    {
        ASN1Integer aasn1integer[][] = new ASN1Integer[content.size()][];
        for (int i = 0; i != aasn1integer.length; i++)
        {
            aasn1integer[i] = sequenceToASN1IntegerArray((ASN1Sequence)content.getObjectAt(i));
        }

        return aasn1integer;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return content;
    }
}
