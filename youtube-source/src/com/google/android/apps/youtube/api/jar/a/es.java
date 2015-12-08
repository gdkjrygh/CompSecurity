// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.android.apps.youtube.api.b.a.ba;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            et

final class es
    implements android.view.SurfaceHolder.Callback
{

    private ba a;
    private et b;

    public es(ba ba1, et et1)
    {
        a = (ba)c.a(ba1);
        b = (et)c.a(et1);
    }

    public final int a(IBinder ibinder, IBinder ibinder1, android.view.WindowManager.LayoutParams layoutparams, int i, int j, int k, boolean flag, 
            Rect rect, Rect rect1, Rect rect2, Configuration configuration, Surface surface)
    {
        if (a != null)
        {
            try
            {
                i = a.a(ibinder, ibinder1, layoutparams, i, j, k, flag, rect, rect1, rect2, configuration, surface);
            }
            // Misplaced declaration of an exception variable
            catch (IBinder ibinder)
            {
                throw new IllegalStateException(ibinder);
            }
            return i;
        } else
        {
            return 0;
        }
    }

    public final void a()
    {
        a = null;
        b = null;
    }

    public final void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        a.a(i, j, k);
        return;
        surfaceholder;
        throw new IllegalStateException(surfaceholder);
    }

    public final void surfaceCreated(SurfaceHolder surfaceholder)
    {
        if (a != null)
        {
            try
            {
                a.a(surfaceholder.getSurface());
            }
            // Misplaced declaration of an exception variable
            catch (SurfaceHolder surfaceholder)
            {
                throw new IllegalStateException(surfaceholder);
            }
            b.a(surfaceholder.getSurface());
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        if (a != null)
        {
            try
            {
                a.a();
            }
            // Misplaced declaration of an exception variable
            catch (SurfaceHolder surfaceholder) { }
            b.f();
        }
    }
}
