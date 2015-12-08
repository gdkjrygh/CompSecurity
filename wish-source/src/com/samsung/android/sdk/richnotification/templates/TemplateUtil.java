// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.templates;

import android.util.Log;
import com.samsung.android.sdk.richnotification.SrnImageAsset;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class TemplateUtil
{

    private static final String TAG = com/samsung/android/sdk/richnotification/templates/TemplateUtil.getName();
    private static Method sSetCompressFormatMethod;

    TemplateUtil()
    {
    }

    static void setCompressFormat(SrnImageAsset srnimageasset, android.graphics.Bitmap.CompressFormat compressformat)
    {
        try
        {
            sSetCompressFormatMethod.invoke(srnimageasset, new Object[] {
                compressformat
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SrnImageAsset srnimageasset) { }
        // Misplaced declaration of an exception variable
        catch (SrnImageAsset srnimageasset) { }
        // Misplaced declaration of an exception variable
        catch (SrnImageAsset srnimageasset) { }
        Log.e(TAG, srnimageasset.getMessage(), srnimageasset);
    }

    static 
    {
        try
        {
            sSetCompressFormatMethod = com/samsung/android/sdk/richnotification/SrnImageAsset.getDeclaredMethod("setCompressFormat", new Class[] {
                android/graphics/Bitmap$CompressFormat
            });
            sSetCompressFormatMethod.setAccessible(true);
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            Log.e(TAG, nosuchmethodexception.getMessage(), nosuchmethodexception);
        }
    }
}
