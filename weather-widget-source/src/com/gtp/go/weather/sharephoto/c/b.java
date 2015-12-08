// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.service.a.a;
import com.gtp.a.a.b.c;
import com.gtp.go.weather.sharephoto.a.g;
import com.gtp.go.weather.sharephoto.award.k;
import com.gtp.go.weather.sharephoto.b.e;
import com.gtp.go.weather.sharephoto.b.l;
import com.gtp.go.weather.sharephoto.b.o;
import com.gtp.go.weather.sharephoto.takephoto.ab;
import com.gtp.go.weather.sharephoto.takephoto.ao;
import com.gtp.go.weather.sharephoto.takephoto.s;
import com.jiubang.ggheart.apps.desks.diy.filter.core.FilterParameter;
import com.jiubang.ggheart.apps.desks.diy.filter.core.FilterParameterBuidler;
import com.jiubang.ggheart.apps.desks.diy.filter.core.FilterService;
import com.jiubang.goweather.b.d;
import com.jiubang.goweather.b.f;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.gtp.go.weather.sharephoto.c:
//            c

public class b extends a
{

    private String a;
    private String b;
    private String c;
    private Location d;
    private HashMap e;
    private s f;
    private f g;
    private l h;
    private e i;
    private Context j;
    private Bitmap k;

    public b(Context context)
    {
        j = context.getApplicationContext();
        i = new e();
        g = new f();
        e = new HashMap();
    }

    static Context a(b b1)
    {
        return b1.j;
    }

    private File a(File file, Bitmap bitmap, int i1)
    {
        long l1 = System.currentTimeMillis();
        android.graphics.Bitmap.CompressFormat compressformat = ab.a(file);
        File file1 = new File((new StringBuilder()).append(file.getAbsolutePath()).append(".tmp").toString());
        if (ab.a(bitmap, file1, compressformat, i1))
        {
            file.delete();
            file1.renameTo(file);
        }
        long l2 = System.currentTimeMillis();
        com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("overrideSaveImage: ").append(l2 - l1).toString());
        return file;
    }

    private void a(File file)
    {
        if (file != null && file.exists()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l2 = System.currentTimeMillis();
        Object obj = ab.a(file);
        long l3 = file.length();
        com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("checkBigImageFile ==> quality: 100, size: ").append(l3 / 1024L).append("kb").toString());
        float f1;
        int i1;
        long l1;
        if (android.graphics.Bitmap.CompressFormat.PNG.equals(obj))
        {
            l1 = 0xc8000L;
        } else
        {
            l1 = 0x46000L;
        }
        if (l3 < l1) goto _L1; else goto _L3
_L3:
        if (!android.graphics.Bitmap.CompressFormat.PNG.equals(obj)) goto _L5; else goto _L4
_L4:
        com.gtp.a.a.b.c.a("PublishPhotoTask", "\u900F\u660E\u56FE, \u901A\u8FC7\u7F29\u5C0F\u56FE\u7247\u51CF\u5C0F\u6587\u4EF6\u4F53\u79EF");
        f1 = (1.0F * (float)l1) / (float)l3;
        if (k == null)
        {
            obj = new android.graphics.BitmapFactory.Options();
            obj.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), ((android.graphics.BitmapFactory.Options) (obj)));
            k = ab.a(file.getAbsolutePath(), (int)((float)((android.graphics.BitmapFactory.Options) (obj)).outWidth * f1), (int)(f1 * (float)((android.graphics.BitmapFactory.Options) (obj)).outHeight));
        } else
        {
            obj = ab.a(k, (int)((float)k.getWidth() * f1), (int)(f1 * (float)k.getHeight()));
            if (obj != null && obj != k)
            {
                k.recycle();
                k = ((Bitmap) (obj));
            }
        }
        obj = file;
        if (k != null)
        {
            obj = a(file, k, 100);
            com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("H: ").append(k.getHeight()).append(", w: ").append(k.getWidth()).toString());
        }
_L7:
        l1 = System.currentTimeMillis();
        com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("checkBigImageFile ==> costTime: ").append(l1 - l2).toString());
        com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("checkBigImageFile ==> after size: ").append(((File) (obj)).length() / 1024L).append("kb").toString());
        return;
_L5:
        com.gtp.a.a.b.c.a("PublishPhotoTask", "\u975E\u900F\u660E\u56FE, \u901A\u8FC7\u964D\u4F4E\u56FE\u7247\u8D28\u91CF\u51CF\u5C0F\u6587\u4EF6\u4F53\u79EF");
        if (k == null)
        {
            obj = new android.graphics.BitmapFactory.Options();
            obj.inPurgeable = true;
            k = BitmapFactory.decodeFile(file.getAbsolutePath(), ((android.graphics.BitmapFactory.Options) (obj)));
        }
        obj = file;
        if (k == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = 90;
        obj = file;
        do
        {
            file = a(((File) (obj)), k, i1);
            l3 = file.length();
            com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("checkBigImageFile ==> quality: ").append(i1).append(", size: ").append(l3 / 1024L).append("kb").toString());
            i1 -= 10;
            obj = file;
            if (i1 < 10)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = file;
        } while (l3 > l1);
        obj = file;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static e b(b b1)
    {
        return b1.i;
    }

    private void b(File file)
    {
        int k1;
        int l1;
        if (k == null)
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            l1 = options.outHeight;
            k1 = options.outWidth;
        } else
        {
            l1 = k.getHeight();
            k1 = k.getWidth();
        }
        break MISSING_BLOCK_LABEL_41;
        while (true) 
        {
            do
            {
                return;
            } while (l1 >= 720 && k1 >= 720 || l1 >= f.b() && k1 >= f.c());
            int i1;
            int j1;
label0:
            {
                if (k == null)
                {
                    android.graphics.BitmapFactory.Options options1 = new android.graphics.BitmapFactory.Options();
                    options1.inJustDecodeBounds = false;
                    k = BitmapFactory.decodeFile(file.getAbsolutePath(), options1);
                }
                if (k == null)
                {
                    continue;
                }
                DisplayMetrics displaymetrics = j.getResources().getDisplayMetrics();
                j1 = Math.max(displaymetrics.heightPixels, displaymetrics.widthPixels);
                i1 = Math.min(displaymetrics.heightPixels, displaymetrics.widthPixels);
                int k2 = Math.min(j1 * 2, 1600);
                int l2 = Math.min(i1 * 2, 1200);
                i1 = f.c();
                int i2 = Math.max(i1, f.b());
                int j2 = Math.min(i1, i2);
                if (j2 <= l2)
                {
                    i1 = i2;
                    j1 = j2;
                    if (i2 <= k2)
                    {
                        break label0;
                    }
                }
                float f1 = Math.min(((float)k2 * 1.0F) / (float)i2, ((float)l2 * 1.0F) / (float)j2);
                j1 = (int)((float)j2 * f1);
                i1 = (int)((float)i2 * f1);
            }
            if (l1 < k1)
            {
                j1 = i1;
            }
            Bitmap bitmap = ab.a(k, j1, i1);
            if (bitmap != null && bitmap != k)
            {
                a(file, bitmap, 100);
                k.recycle();
                k = bitmap;
                return;
            }
        }
    }

    private File c(File file)
    {
        android.graphics.BitmapFactory.Options options;
        DisplayMetrics displaymetrics;
        int i1;
        int j1;
        int k1;
        int i2;
        long l2;
        l2 = System.currentTimeMillis();
        if (file == null || !file.exists())
        {
            return file;
        }
        com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("optimizeImage ==>before size: ").append(file.length() / 1024L).append("kb").toString());
        displaymetrics = j.getResources().getDisplayMetrics();
        i1 = Math.max(displaymetrics.heightPixels, displaymetrics.widthPixels);
        j1 = Math.min(displaymetrics.heightPixels, displaymetrics.widthPixels);
        i1 = Math.min(i1 * 2, 1600);
        j1 = Math.min(j1 * 2, 1200);
        com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("maxH: ").append(i1).append(", maxW: ").append(j1).toString());
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("inTargetDensity: ").append(options.inTargetDensity).append(", inDensity: ").append(options.inDensity).toString());
        i2 = Math.max(options.outHeight, options.outWidth);
        k1 = Math.min(options.outHeight, options.outWidth);
        com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("imgH: ").append(i2).append(", imgW: ").append(k1).toString());
        com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("outMimeType: ").append(options.outMimeType).toString());
        options.inSampleSize = 1;
        if (i2 <= i1 && k1 <= j1) goto _L2; else goto _L1
_L1:
        for (; i2 / options.inSampleSize > i1 || k1 / options.inSampleSize > j1; options.inSampleSize = options.inSampleSize * 2) { }
        com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("inSampleSize: ").append(options.inSampleSize).toString());
        int l1 = (int)Math.pow(2D, options.inSampleSize / 2);
        com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("finalSample: ").append(l1).toString());
        i2 /= l1;
        k1 /= l1;
        com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("sampleH: ").append(i2).append(", sampleW: ").append(k1).toString());
        if (i2 < i1 || k1 < j1)
        {
            float f1 = Math.min(Math.max(((float)i1 * 1.0F) / (float)i2, ((float)j1 * 1.0F) / (float)k1), Math.min(((float)i1 * 1.0F) / (float)i2, ((float)j1 * 1.0F) / (float)k1));
            com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("scale: ").append(f1).toString());
            options.inDensity = displaymetrics.densityDpi;
            options.inTargetDensity = (int)((float)options.inDensity * f1);
        }
        options.inJustDecodeBounds = false;
        options.inScaled = true;
        options.inPurgeable = true;
        long l3 = System.currentTimeMillis();
        k = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        long l5 = System.currentTimeMillis();
        com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("decodeImageFile time: ").append(l5 - l3).toString());
_L4:
        com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("inTargetDensity: ").append(options.inTargetDensity).append(", inDensity: ").append(options.inDensity).toString());
        if (k != null)
        {
            com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("imgH: ").append(k.getHeight()).append(", imgW: ").append(k.getWidth()).toString());
        }
_L2:
        long l4 = System.currentTimeMillis();
        com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("optimizeImage ==>costTime: ").append(l4 - l2).toString());
        return file;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        if (com.gtp.a.a.b.c.a())
        {
            outofmemoryerror.printStackTrace();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private String f()
    {
        JSONObject jsonobject;
        Object obj;
        Iterator iterator;
        jsonobject = new JSONObject();
        obj = new JSONArray();
        iterator = e.entrySet().iterator();
        while (iterator.hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            JSONObject jsonobject1 = new JSONObject();
            jsonobject1.put("lang", entry.getKey());
            jsonobject1.put("address", entry.getValue());
            ((JSONArray) (obj)).put(jsonobject1);
        }
          goto _L1
_L3:
        return jsonobject.toString();
_L1:
        try
        {
            jsonobject.put("latlng", (new StringBuilder()).append(d.getLatitude()).append(",").append(d.getLongitude()).toString());
            jsonobject.put("multiLangInfo", obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (com.gtp.a.a.b.c.a())
            {
                ((JSONException) (obj)).printStackTrace();
            }
        }
        if (true) goto _L3; else goto _L2
_L2:
    }

    public void a()
    {
        long l2;
        l2 = System.currentTimeMillis();
        if (TextUtils.isEmpty(a))
        {
            a = com.gtp.go.weather.sharephoto.a.g.b(j).a();
        }
        if (!TextUtils.isEmpty(a)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        float f1;
        float f3;
        float f4;
        File file;
        Object obj1;
        boolean flag;
        boolean flag1;
        int k1;
        file = new File(com.gtp.a.a.c.c.a(), (new StringBuilder()).append("sharephoto").append(File.separator).append("publish_photo_original.jpg").toString());
        file.delete();
        obj1 = c(new File(f.d()));
        k1 = f.e();
        android.graphics.BitmapFactory.Options options;
        if (k1 != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (f.a() != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag && !flag1) goto _L4; else goto _L3
_L3:
        if (k == null)
        {
            options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(((File) (obj1)).getAbsolutePath(), options);
            f4 = (float)options.outHeight / 0.9F;
            f3 = (float)options.outWidth / 0.9F;
        } else
        {
            f4 = (float)k.getHeight() / 0.9F;
            f3 = (float)k.getWidth() / 0.9F;
        }
        f1 = Math.min(f4, 0.9F * f4);
        f3 = Math.min(f3, 0.9F * f3);
        com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("loadBitmap...tryHeight: ").append(f1).append(", tryWidth: ").append(f3).toString());
        if (k == null)
        {
            k = ab.a(((File) (obj1)).getAbsolutePath(), Math.round(f3), Math.round(f1));
        }
        if (k != null) goto _L6; else goto _L5
_L5:
        f4 = f1;
        if (f1 > 100F)
        {
            break MISSING_BLOCK_LABEL_201;
        }
_L8:
        float f5;
        Bitmap bitmap;
        if (k == null)
        {
            com.gtp.a.a.b.c.a("PublishPhotoTask", "after \u65CB\u8F6C...originalBitmap == null");
            return;
        }
        f3 = k.getHeight();
        f1 = k.getWidth();
          goto _L7
_L6:
        f4 = Math.min(k.getHeight(), f1);
        f5 = Math.min(k.getWidth(), f3);
        f3 = f5;
        f1 = f4;
        if (!flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("\u65CB\u8F6C...tryHeight: ").append(f4).append(", tryWidth: ").append(f5).toString());
        bitmap = ab.a(k, f.a());
        if (bitmap == null || bitmap == k)
        {
            k.recycle();
            k = null;
            f3 = f5;
            f1 = f4;
            break; /* Loop/switch isn't completed */
        }
        k.recycle();
        k = bitmap;
        f1 = k.getHeight();
        f3 = k.getWidth();
        if (k == null) goto _L5; else goto _L8
_L7:
        if (!flag) goto _L10; else goto _L9
_L9:
        FilterParameter filterparameter;
        filterparameter = FilterParameterBuidler.createFilterParameter(f.e());
        filterparameter.mSrcBitmap = k;
_L13:
        Object obj;
        if (f3 <= 100F)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = null;
        try
        {
            if (filterparameter.mSrcBitmap != null)
            {
                com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("\u6EE4\u955C\u5904\u7406...tryHeight: ").append(f3).append(", tryWidth: ").append(f1).toString());
                long l3 = System.currentTimeMillis();
                obj = FilterService.getService(j).render(filterparameter);
                long l5 = System.currentTimeMillis();
                com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("\u6EE4\u955C\u5904\u7406\u65F6\u95F4: ").append(l5 - l3).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (com.gtp.a.a.b.c.a())
            {
                ((OutOfMemoryError) (obj)).printStackTrace();
            }
            obj = null;
        }
        if (obj != null && obj != k) goto _L12; else goto _L11
_L11:
        f1 = 0.8F * f1;
        f3 = 0.8F * f3;
        filterparameter.mSrcBitmap = ab.a(k, (int)f1, (int)f3);
        if (filterparameter.mSrcBitmap == k)
        {
            filterparameter.mSrcBitmap = null;
        }
        if (filterparameter.mSrcBitmap != null)
        {
            k.recycle();
            k = filterparameter.mSrcBitmap;
            f3 = k.getHeight();
            f1 = k.getWidth();
        }
        if (true) goto _L13; else goto _L10
_L12:
        k.recycle();
        k = ((Bitmap) (obj));
        float f2 = k.getHeight();
        f2 = k.getWidth();
_L10:
        if (!ab.a(k, file, ab.a(((File) (obj1))), 100))
        {
            file = null;
        }
_L14:
        if (file != null && file.exists())
        {
            a(file);
            int l1 = f.f().a();
            File file1;
            boolean flag2;
            if (l1 != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            file1 = new File(com.gtp.a.a.c.c.a(), (new StringBuilder()).append("sharephoto").append(File.separator).append("publish_photo_watermark.png").toString());
            file1.delete();
            if (flag2)
            {
                long l4 = System.currentTimeMillis();
                b(file);
                int i1;
                int j1;
                if (k == null)
                {
                    obj1 = new android.graphics.BitmapFactory.Options();
                    obj1.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(file.getAbsolutePath(), ((android.graphics.BitmapFactory.Options) (obj1)));
                    j1 = ((android.graphics.BitmapFactory.Options) (obj1)).outHeight;
                    i1 = ((android.graphics.BitmapFactory.Options) (obj1)).outWidth;
                } else
                {
                    j1 = k.getHeight();
                    i1 = k.getWidth();
                }
                com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("\u6C34\u5370\u5904\u7406...photoH: ").append(j1).append(", photoW: ").append(i1).toString());
                obj1 = f.f().a(i1, j1);
                if (obj1 != null)
                {
                    com.jiubang.goweather.b.e e1;
                    com.jiubang.goweather.b.c c1;
                    long l6;
                    if (!ab.a(((Bitmap) (obj1)), file1, android.graphics.Bitmap.CompressFormat.PNG, 100))
                    {
                        file1 = null;
                    }
                    ((Bitmap) (obj1)).recycle();
                }
                l6 = System.currentTimeMillis();
                com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("\t\u6C34\u5370\u5904\u7406: costTime:").append(l6 - l4).toString());
            }
            if (k != null)
            {
                k.recycle();
            }
            if (file != null && file.exists() && (!flag2 || file1 != null && file1.exists()))
            {
                e1 = new com.jiubang.goweather.b.e("http://gows.goforandroid.com/goweatherexSns/image/messageUpload", 10000, 10000);
                e1.a("rd", w.c());
                e1.a("POST");
                ArrayList arraylist = new ArrayList();
                obj1 = com.gtp.go.weather.sharephoto.a.f.a(j);
                if (obj1 != null)
                {
                    arraylist.add(new BasicNameValuePair("phead", ((JSONObject) (obj1)).toString()));
                    arraylist.add(new BasicNameValuePair("userId", (new StringBuilder()).append(a).append("").toString()));
                    arraylist.add(new BasicNameValuePair("cityId", b));
                    arraylist.add(new BasicNameValuePair("desc", c));
                    File file2;
                    if (d != null)
                    {
                        arraylist.add(new BasicNameValuePair("addr", f()));
                    } else
                    {
                        arraylist.add(new BasicNameValuePair("addr", null));
                    }
                    e1.a(arraylist);
                    c1 = com.jiubang.goweather.b.d.a(true);
                    file2 = null;
                    try
                    {
                        obj1 = e1.i();
                    }
                    catch (UnsupportedEncodingException unsupportedencodingexception)
                    {
                        obj1 = file2;
                        if (com.gtp.a.a.b.c.a())
                        {
                            unsupportedencodingexception.printStackTrace();
                            obj1 = file2;
                        }
                    }
                    if (!TextUtils.isEmpty(((CharSequence) (obj1))))
                    {
                        com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("completeURL: ").append(((String) (obj1))).toString());
                        com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("postParams: ").append(arraylist.toString()).toString());
                        l4 = System.currentTimeMillis();
                        obj1 = c1.b(((String) (obj1)), e1, g);
                        l6 = System.currentTimeMillis();
                        com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("\u53D1\u5E03: costTime: ").append(l6 - l4).toString());
                        g.b(((String) (obj1)));
                        com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("resultText: ").append(((String) (obj1))).toString());
                        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
                        {
                            try
                            {
                                obj1 = new JSONObject(((String) (obj1)));
                                h = l.a(((JSONObject) (obj1)).getJSONObject("head"));
                                if (h.a == 1 || h.a == 2)
                                {
                                    l4 = ((JSONObject) (obj1)).optLong("imageId", -1L);
                                    i.a(l4);
                                }
                            }
                            catch (JSONException jsonexception)
                            {
                                if (com.gtp.a.a.b.c.a())
                                {
                                    jsonexception.printStackTrace();
                                }
                            }
                            if (-1L != i.f())
                            {
                                obj1 = ab.a(i.f());
                                file2 = new File(((File) (obj1)), "publish_photo_original.jpg");
                                com.jiubang.goweather.e.a.a(file, file2, Boolean.valueOf(true));
                                i.d(file2.getAbsolutePath());
                                i.a(flag2);
                                if (flag2)
                                {
                                    file = new File(((File) (obj1)), "publish_photo_watermark.png");
                                    com.jiubang.goweather.e.a.a(file1, file, Boolean.valueOf(true));
                                    i.e(file.getAbsolutePath());
                                }
                                com.gtp.go.weather.sharephoto.b.a.d.a(j, i);
                                if (h.a == 2)
                                {
                                    com.gtp.a.a.b.c.a("PublishPhotoTask", "\u83B7\u5956\u4E86!");
                                    com.gtp.go.weather.sharephoto.award.k.b(j);
                                }
                                com.gau.go.launcherex.gowidget.weather.service.a.b.a(new com.gtp.go.weather.sharephoto.c.c(this, k1, l1));
                            }
                            l4 = System.currentTimeMillis();
                            com.gtp.a.a.b.c.a("PublishPhotoTask", (new StringBuilder()).append("doTime: ").append(l4 - l2).toString());
                            return;
                        }
                    }
                }
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (k == null)
        {
            if (!com.jiubang.goweather.e.a.a(((File) (obj1)), file, Boolean.valueOf(true)))
            {
                file = null;
            }
        } else
        if (!ab.a(k, file, ab.a(((File) (obj1))), 100))
        {
            file = null;
        }
          goto _L14
    }

    public void a(Location location)
    {
        d = location;
    }

    public void a(s s1)
    {
        f = s1;
    }

    public void a(String s1)
    {
        a = s1;
    }

    public void a(String s1, String s2)
    {
        e.put(s1, s2);
    }

    public void a(HashMap hashmap)
    {
        if (hashmap != null)
        {
            hashmap = hashmap.entrySet().iterator();
            while (hashmap.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)hashmap.next();
                a((String)entry.getKey(), (String)entry.getValue());
            }
        }
    }

    public void b(String s1)
    {
        b = s1;
        i.b(s1);
    }

    public e c()
    {
        return i;
    }

    public void c(String s1)
    {
        c = s1;
        i.a(s1);
    }

    public String d()
    {
        return b;
    }

    public f e()
    {
        return g;
    }
}
