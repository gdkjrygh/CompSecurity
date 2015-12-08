// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;


final class an
{

    static final int a[];

    static 
    {
        a = new int[com.google.android.apps.youtube.core.player.Director.VideoStage.values().length];
        try
        {
            a[com.google.android.apps.youtube.core.player.Director.VideoStage.NEW.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.google.android.apps.youtube.core.player.Director.VideoStage.PLAYBACK_LOADED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
