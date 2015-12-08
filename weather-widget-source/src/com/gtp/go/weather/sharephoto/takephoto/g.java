// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.SparseArray;
import android.widget.ImageView;
import com.jiubang.ggheart.apps.desks.diy.filter.core.FilterParameter;
import com.jiubang.ggheart.apps.desks.diy.filter.core.FilterService;
import java.lang.ref.SoftReference;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            f, d

class g extends AsyncTask
{

    final FilterParameter a;
    final f b;

    g(f f1, FilterParameter filterparameter)
    {
        b = f1;
        a = filterparameter;
        super();
    }

    protected transient Bitmap a(Void avoid[])
    {
        return d.d(b.f).render(a);
    }

    protected void a(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            b.b.setImageBitmap(bitmap);
            d.c(b.f).append(a.getTypeId(), new SoftReference(bitmap));
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Bitmap)obj);
    }
}
