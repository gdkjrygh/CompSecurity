// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v7.internal.widget.bf;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

// Referenced classes of package android.support.v7.internal.view.menu:
//            k, z, i, m

public final class ExpandedMenuView extends ListView
    implements k, z, android.widget.AdapterView.OnItemClickListener
{

    private static final int a[] = {
        0x10100d4, 0x1010129
    };
    private i b;
    private int c;

    public ExpandedMenuView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010074);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset);
        setOnItemClickListener(this);
        context = bf.a(context, attributeset, a, j, 0);
        if (context.e(0))
        {
            setBackgroundDrawable(context.a(0));
        }
        if (context.e(1))
        {
            setDivider(context.a(1));
        }
        context.b();
    }

    public void a(i j)
    {
        b = j;
    }

    public boolean a(m m1)
    {
        return b.a(m1, 0);
    }

    public int getWindowAnimations()
    {
        return c;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterview, View view, int j, long l)
    {
        a((m)getAdapter().getItem(j));
    }

}
