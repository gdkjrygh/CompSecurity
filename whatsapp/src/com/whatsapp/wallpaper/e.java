// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.wallpaper;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Debug;
import android.widget.ImageView;
import com.whatsapp.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp.wallpaper:
//            WallpaperPicker, ImageViewTouchBase

class e extends AsyncTask
{

    private static final String z[];
    android.graphics.BitmapFactory.Options a;
    final WallpaperPicker b;

    e(WallpaperPicker wallpaperpicker)
    {
        b = wallpaperpicker;
        super();
        a = new android.graphics.BitmapFactory.Options();
        a.inDither = false;
        a.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        a.inSampleSize = 2;
    }

    protected Bitmap a(Integer ainteger[])
    {
        boolean flag;
        try
        {
            flag = isCancelled();
        }
        // Misplaced declaration of an exception variable
        catch (Integer ainteger[])
        {
            throw ainteger;
        }
        if (flag)
        {
            return null;
        }
        Bitmap bitmap = BitmapFactory.decodeResource(b.a.getResourcesForApplication(z[0]), ((Integer)WallpaperPicker.d(b).get(ainteger[0].intValue())).intValue(), a);
        return bitmap;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        a.inSampleSize = 3;
        Log.e((new StringBuilder()).append(z[3]).append(outofmemoryerror.toString()).toString());
        ainteger = BitmapFactory.decodeResource(b.a.getResourcesForApplication(z[4]), ((Integer)WallpaperPicker.d(b).get(ainteger[0].intValue())).intValue(), a);
        return ainteger;
        ainteger;
        Log.e((new StringBuilder()).append(z[1]).append(Debug.getNativeHeapAllocatedSize() / 1024L).append(z[5]).toString());
_L2:
        return null;
        ainteger;
        Log.e((new StringBuilder()).append(z[2]).append(ainteger.toString()).toString());
        return null;
        ainteger;
        if (true) goto _L2; else goto _L1
_L1:
    }

    void a()
    {
        a.requestCancelDecode();
        super.cancel(true);
    }

    protected void a(Bitmap bitmap)
    {
        if (bitmap != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (isCancelled() || a.mCancel)
        {
            break; /* Loop/switch isn't completed */
        }
        if (WallpaperPicker.c(b) != null)
        {
            WallpaperPicker.c(b).recycle();
        }
        ImageView imageview = WallpaperPicker.a(b);
        imageview.setImageBitmap(bitmap);
        WallpaperPicker.a(b, bitmap);
        Drawable drawable = imageview.getDrawable();
        drawable.setFilterBitmap(true);
        drawable.setDither(true);
        imageview.postInvalidate();
        WallpaperPicker.a(b, null);
        if (!ImageViewTouchBase.e) goto _L1; else goto _L3
_L3:
        bitmap.recycle();
        return;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Integer[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Bitmap)obj);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "Yce29Rm|o/J|&k/V`x}>_~";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "M|Wl'Ygmn\021Uce1 [xaj+\032dm}>\032\177af+\032";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "M|Wl'Ygmn";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "M|Wl'Ygmn";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "Yce29Rm|o/J|&k/V`x}>_~";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\032gJ";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 239
    //                   1 246
    //                   2 253
    //                   3 260;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_260;
_L3:
        byte byte1 = 78;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 58;
          goto _L9
_L5:
        byte1 = 12;
          goto _L9
_L6:
        byte1 = 8;
          goto _L9
        byte1 = 28;
          goto _L9
    }
}
