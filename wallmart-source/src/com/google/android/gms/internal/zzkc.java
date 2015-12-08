// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class zzkc extends Enum
{

    public static final zzkc zzRZ;
    public static final zzkc zzSA;
    public static final zzkc zzSB;
    public static final zzkc zzSC;
    public static final zzkc zzSD;
    public static final zzkc zzSE;
    public static final zzkc zzSF;
    public static final zzkc zzSG;
    public static final zzkc zzSH;
    public static final zzkc zzSI;
    public static final zzkc zzSJ;
    public static final zzkc zzSK;
    public static final zzkc zzSL;
    public static final zzkc zzSM;
    public static final zzkc zzSN;
    public static final zzkc zzSO;
    public static final zzkc zzSP;
    public static final zzkc zzSQ;
    public static final zzkc zzSR;
    public static final zzkc zzSS;
    public static final zzkc zzST;
    public static final zzkc zzSU;
    private static final zzkc zzSW[];
    public static final zzkc zzSa;
    public static final zzkc zzSb;
    public static final zzkc zzSc;
    public static final zzkc zzSd;
    public static final zzkc zzSe;
    public static final zzkc zzSf;
    public static final zzkc zzSg;
    public static final zzkc zzSh;
    public static final zzkc zzSi;
    public static final zzkc zzSj;
    public static final zzkc zzSk;
    public static final zzkc zzSl;
    public static final zzkc zzSm;
    public static final zzkc zzSn;
    public static final zzkc zzSo;
    public static final zzkc zzSp;
    public static final zzkc zzSq;
    public static final zzkc zzSr;
    public static final zzkc zzSs;
    public static final zzkc zzSt;
    public static final zzkc zzSu;
    public static final zzkc zzSv;
    public static final zzkc zzSw;
    public static final zzkc zzSx;
    public static final zzkc zzSy;
    public static final zzkc zzSz;
    private final String zzSV;

    private zzkc(String s, int i, String s1)
    {
        super(s, i);
        zzSV = s1;
    }

    public static zzkc valueOf(String s)
    {
        return (zzkc)Enum.valueOf(com/google/android/gms/internal/zzkc, s);
    }

    public static zzkc[] values()
    {
        return (zzkc[])zzSW.clone();
    }

    public String zzlL()
    {
        return zzSV;
    }

    static 
    {
        zzRZ = new zzkc("SUCCESS", 0, "Ok");
        zzSa = new zzkc("BAD_AUTHENTICATION", 1, "BadAuthentication");
        zzSb = new zzkc("EMPTY_CONSUMER_PKG_OR_SIG", 2, "EmptyConsumerPackageOrSig");
        zzSc = new zzkc("NEEDS_2F", 3, "InvalidSecondFactor");
        zzSd = new zzkc("NEEDS_POST_SIGN_IN_FLOW", 4, "PostSignInFlowRequired");
        zzSe = new zzkc("NOT_VERIFIED", 5, "NotVerified");
        zzSf = new zzkc("TERMS_NOT_AGREED", 6, "TermsNotAgreed");
        zzSg = new zzkc("UNKNOWN", 7, "Unknown");
        zzSh = new zzkc("UNKNOWN_ERROR", 8, "UNKNOWN_ERR");
        zzSi = new zzkc("ACCOUNT_DELETED", 9, "AccountDeleted");
        zzSj = new zzkc("ACCOUNT_DISABLED", 10, "AccountDisabled");
        zzSk = new zzkc("SERVICE_DISABLED", 11, "ServiceDisabled");
        zzSl = new zzkc("SERVICE_UNAVAILABLE", 12, "ServiceUnavailable");
        zzSm = new zzkc("CAPTCHA", 13, "CaptchaRequired");
        zzSn = new zzkc("NETWORK_ERROR", 14, "NetworkError");
        zzSo = new zzkc("USER_CANCEL", 15, "UserCancel");
        zzSp = new zzkc("PERMISSION_DENIED", 16, "PermissionDenied");
        zzSq = new zzkc("DEVICE_MANAGEMENT_REQUIRED", 17, "DeviceManagementRequiredOrSyncDisabled");
        zzSr = new zzkc("THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED", 18, "ThirdPartyDeviceManagementRequired");
        zzSs = new zzkc("DM_INTERNAL_ERROR", 19, "DeviceManagementInternalError");
        zzSt = new zzkc("DM_SYNC_DISABLED", 20, "DeviceManagementSyncDisabled");
        zzSu = new zzkc("DM_ADMIN_BLOCKED", 21, "DeviceManagementAdminBlocked");
        zzSv = new zzkc("DM_ADMIN_PENDING_APPROVAL", 22, "DeviceManagementAdminPendingApproval");
        zzSw = new zzkc("DM_STALE_SYNC_REQUIRED", 23, "DeviceManagementStaleSyncRequired");
        zzSx = new zzkc("DM_DEACTIVATED", 24, "DeviceManagementDeactivated");
        zzSy = new zzkc("DM_REQUIRED", 25, "DeviceManagementRequired");
        zzSz = new zzkc("CLIENT_LOGIN_DISABLED", 26, "ClientLoginDisabled");
        zzSA = new zzkc("NEED_PERMISSION", 27, "NeedPermission");
        zzSB = new zzkc("BAD_PASSWORD", 28, "WeakPassword");
        zzSC = new zzkc("ALREADY_HAS_GMAIL", 29, "ALREADY_HAS_GMAIL");
        zzSD = new zzkc("BAD_REQUEST", 30, "BadRequest");
        zzSE = new zzkc("BAD_USERNAME", 31, "BadUsername");
        zzSF = new zzkc("LOGIN_FAIL", 32, "LoginFail");
        zzSG = new zzkc("NOT_LOGGED_IN", 33, "NotLoggedIn");
        zzSH = new zzkc("NO_GMAIL", 34, "NoGmail");
        zzSI = new zzkc("REQUEST_DENIED", 35, "RequestDenied");
        zzSJ = new zzkc("SERVER_ERROR", 36, "ServerError");
        zzSK = new zzkc("USERNAME_UNAVAILABLE", 37, "UsernameUnavailable");
        zzSL = new zzkc("DELETED_GMAIL", 38, "DeletedGmail");
        zzSM = new zzkc("SOCKET_TIMEOUT", 39, "SocketTimeout");
        zzSN = new zzkc("EXISTING_USERNAME", 40, "ExistingUsername");
        zzSO = new zzkc("NEEDS_BROWSER", 41, "NeedsBrowser");
        zzSP = new zzkc("GPLUS_OTHER", 42, "GPlusOther");
        zzSQ = new zzkc("GPLUS_NICKNAME", 43, "GPlusNickname");
        zzSR = new zzkc("GPLUS_INVALID_CHAR", 44, "GPlusInvalidChar");
        zzSS = new zzkc("GPLUS_INTERSTITIAL", 45, "GPlusInterstitial");
        zzST = new zzkc("GPLUS_PROFILE_ERROR", 46, "ProfileUpgradeError");
        zzSU = new zzkc("INVALID_SCOPE", 47, "INVALID_SCOPE");
        zzSW = (new zzkc[] {
            zzRZ, zzSa, zzSb, zzSc, zzSd, zzSe, zzSf, zzSg, zzSh, zzSi, 
            zzSj, zzSk, zzSl, zzSm, zzSn, zzSo, zzSp, zzSq, zzSr, zzSs, 
            zzSt, zzSu, zzSv, zzSw, zzSx, zzSy, zzSz, zzSA, zzSB, zzSC, 
            zzSD, zzSE, zzSF, zzSG, zzSH, zzSI, zzSJ, zzSK, zzSL, zzSM, 
            zzSN, zzSO, zzSP, zzSQ, zzSR, zzSS, zzST, zzSU
        });
    }
}
