// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.eac;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import org.bouncycastle.util.Arrays;

public class PackedDate
{

    private byte time[];

    public PackedDate(String s)
    {
        time = convert(s);
    }

    public PackedDate(Date date)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyMMdd'Z'");
        simpledateformat.setTimeZone(new SimpleTimeZone(0, "Z"));
        time = convert(simpledateformat.format(date));
    }

    PackedDate(byte abyte0[])
    {
        time = abyte0;
    }

    private byte[] convert(String s)
    {
        s = s.toCharArray();
        byte abyte0[] = new byte[6];
        for (int i = 0; i != 6; i++)
        {
            abyte0[i] = (byte)(s[i] - 48);
        }

        return abyte0;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof PackedDate))
        {
            return false;
        } else
        {
            obj = (PackedDate)obj;
            return Arrays.areEqual(time, ((PackedDate) (obj)).time);
        }
    }

    public Date getDate()
    {
        return (new SimpleDateFormat("yyyyMMdd")).parse((new StringBuilder()).append("20").append(toString()).toString());
    }

    public byte[] getEncoding()
    {
        return time;
    }

    public int hashCode()
    {
        return Arrays.hashCode(time);
    }

    public String toString()
    {
        char ac[] = new char[time.length];
        for (int i = 0; i != ac.length; i++)
        {
            ac[i] = (char)((time[i] & 0xff) + 48);
        }

        return new String(ac);
    }
}
