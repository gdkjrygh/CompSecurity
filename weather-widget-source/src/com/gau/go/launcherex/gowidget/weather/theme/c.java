// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.theme;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public class c
{

    private static c a = new c();
    private Context b;
    private Resources c;

    private c()
    {
    }

    public static Bitmap a(Drawable drawable)
    {
        try
        {
            drawable = ((BitmapDrawable)drawable).getBitmap();
        }
        // Misplaced declaration of an exception variable
        catch (Drawable drawable)
        {
            return null;
        }
        return drawable;
    }

    public static c a(Context context)
    {
        if (a == null)
        {
            a = new c();
        }
        return a;
    }

    public int a(String s, String s1)
    {
        boolean flag = false;
        int i = ((flag) ? 1 : 0);
        if (s != null)
        {
            i = ((flag) ? 1 : 0);
            if (!s.equals(""))
            {
                i = ((flag) ? 1 : 0);
                try
                {
                    if (c != null)
                    {
                        i = c.getIdentifier(s, "id", s1);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return 0;
                }
            }
        }
        return i;
    }

    public void a(Context context, String s)
    {
        Resources resources = context.getResources();
        if (!s.equals(context.getPackageName()))
        {
            try
            {
                b = context.createPackageContext(s, 2);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
        } else
        {
            b = context;
        }
        if (b != null)
        {
            c = b.getResources();
            return;
        } else
        {
            c = resources;
            return;
        }
    }

}
