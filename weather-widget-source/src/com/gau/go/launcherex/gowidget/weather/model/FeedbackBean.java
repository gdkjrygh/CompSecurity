// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.model:
//            e

public class FeedbackBean
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private int g;

    public FeedbackBean()
    {
        a = "";
        b = "";
        c = "";
        d = "";
    }

    private FeedbackBean(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        e = parcel.readString();
        f = parcel.readString();
        g = parcel.readInt();
    }

    FeedbackBean(Parcel parcel, e e1)
    {
        this(parcel);
    }

    public String a()
    {
        return b;
    }

    public String a(Context context)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append((new StringBuilder()).append("Problem type\uFF1A").append(g).append(". ").append(b).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("User city\uFF1A").append(c).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("Content\uFF1A").append(d).append("\n").toString());
        if (e != null)
        {
            stringbuffer.append((new StringBuilder()).append("Weather Info\uFF1A").append(e).append("\n").toString());
        }
        PackageManager packagemanager = context.getPackageManager();
        try
        {
            context = packagemanager.getPackageInfo(context.getPackageName(), 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            context = null;
        }
        if (context != null)
        {
            context = ((PackageInfo) (context)).versionName;
        } else
        {
            context = "unknow";
        }
        stringbuffer.append((new StringBuilder()).append("Version Name: ").append(context).toString());
        return stringbuffer.toString();
    }

    public void a(int i)
    {
        g = i;
    }

    public void a(String s)
    {
        b = s;
    }

    public String b()
    {
        return c;
    }

    public void b(String s)
    {
        c = s;
    }

    public String c()
    {
        return d;
    }

    public void c(String s)
    {
        d = s;
    }

    public int d()
    {
        return g;
    }

    public void d(String s)
    {
        e = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return f;
    }

    public void e(String s)
    {
        f = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
        parcel.writeInt(g);
    }

}
