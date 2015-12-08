// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.content.res.Resources;
import android.os.AsyncTask;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import org.apache.http.util.ByteArrayBuffer;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            MainActivity

public class DownloadTask extends AsyncTask
{

    String commandId;
    String downloadUrl;
    String fileName;
    MainActivity mainActivity;

    public DownloadTask(MainActivity mainactivity, String s, String s1, String s2)
    {
        mainActivity = mainactivity;
        downloadUrl = s;
        fileName = s1;
        commandId = s2;
    }

    protected transient Integer doInBackground(String as[])
    {
        try
        {
            downloadFile(downloadUrl, fileName);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            String s = (new StringBuilder("{\"commandId\":\"")).append(commandId).append("\",\"type\":\"CommandResult\",\"subject\":\"LoadAudio\",\"error\":{\"code\":\"File not found.\"}").toString();
            mainActivity.sendMessageToJS(s);
            as.printStackTrace();
        }
        return null;
    }

    protected volatile transient Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    public void downloadFile(String s, String s1)
        throws MalformedURLException, IOException
    {
        Object obj = new File(mainActivity.getCacheDir(), "");
        if (!((File) (obj)).exists()) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        obj = ((File) (obj)).listFiles();
        j = obj.length;
        i = 0;
_L4:
        if (i < j) goto _L3; else goto _L2
_L2:
        obj = s;
        if (!s.startsWith("http"))
        {
            obj = (new StringBuilder(String.valueOf(mainActivity.getResources().getString(0x7f08004c)))).append("/").append(s).toString();
        }
        obj = new BufferedInputStream((new URL(((String) (obj)))).openConnection().getInputStream());
        s = new ByteArrayBuffer(64);
_L5:
        i = ((BufferedInputStream) (obj)).read();
        if (i == -1)
        {
            s1 = new FileOutputStream(new File(mainActivity.getCacheDir(), s1));
            s1.write(s.toByteArray());
            s1.close();
            s = (new StringBuilder("{\"commandId\":\"")).append(commandId).append("\",\"type\":\"CommandResult\",\"subject\":\"LoadAudio\"}").toString();
            mainActivity.sendMessageToJS(s);
            return;
        }
        break MISSING_BLOCK_LABEL_267;
_L3:
        if (obj[i].getName().equals(s1))
        {
            Log.i("Badger", "File already in cache");
            s = (new StringBuilder("{\"commandId\":\"")).append(commandId).append("\",\"type\":\"CommandResult\",\"subject\":\"LoadAudio\"}").toString();
            mainActivity.sendMessageToJS(s);
            return;
        }
        i++;
          goto _L4
        s.append((byte)i);
          goto _L5
    }
}
