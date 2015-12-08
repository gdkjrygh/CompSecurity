// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.m2ts;


final class b
{

    static final int a[];

    static 
    {
        a = new int[BackgroundPlaybackDialogs.DialogType.values().length];
        try
        {
            a[BackgroundPlaybackDialogs.DialogType.BACKGROUND_SUCCESS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[BackgroundPlaybackDialogs.DialogType.BACKGROUND_FAILED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[BackgroundPlaybackDialogs.DialogType.NONE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
