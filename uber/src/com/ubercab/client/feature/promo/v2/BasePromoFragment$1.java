// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.promo.v2;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.ubercab.client.feature.promo.v2:
//            BasePromoFragment

final class a
    implements android.widget.ionListener
{

    final BasePromoFragment a;

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        a.b(false);
        return true;
    }

    (BasePromoFragment basepromofragment)
    {
        a = basepromofragment;
        super();
    }
}
