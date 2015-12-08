// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERUTCTime;

public class Time extends ASN1Object
    implements ASN1Choice
{

    ASN1Primitive time;

    public Time(Date date)
    {
        SimpleTimeZone simpletimezone = new SimpleTimeZone(0, "Z");
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyyMMddHHmmss");
        simpledateformat.setTimeZone(simpletimezone);
        date = (new StringBuilder()).append(simpledateformat.format(date)).append("Z").toString();
        int i = Integer.parseInt(date.substring(0, 4));
        if (i < 1950 || i > 2049)
        {
            time = new DERGeneralizedTime(date);
            return;
        } else
        {
            time = new DERUTCTime(date.substring(2));
            return;
        }
    }

    public Time(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERUTCTime) && !(asn1primitive instanceof DERGeneralizedTime))
        {
            throw new IllegalArgumentException("unknown object passed to Time");
        } else
        {
            time = asn1primitive;
            return;
        }
    }

    public static Time getInstance(Object obj)
    {
        if (obj == null || (obj instanceof Time))
        {
            return (Time)obj;
        }
        if (obj instanceof DERUTCTime)
        {
            return new Time((DERUTCTime)obj);
        }
        if (obj instanceof DERGeneralizedTime)
        {
            return new Time((DERGeneralizedTime)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown object in factory: ").append(obj.getClass().getName()).toString());
        }
    }

    public static Time getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(asn1taggedobject.getObject());
    }

    public Date getDate()
    {
        Date date;
        try
        {
            if (time instanceof DERUTCTime)
            {
                return ((DERUTCTime)time).getAdjustedDate();
            }
            date = ((DERGeneralizedTime)time).getDate();
        }
        catch (ParseException parseexception)
        {
            throw new IllegalStateException((new StringBuilder()).append("invalid date string: ").append(parseexception.getMessage()).toString());
        }
        return date;
    }

    public String getTime()
    {
        if (time instanceof DERUTCTime)
        {
            return ((DERUTCTime)time).getAdjustedTime();
        } else
        {
            return ((DERGeneralizedTime)time).getTime();
        }
    }

    public ASN1Primitive toASN1Primitive()
    {
        return time;
    }
}
