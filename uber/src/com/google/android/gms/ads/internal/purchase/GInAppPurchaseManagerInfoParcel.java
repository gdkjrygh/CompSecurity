// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import aaf;
import aag;
import aai;
import afw;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import mq;
import na;
import nb;

public final class GInAppPurchaseManagerInfoParcel
    implements SafeParcelable
{

    public static final mq CREATOR = new mq();
    public final int a;
    public final nb b;
    public final afw c;
    public final Context d;
    public final na e;

    public GInAppPurchaseManagerInfoParcel(int i, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3)
    {
        a = i;
        b = (nb)aai.a(aag.a(ibinder));
        c = (afw)aai.a(aag.a(ibinder1));
        d = (Context)aai.a(aag.a(ibinder2));
        e = (na)aai.a(aag.a(ibinder3));
    }

    public GInAppPurchaseManagerInfoParcel(Context context, nb nb1, afw afw1, na na1)
    {
        a = 2;
        d = context;
        b = nb1;
        c = afw1;
        e = na1;
    }

    public static GInAppPurchaseManagerInfoParcel a(Intent intent)
    {
        try
        {
            intent = intent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
            intent.setClassLoader(com/google/android/gms/ads/internal/purchase/GInAppPurchaseManagerInfoParcel.getClassLoader());
            intent = (GInAppPurchaseManagerInfoParcel)intent.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return null;
        }
        return intent;
    }

    public static void a(Intent intent, GInAppPurchaseManagerInfoParcel ginapppurchasemanagerinfoparcel)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", ginapppurchasemanagerinfoparcel);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", bundle);
    }

    public final IBinder a()
    {
        return aai.a(e).asBinder();
    }

    public final IBinder b()
    {
        return aai.a(b).asBinder();
    }

    public final IBinder c()
    {
        return aai.a(c).asBinder();
    }

    public final IBinder d()
    {
        return aai.a(d).asBinder();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        mq.a(this, parcel);
    }

}
