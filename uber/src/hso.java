// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public final class hso
{

    public static String a(String s, String s1, Date date)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("EEE, MMM dd yyyy HH:mm:ss z");
        simpledateformat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return String.format("%s=%s;expires=%s;path=/", new Object[] {
            s, s1, simpledateformat.format(date)
        });
    }
}
