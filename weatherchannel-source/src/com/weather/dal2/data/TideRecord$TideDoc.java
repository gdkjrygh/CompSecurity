// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.data;

import java.util.List;

// Referenced classes of package com.weather.dal2.data:
//            TideRecord

public static interface TideHeader
{
    public static interface TideData
    {

        public abstract Double getTideHeightInFeet();

        public abstract String getTideLocalApparentTime();

        public abstract String getTideTimeISO();

        public abstract String getTideType();
    }

    public static interface TideHeader
    {

        public abstract String getProcessTime();

        public abstract String getProcessTimeISO();

        public abstract String getProcessTimeLocal();

        public abstract String getTideStationId();
    }


    public abstract List getTideDataList();

    public abstract TideHeader getTideHeader();
}
