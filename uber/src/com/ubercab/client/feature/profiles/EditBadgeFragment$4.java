// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.view.View;
import android.widget.GridLayout;

// Referenced classes of package com.ubercab.client.feature.profiles:
//            EditBadgeFragment

final class a
    implements android.view.istener
{

    final EditBadgeFragment a;

    public final void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        a.mIconGridLayout.removeOnLayoutChangeListener(this);
        EditBadgeFragment.c(a);
    }

    (EditBadgeFragment editbadgefragment)
    {
        a = editbadgefragment;
        super();
    }
}
