// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Executor;

public final class dvc
{

    private final Context a;
    private AlertDialog b;
    private Executor c;
    private AsyncTask d;

    public dvc(Context context)
    {
        a = context;
    }

    static AlertDialog a(dvc dvc1, AlertDialog alertdialog)
    {
        dvc1.b = alertdialog;
        return alertdialog;
    }

    static Context a(dvc dvc1)
    {
        return dvc1.a;
    }

    static void a(dvc dvc1, Uri uri)
    {
        dvc1.b(uri);
    }

    static boolean a(int i)
    {
        return b(i);
    }

    static AsyncTask b(dvc dvc1)
    {
        return dvc1.d;
    }

    private void b(Uri uri)
    {
        uri = new Intent("android.intent.action.VIEW", uri);
        a.startActivity(uri);
    }

    private static boolean b(int i)
    {
        return i >= 300 && i < 400;
    }

    static AlertDialog c(dvc dvc1)
    {
        return dvc1.b;
    }

    public final void a()
    {
        if (d != null)
        {
            d.cancel(true);
        }
        if (b != null)
        {
            b.dismiss();
        }
    }

    public final void a(Uri uri)
    {
        if (uri == null)
        {
            return;
        }
        if (!uri.getScheme().startsWith("http"))
        {
            b(uri);
        }
        d = new AsyncTask() {

            final boolean a = true;
            final dvd b = null;
            final dvc c;

            private transient Uri a(Uri auri[])
            {
                return b(auri[0]);
            }

            private void a(Uri uri1)
            {
                dvc.a(c, uri1);
                if (dvc.c(c) != null)
                {
                    dvc.c(c).dismiss();
                }
            }

            private Uri b(Uri uri1)
            {
                Object obj1 = null;
                Object obj = (HttpURLConnection)(new URL(uri1.toString())).openConnection();
                int i;
                ((HttpURLConnection) (obj)).setInstanceFollowRedirects(false);
                ((HttpURLConnection) (obj)).setConnectTimeout(10000);
                ((HttpURLConnection) (obj)).setReadTimeout(10000);
                i = ((HttpURLConnection) (obj)).getResponseCode();
                obj1 = ((HttpURLConnection) (obj)).getHeaderField("Location");
                if (!dvc.a(i) || TextUtils.isEmpty(((CharSequence) (obj1))) || !((String) (obj1)).startsWith("http")) goto _L2; else goto _L1
_L1:
                uri1 = b(Uri.parse(((String) (obj1))));
                obj1 = uri1;
                if (obj != null)
                {
                    ((HttpURLConnection) (obj)).disconnect();
                    obj1 = uri1;
                }
_L4:
                return ((Uri) (obj1));
_L2:
                boolean flag = TextUtils.isEmpty(((CharSequence) (obj1)));
                if (!flag)
                {
                    break MISSING_BLOCK_LABEL_122;
                }
_L5:
                obj1 = uri1;
                if (obj == null) goto _L4; else goto _L3
_L3:
                ((HttpURLConnection) (obj)).disconnect();
                return uri1;
                uri1 = Uri.parse(((String) (obj1)));
                  goto _L5
                uri1;
                obj = null;
_L9:
                if (obj != null)
                {
                    ((HttpURLConnection) (obj)).disconnect();
                }
                return null;
                uri1;
                obj = obj1;
_L7:
                if (obj != null)
                {
                    ((HttpURLConnection) (obj)).disconnect();
                }
                throw uri1;
                uri1;
                if (true) goto _L7; else goto _L6
_L6:
                uri1;
                if (true) goto _L9; else goto _L8
_L8:
            }

            protected final Object doInBackground(Object aobj[])
            {
                return a((Uri[])aobj);
            }

            protected final void onPostExecute(Object obj)
            {
                a((Uri)obj);
            }

            protected final void onPreExecute()
            {
                if (a)
                {
                    String s = dvc.a(c).getString(0x7f070296);
                    dvc.a(c, dtg.a(dvc.a(c), s, true, null));
                    dvc.c(c).setOnCancelListener(new android.content.DialogInterface.OnCancelListener(this) {

                        final _cls1 a;

                        public final void onCancel(DialogInterface dialoginterface)
                        {
                            dvc.b(a.c).cancel(true);
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                    dvc.c(c).show();
                }
            }

            
            {
                c = dvc.this;
                super();
            }
        };
        AsyncTask asynctask = d;
        Executor executor;
        if (c != null)
        {
            executor = c;
        } else
        {
            executor = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        asynctask.executeOnExecutor(executor, new Uri[] {
            uri
        });
    }
}
