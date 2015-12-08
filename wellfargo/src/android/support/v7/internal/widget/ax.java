// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            aw, SpinnerCompat

class ax
    implements android.widget.AdapterView.OnItemClickListener
{

    final SpinnerCompat a;
    final aw b;

    ax(aw aw1, SpinnerCompat spinnercompat)
    {
        b = aw1;
        a = spinnercompat;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        b.a.setSelection(i);
        if (b.a.s != null)
        {
            b.a.a(view, i, aw.a(b).getItemId(i));
        }
        b.a();
    }
}
