// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.ContextThemeWrapper;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public final class CustomProgressDialog
{

    private static int DIALOG_THEME_STYLE_ID = -1;
    private static int SPINNER_DRAWABLE_ID = -1;
    private static final String TAG = com/walmart/android/ui/CustomProgressDialog.getSimpleName();
    private static final String UNSUPPORTED_PRE_ICS_DEVICES[] = {
        "SCH-S720C"
    };

    private CustomProgressDialog()
    {
    }

    public static void configure(int i, int j)
    {
        DIALOG_THEME_STYLE_ID = i;
        SPINNER_DRAWABLE_ID = j;
    }

    public static ProgressDialog create(Context context)
    {
        Object obj;
        if (DIALOG_THEME_STYLE_ID == -1 || SPINNER_DRAWABLE_ID == -1)
        {
            Log.e(TAG, "configure() must have been called with proper IDs prior to create()");
        }
        Context context1 = context;
        obj = context1;
        if (!isUnsupportedDevice())
        {
            obj = context1;
            if (DIALOG_THEME_STYLE_ID != -1)
            {
                obj = new ContextThemeWrapper(context, DIALOG_THEME_STYLE_ID);
            }
        }
        ProgressDialog progressdialog = (ProgressDialog)android/app/ProgressDialog.getConstructor(new Class[] {
            android/content/Context, Integer.TYPE
        }).newInstance(new Object[] {
            obj, Integer.valueOf(DIALOG_THEME_STYLE_ID)
        });
        obj = progressdialog;
_L1:
        ((ProgressDialog) (obj)).setCanceledOnTouchOutside(false);
        Class class1;
        Exception exception;
        boolean flag;
        try
        {
            context = context.getResources().getDrawable(SPINNER_DRAWABLE_ID);
            class1 = context.getClass();
            flag = class1.getName().equals("android.graphics.drawable.AnimatedRotateDrawable");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return ((ProgressDialog) (obj));
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        try
        {
            class1.getMethod("setFramesDuration", new Class[] {
                Integer.TYPE
            }).invoke(context, new Object[] {
                Integer.valueOf(70)
            });
        }
        catch (Exception exception1) { }
        ((ProgressDialog) (obj)).setIndeterminateDrawable(context);
        return ((ProgressDialog) (obj));
        exception;
        obj = new ProgressDialog(((Context) (obj)));
          goto _L1
    }

    private static boolean isUnsupportedDevice()
    {
        boolean flag1 = false;
        String as[] = UNSUPPORTED_PRE_ICS_DEVICES;
        int j = as.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!as[i].equals(Build.DEVICE))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

}
