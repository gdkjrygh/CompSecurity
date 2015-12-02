// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.support;

import android.net.Uri;
import android.os.AsyncTask;
import com.ubercab.rds.core.model.SupportNode;
import cwm;
import gkq;
import hbo;
import ijg;
import java.io.FileInputStream;

// Referenced classes of package com.ubercab.rds.feature.support:
//            SupportFormActivity

final class b extends AsyncTask
{

    final Uri a;
    final String b;
    final SupportFormActivity c;

    private void a(byte abyte0[])
    {
        super.onPostExecute(abyte0);
        if (abyte0 != null)
        {
            SupportFormActivity.a(c, b, abyte0);
            return;
        }
        c.d(b, null);
        if (c.h() == c.i())
        {
            SupportFormActivity.j(c);
        }
        cwm.a(c, c.getString(hbo.ub__rds__image_failure));
        ijg.d("Failed to upload image for support form.", new Object[] {
            SupportFormActivity.b(c).getId()
        });
    }

    private transient byte[] a()
    {
        byte abyte0[];
        try
        {
            abyte0 = gkq.b(new FileInputStream(a.getPath()));
        }
        catch (Exception exception)
        {
            ijg.d("Failed to decode image from path.", new Object[] {
                exception
            });
            return null;
        }
        return abyte0;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        a((byte[])obj);
    }

    (SupportFormActivity supportformactivity, Uri uri, String s)
    {
        c = supportformactivity;
        a = uri;
        b = s;
        super();
    }
}
