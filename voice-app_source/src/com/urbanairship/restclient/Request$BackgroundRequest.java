// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.restclient;

import android.os.AsyncTask;
import com.urbanairship.Logger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

// Referenced classes of package com.urbanairship.restclient:
//            Request, Response, AsyncHandler

private class handler extends AsyncTask
{

    private final AsyncHandler handler;
    final Request this$0;

    protected transient Response doInBackground(Request arequest[])
    {
        if (arequest.length > 1)
        {
            throw new RuntimeException("Background Request only handles executing one Request at a time ");
        }
        arequest = arequest[0];
        Response response = arequest.execute();
        arequest = response;
        if (response == null) goto _L2; else goto _L1
_L1:
        if (destination == null) goto _L4; else goto _L3
_L3:
        FileOutputStream fileoutputstream;
        long l;
        destination.getParentFile().mkdirs();
        l = response.length();
        arequest = response.rawBody();
        fileoutputstream = new FileOutputStream(destination);
        int i = 0;
        byte abyte0[] = new byte[8192];
_L7:
        int j = arequest.read(abyte0);
        if (j == -1) goto _L6; else goto _L5
_L5:
        i += j;
        fileoutputstream.write(abyte0, 0, j);
        publishProgress(new Integer[] {
            Integer.valueOf((int)(((float)i / (float)l) * 100F))
        });
          goto _L7
        arequest;
        Logger.error(arequest);
        arequest = null;
_L2:
        return arequest;
_L6:
        fileoutputstream.flush();
        arequest.close();
        fileoutputstream.close();
        return response;
_L4:
        arequest = response;
        if (response.length() >= 0x100000L) goto _L2; else goto _L8
_L8:
        response.body();
        return response;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Request[])aobj);
    }

    protected void onPostExecute(Response response)
    {
        if (response != null)
        {
            handler.onComplete(response);
            return;
        } else
        {
            handler.onError(new Exception("Error when executing request."));
            return;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Response)obj);
    }

    protected transient void onProgressUpdate(Integer ainteger[])
    {
        ainteger = ainteger[0];
        handler.onProgress(ainteger.intValue());
    }

    protected volatile void onProgressUpdate(Object aobj[])
    {
        onProgressUpdate((Integer[])aobj);
    }

    public (AsyncHandler asynchandler)
    {
        this$0 = Request.this;
        super();
        handler = asynchandler;
    }
}
