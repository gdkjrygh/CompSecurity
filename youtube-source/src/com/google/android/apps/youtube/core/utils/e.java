// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.view.View;
import android.view.Window;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.utils:
//            f

public final class e
{

    private static final Intent a = new Intent("android.intent.action.BUG_REPORT");

    public static void a(Activity activity)
    {
        f f1 = new f(activity);
        activity.bindService(a, f1, 1);
    }

    public static boolean a(Context context)
    {
        Intent intent = a;
        return !context.getPackageManager().queryIntentServices(intent, 0x10000).isEmpty();
    }

    static Bitmap b(Activity activity)
    {
        return c(activity);
    }

    private static Bitmap c(Activity activity)
    {
        Bitmap bitmap;
        View view;
        int i;
        int j;
        boolean flag;
        try
        {
            view = activity.getWindow().getDecorView().getRootView();
            flag = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            bitmap = view.getDrawingCache();
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            return null;
        }
        activity = bitmap;
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        bitmap = bitmap.copy(android.graphics.Bitmap.Config.RGB_565, false);
        j = bitmap.getWidth();
        i = bitmap.getHeight();
_L2:
        if (j * i * 2 <= 0x100000)
        {
            break; /* Loop/switch isn't completed */
        }
        j /= 2;
        i /= 2;
        if (true) goto _L2; else goto _L1
_L1:
        activity = bitmap;
        if (j != bitmap.getWidth())
        {
            activity = Bitmap.createScaledBitmap(bitmap, j, i, true);
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        view.setDrawingCacheEnabled(false);
        view.destroyDrawingCache();
        return activity;
    }

}
