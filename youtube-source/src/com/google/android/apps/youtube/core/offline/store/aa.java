// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.offline.store;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.i;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.innertube.model.v;
import com.google.android.apps.youtube.datalib.legacy.model.OfflineMediaStatus;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.offline.store:
//            ae, ad, ac, ab, 
//            l

final class aa
{

    private final SQLiteDatabase a;
    private final l b;

    aa(SQLiteDatabase sqlitedatabase, l l1)
    {
        a = sqlitedatabase;
        b = l1;
    }

    static l a(aa aa1)
    {
        return aa1.b;
    }

    private int q(String s)
    {
        s = a.rawQuery("SELECT COUNT(*) FROM videos WHERE owner=?", new String[] {
            s
        });
        int i1;
        s.moveToFirst();
        i1 = s.getInt(0);
        s.close();
        return i1;
        Exception exception;
        exception;
        s.close();
        throw exception;
    }

    private int r(String s)
    {
        s = a.rawQuery("SELECT COUNT(*) FROM playlists WHERE author=?", new String[] {
            s
        });
        int i1;
        s.moveToFirst();
        i1 = s.getInt(0);
        s.close();
        return i1;
        Exception exception;
        exception;
        s.close();
        throw exception;
    }

    final List a()
    {
        Cursor cursor = a.rawQuery((new StringBuilder("SELECT ")).append(com.google.android.apps.youtube.core.utils.i.a("videos", ae.a())).append(" FROM videos").append(" INNER JOIN playlist_video").append(" ON videos").append(".id").append(" = playlist_video").append(".video_id").append(" WHERE playlist_video").append(".playlist_id").append(" IS NULL ORDER BY ").append("playlist_video.").append("saved_timestamp DESC").toString(), null);
        List list = ad.a(new ad(cursor, b));
        cursor.close();
        return list;
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    final void a(Playlist playlist, int i1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(playlist);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("id", playlist.id);
        contentvalues.put("title", playlist.title);
        contentvalues.put("summary", playlist.summary);
        contentvalues.put("author", playlist.author);
        contentvalues.put("updated_date", com.google.android.apps.youtube.core.utils.i.a(playlist.updated));
        contentvalues.put("content_uri", playlist.contentUri.toString());
        contentvalues.put("size", Integer.valueOf(playlist.size));
        contentvalues.put("saved_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentvalues.put("preferred_stream_quality", Integer.valueOf(i1));
        a.insertOrThrow("playlists", null, contentvalues);
    }

    final void a(Video video, int i1)
    {
        ContentValues contentvalues = new ContentValues();
        if (video != null)
        {
            contentvalues.put("id", video.id);
            if (video.watchUri != null)
            {
                contentvalues.put("watch_uri", video.watchUri.toString());
            }
            contentvalues.put("title", video.title);
            contentvalues.put("duration", Integer.valueOf(video.duration));
            contentvalues.put("view_count", Long.valueOf(video.viewCount));
            contentvalues.put("likes_count", Long.valueOf(video.likesCount));
            contentvalues.put("dislikes_count", Long.valueOf(video.dislikesCount));
            contentvalues.put("owner", video.owner);
            contentvalues.put("owner_display_name", video.ownerDisplayName);
            if (video.ownerUri != null)
            {
                contentvalues.put("owner_uri", video.ownerUri.toString());
            }
            contentvalues.put("upload_date", com.google.android.apps.youtube.core.utils.i.a(video.uploadedDate));
            contentvalues.put("published_date", com.google.android.apps.youtube.core.utils.i.a(video.publishedDate));
            contentvalues.put("tags", video.tags);
            contentvalues.put("description", video.description);
            contentvalues.put("state", video.state.name());
            if (video.captionTracksUri != null)
            {
                contentvalues.put("subtitle_tracks_uri", video.captionTracksUri.toString());
            }
            contentvalues.put("media_status", Integer.valueOf(OfflineMediaStatus.ACTIVE.value()));
        }
        contentvalues.put("preferred_stream_quality", Integer.valueOf(i1));
        a.insertOrThrow("videos", null, contentvalues);
    }

    final void a(String s, int i1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("preferred_stream_quality", Integer.valueOf(i1));
        long l1 = a.update("videos", contentvalues, "id = ?", new String[] {
            s
        });
        if (l1 != 1L)
        {
            throw new SQLException((new StringBuilder("Update video preferred_stream_quality affected ")).append(l1).append(" rows").toString());
        } else
        {
            return;
        }
    }

    final void a(String s, long l1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("last_playback_timestamp", Long.valueOf(l1));
        l1 = a.update("videos", contentvalues, "id = ?", new String[] {
            s
        });
        if (l1 != 1L)
        {
            throw new SQLException((new StringBuilder("Update video last_playback_timestamp affected ")).append(l1).append(" rows").toString());
        } else
        {
            return;
        }
    }

    final void a(String s, PlayerResponse playerresponse, long l1, long l2)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("player_response_proto", playerresponse.toBlob());
        playerresponse = playerresponse.getOfflineState();
        if (playerresponse != null)
        {
            playerresponse = playerresponse.f();
        } else
        {
            playerresponse = null;
        }
        if (playerresponse != null)
        {
            contentvalues.put("refresh_token", playerresponse);
        } else
        {
            contentvalues.putNull("refresh_token");
        }
        contentvalues.put("saved_timestamp", Long.valueOf(l1));
        contentvalues.put("last_refresh_timestamp", Long.valueOf(l2));
        l1 = a.update("videos", contentvalues, "id = ?", new String[] {
            s
        });
        if (l1 != 1L)
        {
            throw new SQLException((new StringBuilder("Update video player_response_proto affected ")).append(l1).append(" rows").toString());
        } else
        {
            return;
        }
    }

    final void a(String s, OfflineMediaStatus offlinemediastatus)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("media_status", Integer.valueOf(offlinemediastatus.value()));
        long l1 = a.update("videos", contentvalues, "id = ?", new String[] {
            s
        });
        if (l1 != 1L)
        {
            throw new SQLException((new StringBuilder("Update video media status affected ")).append(l1).append(" rows").toString());
        } else
        {
            return;
        }
    }

    final void a(String s, String s1, int i1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("playlist_id", s);
        contentvalues.put("video_id", s1);
        contentvalues.put("index_in_playlist", Integer.valueOf(i1));
        contentvalues.put("saved_timestamp", Long.valueOf(System.currentTimeMillis()));
        a.insertOrThrow("playlist_video", null, contentvalues);
    }

    final boolean a(String s)
    {
        return com.google.android.apps.youtube.core.utils.i.a(a, "videos", "id = ? AND media_status != ?", new String[] {
            s, Integer.toString(OfflineMediaStatus.DELETED.value())
        }) > 0L;
    }

    final List b()
    {
        Cursor cursor = a.query("playlists", ac.a(), null, null, null, null, "saved_timestamp DESC", null);
        List list = ab.a(new ab(this, cursor, (byte)0));
        cursor.close();
        return list;
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    final boolean b(String s)
    {
        return com.google.android.apps.youtube.core.utils.i.a(a, "videos", "id = ?", new String[] {
            s
        }) > 0L;
    }

    final boolean c(String s)
    {
        return com.google.android.apps.youtube.core.utils.i.a(a, "videos", "id = ? AND media_status = ?", new String[] {
            s, Integer.toString(OfflineMediaStatus.DELETED.value())
        }) > 0L;
    }

    final boolean d(String s)
    {
        return com.google.android.apps.youtube.core.utils.i.a(a, "playlist_video", "playlist_id IS NOT NULL AND video_id = ?", new String[] {
            s
        }) > 0L;
    }

    final List e(String s)
    {
        s = a.rawQuery((new StringBuilder("SELECT ")).append(com.google.android.apps.youtube.core.utils.i.a("videos", ae.a())).append(" FROM videos").append(" INNER JOIN playlist_video").append(" ON videos").append(".id").append(" = playlist_video").append(".video_id").append(" WHERE playlist_video").append(".playlist_id").append(" = ? ORDER BY ").append("playlist_video.").append("index_in_playlist ASC").toString(), new String[] {
            s
        });
        List list = ad.a(new ad(s, b));
        s.close();
        return list;
        Exception exception;
        exception;
        s.close();
        throw exception;
    }

    final Video f(String s)
    {
        s = a.query("videos", ae.a(), "id = ?", new String[] {
            s
        }, null, null, null, null);
        Video video = ad.b(new ad(s, b));
        s.close();
        return video;
        Exception exception;
        exception;
        s.close();
        throw exception;
    }

    final int g(String s)
    {
        s = a.query("videos", new String[] {
            "preferred_stream_quality"
        }, "id = ?", new String[] {
            s
        }, null, null, null, null);
        int i1;
        if (!s.moveToNext())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        i1 = s.getInt(0);
        s.close();
        return i1;
        s.close();
        return -1;
        Exception exception;
        exception;
        s.close();
        throw exception;
    }

    final Playlist h(String s)
    {
        s = a.query("playlists", ac.a(), "id = ?", new String[] {
            s
        }, null, null, null, null);
        Playlist playlist = ab.b(new ab(this, s, (byte)0));
        s.close();
        return playlist;
        Exception exception;
        exception;
        s.close();
        throw exception;
    }

    final int i(String s)
    {
        s = a.query("playlists", new String[] {
            "preferred_stream_quality"
        }, "id = ?", new String[] {
            s
        }, null, null, null, null);
        int i1;
        if (!s.moveToNext())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        i1 = s.getInt(0);
        s.close();
        return i1;
        s.close();
        return -1;
        Exception exception;
        exception;
        s.close();
        throw exception;
    }

    final List j(String s)
    {
        Object obj;
        obj = new LinkedList();
        s = a.query("videos", new String[] {
            "id"
        }, "refresh_token = ?", new String[] {
            s
        }, null, null, null, null);
        while (s.moveToNext()) 
        {
            ((LinkedList) (obj)).add(s.getString(0));
        }
        break MISSING_BLOCK_LABEL_75;
        obj;
        s.close();
        throw obj;
        s.close();
        return ((List) (obj));
    }

    final void k(String s)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.putNull("playlist_id");
        contentvalues.put("video_id", s);
        contentvalues.put("saved_timestamp", Long.valueOf(System.currentTimeMillis()));
        a.insertOrThrow("playlist_video", null, contentvalues);
    }

    final void l(String s)
    {
        a.delete("playlist_video", "playlist_id IS NULL AND video_id = ?", new String[] {
            s
        });
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("media_status", Integer.valueOf(OfflineMediaStatus.DELETED.value()));
        contentvalues.putNull("player_response_proto");
        contentvalues.putNull("refresh_token");
        contentvalues.putNull("saved_timestamp");
        contentvalues.putNull("last_refresh_timestamp");
        contentvalues.putNull("last_playback_timestamp");
        long l1 = a.update("videos", contentvalues, "id = ?", new String[] {
            s
        });
        if (l1 != 1L)
        {
            throw new SQLException((new StringBuilder("Update video offline_playability_state affected ")).append(l1).append(" rows").toString());
        } else
        {
            return;
        }
    }

    final void m(String s)
    {
        long l1 = a.delete("videos", "id = ?", new String[] {
            s
        });
        if (l1 != 1L)
        {
            throw new SQLException((new StringBuilder("Delete video affected ")).append(l1).append(" rows").toString());
        } else
        {
            a.delete("playlist_video", "video_id = ?", new String[] {
                s
            });
            return;
        }
    }

    final void n(String s)
    {
        long l1 = a.delete("playlists", "id = ?", new String[] {
            s
        });
        if (l1 != 1L)
        {
            throw new SQLException((new StringBuilder("Delete playlist affected ")).append(l1).append(" rows").toString());
        } else
        {
            return;
        }
    }

    final void o(String s)
    {
        a.delete("playlist_video", "playlist_id = ?", new String[] {
            s
        });
    }

    final boolean p(String s)
    {
        return q(s) > 0 || r(s) > 0;
    }
}
