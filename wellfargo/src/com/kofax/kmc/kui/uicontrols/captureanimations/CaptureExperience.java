// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.captureanimations;

import android.graphics.Bitmap;
import android.graphics.Point;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.kui.uicontrols.AutoFocusResultEvent;
import com.kofax.kmc.kui.uicontrols.AutoFocusResultListener;
import com.kofax.kmc.kui.uicontrols.IImageCaptureView;
import com.kofax.kmc.kui.uicontrols.ImageCapturedEvent;
import com.kofax.kmc.kui.uicontrols.ImageCapturedListener;
import com.kofax.kmc.kui.uicontrols.LevelnessEvent;
import com.kofax.kmc.kui.uicontrols.LevelnessListener;
import com.kofax.kmc.kui.uicontrols.PageDetectionEvent;
import com.kofax.kmc.kui.uicontrols.PageDetectionListener;
import com.kofax.kmc.kui.uicontrols.StabilityDelayEvent;
import com.kofax.kmc.kui.uicontrols.StabilityDelayListener;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.lang.reflect.Array;

// Referenced classes of package com.kofax.kmc.kui.uicontrols.captureanimations:
//            a, CaptureExperienceCriteria

public abstract class CaptureExperience
    implements AutoFocusResultListener, ImageCapturedListener, LevelnessListener, PageDetectionListener, StabilityDelayListener
{

    protected float _aspectRatio;
    protected a _captureExperienceData;
    protected CaptureExperienceCriteria _ceCriteria;
    protected boolean _continuousCapture;
    private Object a;
    private boolean b;
    private boolean c;
    private IImageCaptureView d;
    private boolean e;
    private int f;
    private int g;

    CaptureExperience(IImageCaptureView iimagecaptureview)
    {
        _captureExperienceData = new a();
        if (iimagecaptureview == null)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_NULL_POINTER_EXCEPTION);
        } else
        {
            a(((CaptureExperienceCriteria) (null)));
            d = iimagecaptureview;
            a = new Object();
            return;
        }
    }

    private double a(Point point, Point point1)
    {
        return (Math.atan2(point1.y - point.y, point1.x - point.x) + 3.1415926535897931D) % 1.5707963267948966D;
    }

    private Point a(Point point, Point point1, double d1, double d2)
    {
        Point point2 = new Point();
        point.x = point.x - point1.x;
        point.y = point.y - point1.y;
        double d3 = point.x;
        double d4 = point.y;
        double d5 = point.x;
        double d6 = point.y;
        point2.x = (int)Math.ceil(d3 * d2 - d4 * d1);
        point2.y = (int)Math.ceil(d5 * d1 + d6 * d2);
        point2.x = point2.x + point1.x;
        point2.y = point2.y + point1.y;
        return point2;
    }

    private BoundingTetragon a(BoundingTetragon boundingtetragon, Point point, double d1)
    {
        BoundingTetragon boundingtetragon1 = new BoundingTetragon();
        double d2 = Math.sin(d1);
        d1 = Math.cos(d1);
        boundingtetragon1.setBottomLeft(a(boundingtetragon.getBottomLeft(), point, d2, d1));
        boundingtetragon1.setBottomRight(a(boundingtetragon.getBottomRight(), point, d2, d1));
        boundingtetragon1.setTopLeft(a(boundingtetragon.getTopLeft(), point, d2, d1));
        boundingtetragon1.setTopRight(a(boundingtetragon.getTopRight(), point, d2, d1));
        return boundingtetragon1;
    }

    private void a()
    {
        if (e && (_captureExperienceData.b() > 25 || _captureExperienceData.c() > 25))
        {
            e = false;
        }
    }

    private void a(BoundingTetragon boundingtetragon, double d1, double d2)
    {
        if (boundingtetragon == null || d2 == 0.0D || d1 == 0.0D)
        {
            return;
        }
        BoundingTetragon boundingtetragon1 = boundingtetragon;
        if (!b(boundingtetragon))
        {
            boundingtetragon1 = c(boundingtetragon);
        }
        boundingtetragon = new Point(0, 0);
        double d3 = a(boundingtetragon1.getBottomLeft(), boundingtetragon1.getTopLeft());
        double d5;
        double d6;
        if (d3 <= 0.78539816339744828D)
        {
            boundingtetragon = a(boundingtetragon1, ((Point) (boundingtetragon)), -d3);
        } else
        {
            boundingtetragon = a(boundingtetragon1, ((Point) (boundingtetragon)), 1.5707963267948966D - d3);
        }
        boundingtetragon = a(boundingtetragon);
        d5 = boundingtetragon[2] - boundingtetragon[0];
        d6 = boundingtetragon[3] - boundingtetragon[1];
        _captureExperienceData.f((int)((100D * d5) / d1));
        _captureExperienceData.e((int)((100D * d6) / d2));
        if (_ceCriteria.isDetectPageOrientationEnabled())
        {
            double d7 = d5 / d6;
            double d8 = d1 / d2;
            double d4 = _aspectRatio;
            d3 = d4;
            if (d8 < 1.0D)
            {
                d3 = 1.0D / d4;
            }
            if (d3 == 1.0D || d7 < 1.0D && d3 > 1.0D || d7 > 1.0D && d3 < 1.0D)
            {
                _captureExperienceData.f(true);
            } else
            {
                _captureExperienceData.f(false);
            }
        }
        _captureExperienceData.d((int)((d5 * d6 * 100D) / (d1 * d2)));
    }

    private void a(boolean flag)
    {
        _captureExperienceData = new a();
        e = false;
        c = false;
        f = 0;
        a(_captureExperienceData);
        addCameraEventListeners();
        synchronized (a)
        {
            _continuousCapture = flag;
            b = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private int[] a(BoundingTetragon boundingtetragon)
    {
        int j = 0x80000000;
        Point apoint[] = new Point[4];
        apoint[0] = boundingtetragon.getBottomLeft();
        apoint[1] = boundingtetragon.getBottomRight();
        apoint[2] = boundingtetragon.getTopRight();
        apoint[3] = boundingtetragon.getTopLeft();
        int l1 = 0x7fffffff;
        int i1 = 0x7fffffff;
        int i = 0;
        int k = 0x80000000;
        while (i < 4) 
        {
            int l = l1;
            if (apoint[i].x < l1)
            {
                l = apoint[i].x;
            }
            int j1 = i1;
            if (apoint[i].y < i1)
            {
                j1 = apoint[i].y;
            }
            int k1 = k;
            if (apoint[i].x > k)
            {
                k1 = apoint[i].x;
            }
            int i2 = j;
            if (apoint[i].y > j)
            {
                i2 = apoint[i].y;
            }
            i++;
            l1 = l;
            i1 = j1;
            k = k1;
            j = i2;
        }
        return (new int[] {
            l1, i1, k, j
        });
    }

    private double b(Point point, Point point1)
    {
        double d1 = point1.x - point.x;
        double d2 = point1.y - point.y;
        return d1 * d1 + d2 * d2;
    }

    private boolean b(BoundingTetragon boundingtetragon)
    {
        Point point = new Point();
        point.x = boundingtetragon.getBottomLeft().x + boundingtetragon.getBottomRight().x + boundingtetragon.getTopLeft().x + boundingtetragon.getTopRight().x;
        point.y = boundingtetragon.getBottomLeft().y + boundingtetragon.getBottomRight().y + boundingtetragon.getTopLeft().y + boundingtetragon.getTopRight().y;
        point.x = point.x / 4;
        point.y = point.y / 4;
        for (double d1 = b(point, boundingtetragon.getBottomLeft()); Math.abs(d1 - b(point, boundingtetragon.getBottomLeft())) > 1.0D || Math.abs(d1 - b(point, boundingtetragon.getBottomRight())) > 1.0D || Math.abs(d1 - b(point, boundingtetragon.getTopLeft())) > 1.0D || Math.abs(d1 - b(point, boundingtetragon.getTopRight())) > 1.0D;)
        {
            return false;
        }

        return true;
    }

    private BoundingTetragon c(BoundingTetragon boundingtetragon)
    {
        Object aobj[] = new Point[4];
        aobj[0] = boundingtetragon.getBottomLeft();
        aobj[1] = boundingtetragon.getTopLeft();
        aobj[2] = boundingtetragon.getTopRight();
        aobj[3] = boundingtetragon.getBottomRight();
        Point apoint[] = new Point[4];
        Point apoint1[] = new Point[4];
        apoint1[0] = aobj[0];
        for (int i = 1; i < aobj.length; i++)
        {
            apoint1[i] = aobj[i];
            apoint[i] = apoint1[i - 1];
        }

        apoint[0] = aobj[3];
        aobj = new double[4];
        double ad[] = new double[4];
        Point apoint2[][] = (Point[][])Array.newInstance(android/graphics/Point, new int[] {
            4, 4
        });
        for (int j = 0; j < 4; j++)
        {
            aobj[j] = Math.atan2(apoint1[j].y - apoint[j].y, apoint1[j].x - apoint[j].x);
            apoint2[j] = d(a(boundingtetragon, new Point(0, 0), -aobj[j]));
            Point point = apoint2[j][1];
            Point point1 = apoint2[j][3];
            int l = point1.x;
            int j1 = point.x;
            ad[j] = (point1.y - point.y) * (l - j1);
        }

        double d1 = 1.7976931348623157E+308D;
        int i1 = 0;
        for (int k = 0; k < 4;)
        {
            double d2 = d1;
            if (ad[k] < d1)
            {
                d2 = ad[k];
                i1 = k;
            }
            k++;
            d1 = d2;
        }

        boundingtetragon = new BoundingTetragon();
        boundingtetragon.setBottomLeft(apoint2[i1][0]);
        boundingtetragon.setTopLeft(apoint2[i1][1]);
        boundingtetragon.setTopRight(apoint2[i1][2]);
        boundingtetragon.setBottomRight(apoint2[i1][3]);
        return a(boundingtetragon, new Point(0, 0), aobj[i1]);
    }

    private Point[] d(BoundingTetragon boundingtetragon)
    {
        boundingtetragon = a(boundingtetragon);
        return (new Point[] {
            new Point(boundingtetragon[0], boundingtetragon[3]), new Point(boundingtetragon[0], boundingtetragon[1]), new Point(boundingtetragon[2], boundingtetragon[1]), new Point(boundingtetragon[2], boundingtetragon[3])
        });
    }

    void a(CaptureExperienceCriteria captureexperiencecriteria)
    {
        CaptureExperienceCriteria captureexperiencecriteria1 = captureexperiencecriteria;
        if (captureexperiencecriteria == null)
        {
            captureexperiencecriteria1 = new CaptureExperienceCriteria();
        }
        _ceCriteria = captureexperiencecriteria1;
    }

    abstract void a(a a1);

    protected void addCameraEventListeners()
    {
        d.addStabilityDelayListener(this);
        d.addLevelnessListener(this);
        d.addOnAutoFocusResultListener(this);
        d.addPageDetectionListener(this);
        d.addOnImageCapturedListener(this);
    }

    void b(a a1)
    {
        a(a1);
        synchronized (a)
        {
            if (b && !c && !e && captureCritieraMet(a1))
            {
                a1.e(true);
                a(a1);
                c = true;
                e = true;
                d.forceTakePicture();
            }
        }
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    boolean c(a a1)
    {
        if (!_ceCriteria.isStabilityThresholdEnabled())
        {
            return true;
        }
        f = f + 1;
        g = g + a1.a();
        if (f >= 6)
        {
            if (g / f - _ceCriteria.getStabilityThreshold() > 0)
            {
                g = 0;
                f = 0;
                return true;
            } else
            {
                g = 0;
                f = 0;
                return false;
            }
        } else
        {
            return false;
        }
    }

    protected boolean captureCritieraMet(a a1)
    {
        if (!_ceCriteria.a(a1))
        {
            a1.e(false);
        } else
        if (c(a1))
        {
            return true;
        }
        return false;
    }

    public void destroy()
    {
        removeCameraEventListeners();
        removeAllViews();
        if (_captureExperienceData != null)
        {
            _captureExperienceData.a(null);
            _captureExperienceData = null;
        }
    }

    public void onAutoFocus(AutoFocusResultEvent autofocusresultevent)
    {
        _captureExperienceData.a(autofocusresultevent.getSuccess());
        b(_captureExperienceData);
    }

    public void onImageCaptured(ImageCapturedEvent imagecapturedevent)
    {
        if (!_continuousCapture)
        {
            removeCameraEventListeners();
        }
        _captureExperienceData = new a();
        f = 0;
        _captureExperienceData.a(null);
        b(_captureExperienceData);
        e = true;
        synchronized (a)
        {
            c = false;
            b = _continuousCapture;
        }
        return;
        exception;
        imagecapturedevent;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onLevelness(LevelnessEvent levelnessevent)
    {
        a();
        _captureExperienceData.b(Math.abs(levelnessevent.getPitch()));
        _captureExperienceData.c(Math.abs(levelnessevent.getRoll()));
        b(_captureExperienceData);
    }

    public void onStabilityDelay(StabilityDelayEvent stabilitydelayevent)
    {
        _captureExperienceData.a(stabilitydelayevent.getStability());
        b(_captureExperienceData);
    }

    public void pageDetected(PageDetectionEvent pagedetectionevent)
    {
        _captureExperienceData.b(true);
        _captureExperienceData.d(false);
        _captureExperienceData.a(pagedetectionevent);
        Bitmap bitmap = pagedetectionevent.getPreviewImage();
        double d1 = bitmap.getHeight();
        double d2 = bitmap.getWidth();
        a(pagedetectionevent.getBound(), d2, d1);
        b(_captureExperienceData);
    }

    protected abstract void removeAllViews();

    protected void removeCameraEventListeners()
    {
        d.removeStabilityDelayListener(this);
        d.removeLevelnessListener(this);
        d.removeOnAutoFocusResultListener(this);
        d.removePageDetectionListener(this);
        d.removeOnImageCapturedListener(this);
    }

    public void stopCapture()
    {
        _captureExperienceData = new a();
        b = false;
    }

    public void takePicture()
    {
        a(false);
    }

    public void takePictureContinually()
    {
        a(true);
    }
}
