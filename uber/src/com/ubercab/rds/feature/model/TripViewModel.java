// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.model;

import com.ubercab.ui.collection.model.ViewModel;
import hco;

// Referenced classes of package com.ubercab.rds.feature.model:
//            Shape_TripViewModel

public abstract class TripViewModel extends ViewModel
{

    public TripViewModel()
    {
    }

    public static TripViewModel create()
    {
        return new Shape_TripViewModel();
    }

    public abstract String getCar();

    public abstract android.view.View.OnClickListener getClickListener();

    public abstract String getDate();

    public abstract String getDriverPictureUrl();

    public abstract String getFare();

    public abstract String getImageUrl();

    public abstract boolean getIsSurgeTrip();

    public abstract int getMapHeight();

    public abstract hco getRdsImageLoader();

    public abstract TripViewModel setCar(String s);

    public abstract TripViewModel setClickListener(android.view.View.OnClickListener onclicklistener);

    public abstract TripViewModel setDate(String s);

    public abstract TripViewModel setDriverPictureUrl(String s);

    public abstract TripViewModel setFare(String s);

    public abstract TripViewModel setImageUrl(String s);

    public abstract TripViewModel setIsSurgeTrip(boolean flag);

    public abstract TripViewModel setMapHeight(int i);

    public abstract TripViewModel setRdsImageLoader(hco hco);
}
