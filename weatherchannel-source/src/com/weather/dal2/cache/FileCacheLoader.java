// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.cache;

import android.net.TrafficStats;
import com.google.common.base.Preconditions;
import com.google.common.cache.CacheLoader;
import com.google.common.io.ByteStreams;
import com.weather.dal2.exceptions.DalException;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.weather.dal2.cache:
//            FileCache, FileNameUtils

public abstract class FileCacheLoader extends CacheLoader
{

    private static final String TAG = "FileCacheLoader";
    private volatile FileCache fileCache;

    public FileCacheLoader()
    {
    }

    protected InputStream getContents(Object obj)
        throws Exception
    {
        return new ByteArrayInputStream(new byte[0]);
    }

    protected byte[] getContentsBytes(Object obj)
        throws Exception
    {
        return null;
    }

    public volatile Object load(Object obj)
        throws Exception
    {
        return load(obj);
    }

    public String load(Object obj)
        throws Exception
    {
        Preconditions.checkNotNull(obj);
        if (fileCache == null)
        {
            throw new DalException("FileCacheLoader: fileCache is null");
        }
        String s = fileCache.getCacheId();
        LogUtil.d("FileCacheLoader", LoggingMetaTags.TWC_DAL_CACHE, "File memcache miss: load(%s, %s)", new Object[] {
            s, obj
        });
        String s1 = fileCache.recoveredFile(FileNameUtils.toBaseName(obj.toString()));
        if (s1 == null)
        {
            LogUtil.d("FileCacheLoader", LoggingMetaTags.TWC_DAL_CACHE, "FileCacheLoader - Recovered file miss, truly loading: %s, %s", new Object[] {
                s, obj
            });
            return loadContents(obj);
        }
        if ((new File(s1)).exists())
        {
            LogUtil.d("FileCacheLoader", LoggingMetaTags.TWC_DAL_CACHE, "FileCacheLoader - Recovered file hit: %s, %s", new Object[] {
                s, obj
            });
            return s1;
        } else
        {
            LogUtil.d("FileCacheLoader", LoggingMetaTags.TWC_DAL_CACHE, "FileCacheLoader - Recovered file hit, but file not found - rebuilding: %s, %s", new Object[] {
                s, obj
            });
            return loadContents(obj);
        }
    }

    protected String loadContents(Object obj)
        throws Exception
    {
        InputStream inputstream;
        InputStream inputstream1;
        Object obj1;
        obj1 = null;
        inputstream1 = null;
        inputstream = obj1;
        byte abyte1[] = getContentsBytes(obj);
        byte abyte0[];
        abyte0 = abyte1;
        if (abyte1 != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        inputstream = obj1;
        inputstream1 = getContents(obj);
        inputstream = inputstream1;
        abyte0 = ByteStreams.toByteArray(inputstream1);
        inputstream = inputstream1;
        obj = FileNameUtils.createFileName(fileCache.getExpirationInMinutes(), obj.toString());
        inputstream = inputstream1;
        obj = fileCache.createFile(((String) (obj)), abyte0).getAbsolutePath();
        if (inputstream1 != null)
        {
            try
            {
                inputstream1.close();
            }
            catch (IOException ioexception) { }
        }
        TrafficStats.clearThreadStatsTag();
        return ((String) (obj));
        obj;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            catch (IOException ioexception1) { }
        }
        TrafficStats.clearThreadStatsTag();
        throw obj;
    }

    public void setCacheWrapper(FileCache filecache)
    {
        fileCache = (FileCache)Preconditions.checkNotNull(filecache);
    }
}
