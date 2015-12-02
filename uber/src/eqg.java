// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.res.Resources;
import android.net.Uri;
import com.braintreegateway.encryption.Braintree;
import com.paypal.android.sdk.payments.PayPalConfiguration;

public final class eqg
{

    public eqg()
    {
    }

    static eqm a(czf czf1, Application application)
    {
        application = application.getResources();
        if (czf1.e())
        {
            return new eqm(new Braintree(application.getString(0x7f0706b4)));
        } else
        {
            return new eqm(new Braintree(application.getString(0x7f0706b5)));
        }
    }

    static hkj a(hjo hjo)
    {
        return hkj.a(hjo);
    }

    static PayPalConfiguration b(czf czf1, Application application)
    {
        application = application.getResources();
        Object obj = Uri.parse(application.getString(0x7f070790));
        Uri uri = Uri.parse(application.getString(0x7f07078f));
        String s = application.getString(0x7f07078e);
        obj = (new PayPalConfiguration()).c(s).a(uri).b(((Uri) (obj)));
        czf1 = czf1.f();
        if (czf1.equals("live"))
        {
            czf1 = application.getString(0x7f07078c);
            ((PayPalConfiguration) (obj)).a("live");
            ((PayPalConfiguration) (obj)).b(czf1);
            return ((PayPalConfiguration) (obj));
        }
        if (czf1.equals("sandbox"))
        {
            czf1 = application.getString(0x7f07078d);
            ((PayPalConfiguration) (obj)).a("sandbox");
            ((PayPalConfiguration) (obj)).b(czf1);
            return ((PayPalConfiguration) (obj));
        } else
        {
            ((PayPalConfiguration) (obj)).a("mock");
            ((PayPalConfiguration) (obj)).b("");
            return ((PayPalConfiguration) (obj));
        }
    }
}
