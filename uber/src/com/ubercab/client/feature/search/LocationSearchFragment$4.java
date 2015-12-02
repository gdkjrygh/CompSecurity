// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.search;

import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.ImageButton;
import hpb;

// Referenced classes of package com.ubercab.client.feature.search:
//            LocationSearchFragment, LocationSearchEditText

final class a extends hpb
{

    final LocationSearchFragment a;

    public final void afterTextChanged(Editable editable)
    {
        LocationSearchFragment.i(a).removeCallbacks(LocationSearchFragment.h(a));
        LocationSearchFragment.i(a).postDelayed(LocationSearchFragment.h(a), 250L);
        editable = a.mImageButtonClear;
        int i;
        if (!TextUtils.isEmpty(LocationSearchFragment.d(a).trim()))
        {
            i = 0;
        } else
        {
            i = 8;
        }
        editable.setVisibility(i);
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (i == 0 && j == 0 && charsequence.equals(LocationSearchFragment.e(a)) && !LocationSearchFragment.f(a))
        {
            return;
        } else
        {
            LocationSearchFragment.g(a);
            a.mEditTextSearch.setTag(null);
            return;
        }
    }

    (LocationSearchFragment locationsearchfragment)
    {
        a = locationsearchfragment;
        super();
    }
}
