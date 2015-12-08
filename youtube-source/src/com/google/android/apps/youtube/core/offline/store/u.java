// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.offline.store;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.google.a.a.a.a.fj;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.core.utils.i;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;
import com.google.android.apps.youtube.datalib.legacy.model.t;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.c;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.offline.store:
//            t

final class u
{

    static final String a[] = {
        "video_id", "itag", "format_stream_proto", "duration_millis", "audio_only", "bytes_transferred", "bytes_total"
    };
    private final SQLiteDatabase b;

    u(SQLiteDatabase sqlitedatabase)
    {
        b = sqlitedatabase;
    }

    private static List a(Cursor cursor, com.google.android.apps.youtube.core.offline.store.t t1)
    {
        LinkedList linkedlist;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        linkedlist = new LinkedList();
        j = cursor.getColumnIndexOrThrow("video_id");
        k = cursor.getColumnIndexOrThrow("itag");
        l = cursor.getColumnIndexOrThrow("format_stream_proto");
        i1 = cursor.getColumnIndexOrThrow("duration_millis");
        j1 = cursor.getColumnIndexOrThrow("audio_only");
        k1 = cursor.getColumnIndexOrThrow("bytes_total");
        l1 = cursor.getColumnIndexOrThrow("bytes_transferred");
_L2:
        String s;
        int i2;
        long l2;
        if (!cursor.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = cursor.getString(j);
        i2 = cursor.getInt(k);
        l2 = cursor.getLong(k1);
        fj fj1;
        fj1 = new fj();
        c.a(fj1, cursor.getBlob(l));
        if (t1 == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        fj1.c = t1.a(s, i2, l2, fj1.l).toString();
        linkedlist.add(new t(new FormatStream(fj1, s, cursor.getLong(i1)), i.a(cursor, j1, false), cursor.getLong(l1)));
        continue; /* Loop/switch isn't completed */
        InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception;
        invalidprotocolbuffernanoexception;
        L.a((new StringBuilder("Error reading stream for video ")).append(s).toString(), invalidprotocolbuffernanoexception);
        if (true) goto _L2; else goto _L1
_L1:
        return linkedlist;
    }

    final com.google.android.apps.youtube.datalib.legacy.model.u a(String s, com.google.android.apps.youtube.core.offline.store.t t1)
    {
        s = b.query("streams", a, "video_id = ?", new String[] {
            s
        }, null, null, null, null);
        t1 = new com.google.android.apps.youtube.datalib.legacy.model.u(a(((Cursor) (s)), t1));
        s.close();
        return t1;
        t1;
        s.close();
        throw t1;
    }

    final void a(FormatStream formatstream, boolean flag)
    {
        formatstream = new t(formatstream, flag);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("video_id", formatstream.b());
        contentvalues.put("itag", Integer.valueOf(formatstream.c()));
        contentvalues.put("format_stream_proto", c.a(formatstream.a().getFormatStreamProto()));
        contentvalues.put("duration_millis", Long.valueOf(formatstream.a().getVideoDurationMillis()));
        contentvalues.put("audio_only", i.a(formatstream.d()));
        contentvalues.put("bytes_total", Long.valueOf(formatstream.f()));
        contentvalues.put("bytes_transferred", Long.valueOf(formatstream.e()));
        b.insertOrThrow("streams", null, contentvalues);
    }

    final void a(String s)
    {
        b.delete("streams", "video_id = ?", new String[] {
            s
        });
    }

    final void a(String s, int j)
    {
        long l = b.delete("streams", "video_id = ? AND itag = ?", new String[] {
            s, Integer.toString(j)
        });
        if (l != 1L)
        {
            throw new SQLException((new StringBuilder("Delete stream affected ")).append(l).append(" rows").toString());
        } else
        {
            return;
        }
    }

    final void a(String s, int j, long l)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("bytes_transferred", Long.valueOf(l));
        l = b.update("streams", contentvalues, "video_id = ? AND itag = ?", new String[] {
            s, Integer.toString(j)
        });
        if (l != 1L)
        {
            throw new SQLException((new StringBuilder("Update stream bytes_transferred affected ")).append(l).append(" rows").toString());
        } else
        {
            return;
        }
    }

}
