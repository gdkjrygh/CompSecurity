// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.mrdc;

import android.app.Activity;
import android.os.AsyncTask;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.a.a;
import com.wf.wellsfargomobile.d.c;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.a.b.a.a.a.e;
import org.a.b.a.a.h;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.wf.wellsfargomobile.mrdc:
//            ImageModeType, e, c

public class b extends AsyncTask
{

    private final Activity a;
    private final ImageModeType b;

    public b(Activity activity, ImageModeType imagemodetype)
    {
        a = activity;
        b = imagemodetype;
    }

    static Activity a(b b1)
    {
        return b1.a;
    }

    static ImageModeType b(b b1)
    {
        return b1.b;
    }

    protected transient Boolean a(Void avoid[])
    {
        byte abyte0[];
        if (!ImageModeType.FRONT.equals(b))
        {
            break MISSING_BLOCK_LABEL_53;
        }
        abyte0 = WFApp.j();
        avoid = WFApp.k();
_L1:
        if (abyte0 != null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        avoid = Boolean.valueOf(false);
        if (ImageModeType.FRONT.equals(b))
        {
            WFApp.c(true);
            WFApp.a(null);
            return avoid;
        } else
        {
            WFApp.d(true);
            WFApp.b(null);
            return avoid;
        }
        abyte0 = WFApp.m();
        avoid = WFApp.l();
          goto _L1
        if (!ImageModeType.FRONT.equals(b)) goto _L3; else goto _L2
_L2:
        String s = (new StringBuilder()).append(com.wf.wellsfargomobile.a.a.a()).append("/deposit/submitFrontImage.action").toString();
_L10:
        h h1 = new h();
        if (!ImageModeType.FRONT.equals(b)) goto _L5; else goto _L4
_L4:
        h1.a("frontImage", new org.a.b.a.a.a.b(abyte0, "image/jpeg", "front.jpg"));
_L11:
        h1.a("WFAppId", new e(com.wf.wellsfargomobile.a.a.i(), Charset.forName("UTF-8")));
        if (avoid == null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        h1.a("imageCaptureResult", new e(avoid, Charset.forName("UTF-8")));
        avoid = (new com.wf.wellsfargomobile.d.a(c.b, s, null, null, a)).a(h1).b();
        if (!ImageModeType.FRONT.equals(b)) goto _L7; else goto _L6
_L6:
        WFApp.c(true);
_L13:
        avoid = avoid.b().toString().replace("/*--safejson--", "").replace("--safejson--*/", "");
        avoid = new JSONObject(avoid);
        if ("Failed".equals(avoid.getString("status")))
        {
            break MISSING_BLOCK_LABEL_499;
        }
        if (!ImageModeType.FRONT.equals(b)) goto _L9; else goto _L8
_L8:
        WFApp.f(avoid.getString("frontImageId"));
_L14:
        boolean flag = true;
_L15:
        if (ImageModeType.FRONT.equals(b))
        {
            WFApp.c(true);
            WFApp.a(null);
        } else
        {
            WFApp.d(true);
            WFApp.b(null);
        }
_L12:
        return Boolean.valueOf(flag);
_L3:
        s = (new StringBuilder()).append(com.wf.wellsfargomobile.a.a.a()).append("/deposit/submitBackImage.action").toString();
          goto _L10
_L5:
        h1.a("backImage", new org.a.b.a.a.a.b(abyte0, "image/jpeg", "back.jpg"));
          goto _L11
        avoid;
        if (ImageModeType.FRONT.equals(b))
        {
            WFApp.c(true);
            WFApp.a(null);
            flag = false;
        } else
        {
            WFApp.d(true);
            WFApp.b(null);
            flag = false;
        }
          goto _L12
_L7:
        WFApp.d(true);
          goto _L13
        avoid;
        if (ImageModeType.FRONT.equals(b))
        {
            WFApp.c(true);
            WFApp.a(null);
        } else
        {
            WFApp.d(true);
            WFApp.b(null);
        }
        throw avoid;
_L9:
        WFApp.g(avoid.getString("backImageId"));
          goto _L14
        avoid;
        flag = false;
          goto _L15
        flag = false;
          goto _L15
    }

    protected void a(Boolean boolean1)
    {
label0:
        {
            if (a instanceof BaseWebViewActivity)
            {
                if (!boolean1.booleanValue())
                {
                    break label0;
                }
                e.d(a, b);
            }
            return;
        }
        com.wf.wellsfargomobile.mrdc.e.a(a, b, a.getString(0x7f080055));
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }

    protected void onPreExecute()
    {
        a.runOnUiThread(new com.wf.wellsfargomobile.mrdc.c(this));
    }
}
