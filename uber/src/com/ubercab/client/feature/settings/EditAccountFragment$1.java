// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.settings;

import android.net.Uri;
import android.os.AsyncTask;
import com.ubercab.ui.CircleImageView;
import cwm;
import gkq;
import java.io.FileInputStream;

// Referenced classes of package com.ubercab.client.feature.settings:
//            EditAccountFragment

final class a extends AsyncTask
{

    final Uri a;
    final EditAccountFragment b;

    private void a(byte abyte0[])
    {
        super.onPostExecute(abyte0);
        if (abyte0 != null)
        {
            EditAccountFragment.a(b, abyte0);
            b.mImageViewPicture.setImageURI(a);
        } else
        {
            cwm.a(EditAccountFragment.a(b), b.getString(0x7f07021f));
        }
        EditAccountFragment.b(b);
    }

    private transient byte[] a()
    {
        byte abyte0[];
        try
        {
            FileInputStream fileinputstream = new FileInputStream(a.getPath());
            abyte0 = gkq.b(fileinputstream);
            fileinputstream.close();
        }
        catch (Exception exception)
        {
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

    (EditAccountFragment editaccountfragment, Uri uri)
    {
        b = editaccountfragment;
        a = uri;
        super();
    }
}
