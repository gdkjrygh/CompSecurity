// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.graphics.Point;
import android.view.SurfaceHolder;
import java.util.concurrent.locks.Lock;

public interface ICameraSource
{

    public abstract void addCallbackBuffer(byte abyte0[]);

    public abstract void autoFocus(AutoFocusCallback autofocuscallback);

    public abstract void cancelAutoFocus();

    public abstract void close();

    public abstract int getOrientation();

    public abstract Parameters getParameters();

    public abstract boolean isCameraOpen();

    public abstract boolean isFrontFacing();

    public abstract android.hardware.Camera.Size makeSize(Point point);

    public abstract void open();

    public abstract void setAutoFocusMoveCallback(AutoFocusMoveCallback autofocusmovecallback);

    public abstract void setDisplayOrientation(int i);

    public abstract void setErrorCallback(ErrorCallback errorcallback);

    public abstract void setParameters(Parameters parameters);

    public abstract void setPreviewCallback(PreviewCallback previewcallback);

    public abstract void setPreviewCallbackWithBuffer(PreviewCallback previewcallback, Lock lock);

    public abstract void setPreviewDisplay(SurfaceHolder surfaceholder);

    public abstract void startPreview();

    public abstract void stopPreview();

    public abstract void takePicture(ShutterCallback shuttercallback, PictureCallback picturecallback);
}
