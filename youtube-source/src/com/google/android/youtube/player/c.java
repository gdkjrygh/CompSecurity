// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player;


// Referenced classes of package com.google.android.youtube.player:
//            YouTubeInitializationResult

final class c
{

    static final int a[];

    static 
    {
        a = new int[YouTubeInitializationResult.values().length];
        try
        {
            a[YouTubeInitializationResult.SERVICE_MISSING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[YouTubeInitializationResult.SERVICE_DISABLED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[YouTubeInitializationResult.SERVICE_VERSION_UPDATE_REQUIRED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
