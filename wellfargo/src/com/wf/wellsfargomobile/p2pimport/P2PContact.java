// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.p2pimport;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.wf.wellsfargomobile.p2pimport:
//            a

public class P2PContact
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private String a;
    private String b;
    private String c[];
    private String d[];
    private int e;
    private int f;
    private Boolean g;
    private int h;

    public P2PContact()
    {
    }

    public P2PContact(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        e = parcel.readInt();
        f = parcel.readInt();
        c = new String[e];
        parcel.readStringArray(c);
        d = new String[f];
        parcel.readStringArray(d);
        h = parcel.readInt();
        g = Boolean.valueOf(parcel.readString());
    }

    public String a()
    {
        return a;
    }

    public void a(int i)
    {
        e = i;
    }

    public void a(Boolean boolean1)
    {
        g = boolean1;
    }

    public void a(String s)
    {
        a = s;
    }

    public void a(String as[])
    {
        c = as;
    }

    public String b()
    {
        return b;
    }

    public void b(int i)
    {
        f = i;
    }

    public void b(String s)
    {
        b = s;
    }

    public void b(String as[])
    {
        d = as;
    }

    public void c(int i)
    {
        h = i;
    }

    public String[] c()
    {
        return c;
    }

    public String[] d()
    {
        return d;
    }

    public int describeContents()
    {
        return hashCode();
    }

    public Boolean e()
    {
        return g;
    }

    public int f()
    {
        return h;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeInt(e);
        parcel.writeInt(f);
        parcel.writeStringArray(c);
        parcel.writeStringArray(d);
        parcel.writeInt(h);
        parcel.writeString(g.toString());
    }

}
