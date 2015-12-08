// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.mrdc;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.util.Log;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.mrdc.a.a;
import com.wf.wellsfargomobile.util.m;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.wf.wellsfargomobile.mrdc:
//            d, h, ImageModeType, f, 
//            g, ReviewCheckImageActivity

public class e
{

    private static d a = new a();

    private static Bitmap a(Activity activity, byte abyte0[], ImageModeType imagemodetype)
    {
        activity = new android.graphics.BitmapFactory.Options();
        activity.inSampleSize = 3;
        try
        {
            imagemodetype = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, activity);
        }
        // Misplaced declaration of an exception variable
        catch (ImageModeType imagemodetype)
        {
            activity.inSampleSize = 5;
            return BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, activity);
        }
        return imagemodetype;
    }

    public static void a()
    {
        a.a();
    }

    public static void a(Activity activity, ImageModeType imagemodetype)
    {
        a.a(activity, imagemodetype);
    }

    protected static final void a(Activity activity, ImageModeType imagemodetype, String s)
    {
        a.a(activity, imagemodetype, s);
    }

    public static void a(BaseWebViewActivity basewebviewactivity, ImageModeType imagemodetype)
    {
        com.wf.wellsfargomobile.mrdc.h.a[imagemodetype.ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 33
    //                   2 75;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (WFApp.j() != null && WFApp.t() != null && WFApp.v() != null)
        {
            (new Handler()).postDelayed(new f(basewebviewactivity, imagemodetype), 200L);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (WFApp.m() != null && WFApp.u() != null && WFApp.w() != null)
        {
            (new Handler()).postDelayed(new g(basewebviewactivity, imagemodetype), 200L);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public static boolean a(int i, int j, Intent intent, BaseWebViewActivity basewebviewactivity)
    {
        return a.a(i, j, intent, basewebviewactivity);
    }

    public static boolean a(Intent intent, ImageModeType imagemodetype, BaseWebViewActivity basewebviewactivity)
    {
        byte abyte0[] = a.a(intent);
        String s = a.b(intent);
        intent = a.c(intent);
        if (abyte0 == null || abyte0.length == 0)
        {
            Log.e("ImageCaptureSystemFacad", "No image data was returned by ImageCaptureSystem in Intent.");
            e(basewebviewactivity, imagemodetype);
            return false;
        }
        b(basewebviewactivity, imagemodetype);
        Bitmap bitmap = a(((Activity) (basewebviewactivity)), abyte0, imagemodetype);
        basewebviewactivity = a(basewebviewactivity, bitmap);
        switch (com.wf.wellsfargomobile.mrdc.h.a[imagemodetype.ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
            WFApp.a(abyte0);
            WFApp.a(bitmap);
            WFApp.c(basewebviewactivity);
            WFApp.b(s);
            WFApp.a(intent);
            return true;

        case 2: // '\002'
            WFApp.b(abyte0);
            break;
        }
        WFApp.b(bitmap);
        WFApp.d(basewebviewactivity);
        WFApp.c(s);
        return true;
    }

    private static byte[] a(BaseWebViewActivity basewebviewactivity, Bitmap bitmap)
    {
        Bitmap bitmap1;
        basewebviewactivity = basewebviewactivity.getResources();
        int i = basewebviewactivity.getDimensionPixelOffset(0x7f090054);
        if (WFApp.d())
        {
            i = basewebviewactivity.getDimensionPixelOffset(0x7f090055);
        }
        bitmap1 = m.a(bitmap, i);
        basewebviewactivity = new ByteArrayOutputStream();
        bitmap1.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, basewebviewactivity);
        bitmap = basewebviewactivity.toByteArray();
        try
        {
            bitmap1.recycle();
        }
        catch (Exception exception) { }
        finally
        {
            throw basewebviewactivity;
        }
        try
        {
            basewebviewactivity.close();
        }
        // Misplaced declaration of an exception variable
        catch (BaseWebViewActivity basewebviewactivity)
        {
            return bitmap;
        }
        finally
        {
            throw basewebviewactivity;
        }
        return bitmap;
        bitmap;
        try
        {
            bitmap1.recycle();
        }
        catch (Exception exception1) { }
        finally
        {
            throw basewebviewactivity;
        }
        try
        {
            basewebviewactivity.close();
        }
        // Misplaced declaration of an exception variable
        catch (BaseWebViewActivity basewebviewactivity) { }
        finally
        {
            throw basewebviewactivity;
        }
        throw bitmap;
    }

    public static void b(Activity activity, ImageModeType imagemodetype)
    {
        Intent intent = new Intent(activity.getBaseContext(), com/wf/wellsfargomobile/mrdc/ReviewCheckImageActivity);
        intent.putExtra("MRDC_FLOW_STATE", imagemodetype);
        activity.startActivityForResult(intent, 3);
    }

    private static void b(BaseWebViewActivity basewebviewactivity, ImageModeType imagemodetype)
    {
        switch (com.wf.wellsfargomobile.mrdc.h.a[imagemodetype.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            WFApp.g();
            return;

        case 2: // '\002'
            WFApp.h();
            break;
        }
    }

    protected static final void c(Activity activity, ImageModeType imagemodetype)
    {
        a.b(activity, imagemodetype);
    }

    protected static final void d(Activity activity, ImageModeType imagemodetype)
    {
        a.c(activity, imagemodetype);
    }

    public static void e(Activity activity, ImageModeType imagemodetype)
    {
        a.a(activity, imagemodetype, activity.getString(0x7f0800ad));
    }

}
