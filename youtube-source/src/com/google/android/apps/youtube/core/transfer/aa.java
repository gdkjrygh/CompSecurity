// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.converter.ConverterException;
import com.google.android.apps.youtube.core.converter.http.fo;
import com.google.android.apps.youtube.core.identity.ak;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;
import com.google.android.apps.youtube.datalib.model.transfer.a;
import com.google.android.youtube.h;
import com.google.android.youtube.p;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            l, m, TransferException, ac, 
//            ab

public final class aa
    implements com.google.android.apps.youtube.core.transfer.l
{

    private static final Pattern a = Pattern.compile("bytes=(\\d+)-(\\d+)");
    private final Context b;
    private final NotificationManager c;
    private final Analytics d;
    private final HttpClient e;
    private final bc f;
    private final ak g;
    private final l h;
    private final Transfer i;
    private final String j;
    private final fo k;
    private final m l;
    private final Executor m;
    private final Object n = new Object();
    private volatile boolean o;
    private volatile HttpUriRequest p;
    private volatile boolean q;
    private long r;
    private long s;
    private final ConditionVariable t = new ConditionVariable();

    public aa(Context context, Executor executor, HttpClient httpclient, bc bc1, ak ak1, l l1, Analytics analytics, 
            fo fo1, Transfer transfer, m m1)
    {
        b = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        c = (NotificationManager)context.getSystemService("notification");
        e = (HttpClient)com.google.android.apps.youtube.common.fromguava.c.a(httpclient);
        m = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        f = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        g = (ak)com.google.android.apps.youtube.common.fromguava.c.a(ak1);
        h = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        d = (Analytics)com.google.android.apps.youtube.common.fromguava.c.a(analytics);
        k = (fo)com.google.android.apps.youtube.common.fromguava.c.a(fo1);
        i = (Transfer)com.google.android.apps.youtube.common.fromguava.c.a(transfer);
        j = transfer.g.b("authAccount");
        l = (m)com.google.android.apps.youtube.common.fromguava.c.a(m1);
        o = true;
    }

    static long a(aa aa1, long l1)
    {
        aa1.s = l1;
        return l1;
    }

    private Uri a(String s1)
    {
        Uri uri;
        Object obj = null;
        uri = obj;
        if (!(new File(s1)).exists())
        {
            break MISSING_BLOCK_LABEL_103;
        }
        s1 = b.getContentResolver().query(android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[] {
            "_id"
        }, "_data=?", new String[] {
            s1
        }, null);
        uri = obj;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        if (!s1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_105;
        }
        int i1 = s1.getInt(s1.getColumnIndex("_id"));
        uri = Uri.withAppendedPath(Uri.parse("content://media/external/video/media"), Integer.toString(i1));
        s1.close();
        return uri;
        s1.close();
        return null;
        Exception exception;
        exception;
        s1.close();
        throw exception;
    }

    private HttpResponse a()
    {
        HttpPut httpput = new HttpPut(i.b);
        httpput.setHeader("Content-Range", "bytes */*");
        synchronized (n)
        {
            p = httpput;
        }
        obj = e.execute(p);
        return ((HttpResponse) (obj));
        ClientProtocolException clientprotocolexception;
        clientprotocolexception;
        b();
        throw new TransferException(clientprotocolexception, false);
        obj2;
        synchronized (n)
        {
            if (!p.isAborted())
            {
                break MISSING_BLOCK_LABEL_107;
            }
            L.e("Range request was aborted");
        }
        return null;
        obj2;
        obj1;
        JVM INSTR monitorexit ;
        throw obj2;
        p.abort();
        throw new TransferException(((Throwable) (obj2)), false);
    }

    private HttpResponse a(InputStream inputstream, long l1, boolean flag)
    {
        HttpPut httpput;
        long l2;
        if (q)
        {
            return null;
        }
        l2 = l1 + 1L;
        long l3 = r;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        l3 = l3 - 1L - (long)i1;
        if (!flag && l2 > l3)
        {
            return new BasicHttpResponse(new BasicStatusLine(HttpVersion.HTTP_1_1, 308, "Already uploaded all possible content for a gated upload."));
        }
        l.b(i.a, l1);
        l.a(i.a, r);
        httpput = new HttpPut(i.b);
        httpput.setHeader("Content-Type", "application/octet-stream");
        httpput.setHeader("Content-Range", String.format("bytes %d-%d/%d", new Object[] {
            Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(r)
        }));
        try
        {
            if (inputstream.skip(l2) != l2)
            {
                throw new TransferException("unable to skip to upload position", true);
            }
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new TransferException(inputstream, true);
        }
        long l4 = r;
        int j1;
        if (flag)
        {
            j1 = 0;
        } else
        {
            j1 = 1;
        }
        httpput.setEntity(new ac(this, inputstream, l4 - l2 - (long)j1, l1));
        synchronized (n)
        {
            p = httpput;
        }
        return e.execute(p);
        exception;
        inputstream;
        JVM INSTR monitorexit ;
        throw exception;
        inputstream;
        b();
        throw new TransferException(inputstream, false);
        obj;
        synchronized (n)
        {
            if (!p.isAborted())
            {
                break MISSING_BLOCK_LABEL_350;
            }
            L.e("Upload request was aborted");
        }
        return null;
        obj;
        inputstream;
        JVM INSTR monitorexit ;
        throw obj;
        p.abort();
        throw new TransferException(((Throwable) (obj)), false);
    }

    static void a(aa aa1)
    {
        aa1.b();
    }

    private void a(Video video)
    {
        if (video.state != com.google.android.apps.youtube.datalib.model.gdata.Video.State.PLAYABLE && video.state != com.google.android.apps.youtube.datalib.model.gdata.Video.State.PROCESSING) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L6:
        if (i1 >= 10)
        {
            break MISSING_BLOCK_LABEL_354;
        }
        i1++;
        Object obj;
        ExecutionException executionexception;
        Object obj1;
        Object obj2;
        long l1;
        boolean flag;
        try
        {
            Thread.sleep(30000L);
        }
        catch (InterruptedException interruptedexception) { }
        if (!h.b()) goto _L2; else goto _L3
_L3:
        flag = g.b().equals(j);
        if (flag) goto _L4; else goto _L2
_L2:
        if (h.b() && g.b().equals(j))
        {
            i1 = h.ag;
            obj1 = b.getString(p.gs);
            obj = b.getString(p.gs);
            l1 = System.currentTimeMillis();
            obj2 = new Intent("android.intent.action.VIEW", Uri.parse(com.google.android.apps.youtube.common.e.p.e(video.id)));
            ((Intent) (obj2)).setPackage(b.getPackageName());
            ((Intent) (obj2)).setFlags(((Intent) (obj2)).getFlags() | 0x10000000);
            ((Intent) (obj2)).putExtra("authenticate", true);
            ((Intent) (obj2)).putExtra("uploader_notification", true);
            ((Intent) (obj2)).putExtra("feature", WatchFeature.UPLOAD_NOTIFICATION);
            obj2 = PendingIntent.getActivity(b, 0, ((Intent) (obj2)), 0x40000000);
            obj1 = new Notification(i1, ((CharSequence) (obj1)), l1);
            ((Notification) (obj1)).setLatestEventInfo(b, ((CharSequence) (obj)), new StringBuilder(video.title), ((PendingIntent) (obj2)));
            obj1.flags = 16;
            c.notify(video.id, 1, ((Notification) (obj1)));
        }
        return;
_L4:
        obj = com.google.android.apps.youtube.common.a.c.a();
        f.c(video.id, ((com.google.android.apps.youtube.common.a.b) (obj)));
        obj = (Video)((com.google.android.apps.youtube.common.a.c) (obj)).get();
        if (((Video) (obj)).state == com.google.android.apps.youtube.datalib.model.gdata.Video.State.PROCESSING || ((Video) (obj)).streams.isEmpty()) goto _L6; else goto _L5
_L5:
        L.e("Upload transcoding finished");
          goto _L2
        executionexception;
        L.e("Upload streams not found yet");
          goto _L6
        d.b("UploadTranscodingWaitAbort");
        L.e("Upload streams not found, polling aborted");
          goto _L2
    }

    private static void a(HttpResponse httpresponse)
    {
        httpresponse = httpresponse.getEntity();
        if (httpresponse != null)
        {
            httpresponse.consumeContent();
        }
    }

    static Object b(aa aa1)
    {
        return aa1.n;
    }

    private void b()
    {
        Object obj = n;
        obj;
        JVM INSTR monitorenter ;
        long l1 = r;
        int i1;
        long l2;
        if (i.g.b("metadata_updated", true))
        {
            i1 = 0;
        } else
        {
            i1 = 2;
        }
        l2 = i1;
        if (p != null && !p.isAborted() && s < l1 - l2)
        {
            p.abort();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void b(HttpResponse httpresponse)
    {
        l.b(i.a, r);
        boolean flag;
        httpresponse = (Video)k.b(httpresponse);
        flag = i.g.a("metadata_updated");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_327;
        }
        com.google.android.apps.youtube.common.a.c c1;
        L.e("Executing metadata update");
        c1 = com.google.android.apps.youtube.common.a.c.a();
        if (h.b() && g.b().equals(j)) goto _L2; else goto _L1
_L1:
        L.b("Error updating metadata, auth is null");
_L3:
        a(httpresponse);
_L4:
        f.h();
        long l1 = i.g.b("upload_start_time_millis", -1L);
        if (l1 > 0L)
        {
            l1 = System.currentTimeMillis() - l1;
        } else
        {
            l1 = -1L;
        }
        d.a("UploadCompleted", null, (int)l1);
        l.a(i.a, i.h);
        return;
_L2:
        f.a(i.g.b("upload_title"), i.g.b("upload_description"), ((Video) (httpresponse)).categoryTerm, ((Video) (httpresponse)).categoryLabel, i.g.b("upload_keywords"), com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy.valueOf(i.g.b("upload_privacy")), ((Video) (httpresponse)).accessControl, ((Video) (httpresponse)).location, i.g.b("upload_location"), ((Video) (httpresponse)).editUri, c1);
        httpresponse = (Video)c1.get();
        i.h.a("video_id", ((Video) (httpresponse)).id);
          goto _L3
        httpresponse;
        try
        {
            throw new TransferException("Error updating video metadata after upload", true);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            L.a("error parsing uploaded video", httpresponse);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            L.a("error parsing uploaded video", httpresponse);
        }
          goto _L4
        i.h.a("video_id", ((Video) (httpresponse)).id);
        a(httpresponse);
          goto _L4
    }

    static long c(aa aa1)
    {
        return aa1.r;
    }

    static Transfer d(aa aa1)
    {
        return aa1.i;
    }

    static m e(aa aa1)
    {
        return aa1.l;
    }

    public final void a(int i1)
    {
        q = true;
        if (!o)
        {
            m.execute(new ab(this));
        }
        t.block();
    }

    public final void run()
    {
        L.e((new StringBuilder("Upload starting [")).append(Thread.currentThread().getName()).append("] ").append(i.a).toString());
        if (!q) goto _L2; else goto _L1
_L1:
        L.e((new StringBuilder("Upload cancelled before the task started [")).append(Thread.currentThread().getName()).append("] ").append(i.a).toString());
_L8:
        t.open();
        return;
_L2:
        Uri uri;
        Object obj1;
        uri = Uri.parse(i.a);
        obj1 = uri.getScheme();
        Uri uri1 = uri;
        if ("content".equals(obj1)) goto _L4; else goto _L3
_L3:
        if (!TextUtils.isEmpty(((CharSequence) (obj1))) && !"file".equals(uri.getScheme())) goto _L6; else goto _L5
_L5:
        obj = a(uri.getPath());
_L17:
        uri1 = ((Uri) (obj));
        if (obj != null) goto _L4; else goto _L7
_L7:
        L.b((new StringBuilder("Cannot resolve as content uri: ")).append(i.a).toString());
          goto _L8
        obj;
        L.a("failure uploading", ((Throwable) (obj)));
        l.a(i.a, new TransferException(((Throwable) (obj)), false));
        t.open();
        return;
_L4:
        obj = b.getContentResolver().query(uri1, new String[] {
            "_size"
        }, null, null, null);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_345;
        }
        L.b((new StringBuilder("Upload cursor is null: ")).append(i.a).toString());
          goto _L8
        obj;
        L.a("FATAL failure uploading", ((Throwable) (obj)));
        d.a("UploadFatalError", ((ClientProtocolException) (obj)).getMessage());
        l.a(i.a, new TransferException(((Throwable) (obj)), true));
        t.open();
        return;
        if (((Cursor) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_446;
        }
        L.b((new StringBuilder("Upload cursor is empty: ")).append(i.a).toString());
        ((Cursor) (obj)).close();
          goto _L8
        obj;
        L.a("failure uploading", ((Throwable) (obj)));
        d.a("UploadError", ((IOException) (obj)).getMessage());
        l.a(i.a, new TransferException(((Throwable) (obj)), false));
        t.open();
        return;
        r = ((Cursor) (obj)).getLong(0);
        l.a(i.a, r);
        if (q) goto _L8; else goto _L9
_L9:
        o = false;
        obj = a();
        if (q || obj == null) goto _L8; else goto _L10
_L10:
        int i1 = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        if (i1 != 308) goto _L12; else goto _L11
_L11:
        a(((HttpResponse) (obj)));
        obj = ((HttpResponse) (obj)).getFirstHeader("range");
        if (obj != null) goto _L14; else goto _L13
_L13:
        long l1 = -1L;
_L16:
        synchronized (n)
        {
            s = l1;
        }
        obj = a(b.getContentResolver().openInputStream(uri1), l1, i.g.b("metadata_updated", true));
        if (q || obj == null) goto _L8; else goto _L15
_L15:
        i1 = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        if (i1 != 200 && i1 != 201)
        {
            break MISSING_BLOCK_LABEL_765;
        }
        b(((HttpResponse) (obj)));
          goto _L8
        obj;
        L.a("failure uploading", ((Throwable) (obj)));
        d.a("UploadError", ((TransferException) (obj)).getMessage());
        l.a(i.a, ((TransferException) (obj)));
        t.open();
        return;
_L14:
        obj = ((Header) (obj)).getValue();
        obj1 = a.matcher(((CharSequence) (obj)));
        if (!((Matcher) (obj1)).find())
        {
            throw new IOException(String.format("malformed range header=%s", new Object[] {
                obj
            }));
        }
        break MISSING_BLOCK_LABEL_747;
        obj;
        t.open();
        throw obj;
        l1 = Long.parseLong(((Matcher) (obj1)).group(2));
          goto _L16
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (i1 != 308)
        {
            break MISSING_BLOCK_LABEL_822;
        }
        a(((HttpResponse) (obj)));
        if (i.g.b("metadata_updated", true) && s < r - 2L)
        {
            throw new TransferException("upload request got http status: 308", false);
        }
          goto _L8
        a(((HttpResponse) (obj)));
        throw new TransferException((new StringBuilder("upload request got http status: ")).append(i1).toString(), true);
_L18:
        b(((HttpResponse) (obj)));
          goto _L8
_L19:
        a(((HttpResponse) (obj)));
        throw new TransferException((new StringBuilder("range request got http status: ")).append(i1).toString(), true);
_L6:
        obj = null;
          goto _L17
_L12:
        if (i1 != 200 && i1 != 201) goto _L19; else goto _L18
    }

}
