// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.cache;

import android.graphics.Bitmap;
import android.os.Environment;
import android.support.v4.util.LruCache;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.util.BitmapUtil;
import com.contextlogic.wish.util.FileUtil;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.contextlogic.wish.cache:
//            CachedObject, DiskLruCache

public class PersistedCache
{

    private static final long EXTERNAL_PERSISTENT_CACHE_MAX_SIZE = 0x1e00000L;
    private static final long INTERNAL_PERSISTENT_CACHE_MAX_SIZE = 0xa00000L;
    private static final int IN_MEMORY_CACHE_SIZE = 0x180000;
    private static PersistedCache _instance = new PersistedCache();
    private ConcurrentHashMap bufferCache;
    private DiskLruCache diskLruCache;
    private boolean diskLruCacheReady;
    private Bitmap dummyBitmap;
    private boolean externalDiskCacheAvailable;
    private String externalDiskCachePath;
    private LruCache inMemoryCache;
    private ExecutorService initializeThreadPool;
    private boolean internalDiskCacheAvailable;
    private String internalDiskCachePath;
    private ExecutorService writeThreadPool;

    private PersistedCache()
    {
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            File file = WishApplication.getAppInstance().getExternalCacheDir();
            if (file != null)
            {
                externalDiskCachePath = (new StringBuilder()).append(file.getAbsolutePath()).append("/wish_cache/").toString();
                file = new File(externalDiskCachePath);
                file.mkdirs();
                externalDiskCacheAvailable = file.exists();
            }
        } else
        {
            externalDiskCachePath = null;
            externalDiskCacheAvailable = false;
        }
        try
        {
            internalDiskCachePath = (new StringBuilder()).append(WishApplication.getAppInstance().getCacheDir().getAbsolutePath()).append("/web_cache/").toString();
            File file1 = new File(internalDiskCachePath);
            file1.mkdirs();
            internalDiskCacheAvailable = file1.exists();
        }
        catch (Throwable throwable)
        {
            internalDiskCachePath = "";
            internalDiskCacheAvailable = false;
        }
        writeThreadPool = Executors.newFixedThreadPool(2, new ThreadFactory() {

            final PersistedCache this$0;

            public Thread newThread(Runnable runnable)
            {
                runnable = new Thread(runnable);
                runnable.setPriority(1);
                return runnable;
            }

            
            {
                this$0 = PersistedCache.this;
                super();
            }
        });
        initializeThreadPool = Executors.newFixedThreadPool(1, new ThreadFactory() {

            final PersistedCache this$0;

            public Thread newThread(Runnable runnable)
            {
                runnable = new Thread(runnable);
                runnable.setPriority(1);
                return runnable;
            }

            
            {
                this$0 = PersistedCache.this;
                super();
            }
        });
        bufferCache = new ConcurrentHashMap();
        initializeDiskLruCache();
        inMemoryCache = new LruCache(0x180000) {

            final PersistedCache this$0;

            protected volatile void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
            {
                entryRemoved(flag, (String)obj, (CachedObject)obj1, (CachedObject)obj2);
            }

            protected void entryRemoved(boolean flag, String s, CachedObject cachedobject, CachedObject cachedobject1)
            {
                super.entryRemoved(flag, s, cachedobject, cachedobject1);
                if (!flag || cachedobject == null) goto _L2; else goto _L1
_L1:
                cachedobject1 = getSanitizedCacheKey(s);
                if (!diskLruCacheReady) goto _L2; else goto _L3
_L3:
                boolean flag1 = false;
                cachedobject1 = diskLruCache.get(cachedobject1);
                if (cachedobject1 != null)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
_L9:
                if (flag1) goto _L2; else goto _L4
_L4:
                cachedobject = ((CachedObject) (cachedobject.getObject()));
                if (!(cachedobject instanceof String)) goto _L6; else goto _L5
_L5:
                cacheString(s, (String)cachedobject, true);
_L2:
                return;
_L6:
                if (!(cachedobject instanceof byte[])) goto _L2; else goto _L7
_L7:
                cacheBitmap(s, (byte[])(byte[])cachedobject, true);
                return;
                cachedobject1;
                if (true) goto _L9; else goto _L8
_L8:
            }

            protected volatile int sizeOf(Object obj, Object obj1)
            {
                return sizeOf((String)obj, (CachedObject)obj1);
            }

            protected int sizeOf(String s, CachedObject cachedobject)
            {
                s = ((String) (cachedobject.getObject()));
                if (s instanceof byte[])
                {
                    return ((byte[])(byte[])s).length;
                }
                if (s instanceof String)
                {
                    return ((String)s).length() * 2;
                } else
                {
                    return 1;
                }
            }

            
            {
                this$0 = PersistedCache.this;
                super(i);
            }
        };
        dummyBitmap = Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ALPHA_8);
    }

    public static PersistedCache getInstance()
    {
        return _instance;
    }

    private String getSanitizedCacheKey(String s)
    {
        if (s == null)
        {
            throw new RuntimeException("Null cacheKey passed in");
        }
        StringBuilder stringbuilder = new StringBuilder(s.length());
        boolean flag1 = false;
        int i = 0;
        while (i < s.length()) 
        {
            char c = s.charAt(i);
            boolean flag;
            if (c != '.' && c != ':' && c != '/' && c != ',' && c != '%' && c != '?' && c != '&' && c != '=' && c != '+')
            {
                stringbuilder.append(c);
                flag = false;
            } else
            {
                flag = flag1;
                if (!flag1)
                {
                    stringbuilder.append('+');
                    flag = true;
                }
            }
            i++;
            flag1 = flag;
        }
        return stringbuilder.toString();
    }

    private void initializeDiskLruCache()
    {
        if (externalDiskCacheAvailable)
        {
            initializeThreadPool.execute(new Runnable() {

                final PersistedCache this$0;

                public void run()
                {
                    try
                    {
                        diskLruCache = DiskLruCache.open(new File(externalDiskCachePath), 1, 1, 0x1e00000L);
                        diskLruCacheReady = true;
                        return;
                    }
                    catch (Throwable throwable)
                    {
                        diskLruCacheReady = false;
                    }
                }

            
            {
                this$0 = PersistedCache.this;
                super();
            }
            });
        } else
        if (internalDiskCacheAvailable)
        {
            initializeThreadPool.execute(new Runnable() {

                final PersistedCache this$0;

                public void run()
                {
                    try
                    {
                        diskLruCache = DiskLruCache.open(new File(internalDiskCachePath), 1, 1, 0xa00000L);
                        diskLruCacheReady = true;
                        return;
                    }
                    catch (Throwable throwable)
                    {
                        diskLruCacheReady = false;
                    }
                }

            
            {
                this$0 = PersistedCache.this;
                super();
            }
            });
            return;
        }
    }

    public void cacheBitmap(final String cacheKey, final byte imageBytes[], boolean flag)
    {
        if (imageBytes != null)
        {
            if (!flag)
            {
                inMemoryCache.put(cacheKey, new CachedObject(System.currentTimeMillis(), imageBytes));
            }
            cacheKey = getSanitizedCacheKey(cacheKey);
            if (diskLruCacheReady)
            {
                writeThreadPool.execute(new Runnable() {

                    final PersistedCache this$0;
                    final String val$cacheKey;
                    final byte val$imageBytes[];

                    public void run()
                    {
                        DiskLruCache.Editor editor = null;
                        DiskLruCache.Editor editor1 = diskLruCache.edit(cacheKey);
                        if (editor1 == null)
                        {
                            break MISSING_BLOCK_LABEL_38;
                        }
                        editor = editor1;
                        editor1.set(0, imageBytes);
                        editor = editor1;
                        editor1.commit();
_L1:
                        return;
                        Throwable throwable1;
                        throwable1;
                        if (editor != null)
                        {
                            try
                            {
                                editor.abort();
                                return;
                            }
                            catch (Throwable throwable)
                            {
                                return;
                            }
                        }
                          goto _L1
                    }

            
            {
                this$0 = PersistedCache.this;
                cacheKey = s;
                imageBytes = abyte0;
                super();
            }
                });
                return;
            }
        }
    }

    public void cacheString(final String cacheKey, final String value, boolean flag)
    {
        if (value != null)
        {
            if (!flag)
            {
                inMemoryCache.put(cacheKey, new CachedObject(System.currentTimeMillis(), value));
            }
            cacheKey = getSanitizedCacheKey(cacheKey);
            if (diskLruCacheReady)
            {
                writeThreadPool.execute(new Runnable() {

                    final PersistedCache this$0;
                    final String val$cacheKey;
                    final String val$value;

                    public void run()
                    {
                        DiskLruCache.Editor editor = null;
                        DiskLruCache.Editor editor1 = diskLruCache.edit(cacheKey);
                        if (editor1 == null)
                        {
                            break MISSING_BLOCK_LABEL_38;
                        }
                        editor = editor1;
                        editor1.set(0, value);
                        editor = editor1;
                        editor1.commit();
_L1:
                        return;
                        Throwable throwable1;
                        throwable1;
                        if (editor != null)
                        {
                            try
                            {
                                editor.abort();
                                return;
                            }
                            catch (Throwable throwable)
                            {
                                return;
                            }
                        }
                          goto _L1
                    }

            
            {
                this$0 = PersistedCache.this;
                cacheKey = s;
                value = s1;
                super();
            }
                });
                return;
            }
        }
    }

    public void clearCache()
    {
        clearInMemoryCache();
        if (diskLruCacheReady)
        {
            diskLruCacheReady = false;
            initializeThreadPool.execute(new Runnable() {

                final PersistedCache this$0;

                public void run()
                {
                    Exception exception;
                    try
                    {
                        if (externalDiskCacheAvailable)
                        {
                            File file = new File(externalDiskCachePath);
                            file.delete();
                            file.mkdirs();
                        }
                        if (internalDiskCacheAvailable)
                        {
                            File file1 = new File(internalDiskCachePath);
                            file1.delete();
                            file1.mkdirs();
                        }
                        diskLruCache.close();
                    }
                    catch (Throwable throwable)
                    {
                        initializeDiskLruCache();
                        return;
                    }
                    finally
                    {
                        initializeDiskLruCache();
                    }
                    initializeDiskLruCache();
                    return;
                    throw exception;
                }

            
            {
                this$0 = PersistedCache.this;
                super();
            }
            });
        }
    }

    public void clearInMemoryCache()
    {
        inMemoryCache.evictAll();
    }

    public Bitmap getCachedBitmap(String s, long l, boolean flag, boolean flag1, int i, int j, 
            boolean flag2)
    {
        Object obj = (CachedObject)inMemoryCache.get(s);
        if (obj != null)
        {
            long l1 = ((CachedObject) (obj)).getCacheTime();
            long l3 = System.currentTimeMillis();
            boolean flag3 = ((CachedObject) (obj)).getObject() instanceof byte[];
            if (l != -1L && !flag3 || l1 < l3 && l3 - l1 > l)
            {
                inMemoryCache.remove(s);
            } else
            if (flag1)
            {
                obj = BitmapUtil.decodeBitmap((byte[])(byte[])((CachedObject) (obj)).getObject(), i, j, flag2);
                if (obj != null)
                {
                    return ((Bitmap) (obj));
                }
            } else
            {
                return dummyBitmap;
            }
        }
        if (flag)
        {
            return null;
        }
        if (!diskLruCacheReady)
        {
            break MISSING_BLOCK_LABEL_629;
        }
        Object obj1 = getSanitizedCacheKey(s);
        obj = null;
        DiskLruCache.Snapshot snapshot;
        byte abyte0[];
        java.io.InputStream inputstream;
        long l2;
        long l4;
        try
        {
            snapshot = diskLruCache.get(((String) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (obj != null)
            {
                ((DiskLruCache.Snapshot) (obj)).close();
            }
            return null;
        }
        if (snapshot == null)
        {
            break MISSING_BLOCK_LABEL_629;
        }
        if (l == -1L)
        {
            break MISSING_BLOCK_LABEL_421;
        }
        obj = snapshot;
        l2 = snapshot.getTimestamp();
        obj = snapshot;
        l4 = System.currentTimeMillis();
        if (l2 >= l4 || l4 - l2 <= l)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        obj = snapshot;
        snapshot.close();
        obj = snapshot;
        diskLruCache.remove(((String) (obj1)));
        return null;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_401;
        }
        inputstream = snapshot.getInputStream(0);
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_394;
        }
        abyte0 = (byte[])bufferCache.get(Long.valueOf(Thread.currentThread().getId()));
        obj = abyte0;
        if (abyte0 != null)
        {
            break MISSING_BLOCK_LABEL_305;
        }
        obj = new byte[4096];
        bufferCache.put(Long.valueOf(Thread.currentThread().getId()), obj);
        if (snapshot.getLengths() == null || snapshot.getLengths().length <= 0)
        {
            break MISSING_BLOCK_LABEL_389;
        }
        l = snapshot.getLengths()[0];
_L1:
        obj = FileUtil.getBytes(inputstream, ((byte []) (obj)), l);
        abyte0 = BitmapUtil.decodeBitmap(((byte []) (obj)), i, j, flag2);
        inMemoryCache.put(s, new CachedObject(System.currentTimeMillis(), obj));
        return abyte0;
        s;
        obj = snapshot;
        snapshot.close();
        return null;
        l = 0L;
          goto _L1
        snapshot.close();
        return null;
        obj = snapshot;
        snapshot.close();
        obj = snapshot;
        s = dummyBitmap;
        return s;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_596;
        }
        inputstream = snapshot.getInputStream(0);
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_589;
        }
        abyte0 = (byte[])bufferCache.get(Long.valueOf(Thread.currentThread().getId()));
        obj = abyte0;
        if (abyte0 != null)
        {
            break MISSING_BLOCK_LABEL_495;
        }
        obj = new byte[4096];
        bufferCache.put(Long.valueOf(Thread.currentThread().getId()), obj);
        if (snapshot.getLengths() == null || snapshot.getLengths().length <= 0)
        {
            break MISSING_BLOCK_LABEL_584;
        }
        l = snapshot.getLengths()[0];
_L2:
        obj = FileUtil.getBytes(inputstream, ((byte []) (obj)), l);
        abyte0 = BitmapUtil.decodeBitmap(((byte []) (obj)), i, j, flag2);
        inMemoryCache.put(s, new CachedObject(System.currentTimeMillis(), obj));
        snapshot.close();
        return abyte0;
        s;
        obj = snapshot;
        snapshot.close();
        return null;
        l = 0L;
          goto _L2
        snapshot.close();
        return null;
        obj = snapshot;
        snapshot.close();
        obj = snapshot;
        s = dummyBitmap;
        return s;
        return null;
    }

    public Bitmap getCachedBitmap(String s, boolean flag, boolean flag1, int i, int j, boolean flag2)
    {
        return getCachedBitmap(s, -1L, flag, flag1, i, j, flag2);
    }

    public String getCachedString(String s, long l, boolean flag)
    {
        DiskLruCache.Snapshot snapshot;
        DiskLruCache.Snapshot snapshot1;
label0:
        {
            CachedObject cachedobject;
label1:
            {
                cachedobject = (CachedObject)inMemoryCache.get(s);
                if (cachedobject != null)
                {
                    long l1 = cachedobject.getCacheTime();
                    long l3 = System.currentTimeMillis();
                    boolean flag1 = cachedobject.getObject() instanceof String;
                    if ((l == -1L || flag1) && (l1 >= l3 || l3 - l1 <= l))
                    {
                        break label1;
                    }
                    inMemoryCache.remove(s);
                }
                if (flag)
                {
                    return null;
                }
                break label0;
            }
            return (String)cachedobject.getObject();
        }
        if (!diskLruCacheReady)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        String s1 = getSanitizedCacheKey(s);
        snapshot = null;
        long l2;
        long l4;
        try
        {
            snapshot1 = diskLruCache.get(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (snapshot != null)
            {
                snapshot.close();
            }
            return null;
        }
        if (snapshot1 == null)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        if (l == -1L)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        snapshot = snapshot1;
        l2 = snapshot1.getTimestamp();
        snapshot = snapshot1;
        l4 = System.currentTimeMillis();
        if (l2 >= l4 || l4 - l2 <= l)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        snapshot = snapshot1;
        snapshot1.close();
        snapshot = snapshot1;
        diskLruCache.remove(s1);
        return null;
        snapshot = snapshot1;
        s1 = snapshot1.getString(0);
        snapshot = snapshot1;
        snapshot1.close();
        snapshot = snapshot1;
        inMemoryCache.put(s, new CachedObject(System.currentTimeMillis(), s1));
        return s1;
        snapshot = snapshot1;
        String s2 = snapshot1.getString(0);
        snapshot = snapshot1;
        snapshot1.close();
        snapshot = snapshot1;
        inMemoryCache.put(s, new CachedObject(System.currentTimeMillis(), s2));
        return s2;
        return null;
    }

    public String getCachedString(String s, boolean flag)
    {
        return getCachedString(s, -1L, flag);
    }

    public boolean hasCachedBitmap(String s, long l, boolean flag)
    {
        CachedObject cachedobject = (CachedObject)inMemoryCache.get(s);
        if (cachedobject != null)
        {
            long l1 = cachedobject.getCacheTime();
            long l3 = System.currentTimeMillis();
            boolean flag1 = cachedobject.getObject() instanceof byte[];
            if (l != -1L && flag1 && l3 - l1 <= l)
            {
                return true;
            }
            if (l == -1L)
            {
                return true;
            }
        }
        if (flag)
        {
            return false;
        }
        if (!diskLruCacheReady)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        s = getSanitizedCacheKey(s);
        long l2;
        long l4;
        try
        {
            s = diskLruCache.poll(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        if (l == -1L)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        l2 = s.getTimestamp();
        l4 = System.currentTimeMillis();
        return l2 >= l4 || l4 - l2 <= l;
        return true;
        return false;
    }





/*
    static boolean access$102(PersistedCache persistedcache, boolean flag)
    {
        persistedcache.diskLruCacheReady = flag;
        return flag;
    }

*/



/*
    static DiskLruCache access$202(PersistedCache persistedcache, DiskLruCache disklrucache)
    {
        persistedcache.diskLruCache = disklrucache;
        return disklrucache;
    }

*/





}
