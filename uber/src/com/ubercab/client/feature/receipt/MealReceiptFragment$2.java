// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.receipt;


// Referenced classes of package com.ubercab.client.feature.receipt:
//            MealReceiptFragment

final class a
    implements Runnable
{

    final MealReceiptFragment a;

    public final void run()
    {
        a.d = true;
        if (a.e)
        {
            MealReceiptFragment.b(a);
            MealReceiptFragment.c(a);
        }
    }

    (MealReceiptFragment mealreceiptfragment)
    {
        a = mealreceiptfragment;
        super();
    }
}
