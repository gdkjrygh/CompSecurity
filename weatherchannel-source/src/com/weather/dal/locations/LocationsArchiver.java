// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal.locations;


// Referenced classes of package com.weather.dal.locations:
//            SavedLocationsData

public interface LocationsArchiver
{

    public abstract SavedLocationsData load();

    public abstract void save(SavedLocationsData savedlocationsdata);
}
