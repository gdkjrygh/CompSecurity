// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.app:
//            j, h, al

class m
    implements android.widget.AdapterView.OnItemClickListener
{

    final h a;
    final j b;

    m(j j1, h h1)
    {
        b = j1;
        a = h1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        b.u.onClick(h.g(a), i);
        if (!b.E)
        {
            h.g(a).dismiss();
        }
    }
}
