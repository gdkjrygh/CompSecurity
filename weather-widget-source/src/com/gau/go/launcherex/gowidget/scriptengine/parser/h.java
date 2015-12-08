// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;

import android.os.Parcel;

// Referenced classes of package com.gau.go.launcherex.gowidget.scriptengine.parser:
//            DescriptionBean

final class h
    implements android.os.Parcelable.Creator
{

    h()
    {
    }

    public DescriptionBean a(Parcel parcel)
    {
        return new DescriptionBean(parcel, null);
    }

    public DescriptionBean[] a(int i)
    {
        return new DescriptionBean[i];
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
