// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

final class f
{

    static int a;
    private static final String b = RLSDK/f.getSimpleName();
    private static final Pattern c = Pattern.compile(",");
    private Point d;
    private int e;
    private String f;

    f()
    {
        a = android.os.Build.VERSION.SDK_INT;
        d = new Point();
    }

    final Point a()
    {
        return d;
    }

    final void a(Camera camera)
    {
        android.hardware.Camera.Parameters parameters = camera.getParameters();
        e = parameters.getPreviewFormat();
        f = parameters.get("preview-format");
        List list = parameters.getSupportedPreviewSizes();
        Object obj = Build.MODEL;
        Object obj1 = Build.BRAND;
        String s = Build.PRODUCT;
        String s1 = Build.MANUFACTURER;
        int j = 0x7fffffff;
        int i = j;
        if (((String) (obj1)).equals("motorala"))
        {
            i = j;
            if (((String) (obj)).equals("Xoom"))
            {
                i = 0xe0fff;
            }
        }
        if (((String) (obj)).equals("ADR6400L"))
        {
            i = 0xe0fff;
        }
        j = i;
        if (s1.equals("HTC"))
        {
            j = i;
            if (((String) (obj)).equals("HTC Desire"))
            {
                j = i;
                if (s.equals("htc_bravo"))
                {
                    j = 0xe0fff;
                }
            }
        }
        if (((String) (obj)).equals("Desire HD"))
        {
            j = 0x4afff;
        }
        i = j;
        if (s1.equals("LGE"))
        {
            i = j;
            if (((String) (obj)).equals("VM670"))
            {
                i = 0x545ff;
            }
        }
        j = i;
        if (s1.equals("samsung"))
        {
            j = i;
            if (((String) (obj)).equals("SCH-I535"))
            {
                j = 0xe1000;
            }
        }
        if (a == 7)
        {
            j = 0x2ffff;
        }
        obj = (android.hardware.Camera.Size)list.get(0);
        obj1 = list.iterator();
        i = 0;
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            android.hardware.Camera.Size size = (android.hardware.Camera.Size)((Iterator) (obj1)).next();
            int k = size.height * size.width;
            if (k <= j && k > i)
            {
                i = k;
                obj = size;
            }
        } while (true);
        parameters.setPreviewSize(((android.hardware.Camera.Size) (obj)).width, ((android.hardware.Camera.Size) (obj)).height);
        d.x = ((android.hardware.Camera.Size) (obj)).width;
        d.y = ((android.hardware.Camera.Size) (obj)).height;
        obj = parameters.getSupportedFlashModes();
        if (obj != null)
        {
            if (Build.MODEL.contains("Behold II") && android.os.Build.VERSION.SDK_INT == 3)
            {
                parameters.set("flash-value", 1);
            } else
            {
                parameters.set("flash-value", 2);
            }
            if (((List) (obj)).contains("off"))
            {
                parameters.set("flash-mode", "off");
            }
        }
        try
        {
            camera.setParameters(parameters);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Camera camera)
        {
            return;
        }
    }

}
