// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            x, PhotoDetailActivity

class f extends AsyncTask
{

    final PhotoDetailActivity a;

    f(PhotoDetailActivity photodetailactivity)
    {
        a = photodetailactivity;
        super();
    }

    protected transient Boolean a(Bitmap abitmap[])
    {
        Bitmap bitmap;
        boolean flag;
        boolean flag2;
        boolean flag3;
        flag2 = false;
        flag3 = false;
        flag = false;
        bitmap = abitmap[0];
        abitmap = new File(x.a);
        File file = abitmap.getParentFile();
        if (!file.exists())
        {
            file.mkdirs();
        }
        FileOutputStream fileoutputstream = new FileOutputStream(abitmap);
        if (fileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        abitmap = fileoutputstream;
        flag = bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, fileoutputstream);
        boolean flag1;
        flag1 = flag;
        if (fileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        fileoutputstream.close();
        flag1 = flag;
_L2:
        return Boolean.valueOf(flag1);
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        fileoutputstream = null;
_L5:
        abitmap = fileoutputstream;
        filenotfoundexception.printStackTrace();
        flag1 = flag2;
        if (fileoutputstream == null) goto _L2; else goto _L1
_L1:
        fileoutputstream.close();
        flag1 = flag2;
          goto _L2
        abitmap;
        flag = flag3;
_L3:
        abitmap.printStackTrace();
        flag1 = flag;
          goto _L2
        Exception exception;
        exception;
        abitmap = null;
_L4:
        if (abitmap != null)
        {
            try
            {
                abitmap.close();
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap abitmap[])
            {
                abitmap.printStackTrace();
            }
        }
        throw exception;
        abitmap;
          goto _L3
        exception;
          goto _L4
        filenotfoundexception;
          goto _L5
    }

    protected void a(Boolean boolean1)
    {
        PhotoDetailActivity.r(a);
        if (boolean1.booleanValue())
        {
            PhotoDetailActivity.b(a, a.getString(0x7f0804a1));
            PhotoDetailActivity.x(a);
            PhotoDetailActivity.a(a, PhotoDetailActivity.p(a));
            PhotoDetailActivity.b(a, PhotoDetailActivity.y(a));
            a.finish();
            return;
        } else
        {
            PhotoDetailActivity.b(a, a.getString(0x7f0804a2));
            return;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Bitmap[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }

    protected void onPreExecute()
    {
        PhotoDetailActivity.a(a, a.getString(0x7f08049f), true, false);
    }
}
