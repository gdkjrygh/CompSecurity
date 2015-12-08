// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.RemoteException;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.android.apps.youtube.api.jar.a.dc;
import com.google.android.apps.youtube.api.jar.a.ej;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            db, cz, cw

public final class cv
    implements SurfaceHolder
{

    private final Handler a;
    private final cw b;
    private final List c = new ArrayList();
    private dc d;
    private Surface e;

    public cv(Handler handler, dc dc1, boolean flag)
    {
        a = (Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler, "uiHandler cannot be null");
        d = (dc)com.google.android.apps.youtube.common.fromguava.c.a(dc1, "client cannot be null");
        if (ej.b(flag))
        {
            try
            {
                b = new db(this);
            }
            // Misplaced declaration of an exception variable
            catch (Handler handler)
            {
                throw new IllegalStateException(handler);
            }
            // Misplaced declaration of an exception variable
            catch (Handler handler)
            {
                throw new IllegalStateException(handler);
            }
        } else
        {
            b = new cz(this, (byte)0);
        }
        try
        {
            dc1.a(b);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Handler handler)
        {
            return;
        }
    }

    static Handler a(cv cv1)
    {
        return cv1.a;
    }

    static Surface a(cv cv1, Surface surface)
    {
        cv1.e = surface;
        return surface;
    }

    static void a(cv cv1, int i, int j, int k)
    {
        for (Iterator iterator = cv1.c.iterator(); iterator.hasNext(); ((android.view.SurfaceHolder.Callback)iterator.next()).surfaceChanged(cv1, i, j, k)) { }
    }

    static void b(cv cv1)
    {
        for (Iterator iterator = cv1.c.iterator(); iterator.hasNext(); ((android.view.SurfaceHolder.Callback)iterator.next()).surfaceDestroyed(cv1)) { }
    }

    static void c(cv cv1)
    {
        for (Iterator iterator = cv1.c.iterator(); iterator.hasNext(); ((android.view.SurfaceHolder.Callback)iterator.next()).surfaceCreated(cv1)) { }
    }

    static Surface d(cv cv1)
    {
        return cv1.e;
    }

    public final void a()
    {
        d = null;
    }

    public final void addCallback(android.view.SurfaceHolder.Callback callback)
    {
        if (!c.contains(callback))
        {
            c.add(callback);
        }
    }

    public final Surface getSurface()
    {
        return e;
    }

    public final Rect getSurfaceFrame()
    {
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        Rect rect = d.b();
        return rect;
        RemoteException remoteexception;
        remoteexception;
        return new Rect();
    }

    public final boolean isCreating()
    {
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        boolean flag = d.a();
        return flag;
        RemoteException remoteexception;
        remoteexception;
        return false;
    }

    public final Canvas lockCanvas()
    {
        throw new UnsupportedOperationException("Unsupported call to lockCanvas");
    }

    public final Canvas lockCanvas(Rect rect)
    {
        throw new UnsupportedOperationException("Unsupported call to lockCanvas");
    }

    public final void removeCallback(android.view.SurfaceHolder.Callback callback)
    {
        c.remove(callback);
    }

    public final void setFixedSize(int i, int j)
    {
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        d.a(i, j);
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setFormat(int i)
    {
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        d.a(i);
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setKeepScreenOn(boolean flag)
    {
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        d.a(flag);
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setSizeFromLayout()
    {
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        d.c();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setType(int i)
    {
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        d.b(i);
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void unlockCanvasAndPost(Canvas canvas)
    {
        throw new UnsupportedOperationException("Unsupported call to unlockCanvasAndPost");
    }
}
