// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.a;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.SurfaceHolder;
import com.google.zxing.client.android.g;
import java.io.IOException;

// Referenced classes of package com.google.zxing.client.android.a:
//            b, d, a

public final class c
{

    private static final String a = com/google/zxing/client/android/a/c.getSimpleName();
    private final Context b;
    private final b c;
    private Camera d;
    private Rect e;
    private Rect f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private final d l;
    private final a m = new a();

    public c(Context context)
    {
        b = context;
        c = new b(context);
        l = new d(c);
    }

    public final g a(byte abyte0[], int i1, int j1)
    {
        Rect rect = e();
        if (rect == null)
        {
            return null;
        } else
        {
            return new g(abyte0, i1, j1, rect.left, rect.top, rect.width(), rect.height(), i);
        }
    }

    public final void a()
    {
        if (d != null)
        {
            d.release();
            d = null;
            e = null;
            f = null;
        }
    }

    public final void a(int i1, int j1)
    {
        if (g)
        {
            Point point = c.b();
            int k1 = i1;
            if (i1 > point.x)
            {
                k1 = point.x;
            }
            i1 = j1;
            if (j1 > point.y)
            {
                i1 = point.y;
            }
            j1 = (point.x - k1) / 2;
            int l1 = (point.y - i1) / 2;
            e = new Rect(j1, l1, j1 + k1, l1 + i1);
            Log.d(a, (new StringBuilder("Calculated manual framing rect: ")).append(e).toString());
            f = null;
            return;
        } else
        {
            j = i1;
            k = j1;
            return;
        }
    }

    public final void a(Handler handler, int i1)
    {
        Camera camera = d;
        if (camera != null && h)
        {
            l.a(handler, i1);
            camera.setOneShotPreviewCallback(l);
        }
    }

    public final void a(SurfaceHolder surfaceholder)
    {
        Camera camera1 = d;
        Camera camera = camera1;
        if (camera1 == null)
        {
            camera = Camera.open();
            if (camera == null)
            {
                throw new IOException();
            }
            d = camera;
        }
        camera.setPreviewDisplay(surfaceholder);
        if (!g)
        {
            g = true;
            c.a(camera);
            if (j > 0 && k > 0)
            {
                a(j, k);
                j = 0;
                k = 0;
            }
        }
        c.b(camera);
        PreferenceManager.getDefaultSharedPreferences(b);
        i = false;
    }

    public final void b()
    {
        Camera camera = d;
        if (camera != null && !h)
        {
            camera.startPreview();
            h = true;
        }
    }

    public final void b(Handler handler, int i1)
    {
        if (d != null && h)
        {
            m.a(handler, i1);
            d.autoFocus(m);
        }
    }

    public final void c()
    {
        if (d != null && h)
        {
            d.stopPreview();
            l.a(null, 0);
            m.a(null, 0);
            h = false;
        }
    }

    public final Rect d()
    {
        int i1 = 600;
        int j1 = 240;
        if (e == null)
        {
            if (d == null)
            {
                return null;
            }
            Point point = c.b();
            int k1 = (point.x * 3) / 4;
            int l1;
            if (k1 < 240)
            {
                i1 = 240;
            } else
            if (k1 <= 600)
            {
                i1 = k1;
            }
            k1 = (point.y * 3) / 4;
            if (k1 >= 240)
            {
                if (k1 > 400)
                {
                    j1 = 400;
                } else
                {
                    j1 = k1;
                }
            }
            k1 = (point.x - i1) / 2;
            l1 = (point.y - j1) / 2;
            e = new Rect(k1, l1, i1 + k1, j1 + l1);
            Log.d(a, (new StringBuilder("Calculated framing rect: ")).append(e).toString());
        }
        return e;
    }

    public final Rect e()
    {
        Rect rect;
        if (f != null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        rect = d();
        if (rect != null) goto _L2; else goto _L1
_L1:
        rect = null;
_L4:
        return rect;
_L2:
        Rect rect1;
        Point point1;
        rect1 = new Rect(rect);
        point1 = c.a();
        if (point1 == null) goto _L4; else goto _L3
_L3:
        Point point = c.b();
        rect1.left = (rect1.left * point1.x) / point.x;
        rect1.right = (rect1.right * point1.x) / point.x;
        rect1.top = (rect1.top * point1.y) / point.y;
        int i1 = rect1.bottom;
        rect1.bottom = (point1.y * i1) / point.y;
        f = rect1;
        return f;
    }

}
