// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;


final class i
{

    static final int a[];

    static 
    {
        a = new int[com.google.android.youtube.player.YouTubePlayer.PlayerStyle.values().length];
        try
        {
            a[com.google.android.youtube.player.YouTubePlayer.PlayerStyle.DEFAULT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.google.android.youtube.player.YouTubePlayer.PlayerStyle.MINIMAL.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.google.android.youtube.player.YouTubePlayer.PlayerStyle.CHROMELESS.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
