// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.model;


// Referenced classes of package com.ubercab.rds.feature.model:
//            Shape_MessageBodyComponentModel

public abstract class MessageBodyComponentModel
{

    public MessageBodyComponentModel()
    {
    }

    public static MessageBodyComponentModel create()
    {
        return new Shape_MessageBodyComponentModel();
    }

    public abstract String getData();

    public abstract String getType();

    public abstract MessageBodyComponentModel setData(String s);

    public abstract MessageBodyComponentModel setType(String s);
}
