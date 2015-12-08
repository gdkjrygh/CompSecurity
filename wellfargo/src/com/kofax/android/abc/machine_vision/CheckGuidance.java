// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.android.abc.machine_vision;

import android.graphics.Rect;
import java.util.Vector;

// Referenced classes of package com.kofax.android.abc.machine_vision:
//            TrackedDocument

public class CheckGuidance
{

    protected long m_docPointer;
    protected long m_impl;

    public CheckGuidance(TrackedDocument trackeddocument)
    {
        m_docPointer = trackeddocument.m_impl;
        m_impl = nativeCreate();
    }

    private native void nativeAreEdgesInView(boolean aflag[], int i, int j, int k);

    private native long nativeCreate();

    private native Vector nativeGetBestRectangle();

    private native double nativeGetHorizontalMovementGuidance(int i, int j, int k, int l, double d, int i1);

    private native double nativeGetTurnGuidance(double d, int i);

    private native double nativeGetVerticalMovementGuidance(int i, int j, int k, int l, double d, int i1);

    private native double nativeGetZoomGuidance(int i, int j, int k, int l, double d, double d1, int i1);

    private native boolean nativeIsAreaGood(int i, int j, double d, double d1, int k);

    private native boolean nativeIsAspectRatioWithinLimits(double d, double d1, int i);

    private native boolean nativeIsEdgeSupportGood();

    private native boolean nativeIsInternalContrastGood();

    private native boolean nativeIsTargetRectangleBottomEdgeFilled(int i, int j, int k, int l, double d, double d1, int i1);

    private native boolean nativeIsTargetRectangleFilled(int i, int j, int k, int l, double d, double d1, int i1);

    private static native boolean nativeStaticInitializer();

    public boolean[] areEdgesInView(GuidanceSource guidancesource, int i, int j)
    {
        boolean aflag[] = new boolean[5];
        nativeAreEdgesInView(aflag, i, j, guidancesource.value());
        return aflag;
    }

    public Vector getBestRectangle()
    {
        return nativeGetBestRectangle();
    }

    public double getHorizontalMovementGuidance(GuidanceSource guidancesource, Rect rect, double d)
    {
        return nativeGetHorizontalMovementGuidance(rect.left, rect.top, rect.width(), rect.height(), d, guidancesource.value());
    }

    public double getTurnGuidance(GuidanceSource guidancesource, double d)
    {
        return nativeGetTurnGuidance(d, guidancesource.value());
    }

    public double getVerticalMovementGuidance(GuidanceSource guidancesource, Rect rect, double d)
    {
        return nativeGetVerticalMovementGuidance(rect.left, rect.top, rect.width(), rect.height(), d, guidancesource.value());
    }

    public double getZoomGuidance(GuidanceSource guidancesource, Rect rect, double d, double d1)
    {
        return nativeGetZoomGuidance(rect.left, rect.top, rect.width(), rect.height(), d, d1, guidancesource.value());
    }

    public boolean isAreaGood(GuidanceSource guidancesource, int i, int j, double d, double d1)
    {
        return nativeIsAreaGood(i, j, d, d1, guidancesource.value());
    }

    public boolean isAspectRatioWithinLimits(GuidanceSource guidancesource, double d, double d1)
    {
        return nativeIsAspectRatioWithinLimits(d, d1, guidancesource.value());
    }

    public boolean isEdgeSupportGood()
    {
        return nativeIsEdgeSupportGood();
    }

    public boolean isInternalContrastGood()
    {
        return nativeIsInternalContrastGood();
    }

    public boolean isTargetRectangleBottomEdgeFilled(GuidanceSource guidancesource, Rect rect, double d, double d1)
    {
        return nativeIsTargetRectangleBottomEdgeFilled(rect.left, rect.top, rect.width(), rect.height(), d, d1, guidancesource.value());
    }

    public boolean isTargetRectangleFilled(GuidanceSource guidancesource, Rect rect, double d, double d1)
    {
        return nativeIsTargetRectangleFilled(rect.left, rect.top, rect.width(), rect.height(), d, d1, guidancesource.value());
    }

    static 
    {
        if (!nativeStaticInitializer())
        {
            throw new RuntimeException("com.kofax.android.abc.machine_vision.CheckGuidance: Static initializer failed.");
        }
    }

    private class GuidanceSource extends Enum
    {

        private static final GuidanceSource $VALUES[];
        public static final GuidanceSource BEST_RECTANGLE;
        public static final GuidanceSource MICR;
        private int m_value;

        public static GuidanceSource valueOf(String s)
        {
            return (GuidanceSource)Enum.valueOf(com/kofax/android/abc/machine_vision/CheckGuidance$GuidanceSource, s);
        }

        public static GuidanceSource[] values()
        {
            return (GuidanceSource[])$VALUES.clone();
        }

        public int value()
        {
            return m_value;
        }

        static 
        {
            MICR = new GuidanceSource("MICR", 0, 0);
            BEST_RECTANGLE = new GuidanceSource("BEST_RECTANGLE", 1, 1);
            $VALUES = (new GuidanceSource[] {
                MICR, BEST_RECTANGLE
            });
        }

        private GuidanceSource(String s, int i, int j)
        {
            super(s, i);
            m_value = j;
        }
    }

}
