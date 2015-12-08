// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.os.AsyncTask;
import com.gtp.go.weather.sharephoto.d.h;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            PhotoDetailActivity

class d extends AsyncTask
{

    final String a;
    final String b;
    final PhotoDetailActivity c;

    d(PhotoDetailActivity photodetailactivity, String s, String s1)
    {
        c = photodetailactivity;
        a = s;
        b = s1;
        super();
    }

    protected transient Void a(Void avoid[])
    {
        PhotoDetailActivity.a(c, h.a(c, a));
        PhotoDetailActivity.b(c, h.a(c, b));
        return null;
    }

    protected void a(Void void1)
    {
        PhotoDetailActivity.r(c);
        PhotoDetailActivity.s(c);
        PhotoDetailActivity.t(c);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    protected void onPreExecute()
    {
        PhotoDetailActivity.a(c, c.getString(0x7f08048b), true);
    }
}
