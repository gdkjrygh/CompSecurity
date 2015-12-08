// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.tsp;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

public class Accuracy extends ASN1Object
{

    protected static final int MAX_MICROS = 999;
    protected static final int MAX_MILLIS = 999;
    protected static final int MIN_MICROS = 1;
    protected static final int MIN_MILLIS = 1;
    ASN1Integer micros;
    ASN1Integer millis;
    ASN1Integer seconds;

    protected Accuracy()
    {
    }

    public Accuracy(ASN1Integer asn1integer, ASN1Integer asn1integer1, ASN1Integer asn1integer2)
    {
        seconds = asn1integer;
        if (asn1integer1 != null && (asn1integer1.getValue().intValue() < 1 || asn1integer1.getValue().intValue() > 999))
        {
            throw new IllegalArgumentException("Invalid millis field : not in (1..999)");
        }
        millis = asn1integer1;
        if (asn1integer2 != null && (asn1integer2.getValue().intValue() < 1 || asn1integer2.getValue().intValue() > 999))
        {
            throw new IllegalArgumentException("Invalid micros field : not in (1..999)");
        } else
        {
            micros = asn1integer2;
            return;
        }
    }

    private Accuracy(ASN1Sequence asn1sequence)
    {
        int i;
        seconds = null;
        millis = null;
        micros = null;
        i = 0;
_L5:
        if (i >= asn1sequence.size()) goto _L2; else goto _L1
_L1:
        if (!(asn1sequence.getObjectAt(i) instanceof ASN1Integer)) goto _L4; else goto _L3
_L3:
        seconds = (ASN1Integer)asn1sequence.getObjectAt(i);
_L6:
        i++;
          goto _L5
_L4:
        if (asn1sequence.getObjectAt(i) instanceof DERTaggedObject)
        {
            DERTaggedObject dertaggedobject = (DERTaggedObject)asn1sequence.getObjectAt(i);
            switch (dertaggedobject.getTagNo())
            {
            default:
                throw new IllegalArgumentException("Invalig tag number");

            case 0: // '\0'
                millis = ASN1Integer.getInstance(dertaggedobject, false);
                if (millis.getValue().intValue() < 1 || millis.getValue().intValue() > 999)
                {
                    throw new IllegalArgumentException("Invalid millis field : not in (1..999).");
                }
                break;

            case 1: // '\001'
                micros = ASN1Integer.getInstance(dertaggedobject, false);
                if (micros.getValue().intValue() < 1 || micros.getValue().intValue() > 999)
                {
                    throw new IllegalArgumentException("Invalid micros field : not in (1..999).");
                }
                break;
            }
        }
        if (true) goto _L6; else goto _L2
_L2:
    }

    public static Accuracy getInstance(Object obj)
    {
        if (obj instanceof Accuracy)
        {
            return (Accuracy)obj;
        }
        if (obj != null)
        {
            return new Accuracy(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Integer getMicros()
    {
        return micros;
    }

    public ASN1Integer getMillis()
    {
        return millis;
    }

    public ASN1Integer getSeconds()
    {
        return seconds;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (seconds != null)
        {
            asn1encodablevector.add(seconds);
        }
        if (millis != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 0, millis));
        }
        if (micros != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 1, micros));
        }
        return new DERSequence(asn1encodablevector);
    }
}
