// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.locations;

import android.app.ActionBar;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.weather.Weather.locations.adapters.LocationListAdapter;
import com.weather.Weather.locations.adapters.policy.AllLocationsInclusionPolicy;
import com.weather.Weather.locations.adapters.policy.FollowMePolicy;
import com.weather.Weather.locations.adapters.policy.ListOrderPolicy;
import com.weather.Weather.locations.adapters.policy.NoLocationSelectedOnInitPolicy;
import com.weather.Weather.locations.adapters.policy.OmnitureBeaconConfig;
import com.weather.Weather.settings.SettingsActivity;
import com.weather.Weather.ui.TwcDynamicListView;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.feed.LocalyticsMainFeedTag;
import com.weather.commons.analytics.feed.MainFeedSummaryRecorder;
import com.weather.commons.app.TWCBaseActivity;
import com.weather.commons.locations.LocationReceiver;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.locations.LocationChange;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.locations.SavedLocationsSnapshot;
import com.weather.dal2.system.TwcBus;
import java.util.Set;

// Referenced classes of package com.weather.Weather.locations:
//            ManageLocationsInterface, TypeAheadSearchViewUtil

public class LocationManagerActivity extends TWCBaseActivity
    implements ManageLocationsInterface
{

    private ActionMode actionMode;
    private final android.view.ActionMode.Callback actionModeCallback = new android.view.ActionMode.Callback() {

        final LocationManagerActivity this$0;

        public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
        {
            switch (menuitem.getItemId())
            {
            default:
                return false;

            case 2131559263: 
                onDeleteButtonClick();
                break;
            }
            if (adapter.getSelectedLocationsCount() == 0)
            {
                actionmode.finish();
            }
            return true;
        }

        public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
        {
            actionmode.getMenuInflater().inflate(0x7f100002, menu);
            return true;
        }

        public void onDestroyActionMode(ActionMode actionmode)
        {
            adapter.clearSelection();
            actionMode = null;
        }

        public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
        {
            if (adapter.getSelectedLocationsCount() == 0)
            {
                actionmode.finish();
            }
            actionmode.setTitle((new StringBuilder()).append(adapter.getSelectedLocationsCount()).append(" ").append(getString(0x7f07026f)).toString());
            return false;
        }

            
            {
                this$0 = LocationManagerActivity.this;
                super();
            }
    };
    private LocationListAdapter adapter;
    private final android.view.View.OnClickListener addLocation = new android.view.View.OnClickListener() {

        final LocationManagerActivity this$0;

        public void onClick(View view)
        {
            adapter.addFollowMeLocationToFixedLocationsIfAllowed(LocationManagerActivity.this);
        }

            
            {
                this$0 = LocationManagerActivity.this;
                super();
            }
    };
    private final com.weather.Weather.ui.TwcDynamicListView.OnHoverCellListener dragViewListener = new com.weather.Weather.ui.TwcDynamicListView.OnHoverCellListener() {

        final LocationManagerActivity this$0;

        public Drawable onHoverCellCreated(Drawable drawable)
        {
            drawable.setColorFilter(getResources().getColor(0x7f0b004f), android.graphics.PorterDuff.Mode.DARKEN);
            return drawable;
        }

            
            {
                this$0 = LocationManagerActivity.this;
                super();
            }
    };
    private final android.widget.AdapterView.OnItemClickListener locationListClickListener = new android.widget.AdapterView.OnItemClickListener() {

        final LocationManagerActivity this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
label0:
            {
                if (adapter.getItem(i).getTags().isEmpty())
                {
                    adapter.changeSelectState(i);
                    if (actionMode != null)
                    {
                        break label0;
                    }
                    actionMode = startActionMode(actionModeCallback);
                }
                return;
            }
            actionMode.invalidate();
        }

            
            {
                this$0 = LocationManagerActivity.this;
                super();
            }
    };
    private TwcDynamicListView locationListView;
    private TypeAheadSearchViewUtil typeAheadSearchViewUtil;

    public LocationManagerActivity()
    {
    }

    private void updateSnapshot()
    {
        runOnUiThread(new Runnable() {

            final LocationManagerActivity this$0;

            public void run()
            {
                adapter.updateData(locationListView);
            }

            
            {
                this$0 = LocationManagerActivity.this;
                super();
            }
        });
    }

    public void handleIntent(Intent intent)
    {
        if ("android.intent.action.SEARCH".equals(intent.getAction()))
        {
            intent = intent.getStringExtra("query");
            typeAheadSearchViewUtil.doSearch(intent);
        }
    }

    public void onChange(LocationChange locationchange)
    {
        updateSnapshot();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03006c);
        bundle = getActionBar();
        if (bundle != null)
        {
            bundle.setDisplayOptions(14);
        }
        locationListView = (TwcDynamicListView)findViewById(0x7f0d01ae);
        adapter = new LocationListAdapter(this, new SavedLocationsSnapshot(), FollowMePolicy.EXCLUDED, ListOrderPolicy.CHANGEABLE, OmnitureBeaconConfig.NULL, new AllLocationsInclusionPolicy(), new NoLocationSelectedOnInitPolicy());
        adapter.updateData(locationListView);
        locationListView.setAdapter(adapter);
        locationListView.setOnItemClickListener(locationListClickListener);
        locationListView.setOnHoverCellListener(dragViewListener);
        ((RelativeLayout)findViewById(0x7f0d01a7)).setOnClickListener(addLocation);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(0x7f100001, menu);
        menu = new TypeAheadSearchViewUtil(menu, 0x7f0d035b, new LocationReceiver(com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.LOCATION_ADDED));
        menu.setupMainFeedSearchView(this, -1);
        typeAheadSearchViewUtil = menu;
        return true;
    }

    public void onDeleteButtonClick()
    {
        adapter.removeIfAllowed(this);
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
        handleIntent(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 2131559261: 
            startActivity(new Intent(this, com/weather/Weather/settings/SettingsActivity));
            return true;

        case 16908332: 
            onBackPressed();
            return true;
        }
    }

    public void onPause()
    {
        DataAccessLayer.BUS.unregister(this);
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        ActionBar actionbar = getActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(0x7f070191);
        }
        LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.MANAGE_LOCATIONS);
        DataAccessLayer.BUS.register(this);
    }

    protected void onReturnToMainFeed()
    {
        LocalyticsHandler.getInstance().getMainFeedSummaryRecorder().putValue(LocalyticsMainFeedTag.PREVIOUS_SCREEN, com.weather.commons.analytics.LocalyticsTags.ScreenName.MANAGE_LOCATIONS.getName());
    }

    public void onStart()
    {
        super.onStart();
        updateSnapshot();
    }

    public void toastMessage(String s)
    {
        Toast.makeText(this, s, 1).show();
    }




/*
    static ActionMode access$102(LocationManagerActivity locationmanageractivity, ActionMode actionmode)
    {
        locationmanageractivity.actionMode = actionmode;
        return actionmode;
    }

*/


}
