// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.c;

import a.a.a.a.a.h;
import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.service.a.a;
import com.gtp.go.weather.sharephoto.b.e;
import com.gtp.go.weather.sharephoto.b.l;
import com.gtp.go.weather.sharephoto.b.m;
import com.jiubang.goweather.b.c;
import com.jiubang.goweather.b.d;
import com.jiubang.goweather.b.f;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

public class n extends a
{

    private e a;
    private Context b;
    private f c;
    private l d;

    public n(Context context, e e1)
    {
        b = context.getApplicationContext();
        a = e1;
    }

    public void a()
    {
_L2:
        return;
        if (!a.l() || a.e() && !a.m()) goto _L2; else goto _L1
_L1:
        File file1 = new File(a.g());
        Object obj;
        Object obj1;
        File file;
        Object obj2;
        String s;
        c c1;
        Object obj3;
        UnsupportedEncodingException unsupportedencodingexception1;
        boolean flag;
        boolean flag1;
        int i;
        long l1;
        long l2;
        if (a.e())
        {
            file = new File(a.h());
        } else
        {
            file = null;
        }
        c = new f();
        com.gtp.a.a.a.a.a().a((new StringBuilder()).append("============\u4E0A\u4F20\u56FE\u7247").append(a.f()).append("============").toString(), "photo_upload.txt");
        obj2 = new com.jiubang.goweather.b.e("http://gows.goforandroid.com/goweatherexSns/image/get/uploadedInfo");
        ((com.jiubang.goweather.b.e) (obj2)).a("rd", w.c());
        ((com.jiubang.goweather.b.e) (obj2)).a("POST");
        obj = com.gtp.go.weather.sharephoto.a.f.a(b);
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = ((JSONObject) (obj)).toString();
        obj = new ArrayList();
        ((List) (obj)).add(new BasicNameValuePair("phead", s));
        ((List) (obj)).add(new BasicNameValuePair("imageId", String.valueOf(a.f())));
        ((com.jiubang.goweather.b.e) (obj2)).a(((List) (obj)));
        c1 = com.jiubang.goweather.b.d.a(true);
        obj1 = null;
        try
        {
            obj = ((com.jiubang.goweather.b.e) (obj2)).i();
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            obj = obj1;
            if (com.gtp.a.a.b.c.a())
            {
                unsupportedencodingexception.printStackTrace();
                obj = obj1;
            }
        }
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = c1.b(((String) (obj)), ((com.jiubang.goweather.b.e) (obj2)), c);
        c.b(((String) (obj1)));
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = null;
        obj1 = new JSONObject(((String) (obj1)));
        d = l.a(((JSONObject) (obj1)).getJSONObject("head"));
        if (d.a != 1)
        {
            break MISSING_BLOCK_LABEL_738;
        }
        obj = m.a(((JSONObject) (obj1)).getJSONArray("uploadeds"));
        flag = false;
        flag1 = false;
        obj1 = ((List) (obj)).iterator();
_L3:
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_435;
        }
        obj2 = (m)((Iterator) (obj1)).next();
        i = ((m) (obj2)).a;
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_412;
        }
        i = 1;
        flag = flag1;
        flag1 = i;
_L4:
        i = ((flag1) ? 1 : 0);
        flag1 = flag;
        flag = i;
          goto _L3
        if (((m) (obj2)).a == 2)
        {
            i = 1;
            flag1 = flag;
            flag = i;
        } else
        {
            i = ((flag) ? 1 : 0);
            flag = flag1;
            flag1 = i;
        }
          goto _L4
        if (flag)
        {
            break MISSING_BLOCK_LABEL_466;
        }
        obj1 = new m();
        obj1.a = 1;
        obj1.b = 0;
        ((List) (obj)).add(obj1);
        if (!flag1)
        {
            try
            {
                obj1 = new m();
                obj1.a = 2;
                obj1.b = 0;
                ((List) (obj)).add(obj1);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    ((JSONException) (obj)).printStackTrace();
                }
                obj = null;
            }
        }
        if (obj == null || ((List) (obj)).size() == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        c = new f();
        obj2 = null;
        obj1 = null;
        obj3 = ((List) (obj)).iterator();
        obj = obj2;
        while (((Iterator) (obj3)).hasNext()) 
        {
            obj2 = (m)((Iterator) (obj3)).next();
            if (((m) (obj2)).a == 1)
            {
                a.b(((m) (obj2)).b);
                obj = new File(file1.getParent(), (new StringBuilder()).append(file1.getName()).append(".tmp").toString());
                l1 = file1.length();
                l2 = ((m) (obj2)).b;
                com.jiubang.goweather.e.a.a(file1, ((File) (obj)), ((m) (obj2)).b, l1 - l2);
                com.gtp.a.a.b.c.a("UploadPhotoTask", (new StringBuilder()).append("\u7167\u7247\u539F\u56FE\u5927\u5C0F: ").append(file1.length()).append(", \u5DF2\u4F20\u5927\u5C0F: ").append(((m) (obj2)).b).toString());
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u7167\u7247\u539F\u56FE\u5927\u5C0F: ").append(file1.length()).append(", \u5DF2\u4F20\u5927\u5C0F: ").append(((m) (obj2)).b).toString(), "photo_upload.txt");
            } else
            if (((m) (obj2)).a == 2 && a.e())
            {
                a.c(((m) (obj2)).b);
                obj1 = new File(file.getParent(), (new StringBuilder()).append(file.getName()).append(".tmp").toString());
                l1 = file.length();
                l2 = ((m) (obj2)).b;
                com.jiubang.goweather.e.a.a(file, ((File) (obj1)), ((m) (obj2)).b, l1 - l2);
                com.gtp.a.a.b.c.a("UploadPhotoTask", (new StringBuilder()).append("\u6C34\u5370\u539F\u56FE\u5927\u5C0F: ").append(file.length()).append(", \u5DF2\u4F20\u5927\u5C0F: ").append(((m) (obj2)).b).toString());
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u6C34\u5370\u539F\u56FE\u5927\u5C0F: ").append(file.length()).append(", \u5DF2\u4F20\u5927\u5C0F: ").append(((m) (obj2)).b).toString(), "photo_upload.txt");
            }
        }
        break MISSING_BLOCK_LABEL_1012;
        if (d.a != 0)
        {
            break MISSING_BLOCK_LABEL_497;
        }
        obj = new ArrayList();
        obj1 = new m();
        obj1.a = 1;
        obj1.b = 0;
        ((List) (obj)).add(obj1);
        obj1 = new m();
        obj1.a = 2;
        obj1.b = 0;
        ((List) (obj)).add(obj1);
        break MISSING_BLOCK_LABEL_497;
        if (a.k())
        {
            break MISSING_BLOCK_LABEL_1598;
        }
        obj3 = new com.jiubang.goweather.b.e("http://gows.goforandroid.com/goweatherexSns/image/upload");
        ((com.jiubang.goweather.b.e) (obj3)).b(0);
        ((com.jiubang.goweather.b.e) (obj3)).a("rd", w.c());
        ((com.jiubang.goweather.b.e) (obj3)).a("POST");
        obj2 = new h(a.a.a.a.a.e.b);
        ((h) (obj2)).a("phead", new a.a.a.a.a.a.e(s));
        ((h) (obj2)).a("imageId", new a.a.a.a.a.a.e(String.valueOf(a.f())));
        ((h) (obj2)).a("pictureSize", new a.a.a.a.a.a.e(String.valueOf(file1.length())));
        ((h) (obj2)).a("hasWaterMark", new a.a.a.a.a.a.e(String.valueOf(a.e())));
        if (a.e())
        {
            ((h) (obj2)).a("watermarkSize", new a.a.a.a.a.a.e(String.valueOf(file.length())));
        }
        if (obj != null && ((File) (obj)).length() > 0L)
        {
            com.gtp.a.a.b.c.a("UploadPhotoTask", (new StringBuilder()).append("\u4E0A\u4F20\u6216\u7EED\u4F20\u539F\u56FE\u5927\u5C0F: ").append(((File) (obj)).length()).toString());
            com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u672C\u6B21\u4E0A\u4F20\u6216\u7EED\u4F20\u539F\u56FE\u6587\u4EF6\u5927\u5C0F: ").append(((File) (obj)).length()).toString(), "photo_upload.txt");
            ((h) (obj2)).a("picture", new a.a.a.a.a.a.d(((File) (obj))));
        }
        if (a.e() && obj1 != null && ((File) (obj1)).length() > 0L)
        {
            com.gtp.a.a.b.c.a("UploadPhotoTask", (new StringBuilder()).append("\u4E0A\u4F20\u6216\u7EED\u4F20\u6C34\u5370\u5927\u5C0F: ").append(((File) (obj1)).length()).toString());
            com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u672C\u6B21\u4E0A\u4F20\u6216\u7EED\u4F20\u6C34\u5370\u6587\u4EF6\u5927\u5C0F: ").append(((File) (obj1)).length()).toString(), "photo_upload.txt");
            ((h) (obj2)).a("watermark", new a.a.a.a.a.a.d(((File) (obj1))));
        }
        ((com.jiubang.goweather.b.e) (obj3)).a(((h) (obj2)));
        s = null;
        try
        {
            obj2 = ((com.jiubang.goweather.b.e) (obj3)).i();
        }
        // Misplaced declaration of an exception variable
        catch (UnsupportedEncodingException unsupportedencodingexception1)
        {
            obj2 = s;
            if (com.gtp.a.a.b.c.a())
            {
                unsupportedencodingexception1.printStackTrace();
                obj2 = s;
            }
        }
        if (TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            continue; /* Loop/switch isn't completed */
        }
        com.gtp.a.a.b.c.a("UploadPhotoTask", "\u5F00\u59CB\u6267\u884C\u4E0A\u4F20");
        obj2 = c1.b(((String) (obj2)), ((com.jiubang.goweather.b.e) (obj3)), c);
        com.gtp.a.a.b.c.a("UploadPhotoTask", "\u4E0A\u4F20\u8BF7\u6C42\u7ED3\u675F");
        if (obj != null)
        {
            ((File) (obj)).delete();
        }
        if (obj1 != null)
        {
            ((File) (obj1)).delete();
        }
        com.gtp.a.a.b.c.a("UploadPhotoTask", (new StringBuilder()).append("upload photo resultText: ").append(((String) (obj2))).append(", mImageId: ").append(a.f()).toString());
        c.b(((String) (obj2)));
        d = null;
        if (!TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            try
            {
                d = l.a((new JSONObject(((String) (obj2)))).getJSONObject("head"));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    ((JSONException) (obj)).printStackTrace();
                }
            }
        }
        if (d != null && (d.a == 1 || d.a == 11))
        {
            a.b(file1.length());
            if (a.e())
            {
                a.c(file.length());
            }
        }
        l1 = a.f();
        obj = new ContentValues();
        ((ContentValues) (obj)).put("photo_upload_size", Long.valueOf(a.i()));
        ((ContentValues) (obj)).put("watermark_upload_size", Long.valueOf(a.j()));
        com.gtp.go.weather.sharephoto.b.a.d.a(b, ((ContentValues) (obj)), "photo_id=?", new String[] {
            String.valueOf(l1)
        });
        if (com.gtp.a.a.b.c.a())
        {
            obj1 = "\u672A\u5B8C\u6210";
            obj = obj1;
            if (d != null)
            {
                if (d.a == 1)
                {
                    obj = "\u5B8C\u6210";
                } else
                {
                    obj = obj1;
                    if (d.a == 11)
                    {
                        obj = "\u4E0A\u4E00\u6B21\u5DF2\u5B8C\u6210";
                    }
                }
            }
            com.gtp.a.a.b.c.a("UploadPhotoTask", (new StringBuilder()).append("\u4E0A\u4F20\u56FE\u7247").append(((String) (obj))).toString());
            obj1 = c.m();
            com.gtp.a.a.b.c.a("UploadPhotoTask", (new StringBuilder()).append("mResult.getStackTraceInfo(): ").append(((String) (obj1))).toString());
            com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u4E0A\u4F20\u56FE\u7247\u7ED3\u675F, \u72B6\u6001: ").append(((String) (obj))).toString(), "photo_upload.txt");
            com.gtp.a.a.a.a.a().a((new StringBuilder()).append("stackTraceInfo: ").append(((String) (obj1))).toString(), "photo_upload.txt");
            return;
        }
        continue; /* Loop/switch isn't completed */
        obj;
        if (com.gtp.a.a.b.c.a())
        {
            ((UnsupportedEncodingException) (obj)).printStackTrace();
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public e c()
    {
        return a;
    }
}
