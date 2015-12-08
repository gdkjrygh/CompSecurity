// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.offline.store;

import android.database.Cursor;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.legacy.model.OfflineMediaStatus;
import com.google.android.apps.youtube.datalib.legacy.model.u;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.core.offline.store:
//            ad, x, z, i, 
//            l

final class k
{

    final i a;
    private final Cursor b;
    private final ad c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;

    private k(i j, Cursor cursor, l l)
    {
        a = j;
        super();
        b = (Cursor)com.google.android.apps.youtube.common.fromguava.c.a(cursor);
        c = new ad(cursor, l);
        d = cursor.getColumnIndexOrThrow("player_response_proto");
        e = cursor.getColumnIndexOrThrow("saved_timestamp");
        f = cursor.getColumnIndexOrThrow("last_refresh_timestamp");
        g = cursor.getColumnIndexOrThrow("last_playback_timestamp");
        h = cursor.getColumnIndexOrThrow("media_status");
    }

    k(i j, Cursor cursor, l l, byte byte0)
    {
        this(j, cursor, l);
    }

    static void a(k k1, x x1)
    {
        do
        {
            if (!k1.b.moveToNext())
            {
                break;
            }
            Object obj = k1.c.a();
            x1.a(((Video) (obj)));
            if (!k1.b.isNull(k1.d))
            {
                PlayerResponse playerresponse = PlayerResponse.fromBlob(k1.b.getBlob(k1.d), 0L);
                if (playerresponse != null)
                {
                    z z1 = x1.a(((Video) (obj)).id);
                    z1.a(playerresponse, k1.b.getLong(k1.e), k1.b.getLong(k1.f));
                    if (!k1.b.isNull(k1.g))
                    {
                        z1.a(k1.b.getLong(k1.g));
                    }
                    if (!k1.b.isNull(k1.h))
                    {
                        z1.a(OfflineMediaStatus.fromValue(k1.b.getInt(k1.h)));
                        obj = k1.a.a(((Video) (obj)).id, null);
                        z1.a(((u) (obj)).f(), ((u) (obj)).g());
                    }
                }
            }
        } while (true);
    }
}
