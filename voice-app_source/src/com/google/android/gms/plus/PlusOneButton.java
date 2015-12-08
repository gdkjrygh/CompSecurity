// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.zzab;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.plus.internal.zzg;

public final class PlusOneButton extends FrameLayout
{
    protected class DefaultOnPlusOneClickListener
        implements android.view.View.OnClickListener, OnPlusOneClickListener
    {

        private final OnPlusOneClickListener zzaHh;
        final PlusOneButton zzaHi;

        public void onClick(View view)
        {
            view = (Intent)PlusOneButton.zza(zzaHi).getTag();
            if (zzaHh != null)
            {
                zzaHh.onPlusOneClick(view);
                return;
            } else
            {
                onPlusOneClick(view);
                return;
            }
        }

        public void onPlusOneClick(Intent intent)
        {
            Context context = zzaHi.getContext();
            if ((context instanceof Activity) && intent != null)
            {
                ((Activity)context).startActivityForResult(intent, PlusOneButton.zzb(zzaHi));
            }
        }

        public DefaultOnPlusOneClickListener(OnPlusOneClickListener onplusoneclicklistener)
        {
            zzaHi = PlusOneButton.this;
            super();
            zzaHh = onplusoneclicklistener;
        }
    }

    public static interface OnPlusOneClickListener
    {

        public abstract void onPlusOneClick(Intent intent);
    }


    public static final int ANNOTATION_BUBBLE = 1;
    public static final int ANNOTATION_INLINE = 2;
    public static final int ANNOTATION_NONE = 0;
    public static final int DEFAULT_ACTIVITY_REQUEST_CODE = -1;
    public static final int SIZE_MEDIUM = 1;
    public static final int SIZE_SMALL = 0;
    public static final int SIZE_STANDARD = 3;
    public static final int SIZE_TALL = 2;
    private int mSize;
    private String zzF;
    private View zzaHd;
    private int zzaHe;
    private int zzaHf;
    private OnPlusOneClickListener zzaHg;

    public PlusOneButton(Context context)
    {
        this(context, null);
    }

    public PlusOneButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mSize = getSize(context, attributeset);
        zzaHe = getAnnotation(context, attributeset);
        zzaHf = -1;
        zzaf(getContext());
        if (!isInEditMode());
    }

    protected static int getAnnotation(Context context, AttributeSet attributeset)
    {
        byte byte0 = 0;
        context = zzab.zza("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", context, attributeset, true, false, "PlusOneButton");
        if ("INLINE".equalsIgnoreCase(context))
        {
            byte0 = 2;
        } else
        if (!"NONE".equalsIgnoreCase(context))
        {
            return 1;
        }
        return byte0;
    }

    protected static int getSize(Context context, AttributeSet attributeset)
    {
        context = zzab.zza("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attributeset, true, false, "PlusOneButton");
        if ("SMALL".equalsIgnoreCase(context))
        {
            return 0;
        }
        if ("MEDIUM".equalsIgnoreCase(context))
        {
            return 1;
        }
        return !"TALL".equalsIgnoreCase(context) ? 3 : 2;
    }

    static View zza(PlusOneButton plusonebutton)
    {
        return plusonebutton.zzaHd;
    }

    private void zzaf(Context context)
    {
        if (zzaHd != null)
        {
            removeView(zzaHd);
        }
        zzaHd = zzg.zza(context, mSize, zzaHe, zzF, zzaHf);
        setOnPlusOneClickListener(zzaHg);
        addView(zzaHd);
    }

    static int zzb(PlusOneButton plusonebutton)
    {
        return plusonebutton.zzaHf;
    }

    public void initialize(String s, int i)
    {
        zzu.zza(getContext() instanceof Activity, "To use this method, the PlusOneButton must be placed in an Activity. Use initialize(String, OnPlusOneClickListener).");
        zzF = s;
        zzaHf = i;
        zzaf(getContext());
    }

    public void initialize(String s, OnPlusOneClickListener onplusoneclicklistener)
    {
        zzF = s;
        zzaHf = 0;
        zzaf(getContext());
        setOnPlusOneClickListener(onplusoneclicklistener);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        zzaHd.layout(0, 0, k - i, l - j);
    }

    protected void onMeasure(int i, int j)
    {
        View view = zzaHd;
        measureChild(view, i, j);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void plusOneClick()
    {
        zzaHd.performClick();
    }

    public void setAnnotation(int i)
    {
        zzaHe = i;
        zzaf(getContext());
    }

    public void setIntent(Intent intent)
    {
        zzaHd.setTag(intent);
    }

    public void setOnPlusOneClickListener(OnPlusOneClickListener onplusoneclicklistener)
    {
        zzaHg = onplusoneclicklistener;
        zzaHd.setOnClickListener(new DefaultOnPlusOneClickListener(onplusoneclicklistener));
    }

    public void setSize(int i)
    {
        mSize = i;
        zzaf(getContext());
    }
}
