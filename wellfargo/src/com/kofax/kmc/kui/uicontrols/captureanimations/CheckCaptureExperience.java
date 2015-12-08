// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.captureanimations;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import com.kofax.kmc.ken.engines.CheckDetector;
import com.kofax.kmc.ken.engines.ICheckDetector;
import com.kofax.kmc.ken.engines.data.CheckDetectionResult;
import com.kofax.kmc.ken.engines.data.CheckDetectionSettings;
import com.kofax.kmc.ken.engines.data.HorizontalGuidance;
import com.kofax.kmc.ken.engines.data.VerticalGuidance;
import com.kofax.kmc.ken.engines.data.ZoomGuidance;
import com.kofax.kmc.kui.uicontrols.CameraInitializationEvent;
import com.kofax.kmc.kui.uicontrols.CameraInitializationListener;
import com.kofax.kmc.kui.uicontrols.ImageCaptureView;
import com.kofax.kmc.kui.uicontrols.ImageCapturedEvent;
import com.kofax.kmc.kui.uicontrols.PreviewCallbackListener;
import com.kofax.kmc.kui.uicontrols.PreviewFrameEvent;
import com.kofax.kmc.kui.uicontrols.Utility;
import com.kofax.kmc.kui.uicontrols.data.PageDetectMode;
import java.util.Timer;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package com.kofax.kmc.kui.uicontrols.captureanimations:
//            CaptureExperience, CaptureExperienceCriteria, CaptureStaticFrameView, CheckOverlayFrameView, 
//            CaptureMessage, b, a

public class CheckCaptureExperience extends CaptureExperience
    implements android.view.View.OnClickListener, CameraInitializationListener, PreviewCallbackListener
{

    public static final double DEFAULT_HORIZONTAL_TOLERANCE = 0.29999999999999999D;
    public static final int DEFAULT_PADDING_PERCENT = 5;
    public static final double DEFAULT_SKEW_MAX = 20D;
    public static final double DEFAULT_VERTICAL_TOLERANCE = 0.29999999999999999D;
    public static final double DEFAULT_ZOOM_MAX = 1D;
    public static final double DEFAULT_ZOOM_MIN = 0.69999999999999996D;
    public static final double PRIVATE_CHECK_RATIO = 2.1818181818181817D;
    private static final String c = com/kofax/kmc/kui/uicontrols/captureanimations/CheckCaptureExperience.getName();
    private static final int v = 3000;
    boolean a;
    Executor b;
    private final Context d;
    private final ImageCaptureView e;
    private final ICheckDetector f;
    private final CheckDetectionSettings g;
    private final CaptureStaticFrameView h;
    private final CheckOverlayFrameView i;
    private final b j;
    private int k;
    private int l;
    private CaptureMessage m;
    private CaptureMessage n;
    private String o;
    private Bitmap p[];
    private Bitmap q[];
    private volatile boolean r;
    private Object s;
    private boolean t;
    private Timer u;
    private long w;
    private CheckDetectionResult x;

    public CheckCaptureExperience(ImageCaptureView imagecaptureview, CaptureExperienceCriteria captureexperiencecriteria)
    {
        this(imagecaptureview, captureexperiencecriteria, null, null);
    }

    CheckCaptureExperience(ImageCaptureView imagecaptureview, CaptureExperienceCriteria captureexperiencecriteria, ICheckDetector icheckdetector)
    {
        this(imagecaptureview, captureexperiencecriteria, icheckdetector, null);
    }

    CheckCaptureExperience(ImageCaptureView imagecaptureview, CaptureExperienceCriteria captureexperiencecriteria, ICheckDetector icheckdetector, CheckOverlayFrameView checkoverlayframeview)
    {
        super(imagecaptureview);
        o = "Fill Viewable area\nwith check";
        p = new Bitmap[2];
        q = new Bitmap[2];
        s = new Object();
        a = false;
        b = Executors.newFixedThreadPool(2);
        Object obj = icheckdetector;
        if (icheckdetector == null)
        {
            obj = new CheckDetector();
        }
        icheckdetector = captureexperiencecriteria;
        if (captureexperiencecriteria == null)
        {
            icheckdetector = new CaptureExperienceCriteria();
        }
        icheckdetector.setPageDetectionEnabled(false);
        icheckdetector.setPageAreaThresholdEnabled(false);
        icheckdetector.setPageLongEdgeThresholdEnabled(false);
        icheckdetector.setPageShortEdgeThresholdEnabled(false);
        a(icheckdetector);
        f = ((ICheckDetector) (obj));
        g = new CheckDetectionSettings();
        g.setTargetFrameAspectRatio(2.1818181818181817D);
        g.setTargetFramePaddingPercent(5D);
        g.setTargetFrame(new Rect(0, 0, 0, 0));
        d = imagecaptureview.getContext();
        h = new CaptureStaticFrameView(d);
        h.setBorderThickness(0.0F);
        captureexperiencecriteria = checkoverlayframeview;
        if (checkoverlayframeview == null)
        {
            captureexperiencecriteria = new CheckOverlayFrameView(d);
        }
        i = captureexperiencecriteria;
        m = new CaptureMessage();
        m.setMessage(o);
        m.setTextSize(32);
        n = new CaptureMessage();
        n.setVisibility(false);
        j = new b(d, h);
        j.a(m);
        j.b(n);
        j.c(n);
        j.d(null);
        e = imagecaptureview;
        e.setPageDetectMode(PageDetectMode.OFF);
        e.addView(h);
        e.addView(i);
        e.addView(j);
        b();
    }

    static long a(CheckCaptureExperience checkcaptureexperience, long l1)
    {
        checkcaptureexperience.w = l1;
        return l1;
    }

    static CheckDetectionResult a(CheckCaptureExperience checkcaptureexperience, CheckDetectionResult checkdetectionresult)
    {
        checkcaptureexperience.x = checkdetectionresult;
        return checkdetectionresult;
    }

    static CheckDetectionSettings a(CheckCaptureExperience checkcaptureexperience)
    {
        return checkcaptureexperience.g;
    }

    static String a()
    {
        return c;
    }

    static boolean a(CheckCaptureExperience checkcaptureexperience, boolean flag)
    {
        checkcaptureexperience.r = flag;
        return flag;
    }

    static ICheckDetector b(CheckCaptureExperience checkcaptureexperience)
    {
        return checkcaptureexperience.f;
    }

    private void b()
    {
        ClassLoader classloader = com/kofax/kmc/kui/uicontrols/captureanimations/CheckCaptureExperience.getClassLoader();
        setCheckSampleImage(BitmapFactory.decodeStream(classloader.getResourceAsStream("com.kofax.kmc.uicontrols.check.capture.images/check_sample_rotated.png")));
        setCheckOverlayImage(BitmapFactory.decodeStream(classloader.getResourceAsStream("com.kofax.kmc.uicontrols.check.capture.images/check_overlay.png")));
        p[0] = BitmapFactory.decodeStream(classloader.getResourceAsStream("com.kofax.kmc.uicontrols.check.capture.images/zoom_in.png"));
        p[1] = BitmapFactory.decodeStream(classloader.getResourceAsStream("com.kofax.kmc.uicontrols.check.capture.images/zoom_in_hover.png"));
        setZoomInImages(p);
        q[0] = BitmapFactory.decodeStream(classloader.getResourceAsStream("com.kofax.kmc.uicontrols.check.capture.images/zoom_out.png"));
        q[1] = BitmapFactory.decodeStream(classloader.getResourceAsStream("com.kofax.kmc.uicontrols.check.capture.images/zoom_out_hover.png"));
        setZoomOutImages(q);
    }

    static boolean b(CheckCaptureExperience checkcaptureexperience, boolean flag)
    {
        checkcaptureexperience.t = flag;
        return flag;
    }

    static long c(CheckCaptureExperience checkcaptureexperience)
    {
        return checkcaptureexperience.w;
    }

    private boolean c()
    {
        boolean flag2 = true;
        CheckDetectionResult checkdetectionresult = _captureExperienceData.h();
        if (checkdetectionresult == null)
        {
            return false;
        }
        boolean flag;
        boolean flag1;
        if (checkdetectionresult.getHorizontalMovementGuidance() == HorizontalGuidance.HORIZONTAL_MOVE_OK)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (checkdetectionresult.getVerticalMovementGuidance() == VerticalGuidance.VERTICAL_MOVE_OK)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (checkdetectionresult.getZoomGuidance() != ZoomGuidance.ZOOM_OK)
        {
            flag2 = false;
        }
        return flag & flag1 & flag2;
    }

    static CheckOverlayFrameView d(CheckCaptureExperience checkcaptureexperience)
    {
        return checkcaptureexperience.i;
    }

    private void d()
    {
        e();
        u = new Timer("Animation Tutor Timer");
        a a1 = _captureExperienceData;
        u.schedule(new _cls2(a1), 8000L);
    }

    static CheckDetectionResult e(CheckCaptureExperience checkcaptureexperience)
    {
        return checkcaptureexperience.x;
    }

    private void e()
    {
        if (u != null)
        {
            u.cancel();
            u.purge();
            u = null;
        }
    }

    void a(a a1)
    {
        Object obj = s;
        obj;
        JVM INSTR monitorenter ;
        a1.c(true);
        j.a(m);
        h.setCaptureExperienceData(a1);
        j.a(a1, _ceCriteria);
        if (a1.g() || !r || t)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        m.setVisibility(true);
_L2:
        return;
        m.setVisibility(false);
        if (true) goto _L2; else goto _L1
_L1:
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    protected void addCameraEventListeners()
    {
        super.addCameraEventListeners();
        e.addPreviewCallbackListener(this);
        e.addCameraInitializationListener(this);
    }

    protected boolean captureCritieraMet(a a1)
    {
        if (!super.captureCritieraMet(a1))
        {
            return false;
        } else
        {
            return c();
        }
    }

    public void enableAnimationTutor(boolean flag)
    {
        t = flag;
        i.setInstructionOverlay(flag);
        if (flag)
        {
            i.setOnClickListener(this);
        }
    }

    public int getCheckOverlayImageHeight()
    {
        return i.getCheckOverlayImageHeight();
    }

    public int getCheckOverlayImageWidth()
    {
        return i.getCheckOverlayImageWidth();
    }

    public Bitmap getCheckSampleImage()
    {
        return i.getCheckSampleImage();
    }

    public Bitmap[] getZoomInImages()
    {
        return i.getZoomInImages();
    }

    public Bitmap[] getZoomOutImages()
    {
        return i.getZoomOutImages();
    }

    public void onCameraInitialized(CameraInitializationEvent camerainitializationevent)
    {
        k = e.getImagePreviewWidth();
        l = e.getImagePreviewHeight();
        g.setCenterPoint(new Point(k / 2, l / 2));
    }

    public void onClick(View view)
    {
        i.setInstructionOverlay(false);
        i.setOnClickListener(null);
    }

    public void onImageCaptured(ImageCapturedEvent imagecapturedevent)
    {
        super.onImageCaptured(imagecapturedevent);
        i.setGuidance(null);
        e();
        if (_continuousCapture)
        {
            d();
        }
    }

    public void onPreviewFrame(PreviewFrameEvent previewframeevent)
    {
        if (a)
        {
            return;
        }
        a = true;
        Bitmap bitmap = previewframeevent.getBitmap(false);
        previewframeevent = bitmap;
        if (bitmap.getWidth() < bitmap.getHeight())
        {
            previewframeevent = Utility.Rotate(bitmap, -90F);
        }
        b.execute(new _cls1(previewframeevent));
    }

    protected void removeAllViews()
    {
        boolean flag = false;
        e.removeView(h);
        e.removeView(i);
        Bitmap bitmap = i.getCheckSampleImage();
        if (bitmap != null)
        {
            bitmap.recycle();
        }
        bitmap = i.getCheckOuterOverlay();
        if (bitmap != null)
        {
            bitmap.recycle();
        }
        bitmap = i.getCheckOverlayImage();
        if (bitmap != null)
        {
            bitmap.recycle();
        }
        Bitmap abitmap[] = i.getZoomInImages();
        int k1 = abitmap.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            Bitmap bitmap1 = abitmap[i1];
            if (bitmap1 != null)
            {
                bitmap1.recycle();
            }
        }

        abitmap = i.getZoomOutImages();
        k1 = abitmap.length;
        for (int j1 = ((flag) ? 1 : 0); j1 < k1; j1++)
        {
            Bitmap bitmap2 = abitmap[j1];
            if (bitmap2 != null)
            {
                bitmap2.recycle();
            }
        }

        e.removeView(j);
        if (u != null)
        {
            u.purge();
            u.cancel();
            u = null;
        }
        x = null;
        w = 0x7fffffffffffffffL;
    }

    protected void removeCameraEventListeners()
    {
        super.removeCameraEventListeners();
        e.removePreviewCallbackListener(this);
        e.removeCameraInitializationListener(this);
    }

    public void setCheckOverlayImage(Bitmap bitmap)
    {
        i.setCheckOverlayImage(bitmap);
    }

    public void setCheckOverlayImageAspectRatio(float f1)
    {
        i.setOverlayAspectRatio(f1);
    }

    public void setCheckOverlayPaddingPercent(int i1)
    {
        i.setPaddingPercent(i1);
        g.setTargetFramePaddingPercent(i1);
    }

    public void setCheckSampleImage(Bitmap bitmap)
    {
        i.setCheckSampleImage(bitmap);
    }

    public void setZoomInImages(Bitmap abitmap[])
    {
        i.setZoomInImages(abitmap);
    }

    public void setZoomOutImages(Bitmap abitmap[])
    {
        i.setZoomOutImages(abitmap);
    }

    public void takePicture()
    {
        super.takePicture();
        d();
    }


    private class _cls2 extends TimerTask
    {

        final a a;
        final CheckCaptureExperience b;

        public void run()
        {
            if (a == null)
            {
                return;
            } else
            {
                a.g(true);
                CheckCaptureExperience.d(b).setInstructionOverlay(false);
                CheckCaptureExperience.b(b, false);
                return;
            }
        }

        _cls2(a a1)
        {
            b = CheckCaptureExperience.this;
            a = a1;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final Bitmap a;
        final CheckCaptureExperience b;

        public void run()
        {
            CheckDetectionResult checkdetectionresult;
            long l1;
            checkdetectionresult = CheckCaptureExperience.b(b).detect(CheckSide.FRONT, CheckCaptureExperience.a(b), a);
            l1 = System.currentTimeMillis();
            if (checkdetectionresult == null) goto _L2; else goto _L1
_L1:
            CheckCaptureExperience.a(b, false);
            CheckCaptureExperience.a(b, l1);
            CheckCaptureExperience.a(b, checkdetectionresult);
            Log.d(CheckCaptureExperience.a(), checkdetectionresult.toString());
_L3:
            if (l1 - CheckCaptureExperience.c(b) < 3000L)
            {
                break MISSING_BLOCK_LABEL_166;
            }
            CheckCaptureExperience.a(b, true);
            CheckCaptureExperience.d(b).setGuidance(checkdetectionresult);
            b._captureExperienceData.a(checkdetectionresult);
_L4:
            b.b(b._captureExperienceData);
            b.a = false;
            return;
_L2:
            Log.d(CheckCaptureExperience.a(), "GUIDANCE: NULL");
              goto _L3
            Exception exception;
            exception;
            b.a = false;
            throw exception;
            CheckCaptureExperience.d(b).setGuidance(CheckCaptureExperience.e(b));
            b._captureExperienceData.a(CheckCaptureExperience.e(b));
              goto _L4
        }

        _cls1(Bitmap bitmap)
        {
            b = CheckCaptureExperience.this;
            a = bitmap;
            super();
        }
    }

}
