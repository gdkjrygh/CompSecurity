// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.activity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.ubercab.payment.model.CollectedData;
import com.ubercab.payment.model.PaymentAddOptions;
import com.ubercab.payment.model.PaymentProfile;
import com.ubercab.payment.model.PaymentUserInfo;
import gjz;
import gtu;
import java.util.ArrayList;

// Referenced classes of package com.ubercab.payment.internal.activity:
//            PaymentActivity

public abstract class AddPaymentActivity extends PaymentActivity
{

    private Intent a;
    private String b;
    private String c;
    private PaymentAddOptions d;
    private PaymentUserInfo e;

    public AddPaymentActivity()
    {
    }

    public final void a(CollectedData collecteddata)
    {
        a(collecteddata, null);
    }

    public final void a(CollectedData collecteddata, ArrayList arraylist)
    {
        if (!f().equals("data_collection"))
        {
            throw new IllegalStateException("Attempting to finish with collected data while not in data collection mode.");
        } else
        {
            a.setExtrasClassLoader(getApplication().getClassLoader());
            a.putExtra("collected_data", collecteddata);
            a.putIntegerArrayListExtra("http_statuses", arraylist);
            startActivityForResult(a, 500);
            return;
        }
    }

    public final void a(PaymentProfile paymentprofile)
    {
        if (!f().equals("add"))
        {
            throw new IllegalStateException("Attempting to finish with a payment profile while not in add mode.");
        } else
        {
            Intent intent = new Intent();
            intent.putExtra("payment_profile", paymentprofile);
            setResult(-1, intent);
            finish();
            return;
        }
    }

    public final String c()
    {
        if (!"data_collection".equals(f()))
        {
            throw new IllegalStateException("Attempting to get data collection action label when not in data collection mode.");
        } else
        {
            return b;
        }
    }

    public final PaymentAddOptions d()
    {
        return d;
    }

    public final PaymentUserInfo e()
    {
        return e;
    }

    public final String f()
    {
        return c;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (c.equals("data_collection") && i == 500 && j != 5001)
        {
            setResult(j, intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = gtu.j(getIntent());
        b = getIntent().getStringExtra("data_collection_action_label");
        c = getIntent().getStringExtra("mode");
        d = gtu.d(getIntent());
        e = gtu.g(getIntent());
        boolean flag;
        if (c.equals("data_collection") || c.equals("add"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gjz.a(flag);
        if ("data_collection".equals(c))
        {
            gjz.a(b);
            gjz.a(a);
        }
    }
}
