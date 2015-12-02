// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.monitoring.deprecated.internal.model;


// Referenced classes of package com.ubercab.monitoring.deprecated.internal.model:
//            Shape_Connection

public abstract class Connection
{

    public Connection()
    {
    }

    public static Connection create(int i)
    {
        return (new Shape_Connection()).setQuality(i);
    }

    public abstract int getQuality();

    abstract Connection setQuality(int i);
}
