// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.search;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.search:
//            LocationSearchFragment

final class a extends DebouncingOnClickListener
{

    final LocationSearchFragment a;
    final kip b;

    public final void doClick(View view)
    {
        a.onClickTextViewSkip();
    }

    ( , LocationSearchFragment locationsearchfragment)
    {
        b = ;
        a = locationsearchfragment;
        super();
    }
}
