// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import com.walmartlabs.payment.controller.setup.SetupActivity;
import com.walmartlabs.payment.service.payment.Transaction;

// Referenced classes of package com.walmartlabs.payment.controller.mpay:
//            MobilePayActivity

public class MobilePayController
{

    public MobilePayController()
    {
    }

    public static void startMoreInfo(Context context)
    {
        Intent intent = new Intent(context, com/walmartlabs/payment/controller/mpay/MobilePayActivity);
        intent.putExtra("fragment_name", MobilePayActivity.EXTRA_MORE_INFO);
        context.startActivity(intent);
    }

    public static void startPairDevice(Fragment fragment, int i, String s, String s1, String s2, boolean flag, boolean flag1)
    {
        Intent intent = new Intent(fragment.getActivity(), com/walmartlabs/payment/controller/mpay/MobilePayActivity);
        intent.putExtra("fragment_name", MobilePayActivity.EXTRA_PAIR_DEVICE);
        intent.putExtra("token_value", s);
        intent.putExtra("user_firstname", s1);
        intent.putExtra("credit_card_id", s2);
        intent.putExtra("use_assoc_discount", flag);
        intent.putExtra("use_gift_cards", flag1);
        fragment.startActivityForResult(intent, i);
    }

    public static void startSetup(Fragment fragment, int i)
    {
        Intent intent = new Intent(fragment.getActivity(), com/walmartlabs/payment/controller/setup/SetupActivity);
        intent.putExtra("start_setup", true);
        fragment.startActivityForResult(intent, i);
    }

    public static void startTransactionConfirmation(Fragment fragment, int i, Transaction transaction, String s)
    {
        Intent intent = new Intent(fragment.getActivity(), com/walmartlabs/payment/controller/mpay/MobilePayActivity);
        intent.putExtra("fragment_name", MobilePayActivity.EXTRA_PAYMENT_CONFIRM);
        intent.putExtra("transaction", transaction);
        intent.putExtra("transaction_id", s);
        fragment.startActivityForResult(intent, i);
    }

    public static void startValueProposition(Fragment fragment, int i)
    {
        Intent intent = new Intent(fragment.getActivity(), com/walmartlabs/payment/controller/mpay/MobilePayActivity);
        intent.putExtra("fragment_name", MobilePayActivity.EXTRA_VALUE_PROP);
        fragment.startActivityForResult(intent, i);
    }
}
