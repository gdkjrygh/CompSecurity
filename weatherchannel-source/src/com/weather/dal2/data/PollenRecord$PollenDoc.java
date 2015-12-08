// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.data;

import java.util.List;

// Referenced classes of package com.weather.dal2.data:
//            PollenRecord

public static interface PollenDay
{
    public static interface PollenDay
    {

        public abstract Integer getPollenIndexCode();

        public abstract String getPollenIndexPhrase();

        public abstract String getPollenIndexTimeInGMT();

        public abstract String getPollenTreeTimeInISO();

        public abstract String getPollenTreeType();
    }


    public abstract List getGrassPollen();

    public abstract Integer getMoldCount();

    public abstract List getTreePollen();

    public abstract List getWeedPollen();
}
