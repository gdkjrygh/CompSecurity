// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import bqk;
import cbg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class PayPalOAuthScopes
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new cbg();
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    private List h;

    public PayPalOAuthScopes()
    {
        h = new ArrayList();
    }

    private PayPalOAuthScopes(Parcel parcel)
    {
        h = new ArrayList();
        int j = parcel.readInt();
        for (int i = 0; i < j; i++)
        {
            h.add(parcel.readString());
        }

    }

    public PayPalOAuthScopes(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public PayPalOAuthScopes(Set set)
    {
        this();
        String s;
        for (set = set.iterator(); set.hasNext(); h.add(s))
        {
            s = (String)set.next();
        }

    }

    public final List a()
    {
        return h;
    }

    public final String b()
    {
        return TextUtils.join(" ", h);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return String.format((new StringBuilder()).append(com/paypal/android/sdk/payments/PayPalOAuthScopes.getSimpleName()).append(": {%s}").toString(), new Object[] {
            h
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(h.size());
        for (i = 0; i < h.size(); i++)
        {
            parcel.writeString((String)h.get(i));
        }

    }

    static 
    {
        a = bqk.a.a();
        b = bqk.b.a();
        c = bqk.c.a();
        d = bqk.e.a();
        e = bqk.f.a();
        f = bqk.g.a();
        g = bqk.d.a();
    }
}
