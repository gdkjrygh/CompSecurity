// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Handler;
import com.walmart.android.utils.StringHasher;
import com.walmartlabs.utils.WLog;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

// Referenced classes of package com.walmart.android.service:
//            DataCache, AsyncCallback, Utils

public class ImageDownloader
{
    private static class DownloadTask
    {

        private final LinkedList attachedCallbacks = new LinkedList();
        private final String cacheFileName;
        private final long expiryTime;
        private final HttpGet request;

        public static DownloadTask create(String s, String s1, long l)
        {
            Object obj = null;
            try
            {
                s = new HttpGet(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                WLog.e(ImageDownloader.TAG, "couldn't create get request: ", s);
                s = obj;
            }
            if (s != null)
            {
                return new DownloadTask(s, s1, l);
            } else
            {
                return null;
            }
        }





        public DownloadTask(HttpGet httpget, String s, long l)
        {
            cacheFileName = s;
            request = httpget;
            expiryTime = l;
        }
    }

    private class DownloadWorker
        implements Runnable
    {

        private volatile DownloadTask currentTask;
        private final Object currentTaskLock;
        private boolean isDownloading;
        final ImageDownloader this$0;

        private void downloadAndNotify()
        {
            byte abyte1[];
            Iterator iterator;
            Object obj2;
            obj2 = currentTask.cacheFileName;
            byte abyte0[] = null;
            android.graphics.BitmapFactory.Options options;
            boolean flag;
            int l;
            if (!mImageCache.isDataCached(((String) (obj2))))
            {
                WLog.d(ImageDownloader.TAG, (new StringBuilder()).append("downloadAndNotify() downloaded and cached: ").append(currentTask.request.getURI()).toString());
                abyte0 = getDataFromURL(currentTask.request);
                mImageCache.cacheData(((String) (obj2)), abyte0, currentTask.expiryTime);
            } else
            {
                WLog.d(ImageDownloader.TAG, (new StringBuilder()).append("downloadAndNotify() data is cached already. Ignoring: ").append(currentTask.request.getURI()).toString());
            }
            iterator = null;
            flag = false;
            abyte1 = ((byte []) (currentTaskLock));
            abyte1;
            JVM INSTR monitorenter ;
            if (currentTask.attachedCallbacks.size() <= 0) goto _L2; else goto _L1
_L1:
            flag = true;
_L7:
            abyte1;
            JVM INSTR monitorexit ;
            if (!flag) goto _L4; else goto _L3
_L3:
            abyte1 = abyte0;
            if (abyte0 == null)
            {
                abyte1 = mImageCache.getData(((String) (obj2)));
            }
            if (abyte1 == null) goto _L6; else goto _L5
_L2:
            currentTask = null;
              goto _L7
            exception;
            abyte1;
            JVM INSTR monitorexit ;
            throw exception;
_L5:
            Object obj;
            Object obj1;
            int k;
            int i = 0;
            boolean flag1 = false;
            if (mMaxSize != 0)
            {
                options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(abyte1, 0, abyte1.length, options);
                l = options.outWidth;
                i = options.outHeight;
                Exception exception;
                int j;
                for (j = 1; l > mMaxSize || i > mMaxSize; j++)
                {
                    l /= 2;
                    i /= 2;
                }

                i = ((flag1) ? 1 : 0);
                if (j != 1)
                {
                    i = 1;
                }
                mBitmapOptions.inSampleSize = j;
            }
            obj1 = BitmapFactory.decodeByteArray(abyte1, 0, abyte1.length, mBitmapOptions);
            mBitmapOptions.inSampleSize = 1;
            if (obj1 != null && i == 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            obj = obj1;
            k = i;
            if (obj1 == null)
            {
                WLog.d(ImageDownloader.TAG, (new StringBuilder()).append("downloadAndNotify() failed to decode. Deleting cached file: ").append(((String) (obj2))).toString());
                mImageCache.deleteData(((String) (obj2)));
                k = i;
                obj = obj1;
            }
_L14:
            obj1 = currentTaskLock;
            obj1;
            JVM INSTR monitorenter ;
            iterator = currentTask.attachedCallbacks.iterator();
_L12:
            if (!iterator.hasNext()) goto _L9; else goto _L8
_L8:
            obj2 = (AsyncCallback)iterator.next();
            if (obj == null || k == 0) goto _L11; else goto _L10
_L10:
            ((AsyncCallback) (obj2)).onSuccess(obj);
              goto _L12
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
_L6:
            k = 0;
            obj = iterator;
            continue; /* Loop/switch isn't completed */
_L11:
            ((AsyncCallback) (obj2)).onFailure(Integer.valueOf(k), obj);
              goto _L12
_L9:
            currentTask = null;
            obj1;
            JVM INSTR monitorexit ;
_L4:
            return;
            if (true) goto _L14; else goto _L13
_L13:
        }

        private void downloadInBackground()
        {
            mExecutor.submit(new Runnable() {

                final DownloadWorker this$1;

                public void run()
                {
                    downloadAndNotify();
                    mHandler.post(mDownloadWorker);
                }

            
            {
                this$1 = DownloadWorker.this;
                super();
            }
            });
        }

        private byte[] getDataFromURL(HttpGet httpget)
        {
            HttpGet httpget1;
            byte abyte0[];
            HttpGet httpget2;
            HttpGet httpget3;
            HttpGet httpget4;
            HttpGet httpget5;
            byte abyte1[];
            byte abyte2[];
            byte abyte3[];
            byte abyte4[];
            Object obj;
            Object obj1;
            Object obj2;
            Object obj3;
            byte abyte5[];
            Object obj4;
            Object obj5;
            Object obj6;
            Object obj7;
            obj = null;
            obj1 = null;
            obj2 = null;
            obj3 = null;
            abyte0 = null;
            obj4 = null;
            obj5 = null;
            obj6 = null;
            obj7 = null;
            abyte5 = null;
            abyte1 = obj;
            httpget2 = abyte5;
            abyte2 = obj1;
            httpget3 = obj4;
            abyte3 = obj2;
            httpget4 = obj5;
            abyte4 = obj3;
            httpget5 = obj6;
            httpget1 = obj7;
            long l = System.currentTimeMillis();
            abyte1 = obj;
            httpget2 = abyte5;
            abyte2 = obj1;
            httpget3 = obj4;
            abyte3 = obj2;
            httpget4 = obj5;
            abyte4 = obj3;
            httpget5 = obj6;
            httpget1 = obj7;
            httpget = mHttpClient.execute(httpget);
            abyte1 = obj;
            httpget2 = abyte5;
            abyte2 = obj1;
            httpget3 = obj4;
            abyte3 = obj2;
            httpget4 = obj5;
            abyte4 = obj3;
            httpget5 = obj6;
            httpget1 = obj7;
            long l1 = System.currentTimeMillis();
            abyte1 = obj;
            httpget2 = abyte5;
            abyte2 = obj1;
            httpget3 = obj4;
            abyte3 = obj2;
            httpget4 = obj5;
            abyte4 = obj3;
            httpget5 = obj6;
            httpget1 = obj7;
            httpget = httpget.getEntity().getContent();
            abyte1 = obj;
            httpget2 = httpget;
            abyte2 = obj1;
            httpget3 = httpget;
            abyte3 = obj2;
            httpget4 = httpget;
            abyte4 = obj3;
            httpget5 = httpget;
            httpget1 = httpget;
            abyte5 = IOUtils.toByteArray(httpget);
            abyte0 = abyte5;
_L2:
            abyte1 = abyte0;
            httpget2 = httpget;
            abyte2 = abyte0;
            httpget3 = httpget;
            abyte3 = abyte0;
            httpget4 = httpget;
            abyte4 = abyte0;
            httpget5 = httpget;
            httpget1 = httpget;
            long l2 = System.currentTimeMillis();
            abyte1 = abyte0;
            httpget2 = httpget;
            abyte2 = abyte0;
            httpget3 = httpget;
            abyte3 = abyte0;
            httpget4 = httpget;
            abyte4 = abyte0;
            httpget5 = httpget;
            httpget1 = httpget;
            WLog.d(ImageDownloader.TAG, String.format("image received in %d ms, decoded in %s ms", new Object[] {
                Long.valueOf(l1 - l), Long.valueOf(l2 - l1)
            }));
            Utils.closeQuietly(httpget);
            return abyte0;
            OutOfMemoryError outofmemoryerror;
            outofmemoryerror;
            abyte1 = obj;
            httpget2 = httpget;
            abyte2 = obj1;
            httpget3 = httpget;
            abyte3 = obj2;
            httpget4 = httpget;
            abyte4 = obj3;
            httpget5 = httpget;
            httpget1 = httpget;
            outofmemoryerror.printStackTrace();
            if (true) goto _L2; else goto _L1
_L1:
            httpget;
            httpget1 = httpget2;
            httpget.printStackTrace();
            Utils.closeQuietly(httpget2);
            return abyte1;
            httpget;
            httpget1 = httpget3;
            httpget.printStackTrace();
            Utils.closeQuietly(httpget3);
            return abyte2;
            httpget;
            httpget1 = httpget4;
            httpget.printStackTrace();
            Utils.closeQuietly(httpget4);
            return abyte3;
            httpget;
            httpget1 = httpget5;
            httpget.printStackTrace();
            Utils.closeQuietly(httpget5);
            return abyte4;
            httpget;
            Utils.closeQuietly(httpget1);
            throw httpget;
        }

        public void run()
        {
            if (mDownloadQueue.size() > 0)
            {
                WLog.d(ImageDownloader.TAG, (new StringBuilder()).append("DownloadWorker.run() downloading next item in queue. Queue size: ").append(mDownloadQueue.size()).toString());
                currentTask = (DownloadTask)mDownloadQueue.removeFirst();
                mTasksInProgress.remove(currentTask.cacheFileName);
                downloadInBackground();
                return;
            } else
            {
                WLog.d(ImageDownloader.TAG, "DownloadWorker.run() no tasks in queue. Resetting.");
                currentTask = null;
                isDownloading = false;
                return;
            }
        }

        public void startDownload()
        {
            if (!isDownloading && !mDownloadQueue.isEmpty())
            {
                WLog.d(ImageDownloader.TAG, "DownloadWorker.startDownload() starting download.");
                isDownloading = true;
                run();
            }
        }




        private DownloadWorker()
        {
            this$0 = ImageDownloader.this;
            super();
            currentTaskLock = new Object();
        }

    }


    public static final String TAG = com/walmart/android/service/ImageDownloader.getSimpleName();
    private final android.graphics.BitmapFactory.Options mBitmapOptions;
    private long mDefaultCacheExpiry;
    private final LinkedList mDownloadQueue;
    private final DownloadWorker mDownloadWorker;
    private final ExecutorService mExecutor;
    private final Handler mHandler;
    private final StringHasher mHasher;
    private final HttpClient mHttpClient;
    private final DataCache mImageCache;
    private int mMaxSize;
    private final HashMap mTasksInProgress;

    public ImageDownloader(HttpClient httpclient, String s, Context context)
    {
        this(httpclient, s, context, true);
    }

    public ImageDownloader(HttpClient httpclient, String s, Context context, boolean flag)
    {
        mHasher = new StringHasher("SHA-256");
        mHttpClient = httpclient;
        mBitmapOptions = new android.graphics.BitmapFactory.Options();
        mBitmapOptions.inDither = false;
        mHandler = new Handler();
        mDownloadQueue = new LinkedList();
        mTasksInProgress = new HashMap();
        mImageCache = new DataCache(context, s);
        mDownloadWorker = new DownloadWorker();
        mExecutor = Executors.newSingleThreadExecutor();
        if (flag)
        {
            mHandler.postDelayed(new Runnable() {

                final ImageDownloader this$0;

                public void run()
                {
                    cleanCache();
                }

            
            {
                this$0 = ImageDownloader.this;
                super();
            }
            }, 5000L);
        }
    }

    private void cleanCache()
    {
        mExecutor.submit(new Runnable() {

            final ImageDownloader this$0;

            public void run()
            {
                long l = System.currentTimeMillis();
                WLog.v(ImageDownloader.TAG, "Starting image cache cleanup.");
                mImageCache.cleanup();
                WLog.v(ImageDownloader.TAG, (new StringBuilder()).append("Done with image cache cleanup. Time: ").append(System.currentTimeMillis() - l).append(" ms").toString());
            }

            
            {
                this$0 = ImageDownloader.this;
                super();
            }
        });
    }

    public void cancelAllDownloads()
    {
        mDownloadQueue.clear();
        mTasksInProgress.clear();
        mHandler.removeCallbacks(mDownloadWorker);
        synchronized (mDownloadWorker.currentTaskLock)
        {
            if (mDownloadWorker.currentTask != null)
            {
                mDownloadWorker.currentTask.attachedCallbacks.clear();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void cancelDownload(String s)
    {
    }

    public void downloadImage(String s, long l, AsyncCallback asynccallback)
    {
        downloadImage(s, l, asynccallback, true);
    }

    public void downloadImage(String s, long l, AsyncCallback asynccallback, boolean flag)
    {
        String s1;
        boolean flag2;
        WLog.d(TAG, (new StringBuilder()).append("downloadImage() ").append(s).toString());
        s1 = mHasher.createHashedString(s);
        flag2 = false;
        Object obj = mDownloadWorker.currentTaskLock;
        obj;
        JVM INSTR monitorenter ;
        DownloadTask downloadtask1 = mDownloadWorker.currentTask;
        boolean flag1 = flag2;
        if (downloadtask1 == null) goto _L2; else goto _L1
_L1:
        flag1 = flag2;
        if (!downloadtask1.cacheFileName.equals(s1)) goto _L2; else goto _L3
_L3:
        WLog.d(TAG, "downloadImage() Image is currently being downloaded.");
        if (asynccallback == null) goto _L5; else goto _L4
_L4:
        WLog.d(TAG, "downloadImage() attached callback.");
        downloadtask1.attachedCallbacks.add(asynccallback);
          goto _L5
_L2:
        obj;
        JVM INSTR monitorexit ;
        if (!flag1)
        {
            if (mTasksInProgress.containsKey(s1))
            {
                s = (DownloadTask)mTasksInProgress.get(s1);
                boolean flag3 = mDownloadQueue.remove(s);
                if (flag)
                {
                    mDownloadQueue.addFirst(s);
                } else
                {
                    mDownloadQueue.add(s);
                }
                if (asynccallback != null)
                {
                    ((DownloadTask) (s)).attachedCallbacks.add(asynccallback);
                }
                WLog.d(TAG, "downloadImage() Image is already in download queue. Moving it to top.");
                WLog.d(TAG, (new StringBuilder()).append("Success: ").append(flag3).toString());
            } else
            {
                WLog.d(TAG, "downloadImage() Creating new download task and adding it to top. ");
                DownloadTask downloadtask = DownloadTask.create(s, s1, l);
                if (downloadtask != null)
                {
                    if (asynccallback != null)
                    {
                        downloadtask.attachedCallbacks.add(asynccallback);
                    }
                    if (flag)
                    {
                        mDownloadQueue.addFirst(downloadtask);
                    } else
                    {
                        mDownloadQueue.add(downloadtask);
                    }
                    mTasksInProgress.put(s1, downloadtask);
                } else
                {
                    if (asynccallback != null)
                    {
                        asynccallback.onFailure(Integer.valueOf(0x15f91), null);
                    }
                    WLog.d(TAG, (new StringBuilder()).append("Failed to create download task for url: ").append(s).toString());
                }
            }
        }
        mDownloadWorker.startDownload();
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
_L5:
        flag1 = true;
        if (true) goto _L2; else goto _L6
_L6:
    }

    public void downloadImage(String s, AsyncCallback asynccallback)
    {
        downloadImage(s, mDefaultCacheExpiry, asynccallback);
    }

    public int getMaxSize()
    {
        return mMaxSize;
    }

    public boolean isCached(String s)
    {
        return false;
    }

    public void setDefaultCacheExpiryTime(long l)
    {
        mDefaultCacheExpiry = l;
    }

    public void setMaxSize(int i)
    {
        mMaxSize = i;
    }











}
