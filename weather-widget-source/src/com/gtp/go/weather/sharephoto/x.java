// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.content.Context;
import android.graphics.BitmapFactory;
import com.gtp.a.a.c.c;
import com.jiubang.core.a.i;
import com.jiubang.core.a.s;

public class x
{

    public static final String a = (new StringBuilder()).append(c.a()).append("/background/background.jpg").toString();
    private Context b;

    public x(Context context)
    {
        b = context;
    }

    private s b(int i, int j)
    {
        Object obj;
        obj = new android.graphics.BitmapFactory.Options();
        obj.inPreferredConfig = android.graphics.Bitmap.Config.ALPHA_8;
        obj = BitmapFactory.decodeFile(a, ((android.graphics.BitmapFactory.Options) (obj)));
        if (obj == null) goto _L2; else goto _L1
_L1:
        Object obj1 = com.go.weatherex.home.a.c.a(b, ((android.graphics.Bitmap) (obj)), 15);
_L6:
        android.graphics.Bitmap bitmap;
        bitmap = ((android.graphics.Bitmap) (obj));
        obj = obj1;
_L3:
        if (bitmap != null)
        {
            obj1 = new s(b, 0, 0, i, j, bitmap, i, j);
            ((s) (obj1)).b(((android.graphics.Bitmap) (obj)));
            return ((s) (obj1));
        } else
        {
            return null;
        }
        obj1;
        obj = null;
_L4:
        ((OutOfMemoryError) (obj1)).printStackTrace();
        obj1 = null;
        bitmap = ((android.graphics.Bitmap) (obj));
        obj = obj1;
          goto _L3
        obj1;
          goto _L4
_L2:
        obj1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public i a(int i, int j)
    {
        return b(i, j);
    }

}
