// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;


// Referenced classes of package com.vladium.emma.report:
//            ReportProperties

private static final class <init>
    implements com.vladium.util.Mapper
{

    public String getMappedKey(String s)
    {
        if (s != null && s.startsWith("report."))
        {
            int i = s.indexOf('.', "report.".length());
            if (i > 0)
            {
                return "report.".concat(s.substring(i + 1));
            }
        }
        return null;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
