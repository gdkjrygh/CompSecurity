// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_Item

public abstract class Item
    implements Parcelable, com.ubercab.rider.realtime.model.Item
{

    public Item()
    {
    }

    public static Item create()
    {
        return new Shape_Item();
    }

    public static Item create(com.ubercab.rider.realtime.model.Item item)
    {
        return (new Shape_Item()).setImageUrl(item.getImageUrl()).setName(item.getName()).setQuestion(item.getQuestion()).setUuid(item.getUuid()).setTags(item.getTags());
    }

    public static Item create(String s, String s1, String s2, String s3, List list)
    {
        return create().setUuid(s).setImageUrl(s1).setName(s2).setQuestion(s3).setTags(list);
    }

    public static Item getInternalItem(com.ubercab.rider.realtime.model.Item item)
    {
        if (item instanceof Item)
        {
            return (Item)item;
        } else
        {
            return create(item);
        }
    }

    public abstract String getImageUrl();

    public abstract String getName();

    public abstract String getQuestion();

    public abstract List getTags();

    public abstract String getUuid();

    public abstract Item setImageUrl(String s);

    public abstract Item setName(String s);

    public abstract Item setQuestion(String s);

    public abstract Item setTags(List list);

    public abstract Item setUuid(String s);
}
