// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.receipt;

import android.text.TextUtils;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import fcn;
import hko;
import ica;
import ico;

// Referenced classes of package com.ubercab.client.feature.receipt:
//            EnhancedReceiptDialogFragment

final class a
    implements android.view.animation.gFragment._cls4
{

    final int a;
    final EnhancedReceiptDialogFragment b;

    public final void onAnimationEnd(Animation animation)
    {
        if (b.isAdded())
        {
            b.mViewReceiptLayout.setPadding(a, a, a, a);
            animation = EnhancedReceiptDialogFragment.d(b);
            if (!TextUtils.isEmpty(animation))
            {
                EnhancedReceiptDialogFragment.a(b, b.o.c(animation).a(ico.a()).a(new fcn(b, (byte)0)));
            }
        }
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    (EnhancedReceiptDialogFragment enhancedreceiptdialogfragment, int i)
    {
        b = enhancedreceiptdialogfragment;
        a = i;
        super();
    }
}
