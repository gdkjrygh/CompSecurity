// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;
import hnx;
import hny;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_Album

public abstract class Album extends hnx
    implements Parcelable
{

    public Album()
    {
    }

    public static Album create(String s)
    {
        return (new Shape_Album()).setName(s);
    }

    public abstract String getId();

    public abstract List getImages();

    public abstract String getName();

    protected Object onGet(hny hny, Object obj)
    {
        if (obj != null)
        {
            return obj;
        }
        class _cls1
        {

            static final int $SwitchMap$com$ubercab$client$core$model$Shape_Album$Property[];

            static 
            {
                $SwitchMap$com$ubercab$client$core$model$Shape_Album$Property = new int[Shape_Album.Property.values().length];
                try
                {
                    $SwitchMap$com$ubercab$client$core$model$Shape_Album$Property[Shape_Album.Property.IMAGES.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        switch (_cls1..SwitchMap.com.ubercab.client.core.model.Shape_Album.Property[((Shape_Album.Property)hny).ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return Collections.emptyList();
        }
    }

    abstract Album setId(String s);

    abstract Album setImages(List list);

    abstract Album setName(String s);
}
