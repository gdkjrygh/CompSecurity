// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.io.IOUtils;

// Referenced classes of package com.walmart.android.service:
//            Utils

public class DataCache
{
    private static interface StreamWriter
    {

        public abstract void onWriteToStream(FileOutputStream fileoutputstream)
            throws IOException;
    }


    private static final String TAG = com/walmart/android/service/DataCache.getSimpleName();
    private final android.graphics.BitmapFactory.Options mBitmapOptions = new android.graphics.BitmapFactory.Options();
    private final File mCacheDir = getCacheDir();
    private final String mCacheDirName;
    private Context mContext;

    public DataCache(Context context, String s)
    {
        mContext = context;
        mCacheDirName = s;
        mBitmapOptions.inDither = false;
    }

    private void cacheToStream(String s, StreamWriter streamwriter, long l)
    {
        DataOutputStream dataoutputstream;
        Object obj;
        Object obj1;
        File file;
        boolean flag;
        file = new File(getCacheDir(), s);
        System.currentTimeMillis();
        if (file.exists())
        {
            file.delete();
        }
        flag = true;
        obj1 = null;
        dataoutputstream = null;
        obj = null;
        s = new FileOutputStream(file);
        dataoutputstream = new DataOutputStream(s);
        dataoutputstream.writeLong(l);
        dataoutputstream.flush();
        streamwriter.onWriteToStream(s);
        flag = false;
        Utils.closeQuietly(s);
_L1:
        if (flag)
        {
            file.delete();
        }
        return;
        s;
        s = obj;
_L5:
        Utils.closeQuietly(s);
          goto _L1
        s;
        s = obj1;
_L4:
        Utils.closeQuietly(s);
          goto _L1
        streamwriter;
        s = dataoutputstream;
_L3:
        Utils.closeQuietly(s);
        throw streamwriter;
        streamwriter;
        if (true) goto _L3; else goto _L2
_L2:
        streamwriter;
          goto _L4
        streamwriter;
          goto _L5
    }

    private int cleanup(File afile[])
    {
        int i;
        int j;
        long l1;
        j = 0;
        i = 0;
        l1 = System.currentTimeMillis();
        if (afile == null) goto _L2; else goto _L1
_L1:
        int k;
        int l;
        l = afile.length;
        k = 0;
_L3:
        Object obj;
        Object obj1;
        Object obj3;
        Object obj4;
        File file;
        j = i;
        if (k >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        file = afile[k];
        obj3 = null;
        obj4 = null;
        obj = null;
        obj1 = null;
        FileInputStream fileinputstream = new FileInputStream(file);
        long l2 = (new DataInputStream(fileinputstream)).readLong();
        j = i;
        if (file.lastModified() + l2 > l1)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        file.delete();
        j = i + 1;
        Utils.closeQuietly(fileinputstream);
        i = j;
_L4:
        k++;
        if (true) goto _L3; else goto _L2
        obj;
        fileinputstream = ((FileInputStream) (obj1));
        obj1 = obj;
_L9:
        obj = fileinputstream;
        ((FileNotFoundException) (obj1)).printStackTrace();
        Utils.closeQuietly(fileinputstream);
          goto _L4
        Object obj2;
        obj2;
        fileinputstream = obj3;
_L8:
        obj = fileinputstream;
        ((IOException) (obj2)).printStackTrace();
        Utils.closeQuietly(fileinputstream);
          goto _L4
        obj2;
        fileinputstream = obj4;
_L7:
        obj = fileinputstream;
        ((NumberFormatException) (obj2)).printStackTrace();
        Utils.closeQuietly(fileinputstream);
          goto _L4
        afile;
_L6:
        Utils.closeQuietly(((java.io.Closeable) (obj)));
        throw afile;
_L2:
        return j;
        afile;
        obj = fileinputstream;
        if (true) goto _L6; else goto _L5
_L5:
        obj2;
          goto _L7
        obj2;
          goto _L8
        obj2;
          goto _L9
    }

    private File getCacheDir()
    {
        File file = new File(mContext.getCacheDir(), mCacheDirName);
        file.mkdir();
        return file;
    }

    public void cacheData(String s, final byte data[], long l)
    {
        if (data != null)
        {
            cacheToStream(s, new StreamWriter() {

                final DataCache this$0;
                final byte val$data[];

                public void onWriteToStream(FileOutputStream fileoutputstream)
                    throws IOException
                {
                    fileoutputstream.write(data);
                    fileoutputstream.flush();
                }

            
            {
                this$0 = DataCache.this;
                data = abyte0;
                super();
            }
            }, l);
        }
    }

    public void cacheImage(String s, final Bitmap bmp, long l)
    {
        cacheToStream(s, new StreamWriter() {

            final DataCache this$0;
            final Bitmap val$bmp;

            public void onWriteToStream(FileOutputStream fileoutputstream)
                throws IOException
            {
                if (!bmp.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, fileoutputstream))
                {
                    Log.e(DataCache.TAG, "Failed to compress image.");
                    throw new IOException("Failed to compress image.");
                } else
                {
                    return;
                }
            }

            
            {
                this$0 = DataCache.this;
                bmp = bitmap;
                super();
            }
        }, l);
    }

    public void cacheImageOld(String s, Bitmap bitmap, long l)
    {
        DataOutputStream dataoutputstream;
        Object obj;
        Object obj1;
        File file;
        boolean flag;
        boolean flag1;
        file = new File(getCacheDir(), s);
        System.currentTimeMillis();
        if (file.exists())
        {
            file.delete();
        }
        flag1 = true;
        flag = true;
        obj1 = null;
        dataoutputstream = null;
        obj = null;
        s = new FileOutputStream(file);
        dataoutputstream = new DataOutputStream(s);
        dataoutputstream.writeLong(l);
        dataoutputstream.flush();
        if (bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, s)) goto _L2; else goto _L1
_L1:
        Log.e(TAG, "Failed to compress image!!!");
_L3:
        Utils.closeQuietly(s);
_L4:
        if (flag)
        {
            file.delete();
        }
        return;
_L2:
        flag = false;
          goto _L3
        s;
        s = obj;
_L8:
        Utils.closeQuietly(s);
        flag = flag1;
          goto _L4
        s;
        s = obj1;
_L7:
        Utils.closeQuietly(s);
        flag = flag1;
          goto _L4
        bitmap;
        s = dataoutputstream;
_L6:
        Utils.closeQuietly(s);
        throw bitmap;
        bitmap;
        if (true) goto _L6; else goto _L5
_L5:
        bitmap;
          goto _L7
        bitmap;
          goto _L8
    }

    public void cleanup()
    {
        File afile[] = mCacheDir.listFiles();
        if (afile == null)
        {
            return;
        } else
        {
            cleanup(afile);
            return;
        }
    }

    public void cleanupIfLargerThan(long l)
    {
        File afile[] = getCacheDir().listFiles();
        if (afile != null)
        {
            System.currentTimeMillis();
            long l1 = 0L;
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                l1 += afile[i].length();
            }

            if (l1 > l)
            {
                cleanup(afile);
                return;
            }
        }
    }

    public boolean deleteData(String s)
    {
        return (new File(getCacheDir(), s)).delete();
    }

    public byte[] getData(String s)
    {
        Object obj;
        Object obj1;
        Object obj3;
        obj = null;
        s = new File(mCacheDir, s);
        if (!s.exists())
        {
            break MISSING_BLOCK_LABEL_61;
        }
        obj3 = null;
        obj = null;
        obj1 = null;
        s = new FileInputStream(s);
        obj = new DataInputStream(s);
        ((DataInputStream) (obj)).readLong();
        obj = IOUtils.toByteArray(((java.io.InputStream) (obj)));
        Utils.closeQuietly(s);
        return ((byte []) (obj));
        s;
        s = obj1;
_L6:
        Utils.closeQuietly(s);
        return null;
        Object obj2;
        obj2;
        s = obj3;
_L4:
        obj = s;
        Log.e(TAG, "getImage()", ((Throwable) (obj2)));
        Utils.closeQuietly(s);
        return null;
        s;
_L2:
        Utils.closeQuietly(((java.io.Closeable) (obj)));
        throw s;
        obj2;
        obj = s;
        s = ((String) (obj2));
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        if (true) goto _L4; else goto _L3
_L3:
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Bitmap getImage(String s)
    {
        Object obj;
        Object obj1;
        Object obj3;
        obj = null;
        s = new File(mCacheDir, s);
        if (!s.exists())
        {
            break MISSING_BLOCK_LABEL_64;
        }
        obj3 = null;
        obj = null;
        obj1 = null;
        s = new FileInputStream(s);
        (new DataInputStream(s)).readLong();
        obj = BitmapFactory.decodeStream(s, null, mBitmapOptions);
        Utils.closeQuietly(s);
        return ((Bitmap) (obj));
        s;
        s = obj1;
_L6:
        Utils.closeQuietly(s);
        return null;
        Object obj2;
        obj2;
        s = obj3;
_L4:
        obj = s;
        Log.e(TAG, "getImage()", ((Throwable) (obj2)));
        Utils.closeQuietly(s);
        return null;
        s;
_L2:
        Utils.closeQuietly(((java.io.Closeable) (obj)));
        throw s;
        obj2;
        obj = s;
        s = ((String) (obj2));
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        if (true) goto _L4; else goto _L3
_L3:
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean isDataCached(String s)
    {
        return (new File(mCacheDir, s)).exists();
    }


}
