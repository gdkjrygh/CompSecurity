// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.cache;

import android.content.Context;
import android.os.Environment;
import com.google.common.base.Preconditions;
import com.google.common.cache.LoadingCache;
import com.google.common.io.Files;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.device.FileUtils;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.dal2.cache:
//            BaseCache, FileNameUtils, FileCacheLoader, FileCaches

public final class FileCache extends BaseCache
{

    private static final int MILLIS_IN_ONE_SECOND = 1000;
    private static final int MINUTES_IN_ONE_HOUR = 60;
    private static final int SECONDS_IN_ONE_MINUTE = 60;
    private static final int STALE_FILE_EXPIRATION = 240;
    private static final String TAG = "FileCache";
    private final File dir;
    private final int expiration;
    private final String id;
    private final int maxSize;
    private final ConcurrentMap recoveredFileMap = new ConcurrentHashMap();

    private FileCache(FileCacheLoader filecacheloader, int i, int j, String s, FileCacheDirectory filecachedirectory)
    {
        super(filecacheloader, i, j, EnumSet.noneOf(com/weather/dal2/cache/BaseCache$Policy), null);
        expiration = j;
        maxSize = i;
        id = s;
    /* block-local class not found */
    class FileCacheDirectory {}

        if (filecachedirectory == FileCacheDirectory.APP_DIR)
        {
            filecacheloader = initAppDir();
        } else
        {
            filecacheloader = initCacheDir();
        }
        dir = filecacheloader;
        LogUtil.d("FileCache", LoggingMetaTags.TWC_DAL_CACHE, "cacheId=%s, dir=%s", new Object[] {
            s, dir
        });
        buildRecoveredMap();
    }

    private void buildRecoveredMap()
    {
        File afile[];
        int i;
        i = 0;
        LogUtil.method("FileCache", LoggingMetaTags.TWC_DAL_CACHE, "buildRecoveredMap", new Object[] {
            id
        });
        while (dir == null || (afile = dir.listFiles()) == null) 
        {
            return;
        }
        long l = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis());
        this;
        JVM INSTR monitorenter ;
        int j = afile.length;
_L2:
        File file;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        file = afile[i];
        String s;
        int k;
        s = file.getName();
        if (!FileNameUtils.isCachedFile(s))
        {
            break MISSING_BLOCK_LABEL_199;
        }
        k = FileNameUtils.extractExpirationTime(s);
        if (l < (long)k)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        if (canBeDeleted(k))
        {
            LogUtil.d("FileCache", LoggingMetaTags.TWC_DAL_CACHE, "buildRecoveredMap deleting: %s", new Object[] {
                s
            });
            FileUtils.delete(file);
            break MISSING_BLOCK_LABEL_199;
        }
        LogUtil.d("FileCache", LoggingMetaTags.TWC_DAL_CACHE, "buildRecoveredMap leaving: %s", new Object[] {
            s
        });
        break MISSING_BLOCK_LABEL_199;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        LogUtil.d("FileCache", LoggingMetaTags.TWC_DAL_CACHE, "buildRecoveredMap adding: %s", new Object[] {
            s
        });
        recoveredFileMap.put(FileNameUtils.extractBase(s), s);
        break MISSING_BLOCK_LABEL_199;
        this;
        JVM INSTR monitorexit ;
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static boolean canBeDeleted(int i)
    {
        return System.currentTimeMillis() / 1000L / 60L >= (long)(i + 240);
    }

    public static FileCache create(FileCacheLoader filecacheloader, int i, int j, String s, FileCacheDirectory filecachedirectory)
    {
        s = new FileCache(filecacheloader, i, j, s, filecachedirectory);
        filecacheloader.setCacheWrapper(s);
        FileCaches.INSTANCE.add(s);
        return s;
    }

    private static void createNoMediaFile(File file)
    {
        File file1 = new File(file, ".nomedia");
        try
        {
            if (file1.createNewFile())
            {
                LogUtil.d("FileCache", LoggingMetaTags.TWC_DAL_CACHE, "Created .nomedia file in: %s", new Object[] {
                    file.getName()
                });
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            EventLog.w("FileCache", (new StringBuilder()).append("Failed to create .nomedia file: ").append(file).toString());
        }
    }

    private boolean deleteFilesWithName(String s)
    {
        if (dir == null)
        {
            return false;
        }
        boolean flag1 = false;
        boolean flag = false;
        File afile[] = dir.listFiles();
        if (afile != null)
        {
            int j = afile.length;
            int i = 0;
            do
            {
                flag1 = flag;
                if (i >= j)
                {
                    break;
                }
                File file = afile[i];
                flag1 = flag;
                if (FileNameUtils.isCachedFile(file.getName()))
                {
                    flag1 = flag;
                    if (FileNameUtils.hasKey(file, s))
                    {
                        LogUtil.d("FileCache", LoggingMetaTags.TWC_DAL_CACHE, "Deleting old file: %s", new Object[] {
                            file.getName()
                        });
                        if (flag || FileUtils.delete(file))
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                    }
                }
                i++;
                flag = flag1;
            } while (true);
        }
        return flag1;
    }

    private File initAppDir()
    {
        File file = null;
        if ("mounted".equals(Environment.getExternalStorageState()))
        {
            File file2 = FileUtils.getExternalAppDir();
            file = file2;
            if (file2 != null)
            {
                file = initCacheFolder(file2);
            }
        }
        File file3 = file;
        if (file == null)
        {
            File file1 = AbstractTwcApplication.getRootContext().getFilesDir();
            file3 = file1;
            if (file1 != null)
            {
                file3 = initCacheFolder(file1);
            }
        }
        if (file3 == null || !file3.exists() || !file3.isDirectory())
        {
            EventLog.e("FileCache", "Unable to determine App directory");
            return null;
        } else
        {
            LogUtil.d("FileCache", LoggingMetaTags.TWC_DAL_CACHE, "App Dir: %s", new Object[] {
                file3
            });
            return file3;
        }
    }

    private File initCacheDir()
    {
        File file = null;
        if ("mounted".equals(Environment.getExternalStorageState()))
        {
            File file2 = FileUtils.getExternalCacheDir();
            file = file2;
            if (file2 != null)
            {
                file = initCacheFolder(file2);
            }
        }
        File file3 = file;
        if (file == null)
        {
            File file1 = AbstractTwcApplication.getRootContext().getCacheDir();
            file3 = file1;
            if (file1 != null)
            {
                file3 = initCacheFolder(file1);
            }
        }
        if (file3 != null && file3.exists())
        {
            createNoMediaFile(file3);
        }
        if (file3 == null || !file3.exists() || !file3.isDirectory())
        {
            EventLog.e("FileCache", "Unable to determine Cache directory");
            return null;
        } else
        {
            LogUtil.d("FileCache", LoggingMetaTags.TWC_DAL_CACHE, "Cache Dir: %s", new Object[] {
                file3
            });
            return file3;
        }
    }

    private File initCacheFolder(File file)
    {
        File file1 = file;
        file = file1;
        if (file1 != null)
        {
            file = new File(file1, (new StringBuilder()).append("CACHE_").append(id).toString());
        }
        file1 = file;
        if (file != null)
        {
            file1 = file;
            if (!file.exists())
            {
                file1 = file;
                if (!file.mkdirs())
                {
                    EventLog.e("FileCache", (new StringBuilder()).append("Unable to create dir at:").append(file.getPath()).toString());
                    file1 = null;
                }
            }
        }
        return file1;
    }

    int cleanup()
    {
        int j = 0;
        int i = 0;
        if (dir == null)
        {
            return 0;
        }
        LogUtil.method("FileCache", LoggingMetaTags.TWC_DAL_CACHE, "Cleanup", new Object[] {
            id
        });
        HashMap hashmap = new HashMap();
    /* block-local class not found */
    class CachedFileNameFilter {}

        File afile[] = dir.listFiles(new CachedFileNameFilter(null));
        if (afile != null)
        {
    /* block-local class not found */
    class MostRecentFileSorter {}

            Arrays.sort(afile, new MostRecentFileSorter(null));
            int l = afile.length;
            int k = 0;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                File file = afile[k];
                String s1 = file.getName();
                String s = FileNameUtils.extractBase(s1);
                j = i;
                if (FileNameUtils.isCachedFile(s1))
                {
                    j = FileNameUtils.extractExpirationTime(s1);
                    long l1 = System.currentTimeMillis() / 1000L / 60L;
                    if (canBeDeleted(expiration) && l1 >= (long)j)
                    {
                        LogUtil.d("FileCache", LoggingMetaTags.TWC_DAL_CACHE, "Cleanup - %s - Deleting stale file:%s", new Object[] {
                            id, file.getName()
                        });
                        FileUtils.delete(file);
                        j = i;
                    } else
                    {
                        Integer integer = (Integer)hashmap.get(s);
                        if (integer == null)
                        {
                            if (hashmap.size() >= maxSize)
                            {
                                LogUtil.d("FileCache", LoggingMetaTags.TWC_DAL_CACHE, "Cleanup - %s - Deleting file due to cache size:%s", new Object[] {
                                    id, file.getName()
                                });
                                FileUtils.delete(file);
                                j = i;
                            } else
                            {
                                hashmap.put(s, Integer.valueOf(1));
                                j = i + 1;
                            }
                        } else
                        if (integer.intValue() == 1)
                        {
                            hashmap.put(s, Integer.valueOf(2));
                            j = i + 1;
                        } else
                        {
                            j = i;
                            if (integer.intValue() >= 2)
                            {
                                LogUtil.d("FileCache", LoggingMetaTags.TWC_DAL_CACHE, "Cleanup - %s - Deleting less recent file:%s", new Object[] {
                                    id, file.getName()
                                });
                                FileUtils.delete(file);
                                j = i;
                            }
                        }
                    }
                }
                k++;
                i = j;
            } while (true);
        }
        return j;
    }

    public File createFile(String s, byte abyte0[])
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        s = new File(dir, s);
        Files.write(abyte0, s);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public void deleteCache()
    {
        FileCaches.INSTANCE.remove(this);
        FileCaches.clearFiles(dir);
    }

    public volatile Object fetch(Object obj)
        throws Exception
    {
        return fetch(obj);
    }

    public String fetch(Object obj)
        throws Exception
    {
        this;
        JVM INSTR monitorenter ;
        String s1;
        LogUtil.method("FileCache", LoggingMetaTags.TWC_DAL_CACHE, "fetch", new Object[] {
            obj
        });
        Preconditions.checkNotNull(obj);
        s1 = (String)cache.get(obj);
        String s = s1;
        if (!(new File(s1)).exists())
        {
            cache.invalidate(obj);
            s = (String)cache.get(obj);
        }
        this;
        JVM INSTR monitorexit ;
        return s;
        obj;
        throw obj;
    }

    String getCacheId()
    {
        return id;
    }

    int getExpirationInMinutes()
    {
        return expiration;
    }

    public void invalidate(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        Preconditions.checkNotNull(obj);
        cache.invalidate(obj);
        deleteFilesWithName(obj.toString());
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    public void invalidateAll()
    {
        this;
        JVM INSTR monitorenter ;
        if (dir != null)
        {
            cache.invalidateAll();
            recoveredFileMap.clear();
            FileUtils.clearDirectory(dir);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    String recoveredFile(String s)
    {
        Object obj = null;
        String s1 = obj;
        if (dir != null)
        {
            String s2 = (String)recoveredFileMap.get(s);
            Iterable iterable = LoggingMetaTags.TWC_DAL_CACHE;
            if (s2 == null)
            {
                s1 = "not found";
            } else
            {
                s1 = "found";
            }
            LogUtil.d("FileCache", iterable, "  Checking for recoveredFile: %s: %s", new Object[] {
                s, s1
            });
            s1 = obj;
            if (s2 != null)
            {
                int i = FileNameUtils.extractExpirationTime(s2);
                s1 = obj;
                if (System.currentTimeMillis() / 1000L / 60L < (long)i)
                {
                    s1 = (new StringBuilder()).append(dir.getAbsolutePath()).append('/').append(s2).toString();
                }
            }
        }
        return s1;
    }

    public String toString()
    {
        return id;
    }
}
