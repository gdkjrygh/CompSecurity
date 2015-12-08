// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.Button;
import com.google.android.gms.b;
import com.google.android.gms.c;
import com.google.android.gms.d;

// Referenced classes of package com.google.android.gms.internal:
//            gi

public final class eu extends Button
{

    public eu(Context context)
    {
        this(context, null);
    }

    public eu(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0x1010048);
    }

    private static int a(int i, int j, int k)
    {
        switch (i)
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown color scheme: ")).append(i).toString());

        case 1: // '\001'
            j = k;
            // fall through

        case 0: // '\0'
            return j;
        }
    }

    public final void a(Resources resources, int i, int j)
    {
        boolean flag1 = true;
        float f;
        boolean flag;
        if (i >= 0 && i < 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gi.a(flag, (new StringBuilder("Unknown button size ")).append(i).toString());
        if (j >= 0 && j < 2)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        gi.a(flag, (new StringBuilder("Unknown color scheme ")).append(j).toString());
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14F);
        f = resources.getDisplayMetrics().density;
        setMinHeight((int)(f * 48F + 0.5F));
        setMinWidth((int)(f * 48F + 0.5F));
        i;
        JVM INSTR tableswitch 0 2: default 144
    //                   0 180
    //                   1 180
    //                   2 208;
           goto _L1 _L2 _L2 _L3
_L1:
        throw new IllegalStateException((new StringBuilder("Unknown button size: ")).append(i).toString());
_L2:
        int k = a(j, c.c, c.d);
_L5:
        if (k == -1)
        {
            throw new IllegalStateException("Could not find background resource!");
        }
        break; /* Loop/switch isn't completed */
_L3:
        k = a(j, c.a, c.b);
        if (true) goto _L5; else goto _L4
_L4:
        setBackgroundDrawable(resources.getDrawable(k));
        setTextColor(resources.getColorStateList(a(j, b.a, b.b)));
        switch (i)
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown button size: ")).append(i).toString());

        case 0: // '\0'
            setText(resources.getString(d.s));
            return;

        case 1: // '\001'
            setText(resources.getString(d.t));
            return;

        case 2: // '\002'
            setText(null);
            break;
        }
        return;
    }
}
