// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.locations;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.system.TwcBus;
import com.weather.util.lbs.LbsUtil;

// Referenced classes of package com.weather.Weather.locations:
//            LocationDisplayData, LocationDisplayItem

public final class WeatherLocationListAdapter extends BaseAdapter
{

    static final int ITEM_TYPE_LOCATION = 1;
    static final int ITEM_TYPE_MANAGE_LOCATION = 2;
    private int adapterCount;
    private LocationDisplayData locationDisplayData;
    private final Activity parentActivity;

    public WeatherLocationListAdapter(Activity activity, LocationDisplayData locationdisplaydata)
    {
        adapterCount = 1;
        parentActivity = activity;
        locationDisplayData = locationdisplaydata;
        adapterCount = getCountForLocations(locationDisplayData);
    }

    private static int getCountForLocations(LocationDisplayData locationdisplaydata)
    {
        int j = locationdisplaydata.getCount() + 1;
        int i = j;
        if (hasFollowMeActive(locationdisplaydata))
        {
            i = j + 1;
        }
        return i;
    }

    private static boolean hasFollowMeActive(LocationDisplayData locationdisplaydata)
    {
        return locationdisplaydata.getFollowMe() != null && LbsUtil.getInstance().isLbsEnabledForAppAndDevice();
    }

    public int getCount()
    {
        return adapterCount;
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        boolean flag1 = true;
        boolean flag2 = LbsUtil.getInstance().isLbsEnabledForAppAndDevice();
        LocationDisplayItem locationdisplayitem;
        View view1;
        boolean flag;
        int k;
        if (locationDisplayData == null)
        {
            locationdisplayitem = null;
        } else
        {
            locationdisplayitem = locationDisplayData.getFollowMe();
        }
        if (locationdisplayitem != null && flag2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = -1;
        if (locationDisplayData != null)
        {
            k = locationDisplayData.getCount();
        }
        view1 = view;
        if (locationDisplayData != null)
        {
            int l;
            if (flag)
            {
                l = 1;
            } else
            {
                l = 0;
            }
            if (i < l + k)
            {
    /* block-local class not found */
    class LocationViewHolder {}

                if (view == null || view.getId() != 0x7f0d019f)
                {
                    view1 = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f03006a, viewgroup, false);
                    view = new LocationViewHolder();
                    view1.setTag(view);
                } else
                {
                    view = (LocationViewHolder)view1.getTag();
                }
                if (i == 0 && flag)
                {
                    view.setData(locationdisplayitem, view1, true);
                    return view1;
                }
                viewgroup = locationDisplayData;
                int j;
                if (flag)
                {
                    j = ((flag1) ? 1 : 0);
                } else
                {
                    j = 0;
                }
                view.setData(viewgroup.getItem(i - j), view1, false);
                return view1;
            }
        }
        if (view == null || view.getId() != 0x7f0d01a5)
        {
            return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f03006b, viewgroup, false);
        } else
        {
            return view;
        }
    }

    public Object getItem(int i)
    {
        return Integer.valueOf(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        return i != getCount() - 1 ? 1 : 2;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        int j = getItemViewType(i);
        view = view1;
    /* block-local class not found */
    class ViewHolder {}

        if (view1 == null)
        {
            ViewHolder viewholder = new ViewHolder(null);
            view = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030069, viewgroup, false);
            ViewHolder.access._mth102(viewholder, (TextView)view.findViewById(0x7f0d019e));
            view.setTag(viewholder);
        }
        if (j == 1 && i >= 0)
        {
            viewgroup = (ViewHolder)view.getTag();
            boolean flag = hasFollowMeActive(locationDisplayData);
            LocationDisplayItem locationdisplayitem;
            int k;
            if (flag)
            {
                k = i - 1;
            } else
            {
                k = i;
            }
            locationdisplayitem = locationDisplayData.getFollowMe();
            if (i == 0 && flag && locationdisplayitem != null)
            {
                ViewHolder.access._mth100(viewgroup).setText(locationdisplayitem.formattedLocationName);
            } else
            if (k < locationDisplayData.getCount())
            {
                ViewHolder.access._mth100(viewgroup).setText(locationDisplayData.getItem(k).formattedLocationName);
                return view;
            }
        }
        return view;
    }

    public void onLocationDisplayDataChange(LocationDisplayData locationdisplaydata)
    {
        parentActivity.runOnUiThread(new _cls1(locationdisplaydata));
    }

    public void register()
    {
        DataAccessLayer.BUS.register(this);
    }

    public void unregister()
    {
        DataAccessLayer.BUS.unregister(this);
    }



/*
    static LocationDisplayData access$202(WeatherLocationListAdapter weatherlocationlistadapter, LocationDisplayData locationdisplaydata)
    {
        weatherlocationlistadapter.locationDisplayData = locationdisplaydata;
        return locationdisplaydata;
    }

*/


/*
    static int access$302(WeatherLocationListAdapter weatherlocationlistadapter, int i)
    {
        weatherlocationlistadapter.adapterCount = i;
        return i;
    }

*/


    /* member class not found */
    class _cls1 {}

}
