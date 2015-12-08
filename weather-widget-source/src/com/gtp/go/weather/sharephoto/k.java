// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.Toast;
import com.gtp.a.a.c.c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            PhotoDetailActivity

class k extends AsyncTask
{

    final PhotoDetailActivity a;

    k(PhotoDetailActivity photodetailactivity)
    {
        a = photodetailactivity;
        super();
    }

    protected transient Boolean a(Bitmap abitmap[])
    {
        Object obj;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag2 = false;
        flag3 = false;
        flag = false;
        Bitmap bitmap = abitmap[0];
        abitmap = new File(PhotoDetailActivity.a());
        if (abitmap.exists())
        {
            abitmap.delete();
        } else
        {
            obj = abitmap.getParentFile();
            if (!((File) (obj)).exists())
            {
                ((File) (obj)).mkdirs();
            }
        }
        obj = new FileOutputStream(abitmap);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        abitmap = ((Bitmap []) (obj));
        flag = bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, ((java.io.OutputStream) (obj)));
        flag1 = flag;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ((FileOutputStream) (obj)).close();
        flag1 = flag;
_L2:
        return Boolean.valueOf(flag1);
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        obj = null;
_L5:
        abitmap = ((Bitmap []) (obj));
        filenotfoundexception.printStackTrace();
        flag1 = flag2;
        if (obj == null) goto _L2; else goto _L1
_L1:
        ((FileOutputStream) (obj)).close();
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
            PhotoDetailActivity.a(a, new File(PhotoDetailActivity.a()));
            return;
        } else
        {
            Toast.makeText(a.getApplicationContext(), 0x7f080493, 0).show();
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
        if (c.b())
        {
            PhotoDetailActivity.a(a, "", true, false);
        }
    }
}
