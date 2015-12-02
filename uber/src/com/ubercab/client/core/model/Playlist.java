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
//            Shape_Playlist, Track

public abstract class Playlist extends hnx
    implements Parcelable
{

    public Playlist()
    {
    }

    public static Playlist create()
    {
        return new Shape_Playlist();
    }

    public static transient Playlist create(String s, String s1, List list, Track atrack[])
    {
        return (new Shape_Playlist()).setKey(s).setName(s1).setImages(list).setTracks(Arrays.asList(atrack)).setTracksCount(atrack.length);
    }

    public abstract String getExternalUri();

    public abstract List getImages();

    public abstract String getKey();

    public abstract String getName();

    public abstract String getPlaybackUri();

    public abstract List getTracks();

    public abstract int getTracksCount();

    public abstract String getType();

    protected Object onGet(hny hny, Object obj)
    {
        if (obj != null)
        {
            return obj;
        }
        class _cls1
        {

            static final int $SwitchMap$com$ubercab$client$core$model$Shape_Playlist$Property[];

            static 
            {
                $SwitchMap$com$ubercab$client$core$model$Shape_Playlist$Property = new int[Shape_Playlist.Property.values().length];
                try
                {
                    $SwitchMap$com$ubercab$client$core$model$Shape_Playlist$Property[Shape_Playlist.Property.IMAGES.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$ubercab$client$core$model$Shape_Playlist$Property[Shape_Playlist.Property.TRACKS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.ubercab.client.core.model.Shape_Playlist.Property[((Shape_Playlist.Property)hny).ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
            return Collections.emptyList();
        }
    }

    abstract Playlist setExternalUri(String s);

    abstract Playlist setImages(List list);

    abstract Playlist setKey(String s);

    abstract Playlist setName(String s);

    public abstract Playlist setPlaybackUri(String s);

    abstract Playlist setTracks(List list);

    abstract Playlist setTracksCount(int i);

    abstract Playlist setType(String s);
}
