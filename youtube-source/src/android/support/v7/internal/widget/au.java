// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            ListPopupWindow, aw, y, av, 
//            ar

final class au extends ListPopupWindow
    implements aw
{

    final ar b;
    private CharSequence c;
    private ListAdapter d;

    public au(ar ar1, Context context, AttributeSet attributeset, int i)
    {
        b = ar1;
        super(context, attributeset, i);
        a(ar1);
        a(true);
        a(0);
        a(new y(ar1, new av(this, ar1)));
    }

    static ListAdapter a(au au1)
    {
        return au1.d;
    }

    public final void a(ListAdapter listadapter)
    {
        super.a(listadapter);
        d = listadapter;
    }

    public final void a(CharSequence charsequence)
    {
        c = charsequence;
    }

    public final void c()
    {
        int k = b.getPaddingLeft();
        Drawable drawable;
        int j;
        if (b.E == -2)
        {
            int i = b.getWidth();
            int l = b.getPaddingRight();
            d(Math.max(b.a((SpinnerAdapter)d, a()), i - k - l));
        } else
        if (b.E == -1)
        {
            d(b.getWidth() - k - b.getPaddingRight());
        } else
        {
            d(b.E);
        }
        drawable = a();
        j = 0;
        if (drawable != null)
        {
            drawable.getPadding(ar.a(b));
            j = -ar.a(b).left;
        }
        b(j + k);
        e(2);
        super.c();
        h().setChoiceMode(1);
        f(b.d());
    }
}
