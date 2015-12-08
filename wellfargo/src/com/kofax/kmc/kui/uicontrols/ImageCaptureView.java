// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.location.LocationManager;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.RelativeLayout;
import com.kofax.kmc.kui.uicontrols.data.Flash;
import com.kofax.kmc.kui.uicontrols.data.GpsUsageLimits;
import com.kofax.kmc.kui.uicontrols.data.ImageCaptureFrame;
import com.kofax.kmc.kui.uicontrols.data.PageDetectMode;
import com.kofax.kmc.kut.utilities.IpLibUtil;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.IllegalArgumentException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            IImageCaptureView, s, CameraManager, c, 
//            r, LevelRenderer, j, CameraInitializationListener, 
//            LevelnessListener, AutoFocusResultListener, ImageCapturedListener, PageDetectionListener, 
//            PreviewCallbackListener, StabilityDelayListener

public class ImageCaptureView extends RelativeLayout
    implements android.view.SurfaceHolder.Callback, IImageCaptureView
{

    private static final String a = com/kofax/kmc/kui/uicontrols/ImageCaptureView.getSimpleName();
    private LevelRenderer A;
    private GpsUsageLimits B;
    private j C;
    private final a b;
    private final Bus c;
    private final CameraManager d;
    private final SurfaceView e;
    private final List f;
    private ICameraSource.Parameters g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private ICameraSource.FocusMode s;
    private PageDetectMode t;
    private Flash u;
    private ImageCaptureFrame v;
    private boolean w;
    private boolean x;
    private boolean y;
    private List z;

    public ImageCaptureView(Context context)
    {
        this(context, null, 0, null, null, null);
    }

    public ImageCaptureView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0, null, null, null);
    }

    public ImageCaptureView(Context context, AttributeSet attributeset, int i1)
    {
        this(context, attributeset, i1, null, null, null);
    }

    ImageCaptureView(Context context, AttributeSet attributeset, int i1, SurfaceView surfaceview, CameraManager cameramanager, Bus bus)
    {
        boolean flag = false;
        super(context, attributeset, i1);
        b = new a(null);
        f = new ArrayList();
        g = null;
        i = 90;
        j = 7;
        k = 7;
        l = 0;
        m = 0;
        n = 20;
        o = 0xffff0000;
        p = 0xff0000ff;
        q = -256;
        r = 0xff00ff00;
        s = null;
        t = PageDetectMode.AUTOMATIC;
        u = Flash.OFF;
        v = null;
        w = false;
        x = false;
        y = false;
        B = GpsUsageLimits.ALWAYS_USE_IF_ENABLED;
        if (isInEditMode())
        {
            c = null;
            d = null;
            e = null;
            return;
        }
        if (System.getProperty("os.arch").equals("amd64") || System.getProperty("os.arch").equals("i686"))
        {
            flag = true;
        }
        if (!flag && !IpLibUtil.isIpLicensed())
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_EV_LICENSING);
        }
        Object obj = bus;
        if (bus == null)
        {
            obj = com.kofax.kmc.kui.uicontrols.s.a(context);
        }
        c = ((Bus) (obj));
        bus = surfaceview;
        if (surfaceview == null)
        {
            bus = new SurfaceView(context);
        }
        e = bus;
        surfaceview = cameramanager;
        if (cameramanager == null)
        {
            surfaceview = new CameraManager(context, ((Bus) (obj)), new c());
        }
        d = surfaceview;
        addView(e);
        addView(new r(context, c));
        A = new LevelRenderer(context, attributeset, i1, c);
        setBackgroundColor(0xff000000);
        a.a(b, c);
        C = new j(context, (LocationManager)context.getSystemService("location"));
    }

    static ICameraSource.Parameters a(ImageCaptureView imagecaptureview, ICameraSource.Parameters parameters)
    {
        imagecaptureview.g = parameters;
        return parameters;
    }

    private void a(SurfaceHolder surfaceholder)
    {
        if (surfaceholder != null && android.os.Build.VERSION.SDK_INT < 11)
        {
            surfaceholder.setType(3);
        }
    }

    static boolean a(ImageCaptureView imagecaptureview)
    {
        return imagecaptureview.h;
    }

    static SurfaceView b(ImageCaptureView imagecaptureview)
    {
        return imagecaptureview.e;
    }

    static boolean c(ImageCaptureView imagecaptureview)
    {
        return imagecaptureview.y;
    }

    static int d(ImageCaptureView imagecaptureview)
    {
        return imagecaptureview.l;
    }

    static int e(ImageCaptureView imagecaptureview)
    {
        return imagecaptureview.m;
    }

    static GpsUsageLimits f(ImageCaptureView imagecaptureview)
    {
        return imagecaptureview.B;
    }

    static ImageCaptureFrame g(ImageCaptureView imagecaptureview)
    {
        return imagecaptureview.v;
    }

    static int h(ImageCaptureView imagecaptureview)
    {
        return imagecaptureview.q;
    }

    static int i(ImageCaptureView imagecaptureview)
    {
        return imagecaptureview.r;
    }

    static int j(ImageCaptureView imagecaptureview)
    {
        return imagecaptureview.o;
    }

    static int k(ImageCaptureView imagecaptureview)
    {
        return imagecaptureview.p;
    }

    static boolean l(ImageCaptureView imagecaptureview)
    {
        return imagecaptureview.w;
    }

    static PageDetectMode m(ImageCaptureView imagecaptureview)
    {
        return imagecaptureview.t;
    }

    static int n(ImageCaptureView imagecaptureview)
    {
        return imagecaptureview.n;
    }

    static int o(ImageCaptureView imagecaptureview)
    {
        return imagecaptureview.j;
    }

    static int p(ImageCaptureView imagecaptureview)
    {
        return imagecaptureview.k;
    }

    static int q(ImageCaptureView imagecaptureview)
    {
        return imagecaptureview.i;
    }

    static boolean r(ImageCaptureView imagecaptureview)
    {
        return imagecaptureview.x;
    }

    static ICameraSource.FocusMode s(ImageCaptureView imagecaptureview)
    {
        return imagecaptureview.s;
    }

    final List a()
    {
        return d.f();
    }

    final void a(int i1)
    {
        c.post(new BusEvents.FocusDelayChangedEvent(i1));
    }

    final void a(ICameraSource.FocusMode focusmode)
    {
        s = focusmode;
        c.post(b.r());
    }

    public final void addCameraInitializationListener(CameraInitializationListener camerainitializationlistener)
    {
        BusEvents.ApiEventManager.registerWrapper(c, new BusEvents.CameraInitializationEventWrapper(camerainitializationlistener));
    }

    public final void addLevelnessListener(LevelnessListener levelnesslistener)
    {
        BusEvents.ApiEventManager.registerWrapper(c, new BusEvents.LevelnessEventWrapper(levelnesslistener));
    }

    public final void addOnAutoFocusResultListener(AutoFocusResultListener autofocusresultlistener)
    {
        BusEvents.ApiEventManager.registerWrapper(c, new BusEvents.AutoFocusResultEventWrapper(autofocusresultlistener));
    }

    public final void addOnImageCapturedListener(ImageCapturedListener imagecapturedlistener)
    {
        BusEvents.ApiEventManager.registerWrapper(c, new BusEvents.ImageCapturedEventWrapper(imagecapturedlistener, C));
    }

    public final void addPageDetectionListener(PageDetectionListener pagedetectionlistener)
    {
        BusEvents.ApiEventManager.registerWrapper(c, new BusEvents.PageDetectEventWrapper(pagedetectionlistener));
    }

    public final void addPreviewCallbackListener(PreviewCallbackListener previewcallbacklistener)
    {
        BusEvents.ApiEventManager.registerWrapper(c, new BusEvents.RealtimeVideoEventWrapper(previewcallbacklistener));
    }

    public final void addStabilityDelayListener(StabilityDelayListener stabilitydelaylistener)
    {
        BusEvents.ApiEventManager.registerWrapper(c, new BusEvents.StabilityDelayEventWrapper(stabilitydelaylistener));
    }

    public final void doContinuousMode(boolean flag)
    {
        y = flag;
        c.post(b.b());
    }

    public final void forceTakePicture()
    {
        forceTakePicture(false);
    }

    public final void forceTakePicture(boolean flag)
    {
        c.post(new BusEvents.ForceCaptureRequestedEvent(false, flag));
    }

    public final List getAllowableResolutions()
    {
        return d.g();
    }

    public final int getDeviceDeclinationPitch()
    {
        return l;
    }

    public final int getDeviceDeclinationRoll()
    {
        return m;
    }

    public final Flash getFlash()
    {
        return u;
    }

    public final Rect getFocusArea()
    {
        List list = getFocusAreas();
        if (list == null)
        {
            return null;
        }
        if (list.size() == 0)
        {
            return new Rect();
        } else
        {
            return (Rect)list.get(0);
        }
    }

    public final List getFocusAreas()
    {
        return z;
    }

    public final GpsUsageLimits getGpsUsage()
    {
        return B;
    }

    public final ImageCaptureFrame getImageCaptureFrame()
    {
        return v;
    }

    public final int getImagePreviewHeight()
    {
        Point point = d.h();
        if (point == null)
        {
            return 0;
        } else
        {
            return point.y;
        }
    }

    public final int getImagePreviewWidth()
    {
        Point point = d.h();
        if (point == null)
        {
            return 0;
        } else
        {
            return point.x;
        }
    }

    public final int getIndicatorColorFocusing()
    {
        return q;
    }

    public final int getIndicatorColorGood()
    {
        return r;
    }

    public final int getIndicatorColorNotLevel()
    {
        return o;
    }

    public final int getIndicatorColorNotStable()
    {
        return p;
    }

    public final boolean getLevelIndicator()
    {
        return w;
    }

    public final int getLevelThresholdPitch()
    {
        return j;
    }

    public final int getLevelThresholdRoll()
    {
        return k;
    }

    public final int getMaxFocusAreas()
    {
        if (g == null)
        {
            return 0;
        }
        int i1;
        try
        {
            i1 = g.getMaxNumFocusAreas();
        }
        catch (Exception exception)
        {
            return 0;
        }
        return i1;
    }

    public final int getPageAreaForDetection()
    {
        return n;
    }

    public final boolean getPageDetect()
    {
        return t != PageDetectMode.OFF;
    }

    public final PageDetectMode getPageDetectMode()
    {
        return t;
    }

    public final int getStabilityDelay()
    {
        return i;
    }

    public final boolean getUseVideoFrame()
    {
        return x;
    }

    protected void onAttachedToWindow()
    {
        if (isInEditMode())
        {
            return;
        } else
        {
            super.onAttachedToWindow();
            SurfaceHolder surfaceholder = e.getHolder();
            surfaceholder.addCallback(this);
            a(surfaceholder);
            c.post(new BusEvents.AttachedToWindowEvent());
            a.a(b, c);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        if (isInEditMode())
        {
            return;
        } else
        {
            super.onDetachedFromWindow();
            c.post(new BusEvents.DetachedFromWindowEvent());
            a.b(b, c);
            return;
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        if (h) goto _L2; else goto _L1
_L1:
        super.onLayout(flag, i1, j1, k1, l1);
_L6:
        return;
_L2:
        Iterator iterator;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        try
        {
            k2 = getChildCount();
            j3 = Math.abs(k1 - i1);
            int i2 = Math.abs(l1 - j1);
            l2 = getSuggestedMinimumWidth();
            i3 = getSuggestedMinimumHeight();
            Point point = d.a(j3, i2);
            point.set(Math.max(point.x, l2), Math.max(point.y, i3));
            l2 = point.x;
            i3 = point.y;
            j3 = (j3 - l2) / 2;
            k3 = (i2 - i3) / 2;
            f.clear();
        }
        catch (Exception exception)
        {
            super.onLayout(flag, i1, j1, k1, l1);
            return;
        }
        j2 = 0;
        if (j2 >= k2)
        {
            break; /* Loop/switch isn't completed */
        }
        f.add(getChildAt(j2));
        j2++;
        if (true) goto _L4; else goto _L3
_L4:
        break MISSING_BLOCK_LABEL_137;
_L3:
        iterator = f.iterator();
        while (iterator.hasNext()) 
        {
            ((View)iterator.next()).layout(j3, k3, l2 + j3, i3 + k3);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void removeCameraInitializationListener(CameraInitializationListener camerainitializationlistener)
    {
        BusEvents.ApiEventManager.unregisterWrapper(c, camerainitializationlistener, com/kofax/kmc/kui/uicontrols/CameraInitializationListener);
    }

    public final void removeLevelnessListener(LevelnessListener levelnesslistener)
    {
        BusEvents.ApiEventManager.unregisterWrapper(c, levelnesslistener, com/kofax/kmc/kui/uicontrols/LevelnessListener);
    }

    public final void removeOnAutoFocusResultListener(AutoFocusResultListener autofocusresultlistener)
    {
        BusEvents.ApiEventManager.unregisterWrapper(c, autofocusresultlistener, com/kofax/kmc/kui/uicontrols/AutoFocusResultListener);
    }

    public final void removeOnImageCapturedListener(ImageCapturedListener imagecapturedlistener)
    {
        BusEvents.ApiEventManager.unregisterWrapper(c, imagecapturedlistener, com/kofax/kmc/kui/uicontrols/ImageCapturedListener);
    }

    public final void removePageDetectionListener(PageDetectionListener pagedetectionlistener)
    {
        BusEvents.ApiEventManager.unregisterWrapper(c, pagedetectionlistener, com/kofax/kmc/kui/uicontrols/PageDetectionListener);
    }

    public final void removePreviewCallbackListener(PreviewCallbackListener previewcallbacklistener)
    {
        BusEvents.ApiEventManager.unregisterWrapper(c, previewcallbacklistener, com/kofax/kmc/kui/uicontrols/PreviewCallbackListener);
    }

    public final void removeStabilityDelayListener(StabilityDelayListener stabilitydelaylistener)
    {
        BusEvents.ApiEventManager.unregisterWrapper(c, stabilitydelaylistener, com/kofax/kmc/kui/uicontrols/StabilityDelayListener);
    }

    public final void returnCameraEvents(boolean flag)
    {
    }

    public final void sessionCreate()
    {
        this;
        JVM INSTR monitorenter ;
        c.post(new BusEvents.SessionCreateEvent());
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void sessionDismiss()
    {
        this;
        JVM INSTR monitorenter ;
        c.post(new BusEvents.SessionDismissEvent());
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void setDeviceDeclinationPitch(int i1)
    {
        l = i1;
        c.post(b.c());
    }

    public final void setDeviceDeclinationRoll(int i1)
    {
        m = i1;
        c.post(b.d());
    }

    public final void setFlash(Flash flash)
    {
        if (flash == null)
        {
            throw new IllegalArgumentException("setFlash(Flash flash) method: 'flash' parameter is null.");
        } else
        {
            u = flash;
            d.a(flash);
            return;
        }
    }

    public final void setFocusArea(Rect rect)
    {
        ArrayList arraylist = null;
        if (rect != null)
        {
            arraylist = new ArrayList();
            arraylist.add(rect);
        }
        setFocusAreas(arraylist);
    }

    public final void setFocusAreas(List list)
    {
        z = list;
        d.a(z, getWidth(), getHeight());
    }

    public final void setGpsUsage(GpsUsageLimits gpsusagelimits)
    {
        B = gpsusagelimits;
        c.post(b.e());
    }

    public final void setImageCaptureFrame(ImageCaptureFrame imagecaptureframe)
    {
        v = imagecaptureframe;
        c.post(b.f());
    }

    public final void setImageResolution(android.hardware.Camera.Size size)
    {
        if (d.a(size))
        {
            requestLayout();
            if (h)
            {
                invalidate();
            }
        }
    }

    public final void setIndicatorColorFocusing(int i1)
    {
        q = i1;
        c.post(b.g());
    }

    public final void setIndicatorColorGood(int i1)
    {
        r = i1;
        c.post(b.h());
    }

    public final void setIndicatorColorNotLevel(int i1)
    {
        o = i1;
        c.post(b.i());
    }

    public final void setIndicatorColorNotStable(int i1)
    {
        p = i1;
        c.post(b.j());
    }

    public final void setLevelIndicator(boolean flag)
    {
label0:
        {
            if (w != flag)
            {
                w = flag;
                c.post(b.k());
                if (!w)
                {
                    break label0;
                }
                addView(A);
            }
            return;
        }
        removeView(A);
    }

    public final void setLevelThresholdPitch(int i1)
    {
        j = i1;
        c.post(b.n());
    }

    public final void setLevelThresholdRoll(int i1)
    {
        k = i1;
        c.post(b.o());
    }

    public final void setPageAreaForDetection(int i1)
    {
        n = i1;
        c.post(b.m());
    }

    public final void setPageDetect(boolean flag)
    {
        PageDetectMode pagedetectmode;
        if (flag)
        {
            pagedetectmode = PageDetectMode.AUTOMATIC;
        } else
        {
            pagedetectmode = PageDetectMode.OFF;
        }
        setPageDetectMode(pagedetectmode);
    }

    public final void setPageDetectMode(PageDetectMode pagedetectmode)
    {
        t = pagedetectmode;
        c.post(b.l());
    }

    public final void setStabilityDelay(int i1)
    {
        i = i1;
        c.post(b.p());
    }

    public final void setUseVideoFrame(boolean flag)
    {
        if (x != flag && d.a(flag))
        {
            x = flag;
            c.post(b.q());
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i1, int j1, int k1)
    {
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        d.b();
        d.a(surfaceholder, getWidth(), getHeight());
        d.i();
        requestLayout();
        h = true;
        c.post(b.a());
        return;
        surfaceholder;
        c.post(new BusEvents.LogEvent(a, BusEvents.LogEvent.Level.ERROR, (new StringBuilder()).append("Error starting camera preview: ").append(surfaceholder.getMessage()).toString(), surfaceholder));
        throw surfaceholder;
        surfaceholder;
        c.post(b.a());
        throw surfaceholder;
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        try
        {
            d.a();
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceHolder surfaceholder)
        {
            h = false;
            c.post(b.a());
            return;
        }
        finally
        {
            h = false;
        }
        h = false;
        c.post(b.a());
        return;
        c.post(b.a());
        throw surfaceholder;
    }

    public final void takePicture()
    {
        c.post(new BusEvents.TryCaptureImageRequestEvent());
    }

    public final void takePictureForCaptureExperience()
    {
        c.post(new BusEvents.ForceCaptureRequestedEvent(true));
    }


    private class a
    {

        final ImageCaptureView a;
        private boolean b;

        static void a(a a1, Bus bus)
        {
            a1.a(bus);
        }

        private void a(Bus bus)
        {
            this;
            JVM INSTR monitorenter ;
            if (!b)
            {
                bus.register(this);
                b = true;
            }
            this;
            JVM INSTR monitorexit ;
            return;
            bus;
            this;
            JVM INSTR monitorexit ;
            throw bus;
        }

        static void b(a a1, Bus bus)
        {
            a1.b(bus);
        }

        private void b(Bus bus)
        {
            this;
            JVM INSTR monitorenter ;
            if (b)
            {
                bus.unregister(this);
                b = false;
            }
            this;
            JVM INSTR monitorexit ;
            return;
            bus;
            this;
            JVM INSTR monitorexit ;
            throw bus;
        }

        public BusEvents.SurfaceChangedEvent a()
        {
            return new BusEvents.SurfaceChangedEvent(ImageCaptureView.a(a), ImageCaptureView.b(a));
        }

        public void a(BusEvents.CameraParametersProducedEvent cameraparametersproducedevent)
        {
            ImageCaptureView.a(a, cameraparametersproducedevent.parameters);
        }

        public BusEvents.ContinuousModeChangedEvent b()
        {
            return new BusEvents.ContinuousModeChangedEvent(ImageCaptureView.c(a));
        }

        public BusEvents.DeviceDeclinationPitchEvent c()
        {
            return new BusEvents.DeviceDeclinationPitchEvent(ImageCaptureView.d(a));
        }

        public BusEvents.DeviceDeclinationRollEvent d()
        {
            return new BusEvents.DeviceDeclinationRollEvent(ImageCaptureView.e(a));
        }

        public BusEvents.GpsUsageLimitsChangedEvent e()
        {
            return new BusEvents.GpsUsageLimitsChangedEvent(ImageCaptureView.f(a));
        }

        public BusEvents.ImageCaptureFrameChangedEvent f()
        {
            return new BusEvents.ImageCaptureFrameChangedEvent(ImageCaptureView.g(a));
        }

        public BusEvents.IndicatorColorFocusingChangedEvent g()
        {
            return new BusEvents.IndicatorColorFocusingChangedEvent(ImageCaptureView.h(a));
        }

        public BusEvents.IndicatorColorGoodChangedEvent h()
        {
            return new BusEvents.IndicatorColorGoodChangedEvent(ImageCaptureView.i(a));
        }

        public BusEvents.IndicatorColorNotLevelChangedEvent i()
        {
            return new BusEvents.IndicatorColorNotLevelChangedEvent(ImageCaptureView.j(a));
        }

        public BusEvents.IndicatorColorNotStableChangedEvent j()
        {
            return new BusEvents.IndicatorColorNotStableChangedEvent(ImageCaptureView.k(a));
        }

        public BusEvents.LevelIndicatorChangedEvent k()
        {
            return new BusEvents.LevelIndicatorChangedEvent(ImageCaptureView.l(a));
        }

        public BusEvents.PageDetectModeChangedEvent l()
        {
            return new BusEvents.PageDetectModeChangedEvent(ImageCaptureView.m(a));
        }

        public BusEvents.PageAreaThresholdChangedEvent m()
        {
            return new BusEvents.PageAreaThresholdChangedEvent(ImageCaptureView.n(a));
        }

        public BusEvents.PitchThresholdChangedEvent n()
        {
            return new BusEvents.PitchThresholdChangedEvent(ImageCaptureView.o(a));
        }

        public BusEvents.RollThresholdChangedEvent o()
        {
            return new BusEvents.RollThresholdChangedEvent(ImageCaptureView.p(a));
        }

        public BusEvents.StabilityDelayChangedEvent p()
        {
            return new BusEvents.StabilityDelayChangedEvent(ImageCaptureView.q(a));
        }

        public BusEvents.UseVideoChangedEvent q()
        {
            return new BusEvents.UseVideoChangedEvent(ImageCaptureView.r(a));
        }

        public BusEvents.FocusModeChangedEvent r()
        {
            return new BusEvents.FocusModeChangedEvent(ImageCaptureView.s(a));
        }

        private a()
        {
            a = ImageCaptureView.this;
            super();
            b = false;
        }

        a(_cls1 _pcls1)
        {
            this();
        }
    }

}
