// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.about;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.ubercab.client.feature.about:
//            OtherFragment

final class a
    implements android.widget.r
{

    final OtherFragment a;
    final  b;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.onItemClickOther(i);
    }

    ( , OtherFragment otherfragment)
    {
        b = ;
        a = otherfragment;
        super();
    }
}
