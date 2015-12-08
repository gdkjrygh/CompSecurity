// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.internal.widget:
//            x, v

final class y
    implements android.widget.AdapterView.OnItemClickListener
{

    final v a;
    private final x b;

    public y(v v, x x1)
    {
        a = v;
        super();
        b = x1;
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = b;
        v v = a;
        adapterview.a(view, i);
    }
}
