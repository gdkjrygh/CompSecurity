// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.tasks;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.UUID;
import net.hockeyapp.android.Strings;
import net.hockeyapp.android.listeners.DownloadFileListener;

public class DownloadFileTask extends AsyncTask
{

    protected static final int MAX_REDIRECTS = 6;
    protected Context context;
    private String downloadErrorMessage;
    protected String filePath;
    protected String filename;
    protected DownloadFileListener notifier;
    protected ProgressDialog progressDialog;
    protected String urlString;

    public DownloadFileTask(Context context1, String s, DownloadFileListener downloadfilelistener)
    {
        context = context1;
        urlString = s;
        filename = (new StringBuilder()).append(UUID.randomUUID()).append(".apk").toString();
        filePath = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/Download").toString();
        notifier = downloadfilelistener;
        downloadErrorMessage = null;
    }

    public void attach(Context context1)
    {
        context = context1;
    }

    protected URLConnection createConnection(URL url, int i)
        throws IOException
    {
        HttpURLConnection httpurlconnection = (HttpURLConnection)url.openConnection();
        setConnectionProperties(httpurlconnection);
        int j = httpurlconnection.getResponseCode();
        URL url1;
        if ((j == 301 || j == 302 || j == 303) && i != 0)
        {
            if (!url.getProtocol().equals((url1 = new URL(httpurlconnection.getHeaderField("Location"))).getProtocol()))
            {
                httpurlconnection.disconnect();
                return createConnection(url1, i - 1);
            }
        }
        return httpurlconnection;
    }

    public void detach()
    {
        context = null;
        progressDialog = null;
    }

    protected transient Long doInBackground(Void avoid[])
    {
        Object obj;
        int i;
        try
        {
            avoid = createConnection(new URL(getURLString()), 6);
            avoid.connect();
            i = avoid.getContentLength();
            obj = avoid.getContentType();
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            avoid.printStackTrace();
            return Long.valueOf(0L);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (((String) (obj)).contains("text"))
        {
            downloadErrorMessage = "The requested download does not appear to be a file.";
            return Long.valueOf(0L);
        }
        obj = new File(filePath);
        if (!((File) (obj)).mkdirs() && !((File) (obj)).exists())
        {
            throw new IOException((new StringBuilder()).append("Could not create the dir(s):").append(((File) (obj)).getAbsolutePath()).toString());
        }
        byte abyte0[];
        obj = new File(((File) (obj)), filename);
        avoid = new BufferedInputStream(avoid.getInputStream());
        obj = new FileOutputStream(((File) (obj)));
        abyte0 = new byte[1024];
        long l = 0L;
_L1:
        int j = avoid.read(abyte0);
        if (j == -1)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        l += j;
        publishProgress(new Integer[] {
            Integer.valueOf(Math.round(((float)l * 100F) / (float)i))
        });
        ((OutputStream) (obj)).write(abyte0, 0, j);
          goto _L1
        ((OutputStream) (obj)).flush();
        ((OutputStream) (obj)).close();
        avoid.close();
        return Long.valueOf(l);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected String getURLString()
    {
        return (new StringBuilder()).append(urlString).append("&type=apk").toString();
    }

    protected void onPostExecute(Long long1)
    {
        android.app.AlertDialog.Builder builder;
        if (progressDialog != null)
        {
            try
            {
                progressDialog.dismiss();
            }
            catch (Exception exception) { }
        }
        if (long1.longValue() > 0L)
        {
            notifier.downloadSuccessful(this);
            long1 = new Intent("android.intent.action.VIEW");
            long1.setDataAndType(Uri.fromFile(new File(filePath, filename)), "application/vnd.android.package-archive");
            long1.setFlags(0x10000000);
            context.startActivity(long1);
            return;
        }
        builder = new android.app.AlertDialog.Builder(context);
        builder.setTitle(Strings.get(notifier, 256));
        if (downloadErrorMessage != null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        long1 = Strings.get(notifier, 257);
_L1:
        builder.setMessage(long1);
        builder.setNegativeButton(Strings.get(notifier, 258), new android.content.DialogInterface.OnClickListener() {

            final DownloadFileTask this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                notifier.downloadFailed(DownloadFileTask.this, Boolean.valueOf(false));
            }

            
            {
                this$0 = DownloadFileTask.this;
                super();
            }
        });
        builder.setPositiveButton(Strings.get(notifier, 259), new android.content.DialogInterface.OnClickListener() {

            final DownloadFileTask this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                notifier.downloadFailed(DownloadFileTask.this, Boolean.valueOf(true));
            }

            
            {
                this$0 = DownloadFileTask.this;
                super();
            }
        });
        builder.create().show();
        return;
        try
        {
            long1 = downloadErrorMessage;
        }
        // Misplaced declaration of an exception variable
        catch (Long long1)
        {
            return;
        }
          goto _L1
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Long)obj);
    }

    protected transient void onProgressUpdate(Integer ainteger[])
    {
        try
        {
            if (progressDialog == null)
            {
                progressDialog = new ProgressDialog(context);
                progressDialog.setProgressStyle(1);
                progressDialog.setMessage("Loading...");
                progressDialog.setCancelable(false);
                progressDialog.show();
            }
            progressDialog.setProgress(ainteger[0].intValue());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Integer ainteger[])
        {
            return;
        }
    }

    protected volatile void onProgressUpdate(Object aobj[])
    {
        onProgressUpdate((Integer[])aobj);
    }

    protected void setConnectionProperties(HttpURLConnection httpurlconnection)
    {
        httpurlconnection.addRequestProperty("User-Agent", "HockeySDK/Android");
        httpurlconnection.setInstanceFollowRedirects(true);
        if (android.os.Build.VERSION.SDK_INT <= 9)
        {
            httpurlconnection.setRequestProperty("connection", "close");
        }
    }
}
