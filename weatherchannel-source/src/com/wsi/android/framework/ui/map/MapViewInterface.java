// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.ui.map;


// Referenced classes of package com.wsi.android.framework.ui.map:
//            GeoPointInterface

public interface MapViewInterface
{

    public abstract int getLatitudeSpan();

    public abstract int getLongitudeSpan();

    public abstract GeoPointInterface getMapCenterGeneric();
}
