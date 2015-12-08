// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.weather.ui;

import com.wsi.android.weather.utils.settings.WSIMapAPI;

// Referenced classes of package com.wsi.android.weather.ui:
//            MapAuxiliaryFragment

public interface MapActivityWithAPI
{

    public abstract WSIMapAPI getMapAPI();

    public abstract void navigateToOrClose(int i);

    public abstract void setMapAuxiliaryFragment(MapAuxiliaryFragment mapauxiliaryfragment);
}
