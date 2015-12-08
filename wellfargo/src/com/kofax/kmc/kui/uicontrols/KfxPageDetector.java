// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import com.kofax.android.abc.machine_vision.DocumentTracker;
import com.kofax.android.abc.machine_vision.TrackedDocument;
import com.kofax.kmc.kut.utilities.RectUtil;
import java.util.List;
import java.util.Vector;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            IPageDetector

public final class KfxPageDetector
    implements IPageDetector
{

    private static final DocumentTracker a = new DocumentTracker();
    private static final String b = "DocumentDetection";
    private static final String c = "<?xml version=\"1.0\" encoding=\"iso-8859-1\"?><Configuration name=\"Cadence\"><Section name=\"Connection\"><Param name=\"ServiceUrl\" type=\"string\" value=\"http://63.110.241.90:50001/\"/><Param name=\"Configuration\" type=\"string\" value=\"MobileBlackBox\"/><Param name=\"Username\" type=\"string\" value=\"jamtrup\"/><Parm name=\"Password\" type=\"string\" value=\"jamtrup\"/><Parm name=\"BusinessProcess\" type=\"string\" value=\"InsuranceClaim\"/></Section><Section name=\"DocumentDetection\"><Section name=\"Tracker\"><Parm name=\"DocumentType\" type=\"string\" value=\"Generic\"/><Parm name=\"MaxNumberOfDocuments\" type=\"int\" value=\"1\"/><Parm name=\"FramesHistory\" type=\"int\" value=\"50\"/><Parm name=\"DoClassification\" type=\"bool\" value=\"no\"/><Parm name=\"Cl_ConfigFileName\" type=\"string\" value=\"isBeingSetAutomatically.xml\"/><Parm name=\"Cl_ModelFileName\" type=\"string\" value=\"isBeingSetAutomatically.mod\"/><Parm name=\"Cl_ScoreThreshold\" type=\"float\" value=\"-0.2\"/><Parm name=\"DoImageMatching\" type=\"bool\" value=\"no\"/></Section><Section name=\"Generic\"><Parm name=\"SmoothingSize\" type=\"int\" value=\"3\"/><Parm name=\"FilterSize\" type=\"int\" value=\"3\"/><Parm name=\"EdgeLowThreshold\" type=\"int\" value=\"30\"/><Parm name=\"EdgeHighThreshold\" type=\"int\" value=\"255\"/><Parm name=\"EdgeType\" type=\"int\" value=\"%s\"/><Parm name=\"RelativeAreaRatio1\" type=\"float\" value=\"0.005\"/><Parm name=\"RelativeAreaRatio2\" type=\"float\" value=\"%s\"/><Parm name=\"RelativeImageMarginX\" type=\"float\" value=\"0.0\"/><Parm name=\"RelativeImageMarginY\" type=\"float\" value=\"0.0\"/><Parm name=\"ScalingFactor\" type=\"float\" value=\"0.2\"/><Parm name=\"CornerDetection\" type=\"bool\" value=\"no\"/><Parm name=\"ContrastThreshold\" type=\"int\" value=\"50\"/><Parm name=\"GlareDetection\" type=\"bool\" value=\"no\"/><Parm name=\"GlareAreaRatioThreshold\" type=\"float\" value=\"0.0005\"/><Parm name=\"GlareIntensityThreshold\" type=\"float\" value=\"240\"/><Parm name=\"GlareIntensityVarThreshold\" type=\"float\" value=\"5\"/><Parm name=\"GlarePixelRatioThreshold\" type=\"float\" value=\"0.0005\"/></Section><Section name=\"Check\"><Parm name=\"SmoothingSize\" type=\"int\" value=\"3\"/><Parm name=\"FilterSize\" type=\"int\" value=\"3\"/><Parm name=\"EdgeLowThreshold\" type=\"int\" value=\"30\"/><Parm name=\"EdgeHighThreshold\" type=\"int\" value=\"255\"/><Parm name=\"ScalingFactor\" type=\"float\" value=\"0.30\"/><Parm name=\"ContrastThreshold\" type=\"int\" value=\"50\"/><Parm name=\"RelativeStrengthThreshold\" type=\"float\" value=\"0.65\"/><Parm name=\"AspectRatio\" type=\"float\" value=\"0.458333\"/><Parm name=\"LeftEndRatio\" type=\"float\" value=\"0.25\"/><Parm name=\"RightStartRatio\" type=\"float\" value=\"0.75\"/><Parm name=\"TopEndRatio\" type=\"float\" value=\"0.25\"/><Parm name=\"BottomStartRatio\" type=\"float\" value=\"0.75\"/><Parm name=\"ToleranceRatio\" type=\"float\" value=\"0.02\"/><Parm name=\"LineSeperationRatio\" type=\"float\" value=\"0.05\"/><Parm name=\"TotalSegmentSupportRatio\" type=\"float\" value=\"2.6\"/><Parm name=\"MaxTopBottomSegmentSupportRatio\" type=\"float\" value=\"0.65\"/><Parm name=\"MaxLeftRightSegmentSupportRatio\" type=\"float\" value=\"0.65\"/><Parm name=\"AspectRatioRelativeError\" type=\"float\" value=\"0.05\"/><Parm name=\"RelativeAreaRatio\" type=\"float\" value=\"0.45\"/><Parm name=\"MaximumRelativeAreaRatio\" type=\"float\" value=\"1.30\"/><Parm name=\"InternalContrastThreshold\" type=\"int\" value=\"100\"/><Parm name=\"TargetRectangle\" type=\"string\" value=\"0-0-0-0\"/><Parm name=\"TargetRectangleMinimumFill\" type=\"float\" value=\"0.9\"/><Parm name=\"TargetRectangleMaximumFill\" type=\"float\" value=\"1.7\"/><Parm name=\"DoMicrDetection\" type=\"bool\" value=\"yes\"/><Parm name=\"PersonalCheckSize\" type=\"string\" value=\"6x2.75\"/><Parm name=\"BusinessCheckSize\" type=\"string\" value=\"9.25x3.67\"/></Section><Section name=\"MICR\"><Parm name=\"MINCheckHeight\" type=\"float\" value=\"2.75\"/><Parm name=\"MAXCheckHeight\" type=\"float\" value=\"4.0\"/><Parm name=\"LeftShift\" type=\"float\" value=\"0.35\"/><Parm name=\"BottomShift\" type=\"float\" value=\"0.5\"/><Parm name=\"RightShift\" type=\"float\" value=\"2.0\"/><Parm name=\"ContrastThreshold\" type=\"int\" value=\"20\"/></Section></Section></Configuration>";
    private String d;
    private String e;
    private int f;
    private int g;
    private int h;
    private Vector i;
    private Bitmap j;
    private double k;
    private final Rect l = new Rect();

    public KfxPageDetector()
    {
        f = 0;
        g = 0;
        h = 5;
        k = 0.20000000000000001D;
        a();
        a(String.format("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?><Configuration name=\"Cadence\"><Section name=\"Connection\"><Param name=\"ServiceUrl\" type=\"string\" value=\"http://63.110.241.90:50001/\"/><Param name=\"Configuration\" type=\"string\" value=\"MobileBlackBox\"/><Param name=\"Username\" type=\"string\" value=\"jamtrup\"/><Parm name=\"Password\" type=\"string\" value=\"jamtrup\"/><Parm name=\"BusinessProcess\" type=\"string\" value=\"InsuranceClaim\"/></Section><Section name=\"DocumentDetection\"><Section name=\"Tracker\"><Parm name=\"DocumentType\" type=\"string\" value=\"Generic\"/><Parm name=\"MaxNumberOfDocuments\" type=\"int\" value=\"1\"/><Parm name=\"FramesHistory\" type=\"int\" value=\"50\"/><Parm name=\"DoClassification\" type=\"bool\" value=\"no\"/><Parm name=\"Cl_ConfigFileName\" type=\"string\" value=\"isBeingSetAutomatically.xml\"/><Parm name=\"Cl_ModelFileName\" type=\"string\" value=\"isBeingSetAutomatically.mod\"/><Parm name=\"Cl_ScoreThreshold\" type=\"float\" value=\"-0.2\"/><Parm name=\"DoImageMatching\" type=\"bool\" value=\"no\"/></Section><Section name=\"Generic\"><Parm name=\"SmoothingSize\" type=\"int\" value=\"3\"/><Parm name=\"FilterSize\" type=\"int\" value=\"3\"/><Parm name=\"EdgeLowThreshold\" type=\"int\" value=\"30\"/><Parm name=\"EdgeHighThreshold\" type=\"int\" value=\"255\"/><Parm name=\"EdgeType\" type=\"int\" value=\"%s\"/><Parm name=\"RelativeAreaRatio1\" type=\"float\" value=\"0.005\"/><Parm name=\"RelativeAreaRatio2\" type=\"float\" value=\"%s\"/><Parm name=\"RelativeImageMarginX\" type=\"float\" value=\"0.0\"/><Parm name=\"RelativeImageMarginY\" type=\"float\" value=\"0.0\"/><Parm name=\"ScalingFactor\" type=\"float\" value=\"0.2\"/><Parm name=\"CornerDetection\" type=\"bool\" value=\"no\"/><Parm name=\"ContrastThreshold\" type=\"int\" value=\"50\"/><Parm name=\"GlareDetection\" type=\"bool\" value=\"no\"/><Parm name=\"GlareAreaRatioThreshold\" type=\"float\" value=\"0.0005\"/><Parm name=\"GlareIntensityThreshold\" type=\"float\" value=\"240\"/><Parm name=\"GlareIntensityVarThreshold\" type=\"float\" value=\"5\"/><Parm name=\"GlarePixelRatioThreshold\" type=\"float\" value=\"0.0005\"/></Section><Section name=\"Check\"><Parm name=\"SmoothingSize\" type=\"int\" value=\"3\"/><Parm name=\"FilterSize\" type=\"int\" value=\"3\"/><Parm name=\"EdgeLowThreshold\" type=\"int\" value=\"30\"/><Parm name=\"EdgeHighThreshold\" type=\"int\" value=\"255\"/><Parm name=\"ScalingFactor\" type=\"float\" value=\"0.30\"/><Parm name=\"ContrastThreshold\" type=\"int\" value=\"50\"/><Parm name=\"RelativeStrengthThreshold\" type=\"float\" value=\"0.65\"/><Parm name=\"AspectRatio\" type=\"float\" value=\"0.458333\"/><Parm name=\"LeftEndRatio\" type=\"float\" value=\"0.25\"/><Parm name=\"RightStartRatio\" type=\"float\" value=\"0.75\"/><Parm name=\"TopEndRatio\" type=\"float\" value=\"0.25\"/><Parm name=\"BottomStartRatio\" type=\"float\" value=\"0.75\"/><Parm name=\"ToleranceRatio\" type=\"float\" value=\"0.02\"/><Parm name=\"LineSeperationRatio\" type=\"float\" value=\"0.05\"/><Parm name=\"TotalSegmentSupportRatio\" type=\"float\" value=\"2.6\"/><Parm name=\"MaxTopBottomSegmentSupportRatio\" type=\"float\" value=\"0.65\"/><Parm name=\"MaxLeftRightSegmentSupportRatio\" type=\"float\" value=\"0.65\"/><Parm name=\"AspectRatioRelativeError\" type=\"float\" value=\"0.05\"/><Parm name=\"RelativeAreaRatio\" type=\"float\" value=\"0.45\"/><Parm name=\"MaximumRelativeAreaRatio\" type=\"float\" value=\"1.30\"/><Parm name=\"InternalContrastThreshold\" type=\"int\" value=\"100\"/><Parm name=\"TargetRectangle\" type=\"string\" value=\"0-0-0-0\"/><Parm name=\"TargetRectangleMinimumFill\" type=\"float\" value=\"0.9\"/><Parm name=\"TargetRectangleMaximumFill\" type=\"float\" value=\"1.7\"/><Parm name=\"DoMicrDetection\" type=\"bool\" value=\"yes\"/><Parm name=\"PersonalCheckSize\" type=\"string\" value=\"6x2.75\"/><Parm name=\"BusinessCheckSize\" type=\"string\" value=\"9.25x3.67\"/></Section><Section name=\"MICR\"><Parm name=\"MINCheckHeight\" type=\"float\" value=\"2.75\"/><Parm name=\"MAXCheckHeight\" type=\"float\" value=\"4.0\"/><Parm name=\"LeftShift\" type=\"float\" value=\"0.35\"/><Parm name=\"BottomShift\" type=\"float\" value=\"0.5\"/><Parm name=\"RightShift\" type=\"float\" value=\"2.0\"/><Parm name=\"ContrastThreshold\" type=\"int\" value=\"20\"/></Section></Section></Configuration>", new Object[] {
            "1", "0.2"
        }));
    }

    private void a()
    {
        d = String.format("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?><Configuration name=\"Cadence\"><Section name=\"Connection\"><Param name=\"ServiceUrl\" type=\"string\" value=\"http://63.110.241.90:50001/\"/><Param name=\"Configuration\" type=\"string\" value=\"MobileBlackBox\"/><Param name=\"Username\" type=\"string\" value=\"jamtrup\"/><Parm name=\"Password\" type=\"string\" value=\"jamtrup\"/><Parm name=\"BusinessProcess\" type=\"string\" value=\"InsuranceClaim\"/></Section><Section name=\"DocumentDetection\"><Section name=\"Tracker\"><Parm name=\"DocumentType\" type=\"string\" value=\"Generic\"/><Parm name=\"MaxNumberOfDocuments\" type=\"int\" value=\"1\"/><Parm name=\"FramesHistory\" type=\"int\" value=\"50\"/><Parm name=\"DoClassification\" type=\"bool\" value=\"no\"/><Parm name=\"Cl_ConfigFileName\" type=\"string\" value=\"isBeingSetAutomatically.xml\"/><Parm name=\"Cl_ModelFileName\" type=\"string\" value=\"isBeingSetAutomatically.mod\"/><Parm name=\"Cl_ScoreThreshold\" type=\"float\" value=\"-0.2\"/><Parm name=\"DoImageMatching\" type=\"bool\" value=\"no\"/></Section><Section name=\"Generic\"><Parm name=\"SmoothingSize\" type=\"int\" value=\"3\"/><Parm name=\"FilterSize\" type=\"int\" value=\"3\"/><Parm name=\"EdgeLowThreshold\" type=\"int\" value=\"30\"/><Parm name=\"EdgeHighThreshold\" type=\"int\" value=\"255\"/><Parm name=\"EdgeType\" type=\"int\" value=\"%s\"/><Parm name=\"RelativeAreaRatio1\" type=\"float\" value=\"0.005\"/><Parm name=\"RelativeAreaRatio2\" type=\"float\" value=\"%s\"/><Parm name=\"RelativeImageMarginX\" type=\"float\" value=\"0.0\"/><Parm name=\"RelativeImageMarginY\" type=\"float\" value=\"0.0\"/><Parm name=\"ScalingFactor\" type=\"float\" value=\"0.2\"/><Parm name=\"CornerDetection\" type=\"bool\" value=\"no\"/><Parm name=\"ContrastThreshold\" type=\"int\" value=\"50\"/><Parm name=\"GlareDetection\" type=\"bool\" value=\"no\"/><Parm name=\"GlareAreaRatioThreshold\" type=\"float\" value=\"0.0005\"/><Parm name=\"GlareIntensityThreshold\" type=\"float\" value=\"240\"/><Parm name=\"GlareIntensityVarThreshold\" type=\"float\" value=\"5\"/><Parm name=\"GlarePixelRatioThreshold\" type=\"float\" value=\"0.0005\"/></Section><Section name=\"Check\"><Parm name=\"SmoothingSize\" type=\"int\" value=\"3\"/><Parm name=\"FilterSize\" type=\"int\" value=\"3\"/><Parm name=\"EdgeLowThreshold\" type=\"int\" value=\"30\"/><Parm name=\"EdgeHighThreshold\" type=\"int\" value=\"255\"/><Parm name=\"ScalingFactor\" type=\"float\" value=\"0.30\"/><Parm name=\"ContrastThreshold\" type=\"int\" value=\"50\"/><Parm name=\"RelativeStrengthThreshold\" type=\"float\" value=\"0.65\"/><Parm name=\"AspectRatio\" type=\"float\" value=\"0.458333\"/><Parm name=\"LeftEndRatio\" type=\"float\" value=\"0.25\"/><Parm name=\"RightStartRatio\" type=\"float\" value=\"0.75\"/><Parm name=\"TopEndRatio\" type=\"float\" value=\"0.25\"/><Parm name=\"BottomStartRatio\" type=\"float\" value=\"0.75\"/><Parm name=\"ToleranceRatio\" type=\"float\" value=\"0.02\"/><Parm name=\"LineSeperationRatio\" type=\"float\" value=\"0.05\"/><Parm name=\"TotalSegmentSupportRatio\" type=\"float\" value=\"2.6\"/><Parm name=\"MaxTopBottomSegmentSupportRatio\" type=\"float\" value=\"0.65\"/><Parm name=\"MaxLeftRightSegmentSupportRatio\" type=\"float\" value=\"0.65\"/><Parm name=\"AspectRatioRelativeError\" type=\"float\" value=\"0.05\"/><Parm name=\"RelativeAreaRatio\" type=\"float\" value=\"0.45\"/><Parm name=\"MaximumRelativeAreaRatio\" type=\"float\" value=\"1.30\"/><Parm name=\"InternalContrastThreshold\" type=\"int\" value=\"100\"/><Parm name=\"TargetRectangle\" type=\"string\" value=\"0-0-0-0\"/><Parm name=\"TargetRectangleMinimumFill\" type=\"float\" value=\"0.9\"/><Parm name=\"TargetRectangleMaximumFill\" type=\"float\" value=\"1.7\"/><Parm name=\"DoMicrDetection\" type=\"bool\" value=\"yes\"/><Parm name=\"PersonalCheckSize\" type=\"string\" value=\"6x2.75\"/><Parm name=\"BusinessCheckSize\" type=\"string\" value=\"9.25x3.67\"/></Section><Section name=\"MICR\"><Parm name=\"MINCheckHeight\" type=\"float\" value=\"2.75\"/><Parm name=\"MAXCheckHeight\" type=\"float\" value=\"4.0\"/><Parm name=\"LeftShift\" type=\"float\" value=\"0.35\"/><Parm name=\"BottomShift\" type=\"float\" value=\"0.5\"/><Parm name=\"RightShift\" type=\"float\" value=\"2.0\"/><Parm name=\"ContrastThreshold\" type=\"int\" value=\"20\"/></Section></Section></Configuration>", new Object[] {
            "1", Double.toString(k)
        });
        e = String.format("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?><Configuration name=\"Cadence\"><Section name=\"Connection\"><Param name=\"ServiceUrl\" type=\"string\" value=\"http://63.110.241.90:50001/\"/><Param name=\"Configuration\" type=\"string\" value=\"MobileBlackBox\"/><Param name=\"Username\" type=\"string\" value=\"jamtrup\"/><Parm name=\"Password\" type=\"string\" value=\"jamtrup\"/><Parm name=\"BusinessProcess\" type=\"string\" value=\"InsuranceClaim\"/></Section><Section name=\"DocumentDetection\"><Section name=\"Tracker\"><Parm name=\"DocumentType\" type=\"string\" value=\"Generic\"/><Parm name=\"MaxNumberOfDocuments\" type=\"int\" value=\"1\"/><Parm name=\"FramesHistory\" type=\"int\" value=\"50\"/><Parm name=\"DoClassification\" type=\"bool\" value=\"no\"/><Parm name=\"Cl_ConfigFileName\" type=\"string\" value=\"isBeingSetAutomatically.xml\"/><Parm name=\"Cl_ModelFileName\" type=\"string\" value=\"isBeingSetAutomatically.mod\"/><Parm name=\"Cl_ScoreThreshold\" type=\"float\" value=\"-0.2\"/><Parm name=\"DoImageMatching\" type=\"bool\" value=\"no\"/></Section><Section name=\"Generic\"><Parm name=\"SmoothingSize\" type=\"int\" value=\"3\"/><Parm name=\"FilterSize\" type=\"int\" value=\"3\"/><Parm name=\"EdgeLowThreshold\" type=\"int\" value=\"30\"/><Parm name=\"EdgeHighThreshold\" type=\"int\" value=\"255\"/><Parm name=\"EdgeType\" type=\"int\" value=\"%s\"/><Parm name=\"RelativeAreaRatio1\" type=\"float\" value=\"0.005\"/><Parm name=\"RelativeAreaRatio2\" type=\"float\" value=\"%s\"/><Parm name=\"RelativeImageMarginX\" type=\"float\" value=\"0.0\"/><Parm name=\"RelativeImageMarginY\" type=\"float\" value=\"0.0\"/><Parm name=\"ScalingFactor\" type=\"float\" value=\"0.2\"/><Parm name=\"CornerDetection\" type=\"bool\" value=\"no\"/><Parm name=\"ContrastThreshold\" type=\"int\" value=\"50\"/><Parm name=\"GlareDetection\" type=\"bool\" value=\"no\"/><Parm name=\"GlareAreaRatioThreshold\" type=\"float\" value=\"0.0005\"/><Parm name=\"GlareIntensityThreshold\" type=\"float\" value=\"240\"/><Parm name=\"GlareIntensityVarThreshold\" type=\"float\" value=\"5\"/><Parm name=\"GlarePixelRatioThreshold\" type=\"float\" value=\"0.0005\"/></Section><Section name=\"Check\"><Parm name=\"SmoothingSize\" type=\"int\" value=\"3\"/><Parm name=\"FilterSize\" type=\"int\" value=\"3\"/><Parm name=\"EdgeLowThreshold\" type=\"int\" value=\"30\"/><Parm name=\"EdgeHighThreshold\" type=\"int\" value=\"255\"/><Parm name=\"ScalingFactor\" type=\"float\" value=\"0.30\"/><Parm name=\"ContrastThreshold\" type=\"int\" value=\"50\"/><Parm name=\"RelativeStrengthThreshold\" type=\"float\" value=\"0.65\"/><Parm name=\"AspectRatio\" type=\"float\" value=\"0.458333\"/><Parm name=\"LeftEndRatio\" type=\"float\" value=\"0.25\"/><Parm name=\"RightStartRatio\" type=\"float\" value=\"0.75\"/><Parm name=\"TopEndRatio\" type=\"float\" value=\"0.25\"/><Parm name=\"BottomStartRatio\" type=\"float\" value=\"0.75\"/><Parm name=\"ToleranceRatio\" type=\"float\" value=\"0.02\"/><Parm name=\"LineSeperationRatio\" type=\"float\" value=\"0.05\"/><Parm name=\"TotalSegmentSupportRatio\" type=\"float\" value=\"2.6\"/><Parm name=\"MaxTopBottomSegmentSupportRatio\" type=\"float\" value=\"0.65\"/><Parm name=\"MaxLeftRightSegmentSupportRatio\" type=\"float\" value=\"0.65\"/><Parm name=\"AspectRatioRelativeError\" type=\"float\" value=\"0.05\"/><Parm name=\"RelativeAreaRatio\" type=\"float\" value=\"0.45\"/><Parm name=\"MaximumRelativeAreaRatio\" type=\"float\" value=\"1.30\"/><Parm name=\"InternalContrastThreshold\" type=\"int\" value=\"100\"/><Parm name=\"TargetRectangle\" type=\"string\" value=\"0-0-0-0\"/><Parm name=\"TargetRectangleMinimumFill\" type=\"float\" value=\"0.9\"/><Parm name=\"TargetRectangleMaximumFill\" type=\"float\" value=\"1.7\"/><Parm name=\"DoMicrDetection\" type=\"bool\" value=\"yes\"/><Parm name=\"PersonalCheckSize\" type=\"string\" value=\"6x2.75\"/><Parm name=\"BusinessCheckSize\" type=\"string\" value=\"9.25x3.67\"/></Section><Section name=\"MICR\"><Parm name=\"MINCheckHeight\" type=\"float\" value=\"2.75\"/><Parm name=\"MAXCheckHeight\" type=\"float\" value=\"4.0\"/><Parm name=\"LeftShift\" type=\"float\" value=\"0.35\"/><Parm name=\"BottomShift\" type=\"float\" value=\"0.5\"/><Parm name=\"RightShift\" type=\"float\" value=\"2.0\"/><Parm name=\"ContrastThreshold\" type=\"int\" value=\"20\"/></Section></Section></Configuration>", new Object[] {
            "2", Double.toString(k)
        });
    }

    private void a(String s)
    {
        a.loadConfigurationString(s, "DocumentDetection");
        a.reset();
        a.startup();
        a.ShowIntermediateImage = false;
        a.ShowGlare = false;
        a.ShowFourCorners = false;
        a.ShowClassification = false;
        a.RunMicrDetection = false;
    }

    private boolean b()
    {
        a.processFrame();
        Object obj = a.getActiveTrackedDocuments();
        if (((Vector) (obj)).size() > 0)
        {
            obj = (TrackedDocument)((Vector) (obj)).get(0);
            if (((TrackedDocument) (obj)).isComplete())
            {
                obj = ((TrackedDocument) (obj)).effectiveCorners();
                i = new Vector(4);
                obj = RectUtil.sort((Point)((Vector) (obj)).get(0), (Point)((Vector) (obj)).get(1), (Point)((Vector) (obj)).get(2), (Point)((Vector) (obj)).get(3), l);
                i.add(((List) (obj)).get(1));
                i.add(((List) (obj)).get(2));
                i.add(((List) (obj)).get(0));
                i.add(((List) (obj)).get(3));
                j = a.getProcessedImage();
                d();
                return true;
            }
        }
        i = null;
        c();
        return false;
    }

    private void c()
    {
        g = g + 1;
        if (g < h) goto _L2; else goto _L1
_L1:
        g = 0;
        f = f + 1;
        if (f > 1)
        {
            f = 0;
        }
        f;
        JVM INSTR tableswitch 0 1: default 76
    //                   0 77
    //                   1 86;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        a(d);
        return;
_L4:
        a(e);
        return;
    }

    private void d()
    {
        g = 0;
        f = 0;
    }

    public boolean doPageDetect(Bitmap bitmap)
    {
        boolean flag;
        a.grabImageFrame(bitmap);
        flag = b();
        a.releaseFrame();
        return flag;
        bitmap;
        a.releaseFrame();
        throw bitmap;
    }

    public boolean doPageDetect(byte abyte0[], int i1, int j1, int k1)
    {
        boolean flag;
        a.grabVideoFrame(abyte0, i1, j1, k1);
        flag = b();
        a.releaseFrame();
        return flag;
        abyte0;
        a.releaseFrame();
        throw abyte0;
    }

    public Vector getDocumentBounds()
    {
        return i;
    }

    public Bitmap getProcessedImage()
    {
        return j;
    }

    public void setPageAreaForDetection(int i1)
    {
        k = (double)i1 / 100D;
        a();
    }

    static 
    {
        System.loadLibrary("gnustl_shared");
        System.loadLibrary("AtalaBar");
        System.loadLibrary("sol_isg_mobile");
    }
}
