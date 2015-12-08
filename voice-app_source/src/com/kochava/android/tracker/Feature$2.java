// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.os.AsyncTask;
import com.kochava.android.util.Logging;

// Referenced classes of package com.kochava.android.tracker:
//            Feature

class this._cls0 extends AsyncTask
{

    final Feature this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient String doInBackground(Void avoid[])
    {
        try
        {
            avoid = Feature.access$000(Feature.this);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            Logging.LogError("*****NOTICE***** \nAn error has occured when trying to gather the Google Advertising Id. Please make sure you have the Google Play Services Library integrated in your app! \n*****NOTICE*****");
            return null;
        }
        return avoid;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((String)obj);
    }

    protected void onPostExecute(String s)
    {
        String _tmp = Feature.access$102(s);
        Logging.Log("ADID retrevial finished and gathered if available.");
    }

    ()
    {
        this$0 = Feature.this;
        super();
    }
}
