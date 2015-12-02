// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.ui;

import android.content.Context;
import android.os.Parcelable;
import android.text.InputFilter;
import android.util.AttributeSet;
import hop;

// Referenced classes of package com.ubercab.ui:
//            FloatingLabelElement, EditText

public class FloatingLabelEditText extends FloatingLabelElement
{

    private EditText c;

    public FloatingLabelEditText(Context context)
    {
        super(context);
    }

    public FloatingLabelEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public FloatingLabelEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected final hop a(Context context)
    {
        c = new EditText(context);
        return new hop(c, c, c);
    }

    protected final void a(Parcelable parcelable)
    {
        c.onRestoreInstanceState(parcelable);
    }

    public final void a(InputFilter ainputfilter[])
    {
        c.setFilters(ainputfilter);
    }

    public final void b(int i)
    {
        c.setSelection(i);
    }

    protected final Parcelable c()
    {
        return c.onSaveInstanceState();
    }

    public final void c(int i)
    {
        c.setInputType(i);
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        c.setFocusable(flag);
        c.setFocusableInTouchMode(flag);
    }
}
