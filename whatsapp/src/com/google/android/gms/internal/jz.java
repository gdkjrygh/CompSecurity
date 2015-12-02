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
import com.google.android.gms.e;

// Referenced classes of package com.google.android.gms.internal:
//            qw, jx

public final class jz extends Button
{

    public jz(Context context)
    {
        this(context, null);
    }

    public jz(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0x1010048);
    }

    private int b(int i, int j, int k)
    {
        switch (i)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown color scheme: ").append(i).toString());

        case 1: // '\001'
            j = k;
            // fall through

        case 0: // '\0'
            return j;
        }
    }

    private void b(Resources resources, int i, int j)
    {
        boolean flag = qw.a;
        i;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 62
    //                   1 62
    //                   2 80;
           goto _L1 _L2 _L2 _L3
_L1:
        try
        {
            throw new IllegalStateException((new StringBuilder()).append("Unknown button size: ").append(i).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources)
        {
            throw resources;
        }
_L2:
        int k;
        k = b(j, c.common_signin_btn_text_dark, c.common_signin_btn_text_light);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        k = b(j, c.common_signin_btn_icon_dark, c.common_signin_btn_icon_light);
        if (flag) goto _L1; else goto _L4
_L4:
        if (k == -1)
        {
            try
            {
                throw new IllegalStateException("Could not find background resource!");
            }
            // Misplaced declaration of an exception variable
            catch (Resources resources)
            {
                throw resources;
            }
        } else
        {
            setBackgroundDrawable(resources.getDrawable(k));
            return;
        }
    }

    private void c(Resources resources)
    {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14F);
        float f = resources.getDisplayMetrics().density;
        setMinHeight((int)(f * 48F + 0.5F));
        setMinWidth((int)(f * 48F + 0.5F));
    }

    private void c(Resources resources, int i, int j)
    {
        boolean flag;
        flag = qw.a;
        j = b(j, e.common_signin_btn_text_dark, e.common_signin_btn_text_light);
        setTextColor(resources.getColorStateList(j));
        i;
        JVM INSTR tableswitch 0 2: default 52
    //                   0 82
    //                   1 98
    //                   2 114;
           goto _L1 _L2 _L3 _L4
_L1:
        try
        {
            throw new IllegalStateException((new StringBuilder()).append("Unknown button size: ").append(i).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources)
        {
            throw resources;
        }
_L2:
        setText(resources.getString(b.common_signin_button_text));
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        setText(resources.getString(b.common_signin_button_text_long));
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        setText(null);
        if (flag) goto _L1; else goto _L5
_L5:
        return;
        resources;
        try
        {
            throw resources;
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources) { }
        try
        {
            throw resources;
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources) { }
        throw resources;
    }

    public void a(Resources resources, int i, int j)
    {
        boolean flag;
        if (i >= 0 && i < 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            jx.a(flag, "Unknown button size %d", new Object[] {
                Integer.valueOf(i)
            });
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources)
        {
            try
            {
                throw resources;
            }
            // Misplaced declaration of an exception variable
            catch (Resources resources)
            {
                throw resources;
            }
        }
        if (j >= 0 && j < 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Unknown color scheme %s", new Object[] {
            Integer.valueOf(j)
        });
        c(resources);
        b(resources, i, j);
        c(resources, i, j);
    }
}
