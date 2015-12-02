// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.baidu;

import android.app.Activity;
import android.app.ProgressDialog;
import chp;
import com.ubercab.payment.internal.model.ApiError;
import cwm;
import e;
import gsg;
import gtc;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.baidu:
//            BaiduAddActivity

final class a extends gtc
{

    final BaiduAddActivity a;

    private void a()
    {
        a.setResult(-1);
        a.finish();
    }

    private void a(ApiError apierror)
    {
        BaiduAddActivity.c(a).dismiss();
        BaiduAddActivity.a(a).a(e.d);
        cwm.a(a, apierror.getErrorMessage());
    }

    public final volatile void a(Object obj)
    {
        a();
    }

    public final void a(RetrofitError retrofiterror)
    {
        BaiduAddActivity.c(a).dismiss();
        BaiduAddActivity.a(a).a(e.e);
        cwm.a(a, a.getString(gsg.ub__payment_network_error));
    }

    public final void b(Object obj)
    {
        a((ApiError)obj);
    }

    (BaiduAddActivity baiduaddactivity, Activity activity, Class class1)
    {
        a = baiduaddactivity;
        super(activity, class1);
    }
}
