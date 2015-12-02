// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.widget.CompoundButton;

// Referenced classes of package com.ubercab.client.feature.payment:
//            EditCreditCardFragment

final class a
    implements android.widget.ent..ViewInjector._cls4
{

    final EditCreditCardFragment a;
    final ed b;

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        a.onUsePointsToggled(flag);
    }

    ( , EditCreditCardFragment editcreditcardfragment)
    {
        b = ;
        a = editcreditcardfragment;
        super();
    }
}
