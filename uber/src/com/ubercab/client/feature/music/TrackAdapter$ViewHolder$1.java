// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import com.ubercab.client.core.model.Artist;
import gjv;

final class a
    implements gjv
{

    final a a;

    private static String a(Artist artist)
    {
        return artist.getName();
    }

    public final Object apply(Object obj)
    {
        return a((Artist)obj);
    }

    ( )
    {
        a = ;
        super();
    }
}
