// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.onboarding.documents;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import hoi;
import ijg;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.ubercab.android.partner.funnel.onboarding.documents:
//            DocumentsUploadService

final class d extends AsyncTask
{

    final Bundle a;
    final String b;
    final File c;
    final File d;
    final DocumentsUploadService e;

    private transient Boolean a()
    {
        ArrayMap arraymap = new ArrayMap();
        if (a != null)
        {
            String s;
            for (Iterator iterator = a.keySet().iterator(); iterator.hasNext(); arraymap.put(s, a.get(s)))
            {
                s = (String)iterator.next();
            }

        }
        e.c.a(b, arraymap);
        return Boolean.valueOf(c.renameTo(new File(d, b)));
    }

    private void a(Boolean boolean1)
    {
        super.onPostExecute(boolean1);
        if (!boolean1.booleanValue())
        {
            ijg.d("Unable to move file to pending uploads folder.", new Object[0]);
            return;
        } else
        {
            DocumentsUploadService.a(e);
            return;
        }
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }

    (DocumentsUploadService documentsuploadservice, Bundle bundle, String s, File file, File file1)
    {
        e = documentsuploadservice;
        a = bundle;
        b = s;
        c = file;
        d = file1;
        super();
    }
}
