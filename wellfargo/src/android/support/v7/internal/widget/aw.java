// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.support.v7.widget.ab;
import android.util.AttributeSet;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            az, ax, SpinnerCompat

class aw extends ab
    implements az
{

    final SpinnerCompat a;
    private CharSequence c;
    private ListAdapter d;

    public aw(SpinnerCompat spinnercompat, Context context, AttributeSet attributeset, int i)
    {
        a = spinnercompat;
        super(context, attributeset, i);
        a(spinnercompat);
        a(true);
        a(0);
        a(new ax(this, spinnercompat));
    }

    static ListAdapter a(aw aw1)
    {
        return aw1.d;
    }

    public void a(ListAdapter listadapter)
    {
        super.a(listadapter);
        d = listadapter;
    }

    public void a(CharSequence charsequence)
    {
        c = charsequence;
    }
}
