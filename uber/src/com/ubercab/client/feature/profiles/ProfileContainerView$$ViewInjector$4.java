// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.profiles:
//            ProfileContainerView

final class a extends DebouncingOnClickListener
{

    final ProfileContainerView a;
    final erClick b;

    public final void doClick(View view)
    {
        a.onProfileContainerClick();
    }

    ( , ProfileContainerView profilecontainerview)
    {
        b = ;
        a = profilecontainerview;
        super();
    }
}
