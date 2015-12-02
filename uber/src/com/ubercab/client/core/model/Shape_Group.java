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
//            Group

public final class Shape_Group extends Group
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Group createFromParcel(Parcel parcel)
        {
            return new Shape_Group(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Group[] newArray(int i)
        {
            return new Group[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_Group.getClassLoader();
    private static final Set SHAPE_PROPERTIES;
    private List groups;
    private int groups_count;
    private List images;
    private int images_count;
    private String name;
    private String playback_uri;
    private List playlists;
    private int playlists_count;
    private String station_uri;
    private String type;

    Shape_Group()
    {
    }

    private Shape_Group(Parcel parcel)
    {
        groups = (List)parcel.readValue(PARCELABLE_CL);
        groups_count = ((Integer)parcel.readValue(PARCELABLE_CL)).intValue();
        images = (List)parcel.readValue(PARCELABLE_CL);
        images_count = ((Integer)parcel.readValue(PARCELABLE_CL)).intValue();
        name = (String)parcel.readValue(PARCELABLE_CL);
        playback_uri = (String)parcel.readValue(PARCELABLE_CL);
        playlists = (List)parcel.readValue(PARCELABLE_CL);
        playlists_count = ((Integer)parcel.readValue(PARCELABLE_CL)).intValue();
        station_uri = (String)parcel.readValue(PARCELABLE_CL);
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
            obj = (Group)obj;
            if (((Group) (obj)).getGroups() == null ? getGroups() != null : !((Group) (obj)).getGroups().equals(getGroups()))
            {
                return false;
            }
            if (((Group) (obj)).getGroupsCount() != getGroupsCount())
            {
                return false;
            }
            if (((Group) (obj)).getImages() == null ? getImages() != null : !((Group) (obj)).getImages().equals(getImages()))
            {
                return false;
            }
            if (((Group) (obj)).getImagesCount() != getImagesCount())
            {
                return false;
            }
            if (((Group) (obj)).getName() == null ? getName() != null : !((Group) (obj)).getName().equals(getName()))
            {
                return false;
            }
            if (((Group) (obj)).getPlaybackUri() == null ? getPlaybackUri() != null : !((Group) (obj)).getPlaybackUri().equals(getPlaybackUri()))
            {
                return false;
            }
            if (((Group) (obj)).getPlaylists() == null ? getPlaylists() != null : !((Group) (obj)).getPlaylists().equals(getPlaylists()))
            {
                return false;
            }
            if (((Group) (obj)).getPlaylistsCount() != getPlaylistsCount())
            {
                return false;
            }
            if (((Group) (obj)).getStationUri() == null ? getStationUri() != null : !((Group) (obj)).getStationUri().equals(getStationUri()))
            {
                return false;
            }
            if (((Group) (obj)).getType() == null ? getType() != null : !((Group) (obj)).getType().equals(getType()))
            {
                return false;
            }
        }
        return true;
    }

    public final List getGroups()
    {
        return (List)onGet(Property.GROUPS, groups);
    }

    public final int getGroupsCount()
    {
        return ((Integer)onGet(Property.GROUPS_COUNT, Integer.valueOf(groups_count))).intValue();
    }

    public final List getImages()
    {
        return (List)onGet(Property.IMAGES, images);
    }

    public final int getImagesCount()
    {
        return ((Integer)onGet(Property.IMAGES_COUNT, Integer.valueOf(images_count))).intValue();
    }

    public final String getName()
    {
        return (String)onGet(Property.NAME, name);
    }

    public final String getPlaybackUri()
    {
        return (String)onGet(Property.PLAYBACK_URI, playback_uri);
    }

    public final List getPlaylists()
    {
        return (List)onGet(Property.PLAYLISTS, playlists);
    }

    public final int getPlaylistsCount()
    {
        return ((Integer)onGet(Property.PLAYLISTS_COUNT, Integer.valueOf(playlists_count))).intValue();
    }

    public final String getStationUri()
    {
        return (String)onGet(Property.STATION_URI, station_uri);
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
        int i2;
        int j2;
        if (groups == null)
        {
            i = 0;
        } else
        {
            i = groups.hashCode();
        }
        l1 = groups_count;
        if (images == null)
        {
            j = 0;
        } else
        {
            j = images.hashCode();
        }
        i2 = images_count;
        if (name == null)
        {
            k = 0;
        } else
        {
            k = name.hashCode();
        }
        if (playback_uri == null)
        {
            l = 0;
        } else
        {
            l = playback_uri.hashCode();
        }
        if (playlists == null)
        {
            i1 = 0;
        } else
        {
            i1 = playlists.hashCode();
        }
        j2 = playlists_count;
        if (station_uri == null)
        {
            j1 = 0;
        } else
        {
            j1 = station_uri.hashCode();
        }
        if (type != null)
        {
            k1 = type.hashCode();
        }
        return (j1 ^ ((i1 ^ (l ^ (k ^ ((j ^ ((i ^ 0xf4243) * 0xf4243 ^ l1) * 0xf4243) * 0xf4243 ^ i2) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ j2) * 0xf4243) * 0xf4243 ^ k1;
    }

    final Group setGroups(List list)
    {
        List list1 = groups;
        groups = (List)beforeSet(Property.GROUPS, list1, list);
        afterSet(Property.GROUPS, list1, list);
        return this;
    }

    final Group setGroupsCount(int i)
    {
        int j = groups_count;
        groups_count = ((Integer)beforeSet(Property.GROUPS_COUNT, Integer.valueOf(j), Integer.valueOf(i))).intValue();
        afterSet(Property.GROUPS_COUNT, Integer.valueOf(j), Integer.valueOf(i));
        return this;
    }

    final Group setImages(List list)
    {
        List list1 = images;
        images = (List)beforeSet(Property.IMAGES, list1, list);
        afterSet(Property.IMAGES, list1, list);
        return this;
    }

    final Group setImagesCount(int i)
    {
        int j = images_count;
        images_count = ((Integer)beforeSet(Property.IMAGES_COUNT, Integer.valueOf(j), Integer.valueOf(i))).intValue();
        afterSet(Property.IMAGES_COUNT, Integer.valueOf(j), Integer.valueOf(i));
        return this;
    }

    final Group setName(String s)
    {
        String s1 = name;
        name = (String)beforeSet(Property.NAME, s1, s);
        afterSet(Property.NAME, s1, s);
        return this;
    }

    final Group setPlaybackUri(String s)
    {
        String s1 = playback_uri;
        playback_uri = (String)beforeSet(Property.PLAYBACK_URI, s1, s);
        afterSet(Property.PLAYBACK_URI, s1, s);
        return this;
    }

    final Group setPlaylists(List list)
    {
        List list1 = playlists;
        playlists = (List)beforeSet(Property.PLAYLISTS, list1, list);
        afterSet(Property.PLAYLISTS, list1, list);
        return this;
    }

    final Group setPlaylistsCount(int i)
    {
        int j = playlists_count;
        playlists_count = ((Integer)beforeSet(Property.PLAYLISTS_COUNT, Integer.valueOf(j), Integer.valueOf(i))).intValue();
        afterSet(Property.PLAYLISTS_COUNT, Integer.valueOf(j), Integer.valueOf(i));
        return this;
    }

    final Group setStationUri(String s)
    {
        String s1 = station_uri;
        station_uri = (String)beforeSet(Property.STATION_URI, s1, s);
        afterSet(Property.STATION_URI, s1, s);
        return this;
    }

    final Group setType(String s)
    {
        String s1 = type;
        type = (String)beforeSet(Property.TYPE, s1, s);
        afterSet(Property.TYPE, s1, s);
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("Group{groups=")).append(groups).append(", groups_count=").append(groups_count).append(", images=").append(images).append(", images_count=").append(images_count).append(", name=").append(name).append(", playback_uri=").append(playback_uri).append(", playlists=").append(playlists).append(", playlists_count=").append(playlists_count).append(", station_uri=").append(station_uri).append(", type=").append(type).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(groups);
        parcel.writeValue(Integer.valueOf(groups_count));
        parcel.writeValue(images);
        parcel.writeValue(Integer.valueOf(images_count));
        parcel.writeValue(name);
        parcel.writeValue(playback_uri);
        parcel.writeValue(playlists);
        parcel.writeValue(Integer.valueOf(playlists_count));
        parcel.writeValue(station_uri);
        parcel.writeValue(type);
    }

    static 
    {
        SHAPE_PROPERTIES = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Property[] {
            Property.GROUPS, Property.GROUPS_COUNT, Property.IMAGES, Property.IMAGES_COUNT, Property.NAME, Property.PLAYBACK_URI, Property.PLAYLISTS, Property.PLAYLISTS_COUNT, Property.STATION_URI, Property.TYPE
        })));
    }

    private class Property extends Enum
        implements hny
    {

        private static final Property $VALUES[];
        public static final Property GROUPS;
        public static final Property GROUPS_COUNT;
        public static final Property IMAGES;
        public static final Property IMAGES_COUNT;
        public static final Property NAME;
        public static final Property PLAYBACK_URI;
        public static final Property PLAYLISTS;
        public static final Property PLAYLISTS_COUNT;
        public static final Property STATION_URI;
        public static final Property TYPE;

        public static Property valueOf(String s)
        {
            return (Property)Enum.valueOf(com/ubercab/client/core/model/Shape_Group$Property, s);
        }

        public static Property[] values()
        {
            return (Property[])$VALUES.clone();
        }

        static 
        {
            GROUPS = new Property("GROUPS", 0) {

                public final String toString()
                {
                    return "groups";
                }

            };
            GROUPS_COUNT = new Property("GROUPS_COUNT", 1) {

                public final String toString()
                {
                    return "groups_count";
                }

            };
            IMAGES = new Property("IMAGES", 2) {

                public final String toString()
                {
                    return "images";
                }

            };
            IMAGES_COUNT = new Property("IMAGES_COUNT", 3) {

                public final String toString()
                {
                    return "images_count";
                }

            };
            NAME = new Property("NAME", 4) {

                public final String toString()
                {
                    return "name";
                }

            };
            PLAYBACK_URI = new Property("PLAYBACK_URI", 5) {

                public final String toString()
                {
                    return "playback_uri";
                }

            };
            PLAYLISTS = new Property("PLAYLISTS", 6) {

                public final String toString()
                {
                    return "playlists";
                }

            };
            PLAYLISTS_COUNT = new Property("PLAYLISTS_COUNT", 7) {

                public final String toString()
                {
                    return "playlists_count";
                }

            };
            STATION_URI = new Property("STATION_URI", 8) {

                public final String toString()
                {
                    return "station_uri";
                }

            };
            TYPE = new Property("TYPE", 9) {

                public final String toString()
                {
                    return "type";
                }

            };
            $VALUES = (new Property[] {
                GROUPS, GROUPS_COUNT, IMAGES, IMAGES_COUNT, NAME, PLAYBACK_URI, PLAYLISTS, PLAYLISTS_COUNT, STATION_URI, TYPE
            });
        }

        private Property(String s, int i)
        {
            super(s, i);
        }

    }

}
