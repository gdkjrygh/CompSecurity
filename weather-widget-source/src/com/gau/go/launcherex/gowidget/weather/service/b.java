// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.service;

import android.os.IInterface;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import java.util.List;

public interface b
    extends IInterface
{

    public abstract void a(int i, int j);

    public abstract void a(int i, List list);

    public abstract void a(WeatherBean weatherbean);

    public abstract void a(String s, String s1);

    public abstract void a(List list);

    public abstract void a(boolean flag);

    public abstract void b(WeatherBean weatherbean);

    public abstract void b(boolean flag);
}
