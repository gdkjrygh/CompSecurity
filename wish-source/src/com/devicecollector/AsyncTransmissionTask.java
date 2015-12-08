// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector;

import android.os.AsyncTask;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.devicecollector:
//            DataCollection

public class AsyncTransmissionTask extends AsyncTask
{

    public AsyncTransmissionTask()
    {
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((DataCollection[])aobj);
    }

    protected transient Void doInBackground(DataCollection adatacollection[])
    {
        if (adatacollection == null || adatacollection.length != 1) goto _L2; else goto _L1
_L1:
        Object obj1 = adatacollection[0];
        if (((DataCollection) (obj1)).getServerUrl() == null) goto _L4; else goto _L3
_L3:
        Object obj;
        ArrayList arraylist;
        adatacollection = new DefaultHttpClient();
        obj = (new StringBuilder()).append(((DataCollection) (obj1)).getServerUrl()).append("/m.html").toString();
        Log.d("Transmitter", (new StringBuilder()).append("Sending to:").append(((String) (obj))).toString());
        obj = new HttpPost(((String) (obj)));
        arraylist = new ArrayList();
        obj1 = ((DataCollection) (obj1)).getPostData();
        String s;
        for (Iterator iterator = ((HashMap) (obj1)).keySet().iterator(); iterator.hasNext(); arraylist.add(new BasicNameValuePair(s, (String)((HashMap) (obj1)).get(s))))
        {
            s = (String)iterator.next();
        }

          goto _L5
_L2:
        return null;
_L5:
        try
        {
            ((HttpPost) (obj)).setEntity(new UrlEncodedFormEntity(arraylist));
            adatacollection.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (DataCollection adatacollection[])
        {
            Log.d("Transmitter", adatacollection.getMessage());
        }
        continue; /* Loop/switch isn't completed */
_L4:
        Log.d("Transmitter", "No Server URL to send data to, skipping send");
        if (true) goto _L2; else goto _L6
_L6:
    }
}
