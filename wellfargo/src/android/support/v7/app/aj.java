// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.os.Parcel;

final class aj
    implements android.os.Parcelable.Creator
{

    aj()
    {
    }

    public AppCompatDelegateImplV7.PanelFeatureState.SavedState a(Parcel parcel)
    {
        return AppCompatDelegateImplV7.PanelFeatureState.SavedState.a(parcel);
    }

    public AppCompatDelegateImplV7.PanelFeatureState.SavedState[] a(int i)
    {
        return new AppCompatDelegateImplV7.PanelFeatureState.SavedState[i];
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
