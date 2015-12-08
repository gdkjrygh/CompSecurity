// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.service;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class FileService
{

    private static final String a = "FileService";

    public FileService()
    {
    }

    public static boolean copyFile(File file, File file1)
    {
        File file2;
        Object obj = null;
        file2 = null;
        Log.d("FileService", (new StringBuilder()).append("Copying from '").append(file).append("' to '").append(file1).append("'").toString());
        boolean flag = false;
        if (file1.exists())
        {
            Log.d("FileService", "... destination exists. Deleting.");
            file1.delete();
            file1.createNewFile();
        } else
        {
            file1.createNewFile();
        }
        file = (new RandomAccessFile(file, "rw")).getChannel();
        file2 = file;
        file = obj;
        file1 = (new RandomAccessFile(file1, "rw")).getChannel();
        file = file1;
        file2.transferTo(0L, file2.size(), file1);
        if (file2 != null)
        {
            file2.close();
        }
        if (file1 != null)
        {
            file1.close();
            flag = true;
        }
        return flag;
        file1;
        Object obj1 = null;
        file = file2;
        file2 = obj1;
_L2:
        if (file2 != null)
        {
            file2.close();
        }
        if (file != null)
        {
            file.close();
        }
        throw file1;
        file1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean copyFile(String s, String s1)
    {
        return copyFile(new File(s), new File(s1));
    }

    public static boolean deleteDirectory(File file)
    {
        Log.d("UtilsService.deleteDirectory", (new StringBuilder()).append("Deleting directory/file - ").append(file.getAbsolutePath()).toString());
        if (file.isDirectory())
        {
            String as[] = file.list();
            for (int i = 0; i < as.length; i++)
            {
                if (!deleteDirectory(new File(file, as[i])))
                {
                    return false;
                }
            }

        }
        return file.delete();
    }

    public static String getDocumentPath(Context context)
    {
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            context = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            context.mkdirs();
            return context.getAbsolutePath();
        } else
        {
            return context.getFilesDir().getAbsolutePath();
        }
    }

    public static String getFileNameByUri(Uri uri, Context context)
    {
        Object obj = null;
        Log.d("FileService", "Getting filename from uri...");
        Log.d("FileService", (new StringBuilder()).append("... schema -> ").append(uri.getScheme().toString()).toString());
        if (uri.getScheme().toString().compareTo("content") == 0)
        {
            context = context.getContentResolver().query(uri, null, null, null, null);
            uri = obj;
            if (context.moveToFirst())
            {
                int i = context.getColumnIndexOrThrow("_data");
                Log.d("FileService", (new StringBuilder()).append("... column_index -> ").append(i).toString());
                uri = Uri.parse(context.getString(i)).getPath();
            }
        } else
        if (uri.getScheme().compareTo("file") == 0)
        {
            uri = uri.getPath();
        } else
        {
            uri = (new StringBuilder()).append(null).append("_").append(uri.getLastPathSegment().toString()).toString();
        }
        Log.d("FileService", (new StringBuilder()).append("... fileName -> ").append(uri).toString());
        return uri;
    }

    public static String getLocalPath(Context context)
    {
        return context.getFilesDir().getAbsolutePath();
    }
}
