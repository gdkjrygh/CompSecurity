// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import com.kofax.android.abc.machine_vision.CheckGuidance;
import com.kofax.android.abc.machine_vision.DocumentTracker;
import com.kofax.android.abc.machine_vision.TrackedCheckInformation;
import com.kofax.android.abc.machine_vision.TrackedDocument;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.ken.engines.data.CheckDetectionResult;
import com.kofax.kmc.ken.engines.data.CheckDetectionSettings;
import com.kofax.kmc.ken.engines.data.CheckSide;
import com.kofax.kmc.ken.engines.data.HorizontalGuidance;
import com.kofax.kmc.ken.engines.data.TurnGuidance;
import com.kofax.kmc.ken.engines.data.VerticalGuidance;
import com.kofax.kmc.ken.engines.data.ZoomGuidance;
import com.kofax.kmc.kut.utilities.RectUtil;
import java.util.Vector;

// Referenced classes of package com.kofax.kmc.ken.engines:
//            ICheckDetector

class a
    implements ICheckDetector
{

    private final DocumentTracker a = new DocumentTracker();
    private final Rect b = new Rect();
    private Rect c;
    private CheckSide d;

    public a()
    {
        c = new Rect();
        d = CheckSide.NONE;
    }

    private Rect a(CheckDetectionSettings checkdetectionsettings, int i, int j)
    {
        double d3 = checkdetectionsettings.getTargetFramePaddingPercent();
        double d2 = checkdetectionsettings.getTargetFrameAspectRatio();
        double d1 = d2;
        if (d2 < 1.0D)
        {
            d1 = 1.0D / d2;
        }
        checkdetectionsettings = new Rect(0, 0, i, j);
        Point point = new Point((int)Math.round((double)i / 2D), (int)Math.round((double)j / 2D));
        RectUtil.fit(checkdetectionsettings, b, point, d3, d1);
        return b;
    }

    private String a(int i, float f, float f1, CheckSide checkside, Rect rect)
    {
        rect = "no";
        if (checkside == CheckSide.FRONT)
        {
            rect = "yes";
        }
        return String.format("<?xml version='1.0' encoding='iso-8859-1'?><Configuration name='Cadence'>  <Section name='Connection'>    <Parm name='ServiceUrl' type='string' value='http://63.110.241.90:50001/'/>    <Parm name='Configuration' type='string' value='MobileBlackBox'/>    <Parm name='Username' type='string' value='jamtrup'/>    <Parm name='Password' type='string' value='jamtrup'/>    <Parm name='BusinessProcess' type='string' value='InsuranceClaim'/>  </Section>  <Section name='DocumentDetection'>    <Section name='Tracker'>      <Parm name='DocumentType' type='string' value='%s'/>      <Parm name='MaxNumberOfDocuments' type='int' value='1'/>      <Parm name='FramesHistory' type='int' value='50'/>      <Parm name='DoClassification' type='bool' value='no'/>      <Parm name='Cl_ConfigFileName' type='string' value='isBeingSetAutomatically.xml'/>      <Parm name='Cl_ModelFileName' type='string' value='isBeingSetAutomatically.mod'/>      <Parm name='Cl_ScoreThreshold' type='float' value='-0.2'/>      <Parm name='DoImageMatching' type='bool' value='no'/>    </Section>    <Section name='Generic'>      <Parm name='SmoothingSize' type='int' value='3'/>      <Parm name='FilterSize' type='int' value='3'/>      <Parm name='EdgeLowThreshold' type='int' value='30'/>      <Parm name='EdgeHighThreshold' type='int' value='255'/>      <Parm name='EdgeType' type='int' value='%d'/>      <Parm name='RelativeAreaRatio1' type='float' value='0.1'/>      <Parm name='RelativeAreaRatio2' type='float' value='%f'/>      <Parm name='RelativeImageMarginX' type='float' value='0.0'/>      <Parm name='RelativeImageMarginY' type='float' value='0.0'/>      <Parm name='ScalingFactor' type='float' value='%f'/>      <Parm name='CornerDetection' type='bool' value='no'/>      <Parm name='ContrastThreshold' type='int' value='50'/>      <Parm name='GlareDetection' type='bool' value='no'/>      <Parm name='GlareAreaRatioThreshold' type='float' value='0.0005'/>      <Parm name='GlareIntensityThreshold' type='float' value='240'/>      <Parm name='GlareIntensityVarThreshold' type='float' value='5'/>      <Parm name='GlarePixelRatioThreshold' type='float' value='0.0005'/>    </Section>    <Section name='Check'>      <Parm name='SmoothingSize' type='int' value='3'/>      <Parm name='FilterSize' type='int' value='3'/>      <Parm name='EdgeLowThreshold' type='int' value='30'/>      <Parm name='EdgeHighThreshold' type='int' value='255'/>      <Parm name='ScalingFactor' type='float' value='0.30'/>      <Parm name='ContrastThreshold' type='int' value='50'/>      <Parm name='InternalContrastThreshold' type='int' value='100'/>      <Parm name='RelativeStrengthThreshold' type='float' value='0.65'/>      <Parm name='LeftEndRatio' type='float' value='0.25'/>      <Parm name='RightStartRatio' type='float' value='0.75'/>      <Parm name='TopEndRatio' type='float' value='0.25'/>      <Parm name='BottomStartRatio' type='float' value='0.75'/>      <Parm name='ToleranceRatio' type='float' value='0.02'/>      <Parm name='LineSeperationRatio' type='float' value='0.05'/>      <Parm name='TotalSegmentSupportRatio' type='float' value='2.6'/>      <Parm name='MaxTopBottomSegmentSupportRatio' type='float' value='0.65'/>      <Parm name='MaxLeftRightSegmentSupportRatio' type='float' value='0.65'/>      <Parm name='InternalContrastThreshold' type='int' value='100'/>      <Parm name='DoMicrDetection' type='bool' value='%s'/>      <Parm name='PersonalCheckSize' type='string' value='6x2.75'/>      <Parm name='BusinessCheckSize' type='string' value='9.25x3.67'/>    </Section>    <Section name='MICR'>      <Parm name='MINCheckHeight' type='float' value='2.75'/>      <Parm name='MAXCheckHeight' type='float' value='4.0'/>      <Parm name='LeftShift' type='float' value='0.35'/>      <Parm name='BottomShift' type='float' value='0.5'/>      <Parm name='RightShift' type='float' value='2.0'/>      <Parm name='ContrastThreshold' type='int' value='20'/>    </Section>  </Section></Configuration>", new Object[] {
            "Check", Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f1), rect
        });
    }

    private void a(Bitmap bitmap, CheckSide checkside)
    {
        bitmap = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        if (bitmap.equals(c) && checkside == d)
        {
            return;
        } else
        {
            c = bitmap;
            d = checkside;
            bitmap = a(2, 0.005F, 0.2F, checkside, ((Rect) (bitmap)));
            a.loadConfigurationString(bitmap, "DocumentDetection");
            b(checkside);
            return;
        }
    }

    private void a(CheckSide checkside)
    {
        boolean flag;
        if (checkside == CheckSide.FRONT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a.RunMicrDetection = flag;
        a.RunLocalMicrSearch = flag;
        a.RunBoundaryDetectionBasedOnMicr = flag;
    }

    private void b(CheckSide checkside)
    {
        a.reset();
        a.startup();
        a.ShowIntermediateImage = false;
        a.ShowGlare = false;
        a.ShowFourCorners = false;
        a.ShowClassification = false;
        a(checkside);
    }

    public CheckDetectionResult detect(CheckSide checkside, CheckDetectionSettings checkdetectionsettings, Bitmap bitmap)
    {
        DocumentTracker documenttracker = a;
        documenttracker;
        JVM INSTR monitorenter ;
        int i;
        int j;
        i = bitmap.getWidth();
        j = bitmap.getHeight();
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        throw new IllegalArgumentException("image must be landscape orientation");
        checkside;
        documenttracker;
        JVM INSTR monitorexit ;
        throw checkside;
        Rect rect;
        Object obj;
        rect = a(checkdetectionsettings, i, j);
        a(bitmap, checkside);
        a.grabImageFrame(bitmap);
        a.processFrame();
        a.releaseFrame();
        obj = a.getActiveTrackedDocuments();
        if (((Vector) (obj)).size() >= 1)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        documenttracker;
        JVM INSTR monitorexit ;
        return null;
        Object obj1;
        obj1 = (TrackedDocument)((Vector) (obj)).get(0);
        obj = new CheckGuidance(((TrackedDocument) (obj1)));
        TrackedCheckInformation trackedcheckinformation = ((TrackedDocument) (obj1)).checkInformation();
        if (checkside != CheckSide.FRONT)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        if (trackedcheckinformation.dpi() != 0)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        documenttracker;
        JVM INSTR monitorexit ;
        return null;
        if (((TrackedDocument) (obj1)).category().equals("CK"))
        {
            break MISSING_BLOCK_LABEL_186;
        }
        documenttracker;
        JVM INSTR monitorexit ;
        return null;
        if (((TrackedDocument) (obj1)).isComplete())
        {
            break MISSING_BLOCK_LABEL_186;
        }
        documenttracker;
        JVM INSTR monitorexit ;
        return null;
        boolean flag;
        boolean flag1;
        flag = ((CheckGuidance) (obj)).isTargetRectangleFilled(com.kofax.android.abc.machine_vision.CheckGuidance.GuidanceSource.BEST_RECTANGLE, rect, 0.40000000000000002D, 1.2D);
        flag1 = ((CheckGuidance) (obj)).isEdgeSupportGood();
        obj1 = ((TrackedDocument) (obj1)).effectiveCorners();
        checkside = new a(rect, new BoundingTetragon((Point)((Vector) (obj1)).get(1), (Point)((Vector) (obj1)).get(2), (Point)((Vector) (obj1)).get(0), (Point)((Vector) (obj1)).get(3)), bitmap, checkside, ((CheckGuidance) (obj)), checkdetectionsettings);
        if (checkside.getZoomGuidance() != ZoomGuidance.ZOOM_OK || checkside.getVerticalMovementGuidance() != VerticalGuidance.VERTICAL_MOVE_OK || checkside.getHorizontalMovementGuidance() != HorizontalGuidance.HORIZONTAL_MOVE_OK || checkside.getTurnGuidance() != TurnGuidance.TURN_OK)
        {
            break MISSING_BLOCK_LABEL_350;
        }
        if (!flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_348;
        }
        if (((CheckGuidance) (obj)).areEdgesInView(com.kofax.android.abc.machine_vision.CheckGuidance.GuidanceSource.BEST_RECTANGLE, i, j)[0])
        {
            break MISSING_BLOCK_LABEL_350;
        }
        return null;
        documenttracker;
        JVM INSTR monitorexit ;
        return checkside;
    }

    static 
    {
        System.loadLibrary("gnustl_shared");
        System.loadLibrary("AtalaBar");
        System.loadLibrary("sol_isg_mobile");
    }

    private class a extends CheckDetectionResult
    {

        final com.kofax.kmc.ken.engines.a a;
        private final CheckGuidance b;
        private final com.kofax.android.abc.machine_vision.CheckGuidance.GuidanceSource c;
        private CheckDetectionSettings d;
        private ZoomGuidance e;
        private TurnGuidance f;
        private HorizontalGuidance g;
        private VerticalGuidance h;

        private ZoomGuidance a()
        {
            if (b != null)
            {
                double d1 = b.getZoomGuidance(c, getTargetRect(), d.getMinFillFraction(), d.getMaxFillFraction());
                if (d1 < 0.0D)
                {
                    e = ZoomGuidance.ZOOM_IN;
                } else
                if (d1 > 0.0D)
                {
                    e = ZoomGuidance.ZOOM_OUT;
                } else
                {
                    e = ZoomGuidance.ZOOM_OK;
                }
            }
            return e;
        }

        private TurnGuidance b()
        {
            if (b != null)
            {
                double d1 = b.getTurnGuidance(c, d.getMaxSkewAngle());
                if (d1 < 0.0D)
                {
                    f = TurnGuidance.TURN_CLOCKWISE;
                } else
                if (d1 > 0.0D)
                {
                    f = TurnGuidance.TURN_COUNTER_CLOCKWISE;
                } else
                {
                    f = TurnGuidance.TURN_OK;
                }
            }
            return f;
        }

        private HorizontalGuidance c()
        {
            if (b != null)
            {
                double d1 = b.getHorizontalMovementGuidance(c, getTargetRect(), d.getToleranceFraction());
                if (d1 < 0.0D)
                {
                    g = HorizontalGuidance.HORIZONTAL_MOVE_LEFT;
                } else
                if (d1 > 0.0D)
                {
                    g = HorizontalGuidance.HORIZONTAL_MOVE_RIGHT;
                } else
                {
                    g = HorizontalGuidance.HORIZONTAL_MOVE_OK;
                }
            }
            return g;
        }

        private VerticalGuidance d()
        {
            if (b != null)
            {
                double d1 = b.getVerticalMovementGuidance(c, getTargetRect(), d.getToleranceFraction());
                if (d1 < 0.0D)
                {
                    h = VerticalGuidance.VERTICAL_MOVE_UP;
                } else
                if (d1 > 0.0D)
                {
                    h = VerticalGuidance.VERTICAL_MOVE_DOWN;
                } else
                {
                    h = VerticalGuidance.VERTICAL_MOVE_OK;
                }
            }
            return h;
        }

        public HorizontalGuidance getHorizontalMovementGuidance()
        {
            return g;
        }

        public TurnGuidance getTurnGuidance()
        {
            return f;
        }

        public VerticalGuidance getVerticalMovementGuidance()
        {
            return h;
        }

        public ZoomGuidance getZoomGuidance()
        {
            return e;
        }

        public a(Rect rect, BoundingTetragon boundingtetragon, Bitmap bitmap, CheckSide checkside, CheckGuidance checkguidance, CheckDetectionSettings checkdetectionsettings)
        {
            a = com.kofax.kmc.ken.engines.a.this;
            super(rect, boundingtetragon, bitmap, checkside);
            b = checkguidance;
            d = checkdetectionsettings;
            if (checkside == CheckSide.FRONT)
            {
                a1 = com.kofax.android.abc.machine_vision.CheckGuidance.GuidanceSource.MICR;
            } else
            {
                a1 = com.kofax.android.abc.machine_vision.CheckGuidance.GuidanceSource.BEST_RECTANGLE;
            }
            c = com.kofax.kmc.ken.engines.a.this;
            e = a();
            f = b();
            g = c();
            h = d();
        }
    }

}
