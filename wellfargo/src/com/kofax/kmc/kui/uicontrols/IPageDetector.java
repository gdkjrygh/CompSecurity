// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.graphics.Bitmap;
import java.util.Vector;

public interface IPageDetector
{

    public abstract boolean doPageDetect(Bitmap bitmap);

    public abstract boolean doPageDetect(byte abyte0[], int i, int j, int k);

    public abstract Vector getDocumentBounds();

    public abstract Bitmap getProcessedImage();

    public abstract void setPageAreaForDetection(int i);
}
