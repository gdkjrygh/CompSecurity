// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DrawableUtils
{

    public static final Rect INSETS_NONE;
    private static final String TAG = "DrawableUtils";
    private static Class sInsetsClazz = Class.forName("android.graphics.Insets");

    private DrawableUtils()
    {
    }

    public static Rect getOpticalBounds(Drawable drawable)
    {
        if (sInsetsClazz == null) goto _L2; else goto _L1
_L1:
        Object obj;
        drawable = DrawableCompat.unwrap(drawable);
        obj = drawable.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(drawable, new Object[0]);
        if (obj == null) goto _L2; else goto _L3
_L3:
        Rect rect;
        Field afield[];
        int j;
        rect = new Rect();
        afield = sInsetsClazz.getFields();
        j = afield.length;
        int i = 0;
_L17:
        drawable = rect;
        if (i >= j) goto _L5; else goto _L4
_L4:
        drawable = afield[i];
        String s = drawable.getName();
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 4: default 255
    //                   -1383228885: 176
    //                   115029: 144
    //                   3317767: 128
    //                   108511772: 160;
           goto _L6 _L7 _L8 _L9 _L10
_L9:
        if (s.equals("left"))
        {
            byte0 = 0;
        }
          goto _L6
_L8:
        if (s.equals("top"))
        {
            byte0 = 1;
        }
          goto _L6
_L10:
        if (s.equals("right"))
        {
            byte0 = 2;
        }
          goto _L6
_L7:
        if (s.equals("bottom"))
        {
            byte0 = 3;
        }
          goto _L6
_L12:
        rect.left = drawable.getInt(obj);
          goto _L11
        drawable;
        Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
_L2:
        drawable = INSETS_NONE;
_L5:
        return drawable;
_L13:
        rect.top = drawable.getInt(obj);
          goto _L11
_L14:
        rect.right = drawable.getInt(obj);
          goto _L11
_L15:
        rect.bottom = drawable.getInt(obj);
          goto _L11
_L6:
        byte0;
        JVM INSTR tableswitch 0 3: default 288
    //                   0 192
    //                   1 219
    //                   2 231
    //                   3 243;
           goto _L11 _L12 _L13 _L14 _L15
_L11:
        i++;
        if (true) goto _L17; else goto _L16
_L16:
    }

    static 
    {
        INSETS_NONE = new Rect();
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        return;
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
    }
}
