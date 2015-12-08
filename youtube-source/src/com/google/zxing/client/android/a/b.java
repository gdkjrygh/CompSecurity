// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.a;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class b
{

    private final Context a;
    private Point b;
    private Point c;

    b(Context context)
    {
        a = context;
    }

    private static Point a(android.hardware.Camera.Parameters parameters, Point point, boolean flag)
    {
        Point point1;
        Iterator iterator;
        int i;
        point1 = null;
        i = 0x7fffffff;
        iterator = parameters.getSupportedPreviewSizes().iterator();
_L3:
        int j;
        int k;
        int l;
        android.hardware.Camera.Size size;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_175;
            }
            size = (android.hardware.Camera.Size)iterator.next();
            j = size.height * size.width;
        } while (j < 0x12c00 || j > 0x5dc00);
        k = size.width;
        l = size.height;
        j = Math.abs(point.x * l - point.y * k);
        if (j != 0) goto _L2; else goto _L1
_L1:
        point = new Point(k, l);
_L4:
        point1 = point;
        if (point == null)
        {
            parameters = parameters.getPreviewSize();
            point1 = new Point(((android.hardware.Camera.Size) (parameters)).width, ((android.hardware.Camera.Size) (parameters)).height);
        }
        return point1;
_L2:
        if (j < i)
        {
            point1 = new Point(k, l);
            i = j;
        }
          goto _L3
        point = point1;
          goto _L4
    }

    private static transient String a(Collection collection, String as[])
    {
        int i;
        int j;
        Log.i("CameraConfiguration", (new StringBuilder("Supported values: ")).append(collection).toString());
        if (collection == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        j = as.length;
        i = 0;
_L3:
        String s;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        s = as[i];
        if (!collection.contains(s)) goto _L2; else goto _L1
_L1:
        collection = s;
_L4:
        Log.i("CameraConfiguration", (new StringBuilder("Settable value: ")).append(collection).toString());
        return collection;
_L2:
        i++;
          goto _L3
        collection = null;
          goto _L4
    }

    final Point a()
    {
        return c;
    }

    final void a(Camera camera)
    {
        camera = camera.getParameters();
        Display display = ((WindowManager)a.getSystemService("window")).getDefaultDisplay();
        int j = display.getWidth();
        int i = display.getHeight();
        int k;
        if (j < i)
        {
            Log.i("CameraConfiguration", "Display reports portrait orientation; assuming this is incorrect");
            k = j;
            j = i;
        } else
        {
            k = i;
        }
        b = new Point(j, k);
        Log.i("CameraConfiguration", (new StringBuilder("Screen resolution: ")).append(b).toString());
        c = a(((android.hardware.Camera.Parameters) (camera)), b, false);
        Log.i("CameraConfiguration", (new StringBuilder("Camera resolution: ")).append(c).toString());
    }

    final Point b()
    {
        return b;
    }

    final void b(Camera camera)
    {
        android.hardware.Camera.Parameters parameters = camera.getParameters();
        if (parameters == null)
        {
            Log.w("CameraConfiguration", "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        PreferenceManager.getDefaultSharedPreferences(a);
        String s = a(parameters.getSupportedFlashModes(), new String[] {
            "off"
        });
        if (s != null)
        {
            parameters.setFlashMode(s);
        }
        s = a(parameters.getSupportedFocusModes(), new String[] {
            "auto", "macro"
        });
        if (s != null)
        {
            parameters.setFocusMode(s);
        }
        parameters.setPreviewSize(c.x, c.y);
        camera.setParameters(parameters);
    }
}
