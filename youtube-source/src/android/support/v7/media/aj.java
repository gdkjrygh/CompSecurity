// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.media.MediaRouter;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class aj
{

    private Method a;

    public aj()
    {
        if (android.os.Build.VERSION.SDK_INT < 16 || android.os.Build.VERSION.SDK_INT > 17)
        {
            throw new UnsupportedOperationException();
        }
        try
        {
            a = android/media/MediaRouter.getMethod("selectRouteInt", new Class[] {
                Integer.TYPE, android/media/MediaRouter$RouteInfo
            });
            return;
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            return;
        }
    }

    public final void a(Object obj, int i, Object obj1)
    {
        obj = (MediaRouter)obj;
        obj1 = (android.media.MediaRouter.RouteInfo)obj1;
        if ((((android.media.MediaRouter.RouteInfo) (obj1)).getSupportedTypes() & 0x800000) == 0)
        {
            if (a != null)
            {
                try
                {
                    a.invoke(obj, new Object[] {
                        Integer.valueOf(0x800003), obj1
                    });
                    return;
                }
                catch (IllegalAccessException illegalaccessexception)
                {
                    Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", illegalaccessexception);
                }
                catch (InvocationTargetException invocationtargetexception)
                {
                    Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", invocationtargetexception);
                }
            } else
            {
                Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.");
            }
        }
        ((MediaRouter) (obj)).selectRoute(0x800003, ((android.media.MediaRouter.RouteInfo) (obj1)));
    }
}
