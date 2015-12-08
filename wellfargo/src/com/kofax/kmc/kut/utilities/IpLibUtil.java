// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;

public class IpLibUtil
{

    public static final int EVRSJNI_ALLOC_IMAGE_DATA_FAILED = -9998;
    public static final int EVRSJNI_IMAGE_CREATED_IS_NOT_BITONAL = -9900;
    public static final int EVRSJNI_IMAGE_CREATED_IS_NOT_GRAY = -9901;
    public static final int EVRSJNI_INVALID_IPIMAGE_INDEX = -9997;
    public static final int EVRSJNI_NO_FREE_IMAGE_AVAIL = -9999;
    public static final int KIPP_BAD_FILE_FORMAT_INTERNALS = -14;
    public static final int KIPP_BAD_FILE_TO_APPEND_TO = -15;
    public static final int KIPP_BAD_HANDLE = -23;
    public static final int KIPP_BAD_HISTOGRAM = -101;
    public static final int KIPP_BAD_PAPER_SIZE = -103;
    public static final int KIPP_BAD_PDF = -17;
    public static final int KIPP_BAD_POINTER = -102;
    public static final int KIPP_BAD_SPEED_ACCURACY_ERROR = -20;
    public static final int KIPP_BARCODE_DRIVER_FAIL = -104;
    public static final int KIPP_CANNOT_APPEND_TO_FILETYPE = -16;
    public static final int KIPP_ENCRYPTED_APPEND_ERROR = -18;
    public static final int KIPP_FILE_METADATA_ERROR = -22;
    public static final int KIPP_IMAGE_DOES_NOT_EXIST = -13;
    public static final int KIPP_INCONSISTENT_BW_TRANSITIONS_ERROR = -66;
    public static final int KIPP_IP_BAD_CHANNEL_ERROR = -6;
    public static final int KIPP_IP_BAD_DPI_ERROR = -3;
    public static final int KIPP_IP_BAD_EXTERNAL_PAGE = -88;
    public static final int KIPP_IP_BAD_LINEWIDTH_ERROR = -5;
    public static final int KIPP_IP_BAD_WIDTH_HEIGHT_ERROR = -4;
    public static final int KIPP_IP_FILE_OPEN_ERROR = -2;
    public static final int KIPP_IP_FILE_READ_ERROR = -8;
    public static final int KIPP_IP_IMAGE_PARAM_ERROR = -9;
    public static final int KIPP_IP_IMAGE_PROCESSING_ERROR = -10;
    public static final int KIPP_IP_IMAGE_WRITE_ERROR = -11;
    public static final int KIPP_IP_LICENSE_EXPIRATION_ERROR = -1001;
    public static final int KIPP_IP_LICENSING_FAILURE = -1000;
    public static final int KIPP_IP_MEMORY_ALLOC_ERROR = -1;
    public static final int KIPP_IP_MMX_PROCESSING_ERROR = -99;
    public static final int KIPP_IP_SUCCESS = 0;
    public static final int KIPP_METADATA_OVERFLOW = -7;
    public static final int KIPP_PDF_TOO_LARGE_TO_APPEND = -19;
    public static final int KIPP_READING_USER_NETWORK_ERROR = -21;
    public static final int KIPP_UNKNOWN_FILETYPE = -12;
    public static final int KIPP_USER_ABORT = -1005;
    public static IpErrHashMap ipErrHashMap;

    private IpLibUtil()
    {
    }

    static int a(String s)
    {
        return nativeInit(s);
    }

    public static String getKippVersion()
    {
        return nativeGetVersion();
    }

    public static boolean isIpLicensed()
    {
        return nativeIsLicensed() == 0;
    }

    private static native String nativeGetVersion();

    private static native int nativeInit(String s);

    private static native int nativeIsLicensed();

    static 
    {
        ipErrHashMap = new IpErrHashMap(ErrorInfo.KMC_GN_UNKNOWN_ERROR);
        System.loadLibrary("AtalaBar");
        System.loadLibrary("EvrsJniWrapper");
        ipErrHashMap.put(Integer.valueOf(0), ErrorInfo.KMC_SUCCESS);
        ipErrHashMap.put(Integer.valueOf(-1), ErrorInfo.KMC_EV_MEMORY);
        ipErrHashMap.put(Integer.valueOf(-2), ErrorInfo.KMC_EV_FILEOPEN);
        ipErrHashMap.put(Integer.valueOf(-3), ErrorInfo.KMC_EV_BAD_DPI);
        ipErrHashMap.put(Integer.valueOf(-4), ErrorInfo.KMC_EV_BAD_WIDTH_HEIGHT);
        ipErrHashMap.put(Integer.valueOf(-5), ErrorInfo.KMC_EV_BAD_LINEWIDTH);
        ipErrHashMap.put(Integer.valueOf(-6), ErrorInfo.KMC_EV_BAD_CHANNEL);
        ipErrHashMap.put(Integer.valueOf(-7), ErrorInfo.KMC_EV_METADATA_OVERFLOW);
        ipErrHashMap.put(Integer.valueOf(-8), ErrorInfo.KMC_EV_FILE_READ_FAILED);
        ipErrHashMap.put(Integer.valueOf(-9), ErrorInfo.KMC_EV_IMAGE_PARM);
        ipErrHashMap.put(Integer.valueOf(-10), ErrorInfo.KMC_EV_IMAGE_PROCESSING);
        ipErrHashMap.put(Integer.valueOf(-11), ErrorInfo.KMC_EV_IMAGE_WRITE_FAILED);
        ipErrHashMap.put(Integer.valueOf(-12), ErrorInfo.KMC_EV_UNKNOWN_FILETYPE);
        ipErrHashMap.put(Integer.valueOf(-13), ErrorInfo.KMC_EV_NONEXISTANT_IMAGE);
        ipErrHashMap.put(Integer.valueOf(-14), ErrorInfo.KMC_EV_BAD_FILE_FORMAT);
        ipErrHashMap.put(Integer.valueOf(-15), ErrorInfo.KMC_EV_APPEND_TO_FILE);
        ipErrHashMap.put(Integer.valueOf(-16), ErrorInfo.KMC_EV_CANNOT_APPEND);
        ipErrHashMap.put(Integer.valueOf(-17), ErrorInfo.KMC_EV_PDF_BAD);
        ipErrHashMap.put(Integer.valueOf(-18), ErrorInfo.KMC_EV_APPEND_ENCRYPTED);
        ipErrHashMap.put(Integer.valueOf(-19), ErrorInfo.KMC_EV_PDF_TOO_LARGE);
        ipErrHashMap.put(Integer.valueOf(-20), ErrorInfo.KMC_EV_SPEED_ACCURACY);
        ipErrHashMap.put(Integer.valueOf(-21), ErrorInfo.KMC_EV_NETWORK_READ);
        ipErrHashMap.put(Integer.valueOf(-22), ErrorInfo.KMC_EV_FILE_METADATA);
        ipErrHashMap.put(Integer.valueOf(-23), ErrorInfo.KMC_EV_INVALID_HANDLE);
        ipErrHashMap.put(Integer.valueOf(-66), ErrorInfo.KMC_SUCCESS);
        ipErrHashMap.put(Integer.valueOf(-88), ErrorInfo.KMC_EV_EXTERNAL_PAGE);
        ipErrHashMap.put(Integer.valueOf(-99), ErrorInfo.KMC_EV_MMX_PROCESSING);
        ipErrHashMap.put(Integer.valueOf(-101), ErrorInfo.KMC_EV_HISTOGRAM);
        ipErrHashMap.put(Integer.valueOf(-102), ErrorInfo.KMC_EV_INVALID_POINTER);
        ipErrHashMap.put(Integer.valueOf(-103), ErrorInfo.KMC_EV_PAPER_SIZE);
        ipErrHashMap.put(Integer.valueOf(-104), ErrorInfo.KMC_EV_BARCODE_DRIVER);
        ipErrHashMap.put(Integer.valueOf(-1000), ErrorInfo.KMC_EV_LICENSING);
        ipErrHashMap.put(Integer.valueOf(-1001), ErrorInfo.KMC_EV_LICENSE_EXPIRED);
        ipErrHashMap.put(Integer.valueOf(-1005), ErrorInfo.KMC_EV_CANCEL_OPERATION_SUCCESS);
    }

    private class IpErrHashMap extends HashMap
    {

        private static final long serialVersionUID = 0xdb0b67a42d2495f9L;
        protected Object defaultValue;

        public Object get(Object obj)
        {
            Object obj2 = super.get(obj);
            Object obj1 = obj2;
            if (obj2 == null)
            {
                obj1 = obj2;
                if (!containsKey(obj))
                {
                    obj1 = defaultValue;
                }
            }
            return obj1;
        }

        public IpErrHashMap(Object obj)
        {
            defaultValue = obj;
        }
    }

}
