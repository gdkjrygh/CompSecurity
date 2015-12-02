// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.LocationSearchResult;

final class frl
    implements gka
{

    private frl()
    {
    }

    frl(byte byte0)
    {
        this();
    }

    private static boolean a(LocationSearchResult locationsearchresult)
    {
        return locationsearchresult.getTag() != null;
    }

    public final boolean apply(Object obj)
    {
        return a((LocationSearchResult)obj);
    }
}
