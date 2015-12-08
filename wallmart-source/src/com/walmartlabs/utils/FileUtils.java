// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.utils;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.walmartlabs.utils:
//            StreamUtils

public class FileUtils
{

    public FileUtils()
    {
    }

    public static InputStream getFileAsInputStream(Context context, String s)
    {
        try
        {
            context = context.getAssets().open(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        return context;
    }

    public static String getFileAsString(Context context, String s)
    {
        context = getFileAsInputStream(context, s);
        if (context != null)
        {
            return StreamUtils.inputStreamToString(context);
        } else
        {
            return "";
        }
    }
}
