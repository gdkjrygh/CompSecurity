// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.promo.v2;

import com.ubercab.ui.Button;
import hpb;

// Referenced classes of package com.ubercab.client.feature.promo.v2:
//            BasePromoFragment

final class a extends hpb
{

    final BasePromoFragment a;

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        a.mButtonApply.setEnabled(BasePromoFragment.a(charsequence.toString()));
    }

    (BasePromoFragment basepromofragment)
    {
        a = basepromofragment;
        super();
    }
}
