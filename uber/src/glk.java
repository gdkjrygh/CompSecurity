// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class glk
    implements glq
{

    private final chp a;

    public glk(chp chp1)
    {
        a = chp1;
    }

    private List d()
    {
        return a.a(100);
    }

    public final String a()
    {
        return "analytics_logs";
    }

    public final Class b()
    {
        return java/util/ArrayList;
    }

    public final Object c()
    {
        return d();
    }
}
