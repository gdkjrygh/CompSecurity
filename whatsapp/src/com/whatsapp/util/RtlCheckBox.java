// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.whatsapp.App;

// Referenced classes of package com.whatsapp.util:
//            Log, a0

public class RtlCheckBox extends CheckBox
{

    private int a;
    private Drawable b;
    private int c;

    public RtlCheckBox(Context context)
    {
        this(context, null);
    }

    public RtlCheckBox(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public RtlCheckBox(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
        if (!App.aR())
        {
            setBackgroundDrawable(null);
            a = getPaddingLeft();
            c = getPaddingRight();
            int i = Math.min(a, c);
            setPadding(i, getPaddingTop(), i, getPaddingBottom());
        }
    }

    public int getCompoundPaddingLeft()
    {
        if (App.aR())
        {
            return super.getCompoundPaddingLeft();
        } else
        {
            return super.getPaddingLeft();
        }
    }

    public int getCompoundPaddingRight()
    {
        int i;
        if (App.aR())
        {
            i = super.getCompoundPaddingRight();
        } else
        {
            int j = super.getPaddingRight();
            Drawable drawable = b;
            i = j;
            if (drawable != null)
            {
                return j + Math.max(a, drawable.getIntrinsicWidth());
            }
        }
        return i;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (App.aR()) goto _L2; else goto _L1
_L1:
        Drawable drawable = b;
        if (drawable == null) goto _L2; else goto _L3
_L3:
        int i;
        int j;
        int k;
        int l;
        l = getGravity();
        j = drawable.getIntrinsicHeight();
        k = drawable.getIntrinsicWidth();
        i = 0;
        l & 0x70;
        JVM INSTR lookupswitch 2: default 72
    //                   16: 112
    //                   80: 98;
           goto _L4 _L5 _L6
_L4:
        drawable.setBounds(getWidth() - k, i, getWidth(), i + j);
        drawable.draw(canvas);
_L2:
        return;
_L6:
        i = getHeight() - j;
        if (!Log.f)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        i = (getHeight() - j) / 2;
        if (true) goto _L4; else goto _L7
_L7:
    }

    public void setButtonDrawable(Drawable drawable)
    {
label0:
        {
            if (App.aR())
            {
                super.setButtonDrawable(drawable);
                if (!Log.f)
                {
                    break label0;
                }
            }
            b = drawable;
            super.setButtonDrawable(new a0(this, b, 0));
        }
    }
}
