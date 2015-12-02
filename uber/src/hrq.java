// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

public final class hrq
{

    public static int a(float f)
    {
        return (int)(f / Resources.getSystem().getDisplayMetrics().scaledDensity);
    }

    public static void a(Drawable drawable, int i)
    {
        if (drawable != null)
        {
            int j = Color.red(i);
            int k = Color.green(i);
            i = Color.blue(i);
            ColorMatrixColorFilter colormatrixcolorfilter = new ColorMatrixColorFilter(new float[] {
                0.0F, 0.0F, 0.0F, 0.0F, (float)j, 0.0F, 0.0F, 0.0F, 0.0F, (float)k, 
                0.0F, 0.0F, 0.0F, 0.0F, (float)i, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F
            });
            drawable.mutate();
            drawable.setColorFilter(colormatrixcolorfilter);
        }
    }
}
