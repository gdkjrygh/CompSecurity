// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.graphics.Point;
import com.kofax.kmc.kui.uicontrols.data.Flash;
import java.util.List;

public interface 
{

    public abstract Flash getFlashMode();

    public abstract List getFocusAreas();

    public abstract  getFocusMode();

    public abstract int getMaxNumFocusAreas();

    public abstract int getPictureFormat();

    public abstract Point getPictureSize();

    public abstract int getPreviewFormat();

    public abstract Point getPreviewSize();

    public abstract List getSupportedFlashModes();

    public abstract List getSupportedFocusModes();

    public abstract List getSupportedPictureSizes();

    public abstract List getSupportedPreviewSizes();

    public abstract void setFlashMode(Flash flash);

    public abstract void setFocusAreas(List list);

    public abstract void setFocusMode( );

    public abstract void setPictureSize(Point point);

    public abstract void setPreviewSize(Point point);
}
