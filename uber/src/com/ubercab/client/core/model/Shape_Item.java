// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            Item

public final class Shape_Item extends Item
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Item createFromParcel(Parcel parcel)
        {
            return new Shape_Item(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Item[] newArray(int i)
        {
            return new Item[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_Item.getClassLoader();
    private String imageUrl;
    private String name;
    private String question;
    private List tags;
    private String uuid;

    Shape_Item()
    {
    }

    private Shape_Item(Parcel parcel)
    {
        imageUrl = (String)parcel.readValue(PARCELABLE_CL);
        name = (String)parcel.readValue(PARCELABLE_CL);
        question = (String)parcel.readValue(PARCELABLE_CL);
        uuid = (String)parcel.readValue(PARCELABLE_CL);
        tags = (List)parcel.readValue(PARCELABLE_CL);
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
            obj = (Item)obj;
            if (((Item) (obj)).getImageUrl() == null ? getImageUrl() != null : !((Item) (obj)).getImageUrl().equals(getImageUrl()))
            {
                return false;
            }
            if (((Item) (obj)).getName() == null ? getName() != null : !((Item) (obj)).getName().equals(getName()))
            {
                return false;
            }
            if (((Item) (obj)).getQuestion() == null ? getQuestion() != null : !((Item) (obj)).getQuestion().equals(getQuestion()))
            {
                return false;
            }
            if (((Item) (obj)).getUuid() == null ? getUuid() != null : !((Item) (obj)).getUuid().equals(getUuid()))
            {
                return false;
            }
            if (((Item) (obj)).getTags() == null ? getTags() != null : !((Item) (obj)).getTags().equals(getTags()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getImageUrl()
    {
        return imageUrl;
    }

    public final String getName()
    {
        return name;
    }

    public final String getQuestion()
    {
        return question;
    }

    public final List getTags()
    {
        return tags;
    }

    public final String getUuid()
    {
        return uuid;
    }

    public final int hashCode()
    {
        int i1 = 0;
        int i;
        int j;
        int k;
        int l;
        if (imageUrl == null)
        {
            i = 0;
        } else
        {
            i = imageUrl.hashCode();
        }
        if (name == null)
        {
            j = 0;
        } else
        {
            j = name.hashCode();
        }
        if (question == null)
        {
            k = 0;
        } else
        {
            k = question.hashCode();
        }
        if (uuid == null)
        {
            l = 0;
        } else
        {
            l = uuid.hashCode();
        }
        if (tags != null)
        {
            i1 = tags.hashCode();
        }
        return (l ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ i1;
    }

    public final Item setImageUrl(String s)
    {
        imageUrl = s;
        return this;
    }

    public final Item setName(String s)
    {
        name = s;
        return this;
    }

    public final Item setQuestion(String s)
    {
        question = s;
        return this;
    }

    public final Item setTags(List list)
    {
        tags = list;
        return this;
    }

    public final Item setUuid(String s)
    {
        uuid = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("com.ubercab.client.core.model.Item{imageUrl=")).append(imageUrl).append(", name=").append(name).append(", question=").append(question).append(", uuid=").append(uuid).append(", tags=").append(tags).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(imageUrl);
        parcel.writeValue(name);
        parcel.writeValue(question);
        parcel.writeValue(uuid);
        parcel.writeValue(tags);
    }

}
