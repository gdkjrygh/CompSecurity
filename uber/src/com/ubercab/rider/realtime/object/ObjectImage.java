// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import hly;

// Referenced classes of package com.ubercab.rider.realtime.object:
//            Shape_ObjectImage

abstract class ObjectImage
    implements hly
{

    ObjectImage()
    {
    }

    static ObjectImage create(int i, int j, String s)
    {
        Shape_ObjectImage shape_objectimage = new Shape_ObjectImage();
        shape_objectimage.setHeight(i);
        shape_objectimage.setWidth(j);
        shape_objectimage.setUrl(s);
        return shape_objectimage;
    }
}
