// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class ar
{

    private Method a;
    private int b;

    public ar()
    {
        if (android.os.Build.VERSION.SDK_INT != 17)
        {
            throw new UnsupportedOperationException();
        }
        try
        {
            b = android/media/MediaRouter$RouteInfo.getField("STATUS_CONNECTING").getInt(null);
            a = android/media/MediaRouter$RouteInfo.getMethod("getStatusCode", new Class[0]);
            return;
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            return;
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            return;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            return;
        }
    }

    public final boolean a(Object obj)
    {
        obj = (android.media.MediaRouter.RouteInfo)obj;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        int i;
        int j;
        i = ((Integer)a.invoke(obj, new Object[0])).intValue();
        j = b;
        return i == j;
        obj;
_L2:
        return false;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
