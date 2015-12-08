// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.captureanimations;

import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.kofax.kmc.kui.uicontrols.IImageCaptureView;
import com.kofax.kmc.kui.uicontrols.ImageCapturedEvent;
import com.kofax.kmc.kui.uicontrols.PageDetectionEvent;
import com.kofax.kmc.kui.uicontrols.data.PageDetectMode;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.util.Timer;

// Referenced classes of package com.kofax.kmc.kui.uicontrols.captureanimations:
//            CaptureExperience, CaptureStaticFrameView, c, b, 
//            CaptureExperienceCriteria, a, CaptureMessage

public class AnimatedDocumentCaptureExperience extends CaptureExperience
{

    private CaptureStaticFrameView a;
    private c b;
    private b c;
    private Context d;
    private IImageCaptureView e;
    private Timer f;
    private Timer g;

    public AnimatedDocumentCaptureExperience(IImageCaptureView iimagecaptureview, CaptureExperienceCriteria captureexperiencecriteria)
    {
        super(iimagecaptureview);
        a(captureexperiencecriteria);
        e = iimagecaptureview;
        iimagecaptureview = (ViewGroup)e;
        d = iimagecaptureview.getContext();
        e.setPageDetectMode(PageDetectMode.CONTINUOUS);
        a = new CaptureStaticFrameView(d);
        b = new c(d);
        c = new b(d, a);
        iimagecaptureview.addView(b);
        iimagecaptureview.addView(a);
        iimagecaptureview.addView(c);
    }

    private void a()
    {
        b();
        f = new Timer("No Document Message Timer");
        a a1 = _captureExperienceData;
        f.scheduleAtFixedRate(new _cls1(a1), 10000L, 4000L);
    }

    private void b()
    {
        if (f != null)
        {
            f.cancel();
            f.purge();
            f = null;
        }
    }

    private void c()
    {
        d();
        g = new Timer("Page Detection Message Timer");
        a a1 = _captureExperienceData;
        g.schedule(new _cls2(a1), 1000L, 1000L);
    }

    private void d()
    {
        if (g != null)
        {
            g.cancel();
            g.purge();
            g = null;
        }
    }

    void a(a a1)
    {
        a.setCaptureExperienceData(a1);
        b.a(a1);
        c.a(a1, _ceCriteria);
        if (_continuousCapture && f == null)
        {
            a();
        }
    }

    public void destroy()
    {
        super.destroy();
        ViewGroup viewgroup = (ViewGroup)e;
        viewgroup.removeView(c);
        viewgroup.removeView(a);
        viewgroup.removeView(b);
    }

    public CaptureMessage getHoldSteadyMessage()
    {
        return c.d();
    }

    public CaptureMessage getNoDocumentFoundMessage()
    {
        return c.b();
    }

    public int getPageDetectionFrameBorderColor()
    {
        return b.b();
    }

    public android.graphics.Paint.Style getPageDetectionFrameBorderStyle()
    {
        return b.c();
    }

    public float getPageDetectionFrameBorderThickness()
    {
        return b.a();
    }

    public CaptureMessage getPageOrientationMessage()
    {
        return c.e();
    }

    public float getStaticFrameAspectRatio()
    {
        return a.getAspectRatio();
    }

    public int getStaticFrameBorderColor()
    {
        return a.getBorderColor();
    }

    public android.graphics.Paint.Style getStaticFrameBorderStyle()
    {
        return a.getBorderStyle();
    }

    public float getStaticFrameBorderThickness()
    {
        return a.getBorderThickness();
    }

    public int getStaticFrameCaptureColor()
    {
        return a.getCaptureIndicationColor();
    }

    public int getStaticFrameHeight()
    {
        return a.getFrameBounds().height();
    }

    public int getStaticFramePaddingPercent()
    {
        return a.getPaddingPercent();
    }

    public int getStaticFrameWidth()
    {
        return a.getFrameBounds().width();
    }

    public CaptureMessage getUserInstructionMessage()
    {
        return c.a();
    }

    public CaptureMessage getZoomInMessage()
    {
        return c.c();
    }

    public void onImageCaptured(ImageCapturedEvent imagecapturedevent)
    {
        super.onImageCaptured(imagecapturedevent);
        b();
        if (_continuousCapture)
        {
            a();
        }
        d();
    }

    public void pageDetected(PageDetectionEvent pagedetectionevent)
    {
        c();
        super.pageDetected(pagedetectionevent);
    }

    protected void removeAllViews()
    {
        ViewGroup viewgroup = (ViewGroup)e;
        viewgroup.removeView(b);
        viewgroup.removeView(a);
        viewgroup.removeView(c);
        d();
        b();
    }

    public void setHoldSteadyMessage(CaptureMessage capturemessage)
    {
        c.d(capturemessage);
    }

    public void setNoDocumentFoundMessage(CaptureMessage capturemessage)
    {
        c.b(capturemessage);
    }

    public void setPageDetectionFrameBorderColor(int i)
    {
        b.a(i);
    }

    public void setPageDetectionFrameBorderStyle(android.graphics.Paint.Style style)
    {
        b.a(style);
    }

    public void setPageDetectionFrameBorderThickness(float f1)
    {
        if (f1 < 0.0F || f1 > 10F)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_BORDER_THICKNESS_ARGUMENT);
        } else
        {
            b.a(f1);
            return;
        }
    }

    public void setPageOrientationMessage(CaptureMessage capturemessage)
    {
        c.e(capturemessage);
    }

    public void setStaticFrameAspectRatio(float f1)
    {
        if (f1 < 0.0F)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_ASPECT_RATIO_ARGUMENT);
        } else
        {
            _aspectRatio = f1;
            a.setAspectRatio(f1);
            return;
        }
    }

    public void setStaticFrameBorderColor(int i)
    {
        a.setBorderColor(i);
    }

    public void setStaticFrameBorderStyle(android.graphics.Paint.Style style)
    {
        a.setBorderStyle(style);
    }

    public void setStaticFrameBorderThickness(float f1)
    {
        if (f1 < 0.0F || f1 > 10F)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_BORDER_THICKNESS_ARGUMENT);
        } else
        {
            a.setBorderThickness(f1);
            return;
        }
    }

    public void setStaticFrameCaptureColor(int i)
    {
        a.setCaptureIndicationColor(i);
    }

    public void setStaticFrameHeight(int i)
    {
        if (i < 0)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_HEIGHT_ARGUMENT);
        } else
        {
            a.setFrameHeight(i);
            return;
        }
    }

    public void setStaticFramePaddingPercent(int i)
    {
        if (i < 0 || i > 50)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_PADDING_PERCENTAGE_ARGUMENT);
        } else
        {
            a.setPaddingPercent(i);
            return;
        }
    }

    public void setStaticFrameWidth(int i)
    {
        if (i < 0)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_WIDTH_ARGUMENT);
        } else
        {
            a.setFrameWidth(i);
            return;
        }
    }

    public void setUserInstructionMessage(CaptureMessage capturemessage)
    {
        c.a(capturemessage);
    }

    public void setZoomInMessage(CaptureMessage capturemessage)
    {
        c.c(capturemessage);
    }

    public void takePicture()
    {
        super.takePicture();
        a();
    }

    private class _cls1 extends TimerTask
    {

        final a a;
        final AnimatedDocumentCaptureExperience b;

        public void run()
        {
            if (a == null)
            {
                return;
            } else
            {
                a.d(true);
                return;
            }
        }

        _cls1(a a1)
        {
            b = AnimatedDocumentCaptureExperience.this;
            a = a1;
            super();
        }
    }


    private class _cls2 extends TimerTask
    {

        final a a;
        final AnimatedDocumentCaptureExperience b;

        public void run()
        {
            if (a == null)
            {
                return;
            } else
            {
                a.b(false);
                return;
            }
        }

        _cls2(a a1)
        {
            b = AnimatedDocumentCaptureExperience.this;
            a = a1;
            super();
        }
    }

}
