// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a.a;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.a.a:
//            n, m

class i
{

    public static Drawable a(Drawable drawable)
    {
        Object obj = drawable;
        if (!(drawable instanceof n))
        {
            obj = new n(drawable);
        }
        return ((Drawable) (obj));
    }

    public static void a(Drawable drawable, int j)
    {
        if (drawable instanceof m)
        {
            ((m)drawable).setTint(j);
        }
    }

    public static void a(Drawable drawable, ColorStateList colorstatelist)
    {
        if (drawable instanceof m)
        {
            ((m)drawable).setTintList(colorstatelist);
        }
    }

    public static void a(Drawable drawable, android.graphics.PorterDuff.Mode mode)
    {
        if (drawable instanceof m)
        {
            ((m)drawable).setTintMode(mode);
        }
    }
}
