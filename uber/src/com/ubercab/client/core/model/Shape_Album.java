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
//            Album

public final class Shape_Album extends Album
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Album createFromParcel(Parcel parcel)
        {
            return new Shape_Album(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Album[] newArray(int i)
        {
            return new Album[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_Album.getClassLoader();
    private static final Set SHAPE_PROPERTIES;
    private String id;
    private List images;
    private String name;

    Shape_Album()
    {
    }

    private Shape_Album(Parcel parcel)
    {
        id = (String)parcel.readValue(PARCELABLE_CL);
        images = (List)parcel.readValue(PARCELABLE_CL);
        name = (String)parcel.readValue(PARCELABLE_CL);
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
            obj = (Album)obj;
            if (((Album) (obj)).getId() == null ? getId() != null : !((Album) (obj)).getId().equals(getId()))
            {
                return false;
            }
            if (((Album) (obj)).getImages() == null ? getImages() != null : !((Album) (obj)).getImages().equals(getImages()))
            {
                return false;
            }
            if (((Album) (obj)).getName() == null ? getName() != null : !((Album) (obj)).getName().equals(getName()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getId()
    {
        return (String)onGet(Property.ID, id);
    }

    public final List getImages()
    {
        return (List)onGet(Property.IMAGES, images);
    }

    public final String getName()
    {
        return (String)onGet(Property.NAME, name);
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (id == null)
        {
            i = 0;
        } else
        {
            i = id.hashCode();
        }
        if (images == null)
        {
            j = 0;
        } else
        {
            j = images.hashCode();
        }
        if (name != null)
        {
            k = name.hashCode();
        }
        return (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243 ^ k;
    }

    final Album setId(String s)
    {
        String s1 = id;
        id = (String)beforeSet(Property.ID, s1, s);
        afterSet(Property.ID, s1, s);
        return this;
    }

    final Album setImages(List list)
    {
        List list1 = images;
        images = (List)beforeSet(Property.IMAGES, list1, list);
        afterSet(Property.IMAGES, list1, list);
        return this;
    }

    final Album setName(String s)
    {
        String s1 = name;
        name = (String)beforeSet(Property.NAME, s1, s);
        afterSet(Property.NAME, s1, s);
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("Album{id=")).append(id).append(", images=").append(images).append(", name=").append(name).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(id);
        parcel.writeValue(images);
        parcel.writeValue(name);
    }

    static 
    {
        SHAPE_PROPERTIES = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Property[] {
            Property.ID, Property.IMAGES, Property.NAME
        })));
    }

    private class Property extends Enum
        implements hny
    {

        private static final Property $VALUES[];
        public static final Property ID;
        public static final Property IMAGES;
        public static final Property NAME;

        public static Property valueOf(String s)
        {
            return (Property)Enum.valueOf(com/ubercab/client/core/model/Shape_Album$Property, s);
        }

        public static Property[] values()
        {
            return (Property[])$VALUES.clone();
        }

        static 
        {
            ID = new Property("ID", 0) {

                public final String toString()
                {
                    return "id";
                }

            };
            IMAGES = new Property("IMAGES", 1) {

                public final String toString()
                {
                    return "images";
                }

            };
            NAME = new Property("NAME", 2) {

                public final String toString()
                {
                    return "name";
                }

            };
            $VALUES = (new Property[] {
                ID, IMAGES, NAME
            });
        }

        private Property(String s, int i)
        {
            super(s, i);
        }

    }

}
