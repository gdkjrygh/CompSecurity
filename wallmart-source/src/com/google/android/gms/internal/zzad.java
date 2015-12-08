// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class zzad extends Enum
{

    public static final zzad zzbA;
    public static final zzad zzbB;
    public static final zzad zzbC;
    public static final zzad zzbD;
    public static final zzad zzbE;
    public static final zzad zzbF;
    public static final zzad zzbG;
    public static final zzad zzbH;
    public static final zzad zzbI;
    public static final zzad zzbJ;
    public static final zzad zzbK;
    public static final zzad zzbL;
    public static final zzad zzbM;
    public static final zzad zzbN;
    public static final zzad zzbO;
    public static final zzad zzbP;
    public static final zzad zzbQ;
    public static final zzad zzbR;
    public static final zzad zzbS;
    public static final zzad zzbT;
    public static final zzad zzbU;
    public static final zzad zzbV;
    public static final zzad zzbW;
    public static final zzad zzbX;
    public static final zzad zzbY;
    public static final zzad zzbZ;
    public static final zzad zzbf;
    public static final zzad zzbg;
    public static final zzad zzbh;
    public static final zzad zzbi;
    public static final zzad zzbj;
    public static final zzad zzbk;
    public static final zzad zzbl;
    public static final zzad zzbm;
    public static final zzad zzbn;
    public static final zzad zzbo;
    public static final zzad zzbp;
    public static final zzad zzbq;
    public static final zzad zzbr;
    public static final zzad zzbs;
    public static final zzad zzbt;
    public static final zzad zzbu;
    public static final zzad zzbv;
    public static final zzad zzbw;
    public static final zzad zzbx;
    public static final zzad zzby;
    public static final zzad zzbz;
    public static final zzad zzcA;
    public static final zzad zzcB;
    public static final zzad zzcC;
    public static final zzad zzcD;
    public static final zzad zzcE;
    public static final zzad zzcF;
    public static final zzad zzcG;
    public static final zzad zzcH;
    public static final zzad zzcI;
    public static final zzad zzcJ;
    public static final zzad zzcK;
    public static final zzad zzcL;
    public static final zzad zzcM;
    public static final zzad zzcN;
    public static final zzad zzcO;
    public static final zzad zzcP;
    public static final zzad zzcQ;
    public static final zzad zzcR;
    public static final zzad zzcS;
    public static final zzad zzcT;
    public static final zzad zzcU;
    public static final zzad zzcV;
    public static final zzad zzcW;
    public static final zzad zzcX;
    public static final zzad zzcY;
    public static final zzad zzcZ;
    public static final zzad zzca;
    public static final zzad zzcb;
    public static final zzad zzcc;
    public static final zzad zzcd;
    public static final zzad zzce;
    public static final zzad zzcf;
    public static final zzad zzcg;
    public static final zzad zzch;
    public static final zzad zzci;
    public static final zzad zzcj;
    public static final zzad zzck;
    public static final zzad zzcl;
    public static final zzad zzcm;
    public static final zzad zzcn;
    public static final zzad zzco;
    public static final zzad zzcp;
    public static final zzad zzcq;
    public static final zzad zzcr;
    public static final zzad zzcs;
    public static final zzad zzct;
    public static final zzad zzcu;
    public static final zzad zzcv;
    public static final zzad zzcw;
    public static final zzad zzcx;
    public static final zzad zzcy;
    public static final zzad zzcz;
    public static final zzad zzda;
    public static final zzad zzdb;
    public static final zzad zzdc;
    public static final zzad zzdd;
    public static final zzad zzde;
    public static final zzad zzdf;
    public static final zzad zzdg;
    public static final zzad zzdh;
    public static final zzad zzdi;
    private static final zzad zzdj[];
    private final String name;

    private zzad(String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }

    public static zzad valueOf(String s)
    {
        return (zzad)Enum.valueOf(com/google/android/gms/internal/zzad, s);
    }

    public static zzad[] values()
    {
        return (zzad[])zzdj.clone();
    }

    public String toString()
    {
        return name;
    }

    static 
    {
        zzbf = new zzad("ADVERTISER_ID", 0, "_aid");
        zzbg = new zzad("ADVERTISING_TRACKING_ENABLED", 1, "_ate");
        zzbh = new zzad("APP_ID", 2, "_ai");
        zzbi = new zzad("APP_NAME", 3, "_an");
        zzbj = new zzad("APP_VERSION", 4, "_av");
        zzbk = new zzad("ARBITRARY_JAVASCRIPT", 5, "_jsm");
        zzbl = new zzad("CONSTANT", 6, "_c");
        zzbm = new zzad("COOKIE", 7, "_k");
        zzbn = new zzad("CUSTOM_VAR", 8, "_v");
        zzbo = new zzad("CONTAINER_VERSION", 9, "_ctv");
        zzbp = new zzad("DEBUG_MODE", 10, "_dbg");
        zzbq = new zzad("DEVICE_NAME", 11, "_dn");
        zzbr = new zzad("DEVICE_TYPE", 12, "_dt");
        zzbs = new zzad("DOM_ELEMENT", 13, "_d");
        zzbt = new zzad("ELEMENT_TEXT", 14, "_et");
        zzbu = new zzad("ELEMENT_URL", 15, "_eu");
        zzbv = new zzad("EVENT", 16, "_e");
        zzbw = new zzad("FUNCTION_CALL", 17, "_func");
        zzbx = new zzad("JS_GLOBAL", 18, "_j");
        zzby = new zzad("LANGUAGE", 19, "_l");
        zzbz = new zzad("OS_VERSION", 20, "_ov");
        zzbA = new zzad("PLATFORM", 21, "_p");
        zzbB = new zzad("RANDOM", 22, "_r");
        zzbC = new zzad("REFERRER", 23, "_f");
        zzbD = new zzad("RESOLUTION", 24, "_rs");
        zzbE = new zzad("RUNTIME_VERSION", 25, "_rv");
        zzbF = new zzad("SDK_VERSION", 26, "_sv");
        zzbG = new zzad("SIMPLE_MAP", 27, "_smm");
        zzbH = new zzad("TIME", 28, "_t");
        zzbI = new zzad("URL", 29, "_u");
        zzbJ = new zzad("ADWORDS_CLICK_REFERRER", 30, "_awcr");
        zzbK = new zzad("DEVICE_ID", 31, "_did");
        zzbL = new zzad("ENCODE", 32, "_enc");
        zzbM = new zzad("GTM_VERSION", 33, "_gtmv");
        zzbN = new zzad("HASH", 34, "_hsh");
        zzbO = new zzad("INSTALL_REFERRER", 35, "_ir");
        zzbP = new zzad("JOINER", 36, "_jn");
        zzbQ = new zzad("MOBILE_ADWORDS_UNIQUE_ID", 37, "_awid");
        zzbR = new zzad("REGEX_GROUP", 38, "_reg");
        zzbS = new zzad("DATA_LAYER_WRITE", 39, "_dlw");
        zzbT = new zzad("LOWERCASE_STRING", 40, "_ls");
        zzbU = new zzad("UPPERCASE_STRING", 41, "_us");
        zzbV = new zzad("EXPERIMENT_ENABLED", 42, "_ee");
        zzbW = new zzad("IN_EXPERIMENT", 43, "_ie");
        zzbX = new zzad("EXPERIMENT_VARIATION_INDEX", 44, "_evi");
        zzbY = new zzad("AUDIENCE_LISTS", 45, "_aud");
        zzbZ = new zzad("CSS_SELECTOR", 46, "_sel");
        zzca = new zzad("GA_CLIENT_ID", 47, "_gacid");
        zzcb = new zzad("PRODUCT_SETTING_PROPERTY", 48, "_prodset");
        zzcc = new zzad("GA_OPT_OUT_CLIENT", 49, "_gaoo_c");
        zzcd = new zzad("GA_OPT_OUT_SERVER", 50, "_gaoo_s");
        zzce = new zzad("REGEX", 51, "_re");
        zzcf = new zzad("STARTS_WITH", 52, "_sw");
        zzcg = new zzad("ENDS_WITH", 53, "_ew");
        zzch = new zzad("CONTAINS", 54, "_cn");
        zzci = new zzad("EQUALS", 55, "_eq");
        zzcj = new zzad("LESS_THAN", 56, "_lt");
        zzck = new zzad("LESS_EQUALS", 57, "_le");
        zzcl = new zzad("GREATER_THAN", 58, "_gt");
        zzcm = new zzad("GREATER_EQUALS", 59, "_ge");
        zzcn = new zzad("CSS_SELECTOR_PREDICATE", 60, "_css");
        zzco = new zzad("ARBITRARY_PIXEL", 61, "_img");
        zzcp = new zzad("ARBITRARY_HTML", 62, "_html");
        zzcq = new zzad("GOOGLE_TAG_MANAGER", 63, "_gtm");
        zzcr = new zzad("GOOGLE_ANALYTICS", 64, "_ga");
        zzcs = new zzad("ADWORDS_CONVERSION", 65, "_awct");
        zzct = new zzad("SMART_PIXEL", 66, "_sp");
        zzcu = new zzad("FLOODLIGHT_COUNTER", 67, "_flc");
        zzcv = new zzad("FLOODLIGHT_SALES", 68, "_fls");
        zzcw = new zzad("BIZO_INSIGHT", 69, "_bzi");
        zzcx = new zzad("QUANTCAST_MEASUREMENT", 70, "_qcm");
        zzcy = new zzad("TARGUS_ADVISOR", 71, "_ta");
        zzcz = new zzad("MEDIAPLEX_ROI", 72, "_mpr");
        zzcA = new zzad("COMSCORE_MEASUREMENT", 73, "_csm");
        zzcB = new zzad("TURN_CONVERSION", 74, "_tc");
        zzcC = new zzad("TURN_DATA_COLLECTION", 75, "_tdc");
        zzcD = new zzad("MEDIA6DEGREES_UNIVERSAL_PIXEL", 76, "_m6d");
        zzcE = new zzad("UNIVERSAL_ANALYTICS", 77, "_ua");
        zzcF = new zzad("MEDIAPLEX_MCT", 78, "_mpm");
        zzcG = new zzad("VISUAL_DNA_CONVERSION", 79, "_vdc");
        zzcH = new zzad("GOOGLE_AFFILIATE_NETWORK", 80, "_gan");
        zzcI = new zzad("MARIN_SOFTWARE", 81, "_ms");
        zzcJ = new zzad("ADROLL_SMART_PIXEL", 82, "_asp");
        zzcK = new zzad("CONFIGURATION_VALUE", 83, "_cv");
        zzcL = new zzad("CRITEO", 84, "_crt");
        zzcM = new zzad("TRUSTED_STORES", 85, "_ts");
        zzcN = new zzad("CLICK_TALE_STANDARD", 86, "_cts");
        zzcO = new zzad("LINK_CLICK_LISTENER", 87, "_lcl");
        zzcP = new zzad("FORM_SUBMIT_LISTENER", 88, "_fsl");
        zzcQ = new zzad("TIMER_LISTENER", 89, "_tl");
        zzcR = new zzad("CLICK_LISTENER", 90, "_cl");
        zzcS = new zzad("JS_ERROR_LISTENER", 91, "_jel");
        zzcT = new zzad("HISTORY_LISTENER", 92, "_hl");
        zzcU = new zzad("AJAX_SUBMIT_LISTENER", 93, "_ajl");
        zzcV = new zzad("YOU_TUBE_LISTENER", 94, "_ytl");
        zzcW = new zzad("ELEMENT_ATTRIBUTE", 95, "_ea");
        zzcX = new zzad("ELEMENT_CONTENT", 96, "_ec");
        zzcY = new zzad("ELEMENT_MOVE", 97, "_em");
        zzcZ = new zzad("ELEMENT_SCRIPT", 98, "_esc");
        zzda = new zzad("ELEMENT_STYLE", 99, "_est");
        zzdb = new zzad("ELEMENT_TEXT_TAG", 100, "_etx");
        zzdc = new zzad("ORDERED_LIST", 101, "_ol");
        zzdd = new zzad("UNIVERSAL_ANALYTICS_EXPERIMENT", 102, "_uae");
        zzde = new zzad("GOOGLE_ANALYTICS_GLOBAL", 103, "_gag");
        zzdf = new zzad("ADOMETRY", 104, "_adm");
        zzdg = new zzad("ADWORDS_APP_USAGE_TRACKING", 105, "_awut");
        zzdh = new zzad("PAGE_REDIRECT", 106, "_pr");
        zzdi = new zzad("APP_VERSION_NAME", 107, "_avn");
        zzdj = (new zzad[] {
            zzbf, zzbg, zzbh, zzbi, zzbj, zzbk, zzbl, zzbm, zzbn, zzbo, 
            zzbp, zzbq, zzbr, zzbs, zzbt, zzbu, zzbv, zzbw, zzbx, zzby, 
            zzbz, zzbA, zzbB, zzbC, zzbD, zzbE, zzbF, zzbG, zzbH, zzbI, 
            zzbJ, zzbK, zzbL, zzbM, zzbN, zzbO, zzbP, zzbQ, zzbR, zzbS, 
            zzbT, zzbU, zzbV, zzbW, zzbX, zzbY, zzbZ, zzca, zzcb, zzcc, 
            zzcd, zzce, zzcf, zzcg, zzch, zzci, zzcj, zzck, zzcl, zzcm, 
            zzcn, zzco, zzcp, zzcq, zzcr, zzcs, zzct, zzcu, zzcv, zzcw, 
            zzcx, zzcy, zzcz, zzcA, zzcB, zzcC, zzcD, zzcE, zzcF, zzcG, 
            zzcH, zzcI, zzcJ, zzcK, zzcL, zzcM, zzcN, zzcO, zzcP, zzcQ, 
            zzcR, zzcS, zzcT, zzcU, zzcV, zzcW, zzcX, zzcY, zzcZ, zzda, 
            zzdb, zzdc, zzdd, zzde, zzdf, zzdg, zzdh, zzdi
        });
    }
}
