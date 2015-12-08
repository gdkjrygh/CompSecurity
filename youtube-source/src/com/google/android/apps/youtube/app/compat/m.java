// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.compat;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.compat:
//            l, q

final class m
    implements android.widget.AdapterView.OnItemClickListener
{

    final l a;

    m(l l1)
    {
        a = l1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l1)
    {
        l.b(a).onMenuItemSelected(0, ((q)l.a(a).get(i)).a());
        a.dismiss();
    }
}
