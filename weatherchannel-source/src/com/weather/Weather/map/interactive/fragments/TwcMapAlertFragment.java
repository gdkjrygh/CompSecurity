// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.map.interactive.fragments;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.wsi.android.weather.ui.MapActivityWithAPI;
import com.wsi.android.weather.ui.MapAppFragment;
import com.wsi.android.weather.utils.settings.GeoOverlayManager;
import com.wsi.android.weather.utils.settings.WSIMapAPI;

public class TwcMapAlertFragment extends MapAppFragment
{

    private WSIMapAPI mapApi;

    public TwcMapAlertFragment()
    {
    }

    protected void generateContentLayoutParams()
    {
        layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(2, 0x7f0d0120);
        layoutParams.addRule(12);
        layoutParams.bottomMargin = (int)getResources().getDimension(0x7f0a015c);
    }

    protected int getLayout()
    {
        return 0x7f030041;
    }

    protected String getScreenName()
    {
        return null;
    }

    protected void initializeContent(LayoutInflater layoutinflater, ViewGroup viewgroup, View view)
    {
        super.initializeContent(layoutinflater, viewgroup, view);
        mapApi = ((MapActivityWithAPI)getActivity()).getMapAPI();
        if (mapApi.getAvailableGeoOverlays() != null)
        {
            GeoOverlayManager ageooverlaymanager[] = mapApi.getAvailableGeoOverlays();
            int j = ageooverlaymanager.length;
            for (int i = 0; i < j; i++)
            {
                GeoOverlayManager geooverlaymanager = ageooverlaymanager[i];
                if (geooverlaymanager.isCategoryBased())
                {
                    ListView listview = (ListView)view.findViewById(0x7f0d012d);
                    TextView textview = (TextView)layoutinflater.inflate(0x7f030090, viewgroup, false);
                    textview.setText(0x7f070234);
                    int k = Math.round(getResources().getDimension(0x7f0a01e1));
                    textview.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, k));
                    listview.addHeaderView(textview, null, false);
                    String as[] = geooverlaymanager.getCategories();
    /* block-local class not found */
    class CategoryBasedOverlayListAdapter {}

                    CategoryBasedOverlayListAdapter categorybasedoverlaylistadapter = new CategoryBasedOverlayListAdapter(getActivity(), 0x7f0300d3, as);
                    listview.setAdapter(categorybasedoverlaylistadapter);
                    android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)listview.getLayoutParams();
                    int l = as.length;
                    layoutparams.height = Math.round(getResources().getDimension(0x7f0a01e0)) * l + (l + 1) * listview.getDividerHeight() + k;
                    listview.setItemChecked(categorybasedoverlaylistadapter.getPosition(geooverlaymanager.getActiveCategory()) + listview.getHeaderViewsCount(), true);
    /* block-local class not found */
    class AlertItemClickListener {}

                    listview.setOnItemClickListener(new AlertItemClickListener(geooverlaymanager));
                }
            }

        }
    }
}
