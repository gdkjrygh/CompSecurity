// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.mrdc.a;

import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.mrdc.ImageModeType;
import com.wf.wellsfargomobile.util.u;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class b
{

    String a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    int k;
    int l;
    int m;
    int n;
    int o;
    int p;
    String q;
    String r;
    String s;
    String t;
    String u;
    int v;
    int w;
    private final String x = "MiSnapMBAParams";

    public b()
    {
        a();
    }

    public JSONObject a(ImageModeType imagemodetype)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("AnimationRectangleColor", b());
            jsonobject.put("AnimationRectangleCornerRadius", c());
            jsonobject.put("AnimationRectangleStrokeWidth", d());
            jsonobject.put("AutoCaptureFailoverToStillCapture", e());
            jsonobject.put("CameraGuideImageEnabled", f());
            jsonobject.put("CameraGuideImageStillCameraEnabled", g());
            jsonobject.put("CameraInitialTimeoutInSeconds", h());
            jsonobject.put("CameraMaxTimeouts", i());
            jsonobject.put("CameraTimeoutInSeconds", j());
            jsonobject.put("CaptureMode", v());
            jsonobject.put("CameraSharpness", u());
            jsonobject.put("CameraViewfinderMinHorizontalFill", t());
            jsonobject.put("MiSnapTutorialAcknowledgementEnabled", w());
            jsonobject.put("RequiredCompressionLevel", k());
            jsonobject.put("RequiredMaxImageHeightAndWidth", l());
            jsonobject.put("TutorialBackgroundColor", m());
            jsonobject.put("TutorialBackgroundColorFailoverToStillCamera", n());
            jsonobject.put("TutorialBackgroundColorFirstTimeUser", o());
            jsonobject.put("TutorialBackgroundColorStillCamera", p());
            jsonobject.put("TutorialBackgroundColorStillCameraFirstTimeUser", q());
            jsonobject.put("TutorialBrandNewUserDuration", r());
            jsonobject.put("UnnecessaryScreenTouchLimit", s());
            a(jsonobject, imagemodetype);
        }
        // Misplaced declaration of an exception variable
        catch (ImageModeType imagemodetype)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    void a()
    {
        a("5174B8");
        a(8);
        b(6);
        c(1);
        d(1);
        e(1);
        f(20);
        g(0);
        p(2);
        o(600);
        n(800);
        q(0);
        h(30);
        i(500);
        j(50);
        k(1600);
        b("FFFFFF");
        c("FFFFFF");
        d("FFFFFF");
        e("FFFFFF");
        f("FFFFFF");
        l(5000);
        m(3);
    }

    void a(int i1)
    {
        b = i1;
    }

    void a(String s1)
    {
        a = s1;
    }

    void a(JSONObject jsonobject, ImageModeType imagemodetype)
    {
label0:
        {
            String s1;
            String s2;
            if (com.wf.wellsfargomobile.util.u.a() || com.wf.wellsfargomobile.util.u.b() && com.wf.wellsfargomobile.util.u.c().equalsIgnoreCase("4.4.3"))
            {
                jsonobject.put("CameraVideoAutoCaptureProcess", "0");
                jsonobject.put("AllowVideoFrames", "0");
            } else
            {
                jsonobject.put("AllowVideoFrames", "1");
            }
            if (com.wf.wellsfargomobile.util.u.h() || com.wf.wellsfargomobile.util.u.a())
            {
                jsonobject.put("CaptureMode", "1");
            } else
            {
                jsonobject.put("CaptureMode", "2");
            }
            if (com.wf.wellsfargomobile.util.u.f() || com.wf.wellsfargomobile.util.u.g() || com.wf.wellsfargomobile.util.u.e())
            {
                jsonobject.put("LightingVideo", 2);
            }
            s1 = "CheckFront";
            if (ImageModeType.REAR.equals(imagemodetype))
            {
                s1 = "CheckBack";
            }
            s2 = WFApp.ad();
            if (s2 != null)
            {
                imagemodetype = s2;
                if (s2.length() != 0)
                {
                    break label0;
                }
            }
            imagemodetype = WFApp.ab().toString();
        }
        jsonobject.put("Locale", imagemodetype);
        jsonobject.put("Name", s1);
    }

    boolean a(JSONObject jsonobject)
    {
        try
        {
            a(jsonobject.getString("AnimationRectangleColor"));
            b(jsonobject.getString("TutorialBackgroundColor"));
            c(jsonobject.getString("TutorialBackgroundColorFailoverToStillCamera"));
            d(jsonobject.getString("TutorialBackgroundColorFirstTimeUser"));
            e(jsonobject.getString("TutorialBackgroundColorStillCamera"));
            f(jsonobject.getString("TutorialBackgroundColorStillCameraFirstTimeUser"));
            a(jsonobject.getInt("AnimationRectangleCornerRadius"));
            b(jsonobject.getInt("AnimationRectangleStrokeWidth"));
            c(jsonobject.getInt("AutoCaptureFailoverToStillCapture"));
            d(jsonobject.getInt("CameraGuideImageEnabled"));
            e(jsonobject.getInt("CameraGuideImageStillCameraEnabled"));
            f(jsonobject.getInt("CameraInitialTimeoutInSeconds"));
            g(jsonobject.getInt("CameraMaxTimeouts"));
            p(jsonobject.getInt("CaptureMode"));
            o(jsonobject.getInt("CameraSharpness"));
            n(jsonobject.getInt("CameraViewfinderMinHorizontalFill"));
            q(jsonobject.getInt("MiSnapTutorialAcknowledgementEnabled"));
            h(jsonobject.getInt("CameraTimeoutInSeconds"));
            i(jsonobject.getInt("CameraViewfinderMinFill"));
            j(jsonobject.getInt("RequiredCompressionLevel"));
            k(jsonobject.getInt("RequiredMaxImageHeightAndWidth"));
            l(jsonobject.getInt("TutorialBrandNewUserDuration"));
            m(jsonobject.getInt("UnnecessaryScreenTouchLimit"));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw jsonobject;
        }
        return false;
    }

    String b()
    {
        return a;
    }

    void b(int i1)
    {
        c = i1;
    }

    void b(String s1)
    {
        q = s1;
    }

    int c()
    {
        return b;
    }

    void c(int i1)
    {
        d = i1;
    }

    void c(String s1)
    {
        r = s1;
    }

    int d()
    {
        return c;
    }

    void d(int i1)
    {
        e = i1;
    }

    void d(String s1)
    {
        s = s1;
    }

    int e()
    {
        return d;
    }

    void e(int i1)
    {
        f = i1;
    }

    void e(String s1)
    {
        t = s1;
    }

    int f()
    {
        return e;
    }

    void f(int i1)
    {
        g = i1;
    }

    void f(String s1)
    {
        u = s1;
    }

    int g()
    {
        return f;
    }

    void g(int i1)
    {
        h = i1;
    }

    int h()
    {
        return g;
    }

    void h(int i1)
    {
        i = i1;
    }

    int i()
    {
        return h;
    }

    void i(int i1)
    {
        j = i1;
    }

    int j()
    {
        return i;
    }

    void j(int i1)
    {
        k = i1;
    }

    int k()
    {
        return k;
    }

    void k(int i1)
    {
        l = i1;
    }

    int l()
    {
        return l;
    }

    void l(int i1)
    {
        v = i1;
    }

    String m()
    {
        return q;
    }

    void m(int i1)
    {
        w = i1;
    }

    String n()
    {
        return r;
    }

    void n(int i1)
    {
        m = i1;
    }

    String o()
    {
        return s;
    }

    void o(int i1)
    {
        n = i1;
    }

    String p()
    {
        return t;
    }

    void p(int i1)
    {
        o = i1;
    }

    String q()
    {
        return u;
    }

    public void q(int i1)
    {
        p = i1;
    }

    int r()
    {
        return v;
    }

    int s()
    {
        return w;
    }

    int t()
    {
        return m;
    }

    int u()
    {
        return n;
    }

    int v()
    {
        return o;
    }

    public int w()
    {
        return p;
    }
}
