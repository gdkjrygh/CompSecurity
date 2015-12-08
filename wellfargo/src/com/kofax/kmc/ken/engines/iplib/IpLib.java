// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.iplib;

import android.graphics.Bitmap;
import com.kofax.kmc.kut.utilities.IpLibUtil;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;

// Referenced classes of package com.kofax.kmc.ken.engines.iplib:
//            IpImage, ProcessPageResults, IpFileBuffer, ProcessPageOutRep, 
//            IpImageMetadata

public class IpLib
{

    public static final String DO_90_DEGREE_ROTATION = "_Do90DegreeRotation_";
    public static final String DO_BACKGROUND_SMOOTHING = "_DoBackgroundSmoothing_";
    public static final String DO_BARCODE_DETECTION = "_DoBarcodeDetection_";
    public static final String DO_BINARIZATION = "_DoBinarization_";
    public static final String DO_BLANK_PAGE_DETECTION = "_DoBlankPageDetection_";
    public static final String DO_BLUR_AND_ILLUMINATION_CHECK = "_DoBlurAndIlluminationCheck_";
    public static final String DO_COLOR_DETECTION = "_DoColorDetection_";
    public static final String DO_CONTOUR_CLEANING = "_DoContourCleaning_";
    public static final String DO_CROP_CORRECTION = "_DoCropCorrection_";
    public static final String DO_DESPECK = "_DoDespeck_";
    public static final String DO_EDGE_CLEANUP = "_DoEdgeCleanup_";
    public static final String DO_ENHANCED_BINARIZATION = "_DoEnhancedBinarization_";
    public static final String DO_FIND_TEXT_LINES = "_DoFindTextLines_";
    public static final String DO_GRAY_OUTPUT = "_DoGrayOutput_";
    public static final String DO_HEALTH_ANALYSIS = "_DoHealthAnalysis_";
    public static final String DO_HOLE_FILL = "_DoHoleFill_";
    public static final String DO_ILLUMINATION_CORRECTION = "_DoIlluminationCorrection_";
    public static final String DO_MERGE_FRONT_BACK = "_DoMergeFrontBack_";
    public static final String DO_PREVIEW = "_DoPreview_";
    public static final String DO_RECOGNIZE_TEXT_MP = "_DoRecognizeTextMP_";
    public static final String DO_RECTANGULARIZATION = "_DoRectangularization_";
    public static final String DO_RECTANGULARIZATION_DETECTION = "_DoRectangularizationDetection_";
    public static final String DO_SCALE_IMAGE_TO_DPI = "_DoScaleImageToDPI_";
    public static final String DO_SCANNER_BKG_FILL = "_DoScannerBkgFill_";
    public static final String DO_SHARPEN = "_DoSharpen_";
    public static final String DO_SKEW_CORRECTION_ALT = "_DoSkewCorrectionAlt_";
    public static final String DO_SKEW_CORRECTION_PAGE = "_DoSkewCorrectionPage_";
    private static IpLib instance = null;
    protected int mInitResult;

    protected IpLib()
    {
    }

    public static IpLib getInstance()
    {
        com/kofax/kmc/ken/engines/iplib/IpLib;
        JVM INSTR monitorenter ;
        IpLib iplib;
        if (instance == null)
        {
            if (!IpLibUtil.isIpLicensed())
            {
                break MISSING_BLOCK_LABEL_34;
            }
            instance = new IpLib();
        }
        iplib = instance;
        com/kofax/kmc/ken/engines/iplib/IpLib;
        JVM INSTR monitorexit ;
        return iplib;
        throw new KmcException(ErrorInfo.KMC_EV_LICENSING);
        Exception exception;
        exception;
        com/kofax/kmc/ken/engines/iplib/IpLib;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void resetSingleton()
    {
        com/kofax/kmc/ken/engines/iplib/IpLib;
        JVM INSTR monitorenter ;
        instance = null;
        com/kofax/kmc/ken/engines/iplib/IpLib;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public int cancelProcessing()
    {
        return nativeCancelProcessing();
    }

    public Bitmap createBitmap(IpImage ipimage)
    {
        Bitmap bitmap = Bitmap.createBitmap(ipimage.mWidth, ipimage.mHeight, android.graphics.Bitmap.Config.ARGB_8888);
        nativeFillBitmap(bitmap, ipimage);
        bitmap.setDensity(ipimage.getDpiX());
        return bitmap;
    }

    public int createImage(IpImage ipimage, Bitmap bitmap, int i, int j, int k, int l)
    {
        ipimage.mChannels = i;
        ipimage.mBitDepth = j;
        ipimage.mDpiX = k;
        ipimage.mDpiY = l;
        return nativeCreateImage(ipimage, bitmap);
    }

    public int createImageRaw(IpImage ipimage, byte abyte0[], int i, int j, int k, int l, int i1, 
            int j1)
    {
        ipimage.mChannels = i;
        ipimage.mBitDepth = j;
        ipimage.mDpiX = i1;
        ipimage.mDpiY = j1;
        return nativeCreateImageFromRaw(ipimage, abyte0, k, l);
    }

    public String getIpVersion()
    {
        return nativeGetVersion();
    }

    protected int init(String s)
    {
        return nativeInit(s);
    }

    public int initImage(IpImage ipimage)
    {
        return nativeInitImage(ipimage);
    }

    public native int nativeCancelProcessing();

    public native int nativeCreateImage(IpImage ipimage, Bitmap bitmap);

    public native int nativeCreateImageFromRaw(IpImage ipimage, byte abyte0[], int i, int j);

    public native int nativeFillBitmap(Bitmap bitmap, IpImage ipimage);

    public native String nativeGetVersion();

    public native int nativeInit(String s);

    public native int nativeInitImage(IpImage ipimage);

    public native int nativeProcessPage(ProcessPageResults processpageresults, IpImage ipimage, String s, ProcessPageOutRep processpageoutrep, int i, ProcessingProgressClient processingprogressclient, Object obj);

    public native int nativeReadImageFile(IpImage ipimage, String s, float f, IpImageMetadata ipimagemetadata);

    public native int nativeReadImageFromFileBuffer(IpImage ipimage, float f, IpFileBuffer ipfilebuffer);

    public native int nativeReleaseFileBuffer(IpFileBuffer ipfilebuffer);

    public native void nativeReleaseImage(IpImage ipimage);

    public native void nativeSetOutputFilePath(String s);

    public native void nativeShutdown();

    public native int nativeWriteImageToFileBuffer(IpImage ipimage, IpFileBuffer ipfilebuffer);

    public native int nativeWriteJpegImage(IpImage ipimage, int i, String s);

    public native int nativeWriteJpegImageWithMetaData(IpImage ipimage, int i, String s, String s1);

    public native int nativeWritePngImage(IpImage ipimage, String s);

    public native int nativeWriteTiffImage(IpImage ipimage, int i, String s);

    public int processPage(ProcessPageResults processpageresults, IpImage ipimage, String s, ProcessPageOutRep processpageoutrep, int i)
    {
        return processPage(processpageresults, ipimage, s, processpageoutrep, i, null, null);
    }

    public int processPage(ProcessPageResults processpageresults, IpImage ipimage, String s, ProcessPageOutRep processpageoutrep, int i, ProcessingProgressClient processingprogressclient)
    {
        return processPage(processpageresults, ipimage, s, processpageoutrep, i, processingprogressclient, null);
    }

    public int processPage(ProcessPageResults processpageresults, IpImage ipimage, String s, ProcessPageOutRep processpageoutrep, int i, ProcessingProgressClient processingprogressclient, Object obj)
    {
        if (processpageresults.processedImg.mJniImageHandle == -1)
        {
            nativeInitImage(processpageresults.processedImg);
        }
        return nativeProcessPage(processpageresults, ipimage, s, processpageoutrep, i, processingprogressclient, obj);
    }

    public int readImageFile(IpImage ipimage, String s, float f, IpImageMetadata ipimagemetadata)
    {
        return nativeReadImageFile(ipimage, s, f, ipimagemetadata);
    }

    public int readImageFromFileBuffer(IpImage ipimage, float f, IpFileBuffer ipfilebuffer)
    {
        return nativeReadImageFromFileBuffer(ipimage, f, ipfilebuffer);
    }

    public int releaseFileBuffer(IpFileBuffer ipfilebuffer)
    {
        return nativeReleaseFileBuffer(ipfilebuffer);
    }

    public void releaseImage(IpImage ipimage)
    {
        nativeReleaseImage(ipimage);
    }

    public int retrieveFileBufferBytes(IpFileBuffer ipfilebuffer)
    {
        return 0;
    }

    public void setOutputFilePath(String s)
    {
        nativeSetOutputFilePath(s);
    }

    public void shutdown()
    {
        nativeShutdown();
    }

    public int writeImageToFileBuffer(IpImage ipimage, IpFileBuffer ipfilebuffer)
    {
        ipfilebuffer.mHeight = ipimage.getHeight();
        ipfilebuffer.mWidth = ipimage.getWidth();
        return nativeWriteImageToFileBuffer(ipimage, ipfilebuffer);
    }

    public int writeJpegImage(IpImage ipimage, int i, String s)
    {
        return nativeWriteJpegImage(ipimage, i, s);
    }

    public int writeJpegImage(IpImage ipimage, int i, String s, String s1)
    {
        return nativeWriteJpegImageWithMetaData(ipimage, i, s, s1);
    }

    public int writePngImage(IpImage ipimage, String s)
    {
        return nativeWritePngImage(ipimage, s);
    }

    public int writeTiffImage(IpImage ipimage, int i, String s)
    {
        return nativeWriteTiffImage(ipimage, i, s);
    }

    static 
    {
        System.loadLibrary("AtalaBar");
        System.loadLibrary("EvrsJniWrapper");
    }
}
