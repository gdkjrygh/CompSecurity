// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.ubercab.payment.internal.vendor.airtel.AirtelAddPaymentActivity;
import com.ubercab.payment.internal.vendor.airtel.AirtelChargePaymentActivity;
import com.ubercab.payment.internal.vendor.airtel.AirtelDeletePaymentActivity;
import com.ubercab.payment.internal.vendor.airtel.AirtelEditPaymentActivity;
import com.ubercab.payment.internal.vendor.airtel.AirtelHandlePaymentErrorActivity;
import com.ubercab.payment.model.PaymentError;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class gvt extends gsa
{

    private static final Set a = new HashSet(Arrays.asList(new String[] {
        "rtapi.riders.pickup.insufficient_balance"
    }));
    private static final HashSet b = new _cls1();

    public gvt(Context context)
    {
        super(context);
    }

    public final String a()
    {
        return "airtel_money";
    }

    public final boolean a(PaymentError paymenterror)
    {
        return b.contains(Integer.valueOf(paymenterror.getErrorCode())) || a.contains(paymenterror.getCode());
    }

    public final String b()
    {
        return m().getString(gsg.ub__payment_airtel);
    }

    public final Drawable c()
    {
        return m().getDrawable(gsc.ub__payment_type_airtel);
    }

    public final Drawable d()
    {
        return m().getDrawable(gsc.ub__payment_type_airtel_logo);
    }

    protected final Class e()
    {
        return com/ubercab/payment/internal/vendor/airtel/AirtelAddPaymentActivity;
    }

    protected final Class f()
    {
        return com/ubercab/payment/internal/vendor/airtel/AirtelEditPaymentActivity;
    }

    protected final Class g()
    {
        return null;
    }

    protected final Class h()
    {
        return com/ubercab/payment/internal/vendor/airtel/AirtelDeletePaymentActivity;
    }

    protected final Class i()
    {
        return com/ubercab/payment/internal/vendor/airtel/AirtelChargePaymentActivity;
    }

    protected final Class j()
    {
        return null;
    }

    protected final Class k()
    {
        return com/ubercab/payment/internal/vendor/airtel/AirtelHandlePaymentErrorActivity;
    }


    /* member class not found */
    class _cls1 {}

}
