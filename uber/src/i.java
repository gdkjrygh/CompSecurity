// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class i extends Enum
    implements cif
{

    public static final i A;
    public static final i B;
    public static final i C;
    public static final i D;
    public static final i E;
    public static final i F;
    public static final i G;
    private static final i H[];
    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;
    public static final i f;
    public static final i g;
    public static final i h;
    public static final i i;
    public static final i j;
    public static final i k;
    public static final i l;
    public static final i m;
    public static final i n;
    public static final i o;
    public static final i p;
    public static final i q;
    public static final i r;
    public static final i s;
    public static final i t;
    public static final i u;
    public static final i v;
    public static final i w;
    public static final i x;
    public static final i y;
    public static final i z;

    private i(String s1, int i1)
    {
        super(s1, i1);
    }

    public static i valueOf(String s1)
    {
        return (i)Enum.valueOf(i, s1);
    }

    public static i[] values()
    {
        return (i[])H.clone();
    }

    static 
    {
        a = new i("HELP_CONTACT_DETAILS_CSAT_NO", 0);
        b = new i("HELP_CONTACT_DETAILS_CSAT_REPLY", 1);
        c = new i("HELP_CONTACT_DETAILS_CSAT_YES", 2);
        d = new i("HELP_CONTACT_DETAILS_SEND", 3);
        e = new i("HELP_CONTACT_DETAILS_TRIP", 4);
        f = new i("HELP_CONTACTS_LIST_CONTACT", 5);
        g = new i("HELP_HOME_ALL_CONTACTS", 6);
        h = new i("HELP_HOME_ALL_TRIPS", 7);
        i = new i("HELP_HOME_CHILD_NODE", 8);
        j = new i("HELP_HOME_CONTACT", 9);
        k = new i("HELP_HOME_LAST_TRIP", 10);
        l = new i("HELP_HOME_ROOT_NODE", 11);
        m = new i("PASSWORD_FORGOT_SEND_EMAIL", 12);
        n = new i("PASSWORD_RESET_SIGN_IN", 13);
        o = new i("SUPPORT_FORM_DATE", 14);
        p = new i("SUPPORT_FORM_PHOTO", 15);
        q = new i("SUPPORT_FORM_RECEIPT", 16);
        r = new i("SUPPORT_FORM_SUBMIT", 17);
        s = new i("SUPPORT_HOME_ALL_TRIPS", 18);
        t = new i("SUPPORT_HOME_CATEGORY", 19);
        u = new i("SUPPORT_HOME_FAQ", 20);
        v = new i("SUPPORT_HOME_FORM", 21);
        w = new i("SUPPORT_HOME_PAST_TRIP", 22);
        x = new i("SUPPORT_HOME_RECENT_TRIP", 23);
        y = new i("SUPPORT_ISSUE_RECEIPT", 24);
        z = new i("SUPPORT_PHONE_CALL", 25);
        A = new i("SUPPORT_PHONE_OPEN", 26);
        B = new i("TRIP_DETAILS_REPORT_ISSUE", 27);
        C = new i("TRIP_HISTORY_PAST_TRIP", 28);
        D = new i("TRIP_PROBLEM_CATEGORY", 29);
        E = new i("TRIP_PROBLEM_FAQ", 30);
        F = new i("TRIP_PROBLEM_FORM", 31);
        G = new i("TRIP_PROBLEM_RECEIPT", 32);
        H = (new i[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G
        });
    }
}
