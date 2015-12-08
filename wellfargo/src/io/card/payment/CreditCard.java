// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

// Referenced classes of package io.card.payment:
//            f, e, s

public class CreditCard
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    public String a;
    public int b;
    public int c;
    public String d;
    public String e;
    public String f;
    String g;
    boolean h;
    int i;
    int j[];

    public CreditCard()
    {
        b = 0;
        c = 0;
        h = false;
        j = new int[16];
        g = UUID.randomUUID().toString();
    }

    private CreditCard(Parcel parcel)
    {
        b = 0;
        c = 0;
        h = false;
        a = parcel.readString();
        b = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readString();
        f = parcel.readString();
        e = f;
        g = parcel.readString();
        i = parcel.readInt();
        j = parcel.createIntArray();
    }

    CreditCard(Parcel parcel, f f1)
    {
        this(parcel);
    }

    public CreditCard(String s1, int k, int l, String s2, String s3)
    {
        b = 0;
        c = 0;
        h = false;
        a = s1;
        b = k;
        c = l;
        d = s2;
        e = s3;
        f = s3;
    }

    public String a()
    {
        if (a != null)
        {
            int k = Math.min(4, a.length());
            return a.substring(a.length() - k);
        } else
        {
            return "";
        }
    }

    public String b()
    {
        if (a != null)
        {
            String s1 = "";
            if (a.length() > 4)
            {
                s1 = (new StringBuilder()).append("").append(String.format((new StringBuilder("%")).append(a.length() - 4).append("s").toString(), new Object[] {
                    ""
                }).replace(' ', '\u2022')).toString();
            }
            return s.a((new StringBuilder()).append(s1).append(a()).toString(), false, io.card.payment.e.a(a));
        } else
        {
            return "";
        }
    }

    public e c()
    {
        return io.card.payment.e.a(a);
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        Object obj;
label0:
        {
            String s1 = (new StringBuilder("{")).append(c()).append(": ").append(b()).toString();
            if (b <= 0)
            {
                obj = s1;
                if (c <= 0)
                {
                    break label0;
                }
            }
            obj = (new StringBuilder()).append(s1).append("  expiry:").append(b).append("/").append(c).toString();
        }
        String s2 = ((String) (obj));
        if (e != null)
        {
            s2 = (new StringBuilder()).append(((String) (obj))).append("  zip:").append(e).toString();
        }
        obj = s2;
        if (f != null)
        {
            obj = (new StringBuilder()).append(s2).append("  postalCode:").append(f).toString();
        }
        s2 = ((String) (obj));
        if (d != null)
        {
            obj = (new StringBuilder()).append(((String) (obj))).append("  cvvLength:");
            int k;
            if (d != null)
            {
                k = d.length();
            } else
            {
                k = 0;
            }
            s2 = ((StringBuilder) (obj)).append(k).toString();
        }
        return (new StringBuilder()).append(s2).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int k)
    {
        parcel.writeString(a);
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeString(d);
        parcel.writeString(f);
        parcel.writeString(g);
        parcel.writeInt(i);
        parcel.writeIntArray(j);
    }

}
