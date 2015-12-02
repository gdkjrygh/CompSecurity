// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;
import com.ubercab.rider.realtime.model.FareDetail;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_UpfrontFareDetail

public abstract class UpfrontFareDetail
    implements Parcelable, FareDetail
{

    public UpfrontFareDetail()
    {
    }

    public static UpfrontFareDetail create(FareDetail faredetail)
    {
        return (new Shape_UpfrontFareDetail()).setTitle(faredetail.getTitle()).setSubtitle(faredetail.getSubtitle()).setFooter(faredetail.getFooter()).setFares(faredetail.getFares());
    }

    public static UpfrontFareDetail create(String s, String s1, String s2, List list)
    {
        return (new Shape_UpfrontFareDetail()).setTitle(s2).setSubtitle(s1).setFooter(s).setFares(list);
    }

    abstract UpfrontFareDetail setFares(List list);

    abstract UpfrontFareDetail setFooter(String s);

    abstract UpfrontFareDetail setSubtitle(String s);

    abstract UpfrontFareDetail setTitle(String s);
}
