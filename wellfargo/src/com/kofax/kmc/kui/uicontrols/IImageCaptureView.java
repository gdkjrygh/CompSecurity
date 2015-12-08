// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.graphics.Rect;
import com.kofax.kmc.kui.uicontrols.data.Flash;
import com.kofax.kmc.kui.uicontrols.data.GpsUsageLimits;
import com.kofax.kmc.kui.uicontrols.data.ImageCaptureFrame;
import com.kofax.kmc.kui.uicontrols.data.PageDetectMode;
import java.util.List;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            CameraInitializationListener, LevelnessListener, AutoFocusResultListener, ImageCapturedListener, 
//            PageDetectionListener, PreviewCallbackListener, StabilityDelayListener

public interface IImageCaptureView
{

    public abstract void addCameraInitializationListener(CameraInitializationListener camerainitializationlistener);

    public abstract void addLevelnessListener(LevelnessListener levelnesslistener);

    public abstract void addOnAutoFocusResultListener(AutoFocusResultListener autofocusresultlistener);

    public abstract void addOnImageCapturedListener(ImageCapturedListener imagecapturedlistener);

    public abstract void addPageDetectionListener(PageDetectionListener pagedetectionlistener);

    public abstract void addPreviewCallbackListener(PreviewCallbackListener previewcallbacklistener);

    public abstract void addStabilityDelayListener(StabilityDelayListener stabilitydelaylistener);

    public abstract void doContinuousMode(boolean flag);

    public abstract void forceTakePicture();

    public abstract List getAllowableResolutions();

    public abstract int getDeviceDeclinationPitch();

    public abstract int getDeviceDeclinationRoll();

    public abstract Flash getFlash();

    public abstract Rect getFocusArea();

    public abstract List getFocusAreas();

    public abstract GpsUsageLimits getGpsUsage();

    public abstract ImageCaptureFrame getImageCaptureFrame();

    public abstract int getImagePreviewHeight();

    public abstract int getImagePreviewWidth();

    public abstract int getIndicatorColorFocusing();

    public abstract int getIndicatorColorGood();

    public abstract int getIndicatorColorNotLevel();

    public abstract int getIndicatorColorNotStable();

    public abstract boolean getLevelIndicator();

    public abstract int getLevelThresholdPitch();

    public abstract int getLevelThresholdRoll();

    public abstract int getMaxFocusAreas();

    public abstract int getPageAreaForDetection();

    public abstract boolean getPageDetect();

    public abstract PageDetectMode getPageDetectMode();

    public abstract int getStabilityDelay();

    public abstract boolean getUseVideoFrame();

    public abstract void removeCameraInitializationListener(CameraInitializationListener camerainitializationlistener);

    public abstract void removeLevelnessListener(LevelnessListener levelnesslistener);

    public abstract void removeOnAutoFocusResultListener(AutoFocusResultListener autofocusresultlistener);

    public abstract void removeOnImageCapturedListener(ImageCapturedListener imagecapturedlistener);

    public abstract void removePageDetectionListener(PageDetectionListener pagedetectionlistener);

    public abstract void removePreviewCallbackListener(PreviewCallbackListener previewcallbacklistener);

    public abstract void removeStabilityDelayListener(StabilityDelayListener stabilitydelaylistener);

    public abstract void returnCameraEvents(boolean flag);

    public abstract void sessionCreate();

    public abstract void sessionDismiss();

    public abstract void setDeviceDeclinationPitch(int i);

    public abstract void setDeviceDeclinationRoll(int i);

    public abstract void setFlash(Flash flash);

    public abstract void setFocusArea(Rect rect);

    public abstract void setFocusAreas(List list);

    public abstract void setGpsUsage(GpsUsageLimits gpsusagelimits);

    public abstract void setImageCaptureFrame(ImageCaptureFrame imagecaptureframe);

    public abstract void setImageResolution(android.hardware.Camera.Size size);

    public abstract void setIndicatorColorFocusing(int i);

    public abstract void setIndicatorColorGood(int i);

    public abstract void setIndicatorColorNotLevel(int i);

    public abstract void setIndicatorColorNotStable(int i);

    public abstract void setLevelIndicator(boolean flag);

    public abstract void setLevelThresholdPitch(int i);

    public abstract void setLevelThresholdRoll(int i);

    public abstract void setPageAreaForDetection(int i);

    public abstract void setPageDetect(boolean flag);

    public abstract void setPageDetectMode(PageDetectMode pagedetectmode);

    public abstract void setStabilityDelay(int i);

    public abstract void setUseVideoFrame(boolean flag);

    public abstract void takePicture();

    public abstract void takePictureForCaptureExperience();
}
