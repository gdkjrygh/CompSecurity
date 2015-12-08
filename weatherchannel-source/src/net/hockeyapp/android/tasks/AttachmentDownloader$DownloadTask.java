// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.tasks;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import net.hockeyapp.android.Constants;
import net.hockeyapp.android.objects.FeedbackAttachment;
import net.hockeyapp.android.utils.ImageUtils;
import net.hockeyapp.android.views.AttachmentView;

// Referenced classes of package net.hockeyapp.android.tasks:
//            AttachmentDownloader

private static class bitmapOrientation extends AsyncTask
{

    private Bitmap bitmap;
    private int bitmapOrientation;
    private final onProgressUpdate downloadJob;
    private File dropFolder;
    private final Handler handler;

    private URLConnection createConnection(URL url)
        throws IOException
    {
        url = (HttpURLConnection)url.openConnection();
        url.addRequestProperty("User-Agent", "HockeySDK/Android");
        url.setInstanceFollowRedirects(true);
        if (android.os.edirects <= 9)
        {
            url.setRequestProperty("connection", "close");
        }
        return url;
    }

    private boolean downloadAttachment(String s, String s1)
    {
        long l;
        String s2;
        byte abyte0[];
        int i;
        int j;
        try
        {
            s = createConnection(new URL(s));
            s.connect();
            i = s.getContentLength();
            s2 = s.getHeaderField("Status");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return false;
        }
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (!s2.startsWith("200"))
        {
            return false;
        }
        s1 = new File(dropFolder, s1);
        s = new BufferedInputStream(s.getInputStream());
        s1 = new FileOutputStream(s1);
        abyte0 = new byte[1024];
        l = 0L;
_L1:
        j = s.read(abyte0);
        if (j == -1)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        l += j;
        publishProgress(new Integer[] {
            Integer.valueOf((int)((100L * l) / (long)i))
        });
        s1.write(abyte0, 0, j);
          goto _L1
        s1.flush();
        s1.close();
        s.close();
        return l > 0L;
    }

    private void loadImageThumbnail()
    {
        String s;
        AttachmentView attachmentview;
        s = downloadJob.etFeedbackAttachment().getCacheId();
        attachmentview = downloadJob.etAttachmentView();
        bitmapOrientation = ImageUtils.determineOrientation(new File(dropFolder, s));
        if (bitmapOrientation != 1) goto _L2; else goto _L1
_L1:
        int i = attachmentview.getWidthLandscape();
_L3:
        int j;
        if (bitmapOrientation != 1)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        j = attachmentview.getMaxHeightLandscape();
_L4:
        bitmap = ImageUtils.decodeSampledBitmap(new File(dropFolder, s), i, j);
        return;
_L2:
        try
        {
            i = attachmentview.getWidthPortrait();
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            bitmap = null;
            return;
        }
          goto _L3
        j = attachmentview.getMaxHeightPortrait();
          goto _L4
    }

    protected transient Boolean doInBackground(Void avoid[])
    {
        avoid = downloadJob.etFeedbackAttachment();
        if (avoid.isAvailableInCache())
        {
            Log.e("HockeyApp", "Cached...");
            loadImageThumbnail();
            return Boolean.valueOf(true);
        }
        Log.e("HockeyApp", "Downloading...");
        boolean flag = downloadAttachment(avoid.getUrl(), avoid.getCacheId());
        if (flag)
        {
            loadImageThumbnail();
        }
        return Boolean.valueOf(flag);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected void onPostExecute(Boolean boolean1)
    {
        AttachmentView attachmentview;
        attachmentview = downloadJob.etAttachmentView();
        downloadJob.etSuccess(boolean1.booleanValue());
        if (!boolean1.booleanValue()) goto _L2; else goto _L1
_L1:
        attachmentview.setImage(bitmap, bitmapOrientation);
_L4:
        handler.sendEmptyMessage(0);
        return;
_L2:
        if (!downloadJob.asRetry())
        {
            attachmentview.signalImageLoadingError();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Boolean)obj);
    }

    protected void onPreExecute()
    {
    }

    protected transient void onProgressUpdate(Integer ainteger[])
    {
    }

    protected volatile void onProgressUpdate(Object aobj[])
    {
        onProgressUpdate((Integer[])aobj);
    }

    public ( , Handler handler1)
    {
        downloadJob = ;
        handler = handler1;
        dropFolder = Constants.getHockeyAppStorageDir();
        bitmap = null;
        bitmapOrientation = 0;
    }
}
