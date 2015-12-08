// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;


// Referenced classes of package android.support.v7.media:
//            al

final class am extends android.media.MediaRouter.VolumeCallback
{

    protected final al a;

    public am(al al1)
    {
        a = al1;
    }

    public final void onVolumeSetRequest(android.media.MediaRouter.RouteInfo routeinfo, int i)
    {
        a.a(routeinfo, i);
    }

    public final void onVolumeUpdateRequest(android.media.MediaRouter.RouteInfo routeinfo, int i)
    {
        a.b(routeinfo, i);
    }
}
