// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import android.graphics.BitmapFactory;
import android.os.Handler;
import com.walmartlabs.utils.WLog;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

// Referenced classes of package com.walmart.android.service:
//            ImageDownloader, DataCache, AsyncCallback, Utils

private class <init>
    implements Runnable
{

    private volatile run currentTask;
    private final Object currentTaskLock;
    private boolean isDownloading;
    final ImageDownloader this$0;

    private void downloadAndNotify()
    {
        byte abyte1[];
        Iterator iterator;
        Object obj2;
        obj2 = cess._mth500(currentTask);
        byte abyte0[] = null;
        android.graphics.loadTask loadtask;
        boolean flag;
        int l;
        if (!ImageDownloader.access$200(ImageDownloader.this).isDataCached(((String) (obj2))))
        {
            WLog.d(ImageDownloader.TAG, (new StringBuilder()).append("downloadAndNotify() downloaded and cached: ").append(cess._mth1300(currentTask).getURI()).toString());
            abyte0 = getDataFromURL(cess._mth1300(currentTask));
            ImageDownloader.access$200(ImageDownloader.this).cacheData(((String) (obj2)), abyte0, cess._mth1400(currentTask));
        } else
        {
            WLog.d(ImageDownloader.TAG, (new StringBuilder()).append("downloadAndNotify() data is cached already. Ignoring: ").append(cess._mth1300(currentTask).getURI()).toString());
        }
        iterator = null;
        flag = false;
        abyte1 = ((byte []) (currentTaskLock));
        abyte1;
        JVM INSTR monitorenter ;
        if (cess._mth600(currentTask).size() <= 0) goto _L2; else goto _L1
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
            abyte1 = ImageDownloader.access$200(ImageDownloader.this).getData(((String) (obj2)));
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
        if (ImageDownloader.access$1500(ImageDownloader.this) != 0)
        {
            loadtask = new android.graphics.loadWorker.this._cls0();
            loadtask.odeBounds = true;
            BitmapFactory.decodeByteArray(abyte1, 0, abyte1.length, loadtask);
            l = loadtask.odeBounds;
            i = loadtask.;
            Exception exception;
            int j;
            for (j = 1; l > ImageDownloader.access$1500(ImageDownloader.this) || i > ImageDownloader.access$1500(ImageDownloader.this); j++)
            {
                l /= 2;
                i /= 2;
            }

            i = ((flag1) ? 1 : 0);
            if (j != 1)
            {
                i = 1;
            }
            ImageDownloader.access$1600(ImageDownloader.this).ize = j;
        }
        obj1 = BitmapFactory.decodeByteArray(abyte1, 0, abyte1.length, ImageDownloader.access$1600(ImageDownloader.this));
        ImageDownloader.access$1600(ImageDownloader.this).ize = 1;
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
            ImageDownloader.access$200(ImageDownloader.this).deleteData(((String) (obj2)));
            k = i;
            obj = obj1;
        }
_L14:
        obj1 = currentTaskLock;
        obj1;
        JVM INSTR monitorenter ;
        iterator = cess._mth600(currentTask).iterator();
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
        ImageDownloader.access$1200(ImageDownloader.this).submit(new Runnable() {

            final ImageDownloader.DownloadWorker this$1;

            public void run()
            {
                downloadAndNotify();
                ImageDownloader.access$1100(this$0).post(ImageDownloader.access$1000(this$0));
            }

            
            {
                this$1 = ImageDownloader.DownloadWorker.this;
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
        httpget = ImageDownloader.access$1700(ImageDownloader.this).execute(httpget);
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
        if (ImageDownloader.access$700(ImageDownloader.this).size() > 0)
        {
            WLog.d(ImageDownloader.TAG, (new StringBuilder()).append("DownloadWorker.run() downloading next item in queue. Queue size: ").append(ImageDownloader.access$700(ImageDownloader.this).size()).toString());
            currentTask = (currentTask)ImageDownloader.access$700(ImageDownloader.this).removeFirst();
            ImageDownloader.access$800(ImageDownloader.this).remove(cess._mth500(currentTask));
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
        if (!isDownloading && !ImageDownloader.access$700(ImageDownloader.this).isEmpty())
        {
            WLog.d(ImageDownloader.TAG, "DownloadWorker.startDownload() starting download.");
            isDownloading = true;
            run();
        }
    }




    private _cls1.this._cls1()
    {
        this$0 = ImageDownloader.this;
        super();
        currentTaskLock = new Object();
    }

    currentTaskLock(currentTaskLock currenttasklock)
    {
        this();
    }
}
