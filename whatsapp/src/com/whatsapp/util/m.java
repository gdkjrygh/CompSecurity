// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.whatsapp.App;

// Referenced classes of package com.whatsapp.util:
//            Log

public class m extends InsetDrawable
{

    public m(Drawable drawable)
    {
        super(drawable, 0);
    }

    public void draw(Canvas canvas)
    {
label0:
        {
            if (App.aR())
            {
                super.draw(canvas);
                if (!Log.f)
                {
                    break label0;
                }
            }
            canvas.save();
            canvas.scale(-1F, 1.0F, getBounds().exactCenterX(), 0.0F);
            super.draw(canvas);
            canvas.restore();
        }
    }

    public boolean getPadding(Rect rect)
    {
        boolean flag = super.getPadding(rect);
        if (!App.aR())
        {
            int i = rect.right;
            rect.right = rect.left;
            rect.left = i;
        }
        return flag;
    }
}
