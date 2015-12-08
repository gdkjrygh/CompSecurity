// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import com.jiubang.ggheart.apps.desks.diy.filter.core.FilterParameter;
import com.jiubang.ggheart.apps.desks.diy.filter.core.FilterService;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            EditPhotoActivity, ab, PhotoPreview, b

final class c extends AsyncTask
{

    final EditPhotoActivity a;

    private c(EditPhotoActivity editphotoactivity)
    {
        a = editphotoactivity;
        super();
    }

    c(EditPhotoActivity editphotoactivity, b b)
    {
        this(editphotoactivity);
    }

    protected transient Bitmap a(FilterParameter afilterparameter[])
    {
        afilterparameter = afilterparameter[0];
        if (((FilterParameter) (afilterparameter)).mSrcBitmap == null)
        {
            Bitmap bitmap = ab.a(ab.a(EditPhotoActivity.a(a), EditPhotoActivity.b(a), EditPhotoActivity.c(a)), EditPhotoActivity.d(a));
            publishProgress(new Bitmap[] {
                bitmap
            });
            afilterparameter.mSrcBitmap = bitmap;
        }
        return EditPhotoActivity.e(a).render(afilterparameter);
    }

    protected void a(Bitmap bitmap)
    {
        if (!isCancelled() && bitmap != null)
        {
            bitmap = new BitmapDrawable(a.e(), bitmap);
            EditPhotoActivity.f(a).a(bitmap);
            if (!EditPhotoActivity.g(a))
            {
                EditPhotoActivity.a(a, true);
                a.a(5);
            }
        }
    }

    protected transient void a(Bitmap abitmap[])
    {
        if (abitmap != null && abitmap.length > 0)
        {
            EditPhotoActivity.a(a, abitmap[0]);
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((FilterParameter[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Bitmap)obj);
    }

    protected void onProgressUpdate(Object aobj[])
    {
        a((Bitmap[])aobj);
    }
}
