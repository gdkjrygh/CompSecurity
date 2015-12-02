// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class k extends Enum
    implements chz
{

    public static final k a;
    public static final k b;
    public static final k c;
    public static final k d;
    public static final k e;
    public static final k f;
    public static final k g;
    public static final k h;
    public static final k i;
    public static final k j;
    public static final k k;
    private static final k l[];

    private k(String s, int i1)
    {
        super(s, i1);
    }

    public static k valueOf(String s)
    {
        return (k)Enum.valueOf(k, s);
    }

    public static k[] values()
    {
        return (k[])l.clone();
    }

    static 
    {
        a = new k("PUSH_TOKEN_NOT_RECEIVED", 0);
        b = new k("PUSH_TOKEN_RECEIVED", 1);
        c = new k("SIGN_UP_ALIPAY_PROMO_APPLIED", 2);
        d = new k("SIGN_UP_LOAD_PROFILE_HAS_EMAIL", 3);
        e = new k("SIGN_UP_LOAD_PROFILE_HAS_FIRST_NAME", 4);
        f = new k("SIGN_UP_LOAD_PROFILE_HAS_LAST_NAME", 5);
        g = new k("SIGN_UP_LOAD_PROFILE_HAS_PHONE", 6);
        h = new k("SIGN_UP_PAYMENT_PROMO_APPLIED", 7);
        i = new k("SPOTIFY_CONNECT_FAILURE", 8);
        j = new k("SPOTIFY_CONNECT_SUCCESS", 9);
        k = new k("SURGE_TIMEOUT", 10);
        l = (new k[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
