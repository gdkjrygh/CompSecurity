// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;
import java.net.URL;

// Referenced classes of package com.uservoice.uservoicesdk.image:
//            ImageCache

public class DownloadImageTask extends AsyncTask
{

    private ImageView imageView;
    private final String url;

    public DownloadImageTask(String s, ImageView imageview)
    {
        url = s;
        imageView = imageview;
        imageview.setImageBitmap(null);
    }

    protected transient Bitmap doInBackground(Void avoid[])
    {
        try
        {
            avoid = BitmapFactory.decodeStream((new URL(url)).openStream());
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            avoid.printStackTrace();
            return null;
        }
        return avoid;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected void onPostExecute(Bitmap bitmap)
    {
        ImageCache.getInstance().set(url, bitmap);
        imageView.setImageBitmap(bitmap);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Bitmap)obj);
    }
}
