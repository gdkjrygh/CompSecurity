// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.ui.overlay;


public interface WeatherTileChangeListener
{

    public abstract void onCurrentTileIndexChanged(int i, int j);

    public abstract void onCurrentTileTimeChanged(long l);

    public abstract void onTileUpdateFailed();
}
