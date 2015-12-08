// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.media.MediaRouter;

// Referenced classes of package android.support.v7.media:
//            am, al

final class ae
{

    public static Object a(al al)
    {
        return new am(al);
    }

    public static Object a(Object obj, int i)
    {
        return ((MediaRouter)obj).getSelectedRoute(0x800003);
    }

    public static Object a(Object obj, String s, boolean flag)
    {
        return ((MediaRouter)obj).createRouteCategory(s, false);
    }

    public static void a(Object obj, Object obj1)
    {
        ((MediaRouter)obj).removeCallback((android.media.MediaRouter.Callback)obj1);
    }

    public static Object b(Object obj, Object obj1)
    {
        return ((MediaRouter)obj).createUserRoute((android.media.MediaRouter.RouteCategory)obj1);
    }
}
