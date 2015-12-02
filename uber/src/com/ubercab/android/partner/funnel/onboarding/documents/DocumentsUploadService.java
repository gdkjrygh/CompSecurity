// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.onboarding.documents;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.util.ArrayMap;
import b;
import chp;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.core.app.CoreService;
import cre;
import crf;
import crt;
import cte;
import ctf;
import ctg;
import cth;
import ctj;
import gkq;
import hoi;
import ica;
import ico;
import ide;
import iiy;
import ijg;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class DocumentsUploadService extends CoreService
    implements cre
{

    public chp a;
    public ctj b;
    public hoi c;
    File d;
    private iiy e;
    private cre f;
    private cth g;
    private int h;
    private boolean i;

    public DocumentsUploadService()
    {
        e = new iiy();
    }

    public static Intent a(Context context, int j, int k, String s, Uri uri, Bundle bundle)
    {
        context = new Intent(context, com/ubercab/android/partner/funnel/onboarding/documents/DocumentsUploadService);
        context.putExtra("bundle.document_id", j);
        context.putExtra("bundle.uuid", s);
        context.putExtra("bundle.type", k);
        context.putExtra("bundle.file_uri", uri);
        context.putExtra("bundle.metadata", bundle);
        return context;
    }

    private static String a(int j, int k, String s)
    {
        return (new StringBuilder(String.valueOf(k))).append("_").append(String.valueOf(j)).append("_").append(s).toString();
    }

    static void a(DocumentsUploadService documentsuploadservice)
    {
        documentsuploadservice.c();
    }

    private void a(cth cth1)
    {
        cth1.a(this);
    }

    static iiy b(DocumentsUploadService documentsuploadservice)
    {
        return documentsuploadservice.e;
    }

    private void b()
    {
        i = false;
        d = null;
        stopSelf();
    }

    private void c()
    {
        if (i) goto _L2; else goto _L1
_L1:
        Object obj;
        i = true;
        obj = getDir("documents", 0);
        if (!((File) (obj)).exists() || !((File) (obj)).isDirectory()) goto _L4; else goto _L3
_L3:
        File afile[] = ((File) (obj)).listFiles();
        if (afile.length <= 0) goto _L4; else goto _L5
_L5:
        Object aobj[];
        d = afile[0];
        aobj = d.getName().split("_");
        if (aobj.length != 3) goto _L4; else goto _L6
_L6:
        afile = gkq.b(new FileInputStream(d));
        IOException ioexception;
        int j;
        int k;
        int l;
        try
        {
            j = Integer.valueOf(aobj[0]).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            j = 0;
            aobj = afile;
            continue; /* Loop/switch isn't completed */
        }
        l = Integer.valueOf(aobj[1]).intValue();
        String s = aobj[2];
        aobj = afile;
        k = j;
        j = l;
        afile = s;
_L11:
        if (aobj == null || afile == null || j == -1) goto _L8; else goto _L7
_L7:
        h = j;
        ArrayMap arraymap = (ArrayMap)c.a(d.getName(), android/support/v4/util/ArrayMap);
        e.a(b.a(afile, j, k, arraymap, ((byte []) (aobj))).a(ico.a()).a(new ide() {

            final DocumentsUploadService a;

            private void a()
            {
                if (DocumentsUploadService.b(a).d())
                {
                    a.a(true);
                }
            }

            public final void call(Object obj1)
            {
                a();
            }

            
            {
                a = DocumentsUploadService.this;
                super();
            }
        }, new ide() {

            final DocumentsUploadService a;

            private void a()
            {
                if (DocumentsUploadService.b(a).d())
                {
                    a.a(false);
                }
            }

            public final void call(Object obj1)
            {
                a();
            }

            
            {
                a = DocumentsUploadService.this;
                super();
            }
        }));
_L2:
        return;
        ioexception;
        j = 0;
        aobj = null;
_L9:
        ijg.d(ioexception, "Unable to retrieve document.", new Object[0]);
        byte byte0 = -1;
        k = j;
        afile = null;
        j = byte0;
        continue; /* Loop/switch isn't completed */
_L8:
        b();
        return;
        ioexception;
        aobj = afile;
        if (true) goto _L9; else goto _L4
_L4:
        k = 0;
        afile = null;
        aobj = null;
        j = -1;
        if (true) goto _L11; else goto _L10
_L10:
    }

    private static cth d()
    {
        return cte.a().a(crt.a()).a();
    }

    public final crf a()
    {
        return d();
    }

    public final volatile void a(crf crf)
    {
        a((cth)crf);
    }

    final void a(boolean flag)
    {
        i = false;
        d.delete();
        c.a(d.getName());
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("impression");
        b b1;
        if (flag)
        {
            b1 = b.l;
        } else
        {
            b1 = b.k;
        }
        analyticsevent.setName(b1);
        analyticsevent.setValue(Integer.valueOf(h));
        a.a(analyticsevent);
        c();
    }

    public IBinder onBind(Intent intent)
    {
        return new ctg(this);
    }

    public void onCreate()
    {
        if (f == null)
        {
            g = d();
        } else
        {
            g = (cth)f.a();
        }
        g.a(this);
    }

    public void onDestroy()
    {
        super.onDestroy();
        e.a();
    }

    public int onStartCommand(Intent intent, int j, int k)
    {
        if (intent != null && intent.hasExtra("bundle.file_uri"))
        {
            Object obj = (Uri)intent.getParcelableExtra("bundle.file_uri");
            String s = intent.getStringExtra("bundle.uuid");
            j = intent.getIntExtra("bundle.document_id", -1);
            k = intent.getIntExtra("bundle.type", 0);
            intent = intent.getBundleExtra("bundle.metadata");
            obj = new File(((Uri) (obj)).getPath());
            File file = getDir("documents", 0);
            (new AsyncTask(intent, a(j, k, s), ((File) (obj)), file) {

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
                        String s1;
                        for (Iterator iterator = a.keySet().iterator(); iterator.hasNext(); arraymap.put(s1, a.get(s1)))
                        {
                            s1 = (String)iterator.next();
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

                protected final void onPostExecute(Object obj1)
                {
                    a((Boolean)obj1);
                }

            
            {
                e = DocumentsUploadService.this;
                a = bundle;
                b = s;
                c = file;
                d = file1;
                super();
            }
            }).execute(new Void[0]);
        }
        return 1;
    }
}
