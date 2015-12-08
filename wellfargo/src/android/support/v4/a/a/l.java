// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a.a;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

// Referenced classes of package android.support.v4.a.a:
//            q, i

class l
{

    public static Drawable a(Drawable drawable)
    {
        Object obj = drawable;
        if (drawable instanceof GradientDrawable)
        {
            obj = new q(drawable);
        }
        return ((Drawable) (obj));
    }

    public static void a(Drawable drawable, float f, float f1)
    {
        drawable.setHotspot(f, f1);
    }

    public static void a(Drawable drawable, int j)
    {
        if (drawable instanceof q)
        {
            i.a(drawable, j);
            return;
        } else
        {
            drawable.setTint(j);
            return;
        }
    }

    public static void a(Drawable drawable, int j, int k, int i1, int j1)
    {
        drawable.setHotspotBounds(j, k, i1, j1);
    }

    public static void a(Drawable drawable, ColorStateList colorstatelist)
    {
        if (drawable instanceof q)
        {
            i.a(drawable, colorstatelist);
            return;
        } else
        {
            drawable.setTintList(colorstatelist);
            return;
        }
    }

    public static void a(Drawable drawable, android.graphics.PorterDuff.Mode mode)
    {
        if (drawable instanceof q)
        {
            i.a(drawable, mode);
            return;
        } else
        {
            drawable.setTintMode(mode);
            return;
        }
    }
}
