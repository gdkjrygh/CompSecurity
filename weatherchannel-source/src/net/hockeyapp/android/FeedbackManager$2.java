// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;
import java.io.File;
import java.io.FileOutputStream;

// Referenced classes of package net.hockeyapp.android:
//            FeedbackManager

static final class val.context extends AsyncTask
{

    final Bitmap val$bitmap;
    final Context val$context;

    protected transient Boolean doInBackground(File afile[])
    {
        try
        {
            afile = new FileOutputStream(afile[0]);
            val$bitmap.compress(android.graphics.mat.JPEG, 100, afile);
            afile.close();
        }
        // Misplaced declaration of an exception variable
        catch (File afile[])
        {
            Log.e("HockeyApp", "Could not save screenshot.", afile);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(true);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((File[])aobj);
    }

    protected void onPostExecute(Boolean boolean1)
    {
        if (!boolean1.booleanValue())
        {
            Toast.makeText(val$context, "Screenshot could not be created. Sorry.", 2000).show();
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Boolean)obj);
    }

    (Bitmap bitmap1, Context context1)
    {
        val$bitmap = bitmap1;
        val$context = context1;
        super();
    }
}
