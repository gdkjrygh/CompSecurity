// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.video;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.Log;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.weather.util.app.AbstractTwcApplication;
import java.io.IOException;

// Referenced classes of package com.weather.Weather.video:
//            VideoFragment

private class <init> extends AsyncTask
{

    final VideoFragment this$0;

    protected transient Drawable doInBackground(String as[])
    {
        Object obj;
        obj = as[0];
        if (VideoFragment.access$100())
        {
            Log.d("VideoFragment", (new StringBuilder()).append("in LoadHeroImageTask.doInBackground with url : ").append(((String) (obj))).toString());
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        android.graphics.Bitmap bitmap;
        try
        {
            bitmap = Picasso.with(AbstractTwcApplication.getRootContext()).load(((String) (obj))).skipMemoryCache().get();
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            return null;
        }
        obj = bitmap;
        if (bitmap != null) goto _L4; else goto _L3
_L3:
        obj = Picasso.with(AbstractTwcApplication.getRootContext()).load(as[1]).skipMemoryCache().get();
          goto _L4
_L5:
        as = new BitmapDrawable(getResources(), ((android.graphics.Bitmap) (obj)));
        return as;
_L4:
        if (obj != null) goto _L5; else goto _L2
_L2:
        return null;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    private ()
    {
        this$0 = VideoFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
