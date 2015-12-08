// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;

// Referenced classes of package net.hockeyapp.android:
//            PaintActivity

class val.bitmap extends AsyncTask
{

    final PaintActivity this$0;
    final Bitmap val$bitmap;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((File[])aobj);
    }

    protected transient Void doInBackground(File afile[])
    {
        try
        {
            afile = new FileOutputStream(afile[0]);
            val$bitmap.compress(android.graphics.ormat.JPEG, 100, afile);
            afile.close();
        }
        // Misplaced declaration of an exception variable
        catch (File afile[])
        {
            afile.printStackTrace();
            Log.e("HockeyApp", "Could not save image.", afile);
        }
        return null;
    }

    ()
    {
        this$0 = final_paintactivity;
        val$bitmap = Bitmap.this;
        super();
    }
}
