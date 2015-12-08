// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            DisplayText

public class NoticeReference extends ASN1Object
{

    private ASN1Sequence noticeNumbers;
    private DisplayText organization;

    public NoticeReference(String s, Vector vector)
    {
        this(s, convertVector(vector));
    }

    public NoticeReference(String s, ASN1EncodableVector asn1encodablevector)
    {
        this(new DisplayText(s), asn1encodablevector);
    }

    private NoticeReference(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        } else
        {
            organization = DisplayText.getInstance(asn1sequence.getObjectAt(0));
            noticeNumbers = ASN1Sequence.getInstance(asn1sequence.getObjectAt(1));
            return;
        }
    }

    public NoticeReference(DisplayText displaytext, ASN1EncodableVector asn1encodablevector)
    {
        organization = displaytext;
        noticeNumbers = new DERSequence(asn1encodablevector);
    }

    private static ASN1EncodableVector convertVector(Vector vector)
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()) 
        {
            vector = ((Vector) (enumeration.nextElement()));
            if (vector instanceof BigInteger)
            {
                vector = new ASN1Integer((BigInteger)vector);
            } else
            if (vector instanceof Integer)
            {
                vector = new ASN1Integer(((Integer)vector).intValue());
            } else
            {
                throw new IllegalArgumentException();
            }
            asn1encodablevector.add(vector);
        }
        return asn1encodablevector;
    }

    public static NoticeReference getInstance(Object obj)
    {
        if (obj instanceof NoticeReference)
        {
            return (NoticeReference)obj;
        }
        if (obj != null)
        {
            return new NoticeReference(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Integer[] getNoticeNumbers()
    {
        ASN1Integer aasn1integer[] = new ASN1Integer[noticeNumbers.size()];
        for (int i = 0; i != noticeNumbers.size(); i++)
        {
            aasn1integer[i] = ASN1Integer.getInstance(noticeNumbers.getObjectAt(i));
        }

        return aasn1integer;
    }

    public DisplayText getOrganization()
    {
        return organization;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(organization);
        asn1encodablevector.add(noticeNumbers);
        return new DERSequence(asn1encodablevector);
    }
}
