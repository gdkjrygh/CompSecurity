// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.b;


final class k
{

    static final int a[];

    static 
    {
        a = new int[com.google.android.apps.youtube.core.player.Director.VideoStage.values().length];
        try
        {
            a[com.google.android.apps.youtube.core.player.Director.VideoStage.PLAYBACK_LOADED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.google.android.apps.youtube.core.player.Director.VideoStage.AD_LOADING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.google.android.apps.youtube.core.player.Director.VideoStage.MEDIA_AD_PLAY_REQUESTED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
