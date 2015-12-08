// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.mrdc.a;

import android.app.Activity;
import android.content.Intent;
import com.miteksystems.misnap.MiSnap;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.d.c;
import com.wf.wellsfargomobile.mrdc.ImageCaptureType;
import com.wf.wellsfargomobile.mrdc.ImageModeType;
import com.wf.wellsfargomobile.mrdc.d;
import com.wf.wellsfargomobile.mrdc.e;
import com.wf.wellsfargomobile.util.m;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.wf.wellsfargomobile.mrdc.a:
//            b

public class a
    implements d
{

    b a;

    public a()
    {
    }

    private void b(int i, int j, Intent intent, BaseWebViewActivity basewebviewactivity)
    {
        ImageModeType imagemodetype;
        imagemodetype = ImageModeType.FRONT;
        if (i == 12)
        {
            imagemodetype = ImageModeType.REAR;
        }
        if (j != -1 || intent == null) goto _L2; else goto _L1
_L1:
        if (com.wf.wellsfargomobile.mrdc.e.a(intent, imagemodetype, basewebviewactivity))
        {
            com.wf.wellsfargomobile.mrdc.e.a(basewebviewactivity, imagemodetype);
        }
_L4:
        return;
_L2:
        if (j == -1 && intent == null)
        {
            com.wf.wellsfargomobile.mrdc.e.e(basewebviewactivity, imagemodetype);
            return;
        }
        if (j != 0 || intent == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        d(intent);
        intent = c(intent);
        if (ImageCaptureType.USER_CANCELLED.equals(intent)) goto _L4; else goto _L3
_L3:
        com.wf.wellsfargomobile.mrdc.e.e(basewebviewactivity, imagemodetype);
        return;
        if (j != 0) goto _L4; else goto _L5
_L5:
        com.wf.wellsfargomobile.mrdc.e.e(basewebviewactivity, imagemodetype);
        return;
    }

    private JSONObject d(Activity activity, ImageModeType imagemodetype)
    {
        if (a == null)
        {
            e(activity, imagemodetype);
        }
        return a.a(imagemodetype);
    }

    private String e(Intent intent)
    {
        if (intent == null)
        {
            return null;
        } else
        {
            return intent.getStringExtra("com.miteksystems.misnap.ResultCode");
        }
    }

    private void e(Activity activity, ImageModeType imagemodetype)
    {
        LinkedHashMap linkedhashmap;
        linkedhashmap = new LinkedHashMap();
        linkedhashmap.put("WFAppId", com.wf.wellsfargomobile.a.a.i());
        linkedhashmap.put("nonce", WFApp.o());
        activity = (new com.wf.wellsfargomobile.d.a(c.a, (new StringBuilder()).append(com.wf.wellsfargomobile.a.a.a()).append("/deposit/getMiSnapParms.action").toString(), linkedhashmap, null, activity)).b();
        if (activity.b() == null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        activity = activity.b().toString();
_L1:
        activity = activity.replace("/*--safejson--", "").replace("--safejson--*/", "");
        a.a(imagemodetype);
        activity = new JSONObject(activity);
        a = new b();
        a.a(activity);
        return;
        activity = "";
          goto _L1
        activity;
        a = new b();
        return;
    }

    public void a()
    {
        a = null;
    }

    public void a(Activity activity, ImageModeType imagemodetype)
    {
        JSONObject jsonobject = d(activity, imagemodetype);
        Intent intent = new Intent(activity, com/miteksystems/misnap/MiSnap);
        intent.putExtra("com.miteksystems.misnap.JobSettings", jsonobject.toString());
        byte byte0 = 11;
        if (ImageModeType.REAR.equals(imagemodetype))
        {
            byte0 = 12;
        }
        activity.startActivityForResult(intent, byte0);
    }

    public void a(Activity activity, ImageModeType imagemodetype, String s)
    {
label0:
        {
            if (activity instanceof BaseWebViewActivity)
            {
                if (!ImageModeType.FRONT.equals(imagemodetype))
                {
                    break label0;
                }
                ((BaseWebViewActivity)activity).callJSShowfrontBtnError(s);
            }
            return;
        }
        ((BaseWebViewActivity)activity).callJSShowbackBtnError(s);
    }

    public boolean a(int i, int j, Intent intent, BaseWebViewActivity basewebviewactivity)
    {
        if (i == 11 || i == 12 || i == 3) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (i != 11 && i != 12) goto _L4; else goto _L3
_L3:
        b(i, j, intent, basewebviewactivity);
_L6:
        return true;
_L4:
        if (i != 3) goto _L6; else goto _L5
_L5:
        j;
        JVM INSTR tableswitch 10 19: default 104
    //                   10 17
    //                   11 17
    //                   12 104
    //                   13 104
    //                   14 104
    //                   15 104
    //                   16 40
    //                   17 106
    //                   18 40
    //                   19 117;
           goto _L7 _L1 _L1 _L7 _L7 _L7 _L7 _L6 _L8 _L6 _L9
_L7:
        return false;
_L8:
        com.wf.wellsfargomobile.mrdc.e.a(basewebviewactivity, ImageModeType.FRONT);
          goto _L6
_L9:
        com.wf.wellsfargomobile.mrdc.e.a(basewebviewactivity, ImageModeType.REAR);
          goto _L6
    }

    public byte[] a(Intent intent)
    {
        if (intent == null)
        {
            return null;
        } else
        {
            return intent.getByteArrayExtra("com.miteksystems.misnap.PICTURE");
        }
    }

    public String b(Intent intent)
    {
        if (intent == null)
        {
            return null;
        } else
        {
            return intent.getStringExtra("com.miteksystems.misnap.MIBI_DATA");
        }
    }

    public void b(Activity activity, ImageModeType imagemodetype)
    {
label0:
        {
            if (activity instanceof BaseWebViewActivity)
            {
                if (!ImageModeType.FRONT.equals(imagemodetype))
                {
                    break label0;
                }
                imagemodetype = m.a(WFApp.v());
                ((BaseWebViewActivity)activity).callJSFrontImageShowSpinner(imagemodetype);
            }
            return;
        }
        imagemodetype = m.a(WFApp.w());
        ((BaseWebViewActivity)activity).callJSBackImageShowSpinner(imagemodetype);
    }

    public ImageCaptureType c(Intent intent)
    {
        if (intent == null)
        {
            intent = ImageCaptureType.NONE;
        } else
        {
            String s = e(intent);
            if (s == null)
            {
                return ImageCaptureType.NONE;
            }
            intent = ImageCaptureType.OTHER;
            if (s.equals("SuccessVideo"))
            {
                return ImageCaptureType.VIDEO;
            }
            if (s.equals("SuccessStillCamera"))
            {
                return ImageCaptureType.STILL;
            }
            if (s.equals("CameraNotSufficient"))
            {
                return ImageCaptureType.INSUFFICIENT_CAMERA;
            }
            if (s.equals("Cancelled"))
            {
                return ImageCaptureType.USER_CANCELLED;
            }
        }
        return intent;
    }

    public void c(Activity activity, ImageModeType imagemodetype)
    {
label0:
        {
            if (activity instanceof BaseWebViewActivity)
            {
                if (!ImageModeType.FRONT.equals(imagemodetype))
                {
                    break label0;
                }
                ((BaseWebViewActivity)activity).callJSHideFrontBtnSpinner();
            }
            return;
        }
        ((BaseWebViewActivity)activity).callJSHideBackBtnSpinner();
    }

    public void d(Intent intent)
    {
        e(intent);
    }
}
