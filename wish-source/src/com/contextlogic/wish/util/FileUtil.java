// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.util;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import ch.boye.httpclientandroidlib.util.ByteArrayBuffer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileUtil
{

    public FileUtil()
    {
    }

    public static byte[] getBytes(InputStream inputstream, byte abyte0[], long l)
        throws IOException
    {
        ByteArrayBuffer bytearraybuffer;
        if (l == 0L)
        {
            l = 32768L;
        }
        bytearraybuffer = new ByteArrayBuffer((int)l);
_L1:
        int i = inputstream.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        bytearraybuffer.append(abyte0, 0, i);
          goto _L1
        abyte0;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
        }
        throw abyte0;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
        }
        if (bytearraybuffer.capacity() == bytearraybuffer.length())
        {
            return bytearraybuffer.buffer();
        } else
        {
            return bytearraybuffer.toByteArray();
        }
    }

    public static String getDataColumn(Context context, Uri uri, String s, String as[])
    {
        Context context1 = null;
        context = context.getContentResolver().query(uri, new String[] {
            "_data"
        }, s, as, null);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        context1 = context;
        if (!context.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_70;
        }
        context1 = context;
        uri = context.getString(context.getColumnIndexOrThrow("_data"));
        if (context != null)
        {
            context.close();
        }
        return uri;
        if (context != null)
        {
            context.close();
        }
        return null;
        context;
        if (context1 != null)
        {
            context1.close();
        }
        throw context;
    }

    public static byte[] getFileBytes(File file, byte abyte0[])
        throws IOException
    {
        File file1;
        Exception exception;
        exception = null;
        file1 = null;
        Object obj = new ByteArrayOutputStream();
        file = new FileInputStream(file);
_L3:
        int i = file.read(abyte0);
        if (i == -1) goto _L2; else goto _L1
_L1:
        ((ByteArrayOutputStream) (obj)).write(abyte0, 0, i);
          goto _L3
        exception;
        file1 = file;
        abyte0 = ((byte []) (obj));
        file = exception;
        obj = file1;
_L5:
        if (abyte0 != null)
        {
            try
            {
                abyte0.close();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[]) { }
        }
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[]) { }
        }
        throw file;
_L2:
        if (obj != null)
        {
            try
            {
                ((ByteArrayOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[]) { }
        }
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        return ((ByteArrayOutputStream) (obj)).toByteArray();
        file;
        obj = file1;
        abyte0 = exception;
        continue; /* Loop/switch isn't completed */
        file;
        abyte0 = ((byte []) (obj));
        obj = file1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static String getPath(Context context, Uri uri)
    {
        String s = null;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag || !DocumentsContract.isDocumentUri(context, uri)) goto _L2; else goto _L1
_L1:
        if (!isExternalStorageDocument(uri)) goto _L4; else goto _L3
_L3:
        context = DocumentsContract.getDocumentId(uri).split(":");
        if ("primary".equalsIgnoreCase(context[0]))
        {
            s = (new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/").append(context[1]).toString();
        }
_L9:
        return s;
_L4:
        String as[];
        String s1;
        if (isDownloadsDocument(uri))
        {
            uri = DocumentsContract.getDocumentId(uri);
            return getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(uri).longValue()), null, null);
        }
        if (!isMediaDocument(uri))
        {
            continue; /* Loop/switch isn't completed */
        }
        as = DocumentsContract.getDocumentId(uri).split(":");
        s1 = as[0];
        uri = null;
        if (!"image".equals(s1)) goto _L6; else goto _L5
_L5:
        uri = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
_L7:
        return getDataColumn(context, uri, "_id=?", new String[] {
            as[1]
        });
_L6:
        if ("video".equals(s1))
        {
            uri = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else
        if ("audio".equals(s1))
        {
            uri = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        }
        if (true) goto _L7; else goto _L2
_L2:
        if ("content".equalsIgnoreCase(uri.getScheme()))
        {
            if (isGooglePhotosUri(uri))
            {
                return uri.getLastPathSegment();
            } else
            {
                return getDataColumn(context, uri, null, null);
            }
        }
        if ("file".equalsIgnoreCase(uri.getScheme()))
        {
            return uri.getPath();
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static boolean isDownloadsDocument(Uri uri)
    {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isExternalStorageDocument(Uri uri)
    {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isGooglePhotosUri(Uri uri)
    {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean isMediaDocument(Uri uri)
    {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
