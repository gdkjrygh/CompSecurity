// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class f extends Enum
    implements cif
{

    public static final f A;
    public static final f B;
    public static final f C;
    public static final f D;
    public static final f E;
    public static final f F;
    public static final f G;
    public static final f H;
    public static final f I;
    public static final f J;
    public static final f K;
    public static final f L;
    public static final f M;
    public static final f N;
    public static final f O;
    public static final f P;
    public static final f Q;
    public static final f R;
    public static final f S;
    public static final f T;
    public static final f U;
    public static final f V;
    public static final f W;
    public static final f X;
    public static final f Y;
    public static final f Z;
    public static final f a;
    public static final f aa;
    public static final f ab;
    public static final f ac;
    public static final f ad;
    public static final f ae;
    public static final f af;
    public static final f ag;
    public static final f ah;
    public static final f ai;
    public static final f aj;
    public static final f ak;
    public static final f al;
    public static final f am;
    public static final f an;
    public static final f ao;
    public static final f ap;
    public static final f aq;
    private static final f ar[];
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    public static final f g;
    public static final f h;
    public static final f i;
    public static final f j;
    public static final f k;
    public static final f l;
    public static final f m;
    public static final f n;
    public static final f o;
    public static final f p;
    public static final f q;
    public static final f r;
    public static final f s;
    public static final f t;
    public static final f u;
    public static final f v;
    public static final f w;
    public static final f x;
    public static final f y;
    public static final f z;

    private f(String s1, int i1)
    {
        super(s1, i1);
    }

    public static f valueOf(String s1)
    {
        return (f)Enum.valueOf(f, s1);
    }

    public static f[] values()
    {
        return (f[])ar.clone();
    }

    static 
    {
        a = new f("PAYMENT_ADD_CVV_TAP_CANCEL", 0);
        b = new f("PAYMENT_ADD_CVV_TAP_OK", 1);
        c = new f("PAYMENT_METHOD_ADD_BAIDU_WALLET_CANCEL", 2);
        d = new f("PAYMENT_METHOD_ADD_CC_SUBMIT", 3);
        e = new f("PAYMENT_METHOD_AIRTELMONEY_ADD_CANCEL", 4);
        f = new f("PAYMENT_METHOD_AIRTELMONEY_ADD_CONTINUE", 5);
        g = new f("PAYMENT_METHOD_AIRTELMONEY_ADD_MONEY_CANCEL", 6);
        h = new f("PAYMENT_METHOD_AIRTELMONEY_ADD_MONEY_CUSTOM_AMOUNT", 7);
        i = new f("PAYMENT_METHOD_AIRTELMONEY_ADD_MONEY_CUSTOM_AMOUNT_ALERT_ADD", 8);
        j = new f("PAYMENT_METHOD_AIRTELMONEY_ADD_MONEY_CUSTOM_AMOUNT_ALERT_CANCEL", 9);
        k = new f("PAYMENT_METHOD_AIRTELMONEY_ADD_MONEY_CVV_ALERT_CANCEL", 10);
        l = new f("PAYMENT_METHOD_AIRTELMONEY_ADD_MONEY_CVV_ALERT_CONFIRM", 11);
        m = new f("PAYMENT_METHOD_AIRTELMONEY_ADD_MONEY_DEFAULT_AMOUNT", 12);
        n = new f("PAYMENT_METHOD_AIRTELMONEY_ADD_MONEY_PROMO_CANCEL", 13);
        o = new f("PAYMENT_METHOD_AIRTELMONEY_ADD_MONEY_PROMO_CUSTOM_AMOUNT", 14);
        p = new f("PAYMENT_METHOD_AIRTELMONEY_ADD_MONEY_PROMO_DEFAULT_AMOUNT", 15);
        q = new f("PAYMENT_METHOD_AIRTELMONEY_ADD_MONEY_PROMO_SKIP", 16);
        r = new f("PAYMENT_METHOD_AIRTELMONEY_ADD_MONEY_SKIP", 17);
        s = new f("PAYMENT_METHOD_AIRTELMONEY_ADD_MONEY_WEBAUTH_CANCEL", 18);
        t = new f("PAYMENT_METHOD_AIRTELMONEY_CREATE_ACCOUNT_COMPLETE", 19);
        u = new f("PAYMENT_METHOD_AIRTELMONEY_EDIT_ADD_FUNDS", 20);
        v = new f("PAYMENT_METHOD_AIRTELMONEY_EDIT_DELETE", 21);
        w = new f("PAYMENT_METHOD_AIRTELMONEY_EDIT_DELETE_NO", 22);
        x = new f("PAYMENT_METHOD_AIRTELMONEY_EDIT_DELETE_YES", 23);
        y = new f("PAYMENT_METHOD_AIRTELMONEY_LINK_ACCOUNT_VERIFY", 24);
        z = new f("PAYMENT_METHOD_AIRTELMONEY_LINK_CARD_CANCEL", 25);
        A = new f("PAYMENT_METHOD_AIRTELMONEY_LINK_CARD_CHOOSE_CARD_TYPE", 26);
        B = new f("PAYMENT_METHOD_AIRTELMONEY_LINK_CARD_CHOOSE_CARD_TYPE_SELECTED", 27);
        C = new f("PAYMENT_METHOD_AIRTELMONEY_LINK_CARD_VERIFY", 28);
        D = new f("PAYMENT_METHOD_AIRTELMONEY_VERIFY_CANCEL", 29);
        E = new f("PAYMENT_METHOD_AIRTELMONEY_VERIFY_RESEND", 30);
        F = new f("PAYMENT_METHOD_AIRTELMONEY_VERIFY_VERIFY", 31);
        G = new f("PAYMENT_METHOD_ALIPAY_EDIT_CANCEL", 32);
        H = new f("PAYMENT_METHOD_ALIPAY_EDIT_CLOSE", 33);
        I = new f("PAYMENT_METHOD_ALIPAY_EDIT_DELETE", 34);
        J = new f("PAYMENT_METHOD_ALIPAY_EDIT_DELETE_CANCEL", 35);
        K = new f("PAYMENT_METHOD_ALIPAY_EDIT_DELETE_CONFIRM", 36);
        L = new f("PAYMENT_METHOD_ALIPAY_EDIT_EDIT", 37);
        M = new f("PAYMENT_METHOD_ALIPAY_VERIFY_MANUAL_CANCEL", 38);
        N = new f("PAYMENT_METHOD_ALIPAY_VERIFY_MANUAL_CANCEL_NO", 39);
        O = new f("PAYMENT_METHOD_ALIPAY_VERIFY_MANUAL_CANCEL_YES", 40);
        P = new f("PAYMENT_METHOD_ALIPAY_VERIFY_VERIFY", 41);
        Q = new f("PAYMENT_METHOD_BANKCARD_ADD_CANCEL", 42);
        R = new f("PAYMENT_METHOD_BANKCARD_ADD_CONNECT", 43);
        S = new f("PAYMENT_METHOD_BANKCARD_ADD_INFO_CARD_CODE", 44);
        T = new f("PAYMENT_METHOD_BANKCARD_ADD_INFO_EXPIRATION", 45);
        U = new f("PAYMENT_METHOD_BANKCARD_ADD_SCAN_CARD", 46);
        V = new f("PAYMENT_METHOD_BANKCARD_ADD_SCAN_CARD_CANCEL", 47);
        W = new f("PAYMENT_METHOD_BANKCARD_ADD_SCAN_CARD_DONE", 48);
        X = new f("PAYMENT_METHOD_CASH_FEE_DIALOG_FEE_CONFIRM_NEGATIVE", 49);
        Y = new f("PAYMENT_METHOD_CASH_FEE_DIALOG_FEE_CONFIRM_POSITIVE", 50);
        Z = new f("PAYMENT_METHOD_CASH_FEE_DIALOG_GO_DIGITAL_NEGATIVE", 51);
        aa = new f("PAYMENT_METHOD_CASH_FEE_DIALOG_GO_DIGITAL_POSITIVE", 52);
        ab = new f("PAYMENT_METHOD_DELEGATE_EDIT_CLOSE", 53);
        ac = new f("PAYMENT_METHOD_PAYPAL_EDIT_CANCEL", 54);
        ad = new f("PAYMENT_METHOD_PAYPAL_EDIT_CLOSE", 55);
        ae = new f("PAYMENT_METHOD_PAYPAL_EDIT_DELETE", 56);
        af = new f("PAYMENT_METHOD_PAYPAL_EDIT_DELETE_CANCEL", 57);
        ag = new f("PAYMENT_METHOD_PAYPAL_EDIT_DELETE_CONFIRM", 58);
        ah = new f("PAYMENT_METHOD_PAYPAL_EDIT_EDIT", 59);
        ai = new f("PAYMENT_METHOD_UNIONPAY_ADD_NEXT", 60);
        aj = new f("PAYMENT_METHOD_UNIONPAY_EDIT_DELETE", 61);
        ak = new f("PAYMENT_METHOD_UNIONPAY_EDIT_DELETE_NO", 62);
        al = new f("PAYMENT_METHOD_UNIONPAY_EDIT_DELETE_YES", 63);
        am = new f("PAYMENT_METHOD_UNIONPAY_SCAN_CC_CANCEL", 64);
        an = new f("PAYMENT_METHOD_UNIONPAY_SCAN_CC_DONE", 65);
        ao = new f("PAYMENT_METHOD_UNIONPAY_VERIFY_CANCEL", 66);
        ap = new f("PAYMENT_METHOD_UNIONPAY_VERIFY_CANCEL_NO", 67);
        aq = new f("PAYMENT_METHOD_UNIONPAY_VERIFY_CANCEL_YES", 68);
        ar = (new f[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L, M, N, 
            O, P, Q, R, S, T, U, V, W, X, 
            Y, Z, aa, ab, ac, ad, ae, af, ag, ah, 
            ai, aj, ak, al, am, an, ao, ap, aq
        });
    }
}
