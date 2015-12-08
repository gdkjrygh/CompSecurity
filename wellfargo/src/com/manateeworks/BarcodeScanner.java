// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.manateeworks;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.RectF;

public class BarcodeScanner
{

    public static final int FOUND_128 = 11;
    public static final int FOUND_25_INTERLEAVED = 15;
    public static final int FOUND_25_STANDARD = 16;
    public static final int FOUND_39 = 2;
    public static final int FOUND_93 = 17;
    public static final int FOUND_AZTEC = 14;
    public static final int FOUND_CODABAR = 18;
    public static final int FOUND_DM = 1;
    public static final int FOUND_EAN_13 = 7;
    public static final int FOUND_EAN_8 = 8;
    public static final int FOUND_NONE = 0;
    public static final int FOUND_PDF = 12;
    public static final int FOUND_QR = 13;
    public static final int FOUND_RSS_14 = 3;
    public static final int FOUND_RSS_14_STACK = 4;
    public static final int FOUND_RSS_EXP = 6;
    public static final int FOUND_RSS_LIM = 5;
    public static final int FOUND_UPC_A = 9;
    public static final int FOUND_UPC_E = 10;
    public static final int MWB_CFG_CODABAR_INCLUDE_STARTSTOP = 1;
    public static final int MWB_CFG_CODE25_REQ_CHKSUM = 1;
    public static final int MWB_CFG_CODE39_DONT_REQUIRE_STOP = 4;
    public static final int MWB_CFG_CODE39_EXTENDED_MODE = 8;
    public static final int MWB_CFG_CODE39_REQUIRE_CHECKSUM = 2;
    public static final int MWB_CFG_CODE93_EXTENDED_MODE = 8;
    public static final int MWB_CFG_GLOBAL_HORIZONTAL_SHARPENING = 1;
    public static final int MWB_CFG_GLOBAL_ROTATE90 = 4;
    public static final int MWB_CFG_GLOBAL_SHARPENING = 3;
    public static final int MWB_CFG_GLOBAL_VERTICAL_SHARPENING = 2;
    public static final int MWB_CODE_MASK_128 = 32;
    public static final int MWB_CODE_MASK_25 = 256;
    public static final int MWB_CODE_MASK_39 = 8;
    public static final int MWB_CODE_MASK_93 = 512;
    public static final int MWB_CODE_MASK_ALL = -1;
    public static final int MWB_CODE_MASK_AZTEC = 128;
    public static final int MWB_CODE_MASK_CODABAR = 1024;
    public static final int MWB_CODE_MASK_DM = 2;
    public static final int MWB_CODE_MASK_EANUPC = 16;
    public static final int MWB_CODE_MASK_NONE = 0;
    public static final int MWB_CODE_MASK_PDF = 64;
    public static final int MWB_CODE_MASK_QR = 1;
    public static final int MWB_CODE_MASK_RSS = 4;
    public static final int MWB_RT_BAD_PARAM = -3;
    public static final int MWB_RT_FAIL = -1;
    public static final int MWB_RT_NOT_SUPPORTED = -2;
    public static final int MWB_RT_OK = 0;
    public static final int MWB_SCANDIRECTION_AUTODETECT = 8;
    public static final int MWB_SCANDIRECTION_HORIZONTAL = 1;
    public static final int MWB_SCANDIRECTION_OMNI = 4;
    public static final int MWB_SCANDIRECTION_VERTICAL = 2;
    public static final int MWB_SUBC_MASK_C25_INTERLEAVED = 1;
    public static final int MWB_SUBC_MASK_C25_STANDARD = 2;
    public static final int MWB_SUBC_MASK_EANUPC_EAN_13 = 1;
    public static final int MWB_SUBC_MASK_EANUPC_EAN_8 = 2;
    public static final int MWB_SUBC_MASK_EANUPC_UPC_A = 4;
    public static final int MWB_SUBC_MASK_EANUPC_UPC_E = 8;
    public static final int MWB_SUBC_MASK_RSS_14 = 1;
    public static final int MWB_SUBC_MASK_RSS_EXP = 8;
    public static final int MWB_SUBC_MASK_RSS_LIM = 4;

    public BarcodeScanner()
    {
    }

    public static native int MWBcleanupLib();

    public static native int MWBgetActiveCodes();

    public static native float[] MWBgetBarcodeLocation();

    public static native int MWBgetDirection();

    public static native int MWBgetLastType();

    public static native int MWBgetLibVersion();

    public static RectF MWBgetScanningRect(int i)
    {
        float af[] = MWBgetScanningRectArray(i);
        return new RectF(af[0], af[1], af[2], af[3]);
    }

    public static native float[] MWBgetScanningRectArray(int i);

    public static native int MWBgetSupportedCodes();

    public static native int MWBinit(Activity activity);

    public static native int MWBregisterCode(int i, String s, String s1);

    public static native byte[] MWBscanGrayscaleImage(byte abyte0[], int i, int j);

    public static native int MWBsetActiveCodes(int i);

    public static native int MWBsetActiveSubcodes(int i, int j);

    public static native int MWBsetDirection(int i);

    public static native int MWBsetFlags(int i, int j);

    public static native int MWBsetLevel(int i);

    public static native int MWBsetScanningRect(int i, float f, float f1, float f2, float f3);

    public static int MWBsetScanningRect(int i, Rect rect)
    {
        return MWBsetScanningRect(i, rect.left, rect.top, rect.width() + rect.left, rect.height() + rect.top);
    }

    public static native int MWBvalidateVIN(byte abyte0[]);

    static 
    {
        System.loadLibrary("BarcodeScannerLib");
    }
}
