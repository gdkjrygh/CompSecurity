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
//            Playlist

public final class Shape_Playlist extends Playlist
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Playlist createFromParcel(Parcel parcel)
        {
            return new Shape_Playlist(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Playlist[] newArray(int i)
        {
            return new Playlist[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_Playlist.getClassLoader();
    private static final Set SHAPE_PROPERTIES;
    private String external_uri;
    private List images;
    private String key;
    private String name;
    private String playback_uri;
    private List tracks;
    private int tracks_count;
    private String type;

    Shape_Playlist()
    {
    }

    private Shape_Playlist(Parcel parcel)
    {
        external_uri = (String)parcel.readValue(PARCELABLE_CL);
        images = (List)parcel.readValue(PARCELABLE_CL);
        key = (String)parcel.readValue(PARCELABLE_CL);
        name = (String)parcel.readValue(PARCELABLE_CL);
        playback_uri = (String)parcel.readValue(PARCELABLE_CL);
        tracks_count = ((Integer)parcel.readValue(PARCELABLE_CL)).intValue();
        tracks = (List)parcel.readValue(PARCELABLE_CL);
        type = (String)parcel.readValue(PARCELABLE_CL);
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
            obj = (Playlist)obj;
            if (((Playlist) (obj)).getExternalUri() == null ? getExternalUri() != null : !((Playlist) (obj)).getExternalUri().equals(getExternalUri()))
            {
                return false;
            }
            if (((Playlist) (obj)).getImages() == null ? getImages() != null : !((Playlist) (obj)).getImages().equals(getImages()))
            {
                return false;
            }
            if (((Playlist) (obj)).getKey() == null ? getKey() != null : !((Playlist) (obj)).getKey().equals(getKey()))
            {
                return false;
            }
            if (((Playlist) (obj)).getName() == null ? getName() != null : !((Playlist) (obj)).getName().equals(getName()))
            {
                return false;
            }
            if (((Playlist) (obj)).getPlaybackUri() == null ? getPlaybackUri() != null : !((Playlist) (obj)).getPlaybackUri().equals(getPlaybackUri()))
            {
                return false;
            }
            if (((Playlist) (obj)).getTracksCount() != getTracksCount())
            {
                return false;
            }
            if (((Playlist) (obj)).getTracks() == null ? getTracks() != null : !((Playlist) (obj)).getTracks().equals(getTracks()))
            {
                return false;
            }
            if (((Playlist) (obj)).getType() == null ? getType() != null : !((Playlist) (obj)).getType().equals(getType()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getExternalUri()
    {
        return (String)onGet(Property.EXTERNAL_URI, external_uri);
    }

    public final List getImages()
    {
        return (List)onGet(Property.IMAGES, images);
    }

    public final String getKey()
    {
        return (String)onGet(Property.KEY, key);
    }

    public final String getName()
    {
        return (String)onGet(Property.NAME, name);
    }

    public final String getPlaybackUri()
    {
        return (String)onGet(Property.PLAYBACK_URI, playback_uri);
    }

    public final List getTracks()
    {
        return (List)onGet(Property.TRACKS, tracks);
    }

    public final int getTracksCount()
    {
        return ((Integer)onGet(Property.TRACKS_COUNT, Integer.valueOf(tracks_count))).intValue();
    }

    public final String getType()
    {
        return (String)onGet(Property.TYPE, type);
    }

    public final int hashCode()
    {
        int k1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int l1;
        if (external_uri == null)
        {
            i = 0;
        } else
        {
            i = external_uri.hashCode();
        }
        if (images == null)
        {
            j = 0;
        } else
        {
            j = images.hashCode();
        }
        if (key == null)
        {
            k = 0;
        } else
        {
            k = key.hashCode();
        }
        if (name == null)
        {
            l = 0;
        } else
        {
            l = name.hashCode();
        }
        if (playback_uri == null)
        {
            i1 = 0;
        } else
        {
            i1 = playback_uri.hashCode();
        }
        l1 = tracks_count;
        if (tracks == null)
        {
            j1 = 0;
        } else
        {
            j1 = tracks.hashCode();
        }
        if (type != null)
        {
            k1 = type.hashCode();
        }
        return (j1 ^ ((i1 ^ (l ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ l1) * 0xf4243) * 0xf4243 ^ k1;
    }

    final Playlist setExternalUri(String s)
    {
        String s1 = external_uri;
        external_uri = (String)beforeSet(Property.EXTERNAL_URI, s1, s);
        afterSet(Property.EXTERNAL_URI, s1, s);
        return this;
    }

    final Playlist setImages(List list)
    {
        List list1 = images;
        images = (List)beforeSet(Property.IMAGES, list1, list);
        afterSet(Property.IMAGES, list1, list);
        return this;
    }

    final Playlist setKey(String s)
    {
        String s1 = key;
        key = (String)beforeSet(Property.KEY, s1, s);
        afterSet(Property.KEY, s1, s);
        return this;
    }

    final Playlist setName(String s)
    {
        String s1 = name;
        name = (String)beforeSet(Property.NAME, s1, s);
        afterSet(Property.NAME, s1, s);
        return this;
    }

    public final Playlist setPlaybackUri(String s)
    {
        String s1 = playback_uri;
        playback_uri = (String)beforeSet(Property.PLAYBACK_URI, s1, s);
        afterSet(Property.PLAYBACK_URI, s1, s);
        return this;
    }

    final Playlist setTracks(List list)
    {
        List list1 = tracks;
        tracks = (List)beforeSet(Property.TRACKS, list1, list);
        afterSet(Property.TRACKS, list1, list);
        return this;
    }

    final Playlist setTracksCount(int i)
    {
        int j = tracks_count;
        tracks_count = ((Integer)beforeSet(Property.TRACKS_COUNT, Integer.valueOf(j), Integer.valueOf(i))).intValue();
        afterSet(Property.TRACKS_COUNT, Integer.valueOf(j), Integer.valueOf(i));
        return this;
    }

    final Playlist setType(String s)
    {
        String s1 = type;
        type = (String)beforeSet(Property.TYPE, s1, s);
        afterSet(Property.TYPE, s1, s);
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("Playlist{external_uri=")).append(external_uri).append(", images=").append(images).append(", key=").append(key).append(", name=").append(name).append(", playback_uri=").append(playback_uri).append(", tracks_count=").append(tracks_count).append(", tracks=").append(tracks).append(", type=").append(type).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(external_uri);
        parcel.writeValue(images);
        parcel.writeValue(key);
        parcel.writeValue(name);
        parcel.writeValue(playback_uri);
        parcel.writeValue(Integer.valueOf(tracks_count));
        parcel.writeValue(tracks);
        parcel.writeValue(type);
    }

    static 
    {
        SHAPE_PROPERTIES = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Property[] {
            Property.EXTERNAL_URI, Property.IMAGES, Property.KEY, Property.NAME, Property.PLAYBACK_URI, Property.TRACKS_COUNT, Property.TRACKS, Property.TYPE
        })));
    }

    private class Property extends Enum
        implements hny
    {

        private static final Property $VALUES[];
        public static final Property EXTERNAL_URI;
        public static final Property IMAGES;
        public static final Property KEY;
        public static final Property NAME;
        public static final Property PLAYBACK_URI;
        public static final Property TRACKS;
        public static final Property TRACKS_COUNT;
        public static final Property TYPE;

        public static Property valueOf(String s)
        {
            return (Property)Enum.valueOf(com/ubercab/client/core/model/Shape_Playlist$Property, s);
        }

        public static Property[] values()
        {
            return (Property[])$VALUES.clone();
        }

        static 
        {
            EXTERNAL_URI = new Property("EXTERNAL_URI", 0) {

                public final String toString()
                {
                    return "external_uri";
                }

            };
            IMAGES = new Property("IMAGES", 1) {

                public final String toString()
                {
                    return "images";
                }

            };
            KEY = new Property("KEY", 2) {

                public final String toString()
                {
                    return "key";
                }

            };
            NAME = new Property("NAME", 3) {

                public final String toString()
                {
                    return "name";
                }

            };
            PLAYBACK_URI = new Property("PLAYBACK_URI", 4) {

                public final String toString()
                {
                    return "playback_uri";
                }

            };
            TRACKS_COUNT = new Property("TRACKS_COUNT", 5) {

                public final String toString()
                {
                    return "tracks_count";
                }

            };
            TRACKS = new Property("TRACKS", 6) {

                public final String toString()
                {
                    return "tracks";
                }

            };
            TYPE = new Property("TYPE", 7) {

                public final String toString()
                {
                    return "type";
                }

            };
            $VALUES = (new Property[] {
                EXTERNAL_URI, IMAGES, KEY, NAME, PLAYBACK_URI, TRACKS_COUNT, TRACKS, TYPE
            });
        }

        private Property(String s, int i)
        {
            super(s, i);
        }

    }

}
