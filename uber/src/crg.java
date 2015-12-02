// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class crg extends Enum
    implements gmv
{

    public static final crg a;
    public static final crg b;
    public static final crg c;
    public static final crg d;
    public static final crg e;
    public static final crg f;
    public static final crg g;
    public static final crg h;
    public static final crg i;
    public static final crg j;
    public static final crg k;
    private static final crg l[];

    private crg(String s, int i1)
    {
        super(s, i1);
    }

    public static crg valueOf(String s)
    {
        return (crg)Enum.valueOf(crg, s);
    }

    public static crg[] values()
    {
        return (crg[])l.clone();
    }

    static 
    {
        a = new crg("ANDROID_DOCUMENTS_MAX_SIZE", 0);
        b = new crg("ANDROID_DRIVER_DX_MAP_PADDING_V2", 1);
        c = new crg("ANDROID_PARTNER_NATIVE_ONBOARDING", 2);
        d = new crg("ANDROID_PARTNER_NATIVE_ONBOARDING_PUSH", 3);
        e = new crg("ANDROID_PARTNER_NATIVE_ONBOARDING_METADATA_CAPTURE", 4);
        f = new crg("ANDROID_PHOTO_RENDERSCRIPT", 5);
        g = new crg("ANDROID_DRIVER_SIGN_UP_LOGIN_ERROR_EXCEPTION_LOGGING", 6);
        h = new crg("DO_OFFICE_HOURS_ANDROID", 7);
        i = new crg("DRIVER_SG_ACTIVATION_PENDING_PAGE_V2", 8);
        j = new crg("DRIVER_SG_DOC_MGMT", 9);
        k = new crg("DRIVER_SG_DOC_MGMT_METADATA", 10);
        l = (new crg[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
