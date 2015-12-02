// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.util;

import java.util.Date;

public class DateHelper
{

    public DateHelper()
    {
    }

    public static long convert(Date date)
    {
        return date.getTime() / 1000L + 0x7c25b080L;
    }

    public static Date convert(long l)
    {
        return new Date((l - 0x7c25b080L) * 1000L);
    }
}
