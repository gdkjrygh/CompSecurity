// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.receipt;

import android.view.animation.Animation;
import android.widget.LinearLayout;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import dru;

// Referenced classes of package com.ubercab.client.feature.receipt:
//            EnhancedReceiptDialogFragment

final class a extends dru
{

    final boolean a;
    final EnhancedReceiptDialogFragment b;

    public final void onAnimationEnd(Animation animation)
    {
        byte byte0 = 8;
        boolean flag = false;
        if (b.isAdded())
        {
            animation = b.mViewBottomDrawer;
            int i;
            if (a)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            animation.setVisibility(i);
            animation = b.mTextViewDone;
            if (a)
            {
                i = byte0;
            } else
            {
                i = 0;
            }
            animation.setVisibility(i);
            animation = b.mButtonHelp;
            if (a)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 4;
            }
            animation.setVisibility(i);
        }
    }

    public final void onAnimationStart(Animation animation)
    {
        if (EnhancedReceiptDialogFragment.g(b) && a)
        {
            EnhancedReceiptDialogFragment.a(b, 4);
            EnhancedReceiptDialogFragment.a(b, false);
        } else
        {
            animation = b;
            int i;
            if (a)
            {
                i = 1;
            } else
            {
                i = 2;
            }
            EnhancedReceiptDialogFragment.a(animation, i);
            EnhancedReceiptDialogFragment.a(b, a);
        }
        b.mTextViewDone.setVisibility(4);
        b.mButtonHelp.setVisibility(4);
    }

    (EnhancedReceiptDialogFragment enhancedreceiptdialogfragment, boolean flag)
    {
        b = enhancedreceiptdialogfragment;
        a = flag;
        super();
    }
}
