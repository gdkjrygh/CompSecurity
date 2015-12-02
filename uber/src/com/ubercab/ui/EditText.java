// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.ui;

import android.content.Context;
import android.util.AttributeSet;
import hol;
import hos;
import hrs;
import hse;
import hsf;
import hsk;

public class EditText extends android.widget.EditText
    implements hse, hsf, hsk
{

    private static final int a[];
    private boolean b;

    public EditText(Context context)
    {
        this(context, null);
    }

    public EditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101006e);
    }

    public EditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        addTextChangedListener(new hol(this, (byte)0));
    }

    private CharSequence a()
    {
        return getText();
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

    public final void a_(boolean flag)
    {
        if (b != flag)
        {
            b = flag;
            refreshDrawableState();
        }
    }

    public final Object b()
    {
        return a();
    }

    protected int[] onCreateDrawableState(int i)
    {
        if (b)
        {
            int ai[] = super.onCreateDrawableState(i + 1);
            mergeDrawableStates(ai, a);
            return ai;
        } else
        {
            return super.onCreateDrawableState(i);
        }
    }

    public void setVisibility(int i)
    {
        super.setVisibility(i);
        if (i == 0)
        {
            setFocusable(true);
            setFocusableInTouchMode(true);
            return;
        } else
        {
            setFocusable(false);
            setFocusableInTouchMode(false);
            return;
        }
    }

    static 
    {
        a = (new int[] {
            hos.state_error_highlight
        });
    }
}
