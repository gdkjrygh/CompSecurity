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
//            Shape_Artist

public abstract class Artist extends hnx
    implements Parcelable
{

    public Artist()
    {
    }

    public static Artist create(String s)
    {
        return (new Shape_Artist()).setName(s);
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

            static final int $SwitchMap$com$ubercab$client$core$model$Shape_Artist$Property[];

            static 
            {
                $SwitchMap$com$ubercab$client$core$model$Shape_Artist$Property = new int[Shape_Artist.Property.values().length];
                try
                {
                    $SwitchMap$com$ubercab$client$core$model$Shape_Artist$Property[Shape_Artist.Property.IMAGES.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        switch (_cls1..SwitchMap.com.ubercab.client.core.model.Shape_Artist.Property[((Shape_Artist.Property)hny).ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return Collections.emptyList();
        }
    }

    abstract Artist setId(String s);

    abstract Artist setImages(List list);

    abstract Artist setName(String s);
}
