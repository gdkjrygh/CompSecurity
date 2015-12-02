// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_Image

public abstract class Image
    implements Parcelable
{

    public Image()
    {
    }

    public static Image create(String s, int i, int j)
    {
        return (new Shape_Image()).setUrl(s).setWidth(i).setHeight(j);
    }

    public abstract int getHeight();

    public abstract String getUrl();

    public abstract int getWidth();

    abstract Image setHeight(int i);

    abstract Image setUrl(String s);

    abstract Image setWidth(int i);
}
