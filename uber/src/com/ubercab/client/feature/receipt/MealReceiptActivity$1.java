// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.receipt;

import android.text.style.ClickableSpan;
import android.view.View;

// Referenced classes of package com.ubercab.client.feature.receipt:
//            MealReceiptActivity

public final class a extends ClickableSpan
{

    final MealReceiptActivity a;

    public final void onClick(View view)
    {
        MealReceiptActivity.a(a);
    }

    (MealReceiptActivity mealreceiptactivity)
    {
        a = mealreceiptactivity;
        super();
    }
}
