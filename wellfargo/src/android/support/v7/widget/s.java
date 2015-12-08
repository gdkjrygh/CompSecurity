// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.internal.widget.bd;
import android.support.v7.internal.widget.bf;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

public class s extends CheckedTextView
{

    private static final int a[] = {
        0x1010108
    };
    private bd b;

    public s(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x10103c8);
    }

    public s(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (bd.a)
        {
            context = bf.a(getContext(), attributeset, a, i, 0);
            setCheckMarkDrawable(context.a(0));
            context.b();
            b = context.c();
        }
    }

    public void setCheckMarkDrawable(int i)
    {
        if (b != null)
        {
            setCheckMarkDrawable(b.a(i));
            return;
        } else
        {
            super.setCheckMarkDrawable(i);
            return;
        }
    }

}
