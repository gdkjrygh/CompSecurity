// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.settings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.walmartlabs.payment.controller.PaymentActivity;

// Referenced classes of package com.walmartlabs.payment.controller.settings:
//            MobilePaySettingsFragment

public class MobilePaySettingsActivity extends PaymentActivity
    implements MobilePaySettingsFragment.Callbacks
{

    public MobilePaySettingsActivity()
    {
    }

    public static void show(Activity activity)
    {
        activity.startActivity(new Intent(activity, com/walmartlabs/payment/controller/settings/MobilePaySettingsActivity));
        activity.overridePendingTransition(com.walmartlabs.android.payment.R.anim.slide_left_in, 0);
    }

    public static void show(Activity activity, int i)
    {
        activity.startActivityForResult(new Intent(activity, com/walmartlabs/payment/controller/settings/MobilePaySettingsActivity), i);
        activity.overridePendingTransition(com.walmartlabs.android.payment.R.anim.slide_left_in, 0);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getSupportFragmentManager().beginTransaction().replace(com.walmartlabs.android.payment.R.id.content_frame, MobilePaySettingsFragment.newInstance()).commit();
        setResult(0);
    }

    public void onDone(boolean flag)
    {
        if (flag)
        {
            setResult(-1);
        }
        finish();
        overridePendingTransition(0, com.walmartlabs.android.payment.R.anim.slide_out_right);
    }
}
