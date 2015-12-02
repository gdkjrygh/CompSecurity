// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.FareInfo;
import com.ubercab.client.core.model.LocationSearchResult;

public final class fgd
{

    private final FareInfo a;
    private final LocationSearchResult b;
    private final String c;

    public fgd(LocationSearchResult locationsearchresult, FareInfo fareinfo, String s)
    {
        a = fareinfo;
        b = locationsearchresult;
        c = s;
    }

    public final LocationSearchResult a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }

    public final FareInfo c()
    {
        return a;
    }
}
