// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.common.fromguava.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.legacy.a.a;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            e, g

public class InfoCard
    implements Parcelable, a
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    public static final int TYPE_APP = 2;
    public static final int TYPE_NONE = 0;
    public static final int TYPE_PRODUCT = 1;
    public static final int TYPE_VOTE = 3;
    private final List actions;
    private final List events;
    private final InfoCardApp infoCardApp;
    private final int type;

    private InfoCard(int i, List list, List list1, InfoCardApp infocardapp)
    {
        type = i;
        actions = Collections.unmodifiableList((List)c.a(list));
        events = Collections.unmodifiableList((List)c.a(list1));
        infoCardApp = infocardapp;
    }

    InfoCard(int i, List list, List list1, InfoCardApp infocardapp, e e1)
    {
        this(i, list, list1, infocardapp);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && getClass().equals(obj.getClass()))
        {
            obj = (InfoCard)obj;
            if (b.a(Integer.valueOf(getType()), Integer.valueOf(((InfoCard) (obj)).getType())) && b.a(getEvents(), ((InfoCard) (obj)).getEvents()) && b.a(getActions(), ((InfoCard) (obj)).getActions()) && b.a(getInfoCardApp(), ((InfoCard) (obj)).getInfoCardApp()))
            {
                return true;
            }
        }
        return false;
    }

    public List getActions()
    {
        return actions;
    }

    public volatile com.google.android.apps.youtube.datalib.legacy.a.b getConverter()
    {
        return getConverter();
    }

    public g getConverter()
    {
        return new g(this);
    }

    public List getEvents()
    {
        return events;
    }

    public InfoCardApp getInfoCardApp()
    {
        return infoCardApp;
    }

    public int getType()
    {
        return type;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(getType());
        parcel.writeTypedList(getActions());
        parcel.writeTypedList(getEvents());
        parcel.writeParcelable(getInfoCardApp(), 0);
    }

}
