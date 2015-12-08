// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.bean;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package io.wecloud.message.bean:
//            b

public class EventInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    protected long a;
    protected int b;
    protected String c;
    protected String d;
    protected int e;

    public EventInfo()
    {
    }

    public EventInfo(Parcel parcel)
    {
        a(parcel);
    }

    public long a()
    {
        return a;
    }

    public void a(int i)
    {
        b = i;
    }

    public void a(long l)
    {
        a = l;
    }

    public void a(Parcel parcel)
    {
        if (parcel == null)
        {
            return;
        } else
        {
            a = parcel.readLong();
            b = parcel.readInt();
            c = parcel.readString();
            d = parcel.readString();
            e = parcel.readInt();
            return;
        }
    }

    public void a(String s)
    {
        c = s;
    }

    public int b()
    {
        return b;
    }

    public void b(String s)
    {
        d = s;
    }

    public String c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder("Event INFO [mid = ")).append(a).append(", mActionType = ").append(b).append(", mAppKey = ").append(c).append(", mMsgInfo = ").append(d).append(", resultCode = ").append(e).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(a);
        String s;
        if (b == 0)
        {
            i = 2999;
        } else
        {
            i = b;
        }
        parcel.writeInt(i);
        if (c == null)
        {
            s = "";
        } else
        {
            s = c;
        }
        parcel.writeString(s);
        if (d == null)
        {
            s = "";
        } else
        {
            s = d;
        }
        parcel.writeString(s);
        parcel.writeInt(e);
    }

}
