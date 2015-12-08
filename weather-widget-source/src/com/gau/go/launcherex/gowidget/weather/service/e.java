// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.service;

import android.os.IInterface;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.WidgetSettingBean;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.service:
//            b

public interface e
    extends IInterface
{

    public abstract String a(int i);

    public abstract String a(String s);

    public abstract List a();

    public abstract void a(int i, int j);

    public abstract void a(int i, int j, String s);

    public abstract void a(b b1);

    public abstract WidgetSettingBean b();

    public abstract void b(int i);

    public abstract void b(b b1);

    public abstract WeatherBean c();

    public abstract boolean d();

    public abstract boolean e();
}
