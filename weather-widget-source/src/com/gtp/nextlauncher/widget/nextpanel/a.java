// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.nextpanel;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;

public class a
{

    public static String a = "com.gtp.nextlauncher";
    private static a b;
    private Resources c;
    private Context d;
    private int e;

    public a()
    {
        e = 0;
    }

    private int a(String s)
    {
        boolean flag = false;
        int i = ((flag) ? 1 : 0);
        if (s != null)
        {
            i = ((flag) ? 1 : 0);
            if (!s.equals(""))
            {
                try
                {
                    i = c.getIdentifier(s, "drawable", a);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    s.printStackTrace();
                    return 0;
                }
            }
        }
        return i;
    }

    private Drawable a(int i)
    {
        Drawable drawable = null;
        if (i != 0)
        {
            try
            {
                drawable = c.getDrawable(i);
            }
            catch (Exception exception)
            {
                return null;
            }
        }
        return drawable;
    }

    public static a a()
    {
        com/gtp/nextlauncher/widget/nextpanel/a;
        JVM INSTR monitorenter ;
        a a1;
        if (b == null)
        {
            b = new a();
        }
        a1 = b;
        com/gtp/nextlauncher/widget/nextpanel/a;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    private void a(Context context, String s)
    {
        Resources resources = context.getResources();
        try
        {
            d = context.createPackageContext(s, 2);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        if (d != null)
        {
            c = d.getResources();
            return;
        } else
        {
            c = resources;
            return;
        }
    }

    public Drawable a(String s, Context context)
    {
        if (c == null || d == null)
        {
            if (e > 0)
            {
                Log.w("ouTest", "init get Resources more than one times");
            }
            a(context, a);
            e = e + 1;
        }
        return a(a(s));
    }

}
