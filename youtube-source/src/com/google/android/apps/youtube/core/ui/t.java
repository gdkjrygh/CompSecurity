// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.apps.youtube.common.L;

// Referenced classes of package com.google.android.apps.youtube.core.ui:
//            s

public final class t extends s
{

    private boolean a;

    public t()
    {
        a = true;
    }

    public final Bitmap a(Context context, Bitmap bitmap, float f)
    {
        if (a) goto _L2; else goto _L1
_L1:
        context = super.a(context, bitmap, f);
_L6:
        return context;
_L2:
        RenderScript renderscript = RenderScript.create(context);
        if (bitmap.getConfig() != android.graphics.Bitmap.Config.ARGB_8888) goto _L4; else goto _L3
_L3:
        context = bitmap;
_L7:
        Bitmap bitmap1;
        try
        {
            bitmap1 = context.copy(context.getConfig(), true);
            context = Allocation.createFromBitmap(renderscript, context);
            Allocation allocation = Allocation.createFromBitmap(renderscript, bitmap1);
            ScriptIntrinsicBlur scriptintrinsicblur = ScriptIntrinsicBlur.create(renderscript, Element.U8_4(renderscript));
            scriptintrinsicblur.setRadius(f);
            scriptintrinsicblur.setInput(context);
            scriptintrinsicblur.forEach(allocation);
            allocation.copyTo(bitmap1);
            renderscript.destroy();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            L.b((new StringBuilder("RenderScript blur failed: ")).append(context).toString());
            a = false;
            return bitmap;
        }
        return bitmap1;
_L4:
        bitmap1 = bitmap.copy(android.graphics.Bitmap.Config.ARGB_8888, false);
        context = bitmap;
        if (bitmap1 == null) goto _L6; else goto _L5
_L5:
        context = bitmap1;
          goto _L7
    }
}
