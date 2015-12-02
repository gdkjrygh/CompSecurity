// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class h extends Enum
    implements cic
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    public static final h i;
    public static final h j;
    public static final h k;
    public static final h l;
    public static final h m;
    private static final h n[];

    private h(String s, int i1)
    {
        super(s, i1);
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(h, s);
    }

    public static h[] values()
    {
        return (h[])n.clone();
    }

    static 
    {
        a = new h("HELP_CONTACT_DETAILS", 0);
        b = new h("HELP_CONTACTS_LIST", 1);
        c = new h("HELP_HOME", 2);
        d = new h("PASSWORD_FORGOT_SUCCESS", 3);
        e = new h("PASSWORD_RESET_SCREEN_FORM", 4);
        f = new h("SUPPORT_FORM", 5);
        g = new h("SUPPORT_FORM_SUCCESS", 6);
        h = new h("SUPPORT_HOME", 7);
        i = new h("SUPPORT_LIST", 8);
        j = new h("SUPPORT_TRIP_ISSUES", 9);
        k = new h("SUPPORT_TRIP_RECEIPT", 10);
        l = new h("TRIP_DETAILS", 11);
        m = new h("TRIP_HISTORY", 12);
        n = (new h[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m
        });
    }
}
