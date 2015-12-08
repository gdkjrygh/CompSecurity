// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;


public final class ar extends Enum
{

    public static final ar A;
    public static final ar B;
    public static final ar C;
    public static final ar D;
    public static final ar E;
    public static final ar F;
    public static final ar G;
    public static final ar H;
    public static final ar I;
    public static final ar J;
    public static final ar K;
    public static final ar L;
    public static final ar M;
    public static final ar N;
    public static final ar O;
    public static final ar P;
    public static final ar Q;
    public static final ar R;
    public static final ar S;
    public static final ar T;
    public static final ar U;
    public static final ar V;
    private static ar W;
    private static ar X;
    private static ar Y;
    private static ar Z;
    public static final ar a;
    private static ar aA;
    private static ar aB;
    private static final ar aD[];
    private static ar aa;
    private static ar ab;
    private static ar ac;
    private static ar ad;
    private static ar ae;
    private static ar af;
    private static ar ag;
    private static ar ah;
    private static ar ai;
    private static ar aj;
    private static ar ak;
    private static ar al;
    private static ar am;
    private static ar an;
    private static ar ao;
    private static ar ap;
    private static ar aq;
    private static ar ar;
    private static ar as;
    private static ar at;
    private static ar au;
    private static ar av;
    private static ar aw;
    private static ar ax;
    private static ar ay;
    private static ar az;
    public static final ar b;
    public static final ar c;
    public static final ar d;
    public static final ar e;
    public static final ar f;
    public static final ar g;
    public static final ar h;
    public static final ar i;
    public static final ar j;
    public static final ar k;
    public static final ar l;
    public static final ar m;
    public static final ar n;
    public static final ar o;
    public static final ar p;
    public static final ar q;
    public static final ar r;
    public static final ar s;
    public static final ar t;
    public static final ar u;
    public static final ar v;
    public static final ar w;
    public static final ar x;
    public static final ar y;
    public static final ar z;
    private int aC;

    private ar(String s1, int i1, int j1)
    {
        super(s1, i1);
        aC = j1;
    }

    public static ar valueOf(String s1)
    {
        return (ar)Enum.valueOf(com/paypal/android/sdk/onetouch/core/ar, s1);
    }

    public static ar[] values()
    {
        return (ar[])aD.clone();
    }

    public final int a()
    {
        return aC;
    }

    static 
    {
        W = new ar("PPRiskDataAnId", 0, 0);
        a = new ar("PPRiskDataAppGuid", 1, 1);
        b = new ar("PPRiskDataAppId", 2, 2);
        c = new ar("PPRiskDataAppVersion", 3, 3);
        d = new ar("PPRiskDataBaseStationId", 4, 4);
        e = new ar("PPRiskDataBssid", 5, 5);
        f = new ar("PPRiskDataCellId", 6, 6);
        X = new ar("PPRiskDataClrVersion", 7, 7);
        Y = new ar("PPRiskDataCompVersion", 8, 8);
        Z = new ar("PPRiskDataConfUrl", 9, 9);
        aa = new ar("PPRiskDataConfVersion", 10, 10);
        g = new ar("PPRiskDataConnType", 11, 11);
        ab = new ar("PPRiskDataDeviceFirmwareVersion", 12, 12);
        h = new ar("PPRiskDataDeviceId", 13, 13);
        i = new ar("PPRiskDataDeviceModel", 14, 14);
        j = new ar("PPRiskDataDeviceName", 15, 15);
        k = new ar("PPRiskDataDeviceUptime", 16, 16);
        ac = new ar("PPRiskDataDongleDeviceId", 17, 17);
        ad = new ar("PPRiskDataEmailConfigured", 18, 18);
        ae = new ar("PPRiskDataEmulator", 19, 19);
        af = new ar("PPRiskDataError", 20, 20);
        l = new ar("PPRiskDataIpAddrs", 21, 21);
        ag = new ar("PPRiskDataKeyboardPresent", 22, 22);
        m = new ar("PPRiskDataKnownApps", 23, 23);
        n = new ar("PPRiskDataLine1Number", 24, 24);
        o = new ar("PPRiskDataLinkerId", 25, 25);
        ah = new ar("PPRiskDataLicenseAccepted", 26, 26);
        p = new ar("PPRiskDataLocaleCountry", 27, 27);
        q = new ar("PPRiskDataLocaleLang", 28, 28);
        r = new ar("PPRiskDataLocation", 29, 29);
        s = new ar("PPRiskDataLocationAreaCode", 30, 30);
        ai = new ar("PPRiskDataLocationAuthStatus", 31, 31);
        t = new ar("PPRiskDataMacAddrs", 32, 32);
        aj = new ar("PPRiskDataMobileOperatorName", 33, 33);
        u = new ar("PPRiskDataNotifToken", 34, 34);
        ak = new ar("PPRiskDataOsPlatform", 35, 35);
        v = new ar("PPRiskDataOsType", 36, 36);
        al = new ar("PPRiskDataOsVersion", 37, 37);
        am = new ar("PPRiskDataPayloadType", 38, 38);
        w = new ar("PPRiskDataPhoneType", 39, 39);
        an = new ar("PPRiskDataPinLockLastTimestamp", 40, 40);
        ao = new ar("PPRiskDataPowerSource", 41, 41);
        x = new ar("PPRiskDataRiskCompSessionId", 42, 42);
        y = new ar("PPRiskDataRoaming", 43, 43);
        ap = new ar("PPRiskDataRoamingPossible", 44, 44);
        z = new ar("PPRiskDataSimOperatorName", 45, 45);
        aq = new ar("PPRiskDataSimSerialNumber", 46, 46);
        A = new ar("PPRiskDataSmsEnabled", 47, 47);
        B = new ar("PPRiskDataSsid", 48, 48);
        C = new ar("PPRiskDataSubscriberId", 49, 49);
        D = new ar("PPRiskDataTimestamp", 50, 50);
        ar = new ar("PPRiskDataTotalDeviceMemory", 51, 51);
        E = new ar("PPRiskDataTotalStorageSpace", 52, 52);
        F = new ar("PPRiskDataTzName", 53, 53);
        G = new ar("PPRiskDataAdvertisingIdentifier", 54, 54);
        as = new ar("PPRiskDataVendorIdentifier", 55, 55);
        H = new ar("PPRiskDataNetworkOperator", 56, 56);
        I = new ar("PPRiskDataCdmaNetworkId", 57, 57);
        J = new ar("PPRiskDataCdmaSystemId", 58, 58);
        K = new ar("PPRiskDataIsEmulator", 59, 59);
        L = new ar("PPRiskDataIsRooted", 60, 60);
        at = new ar("PPRiskDataGeoCountry", 61, 61);
        M = new ar("PPRiskDataSourceApp", 62, 62);
        N = new ar("PPRiskDataSourceAppVersion", 63, 63);
        O = new ar("PPRiskDataPairingId", 64, 64);
        P = new ar("PPRiskDataAppFirstInstallTime", 65, 65);
        Q = new ar("PPRiskDataAppLastUpdateTime", 66, 66);
        au = new ar("PPRiskDataBluetoothMacAddress", 67, 67);
        R = new ar("PPRiskDataSerialNumber", 68, 68);
        S = new ar("PPRiskDataAndroidId", 69, 69);
        T = new ar("PPRiskDataGsfId", 70, 70);
        U = new ar("PPRiskDataVPNSetting", 71, 71);
        V = new ar("PPRiskDataProxySetting", 72, 72);
        av = new ar("PPRiskDataLocalIdentifier", 73, 73);
        aw = new ar("PPRiskDataCloudIdentifier", 74, 74);
        ax = new ar("PPRiskDataUnused1", 75, 75);
        ay = new ar("PPRiskDataUnused2", 76, 76);
        az = new ar("PPRiskDataUnused3", 77, 77);
        aA = new ar("PPRiskDataUnused4", 78, 78);
        aB = new ar("PPRiskDataUnused5", 79, 79);
        aD = (new ar[] {
            W, a, b, c, d, e, f, X, Y, Z, 
            aa, g, ab, h, i, j, k, ac, ad, ae, 
            af, l, ag, m, n, o, ah, p, q, r, 
            s, ai, t, aj, u, ak, v, al, am, w, 
            an, ao, x, y, ap, z, aq, A, B, C, 
            D, ar, E, F, G, as, H, I, J, K, 
            L, at, M, N, O, P, Q, au, R, S, 
            T, U, V, av, aw, ax, ay, az, aA, aB
        });
    }
}
