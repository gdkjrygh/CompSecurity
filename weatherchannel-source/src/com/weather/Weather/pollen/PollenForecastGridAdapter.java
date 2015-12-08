// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.pollen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.weather.commons.facade.PollenFacade;
import com.weather.dal2.dsx.PastPollenData;

// Referenced classes of package com.weather.Weather.pollen:
//            AllergyAdapter

public class PollenForecastGridAdapter extends AllergyAdapter
{

    private static final int TODAY = 1;
    private static final int YESTERDAY = 0;
    private final Context context;
    private PollenFacade currentData;
    private LayoutInflater inflater;
    private PastPollenData pastPollenData;

    public PollenForecastGridAdapter(Context context1)
    {
        context = context1;
    }

    public boolean areAllItemsEnabled()
    {
        return false;
    }

    public int getCount()
    {
        return 5;
    }

    public Object getItem(int i)
    {
        return Integer.valueOf(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public int getItemViewType(int i)
    {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (inflater == null)
        {
            inflater = LayoutInflater.from(context);
        }
    /* block-local class not found */
    class ViewHolder {}

        if (view == null)
        {
            view = inflater.inflate(0x7f030087, viewgroup, false);
            view.setTag(new ViewHolder(view));
        }
        ((ViewHolder)view.getTag()).updateContents(context, currentData, pastPollenData, i);
        return view;
    }

    public int getViewTypeCount()
    {
        return 1;
    }

    public boolean hasStableIds()
    {
        return false;
    }

    public boolean isEnabled(int i)
    {
        return false;
    }

    public void setData(PollenFacade pollenfacade, PastPollenData pastpollendata)
    {
        currentData = pollenfacade;
        pastPollenData = pastpollendata;
        notifyDataSetChanged();
    }
}
