// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview, ac, at, t

class a extends ImageView
{

    private Rect a;
    final t b;
    final at c;
    private Paint d;

    public void onDraw(Canvas canvas)
    {
        int j;
        j = ImagePreview.B;
        super.onDraw(canvas);
        if (b == null || !ac.a(b)) goto _L2; else goto _L1
_L1:
        int i;
        int k;
        int l;
        if (d == null)
        {
            d = new Paint();
            d.setAntiAlias(true);
            d.setColor(0xaa000000);
        }
        k = getHeight();
        l = k / 7;
        i = 0;
_L6:
        if (i >= k) goto _L2; else goto _L3
_L3:
        canvas.drawRect(l / 4, l / 4 + i, (l * 3) / 4, (l * 3) / 4 + i, d);
        if (j == 0) goto _L4; else goto _L2
_L2:
        if (isSelected())
        {
            if (at.a(c) == null)
            {
                at.a(c, getResources().getDrawable(0x7f0204f6));
            }
            at.a(c).getPadding(a);
            at.a(c).setBounds(-a.left, -a.top, getWidth() + a.right, getHeight() + a.bottom);
            at.a(c).draw(canvas);
        }
        return;
_L4:
        i += l;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void onMeasure(int i, int j)
    {
        i = getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(i, i);
    }

    (at at1, Context context, t t)
    {
        c = at1;
        b = t;
        super(context);
        a = new Rect();
    }
}
