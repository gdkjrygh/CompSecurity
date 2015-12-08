// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.wxdata.utils;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import com.wsi.android.framework.settings.helpers.ConfigInfo;
import java.io.File;

public class IOUtils
{

    private static final String CACHE = "cache";
    public static String EXTERNAL_STORAGE_CACHE_PATH;
    public static final String EXTERNAL_STORAGE_DATA_PATH;
    public static String EXTERNAL_STORAGE_FILES_PATH;
    public static String EXTERNAL_STORAGE_PACKAGE_PATH;
    private static final String FILES = "files";
    public static String INTERNAL_STORAGE_CACHE_PATH;
    public static String INTERNAL_STORAGE_FILES_PATH;
    public static final long MEGABYTE = 0x100000L;
    private static final String TAG = com/wsi/android/framework/wxdata/utils/IOUtils.getSimpleName();

    public IOUtils()
    {
    }

    public static final void clearCacheDirs(CharSequence charsequence)
    {
        clearDirs(charsequence, EXTERNAL_STORAGE_CACHE_PATH, INTERNAL_STORAGE_CACHE_PATH);
    }

    public static final void clearDirectory(File file)
    {
        if (file != null && file.exists()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((file = file.listFiles()) != null)
        {
            int j = file.length;
            int i = 0;
            while (i < j) 
            {
                deleteFile(file[i]);
                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private static void clearDirs(CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2)
    {
        if (charsequence == null || "".equals(charsequence))
        {
            if (ConfigInfo.DEBUG)
            {
                Log.w(TAG, "clearing the application's root files dir is not allowed");
            }
            return;
        }
        StringBuilder stringbuilder = new StringBuilder();
        File file = null;
        if (isExternalStorageMounted())
        {
            stringbuilder.append(charsequence1);
            file = initDir(stringbuilder, charsequence, false);
        }
        clearDirectory(file);
        stringbuilder.setLength(0);
        stringbuilder.append(charsequence2);
        clearDirectory(initDir(stringbuilder, charsequence, false));
    }

    public static final void clearFilesDirs(CharSequence charsequence)
    {
        clearDirs(charsequence, EXTERNAL_STORAGE_FILES_PATH, INTERNAL_STORAGE_FILES_PATH);
    }

    public static void deleteFile(File file)
    {
        if (!file.delete() && ConfigInfo.DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("deleteFile: unable to delete file ").append(file.getAbsolutePath()).toString());
        }
    }

    public static File getCacheDir(CharSequence charsequence)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (isExternalStorageMounted())
        {
            stringbuilder.append(EXTERNAL_STORAGE_CACHE_PATH);
        } else
        {
            stringbuilder.append(INTERNAL_STORAGE_CACHE_PATH);
        }
        return initDir(stringbuilder, charsequence, true);
    }

    public static File getFilesDir(CharSequence charsequence)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (isExternalStorageMounted())
        {
            stringbuilder.append(EXTERNAL_STORAGE_FILES_PATH);
        } else
        {
            stringbuilder.append(INTERNAL_STORAGE_FILES_PATH);
        }
        return initDir(stringbuilder, charsequence, true);
    }

    public static File getInternalStorageFilesDir(String s)
    {
        return null;
    }

    public static void init(Context context)
    {
        INTERNAL_STORAGE_FILES_PATH = context.getFilesDir().getAbsolutePath();
        INTERNAL_STORAGE_CACHE_PATH = context.getCacheDir().getAbsolutePath();
        EXTERNAL_STORAGE_PACKAGE_PATH = (new StringBuilder()).append(EXTERNAL_STORAGE_DATA_PATH).append(context.getPackageName()).append(File.separatorChar).toString();
        EXTERNAL_STORAGE_FILES_PATH = (new StringBuilder()).append(EXTERNAL_STORAGE_PACKAGE_PATH).append("files").toString();
        EXTERNAL_STORAGE_CACHE_PATH = (new StringBuilder()).append(EXTERNAL_STORAGE_PACKAGE_PATH).append("cache").toString();
    }

    private static File initDir(StringBuilder stringbuilder, CharSequence charsequence, boolean flag)
    {
        if (charsequence != null && charsequence.length() > 0)
        {
            stringbuilder.append(File.separatorChar).append(charsequence);
        }
        charsequence = new File(stringbuilder.toString());
        stringbuilder = charsequence;
        if (flag)
        {
            stringbuilder = charsequence;
            if (!charsequence.exists())
            {
                stringbuilder = charsequence;
                if (!charsequence.mkdirs())
                {
                    if (ConfigInfo.DEBUG)
                    {
                        Log.w(TAG, (new StringBuilder()).append("initFolder: unable to create folder: ").append(charsequence.getAbsolutePath()).toString());
                    }
                    stringbuilder = null;
                }
            }
        }
        return stringbuilder;
    }

    public static boolean isExternalStorageMounted()
    {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    static 
    {
        EXTERNAL_STORAGE_DATA_PATH = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append(File.separatorChar).append("Android").append(File.separatorChar).append("data").append(File.separatorChar).toString();
    }
}
