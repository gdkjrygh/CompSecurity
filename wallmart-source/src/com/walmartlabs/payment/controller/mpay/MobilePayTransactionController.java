// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.content.Context;
import android.content.Intent;
import com.walmartlabs.payment.service.payment.Transaction;

// Referenced classes of package com.walmartlabs.payment.controller.mpay:
//            MobilePayActivity

public class MobilePayTransactionController
{

    public MobilePayTransactionController()
    {
    }

    public static void startConfirmation(Context context, Transaction transaction)
    {
        Intent intent = new Intent(context, com/walmartlabs/payment/controller/mpay/MobilePayActivity);
        intent.putExtra("fragment_name", MobilePayActivity.EXTRA_PAYMENT_CONFIRM);
        intent.putExtra("transaction", transaction);
        context.startActivity(intent);
    }
}
