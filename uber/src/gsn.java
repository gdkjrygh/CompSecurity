// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gsn extends Enum
    implements gmv
{

    public static final gsn a;
    public static final gsn b;
    public static final gsn c;
    public static final gsn d;
    public static final gsn e;
    public static final gsn f;
    public static final gsn g;
    public static final gsn h;
    public static final gsn i;
    private static final gsn j[];

    private gsn(String s, int k)
    {
        super(s, k);
    }

    public static gsn valueOf(String s)
    {
        return (gsn)Enum.valueOf(gsn, s);
    }

    public static gsn[] values()
    {
        return (gsn[])j.clone();
    }

    static 
    {
        a = new gsn("ANDROID_PAYMENT_CASH_HANDLE_FEE_DIALOG", 0);
        b = new gsn("ANDROID_PAYMENT_CASH_HANDLE_FEE_SIGNUP", 1);
        c = new gsn("ANDROID_PAYMENT_AIRTEL_AMOUNTS", 2);
        d = new gsn("ANDROID_PAYMENT_AIRTEL_PROMOTION", 3);
        e = new gsn("ANDROID_PAYMENT_ALIPAY_INAPP_VERIFICATION", 4);
        f = new gsn("ANDROID_RIDER_DISABLE_CARDIO", 5);
        g = new gsn("PAYMENTS_ADD_PAYMENT_V2", 6);
        h = new gsn("PAYMENTS_BANK_CARD", 7);
        i = new gsn("PAYMENTS_CANDIDATE", 8);
        j = (new gsn[] {
            a, b, c, d, e, f, g, h, i
        });
    }
}
