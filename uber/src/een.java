// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class een
{

    public static List a(String s)
    {
        List list;
        try
        {
            list = cio.a(s);
        }
        catch (Exception exception)
        {
            ijg.a("MapFragment").b(exception, "Failed to decode polyline: %s", new Object[] {
                s
            });
            return null;
        }
        return list;
    }
}
