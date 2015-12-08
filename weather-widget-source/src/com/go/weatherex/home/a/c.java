// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

public class c
{

    public static Bitmap a(Context context, Bitmap bitmap, int i)
    {
        Object obj = null;
        Bitmap bitmap1 = null;
        Bitmap bitmap2 = bitmap1;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            break MISSING_BLOCK_LABEL_237;
        }
        bitmap2 = bitmap1;
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_237;
        }
        int j = Math.max(1, Math.min(bitmap.getHeight() / 400, bitmap.getWidth() / 240));
        bitmap1 = ((Bitmap) (obj));
        ScriptIntrinsicBlur scriptintrinsicblur;
        try
        {
            obj = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / j, bitmap.getHeight() / j, false);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return bitmap1;
        }
        bitmap2 = ((Bitmap) (obj));
        if (obj != bitmap)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        bitmap1 = ((Bitmap) (obj));
        bitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        bitmap1 = bitmap2;
        (new Canvas(bitmap2)).drawBitmap(bitmap, 0.0F, 0.0F, null);
        bitmap1 = bitmap2;
        context = RenderScript.create(context);
        bitmap1 = bitmap2;
        bitmap = Allocation.createFromBitmap(context, bitmap2, android.renderscript.Allocation.MipmapControl.MIPMAP_NONE, 1);
        bitmap1 = bitmap2;
        obj = Allocation.createTyped(context, bitmap.getType());
        bitmap1 = bitmap2;
        scriptintrinsicblur = ScriptIntrinsicBlur.create(context, Element.U8_4(context));
        bitmap1 = bitmap2;
        scriptintrinsicblur.setRadius(i);
        bitmap1 = bitmap2;
        scriptintrinsicblur.setInput(bitmap);
        bitmap1 = bitmap2;
        scriptintrinsicblur.forEach(((Allocation) (obj)));
        bitmap1 = bitmap2;
        ((Allocation) (obj)).copyTo(bitmap2);
        bitmap1 = bitmap2;
        context.destroy();
        bitmap1 = bitmap2;
        bitmap.destroy();
        bitmap1 = bitmap2;
        ((Allocation) (obj)).destroy();
        bitmap1 = bitmap2;
        scriptintrinsicblur.destroy();
        return bitmap2;
    }
}
