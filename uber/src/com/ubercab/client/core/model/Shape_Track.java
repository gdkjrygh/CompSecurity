// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.ubercab.client.core.model:
//            Track, Album

public final class Shape_Track extends Track
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Track createFromParcel(Parcel parcel)
        {
            return new Shape_Track(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Track[] newArray(int i)
        {
            return new Track[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_Track.getClassLoader();
    private static final Set SHAPE_PROPERTIES;
    private Album album;
    private List artists;
    private int duration_in_seconds;
    private String external_uri;
    private String id;
    private int index_in_playlist;
    private String name;
    private String playback_uri;

    Shape_Track()
    {
    }

    private Shape_Track(Parcel parcel)
    {
        album = (Album)parcel.readValue(PARCELABLE_CL);
        artists = (List)parcel.readValue(PARCELABLE_CL);
        duration_in_seconds = ((Integer)parcel.readValue(PARCELABLE_CL)).intValue();
        external_uri = (String)parcel.readValue(PARCELABLE_CL);
        id = (String)parcel.readValue(PARCELABLE_CL);
        index_in_playlist = ((Integer)parcel.readValue(PARCELABLE_CL)).intValue();
        name = (String)parcel.readValue(PARCELABLE_CL);
        playback_uri = (String)parcel.readValue(PARCELABLE_CL);
    }


    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Track)obj;
            if (((Track) (obj)).getAlbum() == null ? getAlbum() != null : !((Track) (obj)).getAlbum().equals(getAlbum()))
            {
                return false;
            }
            if (((Track) (obj)).getArtists() == null ? getArtists() != null : !((Track) (obj)).getArtists().equals(getArtists()))
            {
                return false;
            }
            if (((Track) (obj)).getDurationInSeconds() != getDurationInSeconds())
            {
                return false;
            }
            if (((Track) (obj)).getExternalUri() == null ? getExternalUri() != null : !((Track) (obj)).getExternalUri().equals(getExternalUri()))
            {
                return false;
            }
            if (((Track) (obj)).getId() == null ? getId() != null : !((Track) (obj)).getId().equals(getId()))
            {
                return false;
            }
            if (((Track) (obj)).getIndexInPlaylist() != getIndexInPlaylist())
            {
                return false;
            }
            if (((Track) (obj)).getName() == null ? getName() != null : !((Track) (obj)).getName().equals(getName()))
            {
                return false;
            }
            if (((Track) (obj)).getPlaybackUri() == null ? getPlaybackUri() != null : !((Track) (obj)).getPlaybackUri().equals(getPlaybackUri()))
            {
                return false;
            }
        }
        return true;
    }

    public final Album getAlbum()
    {
        return (Album)onGet(Property.ALBUM, album);
    }

    public final List getArtists()
    {
        return (List)onGet(Property.ARTISTS, artists);
    }

    public final int getDurationInSeconds()
    {
        return ((Integer)onGet(Property.DURATION_IN_SECONDS, Integer.valueOf(duration_in_seconds))).intValue();
    }

    public final String getExternalUri()
    {
        return (String)onGet(Property.EXTERNAL_URI, external_uri);
    }

    public final String getId()
    {
        return (String)onGet(Property.ID, id);
    }

    public final int getIndexInPlaylist()
    {
        return ((Integer)onGet(Property.INDEX_IN_PLAYLIST, Integer.valueOf(index_in_playlist))).intValue();
    }

    public final String getName()
    {
        return (String)onGet(Property.NAME, name);
    }

    public final String getPlaybackUri()
    {
        return (String)onGet(Property.PLAYBACK_URI, playback_uri);
    }

    public final int hashCode()
    {
        int j1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int k1;
        int l1;
        if (album == null)
        {
            i = 0;
        } else
        {
            i = album.hashCode();
        }
        if (artists == null)
        {
            j = 0;
        } else
        {
            j = artists.hashCode();
        }
        k1 = duration_in_seconds;
        if (external_uri == null)
        {
            k = 0;
        } else
        {
            k = external_uri.hashCode();
        }
        if (id == null)
        {
            l = 0;
        } else
        {
            l = id.hashCode();
        }
        l1 = index_in_playlist;
        if (name == null)
        {
            i1 = 0;
        } else
        {
            i1 = name.hashCode();
        }
        if (playback_uri != null)
        {
            j1 = playback_uri.hashCode();
        }
        return (i1 ^ ((l ^ (k ^ ((j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243 ^ k1) * 0xf4243) * 0xf4243) * 0xf4243 ^ l1) * 0xf4243) * 0xf4243 ^ j1;
    }

    final Track setAlbum(Album album1)
    {
        Album album2 = album;
        album = (Album)beforeSet(Property.ALBUM, album2, album1);
        afterSet(Property.ALBUM, album2, album1);
        return this;
    }

    final Track setArtists(List list)
    {
        List list1 = artists;
        artists = (List)beforeSet(Property.ARTISTS, list1, list);
        afterSet(Property.ARTISTS, list1, list);
        return this;
    }

    final Track setDurationInSeconds(int i)
    {
        int j = duration_in_seconds;
        duration_in_seconds = ((Integer)beforeSet(Property.DURATION_IN_SECONDS, Integer.valueOf(j), Integer.valueOf(i))).intValue();
        afterSet(Property.DURATION_IN_SECONDS, Integer.valueOf(j), Integer.valueOf(i));
        return this;
    }

    final Track setExternalUri(String s)
    {
        String s1 = external_uri;
        external_uri = (String)beforeSet(Property.EXTERNAL_URI, s1, s);
        afterSet(Property.EXTERNAL_URI, s1, s);
        return this;
    }

    final Track setId(String s)
    {
        String s1 = id;
        id = (String)beforeSet(Property.ID, s1, s);
        afterSet(Property.ID, s1, s);
        return this;
    }

    final Track setIndexInPlaylist(int i)
    {
        int j = index_in_playlist;
        index_in_playlist = ((Integer)beforeSet(Property.INDEX_IN_PLAYLIST, Integer.valueOf(j), Integer.valueOf(i))).intValue();
        afterSet(Property.INDEX_IN_PLAYLIST, Integer.valueOf(j), Integer.valueOf(i));
        return this;
    }

    final Track setName(String s)
    {
        String s1 = name;
        name = (String)beforeSet(Property.NAME, s1, s);
        afterSet(Property.NAME, s1, s);
        return this;
    }

    final Track setPlaybackUri(String s)
    {
        String s1 = playback_uri;
        playback_uri = (String)beforeSet(Property.PLAYBACK_URI, s1, s);
        afterSet(Property.PLAYBACK_URI, s1, s);
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("Track{album=")).append(album).append(", artists=").append(artists).append(", duration_in_seconds=").append(duration_in_seconds).append(", external_uri=").append(external_uri).append(", id=").append(id).append(", index_in_playlist=").append(index_in_playlist).append(", name=").append(name).append(", playback_uri=").append(playback_uri).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(album);
        parcel.writeValue(artists);
        parcel.writeValue(Integer.valueOf(duration_in_seconds));
        parcel.writeValue(external_uri);
        parcel.writeValue(id);
        parcel.writeValue(Integer.valueOf(index_in_playlist));
        parcel.writeValue(name);
        parcel.writeValue(playback_uri);
    }

    static 
    {
        SHAPE_PROPERTIES = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Property[] {
            Property.ALBUM, Property.ARTISTS, Property.DURATION_IN_SECONDS, Property.EXTERNAL_URI, Property.ID, Property.INDEX_IN_PLAYLIST, Property.NAME, Property.PLAYBACK_URI
        })));
    }

    private class Property extends Enum
        implements hny
    {

        private static final Property $VALUES[];
        public static final Property ALBUM;
        public static final Property ARTISTS;
        public static final Property DURATION_IN_SECONDS;
        public static final Property EXTERNAL_URI;
        public static final Property ID;
        public static final Property INDEX_IN_PLAYLIST;
        public static final Property NAME;
        public static final Property PLAYBACK_URI;

        public static Property valueOf(String s)
        {
            return (Property)Enum.valueOf(com/ubercab/client/core/model/Shape_Track$Property, s);
        }

        public static Property[] values()
        {
            return (Property[])$VALUES.clone();
        }

        static 
        {
            ALBUM = new Property("ALBUM", 0) {

                public final String toString()
                {
                    return "album";
                }

            };
            ARTISTS = new Property("ARTISTS", 1) {

                public final String toString()
                {
                    return "artists";
                }

            };
            DURATION_IN_SECONDS = new Property("DURATION_IN_SECONDS", 2) {

                public final String toString()
                {
                    return "duration_in_seconds";
                }

            };
            EXTERNAL_URI = new Property("EXTERNAL_URI", 3) {

                public final String toString()
                {
                    return "external_uri";
                }

            };
            ID = new Property("ID", 4) {

                public final String toString()
                {
                    return "id";
                }

            };
            INDEX_IN_PLAYLIST = new Property("INDEX_IN_PLAYLIST", 5) {

                public final String toString()
                {
                    return "index_in_playlist";
                }

            };
            NAME = new Property("NAME", 6) {

                public final String toString()
                {
                    return "name";
                }

            };
            PLAYBACK_URI = new Property("PLAYBACK_URI", 7) {

                public final String toString()
                {
                    return "playback_uri";
                }

            };
            $VALUES = (new Property[] {
                ALBUM, ARTISTS, DURATION_IN_SECONDS, EXTERNAL_URI, ID, INDEX_IN_PLAYLIST, NAME, PLAYBACK_URI
            });
        }

        private Property(String s, int i)
        {
            super(s, i);
        }

    }

}
