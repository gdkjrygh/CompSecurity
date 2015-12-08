// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.data;

import java.util.List;

// Referenced classes of package com.weather.dal2.data:
//            Record

public interface PollenRecord
    extends Record
{
    public static interface PollenDoc
    {

        public abstract List getGrassPollen();

        public abstract Integer getMoldCount();

        public abstract List getTreePollen();

        public abstract List getWeedPollen();
    }

    public static interface PollenDoc.PollenDay
    {

        public abstract Integer getPollenIndexCode();

        public abstract String getPollenIndexPhrase();

        public abstract String getPollenIndexTimeInGMT();

        public abstract String getPollenTreeTimeInISO();

        public abstract String getPollenTreeType();
    }


    public abstract PollenDoc getPollenDoc();
}
