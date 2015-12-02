// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            a1g

public class DividerView extends TextView
{

    Context a;

    public DividerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = context;
    }

    protected void onDraw(Canvas canvas)
    {
        (new Paint()).setColor(a1g.a().G);
        Rect rect = new Rect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        Drawable drawable = a.getResources().getDrawable(0x7f020140);
        drawable.setBounds(rect);
        drawable.setDither(true);
        drawable.draw(canvas);
        super.onDraw(canvas);
    }
}
