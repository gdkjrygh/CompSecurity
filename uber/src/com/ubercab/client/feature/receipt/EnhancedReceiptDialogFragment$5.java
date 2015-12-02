// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.receipt;

import android.view.animation.Animation;

// Referenced classes of package com.ubercab.client.feature.receipt:
//            EnhancedReceiptDialogFragment

final class a
    implements android.view.animation.gFragment._cls5
{

    final EnhancedReceiptDialogFragment a;

    public final void onAnimationEnd(Animation animation)
    {
        if (a.isAdded())
        {
            a.dismiss();
        }
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    (EnhancedReceiptDialogFragment enhancedreceiptdialogfragment)
    {
        a = enhancedreceiptdialogfragment;
        super();
    }
}
