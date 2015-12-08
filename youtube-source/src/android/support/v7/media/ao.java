// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class ao
    implements Runnable
{

    private final DisplayManager a;
    private final Handler b;
    private Method c;
    private boolean d;

    public ao(Context context, Handler handler)
    {
        if (android.os.Build.VERSION.SDK_INT != 17)
        {
            throw new UnsupportedOperationException();
        }
        a = (DisplayManager)context.getSystemService("display");
        b = handler;
        try
        {
            c = android/hardware/display/DisplayManager.getMethod("scanWifiDisplays", new Class[0]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public final void a(int i)
    {
        if ((i & 2) == 0) goto _L2; else goto _L1
_L1:
        if (d) goto _L4; else goto _L3
_L3:
        if (c == null) goto _L6; else goto _L5
_L5:
        d = true;
        b.post(this);
_L4:
        return;
_L6:
        Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays because the DisplayManager.scanWifiDisplays() method is not available on this device.");
        return;
_L2:
        if (d)
        {
            d = false;
            b.removeCallbacks(this);
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public final void run()
    {
        if (d)
        {
            try
            {
                c.invoke(a, new Object[0]);
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays.", illegalaccessexception);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays.", invocationtargetexception);
            }
            b.postDelayed(this, 15000L);
        }
    }
}
