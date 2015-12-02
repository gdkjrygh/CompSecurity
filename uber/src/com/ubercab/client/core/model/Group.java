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
//            Shape_Group, Playlist

public abstract class Group extends hnx
    implements Parcelable
{

    public Group()
    {
    }

    public static Group create()
    {
        return new Shape_Group();
    }

    public static transient Group create(String s, String s1, Playlist aplaylist[])
    {
        return (new Shape_Group()).setName(s).setType(s1).setPlaylists(Arrays.asList(aplaylist)).setPlaylistsCount(aplaylist.length);
    }

    public abstract List getGroups();

    public abstract int getGroupsCount();

    public abstract List getImages();

    public abstract int getImagesCount();

    public abstract String getName();

    public abstract String getPlaybackUri();

    public abstract List getPlaylists();

    public abstract int getPlaylistsCount();

    public abstract String getStationUri();

    public abstract String getType();

    protected Object onGet(hny hny, Object obj)
    {
        if (obj != null)
        {
            return obj;
        }
        class _cls1
        {

            static final int $SwitchMap$com$ubercab$client$core$model$Shape_Group$Property[];

            static 
            {
                $SwitchMap$com$ubercab$client$core$model$Shape_Group$Property = new int[Shape_Group.Property.values().length];
                try
                {
                    $SwitchMap$com$ubercab$client$core$model$Shape_Group$Property[Shape_Group.Property.PLAYLISTS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$ubercab$client$core$model$Shape_Group$Property[Shape_Group.Property.GROUPS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$ubercab$client$core$model$Shape_Group$Property[Shape_Group.Property.IMAGES.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.ubercab.client.core.model.Shape_Group.Property[((Shape_Group.Property)hny).ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return Collections.emptyList();
        }
    }

    abstract Group setGroups(List list);

    abstract Group setGroupsCount(int i);

    abstract Group setImages(List list);

    abstract Group setImagesCount(int i);

    abstract Group setName(String s);

    abstract Group setPlaybackUri(String s);

    abstract Group setPlaylists(List list);

    abstract Group setPlaylistsCount(int i);

    abstract Group setStationUri(String s);

    abstract Group setType(String s);
}
