// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class zzjr extends Enum
{

    public static final zzjr zzPA;
    public static final zzjr zzPB;
    public static final zzjr zzPC;
    public static final zzjr zzPD;
    public static final zzjr zzPE;
    public static final zzjr zzPF;
    public static final zzjr zzPG;
    public static final zzjr zzPH;
    public static final zzjr zzPI;
    public static final zzjr zzPJ;
    public static final zzjr zzPK;
    public static final zzjr zzPL;
    public static final zzjr zzPM;
    public static final zzjr zzPN;
    public static final zzjr zzPO;
    public static final zzjr zzPP;
    public static final zzjr zzPQ;
    public static final zzjr zzPR;
    public static final zzjr zzPS;
    public static final zzjr zzPT;
    public static final zzjr zzPU;
    public static final zzjr zzPV;
    public static final zzjr zzPW;
    public static final zzjr zzPX;
    public static final zzjr zzPY;
    public static final zzjr zzPZ;
    public static final zzjr zzPx;
    public static final zzjr zzPy;
    public static final zzjr zzPz;
    public static final zzjr zzQa;
    public static final zzjr zzQb;
    public static final zzjr zzQc;
    public static final zzjr zzQd;
    public static final zzjr zzQe;
    public static final zzjr zzQf;
    public static final zzjr zzQg;
    public static final zzjr zzQh;
    public static final zzjr zzQi;
    public static final zzjr zzQj;
    public static final zzjr zzQk;
    public static final zzjr zzQl;
    public static final zzjr zzQm;
    public static final zzjr zzQn;
    public static final zzjr zzQo;
    public static final zzjr zzQp;
    public static final zzjr zzQq;
    public static final zzjr zzQr;
    public static final zzjr zzQs;
    private static final zzjr zzQu[];
    private final String zzQt;

    private zzjr(String s, int i, String s1)
    {
        super(s, i);
        zzQt = s1;
    }

    public static zzjr valueOf(String s)
    {
        return (zzjr)Enum.valueOf(com/google/android/gms/internal/zzjr, s);
    }

    public static zzjr[] values()
    {
        return (zzjr[])zzQu.clone();
    }

    public String zzld()
    {
        return zzQt;
    }

    static 
    {
        zzPx = new zzjr("SUCCESS", 0, "Ok");
        zzPy = new zzjr("BAD_AUTHENTICATION", 1, "BadAuthentication");
        zzPz = new zzjr("EMPTY_CONSUMER_PKG_OR_SIG", 2, "EmptyConsumerPackageOrSig");
        zzPA = new zzjr("NEEDS_2F", 3, "InvalidSecondFactor");
        zzPB = new zzjr("NEEDS_POST_SIGN_IN_FLOW", 4, "PostSignInFlowRequired");
        zzPC = new zzjr("NOT_VERIFIED", 5, "NotVerified");
        zzPD = new zzjr("TERMS_NOT_AGREED", 6, "TermsNotAgreed");
        zzPE = new zzjr("UNKNOWN", 7, "Unknown");
        zzPF = new zzjr("UNKNOWN_ERROR", 8, "UNKNOWN_ERR");
        zzPG = new zzjr("ACCOUNT_DELETED", 9, "AccountDeleted");
        zzPH = new zzjr("ACCOUNT_DISABLED", 10, "AccountDisabled");
        zzPI = new zzjr("SERVICE_DISABLED", 11, "ServiceDisabled");
        zzPJ = new zzjr("SERVICE_UNAVAILABLE", 12, "ServiceUnavailable");
        zzPK = new zzjr("CAPTCHA", 13, "CaptchaRequired");
        zzPL = new zzjr("NETWORK_ERROR", 14, "NetworkError");
        zzPM = new zzjr("USER_CANCEL", 15, "UserCancel");
        zzPN = new zzjr("PERMISSION_DENIED", 16, "PermissionDenied");
        zzPO = new zzjr("DEVICE_MANAGEMENT_REQUIRED", 17, "DeviceManagementRequiredOrSyncDisabled");
        zzPP = new zzjr("THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED", 18, "ThirdPartyDeviceManagementRequired");
        zzPQ = new zzjr("DM_INTERNAL_ERROR", 19, "DeviceManagementInternalError");
        zzPR = new zzjr("DM_SYNC_DISABLED", 20, "DeviceManagementSyncDisabled");
        zzPS = new zzjr("DM_ADMIN_BLOCKED", 21, "DeviceManagementAdminBlocked");
        zzPT = new zzjr("DM_ADMIN_PENDING_APPROVAL", 22, "DeviceManagementAdminPendingApproval");
        zzPU = new zzjr("DM_STALE_SYNC_REQUIRED", 23, "DeviceManagementStaleSyncRequired");
        zzPV = new zzjr("DM_DEACTIVATED", 24, "DeviceManagementDeactivated");
        zzPW = new zzjr("DM_REQUIRED", 25, "DeviceManagementRequired");
        zzPX = new zzjr("CLIENT_LOGIN_DISABLED", 26, "ClientLoginDisabled");
        zzPY = new zzjr("NEED_PERMISSION", 27, "NeedPermission");
        zzPZ = new zzjr("BAD_PASSWORD", 28, "WeakPassword");
        zzQa = new zzjr("ALREADY_HAS_GMAIL", 29, "ALREADY_HAS_GMAIL");
        zzQb = new zzjr("BAD_REQUEST", 30, "BadRequest");
        zzQc = new zzjr("BAD_USERNAME", 31, "BadUsername");
        zzQd = new zzjr("LOGIN_FAIL", 32, "LoginFail");
        zzQe = new zzjr("NOT_LOGGED_IN", 33, "NotLoggedIn");
        zzQf = new zzjr("NO_GMAIL", 34, "NoGmail");
        zzQg = new zzjr("REQUEST_DENIED", 35, "RequestDenied");
        zzQh = new zzjr("SERVER_ERROR", 36, "ServerError");
        zzQi = new zzjr("USERNAME_UNAVAILABLE", 37, "UsernameUnavailable");
        zzQj = new zzjr("DELETED_GMAIL", 38, "DeletedGmail");
        zzQk = new zzjr("SOCKET_TIMEOUT", 39, "SocketTimeout");
        zzQl = new zzjr("EXISTING_USERNAME", 40, "ExistingUsername");
        zzQm = new zzjr("NEEDS_BROWSER", 41, "NeedsBrowser");
        zzQn = new zzjr("GPLUS_OTHER", 42, "GPlusOther");
        zzQo = new zzjr("GPLUS_NICKNAME", 43, "GPlusNickname");
        zzQp = new zzjr("GPLUS_INVALID_CHAR", 44, "GPlusInvalidChar");
        zzQq = new zzjr("GPLUS_INTERSTITIAL", 45, "GPlusInterstitial");
        zzQr = new zzjr("GPLUS_PROFILE_ERROR", 46, "ProfileUpgradeError");
        zzQs = new zzjr("INVALID_SCOPE", 47, "INVALID_SCOPE");
        zzQu = (new zzjr[] {
            zzPx, zzPy, zzPz, zzPA, zzPB, zzPC, zzPD, zzPE, zzPF, zzPG, 
            zzPH, zzPI, zzPJ, zzPK, zzPL, zzPM, zzPN, zzPO, zzPP, zzPQ, 
            zzPR, zzPS, zzPT, zzPU, zzPV, zzPW, zzPX, zzPY, zzPZ, zzQa, 
            zzQb, zzQc, zzQd, zzQe, zzQf, zzQg, zzQh, zzQi, zzQj, zzQk, 
            zzQl, zzQm, zzQn, zzQo, zzQp, zzQq, zzQr, zzQs
        });
    }
}
