// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.ubercab.payment.internal.model.PaymentEditOptions;
import com.ubercab.payment.internal.model.PaymentEditResult;
import com.ubercab.payment.model.CollectedData;
import com.ubercab.payment.model.PaymentAddOptions;
import com.ubercab.payment.model.PaymentError;
import com.ubercab.payment.model.PaymentProfile;
import com.ubercab.payment.model.PaymentUserInfo;
import java.util.ArrayList;

public final class gtu
{

    public static PaymentProfile a(Intent intent)
    {
        return (PaymentProfile)intent.getParcelableExtra("payment_profile");
    }

    public static PaymentEditResult b(Intent intent)
    {
        return (PaymentEditResult)intent.getParcelableExtra("payment_edit_result");
    }

    public static String c(Intent intent)
    {
        return intent.getStringExtra("payment_profile_uuid");
    }

    public static PaymentAddOptions d(Intent intent)
    {
        return (PaymentAddOptions)intent.getParcelableExtra("payment_add_options");
    }

    public static PaymentEditOptions e(Intent intent)
    {
        return (PaymentEditOptions)intent.getParcelableExtra("payment_edit_options");
    }

    public static String f(Intent intent)
    {
        return intent.getStringExtra("bill_uuid");
    }

    public static PaymentUserInfo g(Intent intent)
    {
        return (PaymentUserInfo)intent.getParcelableExtra("user_info");
    }

    public static String h(Intent intent)
    {
        return intent.getStringExtra("verification_code");
    }

    public static CollectedData i(Intent intent)
    {
        return (CollectedData)intent.getParcelableExtra("collected_data");
    }

    public static Intent j(Intent intent)
    {
        return (Intent)intent.getParcelableExtra("collected_data_intent");
    }

    public static ArrayList k(Intent intent)
    {
        return intent.getIntegerArrayListExtra("http_statuses");
    }

    public static PaymentError l(Intent intent)
    {
        return (PaymentError)intent.getParcelableExtra("error");
    }
}
