// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.app.search.SearchType;

final class bp
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter.values().length];
        try
        {
            b[com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter.TODAY.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter.THIS_WEEK.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            b[com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter.THIS_MONTH.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        a = new int[SearchType.values().length];
        try
        {
            a[SearchType.CHANNEL.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[SearchType.PLAYLISTS.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
