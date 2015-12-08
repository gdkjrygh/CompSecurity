// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.internal.zzy;

public final class SignInButton extends FrameLayout
    implements android.view.View.OnClickListener
{

    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;
    private int mColor;
    private int mSize;
    private View zzVZ;
    private android.view.View.OnClickListener zzWa;

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
        zzWa = null;
        setStyle(0, 0);
    }

    private static Button zza(Context context, int i, int j)
    {
        zzy zzy1 = new zzy(context);
        zzy1.zza(context.getResources(), i, j);
        return zzy1;
    }

    private void zzaf(Context context)
    {
        if (zzVZ != null)
        {
            removeView(zzVZ);
        }
        try
        {
            zzVZ = zzx.zzb(context, mSize, mColor);
        }
        catch (com.google.android.gms.dynamic.zzg.zza zza1)
        {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            zzVZ = zza(context, mSize, mColor);
        }
        addView(zzVZ);
        zzVZ.setEnabled(isEnabled());
        zzVZ.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if (zzWa != null && view == zzVZ)
        {
            zzWa.onClick(this);
        }
    }

    public void setColorScheme(int i)
    {
        setStyle(mSize, i);
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        zzVZ.setEnabled(flag);
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        zzWa = onclicklistener;
        if (zzVZ != null)
        {
            zzVZ.setOnClickListener(this);
        }
    }

    public void setSize(int i)
    {
        setStyle(i, mColor);
    }

    public void setStyle(int i, int j)
    {
        boolean flag;
        if (i >= 0 && i < 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Unknown button size %d", new Object[] {
            Integer.valueOf(i)
        });
        if (j >= 0 && j < 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Unknown color scheme %s", new Object[] {
            Integer.valueOf(j)
        });
        mSize = i;
        mColor = j;
        zzaf(getContext());
    }
}
