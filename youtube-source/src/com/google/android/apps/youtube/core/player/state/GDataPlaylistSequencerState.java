// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.state;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;

// Referenced classes of package com.google.android.apps.youtube.core.player.state:
//            VideoIdsSequencerState, a

public class GDataPlaylistSequencerState extends VideoIdsSequencerState
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    public final GDataRequest nextPageRequest;
    public final String playlistId;

    public GDataPlaylistSequencerState(Parcel parcel)
    {
        super(parcel);
        Object obj = (Uri)parcel.readParcelable(getClass().getClassLoader());
        if (obj != null)
        {
            obj = GDataRequest.a(((Uri) (obj)));
        } else
        {
            obj = null;
        }
        nextPageRequest = ((GDataRequest) (obj));
        playlistId = parcel.readString();
    }

    public GDataPlaylistSequencerState(String as[], byte abyte0[], String s, int i, int j, PlaybackPair playbackpair, GDataRequest gdatarequest, 
            String s1, boolean flag)
    {
        super(as, abyte0, s, i, j, playbackpair, flag);
        playlistId = (String)c.a(s1);
        nextPageRequest = gdatarequest;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        Uri uri;
        if (nextPageRequest != null)
        {
            uri = nextPageRequest.a;
        } else
        {
            uri = null;
        }
        parcel.writeParcelable(uri, 0);
        parcel.writeString(playlistId);
    }

}
