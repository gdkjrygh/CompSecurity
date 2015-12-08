// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;


public final class ak
{

    public static void a(Object obj, int i)
    {
        ((android.media.MediaRouter.UserRouteInfo)obj).setPlaybackType(i);
    }

    public static void a(Object obj, Object obj1)
    {
        ((android.media.MediaRouter.UserRouteInfo)obj).setVolumeCallback((android.media.MediaRouter.VolumeCallback)obj1);
    }

    public static void b(Object obj, int i)
    {
        ((android.media.MediaRouter.UserRouteInfo)obj).setPlaybackStream(i);
    }

    public static void c(Object obj, int i)
    {
        ((android.media.MediaRouter.UserRouteInfo)obj).setVolume(i);
    }

    public static void d(Object obj, int i)
    {
        ((android.media.MediaRouter.UserRouteInfo)obj).setVolumeMax(i);
    }

    public static void e(Object obj, int i)
    {
        ((android.media.MediaRouter.UserRouteInfo)obj).setVolumeHandling(i);
    }
}
