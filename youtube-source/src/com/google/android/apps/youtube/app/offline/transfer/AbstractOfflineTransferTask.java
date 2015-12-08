// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.transfer;

import android.database.sqlite.SQLiteFullException;
import android.net.Uri;
import android.os.Process;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.cache.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.offline.store.i;
import com.google.android.apps.youtube.core.player.w;
import com.google.android.apps.youtube.core.transfer.l;
import com.google.android.apps.youtube.core.utils.p;
import com.google.android.apps.youtube.datalib.innertube.InnerTubeServiceException;
import com.google.android.apps.youtube.datalib.innertube.ag;
import com.google.android.apps.youtube.datalib.innertube.ah;
import com.google.android.apps.youtube.datalib.innertube.ak;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;
import com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig;
import com.google.android.apps.youtube.datalib.innertube.model.media.VideoStreamingData;
import com.google.android.apps.youtube.datalib.innertube.model.media.b;
import com.google.android.apps.youtube.datalib.innertube.model.v;
import com.google.android.apps.youtube.datalib.legacy.model.OfflineMediaStatus;
import com.google.android.apps.youtube.datalib.legacy.model.t;
import com.google.android.apps.youtube.datalib.legacy.model.u;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.apps.youtube.app.offline.transfer:
//            c, a, OfflineTransferTimedOutException

public abstract class AbstractOfflineTransferTask
    implements l
{

    protected final i a;
    protected final ah b;
    protected final w c;
    protected final ag d;
    protected final a e;
    protected final String f;
    protected final String g;
    protected final com.google.android.apps.youtube.common.e.b h;
    private final com.google.android.apps.youtube.app.offline.transfer.c i;
    private final com.google.android.apps.youtube.app.offline.transfer.a j = new com.google.android.apps.youtube.app.offline.transfer.a(this, (byte)0);
    private final int k;
    private final af l;
    private final File m;
    private long n;
    private volatile boolean o;

    public AbstractOfflineTransferTask(i i1, ah ah1, w w1, ag ag1, a a1, com.google.android.apps.youtube.common.e.b b1, Transfer transfer, 
            com.google.android.apps.youtube.app.offline.transfer.c c1, int j1, af af1, File file)
    {
        a = i1;
        b = ah1;
        c = w1;
        d = ag1;
        e = a1;
        h = b1;
        f = transfer.a;
        g = p.c(transfer);
        i = (com.google.android.apps.youtube.app.offline.transfer.c)com.google.android.apps.youtube.common.fromguava.c.a(c1);
        k = j1;
        l = af1;
        m = file;
        c1.a(j);
    }

    private long a(Uri uri)
    {
        com.google.android.apps.youtube.common.a.c c1 = com.google.android.apps.youtube.common.a.c.a();
        l.a(uri, c1);
        long l1;
        try
        {
            l1 = ((Long)c1.get()).longValue();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw new IOException();
        }
        return l1;
    }

    private FormatStream a(FormatStream formatstream)
    {
        FormatStream formatstream1 = formatstream;
        if (formatstream.getContentLength() <= 0L)
        {
            formatstream1 = formatstream.buildUpon().a(a(formatstream.getUri())).a();
        }
        return formatstream1;
    }

    private t a(VideoStreamingData videostreamingdata, u u1, boolean flag, PlayerConfig playerconfig)
    {
        Object obj = null;
        FormatStream formatstream;
        int i1;
        if (u1 != null)
        {
            if (flag)
            {
                u1 = u1.b();
            } else
            {
                u1 = u1.a();
            }
        } else
        {
            u1 = null;
        }
        if (u1 == null) goto _L2; else goto _L1
_L1:
        i1 = u1.c();
        formatstream = videostreamingdata.getFormatStreamByItag(i1);
        if (formatstream == null) goto _L4; else goto _L3
_L3:
        formatstream = a(formatstream);
        if (formatstream.getContentLength() != u1.a().getContentLength() || formatstream.getLastModified() != u1.a().getLastModified()) goto _L4; else goto _L5
_L5:
        u1 = u1.a(formatstream);
_L7:
        return u1;
_L4:
        a.a(g, i1);
_L2:
        if (flag)
        {
            videostreamingdata = videostreamingdata.getAudioOnlyStream();
        } else
        {
            videostreamingdata = videostreamingdata.getOfflineVideoStream(k, playerconfig);
        }
        u1 = obj;
        if (videostreamingdata != null)
        {
            videostreamingdata = new t(a(((FormatStream) (videostreamingdata))), flag);
            a.a(g, videostreamingdata.a(), flag);
            return videostreamingdata;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void a(t t1, long l1, long l2)
    {
        if (t1.g())
        {
            return;
        }
        l1 = t1.f();
        long l3 = t1.e();
        if (!i.a(l1 - l3))
        {
            throw new com.google.android.exoplayer.upstream.cache.CacheDataSink.CacheDataSinkException(null);
        } else
        {
            L.e((new StringBuilder("pudl task[")).append(f).append("] start stream<").append(t1.c()).append("> download").toString());
            i.a(t1.a(), 0L, l2);
            return;
        }
    }

    private void b(long l1)
    {
_L2:
        return;
        if (n < 0L || m == null) goto _L2; else goto _L1
_L1:
        Object obj1 = null;
        Object obj = new FileOutputStream((new StringBuilder()).append(m.getAbsolutePath()).append(File.separator).append("offline.log").toString(), true);
        ((OutputStream) (obj)).write(String.format(Locale.US, "%s,%s,%s\n", new Object[] {
            g, Long.valueOf(l1), Long.toString(h.a() - n)
        }).getBytes());
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return;
            }
        }
        if (true) goto _L2; else goto _L3
_L3:
        obj;
        obj = null;
_L7:
        if (obj == null) goto _L2; else goto _L4
_L4:
        try
        {
            ((OutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        obj;
_L6:
        if (obj1 != null)
        {
            try
            {
                ((OutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        throw obj;
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
        if (true) goto _L6; else goto _L5
_L5:
        IOException ioexception;
        ioexception;
          goto _L7
    }

    private boolean c()
    {
        return k == com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format.Type.AMODO_ONLY.getQualityValue();
    }

    public final void a(int i1)
    {
        boolean flag = true;
        L.e((new StringBuilder("pudl task[")).append(f).append("] cancel").toString());
        o = true;
        if ((i1 & 0x80) != 0)
        {
            flag = false;
        }
        i.a(flag);
    }

    protected abstract void a(long l1);

    protected abstract void a(long l1, long l2);

    protected abstract void a(PlayerResponse playerresponse);

    protected abstract void a(String s, Exception exception, OfflineMediaStatus offlinemediastatus);

    protected abstract boolean a();

    protected abstract void b();

    public final void run()
    {
        long l2;
        l2 = 0L;
        Process.setThreadPriority(10);
        Object obj1;
        boolean flag;
        L.d((new StringBuilder("pudl task[")).append(f).append("] start").toString());
        obj1 = (PlayerResponse)e.a(g);
        flag = a();
        Object obj;
        if (flag)
        {
            obj = obj1;
            if (obj1 != null)
            {
                break MISSING_BLOCK_LABEL_446;
            }
        }
        obj = b.a();
        ((ak) (obj)).c(true);
        ((ak) (obj)).a(ak.a);
        ((ak) (obj)).a(g);
        c.a(((ak) (obj)));
        d.a(((ak) (obj)));
        obj = b.a(((ak) (obj)));
        a(((PlayerResponse) (obj)));
        Object obj2 = ((PlayerResponse) (obj)).getPlayabilityStatus();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        if (((com.google.android.apps.youtube.datalib.innertube.model.w) (obj2)).c())
        {
            break MISSING_BLOCK_LABEL_351;
        }
        obj1 = (new StringBuilder("pudl task[")).append(f).append("] received actionable playability error: ");
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_340;
        }
        obj = "null";
_L1:
        try
        {
            L.c(((StringBuilder) (obj1)).append(obj).toString());
            a("Playability error", ((Exception) (null)), OfflineMediaStatus.CANNOT_OFFLINE);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            L.a((new StringBuilder("pudl task[")).append(f).append("] error while pinning video").toString(), ((Throwable) (obj)));
        }
        break MISSING_BLOCK_LABEL_274;
        obj;
        L.a((new StringBuilder("pudl task[")).append(f).append("] failed to retrieve player response").toString(), ((Throwable) (obj)));
        a("Cannot retrieve player response from the server.", ((Exception) (obj)), OfflineMediaStatus.NETWORK_READ_ERROR);
        return;
        a("Error encountered while pinning the video", ((Exception) (obj)), OfflineMediaStatus.FAILED_UNKNOWN);
        return;
        obj;
        L.b((new StringBuilder("pudl task[")).append(f).append("] failed to save player response.").toString());
        a("Fail to save playerResponse", ((Exception) (obj)), OfflineMediaStatus.FAILED_UNKNOWN);
        return;
        obj;
        a("Error trying to write to local disk.", ((Exception) (obj)), OfflineMediaStatus.DISK_WRITE_ERROR);
        return;
        obj = Integer.valueOf(((com.google.android.apps.youtube.datalib.innertube.model.w) (obj2)).a());
          goto _L1
        obj2 = ((PlayerResponse) (obj)).getOfflineState();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_367;
        }
        if (((v) (obj2)).c())
        {
            break MISSING_BLOCK_LABEL_432;
        }
        obj1 = (new StringBuilder("pudl task[")).append(f).append("] received offline state error: ");
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_421;
        }
        obj = "null";
_L3:
        L.b(((StringBuilder) (obj1)).append(obj).toString());
        a("Offline state error", ((Exception) (null)), OfflineMediaStatus.CANNOT_OFFLINE);
        return;
        obj = Integer.valueOf(((v) (obj2)).b());
        if (true) goto _L3; else goto _L2
_L2:
        e.a(g, obj);
        obj1 = ((PlayerResponse) (obj)).getVideoStreamingData();
        n = -1L;
        long l1 = l2;
        obj = ((PlayerResponse) (obj)).getPlayerConfig(com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig.ExoPlayerActivationType.SERVER_EXPERIMENT);
        l1 = l2;
        obj2 = a.a(g, null);
        l1 = l2;
        t t1 = a(((VideoStreamingData) (obj1)), ((u) (obj2)), false, ((PlayerConfig) (obj)));
        l1 = l2;
        if (c() || t1 != null) goto _L5; else goto _L4
_L4:
        l1 = l2;
        throw new IllegalArgumentException("No valid video stream to offline.");
        obj;
_L16:
        l1 = l2;
        if (!(obj instanceof OfflineTransferTimedOutException)) goto _L7; else goto _L6
_L6:
        l1 = l2;
        a(((IOException) (obj)).getMessage(), ((Exception) (obj)), OfflineMediaStatus.NETWORK_READ_ERROR);
_L12:
        b(l2);
        return;
_L5:
        l1 = l2;
        obj = new u(t1, a(((VideoStreamingData) (obj1)), ((u) (obj2)), true, ((PlayerConfig) (obj))));
        l1 = l2;
        long l4 = ((u) (obj)).f();
        l1 = l2;
        long l3 = ((u) (obj)).g();
        l1 = l3;
        l2 = l1;
        com.google.android.apps.youtube.app.offline.transfer.a.a(j, l1);
        l2 = l1;
        a(l1);
        l2 = l1;
        a(l4, l1);
        l2 = l1;
        n = h.a();
        l2 = l1;
        com.google.android.apps.youtube.app.offline.transfer.a.b(j, 0L);
        l2 = l1;
        obj1 = ((u) (obj)).a();
        l2 = l1;
        if (c() || obj1 != null)
        {
            break MISSING_BLOCK_LABEL_718;
        }
        l2 = l1;
        throw new IllegalArgumentException("No valid video stream to offline.");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_760;
        }
        l2 = l1;
        a(((t) (obj1)), 0L, ((t) (obj1)).f());
        l2 = l1;
        l3 = ((t) (obj1)).f();
        l2 = l1;
        com.google.android.apps.youtube.app.offline.transfer.a.b(j, l3);
        l2 = l1;
        flag = o;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_782;
        }
        b(l1);
        return;
        l2 = l1;
        obj = ((u) (obj)).b();
        l2 = l1;
        if (!c() || obj != null) goto _L9; else goto _L8
_L8:
        l2 = l1;
        throw new IllegalArgumentException("No valid audio stream to offline.");
        obj;
_L14:
        l2 = l1;
        L.a((new StringBuilder("pudl task[")).append(f).append("] error while downloading video").toString(), ((Throwable) (obj)));
        l2 = l1;
        a("Error encountered while downloading the video", ((Exception) (obj)), OfflineMediaStatus.DISK_WRITE_ERROR);
        b(l1);
        return;
_L9:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_895;
        }
        l2 = l1;
        a(((t) (obj)), 0L, ((t) (obj)).f());
        l2 = l1;
        flag = o;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_917;
        }
        b(l1);
        return;
        l2 = l1;
        a(l1, l1);
        l2 = l1;
        b();
        b(l1);
        return;
_L7:
        l1 = l2;
        if (!(obj instanceof com.google.android.exoplayer.upstream.HttpDataSource.HttpDataSourceException)) goto _L11; else goto _L10
_L10:
        l1 = l2;
        a("Error trying to read from network.", ((Exception) (obj)), OfflineMediaStatus.NETWORK_READ_ERROR);
          goto _L12
        obj;
_L13:
        b(l1);
        throw obj;
_L11:
        l1 = l2;
        if (!(obj instanceof com.google.android.exoplayer.upstream.FileDataSource.FileDataSourceException))
        {
            break MISSING_BLOCK_LABEL_1011;
        }
        l1 = l2;
        a("Error trying to read from local disk.", ((Exception) (obj)), OfflineMediaStatus.DISK_READ_ERROR);
          goto _L12
        l1 = l2;
        if (!(obj instanceof com.google.android.exoplayer.upstream.cache.CacheDataSink.CacheDataSinkException))
        {
            break MISSING_BLOCK_LABEL_1040;
        }
        l1 = l2;
        a("Error trying to write to local disk.", ((Exception) (obj)), OfflineMediaStatus.DISK_WRITE_ERROR);
          goto _L12
        l1 = l2;
        a("Error trying to download video for offline.", ((Exception) (obj)), OfflineMediaStatus.FAILED_UNKNOWN);
          goto _L12
        obj;
        l1 = l2;
          goto _L13
        obj;
        l1 = 0L;
          goto _L14
        obj;
        l2 = l1;
        if (true) goto _L16; else goto _L15
_L15:
    }
}
