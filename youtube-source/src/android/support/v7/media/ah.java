// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.media.MediaRouter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class ah
{

    private Method a;

    public ah()
    {
        if (android.os.Build.VERSION.SDK_INT < 16 || android.os.Build.VERSION.SDK_INT > 17)
        {
            throw new UnsupportedOperationException();
        }
        try
        {
            a = android/media/MediaRouter.getMethod("getSystemAudioRoute", new Class[0]);
            return;
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            return;
        }
    }

    public final Object a(Object obj)
    {
        obj = (MediaRouter)obj;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        Object obj1 = a.invoke(obj, new Object[0]);
        return obj1;
        Object obj2;
        obj2;
_L2:
        return ((MediaRouter) (obj)).getRouteAt(0);
        obj2;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
