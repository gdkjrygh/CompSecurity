// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import android.util.Pair;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.offline.exception.OfflinePlaybackException;
import com.google.android.apps.youtube.core.offline.exception.OfflinePolicyException;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.player.event.PlaybackServiceException;
import com.google.android.apps.youtube.core.utils.Util;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.util.List;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            j, r, n, l, 
//            m

class k
    implements Runnable
{

    protected volatile boolean a;
    final j b;
    private final int c;

    public k(j j1, int i)
    {
        b = j1;
        super();
        c = i;
    }

    static void a(k k1)
    {
        k1.a = true;
    }

    static void a(k k1, PlaybackPair playbackpair)
    {
        if (!k1.a)
        {
            k1.b.h = playbackpair;
            if (!k1.b.g.isOrPast(PlaybackSequencer.SequencerStage.VIDEO_PLAYBACK_LOADED))
            {
                k1.b.a(PlaybackSequencer.SequencerStage.VIDEO_PLAYBACK_LOADED);
            }
            k1.b.b.a(playbackpair);
        }
    }

    static void a(k k1, Exception exception)
    {
        if (!k1.a)
        {
            k1.b();
            j j1 = k1.b;
            Object obj = k1.b;
            obj = com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.REQUEST_FAILED;
            Throwable throwable = Util.a(exception);
            if ((throwable instanceof OfflinePolicyException) || (throwable instanceof OfflinePlaybackException))
            {
                obj = com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.NO_STREAMS;
            }
            j1.a(new PlaybackServiceException(((com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason) (obj)), false, k1.b.e.a(exception), exception));
        }
    }

    private void a(Exception exception)
    {
        j.d(b).execute(new n(this, exception));
    }

    static void b(k k1)
    {
        if (!k1.a)
        {
            k1.b.a(PlaybackSequencer.SequencerStage.SEQUENCE_EMPTY);
        }
    }

    protected final void a()
    {
        if (j.b(b) == null)
        {
            Pair pair = b.t();
            j.a(b, (Playlist)pair.first);
            j.a(b, (List)pair.second);
            int i = j.b(b).size();
            j.a(b, new int[i]);
            if (b.k)
            {
                j.c(b);
            }
        }
        if (j.b(b).isEmpty())
        {
            j.d(b).execute(new l(this));
        }
    }

    protected void a(int i)
    {
        a();
        b(i);
    }

    protected final void b()
    {
        j.a(b, c);
    }

    protected final boolean b(int i)
    {
        Object obj;
        if (i >= j.b(b).size() || i < 0)
        {
            return false;
        }
        obj = ((Video)j.b(b).get(i)).id;
        obj = j.e(b).k(((String) (obj)));
        if (obj == null)
        {
            try
            {
                throw new com.google.android.apps.youtube.core.offline.exception.OfflinePlaybackException.OfflineNoMediaException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                a(((Exception) (obj)));
                return false;
            }
            catch (OfflinePlaybackException offlineplaybackexception)
            {
                a(offlineplaybackexception);
            }
            break MISSING_BLOCK_LABEL_105;
        }
        j.d(b).execute(new m(this, ((PlaybackPair) (obj))));
        return true;
        return false;
    }

    public final void run()
    {
        int i = c;
        if (b.k)
        {
            i = j.a(b)[c];
        }
        a(i);
    }
}
