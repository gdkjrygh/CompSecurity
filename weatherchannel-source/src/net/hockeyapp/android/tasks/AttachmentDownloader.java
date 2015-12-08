// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.tasks;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
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
import java.util.LinkedList;
import java.util.Queue;
import net.hockeyapp.android.Constants;
import net.hockeyapp.android.objects.FeedbackAttachment;
import net.hockeyapp.android.utils.AsyncTaskUtils;
import net.hockeyapp.android.utils.ImageUtils;
import net.hockeyapp.android.views.AttachmentView;

public class AttachmentDownloader
{
    private static class AttachmentDownloaderHolder
    {

        public static final AttachmentDownloader INSTANCE = new AttachmentDownloader();


        private AttachmentDownloaderHolder()
        {
        }
    }

    private static class DownloadJob
    {

        private final AttachmentView attachmentView;
        private final FeedbackAttachment feedbackAttachment;
        private int remainingRetries;
        private boolean success;

        public boolean consumeRetry()
        {
            int i = remainingRetries - 1;
            remainingRetries = i;
            return i >= 0;
        }

        public AttachmentView getAttachmentView()
        {
            return attachmentView;
        }

        public FeedbackAttachment getFeedbackAttachment()
        {
            return feedbackAttachment;
        }

        public boolean hasRetry()
        {
            return remainingRetries > 0;
        }

        public boolean isSuccess()
        {
            return success;
        }

        public void setSuccess(boolean flag)
        {
            success = flag;
        }

        private DownloadJob(FeedbackAttachment feedbackattachment, AttachmentView attachmentview)
        {
            feedbackAttachment = feedbackattachment;
            attachmentView = attachmentview;
            success = false;
            remainingRetries = 2;
        }

    }

    private static class DownloadTask extends AsyncTask
    {

        private Bitmap bitmap;
        private int bitmapOrientation;
        private final DownloadJob downloadJob;
        private File dropFolder;
        private final Handler handler;

        private URLConnection createConnection(URL url)
            throws IOException
        {
            url = (HttpURLConnection)url.openConnection();
            url.addRequestProperty("User-Agent", "HockeySDK/Android");
            url.setInstanceFollowRedirects(true);
            if (android.os.Build.VERSION.SDK_INT <= 9)
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
            s = downloadJob.getFeedbackAttachment().getCacheId();
            attachmentview = downloadJob.getAttachmentView();
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
            avoid = downloadJob.getFeedbackAttachment();
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
            attachmentview = downloadJob.getAttachmentView();
            downloadJob.setSuccess(boolean1.booleanValue());
            if (!boolean1.booleanValue()) goto _L2; else goto _L1
_L1:
            attachmentview.setImage(bitmap, bitmapOrientation);
_L4:
            handler.sendEmptyMessage(0);
            return;
_L2:
            if (!downloadJob.hasRetry())
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

        public DownloadTask(DownloadJob downloadjob, Handler handler1)
        {
            downloadJob = downloadjob;
            handler = handler1;
            dropFolder = Constants.getHockeyAppStorageDir();
            bitmap = null;
            bitmapOrientation = 0;
        }
    }


    private boolean downloadRunning;
    private Queue queue;

    private AttachmentDownloader()
    {
        queue = new LinkedList();
        downloadRunning = false;
    }


    private void downloadNext()
    {
        Object obj;
        if (!downloadRunning)
        {
            if ((obj = (DownloadJob)queue.peek()) != null)
            {
                obj = new DownloadTask(((DownloadJob) (obj)), new Handler() {

                    final AttachmentDownloader this$0;

                    public void handleMessage(Message message)
                    {
                        message = (DownloadJob)queue.poll();
                        if (!message.isSuccess() && message.consumeRetry())
                        {
                            postDelayed(message. new Runnable() {

                                final _cls1 this$1;
                                final DownloadJob val$retryCandidate;

                                public void run()
                                {
                                    queue.add(retryCandidate);
                                    downloadNext();
                                }

            
            {
                this$1 = final__pcls1;
                retryCandidate = DownloadJob.this;
                super();
            }
                            }, 3000L);
                        }
                        downloadRunning = false;
                        downloadNext();
                    }

            
            {
                this$0 = AttachmentDownloader.this;
                super();
            }
                });
                downloadRunning = true;
                AsyncTaskUtils.execute(((AsyncTask) (obj)));
                return;
            }
        }
    }

    public static AttachmentDownloader getInstance()
    {
        return AttachmentDownloaderHolder.INSTANCE;
    }

    public void download(FeedbackAttachment feedbackattachment, AttachmentView attachmentview)
    {
        queue.add(new DownloadJob(feedbackattachment, attachmentview));
        downloadNext();
    }




/*
    static boolean access$402(AttachmentDownloader attachmentdownloader, boolean flag)
    {
        attachmentdownloader.downloadRunning = flag;
        return flag;
    }

*/
}
