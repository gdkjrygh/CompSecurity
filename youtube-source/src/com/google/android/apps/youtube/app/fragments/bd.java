// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;


final class bd
{

    static final int a[];

    static 
    {
        a = new int[com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.values().length];
        try
        {
            a[com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.UNKNOWN.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.REQUEST_FAILED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.VIDEO_ERROR.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.LICENSE_SERVER_ERROR.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.UNPLAYABLE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
