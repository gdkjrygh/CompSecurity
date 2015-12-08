// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;


final class iv
{

    static final int a[];

    static 
    {
        a = new int[WatchWhileLayout.WatchState.values().length];
        try
        {
            a[WatchWhileLayout.WatchState.DISMISSED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[WatchWhileLayout.WatchState.MINIMIZED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[WatchWhileLayout.WatchState.MAXIMIZED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
