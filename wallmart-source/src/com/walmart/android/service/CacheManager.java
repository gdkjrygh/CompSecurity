// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class CacheManager
{

    private static final String TAG = com/walmart/android/service/CacheManager.getSimpleName();
    private final File mCacheDir;

    public CacheManager(File file)
    {
        mCacheDir = file;
    }

    private boolean isExpired(File file)
    {
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_73;
        }
        file = new BufferedReader(new FileReader(file));
        String s = file.readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        long l;
        long l1;
        l = Long.parseLong(s);
        l1 = System.currentTimeMillis();
        if (l1 >= l)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        file.close();
        return false;
        Exception exception;
        try
        {
            file.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
        break MISSING_BLOCK_LABEL_73;
        exception;
        file.close();
        throw exception;
        return true;
    }

    public void cacheData(InputStream inputstream, String s, String s1, long l)
    {
        cacheDataUntil(inputstream, s, s1, System.currentTimeMillis() + l);
    }

    public void cacheData(String s, String s1, String s2, long l)
    {
        cacheDataUntil(s, s1, s2, System.currentTimeMillis() + l);
    }

    public void cacheDataUntil(InputStream inputstream, String s, String s1, long l)
    {
        s = new File(mCacheDir, s);
        s1 = new File(mCacheDir, s1);
        try
        {
            s.delete();
            s1.delete();
            s = new FileWriter(s);
            IOUtils.copy(inputstream, s);
            s.close();
            inputstream = new FileWriter(s1);
            inputstream.write(String.valueOf(l));
            inputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
        }
    }

    public void cacheDataUntil(String s, String s1, String s2, long l)
    {
        s1 = new File(mCacheDir, s1);
        s2 = new File(mCacheDir, s2);
        try
        {
            s1.delete();
            s2.delete();
            FileUtils.writeStringToFile(s1, s);
            s = new FileWriter(s2);
            s.write(String.valueOf(l));
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    public void clearCache()
    {
        File afile[] = mCacheDir.listFiles();
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            afile[i].delete();
        }

    }

    public void deleteCachedFile(String s, String s1)
    {
        s = new File(mCacheDir, s);
        s1 = new File(mCacheDir, s1);
        if (s.exists())
        {
            s.delete();
            s1.delete();
        }
    }

    public String getCachedData(String s, String s1)
    {
        Object obj = null;
        File file = getCachedFile(s, s1);
        s1 = obj;
        if (file != null)
        {
            s1 = obj;
            if (file.exists())
            {
                try
                {
                    s1 = FileUtils.readFileToString(file);
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    Log.e(TAG, (new StringBuilder()).append("getCachedData(): Error reading cached data: ").append(s).toString(), s1);
                    s1.printStackTrace();
                    return null;
                }
            }
        }
        return s1;
    }

    public File getCachedFile(String s, String s1)
    {
        File file = new File(mCacheDir, s);
        s1 = new File(mCacheDir, s1);
        s = file;
        if (file.exists())
        {
            s = file;
            if (isExpired(s1))
            {
                file.delete();
                s1.delete();
                s = null;
            }
        }
        return s;
    }

}
