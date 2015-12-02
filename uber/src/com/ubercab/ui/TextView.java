// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import hoq;
import hos;
import hox;
import hoy;
import hrq;
import hrs;
import hse;
import hsf;

public class TextView extends android.widget.TextView
    implements hse, hsf
{

    private static final int a[];
    private hoy b;

    public TextView(Context context)
    {
        this(context, null);
    }

    public TextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010084);
    }

    public TextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(context, attributeset, new Paint(getPaint()));
    }

    TextView(Context context, AttributeSet attributeset, int i, Paint paint)
    {
        super(context, attributeset, i);
        a(context, attributeset, paint);
    }

    private CharSequence a()
    {
        return getText();
    }

    private void a(Context context, AttributeSet attributeset, Paint paint)
    {
        float f = 3.402823E+38F;
        float f1 = 1.401298E-45F;
        boolean flag1 = false;
        context = context.obtainStyledAttributes(attributeset, hox.UberText);
        boolean flag;
        if (context != null)
        {
            flag = context.getBoolean(hox.UberText_autoShrink, false);
            flag1 = context.getBoolean(hox.UberText_autoResize, false);
            f1 = context.getDimension(hox.UberText_autoResizeTextSizeMin, 1.401298E-45F);
            f = context.getDimension(hox.UberText_autoResizeTextSizeMax, 3.402823E+38F);
            context.recycle();
        } else
        {
            flag = false;
        }
        b = new hoy(this, paint, flag, flag1, hrq.a(f1), hrq.a(f));
    }

    private void a(hrs hrs1)
    {
        if (hrs1 == null)
        {
            setError(null);
            return;
        } else
        {
            setError(hrs1.a(getResources()));
            return;
        }
    }

    public final volatile void a(Object obj)
    {
        a((hrs)obj);
    }

    public final Object b()
    {
        return a();
    }

    public final void b(boolean flag)
    {
        b.a(flag);
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        super.setOnClickListener(onclicklistener);
        if (onclicklistener == null)
        {
            setClickable(false);
        }
    }

    public void setTextAppearance(Context context, int i)
    {
        super.setTextAppearance(context, i);
        context = getContext().obtainStyledAttributes(i, a);
        i = context.getResourceId(0, 0);
        if (i != 0 && !isInEditMode())
        {
            setTypeface(hoq.a(getContext(), i));
        }
        context.recycle();
    }

    static 
    {
        a = (new int[] {
            hos.fontPath
        });
    }
}
