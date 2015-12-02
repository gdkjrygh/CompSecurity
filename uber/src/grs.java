// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import retrofit.RestAdapter;

public final class grs
{

    private final RestAdapter a;

    private grs(RestAdapter restadapter)
    {
        a = restadapter;
    }

    grs(RestAdapter restadapter, byte byte0)
    {
        this(restadapter);
    }

    public final Object a(Class class1)
    {
        return a.create(class1);
    }
}
