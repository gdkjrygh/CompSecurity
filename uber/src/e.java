// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class e extends Enum
    implements cic
{

    public static final e A;
    public static final e B;
    public static final e C;
    public static final e D;
    public static final e E;
    public static final e F;
    public static final e G;
    public static final e H;
    public static final e I;
    public static final e J;
    public static final e K;
    public static final e L;
    public static final e M;
    public static final e N;
    public static final e O;
    public static final e P;
    public static final e Q;
    public static final e R;
    public static final e S;
    public static final e T;
    public static final e U;
    public static final e V;
    public static final e W;
    public static final e X;
    public static final e Y;
    public static final e Z;
    public static final e a;
    public static final e aa;
    public static final e ab;
    public static final e ac;
    public static final e ad;
    public static final e ae;
    public static final e af;
    public static final e ag;
    public static final e ah;
    public static final e ai;
    public static final e aj;
    public static final e ak;
    public static final e al;
    public static final e am;
    public static final e an;
    public static final e ao;
    public static final e ap;
    public static final e aq;
    public static final e ar;
    public static final e as;
    public static final e at;
    public static final e au;
    private static final e av[];
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    public static final e f;
    public static final e g;
    public static final e h;
    public static final e i;
    public static final e j;
    public static final e k;
    public static final e l;
    public static final e m;
    public static final e n;
    public static final e o;
    public static final e p;
    public static final e q;
    public static final e r;
    public static final e s;
    public static final e t;
    public static final e u;
    public static final e v;
    public static final e w;
    public static final e x;
    public static final e y;
    public static final e z;

    private e(String s1, int i1)
    {
        super(s1, i1);
    }

    public static e valueOf(String s1)
    {
        return (e)Enum.valueOf(e, s1);
    }

    public static e[] values()
    {
        return (e[])av.clone();
    }

    static 
    {
        a = new e("ADD_CREDIT_CARD", 0);
        b = new e("ADD_CREDIT_CARD_FORCE_SCANNING", 1);
        c = new e("BAIDU_WALLET_ADD", 2);
        d = new e("BAIDU_WALLET_ADD_ERROR", 3);
        e = new e("BAIDU_WALLET_ADD_NETWORK_ERROR", 4);
        f = new e("BAIDU_WALLET_INVALID_REDIRECT_URL_ERROR", 5);
        g = new e("BAIDU_WALLET_NETWORK_ERROR", 6);
        h = new e("BAIDU_WALLET_WEBVIEW_LOADED", 7);
        i = new e("PAYMENT_ADD_CVV_ALERT", 8);
        j = new e("PAYMENT_METHOD_ADD_BAIDU_WALLET", 9);
        k = new e("PAYMENT_METHOD_AIRTELMONEY_ADD", 10);
        l = new e("PAYMENT_METHOD_AIRTELMONEY_ADD_MONEY", 11);
        m = new e("PAYMENT_METHOD_AIRTELMONEY_ADD_MONEY_CUSTOM_AMOUNT_ALERT", 12);
        n = new e("PAYMENT_METHOD_AIRTELMONEY_ADD_MONEY_CVV_ALERT", 13);
        o = new e("PAYMENT_METHOD_AIRTELMONEY_ADD_MONEY_FAILURE", 14);
        p = new e("PAYMENT_METHOD_AIRTELMONEY_ADD_MONEY_PROMO", 15);
        q = new e("PAYMENT_METHOD_AIRTELMONEY_ADD_MONEY_WEBAUTH", 16);
        r = new e("PAYMENT_METHOD_AIRTELMONEY_ADD_MONEY_WEBAUTH_FAILURE", 17);
        s = new e("PAYMENT_METHOD_AIRTELMONEY_ADD_MONEY_WEBAUTH_SUCCESS", 18);
        t = new e("PAYMENT_METHOD_AIRTELMONEY_CREATE_ACCOUNT", 19);
        u = new e("PAYMENT_METHOD_AIRTELMONEY_CREATE_ACCOUNT_FAILURE", 20);
        v = new e("PAYMENT_METHOD_AIRTELMONEY_CREATE_ACCOUNT_SUCCESS", 21);
        w = new e("PAYMENT_METHOD_AIRTELMONEY_DATA_COLLECTION", 22);
        x = new e("PAYMENT_METHOD_AIRTELMONEY_DELETE", 23);
        y = new e("PAYMENT_METHOD_AIRTELMONEY_DELETE_FAILURE", 24);
        z = new e("PAYMENT_METHOD_AIRTELMONEY_DELETE_SUCCESS", 25);
        A = new e("PAYMENT_METHOD_AIRTELMONEY_EDIT", 26);
        B = new e("PAYMENT_METHOD_AIRTELMONEY_LINK_ACCOUNT", 27);
        C = new e("PAYMENT_METHOD_AIRTELMONEY_LINK_ACCOUNT_FAILURE", 28);
        D = new e("PAYMENT_METHOD_AIRTELMONEY_LINK_ACCOUNT_SUCCESS", 29);
        E = new e("PAYMENT_METHOD_AIRTELMONEY_LINK_CARD", 30);
        F = new e("PAYMENT_METHOD_AIRTELMONEY_VERIFY", 31);
        G = new e("PAYMENT_METHOD_AIRTELMONEY_VERIFY_FAILURE", 32);
        H = new e("PAYMENT_METHOD_AIRTELMONEY_VERIFY_SUCCESS", 33);
        I = new e("PAYMENT_METHOD_ALIPAY_EDIT", 34);
        J = new e("PAYMENT_METHOD_ALIPAY_VERIFY_AUTO", 35);
        K = new e("PAYMENT_METHOD_ALIPAY_VERIFY_AUTO_FAILURE", 36);
        L = new e("PAYMENT_METHOD_ALIPAY_VERIFY_AUTO_SUCCESS", 37);
        M = new e("PAYMENT_METHOD_ALIPAY_VERIFY_MANUAL", 38);
        N = new e("PAYMENT_METHOD_ALIPAY_VERIFY_MANUAL_FAILURE", 39);
        O = new e("PAYMENT_METHOD_ALIPAY_VERIFY_MANUAL_SUCCESS", 40);
        P = new e("PAYMENT_METHOD_BANKCARD_ADD", 41);
        Q = new e("PAYMENT_METHOD_BANKCARD_ADD_FAILURE", 42);
        R = new e("PAYMENT_METHOD_BANKCARD_ADD_SUCCESS", 43);
        S = new e("PAYMENT_METHOD_BANKCARD_DATA_COLLECTION", 44);
        T = new e("PAYMENT_METHOD_CASH_FEE_DIALOG_FEE_CONFIRM", 45);
        U = new e("PAYMENT_METHOD_CASH_FEE_DIALOG_GO_DIGITAL", 46);
        V = new e("PAYMENT_METHOD_CREDITCARD_ADD", 47);
        W = new e("PAYMENT_METHOD_CREDITCARD_ADD_FAILURE", 48);
        X = new e("PAYMENT_METHOD_CREDITCARD_ADD_SUCCESS", 49);
        Y = new e("PAYMENT_METHOD_DELEGATE_EDIT", 50);
        Z = new e("PAYMENT_METHOD_PAYPAL_EDIT", 51);
        aa = new e("PAYMENT_METHOD_UNIONPAY_ADD", 52);
        ab = new e("PAYMENT_METHOD_UNIONPAY_ADD_FAILURE", 53);
        ac = new e("PAYMENT_METHOD_UNIONPAY_ADD_REVEAL_CREDIT_FIELDS", 54);
        ad = new e("PAYMENT_METHOD_UNIONPAY_ADD_SUCCESS", 55);
        ae = new e("PAYMENT_METHOD_UNIONPAY_DELETE_FAILURE", 56);
        af = new e("PAYMENT_METHOD_UNIONPAY_DELETE_SUCCESS", 57);
        ag = new e("PAYMENT_METHOD_UNIONPAY_EDIT", 58);
        ah = new e("PAYMENT_METHOD_UNIONPAY_VERIFY", 59);
        ai = new e("PAYMENT_METHOD_UNIONPAY_VERIFY_FAILURE", 60);
        aj = new e("PAYMENT_METHOD_UNIONPAY_VERIFY_SUCCESS", 61);
        ak = new e("PAYMENT_METHOD_ZAAKPAY_ADD_FAILURE", 62);
        al = new e("PAYMENT_METHOD_ZAAKPAY_ADD_SUCCESS", 63);
        am = new e("PAYMENT_METHOD_ZAAKPAY_WEBAUTH", 64);
        an = new e("PAYMENT_METHOD_ZAAKPAY_WEBAUTH_FAILURE", 65);
        ao = new e("PAYMENT_METHOD_ZAAKPAY_WEBAUTH_SUCCESS", 66);
        ap = new e("PAYPAL_ADD", 67);
        aq = new e("PAYPAL_ADD_ERROR", 68);
        ar = new e("PAYPAL_ADD_NETWORK_ERROR", 69);
        as = new e("PAYPAL_ADD_SUCCESS", 70);
        at = new e("PAYPAL_DATA_COLLECTION", 71);
        au = new e("SIGN_UP_CREDIT_CARD", 72);
        av = (new e[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L, M, N, 
            O, P, Q, R, S, T, U, V, W, X, 
            Y, Z, aa, ab, ac, ad, ae, af, ag, ah, 
            ai, aj, ak, al, am, an, ao, ap, aq, ar, 
            as, at, au
        });
    }
}
