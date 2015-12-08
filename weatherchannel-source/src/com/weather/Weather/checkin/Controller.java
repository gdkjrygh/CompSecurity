// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;

public interface Controller
{

    public abstract boolean createOptionsMenu(Menu menu, MenuInflater menuinflater);

    public abstract void handleActivityResult(int i, int j, Intent intent);

    public abstract boolean handleOptionsMenuSelection(int i);

    public abstract void onViewInvisible();

    public abstract void onViewVisible();

    public abstract void setView(Object obj);
}
