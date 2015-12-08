// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;

import android.os.Parcel;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.model:
//            WidgetSettingBean

final class ab
    implements android.os.Parcelable.Creator
{

    ab()
    {
    }

    public WidgetSettingBean a(Parcel parcel)
    {
        return new WidgetSettingBean(parcel, null);
    }

    public WidgetSettingBean[] a(int i)
    {
        return new WidgetSettingBean[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
