// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;


// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            k, l

public final class j extends Enum
{

    public static final j a;
    public static final j b;
    public static final j c;
    public static final j d;
    public static final j e;
    private static j f;
    private static j g;
    private static j h;
    private static j i;
    private static j j;
    private static j k;
    private static j l;
    private static j m;
    private static j n;
    private static j o;
    private static final j r[];
    private String p;
    private boolean q;

    private j(String s, int i1, String s1, boolean flag)
    {
        super(s, i1);
        p = s1;
        q = flag;
    }

    static boolean a(j j1)
    {
        return j1.q;
    }

    public static j valueOf(String s)
    {
        return (j)Enum.valueOf(com/paypal/android/sdk/onetouch/core/j, s);
    }

    public static j[] values()
    {
        return (j[])r.clone();
    }

    public final String a()
    {
        return p;
    }

    static 
    {
        a = new j("FUTURE_PAYMENTS", 0, "https://uri.paypal.com/services/payments/futurepayments", false);
        f = new j("PROFILE", 1, "profile", true);
        g = new j("PAYPAL_ATTRIBUTES", 2, "https://uri.paypal.com/services/paypalattributes", true);
        b = new j("OPENID", 3, "openid", true);
        c = new j("EMAIL", 4, "email", true);
        d = new j("ADDRESS", 5, "address", true);
        e = new j("PHONE", 6, "phone", true);
        h = new j("GET_FUNDING_OPTIONS", 7, "https://uri.paypal.com/services/payments/funding-options", false);
        i = new j("PAYMENT_CODE", 8, "https://uri.paypal.com/services/pos/payments", false);
        j = new j("MIS_CUSTOMER", 9, "https://uri.paypal.com/services/mis/customer", false);
        k = new j("FINANCIAL_INSTRUMENTS", 10, "https://uri.paypal.com/services/wallet/financial-instruments/view", false);
        l = new j("SEND_MONEY", 11, "https://uri.paypal.com/services/wallet/sendmoney", false);
        m = new j("REQUEST_MONEY", 12, "https://uri.paypal.com/services/wallet/money-request/requests", false);
        n = new j("LOYALTY", 13, "https://uri.paypal.com/services/loyalty/memberships/update", false);
        o = new j("EXPRESS_CHECKOUT", 14, "https://uri.paypal.com/services/expresscheckout", false);
        r = (new j[] {
            a, f, g, b, c, d, e, h, i, j, 
            k, l, m, n, o
        });
        new k();
        new l();
    }
}
