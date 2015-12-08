// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.map.interactive.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.weather.Weather.map.interactive.Layers;
import com.weather.util.app.AbstractTwcApplication;
import com.wsi.android.framework.ui.map.MapViewInterface;
import com.wsi.android.framework.ui.map.WSIMapView;
import com.wsi.android.framework.ui.utils.ComponentsProvider;
import com.wsi.android.weather.ui.LayerItem;
import com.wsi.android.weather.ui.MapActivityWithAPI;
import com.wsi.android.weather.ui.MapAppFragment;
import com.wsi.android.weather.utils.settings.WSIMapAPI;
import java.util.ArrayList;
import java.util.List;

public class TwcMapSettingsFragment extends MapAppFragment
{

    private List layers;
    private ArrayAdapter layersAdapter;
    private WSIMapAPI mapApi;
    private MapViewInterface mapView;

    public TwcMapSettingsFragment()
    {
    }

    public static String getNoneLayerLabel()
    {
        return AbstractTwcApplication.getRootContext().getString(0x7f07029b);
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
        return 0x7f030043;
    }

    protected String getScreenName()
    {
        return null;
    }

    protected void initializeContent(LayoutInflater layoutinflater, ViewGroup viewgroup, View view)
    {
        super.initializeContent(layoutinflater, viewgroup, view);
        Object obj = getActivity();
        mapApi = ((MapActivityWithAPI)obj).getMapAPI();
        mapView = (MapViewInterface)((Activity) (obj)).findViewById(0x7f0d011f);
        obj = (ListView)view.findViewById(0x7f0d0133);
        layoutinflater = (TextView)layoutinflater.inflate(0x7f030090, viewgroup, false);
        layoutinflater.setText(0x7f070288);
        layoutinflater.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, Math.round(getResources().getDimension(0x7f0a01e1))));
        ((ListView) (obj)).addHeaderView(layoutinflater, null, false);
        layoutinflater = mapApi.getAvailableLayers();
        layers = new ArrayList(layoutinflater.size() + 1);
        Layers.getVisibleLayers(layoutinflater, mapView, layers);
        layersAdapter = new ArrayAdapter(getActivity(), 0x7f030067, 0x1020014, layers);
        ((ListView) (obj)).setAdapter(layersAdapter);
        layoutinflater = mapApi.getActiveLayer();
        int i;
        if (layoutinflater == null)
        {
            i = 0;
        } else
        {
            i = layersAdapter.getPosition(layoutinflater.getName());
        }
        ((ListView) (obj)).setItemChecked(((ListView) (obj)).getHeaderViewsCount() + i, true);
        ((ListView) (obj)).setOnItemClickListener(new _cls1(((ListView) (obj))));
        if (mapView instanceof WSIMapView)
        {
            layoutinflater = (WSIMapView)mapView;
            viewgroup = (ToggleButton)view.findViewById(0x7f0d0132);
            boolean flag;
            if (!layoutinflater.isSatellite())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            viewgroup.setChecked(flag);
            ((ToggleButton)view.findViewById(0x7f0d0131)).setChecked(layoutinflater.isTraffic());
        }
    }

    public void onStart()
    {
        super.onStart();
        Layers.getVisibleLayers(mapApi.getAvailableLayers(), mapView, layers);
        layersAdapter.notifyDataSetChanged();
    }



    /* member class not found */
    class _cls1 {}

}
