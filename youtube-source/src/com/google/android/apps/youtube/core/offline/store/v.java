// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.offline.store;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.offline.store:
//            w

public final class v
{

    static final String a[] = {
        "video_id", "language_code", "source_language_code", "language_name", "track_name", "format", "subtitles_path", "track_vss_id"
    };
    private final SQLiteDatabase b;

    v(SQLiteDatabase sqlitedatabase)
    {
        b = sqlitedatabase;
    }

    final List a(String s)
    {
        s = b.query("subtitles", a, "video_id = ?", new String[] {
            s
        }, null, null, null, null);
        List list = w.a(new w(s, (byte)0));
        s.close();
        return list;
        Exception exception;
        exception;
        s.close();
        throw exception;
    }

    final void a(SubtitleTrack subtitletrack)
    {
        SQLiteDatabase sqlitedatabase = b;
        c.a(subtitletrack);
        c.a(subtitletrack.offlineSubtitlesPath);
        ContentValues contentvalues = new ContentValues();
        if (subtitletrack != null)
        {
            contentvalues.put("video_id", subtitletrack.videoId);
            contentvalues.put("language_code", subtitletrack.languageCode);
            contentvalues.put("source_language_code", subtitletrack.sourceLanguageCode);
            contentvalues.put("language_name", subtitletrack.languageName);
            contentvalues.put("track_name", subtitletrack.trackName);
            contentvalues.put("format", Integer.valueOf(subtitletrack.format));
            contentvalues.put("subtitles_path", subtitletrack.offlineSubtitlesPath);
            contentvalues.put("track_vss_id", subtitletrack.vssId);
        }
        if (sqlitedatabase.insert("subtitles", null, contentvalues) == -1L)
        {
            throw new SQLException("Error inserting subtitle track");
        } else
        {
            return;
        }
    }

    final void b(String s)
    {
        b.delete("subtitles", "video_id = ?", new String[] {
            s
        });
    }

}
