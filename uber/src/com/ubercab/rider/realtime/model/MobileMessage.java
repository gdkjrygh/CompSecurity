// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.model;

import java.util.List;

// Referenced classes of package com.ubercab.rider.realtime.model:
//            MobileMessageDisplayProperties

public interface MobileMessage
{

    public abstract MobileMessageDisplayProperties getDisplayProps();

    public abstract String getETag();

    public abstract String getId();

    public abstract List getModules();

    public abstract String getVehicleViewId();
}
