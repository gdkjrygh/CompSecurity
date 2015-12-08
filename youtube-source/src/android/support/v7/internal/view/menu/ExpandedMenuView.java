// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

// Referenced classes of package android.support.v7.internal.view.menu:
//            af, q, o, s

public final class ExpandedMenuView extends ListView
    implements af, q, android.widget.AdapterView.OnItemClickListener
{

    private o a;

    public ExpandedMenuView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setOnItemClickListener(this);
    }

    public final void a(o o1)
    {
        a = o1;
    }

    public final boolean a(s s1)
    {
        return a.a(s1, 0);
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a((s)getAdapter().getItem(i));
    }
}
