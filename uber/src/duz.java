// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

public final class duz
{

    public static float a(Resources resources, int i)
    {
        return TypedValue.applyDimension(1, i, resources.getDisplayMetrics());
    }

    public static int a(Context context)
    {
        TypedValue typedvalue = new TypedValue();
        if (context.getTheme().resolveAttribute(0x10102eb, typedvalue, true))
        {
            context = context.getResources().getDisplayMetrics();
            return TypedValue.complexToDimensionPixelSize(typedvalue.data, context);
        } else
        {
            return 0;
        }
    }
}
