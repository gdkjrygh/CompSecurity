// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.view.View;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmartlabs.payment.controller.mpay:
//            PaymentDrawerController

private class <init> extends com.walmartlabs.payment.view.stener
{

    final PaymentDrawerController this$0;

    public void onPanelCollapsed(View view)
    {
        WLog.d(PaymentDrawerController.access$100(), "onPanelCollapsed");
        PaymentDrawerController.access$1800(PaymentDrawerController.this).setVisibility(0);
        PaymentDrawerController.access$1900(PaymentDrawerController.this).setVisibility(0);
        PaymentDrawerController.access$2000(PaymentDrawerController.this).setVisibility(8);
        PaymentDrawerController.access$2100(PaymentDrawerController.this);
    }

    public void onPanelExpanded(View view)
    {
        WLog.d(PaymentDrawerController.access$100(), "onPanelExpanded");
        PaymentDrawerController.access$1800(PaymentDrawerController.this).setVisibility(8);
        PaymentDrawerController.access$1900(PaymentDrawerController.this).setVisibility(8);
        PaymentDrawerController.access$2000(PaymentDrawerController.this).setVisibility(0);
        PaymentDrawerController.access$1400(PaymentDrawerController.this).eScan();
    }

    public void onPanelSlide(View view, float f)
    {
        PaymentDrawerController.access$1700(PaymentDrawerController.this).setAlpha(Math.max(0.0F, f));
    }

    private ()
    {
        this$0 = PaymentDrawerController.this;
        super();
    }

    t>(t> t>)
    {
        this();
    }
}
