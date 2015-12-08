// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.gtp.a.a.b.c;
import com.gtp.a.a.c.a;
import com.gtp.go.weather.sharephoto.takephoto.ab;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.HashMap;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            d, c, e

public class b
{

    private HashMap a;
    private int b;

    public b()
    {
        b = 1;
        a = new HashMap();
    }

    public static Drawable a(Context context, String s, int i)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = obj1;
        if (context == null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L3
_L3:
        File file;
        file = new File(s);
        obj = obj1;
        if (file == null) goto _L2; else goto _L4
_L4:
        obj = obj1;
        if (!file.exists()) goto _L2; else goto _L5
_L5:
        obj = new android.graphics.BitmapFactory.Options();
        obj.inJustDecodeBounds = false;
        obj.inSampleSize = i;
        if (com.gtp.a.a.c.a.a() != 1 && ab.a(file) != android.graphics.Bitmap.CompressFormat.PNG)
        {
            obj.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
        }
        s = BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj)));
        if (s == null) goto _L7; else goto _L6
_L6:
        context = new BitmapDrawable(context.getResources(), s);
_L10:
        obj = context;
_L2:
        return ((Drawable) (obj));
        context;
        obj = obj1;
        if (!c.a()) goto _L2; else goto _L8
_L8:
        context.printStackTrace();
        return null;
_L7:
        context = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    static HashMap a(b b1)
    {
        return b1.a;
    }

    static int b(b b1)
    {
        return b1.b;
    }

    public static Drawable b(Context context, String s, int i)
    {
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        obj3 = null;
        obj2 = null;
        obj4 = null;
        obj1 = obj3;
        if (context == null) goto _L2; else goto _L1
_L1:
        obj1 = obj3;
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L3
_L3:
        s = context.getAssets().open(s);
        Object obj;
        obj = obj4;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        obj = s;
        obj1 = new android.graphics.BitmapFactory.Options();
        obj = s;
        obj1.inJustDecodeBounds = false;
        obj = s;
        obj1.inSampleSize = i;
        obj = s;
        obj1 = BitmapFactory.decodeStream(s, null, ((android.graphics.BitmapFactory.Options) (obj1)));
        obj = obj4;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        obj = s;
        context = new BitmapDrawable(context.getResources(), ((android.graphics.Bitmap) (obj1)));
        obj = context;
        obj1 = obj;
        if (s == null) goto _L2; else goto _L4
_L4:
        s.close();
        obj1 = obj;
_L2:
        return ((Drawable) (obj1));
        context;
        s = null;
_L12:
        obj = s;
        if (!c.a())
        {
            break MISSING_BLOCK_LABEL_142;
        }
        obj = s;
        context.printStackTrace();
        obj1 = obj3;
        if (s == null) goto _L2; else goto _L5
_L5:
        s.close();
        return null;
        context;
        obj1 = obj3;
        if (!c.a()) goto _L2; else goto _L6
_L6:
        obj = obj2;
_L7:
        context.printStackTrace();
        return ((Drawable) (obj));
        context;
        s = null;
_L11:
        obj = s;
        if (!c.a())
        {
            break MISSING_BLOCK_LABEL_193;
        }
        obj = s;
        context.printStackTrace();
        obj1 = obj3;
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s.close();
        return null;
        context;
        obj1 = obj3;
        if (!c.a())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj2;
          goto _L7
        context;
        obj = null;
_L10:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        ((InputStream) (obj)).close();
_L9:
        throw context;
        s;
        if (c.a())
        {
            s.printStackTrace();
        }
        if (true) goto _L9; else goto _L8
_L8:
        context;
        obj1 = obj;
        if (!c.a()) goto _L2; else goto _L7
        context;
          goto _L10
        context;
          goto _L11
        context;
          goto _L12
    }

    public Drawable a(Context context, String s, String s1, String s2, e e)
    {
        return a(context, false, s, s1, s2, e);
    }

    public Drawable a(Context context, boolean flag, String s, String s1, String s2, e e)
    {
        if (a.containsKey(s))
        {
            Drawable drawable = (Drawable)((SoftReference)a.get(s)).get();
            if (drawable != null)
            {
                return drawable;
            }
        }
        (new d(this, flag, context, s, new com.gtp.go.weather.sharephoto.photo.c(this, s, e, s1, s2))).start();
        return null;
    }

    public HashMap a()
    {
        return a;
    }

    public void b()
    {
        if (a != null)
        {
            a.clear();
        }
    }
}
