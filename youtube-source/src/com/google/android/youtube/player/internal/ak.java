// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal;

import com.google.android.youtube.player.YouTubeInitializationResult;

final class ak
{

    static final int a[];

    static 
    {
        a = new int[YouTubeInitializationResult.values().length];
        try
        {
            a[YouTubeInitializationResult.SUCCESS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
    }
}
