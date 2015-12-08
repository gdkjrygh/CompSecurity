// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.b;
import com.gau.go.launcherex.gowidget.weather.globaltheme.c.c;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globaltheme:
//            a

public class f
{

    public static ArrayList a(Context context, b b1)
    {
        Object obj;
        OutOfMemoryError outofmemoryerror2;
        Object obj2;
        ArrayList arraylist;
        outofmemoryerror2 = null;
        obj2 = null;
        obj = null;
        arraylist = new ArrayList();
        if (b1 == null)
        {
            return arraylist;
        }
        if (!b1.E() || !b1.x().contains("app_widget_theme")) goto _L2; else goto _L1
_L1:
        b1 = c.a(context, b1.x());
        if (b1.equals("1"))
        {
            try
            {
                b1 = BitmapFactory.decodeResource(context.getResources(), 0x7f02059f);
            }
            // Misplaced declaration of an exception variable
            catch (OutOfMemoryError outofmemoryerror2)
            {
                b1 = ((b) (obj));
                if (com.gtp.a.a.b.c.a())
                {
                    outofmemoryerror2.printStackTrace();
                    b1 = ((b) (obj));
                }
            }
            if (b1 != null)
            {
                arraylist.add(b1);
            }
            try
            {
                context = BitmapFactory.decodeResource(context.getResources(), 0x7f0205a0);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    context.printStackTrace();
                }
                context = b1;
            }
            if (context != null)
            {
                arraylist.add(context);
            }
        } else
        if (b1.equals("2"))
        {
            try
            {
                b1 = BitmapFactory.decodeResource(context.getResources(), 0x7f020165);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                b1 = outofmemoryerror2;
                if (com.gtp.a.a.b.c.a())
                {
                    outofmemoryerror.printStackTrace();
                    b1 = outofmemoryerror2;
                }
            }
            if (b1 != null)
            {
                arraylist.add(b1);
            }
            try
            {
                context = BitmapFactory.decodeResource(context.getResources(), 0x7f020166);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    context.printStackTrace();
                }
                context = b1;
            }
            if (context != null)
            {
                arraylist.add(context);
            }
        } else
        if (b1.equals("3"))
        {
            try
            {
                b1 = BitmapFactory.decodeResource(context.getResources(), 0x7f0201ad);
            }
            catch (OutOfMemoryError outofmemoryerror1)
            {
                b1 = obj2;
                if (com.gtp.a.a.b.c.a())
                {
                    outofmemoryerror1.printStackTrace();
                    b1 = obj2;
                }
            }
            if (b1 != null)
            {
                arraylist.add(b1);
            }
            try
            {
                context = BitmapFactory.decodeResource(context.getResources(), 0x7f0201ae);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    context.printStackTrace();
                }
                context = b1;
            }
            if (context != null)
            {
                arraylist.add(context);
            }
        }
_L4:
        return arraylist;
_L2:
        if ("com.gau.go.weatherex.nextwidget.style.one".equals(b1.x()))
        {
            try
            {
                context = BitmapFactory.decodeResource(context.getResources(), 0x7f020389);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    context.printStackTrace();
                }
                context = null;
            }
            if (context != null)
            {
                arraylist.add(context);
            }
            continue; /* Loop/switch isn't completed */
        }
        outofmemoryerror1 = "theme_big_preview_default";
        if (!b1.E())
        {
            break; /* Loop/switch isn't completed */
        }
        outofmemoryerror1 = "theme_big_preview_appwidget";
_L5:
        outofmemoryerror1 = com.gau.go.launcherex.gowidget.weather.globaltheme.a.d(context, b1.x(), outofmemoryerror1);
        if (outofmemoryerror1 != null)
        {
            int j = outofmemoryerror1.length;
            int i = 0;
            while (i < j) 
            {
                Object obj1 = outofmemoryerror1[i];
                obj1 = com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(context, b1.x(), ((String) (obj1)));
                if (obj1 != null && (obj1 instanceof BitmapDrawable))
                {
                    arraylist.add(((BitmapDrawable)obj1).getBitmap());
                }
                i++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (b1.D())
        {
            outofmemoryerror1 = "theme_big_preview_gowidget";
        } else
        if (b1.t() && b1.u())
        {
            outofmemoryerror1 = "theme_big_preview_background_wallpaper";
        } else
        if (b1.u())
        {
            outofmemoryerror1 = "theme_big_preview_wallpaper";
        } else
        if (b1.t())
        {
            outofmemoryerror1 = "theme_big_preview_background";
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }
}
