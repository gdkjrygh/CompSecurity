// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v4.app:
//            ListFragment

final class x
    implements android.widget.AdapterView.OnItemClickListener
{

    final ListFragment a;

    x(ListFragment listfragment)
    {
        a = listfragment;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = a;
        ListFragment.a();
    }
}
