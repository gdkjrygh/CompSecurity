// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.android.abc.machine_vision;

import android.graphics.Bitmap;
import java.util.Vector;

public class DocumentTracker
{

    public boolean ReuseLastMicrInformation;
    public boolean RunBoundaryDetectionBasedOnMicr;
    public boolean RunLocalMicrSearch;
    public boolean RunMicrDetection;
    public boolean RunMicrDirectionDetection;
    public boolean RunMicrEdgeDetection;
    public boolean RunMicrRecognition;
    public boolean ShowClassification;
    public boolean ShowFourCorners;
    public boolean ShowGlare;
    public boolean ShowIntermediateImage;
    private long m_frame;
    private long m_impl;

    public DocumentTracker()
    {
        m_impl = nativeCreate();
    }

    public static String getVersion()
    {
        return nativeGetVersion();
    }

    private native void nativeAdornFrame();

    private native void nativeConfigure(String s, String s1);

    private native void nativeConfigureFromString(String s, String s1);

    private native long nativeCreate();

    private native void nativeDispose();

    private native Vector nativeGetActiveTrackedDocuments();

    private native Bitmap nativeGetProcessedImage();

    private static native String nativeGetVersion();

    private native void nativeGrabImageFrame(Bitmap bitmap);

    private native void nativeGrabVideoFrame(byte abyte0[], int i, int j);

    private native void nativeProcessFrame();

    private native void nativeReleaseFrame();

    private native void nativeReset();

    private native void nativeStartup();

    private static native boolean nativeStaticInitializer();

    public void adornFrame()
    {
        nativeAdornFrame();
    }

    public void dispose()
    {
        nativeDispose();
        m_impl = 0L;
    }

    public Vector getActiveTrackedDocuments()
    {
        return nativeGetActiveTrackedDocuments();
    }

    public Bitmap getProcessedImage()
    {
        return nativeGetProcessedImage();
    }

    public long getPtr()
    {
        return m_impl;
    }

    public void grabImageFrame(Bitmap bitmap)
    {
        nativeGrabImageFrame(bitmap);
    }

    public void grabVideoFrame(byte abyte0[], int i, int j, int k)
    {
        if (i != 17)
        {
            throw new RuntimeException("DocumentTracker.grabVideoFrame: Invalid image format (must be NV21)");
        } else
        {
            nativeGrabVideoFrame(abyte0, j, k);
            return;
        }
    }

    public void loadConfigurationFile(String s, String s1)
    {
        nativeConfigure(s, s1);
    }

    public void loadConfigurationString(String s, String s1)
    {
        nativeConfigureFromString(s, s1);
    }

    public void processFrame()
    {
        nativeProcessFrame();
    }

    public void releaseFrame()
    {
        nativeReleaseFrame();
    }

    public void reset()
    {
        nativeReset();
    }

    public void startup()
    {
        nativeStartup();
    }

    static 
    {
        if (!nativeStaticInitializer())
        {
            throw new RuntimeException("com.kofax.android.abc.machine_vision.DocumentTracker: Static initializer failed.");
        }
    }
}
