// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.photobillpay;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.kofax.kmc.ken.engines.ImageProcessor;
import com.kofax.kmc.ken.engines.data.ImagePerfectionProfile;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.webview.a.b;
import com.wf.wellsfargomobile.webview.a.c;
import java.io.File;
import java.util.Timer;

// Referenced classes of package com.wf.wellsfargomobile.photobillpay:
//            a, h, u, e, 
//            l, g, k

public class d extends c
    implements com.kofax.kmc.ken.engines.ImageProcessor.ImageOutListener
{

    public static String a = "_DoBinarization__DoCropCorrection__DoSkewCorrectionAlt__Do90DegreeRotation_4_LoadSetting_<Property Name=\"CSkewDetect.convert_to_gray.Bool\" Value=\"1\" Comment=\"DEFAULT 0 \" />_LoadSetting_<Property Name=\"CSkewDetect.scale_image_down.Bool\" Value=\"1\" Comment=\"DEFAULT 0 \" />_LoadSetting_<Property Name=\"CSkewDetect.scale_down_factor.Int\" Value=\"80\"  Comment=\"DEFAULT  80:60 or  4:3 \" />_LoadSetting_<Property Name=\"CSkewDetect.document_size.Int\" Value=\"2\" Comment=\"MEDIUM, DEFAULT  0\" />_LoadSetting_<Property Name=\"CSkewDetect.correct_illumination.Bool\" Value = \"0\"/>_LoadSetting_<Property Name=\"CSkewDetect.thr_crop_crop\" Value=\"3\" Comment=\"DEFAULT 18 \" />";
    public static String b;
    public static String c;
    private static final String g;
    public boolean d;
    protected Bundle e;
    protected BaseWebViewActivity f;
    private boolean h;
    private boolean i;

    public d()
    {
        e = null;
        i = false;
    }

    static void a(d d1)
    {
        d1.f();
    }

    static void a(d d1, k k)
    {
        d1.a(k);
    }

    static void a(d d1, String s)
    {
        d1.a(s);
    }

    private void a(k k)
    {
        g();
        com.wf.wellsfargomobile.photobillpay.a.b("invalid_error");
    }

    private void a(String s)
    {
        f.loadURL(s);
    }

    static boolean a(d d1, boolean flag)
    {
        d1.h = flag;
        return flag;
    }

    public static void d()
    {
        (new h()).execute(new Void[0]);
    }

    public static void e()
    {
        if (!(new File(g)).delete());
    }

    private void f()
    {
        if (!h)
        {
            d = true;
            g();
            com.wf.wellsfargomobile.photobillpay.a.b("response_timeout_error");
            f.hideProgressDialog();
        }
        d();
    }

    private void g()
    {
        if (b != null && c != null && c != null && !c.trim().isEmpty())
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append(c);
            stringbuilder.append("(");
            stringbuilder.append("true");
            stringbuilder.append(", '");
            stringbuilder.append(b);
            stringbuilder.append("');");
            if (f.webview != null)
            {
                f.loadJavaScript(stringbuilder.toString());
            }
        }
    }

    private void h()
    {
        com.kofax.kmc.ken.engines.data.Image image = com.wf.wellsfargomobile.photobillpay.u.c();
        ImageProcessor imageprocessor = new ImageProcessor();
        imageprocessor.addImageOutEventListener(this);
        ImagePerfectionProfile imageperfectionprofile = new ImagePerfectionProfile();
        imageperfectionprofile.setIpOperations(a);
        imageprocessor.setImagePerfectionProfile(imageperfectionprofile);
        imageprocessor.setProcessedImageMimeType(com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_TIFF);
        try
        {
            imageprocessor.processImage(image);
            return;
        }
        catch (KmcException kmcexception)
        {
            com.wf.wellsfargomobile.photobillpay.a.b("camera_error");
        }
        j();
    }

    private void i()
    {
        com.kofax.kmc.ken.engines.data.Image image = com.wf.wellsfargomobile.photobillpay.u.c();
        e();
        ImageProcessor imageprocessor = new ImageProcessor();
        imageprocessor.addImageOutEventListener(this);
        ImagePerfectionProfile imageperfectionprofile = new ImagePerfectionProfile();
        imageperfectionprofile.setIpOperations(a);
        imageprocessor.setImagePerfectionProfile(imageperfectionprofile);
        imageprocessor.setProcessedImageRepresentation(com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_FILE);
        imageprocessor.setProcessedImageFilePath(g);
        imageprocessor.setProcessedImageMimeType(com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_TIFF);
        try
        {
            imageprocessor.processImage(image);
            return;
        }
        catch (KmcException kmcexception)
        {
            j();
        }
    }

    private void j()
    {
        com.wf.wellsfargomobile.photobillpay.a.b("camera_error");
        g();
        f.hideProgressDialog();
    }

    public int a()
    {
        return 70;
    }

    public b a(int k, int i1, Intent intent, BaseWebViewActivity basewebviewactivity)
    {
        b b1;
        b1 = new b();
        f = basewebviewactivity;
        i = false;
        e = intent.getExtras();
        if (e != null)
        {
            b = e.getString("activitySource");
            c = e.getString("callBackFunctionName");
        }
        i1;
        JVM INSTR tableswitch 33 34: default 84
    //                   33 105
    //                   34 87;
           goto _L1 _L2 _L3
_L1:
        return b1;
_L3:
        b1.a(false);
        basewebviewactivity.showProgressDialog();
        h();
        return b1;
_L2:
        b1.a(false);
        if (intent.getBooleanExtra("error", false))
        {
            j();
            return b1;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public int[] b()
    {
        return (new int[] {
            33, 34
        });
    }

    public int[] c()
    {
        return new int[0];
    }

    public void imageOut(com.kofax.kmc.ken.engines.ImageProcessor.ImageOutEvent imageoutevent)
    {
        if (!imageoutevent.getStatus().equals(ErrorInfo.KMC_SUCCESS))
        {
            if (imageoutevent.getStatus().equals(ErrorInfo.KMC_GN_OUT_OF_MEMORY))
            {
                if (i)
                {
                    j();
                    return;
                } else
                {
                    i = true;
                    i();
                    return;
                }
            } else
            {
                j();
                return;
            }
        }
        String s = e.getString("actionMethod");
        long l2 = e.getLong("responseWaitTimoutSeconds", 30L);
        if (s == null)
        {
            j();
            return;
        }
        imageoutevent = imageoutevent.getImage();
        if (imageoutevent == null)
        {
            j();
            return;
        } else
        {
            com.wf.wellsfargomobile.photobillpay.a.a(b);
            d = false;
            h = false;
            (new Timer("PhotoBillPayImageResponseTimer", true)).schedule(new e(this), l2 * 1000L);
            l l1 = new l();
            l1.a = imageoutevent;
            l1.b = i;
            (new g(this, f, s, b)).execute(new l[] {
                l1
            });
            return;
        }
    }

    static 
    {
        g = (new StringBuilder()).append(WFApp.g.getFilesDir()).append("/bitonal_img.tif").toString();
    }
}
