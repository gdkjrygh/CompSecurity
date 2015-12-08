// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar;

import android.os.Parcel;

final class m
    implements android.os.Parcelable.Creator
{

    m()
    {
    }

    public SidebarDrawerLayout.SavedState a(Parcel parcel)
    {
        return new SidebarDrawerLayout.SavedState(parcel);
    }

    public SidebarDrawerLayout.SavedState[] a(int i)
    {
        return new SidebarDrawerLayout.SavedState[i];
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
