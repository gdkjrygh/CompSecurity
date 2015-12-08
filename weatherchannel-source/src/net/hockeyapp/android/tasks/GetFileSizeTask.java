// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.tasks;

import android.content.Context;
import java.net.URL;
import java.net.URLConnection;
import net.hockeyapp.android.listeners.DownloadFileListener;

// Referenced classes of package net.hockeyapp.android.tasks:
//            DownloadFileTask

public class GetFileSizeTask extends DownloadFileTask
{

    private long size;

    public GetFileSizeTask(Context context, String s, DownloadFileListener downloadfilelistener)
    {
        super(context, s, downloadfilelistener);
    }

    protected transient Long doInBackground(Void avoid[])
    {
        long l;
        try
        {
            l = createConnection(new URL(getURLString()), 6).getContentLength();
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            avoid.printStackTrace();
            return Long.valueOf(0L);
        }
        return Long.valueOf(l);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    public long getSize()
    {
        return size;
    }

    protected void onPostExecute(Long long1)
    {
        size = long1.longValue();
        if (size > 0L)
        {
            notifier.downloadSuccessful(this);
            return;
        } else
        {
            notifier.downloadFailed(this, Boolean.valueOf(false));
            return;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Long)obj);
    }

    protected transient void onProgressUpdate(Integer ainteger[])
    {
    }

    protected volatile void onProgressUpdate(Object aobj[])
    {
        onProgressUpdate((Integer[])aobj);
    }
}
