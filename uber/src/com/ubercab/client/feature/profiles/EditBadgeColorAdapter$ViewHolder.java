// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.view.View;
import butterknife.ButterKnife;
import cev;
import ezk;

// Referenced classes of package com.ubercab.client.feature.profiles:
//            EditBadgeColorAdapter, BadgeView

class a
{

    final EditBadgeColorAdapter a;
    BadgeView mBadgeView;

    void onColorSelected()
    {
        EditBadgeColorAdapter.a(a).c(new ezk(mBadgeView.a()));
    }

    (EditBadgeColorAdapter editbadgecoloradapter, View view)
    {
        a = editbadgecoloradapter;
        super();
        ButterKnife.inject(this, view);
    }
}
