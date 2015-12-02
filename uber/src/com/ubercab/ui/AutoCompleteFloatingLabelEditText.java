// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ListAdapter;
import hop;
import hos;
import hox;

// Referenced classes of package com.ubercab.ui:
//            FloatingLabelElement, AutoCompleteEditText

public class AutoCompleteFloatingLabelEditText extends FloatingLabelElement
{

    private AutoCompleteEditText c;

    public AutoCompleteFloatingLabelEditText(Context context)
    {
        this(context, null);
    }

    public AutoCompleteFloatingLabelEditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, hos.floatingLabelStyle);
    }

    public AutoCompleteFloatingLabelEditText(Context context, AttributeSet attributeset, int i)
    {
        boolean flag = false;
        super(context, attributeset, i);
        context = context.getTheme();
        if (attributeset != null)
        {
            context = context.obtainStyledAttributes(attributeset, hox.AutoCompleteFloatingLabelEditText, i, 0);
            int j = context.getIndexCount();
            for (i = ((flag) ? 1 : 0); i < j; i++)
            {
                if (context.getIndex(i) == hox.AutoCompleteFloatingLabelEditText_android_completionThreshold)
                {
                    b(context.getInt(hox.AutoCompleteFloatingLabelEditText_android_completionThreshold, 2));
                }
            }

            context.recycle();
        }
    }

    protected final hop a(Context context)
    {
        c = new AutoCompleteEditText(context);
        return new hop(c, c, c);
    }

    protected final void a(Parcelable parcelable)
    {
        c.onRestoreInstanceState(parcelable);
    }

    public final void a(ListAdapter listadapter)
    {
        c.setAdapter(listadapter);
    }

    public final void b(int i)
    {
        c.setThreshold(i);
    }

    protected final Parcelable c()
    {
        return c.onSaveInstanceState();
    }

    public final ListAdapter d()
    {
        return c.getAdapter();
    }

    public final void e()
    {
        c.dismissDropDown();
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        c.setFocusable(flag);
        c.setFocusableInTouchMode(flag);
    }
}
