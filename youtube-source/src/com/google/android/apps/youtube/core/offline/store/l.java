// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.offline.store;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.youtube.common.e.e;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.client.ce;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class l
{

    private final Context a;
    private final String b;
    private final bj c;
    private final ce d;
    private File e;
    private File f;
    private File g;

    protected l()
    {
        a = null;
        b = null;
        c = null;
        d = null;
    }

    public l(Context context, String s, bj bj1, ce ce1)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
        c = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        d = (ce)com.google.android.apps.youtube.common.fromguava.c.a(ce1);
    }

    public static final File a(Context context, String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        return new File(context.getApplicationContext().getExternalFilesDir(null), (new StringBuilder("offline")).append(File.separator).append(s).append(File.separator).append("streams").toString());
    }

    private void a(Uri uri, File file)
    {
        com.google.android.apps.youtube.common.a.c c1 = com.google.android.apps.youtube.common.a.c.a();
        c.d(uri, c1);
        a(file, (byte[])c1.get());
    }

    private void a(File file, byte abyte0[])
    {
        BufferedOutputStream bufferedoutputstream = new BufferedOutputStream(new FileOutputStream(file), 8192);
        bufferedoutputstream.write(abyte0);
        a(((OutputStream) (bufferedoutputstream)));
        return;
        file;
        abyte0 = null;
_L2:
        a(((OutputStream) (abyte0)));
        throw file;
        file;
        abyte0 = bufferedoutputstream;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static void a(OutputStream outputstream)
    {
        if (outputstream == null)
        {
            return;
        }
        try
        {
            outputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            return;
        }
    }

    private static File b(Context context, String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        return new File(context.getApplicationContext().getFilesDir(), (new StringBuilder("offline")).append(File.separator).append(s).append(File.separator).append("data").toString());
    }

    private File i(String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        if (f == null)
        {
            f = new File(b(a, b), "videos");
        }
        return new File(f, s);
    }

    private File j(String s)
    {
        if (g == null)
        {
            g = new File(b(a, b), "playlists");
        }
        return new File(g, s);
    }

    private File k(String s)
    {
        if (e == null)
        {
            e = new File(b(a, b), "channels");
        }
        return new File(e, (new StringBuilder()).append(s).append(".jpg").toString());
    }

    private File l(String s)
    {
        return new File(i(s), "thumb_small.jpg");
    }

    private File m(String s)
    {
        return new File(i(s), "thumb_large.jpg");
    }

    private File n(String s)
    {
        return new File(j(s), "thumb.jpg");
    }

    public final String a(String s, SubtitleTrack subtitletrack)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        com.google.android.apps.youtube.common.fromguava.c.a(subtitletrack);
        com.google.android.apps.youtube.common.fromguava.c.b();
        com.google.android.apps.youtube.common.a.c c1 = com.google.android.apps.youtube.common.a.c.a();
        d.b(subtitletrack, c1);
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        com.google.android.apps.youtube.common.fromguava.c.a(subtitletrack);
        s = com.google.android.apps.youtube.common.e.e.b(new File(new File(i(s), "subtitles"), (new StringBuilder()).append(subtitletrack.languageCode).append('_').append(subtitletrack.hashCode()).toString()));
        a(((File) (s)), (byte[])c1.get());
        return s.getAbsolutePath();
    }

    public final void a()
    {
        File file = b(a, b);
        if (file.exists() && file.isDirectory())
        {
            com.google.android.apps.youtube.common.e.e.a(file);
        }
        file = a(a, b);
        if (file.exists() && file.isDirectory())
        {
            com.google.android.apps.youtube.common.e.e.a(file);
        }
    }

    public final void a(Playlist playlist)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(playlist);
        com.google.android.apps.youtube.common.fromguava.c.b();
        Uri uri;
        if (playlist.sdThumbnailUri != null)
        {
            uri = playlist.sdThumbnailUri;
        } else
        {
            if (playlist.hqThumbnailUri == null)
            {
                continue;
            }
            uri = playlist.hqThumbnailUri;
        }
        do
        {
            a(uri, com.google.android.apps.youtube.common.e.e.b(n(playlist.id)));
            do
            {
                return;
            } while (playlist.thumbnailUri == null);
            uri = playlist.thumbnailUri;
        } while (true);
    }

    public final void a(Video video)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(video);
        com.google.android.apps.youtube.common.fromguava.c.b();
        Uri uri;
        Uri uri1;
        if (video.sdThumbnailUri != null)
        {
            uri = video.sdThumbnailUri;
        } else
        {
            uri = video.hqThumbnailUri;
        }
        if (video.mqThumbnailUri != null)
        {
            uri1 = video.mqThumbnailUri;
        } else
        {
            uri1 = video.defaultThumbnailUri;
        }
        if (uri != null)
        {
            a(uri, com.google.android.apps.youtube.common.e.e.b(l(video.id)));
        }
        if (uri1 != null)
        {
            a(uri1, com.google.android.apps.youtube.common.e.e.b(m(video.id)));
        }
    }

    public final void a(String s, Uri uri)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        com.google.android.apps.youtube.common.fromguava.c.a(uri);
        com.google.android.apps.youtube.common.fromguava.c.b();
        a(uri, com.google.android.apps.youtube.common.e.e.b(k(s)));
    }

    public final boolean a(String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        return k(s).exists();
    }

    public final Uri b(String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        return Uri.fromFile(k(s));
    }

    public final void c(String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        s = k(s);
        if (s.exists())
        {
            s.delete();
        }
    }

    public final Uri d(String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        return Uri.fromFile(l(s));
    }

    public final Uri e(String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        return Uri.fromFile(m(s));
    }

    public final void f(String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        s = i(s);
        if (s.exists() && s.isDirectory())
        {
            com.google.android.apps.youtube.common.e.e.a(s);
        }
    }

    public final Uri g(String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        return Uri.fromFile(n(s));
    }

    public final void h(String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        s = j(s);
        if (s.exists() && s.isDirectory())
        {
            com.google.android.apps.youtube.common.e.e.a(s);
        }
    }
}
