// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.locations.adapters;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.Weather.locations.ManageLocationsInterface;
import com.weather.Weather.locations.adapters.policy.FollowMePolicy;
import com.weather.Weather.locations.adapters.policy.ListOrderPolicy;
import com.weather.Weather.locations.adapters.policy.LocationInclusionPolicy;
import com.weather.Weather.locations.adapters.policy.LocationSelectedOnInitPolicy;
import com.weather.Weather.locations.adapters.policy.OmnitureBeaconConfig;
import com.weather.beacons.analytics.Analytics;
import com.weather.commons.locations.LocationManager;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.locations.SavedLocationsSnapshot;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LocationListAdapter extends BaseAdapter
    implements com.weather.Weather.ui.TwcDynamicListView.Swappable
{

    protected final Set checkedFixedLocations = new HashSet();
    private final Context context;
    private int deselectedLocationCount;
    private List fixedLocations;
    protected boolean followMeChecked;
    private final boolean includeFollowMe;
    private final LocationInclusionPolicy inclusionPolicy;
    private final boolean locationItemsSwappable;
    protected LocationManager locationManager;
    private final String offBeacon;
    private final String onBeacon;
    private int selectedLocationCount;
    private final LocationSelectedOnInitPolicy selectionPolicy;

    public LocationListAdapter(Context context1, SavedLocationsSnapshot savedlocationssnapshot, FollowMePolicy followmepolicy, ListOrderPolicy listorderpolicy, OmnitureBeaconConfig omniturebeaconconfig, LocationInclusionPolicy locationinclusionpolicy, LocationSelectedOnInitPolicy locationselectedoninitpolicy)
    {
        boolean flag1 = true;
        super();
        locationManager = FlagshipApplication.getInstance().getLocationManager();
        context = (Context)Preconditions.checkNotNull(context1);
        boolean flag;
        if (followmepolicy == FollowMePolicy.INCLUDED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        includeFollowMe = flag;
        onBeacon = omniturebeaconconfig.onBeacon;
        offBeacon = omniturebeaconconfig.offBeacon;
        if (listorderpolicy == ListOrderPolicy.CHANGEABLE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        locationItemsSwappable = flag;
        inclusionPolicy = (LocationInclusionPolicy)Preconditions.checkNotNull(locationinclusionpolicy);
        selectionPolicy = (LocationSelectedOnInitPolicy)Preconditions.checkNotNull(locationselectedoninitpolicy);
        Preconditions.checkNotNull(savedlocationssnapshot);
        fixedLocations = new ArrayList(savedlocationssnapshot.getFixedLocations().size());
        context1 = savedlocationssnapshot.getFixedLocations().iterator();
        do
        {
            if (!context1.hasNext())
            {
                break;
            }
            savedlocationssnapshot = (SavedLocation)context1.next();
            if (isValid(savedlocationssnapshot))
            {
                fixedLocations.add(savedlocationssnapshot);
            }
            if (isDefaultSelected(savedlocationssnapshot))
            {
                checkedFixedLocations.add(savedlocationssnapshot);
            }
        } while (true);
        if (isFollowMeIncluded() && isDefaultSelected(locationManager.getFollowMeLocation()))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        followMeChecked = flag;
    }

    private boolean isDefaultSelected(SavedLocation savedlocation)
    {
        return selectionPolicy.isSelected(savedlocation);
    }

    private boolean isFollowMeIncluded()
    {
        return includeFollowMe && isFollowMeTurnedOn();
    }

    private boolean isFollowMeTurnedOn()
    {
        return locationManager.getFollowMeLocation() != null && isValid(locationManager.getFollowMeLocation());
    }

    private boolean isValid(SavedLocation savedlocation)
    {
        return inclusionPolicy.includes(savedlocation);
    }

    private void setListViewHeightBasedOnChildren(ListView listview)
    {
        int i = 0;
        int j = android.view.View.MeasureSpec.makeMeasureSpec(listview.getWidth(), 0x80000000);
        if (getCount() > 0)
        {
            View view = getView(0, null, listview);
            view.measure(j, 0);
            i = view.getMeasuredHeight() * getCount();
        }
        android.view.ViewGroup.LayoutParams layoutparams = listview.getLayoutParams();
        layoutparams.height = listview.getDividerHeight() * (getCount() - 1) + i;
        listview.setLayoutParams(layoutparams);
        listview.requestLayout();
    }

    private SavedLocation toLocation(int i)
    {
        if (isFollowMeIncluded())
        {
            if (positionRefersToFollowMe(i))
            {
                return locationManager.getFollowMeLocation();
            } else
            {
                return (SavedLocation)fixedLocations.get(i - 1);
            }
        } else
        {
            return (SavedLocation)fixedLocations.get(i);
        }
    }

    public void addFollowMeLocationToFixedLocationsIfAllowed(ManageLocationsInterface managelocationsinterface)
    {
        SavedLocation savedlocation = locationManager.getFollowMeLocation();
        if (savedlocation != null)
        {
            if (!locationManager.addFixedLocation(savedlocation))
            {
                managelocationsinterface.toastMessage(context.getString(0x7f0700d8));
            }
            return;
        } else
        {
            managelocationsinterface.toastMessage(context.getString(0x7f07030c));
            return;
        }
    }

    public void changeSelectState(int i)
    {
        Object obj = toLocation(i);
        if (positionRefersToFollowMe(i))
        {
            boolean flag;
            if (!followMeChecked)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            followMeChecked = flag;
            if (followMeChecked)
            {
                obj = onBeacon;
                selectedLocationCount = selectedLocationCount + 1;
            } else
            {
                obj = offBeacon;
                deselectedLocationCount = deselectedLocationCount + 1;
            }
        } else
        if (checkedFixedLocations.contains(obj))
        {
            checkedFixedLocations.remove(obj);
            obj = offBeacon;
            deselectedLocationCount = deselectedLocationCount + 1;
        } else
        {
            checkedFixedLocations.add(obj);
            obj = onBeacon;
            selectedLocationCount = selectedLocationCount + 1;
        }
        if (obj != null)
        {
            Analytics.trackAction(((String) (obj)), null);
        }
        notifyDataSetChanged();
    }

    public void clearSelection()
    {
        if (!checkedFixedLocations.isEmpty())
        {
            checkedFixedLocations.clear();
        }
        if (isFollowMeIncluded())
        {
            followMeChecked = false;
        }
        notifyDataSetChanged();
    }

    public int getCount()
    {
        int j = fixedLocations.size();
        int i = j;
        if (isFollowMeIncluded())
        {
            i = j + 1;
        }
        return i;
    }

    public int getDeselectClickCount()
    {
        return deselectedLocationCount;
    }

    public SavedLocation getItem(int i)
    {
        return toLocation(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        if (positionRefersToFollowMe(i))
        {
            return (long)(new StringBuilder()).append(toLocation(i).getKeyTypeCountry()).append("followme").toString().hashCode();
        } else
        {
            return (long)toLocation(i).getKeyTypeCountry().hashCode();
        }
    }

    public int getSelectClickCount()
    {
        return selectedLocationCount;
    }

    public int getSelectedLocationsCount()
    {
        int j = checkedFixedLocations.size();
        int i = j;
        if (isFollowMeIncluded())
        {
            i = j;
            if (followMeChecked)
            {
                i = j + 1;
            }
        }
        return i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj = view;
        SavedLocation savedlocation = toLocation(i);
        view = ((View) (obj));
    /* block-local class not found */
    class ViewHolder {}

        int j;
        if (obj == null)
        {
            view = LayoutInflater.from(context).inflate(0x7f03006d, viewgroup, false);
            viewgroup = new ViewHolder(null);
            ViewHolder.access._mth102(viewgroup, (TextView)view.findViewById(0x7f0d019e));
            ViewHolder.access._mth202(viewgroup, (TextView)view.findViewById(0x7f0d01b2));
            ViewHolder.access._mth302(viewgroup, (ImageView)view.findViewById(0x7f0d01af));
            if (!savedlocation.getTags().isEmpty())
            {
                ViewHolder.access._mth100(viewgroup).setEnabled(false);
                ViewHolder.access._mth300(viewgroup).setAlpha(0.5F);
            }
            obj = (ImageView)view.findViewById(0x7f0d01b1);
            if (locationItemsSwappable)
            {
                ((ImageView) (obj)).setVisibility(0);
            } else
            {
                ((ImageView) (obj)).setVisibility(4);
            }
            view.setTag(viewgroup);
        }
        viewgroup = (ViewHolder)view.getTag();
        obj = savedlocation.getKeyTypeCountry();
        if (LogUtil.isLoggable(LoggingMetaTags.TWC_DEEPLINK, 3) && obj != null && !((String) (obj)).isEmpty())
        {
            ViewHolder.access._mth200(viewgroup).setVisibility(0);
            ViewHolder.access._mth200(viewgroup).setText(((CharSequence) (obj)));
        } else
        {
            ViewHolder.access._mth200(viewgroup).setVisibility(8);
        }
        if (checkedFixedLocations.contains(savedlocation))
        {
            j = 0x7f02001b;
        } else
        {
            j = 0x7f02001a;
        }
        obj = savedlocation.getNickname();
        if (positionRefersToFollowMe(i))
        {
            ViewHolder.access._mth100(viewgroup).setText((new StringBuilder()).append(((String) (obj))).append(" (").append(context.getString(0x7f070124)).append(')').toString());
            if (followMeChecked)
            {
                j = 0x7f02001b;
            } else
            {
                j = 0x7f02001a;
            }
        } else
        {
            ViewHolder.access._mth100(viewgroup).setText(((CharSequence) (obj)));
        }
        ViewHolder.access._mth300(viewgroup).setImageResource(j);
        return view;
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public boolean isSelected(int i)
    {
        if (positionRefersToFollowMe(i))
        {
            return followMeChecked;
        } else
        {
            return checkedFixedLocations.contains(toLocation(i));
        }
    }

    public boolean positionRefersToFollowMe(int i)
    {
        return isFollowMeIncluded() && i == 0;
    }

    public void removeIfAllowed(ManageLocationsInterface managelocationsinterface)
    {
        if (getCount() == 0)
        {
            managelocationsinterface.toastMessage(context.getString(0x7f0701f1));
            return;
        }
        if (!isFollowMeTurnedOn() && getCount() == checkedFixedLocations.size())
        {
            managelocationsinterface.toastMessage(context.getString(0x7f07005e));
            return;
        } else
        {
            locationManager.removeLocations(context, checkedFixedLocations);
            checkedFixedLocations.clear();
            return;
        }
    }

    public void swapItems(int i, int j)
    {
        if (i < fixedLocations.size() && j < fixedLocations.size())
        {
            locationManager.moveFixedLocations(i, j);
            fixedLocations = locationManager.getFixedLocations();
            notifyDataSetChanged();
        }
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        if (datasetobserver == null)
        {
            return;
        } else
        {
            super.unregisterDataSetObserver(datasetobserver);
            return;
        }
    }

    public void updateData(ListView listview)
    {
        this;
        JVM INSTR monitorenter ;
        fixedLocations = locationManager.getFixedLocations();
        notifyDataSetChanged();
        if (listview == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        setListViewHeightBasedOnChildren(listview);
        this;
        JVM INSTR monitorexit ;
        return;
        listview;
        throw listview;
    }
}
