// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Log;
import com.mixpanel.android.util.HttpService;
import com.mixpanel.android.util.RemoteService;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class ImageStore
{
    public static class CantGetImageException extends Exception
    {

        public CantGetImageException(String s)
        {
            super(s);
        }

        public CantGetImageException(String s, Throwable throwable)
        {
            super(s, throwable);
        }
    }


    private static final String DEFAULT_DIRECTORY_NAME = "MixpanelAPI.Images";
    private static final String FILE_PREFIX = "MP_IMG_";
    private static final String LOGTAG = "MixpanelAPI.ImageStore";
    private static final int MAX_BITMAP_SIZE = 0x989680;
    private final MessageDigest mDigest;
    private final File mDirectory;
    private final RemoteService mPoster;

    public ImageStore(Context context)
    {
        this(context.getDir("MixpanelAPI.Images", 0), ((RemoteService) (new HttpService())));
    }

    public ImageStore(File file, RemoteService remoteservice)
    {
        mDirectory = file;
        mPoster = remoteservice;
        try
        {
            file = MessageDigest.getInstance("SHA1");
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            Log.w("MixpanelAPI.ImageStore", "Images won't be stored because this platform doesn't supply a SHA1 hash function");
            file = null;
        }
        mDigest = file;
    }

    private File storedFile(String s)
    {
        if (mDigest == null)
        {
            return null;
        } else
        {
            s = mDigest.digest(s.getBytes());
            s = (new StringBuilder("MP_IMG_")).append(Base64.encodeToString(s, 10)).toString();
            return new File(mDirectory, s);
        }
    }

    public void clearStorage()
    {
        File afile[] = mDirectory.listFiles();
        int j = afile.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            File file = afile[i];
            if (file.getName().startsWith("MP_IMG_"))
            {
                file.delete();
            }
            i++;
        } while (true);
    }

    public void deleteStorage(String s)
    {
        s = storedFile(s);
        if (s != null)
        {
            s.delete();
        }
    }

    public Bitmap getImage(String s)
        throws CantGetImageException
    {
        Object obj;
        Object obj2;
        Object obj3;
        File file;
        file = storedFile(s);
        byte abyte0[] = null;
        if (file == null || !file.exists())
        {
            try
            {
                abyte0 = mPoster.performRequest(s, null);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new CantGetImageException("Can't download bitmap", s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new CantGetImageException("Couldn't download image due to service availability", s);
            }
        }
        if (abyte0 == null) goto _L2; else goto _L1
_L1:
        if (file == null || abyte0.length >= 0x989680)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        s = null;
        obj3 = null;
        obj2 = null;
        obj = new FileOutputStream(file);
        ((OutputStream) (obj)).write(abyte0);
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.w("MixpanelAPI.ImageStore", "Problem closing output file", s);
            }
        }
        obj = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
        s = ((String) (obj));
        if (obj == null)
        {
            throw new CantGetImageException("Downloaded data could not be interpreted as a bitmap");
        }
          goto _L3
        obj;
        s = obj2;
_L7:
        throw new CantGetImageException("It appears that ImageStore is misconfigured, or disk storage is unavailable- can't write to bitmap directory", ((Throwable) (obj)));
        obj;
_L4:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.w("MixpanelAPI.ImageStore", "Problem closing output file", s);
            }
        }
        throw obj;
        obj;
        s = obj3;
_L5:
        throw new CantGetImageException("Can't store bitmap", ((Throwable) (obj)));
_L2:
        obj = BitmapFactory.decodeFile(file.getAbsolutePath());
        s = ((String) (obj));
        if (obj == null)
        {
            file.delete();
            throw new CantGetImageException("Bitmap on disk can't be opened or was corrupt");
        }
_L3:
        return s;
        Object obj1;
        obj1;
        s = ((String) (obj));
        obj = obj1;
          goto _L4
        obj1;
        s = ((String) (obj));
        obj = obj1;
          goto _L5
        obj1;
        s = ((String) (obj));
        obj = obj1;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
