// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.receipt;


// Referenced classes of package com.ubercab.client.feature.receipt:
//            MealReceiptFragment, StoppableScrollView

final class a
    implements Runnable
{

    final MealReceiptFragment a;

    public final void run()
    {
        a.mScrollViewContent.smoothScrollBy(0, MealReceiptFragment.d(a) + MealReceiptFragment.e(a));
    }

    (MealReceiptFragment mealreceiptfragment)
    {
        a = mealreceiptfragment;
        super();
    }
}
