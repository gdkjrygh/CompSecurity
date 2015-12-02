// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;
import hnx;
import hny;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_Track, Album, Artist

public abstract class Track extends hnx
    implements Parcelable
{

    public Track()
    {
    }

    public static transient Track create(String s, Album album, int i, Artist aartist[])
    {
        return (new Shape_Track()).setName(s).setAlbum(album).setIndexInPlaylist(i).setArtists(Arrays.asList(aartist));
    }

    public abstract Album getAlbum();

    public abstract List getArtists();

    public abstract int getDurationInSeconds();

    public abstract String getExternalUri();

    public abstract String getId();

    public abstract int getIndexInPlaylist();

    public abstract String getName();

    public abstract String getPlaybackUri();

    protected Object onGet(hny hny, Object obj)
    {
        if (obj != null)
        {
            return obj;
        }
        class _cls1
        {

            static final int $SwitchMap$com$ubercab$client$core$model$Shape_Track$Property[];

            static 
            {
                $SwitchMap$com$ubercab$client$core$model$Shape_Track$Property = new int[Shape_Track.Property.values().length];
                try
                {
                    $SwitchMap$com$ubercab$client$core$model$Shape_Track$Property[Shape_Track.Property.ARTISTS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        switch (_cls1..SwitchMap.com.ubercab.client.core.model.Shape_Track.Property[((Shape_Track.Property)hny).ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return Collections.emptyList();
        }
    }

    abstract Track setAlbum(Album album);

    abstract Track setArtists(List list);

    abstract Track setDurationInSeconds(int i);

    abstract Track setExternalUri(String s);

    abstract Track setId(String s);

    abstract Track setIndexInPlaylist(int i);

    abstract Track setName(String s);

    abstract Track setPlaybackUri(String s);
}
