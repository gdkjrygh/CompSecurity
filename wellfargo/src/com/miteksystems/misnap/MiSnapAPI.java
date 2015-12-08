// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.content.Context;
import android.content.Intent;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.miteksystems.misnap:
//            q

public class MiSnapAPI
{

    public static final String AllowVideoFrames = "AllowVideoFrames";
    public static final String AnimatedBug = "AnimatedBug";
    public static final String AnimationRectangleColor = "AnimationRectangleColor";
    public static final String AnimationRectangleCornerRadius = "AnimationRectangleCornerRadius";
    public static final String AnimationRectangleStrokeWidth = "AnimationRectangleStrokeWidth";
    public static final String AutoCaptureFailoverToStillCapture = "AutoCaptureFailoverToStillCapture";
    public static final String AutoTorchAppearanceDelay = "AutoTorchAppearanceDelay";
    public static final String AutoTorchLowLightMinimum = "AutoTorchLowLightMinimum";
    public static final String ButtonFirstTimeTutorialContinue = "ButtonFirstTimeTutorialContinue";
    public static final String ButtonManualHelpCancel = "ButtonManualHelpCancel";
    public static final String ButtonManualHelpContinue = "ButtonManualHelpContinue";
    public static final String ButtonTransitionTutorialCancel = "ButtonTransitionTutorialCancel";
    public static final String ButtonTransitionTutorialContinue = "ButtonTransitionTutorialContinue";
    public static final String ButtonVideoHelpCancel = "ButtonVideoHelpCancel";
    public static final String ButtonVideoHelpContinue = "ButtonVideoHelpContinue";
    public static final String ButtonVideoTutorialCancel = "ButtonVideoTutorialCancel";
    public static final String ButtonVideoTutorialContinue = "ButtonVideoTutorialContinue";
    public static final String CameraAutoCaptureProcess = "CameraAutoCaptureProcess";
    public static final String CameraBrightness = "CameraBrightness";
    public static final String CameraDegreesThreshold = "CameraDegreesThreshold";
    public static final String CameraFlash = "CameraFlash";
    public static final String CameraGForce = "CameraGForce";
    public static final String CameraGlare = "CameraGlare";
    public static final String CameraGuideImageAppearanceFillPercentage = "CameraGuideImageAppearanceFillPercentage";
    public static final String CameraGuideImageEnabled = "CameraGuideImageEnabled";
    public static final String CameraGuideImageReappearanceDelay = "CameraGuideImageReappearanceDelay";
    public static final String CameraGuideImageStillCameraAlpha = "CameraGuideImageStillCameraAlpha";
    public static final String CameraGuideImageStillCameraEnabled = "CameraGuideImageStillCameraEnabled";
    public static final String CameraInitialTimeoutInSeconds = "CameraInitialTimeoutInSeconds";
    public static final String CameraMaxTimeouts = "CameraMaxTimeouts";
    public static final String CameraMillisecondsDelay = "CameraMillisecondsDelay";
    public static final String CameraSharpness = "CameraSharpness";
    public static final String CameraTimeoutInSeconds = "CameraTimeoutInSeconds";
    public static final String CameraVideoAutoCaptureProcess = "CameraVideoAutoCaptureProcess";
    public static final String CameraViewfinderBoundingBox = "CameraViewfinderBoundingBox";
    public static final String CameraViewfinderBoundingBoxMaxDimension = "CameraViewfinderBoundingBoxMaxDimension";
    public static final String CameraViewfinderBoundingBoxMinDimension = "CameraViewfinderBoundingBoxMinDimension";
    public static final String CameraViewfinderMinFill = "CameraViewfinderMinFill";
    public static final String CameraViewfinderMinHorizontalFill = "CameraViewfinderMinHorizontalFill";
    public static final String CameraVignetteImageEnabled = "CameraVignetteImageEnabled";
    public static final String CameraVignetteImageManualModeEnabled = "CameraVignetteImageManualModeEnabled";
    public static final String CaptureAngle = "CaptureAngle";
    public static final String CaptureBrightness = "CaptureBrightness";
    public static final String CaptureGForce = "CaptureGForce";
    public static final String CaptureGlare = "CaptureGlare";
    public static final String CaptureMode = "CaptureMode";
    public static final String CaptureSharpness = "CaptureSharpness";
    public static final String ConsecutiveVideoFrames = "ConsecutiveVideoFrames";
    public static final String DeviceID = "DeviceID";
    public static final String FEATURE_MINIMUM_AUTO_CAPTURE_CAPABILITY = "com.miteksystems.misnap.FEATURE_MINIMUM_AUTO_CAPTURE_CAPABILITY";
    public static final String JOB_SETTINGS = "com.miteksystems.misnap.JobSettings";
    public static final String LightingStillCamera = "LightingStillCamera";
    public static final String LightingVideo = "LightingVideo";
    public static final String MIBI_DATA_VERSION = "1.2";
    public static final String MIPVersion = "MIPVersion";
    public static final String MiSnapLocale = "Locale";
    public static final String MiSnapLockView = "MiSnapLockView";
    public static final String MiSnapTutorialAcknowledgementEnabled = "MiSnapTutorialAcknowledgementEnabled";
    public static final String Name = "Name";
    public static final String RESULT_CAMERA_NOT_SUFFICIENT = "CameraNotSufficient";
    public static final String RESULT_CANCELED = "Cancelled";
    public static final String RESULT_CODE = "com.miteksystems.misnap.ResultCode";
    public static final String RESULT_IMAGE_QUALITY = "com.miteksystems.misnap.QUALITY";
    public static final String RESULT_METRICS = "ResultMetrics";
    public static final String RESULT_MIBI_DATA = "com.miteksystems.misnap.MIBI_DATA";
    public static final String RESULT_ORIGINAL_PIC_HEIGHT = "com.miteksystems.misnap.HEIGHT";
    public static final String RESULT_ORIGINAL_PIC_WIDTH = "com.miteksystems.misnap.WIDTH";
    public static final int RESULT_PICTURE_CODE = 3;
    public static final String RESULT_PICTURE_DATA = "com.miteksystems.misnap.PICTURE";
    public static final int RESULT_RETAKE = 2;
    public static final String RESULT_SUCCESS_STILL = "SuccessStillCamera";
    public static final String RESULT_SUCCESS_VIDEO = "SuccessVideo";
    public static final String RESULT_VIDEO_CAPTURE_FAILED = "VideoCaptureFailed";
    public static final String RequiredCompressionLevel = "RequiredCompressionLevel";
    public static final String RequiredMaxImageHeightAndWidth = "RequiredMaxImageHeightAndWidth";
    public static final String ScreenRotationSuspendTime = "ScreenRotationSuspendTime";
    public static final String ShortDescription = "ShortDescription";
    public static final String SmartBubbleApparanceDelay = "SmartBubbleApparanceDelay";
    public static final String SmartBubbleCumulativeErrorThreshold = "SmartBubbleCumulativeErrorThreshold";
    public static final String SmartBubbleEnabled = "SmartBubbleEnabled";
    public static final String SpokenGhostImageMessage = "SpokenGhostImageMessage";
    public static final String SpokenHelpFailoverMessage = "SpokenHelpFailoverMessage";
    public static final String SpokenHelpManualMessage = "SpokenHelpManualMessage";
    public static final String SpokenHelpMessage = "SpokenHelpMessage";
    public static final String SpokenTutorialMessage = "SpokenTutorialMessage";
    public static final int THEME_MANUAL = 0;
    public static final int THEME_MISNAP = 1;
    public static final String TextCheckBackPrompt = "TextCheckBackPrompt";
    public static final String TextCheckFrontPrompt = "TextCheckFrontPrompt";
    public static final String TutorialBackgroundColor = "TutorialBackgroundColor";
    public static final String TutorialBackgroundColorFailoverToStillCamera = "TutorialBackgroundColorFailoverToStillCamera";
    public static final String TutorialBackgroundColorFirstTimeUser = "TutorialBackgroundColorFirstTimeUser";
    public static final String TutorialBackgroundColorStillCamera = "TutorialBackgroundColorStillCamera";
    public static final String TutorialBackgroundColorStillCameraFirstTimeUser = "TutorialBackgroundColorStillCameraFirstTimeUser";
    public static final String TutorialBrandNewUserDuration = "TutorialBrandNewUserDuration";
    public static final String UnnecessaryScreenTouchLimit = "UnnecessaryScreenTouchLimit";
    public static final String UseNewestFeatures = "UseNewestFeatures";
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private int R;
    private int S;
    private int T;
    private boolean U;
    private int V;
    private int W;
    private int X;
    private boolean Y;
    private int Z;
    boolean a;
    private int aA;
    private int aB;
    private int aC;
    private int aD;
    private int aE;
    private int aa;
    private boolean ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private int aj;
    private int ak;
    private int al;
    private boolean am;
    private String an;
    private String ao;
    private String ap;
    private String aq;
    private String ar;
    private String as;
    private String at;
    private String au;
    private String av;
    private String aw;
    private String ax;
    private String ay;
    private int az;
    int b;
    String c;
    public final String d;
    String e;
    private JSONObject f;
    private String g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private String m;
    private String n;
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private boolean w;
    private int x;
    private double y;
    private int z;

    MiSnapAPI(Intent intent)
    {
        JSONObject jsonobject;
        boolean flag;
        g = "";
        h = 0;
        i = 0;
        j = 0;
        k = 0;
        l = 0;
        m = "";
        n = "UNIQUE";
        String s1;
        int i1;
        int j1;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        o = 0;
        p = o;
        q = 0;
        r = 0;
        s = true;
        t = false;
        u = true;
        v = 3;
        w = true;
        x = 2;
        y = 0.0833565263748169D;
        z = 350;
        b = 1;
        A = 1400;
        B = 0;
        C = -1;
        D = 1;
        E = 1;
        F = 1250;
        G = 1600;
        H = 50;
        I = 150;
        J = 400;
        K = 700;
        L = 600;
        M = 0;
        N = 333;
        O = 650;
        P = 0;
        c = "";
        d = "MDVersion";
        e = "";
        Q = true;
        R = 20;
        S = 16;
        T = 0xed1c24;
        U = true;
        V = 600;
        W = 5000;
        X = 50;
        Y = true;
        Z = 5000;
        aa = 600;
        ab = true;
        ac = 3000;
        ad = 1;
        ae = 30;
        af = 20;
        ag = 7500;
        ah = 0xe1e1e2;
        ai = 0xe1e1e2;
        aj = 0xe1e1e2;
        ak = 0xe1e1e2;
        al = 0xe1e1e2;
        am = true;
        an = "MiSnapLocalizedTextCheckBackPrompt";
        ao = "MiSnapLocalizedTextCheckFrontPrompt";
        ap = null;
        aq = "MiSnapButtonVideoHelpCancel";
        ar = "MiSnapLocalizedButtonVideoHelpContinue";
        as = "MiSnapLocalizedButtonVideoTutorialCancel";
        at = "MiSnapLocalizedButtonVideoTutorialContinue";
        au = "";
        av = "MiSnapLocalizedButtonTransitionTutorialContinue";
        aw = "MiSnapButtonManualHelpCancel";
        ax = "MiSnapLocalizedButtonManualHelpContinue";
        ay = "MiSnapLocalizedButtonVideoHelpContinue";
        az = 1;
        aA = 1500;
        aB = 4;
        aC = 1;
        aD = 1;
        aE = 0;
        s1 = "";
        if (intent != null)
        {
            s1 = intent.getStringExtra("com.miteksystems.misnap.JobSettings");
        }
        intent = s1;
        if (s1 == null)
        {
            intent = "";
        }
        jsonobject = new JSONObject(intent);
        f = jsonobject;
        if (jsonobject.has("Name"))
        {
            g = jsonobject.getString("Name");
        }
        if (!jsonobject.has("AnimatedBug"))
        {
            break MISSING_BLOCK_LABEL_602;
        }
        if (jsonobject.getInt("AnimatedBug") != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Q = flag;
        if (jsonobject.has("AnimationRectangleStrokeWidth"))
        {
            R = jsonobject.getInt("AnimationRectangleStrokeWidth");
        }
        if (jsonobject.has("AnimationRectangleCornerRadius"))
        {
            S = jsonobject.getInt("AnimationRectangleCornerRadius");
        }
        if (!jsonobject.has("AnimationRectangleColor"))
        {
            break MISSING_BLOCK_LABEL_684;
        }
        s1 = jsonobject.getString("AnimationRectangleColor");
        intent = s1;
        if (s1.startsWith("0x"))
        {
            intent = s1.substring(2);
        }
        T = Integer.parseInt(intent, 16);
        if (jsonobject.has("MIPVersion"))
        {
            c = jsonobject.getString("MIPVersion");
        }
        if (jsonobject.has("MDVersion"))
        {
            e = jsonobject.getString("MDVersion");
        }
        if (!jsonobject.has("AllowVideoFrames") || 1 != jsonobject.getInt("AllowVideoFrames"))
        {
            break MISSING_BLOCK_LABEL_788;
        }
        if (!g.equals("CheckFront") && !g.equals("CheckBack") && !a(c))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        t = flag;
        if (!jsonobject.has("CameraVideoAutoCaptureProcess") || android.os.Build.VERSION.SDK_INT < 14)
        {
            break MISSING_BLOCK_LABEL_823;
        }
        if (jsonobject.getInt("CameraVideoAutoCaptureProcess") != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        if (jsonobject.has("CaptureMode")) goto _L2; else goto _L1
_L1:
        if (t) goto _L4; else goto _L3
_L3:
        u = false;
_L31:
        if (!u) goto _L6; else goto _L5
_L5:
        if (jsonobject.has("ConsecutiveVideoFrames"))
        {
            v = jsonobject.getInt("ConsecutiveVideoFrames");
        }
        if (!jsonobject.has("AutoCaptureFailoverToStillCapture")) goto _L8; else goto _L7
_L7:
        if (jsonobject.getInt("AutoCaptureFailoverToStillCapture") != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = flag;
_L8:
        if (!jsonobject.has("CameraAutoCaptureProcess")) goto _L10; else goto _L9
_L9:
        if (jsonobject.getInt("CameraAutoCaptureProcess") != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        w = flag;
_L10:
        if (jsonobject.has("CameraMillisecondsDelay"))
        {
            z = jsonobject.getInt("CameraMillisecondsDelay");
        }
_L6:
        x = 0;
        i1 = -1;
        if (jsonobject.has("LightingVideo"))
        {
            i1 = jsonobject.getInt("LightingVideo");
        }
        if (-1 != i1)
        {
            break MISSING_BLOCK_LABEL_1000;
        }
        if (!jsonobject.has("CameraFlash"))
        {
            break MISSING_BLOCK_LABEL_1000;
        }
        j1 = jsonobject.getInt("CameraFlash");
        if (j1 != 0)
        {
            i1 = j1;
        }
        if (-1 == i1)
        {
            break MISSING_BLOCK_LABEL_1012;
        }
        D = i1;
        i1 = -1;
        if (jsonobject.has("LightingStillCamera"))
        {
            i1 = jsonobject.getInt("LightingStillCamera");
        }
        if (-1 != i1)
        {
            break MISSING_BLOCK_LABEL_1064;
        }
        if (!jsonobject.has("CameraFlash"))
        {
            break MISSING_BLOCK_LABEL_1064;
        }
        j1 = jsonobject.getInt("CameraFlash");
        if (j1 != 0)
        {
            i1 = j1;
        }
        if (-1 == i1)
        {
            break MISSING_BLOCK_LABEL_1076;
        }
        E = i1;
        if (jsonobject.has("RequiredMaxImageHeightAndWidth"))
        {
            G = jsonobject.getInt("RequiredMaxImageHeightAndWidth");
        }
        if (jsonobject.has("SpokenTutorialMessage"))
        {
            h = jsonobject.getInt("SpokenTutorialMessage");
        }
        if (jsonobject.has("SpokenHelpMessage"))
        {
            j = jsonobject.getInt("SpokenHelpMessage");
        }
        if (jsonobject.has("SpokenHelpFailoverMessage"))
        {
            i = jsonobject.getInt("SpokenHelpFailoverMessage");
        }
        if (jsonobject.has("SpokenHelpManualMessage"))
        {
            k = jsonobject.getInt("SpokenHelpManualMessage");
        }
        if (jsonobject.has("SpokenGhostImageMessage"))
        {
            l = jsonobject.getInt("SpokenGhostImageMessage");
        }
        if (jsonobject.has("CameraViewfinderBoundingBoxMaxDimension"))
        {
            A = jsonobject.getInt("CameraViewfinderBoundingBoxMaxDimension");
        }
        if (jsonobject.has("CameraViewfinderBoundingBoxMinDimension"))
        {
            B = jsonobject.getInt("CameraViewfinderBoundingBoxMinDimension");
        }
        if (jsonobject.has("CameraViewfinderBoundingBox"))
        {
            b = jsonobject.getInt("CameraViewfinderBoundingBox");
        }
        if (jsonobject.has("RequiredCompressionLevel"))
        {
            H = jsonobject.getInt("RequiredCompressionLevel");
        }
        if (jsonobject.has("CameraDegreesThreshold"))
        {
            I = jsonobject.getInt("CameraDegreesThreshold");
        }
        if (jsonobject.has("CameraViewfinderMinFill"))
        {
            N = jsonobject.getInt("CameraViewfinderMinFill");
        }
        if (jsonobject.has("CameraViewfinderMinHorizontalFill"))
        {
            O = jsonobject.getInt("CameraViewfinderMinHorizontalFill");
        }
        if (jsonobject.has("MitekReserved"))
        {
            p = jsonobject.getInt("MitekReserved");
        }
        if (jsonobject.has("CameraMaxTimeouts"))
        {
            q = jsonobject.getInt("CameraMaxTimeouts");
        }
        if (jsonobject.has("MiSnapLockView"))
        {
            r = jsonobject.getInt("MiSnapLockView");
        }
        if (jsonobject.has("CameraBrightness"))
        {
            J = jsonobject.getInt("CameraBrightness");
        }
        if (jsonobject.has("CameraGlare"))
        {
            M = jsonobject.getInt("CameraGlare");
        }
        if (!jsonobject.has("CameraSharpness")) goto _L12; else goto _L11
_L11:
        L = jsonobject.getInt("CameraSharpness");
_L36:
        if (jsonobject.has("DeviceID"))
        {
            n = jsonobject.getString("DeviceID");
        }
        if (!jsonobject.has("CameraGuideImageEnabled")) goto _L14; else goto _L13
_L13:
        if (jsonobject.getInt("CameraGuideImageEnabled") != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        U = flag;
_L14:
        if (jsonobject.has("CameraGuideImageAppearanceFillPercentage"))
        {
            V = jsonobject.getInt("CameraGuideImageAppearanceFillPercentage");
        }
        if (jsonobject.has("CameraGuideImageReappearanceDelay"))
        {
            W = jsonobject.getInt("CameraGuideImageReappearanceDelay");
        }
        if (jsonobject.has("CameraGuideImageStillCameraAlpha"))
        {
            X = jsonobject.getInt("CameraGuideImageStillCameraAlpha");
        }
        if (!jsonobject.has("CameraGuideImageStillCameraEnabled")) goto _L16; else goto _L15
_L15:
        if (jsonobject.getInt("CameraGuideImageStillCameraEnabled") != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Y = flag;
_L16:
        if (jsonobject.has("AutoTorchAppearanceDelay"))
        {
            Z = jsonobject.getInt("AutoTorchAppearanceDelay");
        }
        if (jsonobject.has("AutoTorchLowLightMinimum"))
        {
            aa = jsonobject.getInt("AutoTorchLowLightMinimum");
        }
        if (jsonobject.has("LightChangeDelay"))
        {
            F = jsonobject.getInt("LightChangeDelay");
        }
        if (!jsonobject.has("SmartBubbleEnabled")) goto _L18; else goto _L17
_L17:
        if (jsonobject.getInt("SmartBubbleEnabled") != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ab = flag;
_L18:
        if (jsonobject.has("SmartBubbleApparanceDelay"))
        {
            ac = jsonobject.getInt("SmartBubbleApparanceDelay");
        }
        if (jsonobject.has("SmartBubbleCumulativeErrorThreshold"))
        {
            ad = jsonobject.getInt("SmartBubbleCumulativeErrorThreshold");
        }
        if (jsonobject.has("CameraTimeoutInSeconds"))
        {
            ae = jsonobject.getInt("CameraTimeoutInSeconds");
        }
        if (jsonobject.has("CameraInitialTimeoutInSeconds"))
        {
            af = jsonobject.getInt("CameraInitialTimeoutInSeconds");
        }
        if (jsonobject.has("TutorialBrandNewUserDuration"))
        {
            ag = jsonobject.getInt("TutorialBrandNewUserDuration");
        }
        if (!jsonobject.has("TutorialBackgroundColor")) goto _L20; else goto _L19
_L19:
        s1 = jsonobject.getString("TutorialBackgroundColor");
        intent = s1;
        if (s1.startsWith("0x"))
        {
            intent = s1.substring(2);
        }
        ah = Integer.parseInt(intent, 16);
_L20:
        if (!jsonobject.has("TutorialBackgroundColorFirstTimeUser")) goto _L22; else goto _L21
_L21:
        s1 = jsonobject.getString("TutorialBackgroundColorFirstTimeUser");
        intent = s1;
        if (s1.startsWith("0x"))
        {
            intent = s1.substring(2);
        }
        ai = Integer.parseInt(intent, 16);
_L22:
        if (!jsonobject.has("TutorialBackgroundColorFailoverToStillCamera")) goto _L24; else goto _L23
_L23:
        s1 = jsonobject.getString("TutorialBackgroundColorFailoverToStillCamera");
        intent = s1;
        if (s1.startsWith("0x"))
        {
            intent = s1.substring(2);
        }
        aj = Integer.parseInt(intent, 16);
_L24:
        if (!jsonobject.has("TutorialBackgroundColorStillCamera")) goto _L26; else goto _L25
_L25:
        s1 = jsonobject.getString("TutorialBackgroundColorStillCamera");
        intent = s1;
        if (s1.startsWith("0x"))
        {
            intent = s1.substring(2);
        }
        ak = Integer.parseInt(intent, 16);
_L26:
        if (!jsonobject.has("TutorialBackgroundColorStillCameraFirstTimeUser")) goto _L28; else goto _L27
_L27:
        s1 = jsonobject.getString("TutorialBackgroundColorStillCameraFirstTimeUser");
        intent = s1;
        if (s1.startsWith("0x"))
        {
            intent = s1.substring(2);
        }
        al = Integer.parseInt(intent, 16);
_L28:
        if (jsonobject.has("ScreenRotationSuspendTime"))
        {
            aA = jsonobject.getInt("ScreenRotationSuspendTime");
        }
        if (jsonobject.has("UnnecessaryScreenTouchLimit"))
        {
            aB = jsonobject.getInt("UnnecessaryScreenTouchLimit");
        }
        if (jsonobject.has("Locale"))
        {
            ap = jsonobject.getString("Locale");
        }
        if (jsonobject.has("TextCheckFrontPrompt"))
        {
            ao = jsonobject.getString("TextCheckFrontPrompt");
        }
        if (jsonobject.has("TextCheckBackPrompt"))
        {
            an = jsonobject.getString("TextCheckBackPrompt");
        }
        if (jsonobject.has("ButtonVideoHelpCancel"))
        {
            aq = jsonobject.getString("ButtonVideoHelpCancel");
        }
        if (jsonobject.has("ButtonVideoHelpContinue"))
        {
            ar = jsonobject.getString("ButtonVideoHelpContinue");
        }
        if (jsonobject.has("ButtonVideoTutorialCancel"))
        {
            as = jsonobject.getString("ButtonVideoTutorialCancel");
        }
        if (jsonobject.has("ButtonVideoTutorialContinue"))
        {
            at = jsonobject.getString("ButtonVideoTutorialContinue");
        }
        if (jsonobject.has("ButtonTransitionTutorialCancel"))
        {
            au = jsonobject.getString("ButtonTransitionTutorialCancel");
        }
        if (jsonobject.has("ButtonTransitionTutorialContinue"))
        {
            av = jsonobject.getString("ButtonTransitionTutorialContinue");
        }
        if (jsonobject.has("ButtonManualHelpCancel"))
        {
            aw = jsonobject.getString("ButtonManualHelpCancel");
        }
        if (jsonobject.has("ButtonManualHelpContinue"))
        {
            ax = jsonobject.getString("ButtonManualHelpContinue");
        }
        if (jsonobject.has("ButtonFirstTimeTutorialContinue"))
        {
            ay = jsonobject.getString("ButtonFirstTimeTutorialContinue");
        }
        if (jsonobject.has("MiSnapTutorialAcknowledgementEnabled"))
        {
            az = jsonobject.getInt("MiSnapTutorialAcknowledgementEnabled");
        }
        if (jsonobject.has("UseNewestFeatures"))
        {
            aE = jsonobject.getInt("UseNewestFeatures");
        }
        aE = a(aE, 0, 1, 0);
        aC = a(jsonobject, "CameraVignetteImageEnabled");
        aD = a(jsonobject, "CameraVignetteImageManualModeEnabled");
        if (jsonobject.has("TEST_MODE"))
        {
            q.a = jsonobject.getBoolean("TEST_MODE");
        }
        if (jsonobject.has("SHOW_LIGHT"))
        {
            q.d = jsonobject.getBoolean("SHOW_LIGHT");
        }
        if (jsonobject.has("SHOW_FILL"))
        {
            q.e = jsonobject.getBoolean("SHOW_FILL");
        }
        if (jsonobject.has("SHOW_HORIZ_FILL"))
        {
            q.f = jsonobject.getBoolean("SHOW_HORIZ_FILL");
        }
        if (jsonobject.has("SHOW_FPS"))
        {
            q.d = jsonobject.getBoolean("SHOW_FPS");
        }
        if (jsonobject.has("RESET_NEW_USER"))
        {
            q.g = jsonobject.getBoolean("RESET_NEW_USER");
        }
_L44:
        if (q < 0)
        {
            q = 0;
        }
        if (r < 0 || r > 1)
        {
            r = 0;
        }
        b = a(b, 0, 3, 1);
        if (b == 0)
        {
            a = false;
            x = 0;
        }
        if (!a)
        {
            b = 0;
            x = 0;
        }
        if (x == 0)
        {
            y = 0.0D;
        } else
        {
            y = (((double)x * 0.14999999999999999D + 0.55000000000000004D) * 9.8066501617431641D) / 100D;
        }
        v = a(v, 1, 5, 3);
        x = a(x, 0, 1000, 2);
        p = a(p, 0, 1000, o);
        C = a(C, 0, 2, -1);
        G = a(G, 300, 5500, 1600);
        A = a(A, 300, 5500, 1400);
        B = a(B, 300, 5500, 0);
        H = a(H, 0, 100, 50);
        I = a(I, 2, 1000, 150);
        N = a(N, 200, 1000, 333);
        J = J * 1;
        J = a(J, 0, 1000, 400);
        K = K * 1;
        K = a(K, 0, 1000, 700);
        M = a(M, 0, 1000, 0);
        L = a(L, 0, 1000, 600);
        az = a(az, 0, 1, 0);
        D = a(D, 0, 3, 1);
        E = a(E, 0, 3, 1);
        V = a(V, 333, 1000, 600);
        W = a(W, 3000, 15000, 5000);
        X = a(X, 30, 100, 50);
        Z = a(Z, 3000, 10000, 5000);
        aa = a(aa, 100, 1000, 600);
        F = a(F, 500, 2000, 1250);
        ac = a(ac, 1000, 10000, 3000);
        ad = a(ad, 1, 20, 1);
        af = a(af, 15, 90, 20);
        ae = a(ae, af, 90, 30);
        O = a(O, 500, 1000, 650);
        R = a(R, 0, 100, 20);
        S = a(S, 1, 100, 16);
        ag = a(ag, 3000, 10000, 7500);
        aA = a(aA, 500, 2500, 1500);
        aB = a(aB, 2, 9, 4);
        if (40 < ao.length())
        {
            ao = ao.substring(0, 40);
        }
        if (40 < an.length())
        {
            an = an.substring(0, 40);
        }
        if (20 < aq.length() && !aq.equals("MiSnapButtonVideoHelpCancel"))
        {
            aq = aq.substring(0, 20);
        }
        if (20 < ar.length() && !ar.equals("MiSnapLocalizedButtonVideoHelpContinue"))
        {
            ar = ar.substring(0, 20);
        }
        if (20 < as.length() && !as.equals("MiSnapLocalizedButtonVideoTutorialCancel"))
        {
            as = as.substring(0, 20);
        }
        if (20 < at.length() && !at.equals("MiSnapLocalizedButtonVideoTutorialContinue"))
        {
            at = at.substring(0, 20);
        }
        if (20 < au.length() && !au.equals(""))
        {
            au = au.substring(0, 20);
        }
        if (20 < av.length() && !av.equals("MiSnapLocalizedButtonTransitionTutorialContinue"))
        {
            av = av.substring(0, 20);
        }
        if (20 < aw.length() && !aw.equals("MiSnapButtonManualHelpCancel"))
        {
            aw = aw.substring(0, 20);
        }
        if (20 < ax.length() && !ax.equals("MiSnapLocalizedButtonManualHelpContinue"))
        {
            ax = ax.substring(0, 20);
        }
        if (20 < ay.length() && !ay.equals("MiSnapLocalizedButtonVideoHelpContinue"))
        {
            ay = ay.substring(0, 20);
        }
        return;
_L4:
        if (!t || a) goto _L30; else goto _L29
_L29:
        u = false;
          goto _L31
_L30:
        if (!t || !a) goto _L31; else goto _L32
_L32:
        u = true;
          goto _L31
_L2:
        if (!jsonobject.getString("CaptureMode").equals("1"))
        {
            break MISSING_BLOCK_LABEL_3631;
        }
        u = false;
_L33:
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            u = false;
        }
          goto _L31
        u = true;
          goto _L33
_L12:
        intent = g.toLowerCase(Locale.US);
        if (!intent.startsWith("checkfront") && !intent.startsWith("ach")) goto _L35; else goto _L34
_L34:
        L = 600;
_L37:
        if (android.os.Build.VERSION.SDK_INT > 9)
        {
            break MISSING_BLOCK_LABEL_3791;
        }
        L = (int)((double)L * 0.40000000000000002D);
          goto _L36
_L35:
label0:
        {
            if (!intent.startsWith("checkback"))
            {
                break label0;
            }
            L = 100;
        }
          goto _L37
label1:
        {
            if (!intent.startsWith("auto"))
            {
                break label1;
            }
            L = 750;
        }
          goto _L37
        if (!intent.startsWith("remit") && !intent.startsWith("w2")) goto _L39; else goto _L38
_L38:
        L = 850;
          goto _L37
_L39:
        if (!intent.contains("license")) goto _L37; else goto _L40
_L40:
        L = 500;
          goto _L37
label2:
        {
            if (android.os.Build.VERSION.SDK_INT > 10)
            {
                break label2;
            }
            L = (int)((double)L * 0.5D);
        }
          goto _L36
        if (android.os.Build.VERSION.SDK_INT >= 11) goto _L42; else goto _L41
_L41:
        L = (int)((double)L * 0.59999999999999998D);
          goto _L36
_L42:
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L36; else goto _L43
_L43:
        L = (int)((double)L * 0.80000000000000004D);
          goto _L36
        intent;
          goto _L44
    }

    private static int a(int i1, int j1, int k1, int l1)
    {
label0:
        {
            if (i1 >= j1)
            {
                j1 = i1;
                if (i1 <= k1)
                {
                    break label0;
                }
            }
            j1 = l1;
        }
        return j1;
    }

    private int a(JSONObject jsonobject, String s1)
    {
        int i1 = 1;
        int j1;
        if (jsonobject.has(s1))
        {
            return jsonobject.getInt(s1);
        }
        j1 = aE;
        if (1 != j1)
        {
            return 0;
        }
        break MISSING_BLOCK_LABEL_33;
        jsonobject;
        i1 = 0;
        return i1;
    }

    private static boolean a(String s1)
    {
        if (s1 != null && s1.length() != 0)
        {
            if ((s1 = s1.split("\\.")).length > 1)
            {
                int i1;
                int j1;
                try
                {
                    i1 = Integer.parseInt(s1[0]);
                    j1 = Integer.parseInt(s1[1]);
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    return false;
                }
                if (2 < i1 || 2 == i1 && j1 > 0)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isFeatureSupported(String s1)
    {
        return "com.miteksystems.misnap.FEATURE_MINIMUM_AUTO_CAPTURE_CAPABILITY".equals(s1);
    }

    public static String miSnapBuildVersion(Context context)
    {
        return context.getString(R.string.misnap_buildnumber);
    }

    public static String miSnapVersion(Context context)
    {
        return context.getString(R.string.misnap_versionName);
    }

    final int A()
    {
        return W;
    }

    final boolean B()
    {
        return Y;
    }

    final int C()
    {
        return (int)((double)X * 0.01D * 255D);
    }

    final int D()
    {
        return Z;
    }

    final int E()
    {
        return aa;
    }

    final int F()
    {
        return D;
    }

    final int G()
    {
        return E;
    }

    final int H()
    {
        return F;
    }

    final boolean I()
    {
        return ab;
    }

    final int J()
    {
        return ac;
    }

    final int K()
    {
        return ad;
    }

    final int L()
    {
        return af;
    }

    final int M()
    {
        return ag;
    }

    final boolean N()
    {
        return am;
    }

    final int O()
    {
        return aB;
    }

    final int P()
    {
        return h;
    }

    final int Q()
    {
        return j;
    }

    final int R()
    {
        return i;
    }

    final int S()
    {
        return k;
    }

    final int T()
    {
        return l;
    }

    final int U()
    {
        return ah;
    }

    final int V()
    {
        return ai;
    }

    final int W()
    {
        return aj;
    }

    final int X()
    {
        return ak;
    }

    final String Y()
    {
        return an;
    }

    final String Z()
    {
        return ao;
    }

    final void a()
    {
        u = false;
    }

    final boolean aA()
    {
        return g != null && (g.startsWith("Check") || g.startsWith("ACH"));
    }

    final JSONObject aB()
    {
        return f;
    }

    final String aa()
    {
        return aq;
    }

    final String ab()
    {
        return ar;
    }

    final String ac()
    {
        return as;
    }

    final String ad()
    {
        return at;
    }

    final String ae()
    {
        return au;
    }

    final String af()
    {
        return av;
    }

    final String ag()
    {
        return aw;
    }

    final String ah()
    {
        return ax;
    }

    final String ai()
    {
        return ay;
    }

    final int aj()
    {
        return az;
    }

    final boolean ak()
    {
        return ao.equals("MiSnapLocalizedTextCheckFrontPrompt");
    }

    final boolean al()
    {
        return an.equals("MiSnapLocalizedTextCheckBackPrompt");
    }

    final boolean am()
    {
        return aq.equals("MiSnapButtonVideoHelpCancel") || aq.trim().equals("");
    }

    final boolean an()
    {
        return ar.equals("MiSnapLocalizedButtonVideoHelpContinue") || ar.trim().equals("");
    }

    final boolean ao()
    {
        return aq.trim().equals("");
    }

    final boolean ap()
    {
        return as.equals("MiSnapLocalizedButtonVideoTutorialCancel") || as.trim().equals("");
    }

    final boolean aq()
    {
        return at.equals("MiSnapLocalizedButtonVideoTutorialContinue") || at.trim().equals("");
    }

    final boolean ar()
    {
        return as.trim().equals("");
    }

    final boolean as()
    {
        return av.equals("MiSnapLocalizedButtonTransitionTutorialContinue") || av.trim().equals("");
    }

    final boolean at()
    {
        return ay.equals("MiSnapLocalizedButtonVideoHelpContinue") || ay.trim().equals("");
    }

    final boolean au()
    {
        return au.trim().equals("");
    }

    final boolean av()
    {
        return aw.equals("MiSnapButtonManualHelpCancel") || aw.trim().equals("");
    }

    final boolean aw()
    {
        return ax.equals("MiSnapLocalizedButtonManualHelpContinue") || ax.trim().equals("");
    }

    final boolean ax()
    {
        return aw.trim().equals("");
    }

    final boolean ay()
    {
        return g != null && g.startsWith("CheckFront");
    }

    final boolean az()
    {
        return g != null && g.startsWith("CheckBack");
    }

    final boolean b()
    {
        return u;
    }

    final boolean c()
    {
        return s;
    }

    final int d()
    {
        return v;
    }

    final int e()
    {
        return G;
    }

    final int f()
    {
        return H;
    }

    final int g()
    {
        return J;
    }

    final int h()
    {
        return L;
    }

    final int i()
    {
        return I;
    }

    final int j()
    {
        return N;
    }

    final int k()
    {
        return ae;
    }

    final int l()
    {
        return q;
    }

    final int m()
    {
        return p;
    }

    final String n()
    {
        return g;
    }

    final boolean o()
    {
        return Q;
    }

    final int p()
    {
        return R;
    }

    final int q()
    {
        return S;
    }

    final int r()
    {
        return T;
    }

    final int s()
    {
        return O;
    }

    final int t()
    {
        return r;
    }

    final boolean u()
    {
        return aC != 0;
    }

    final boolean v()
    {
        return aD != 0;
    }

    final int w()
    {
        return aA;
    }

    final String x()
    {
        return ap;
    }

    final boolean y()
    {
        return U;
    }

    final int z()
    {
        return V;
    }
}
