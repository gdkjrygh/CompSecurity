// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.whatsapp.a1g;

// Referenced classes of package com.whatsapp.util:
//            z, Log

class ac
    implements z
{

    private Paint a;
    private float b;

    public ac(Paint paint, float f)
    {
        b = 1.0F;
        a = paint;
        b = f;
    }

    public Drawable a(Drawable drawable, Context context)
    {
label0:
        {
            context = a.getFontMetrics();
            if (context != null)
            {
                int i = Math.max((int)((((android.graphics.Paint.FontMetrics) (context)).descent - (b - 1.0F) * a.getTextSize()) / 2.0F + 0.5F), 0);
                drawable = new InsetDrawable(drawable, 0, -i, 0, i);
                i = (int)(b * a.getTextSize() * 1.1F + 0.5F);
                drawable.setBounds(0, 0, i, i);
                context = drawable;
                if (!Log.f)
                {
                    break label0;
                }
            }
            drawable.setBounds(0, 0, (int)a1g.a().b(drawable.getIntrinsicWidth()), (int)a1g.a().b(drawable.getIntrinsicWidth()));
            context = drawable;
        }
        return context;
    }
}
