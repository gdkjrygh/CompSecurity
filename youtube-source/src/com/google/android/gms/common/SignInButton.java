// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.eu;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.gj;

public final class SignInButton extends FrameLayout
    implements android.view.View.OnClickListener
{

    private int a;
    private int b;
    private View c;
    private android.view.View.OnClickListener d;

    public SignInButton(Context context)
    {
        this(context, null);
    }

    public SignInButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SignInButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        d = null;
        setStyle(0, 0);
    }

    public final void onClick(View view)
    {
        if (d != null && view == c)
        {
            d.onClick(this);
        }
    }

    public final void setColorScheme(int i)
    {
        setStyle(a, i);
    }

    public final void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        c.setEnabled(flag);
    }

    public final void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        d = onclicklistener;
        if (c != null)
        {
            c.setOnClickListener(this);
        }
    }

    public final void setSize(int i)
    {
        setStyle(i, b);
    }

    public final void setStyle(int i, int j)
    {
        boolean flag1 = true;
        Context context;
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
        a = i;
        b = j;
        context = getContext();
        if (c != null)
        {
            removeView(c);
        }
        try
        {
            c = gj.a(context, a, b);
        }
        catch (com.google.android.gms.dynamic.e.a a1)
        {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            i = a;
            j = b;
            eu eu1 = new eu(context);
            eu1.a(context.getResources(), i, j);
            c = eu1;
        }
        addView(c);
        c.setEnabled(isEnabled());
        c.setOnClickListener(this);
    }
}
