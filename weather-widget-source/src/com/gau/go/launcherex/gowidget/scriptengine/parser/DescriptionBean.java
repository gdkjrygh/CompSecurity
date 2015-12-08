// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.gau.go.launcherex.gowidget.scriptengine.parser:
//            h

public class DescriptionBean
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new h();
    private int a;
    private int b;
    private int c;

    public DescriptionBean()
    {
        a = 0;
        c = 480;
    }

    private DescriptionBean(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readInt();
        c = parcel.readInt();
    }

    DescriptionBean(Parcel parcel, h h1)
    {
        this(parcel);
    }

    public int a()
    {
        return a;
    }

    public void a(int i)
    {
        a = i;
    }

    public void a(int i, int j)
    {
        if (i >= j)
        {
            j = i;
        }
        c = j;
    }

    public int b()
    {
        return c;
    }

    public void b(int i)
    {
        b = i;
    }

    public int c()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
        parcel.writeInt(c);
    }

}
