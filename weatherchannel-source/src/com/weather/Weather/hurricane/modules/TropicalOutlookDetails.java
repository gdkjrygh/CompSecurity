// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane.modules;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v4.util.Pair;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.Weather.nhc.NhcWeatherAlertFetcher;
import com.weather.ads2.ui.AdHolder;
import com.weather.ads2.ui.DfpAd;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.LocalyticsRecorder;
import com.weather.commons.analytics.MultiActivitySummaryManager;
import com.weather.commons.analytics.hurricane.BasinAttributeValue;
import com.weather.commons.analytics.hurricane.HurricaneCentralSummaryRecorder;
import com.weather.commons.analytics.hurricane.HurricaneCentralTag;
import com.weather.commons.app.TWCBaseActivity;
import com.weather.commons.facade.WeatherAlert;
import com.weather.dal2.net.Receiver;
import com.weather.util.date.DateUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import dagger.ObjectGraph;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public class TropicalOutlookDetails extends TWCBaseActivity
{
    private static class Basin
    {

        String id;
        Integer resourceId;

        Basin(String s, Integer integer)
        {
            resourceId = integer;
            id = s;
        }
    }

    public static final class BasinGroup extends Enum
    {

        private static final BasinGroup $VALUES[];
        public static final BasinGroup ATLANTIC;
        public static final BasinGroup ATLANTIC_ES;
        public static final BasinGroup PACIFIC;
        final ImmutableList basins;
        final BasinAttributeValue localyticsValue;

        public static BasinGroup valueOf(String s)
        {
            return (BasinGroup)Enum.valueOf(com/weather/Weather/hurricane/modules/TropicalOutlookDetails$BasinGroup, s);
        }

        public static BasinGroup[] values()
        {
            return (BasinGroup[])$VALUES.clone();
        }

        static 
        {
            ATLANTIC = new BasinGroup("ATLANTIC", 0, ImmutableList.of(new Basin("XXZ021", Integer.valueOf(0x7f070060))), BasinAttributeValue.ATLANTIC);
            ATLANTIC_ES = new BasinGroup("ATLANTIC_ES", 1, ImmutableList.of(new Basin("XXZ004", Integer.valueOf(0x7f070086))), BasinAttributeValue.ATLANTIC);
            PACIFIC = new BasinGroup("PACIFIC", 2, ImmutableList.of(new Basin("XXZ007", Integer.valueOf(0x7f0700ea)), new Basin("XXZ014", Integer.valueOf(0x7f0701f6))), BasinAttributeValue.EASTERN_PACIFIC);
            $VALUES = (new BasinGroup[] {
                ATLANTIC, ATLANTIC_ES, PACIFIC
            });
        }

        private BasinGroup(String s, int i, ImmutableList immutablelist, BasinAttributeValue basinattributevalue)
        {
            super(s, i);
            basins = immutablelist;
            localyticsValue = basinattributevalue;
        }
    }

    private static class TropicalOutlookDetailsExpandableListAdapter extends BaseExpandableListAdapter
    {

        private final List basinAlertPairList;
        private final LayoutInflater inflater;

        public Object getChild(int i, int j)
        {
            return inflater.getContext().getString(((Basin)((Pair)basinAlertPairList.get(i)).first).resourceId.intValue());
        }

        public long getChildId(int i, int j)
        {
            return (long)j;
        }

        public View getChildView(int i, int j, boolean flag, View view, ViewGroup viewgroup)
        {
            if (view == null)
            {
                view = inflater.inflate(0x7f0300af, viewgroup, false);
                viewgroup = new ViewHolderContentTropicalOutlook(view);
                view.setTag(viewgroup);
            } else
            {
                viewgroup = (ViewHolderContentTropicalOutlook)view.getTag();
            }
            viewgroup.setData((WeatherAlert)((Pair)basinAlertPairList.get(i)).second);
            return view;
        }

        public int getChildrenCount(int i)
        {
            if (((Pair)basinAlertPairList.get(i)).second != null)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            return i == 0 ? 0 : 1;
        }

        public Object getGroup(int i)
        {
            return ((Pair)basinAlertPairList.get(i)).second;
        }

        public int getGroupCount()
        {
            return basinAlertPairList.size();
        }

        public long getGroupId(int i)
        {
            return (long)i;
        }

        public View getGroupView(int i, boolean flag, View view, ViewGroup viewgroup)
        {
            View view1;
            ViewHolderBasinTitle viewholderbasintitle;
            Object obj;
            Object obj1;
            if (view == null)
            {
                view1 = inflater.inflate(0x7f0300b1, viewgroup, false);
                viewholderbasintitle = new ViewHolderBasinTitle(view1);
                view1.setTag(viewholderbasintitle);
            } else
            {
                viewholderbasintitle = (ViewHolderBasinTitle)view.getTag();
                view1 = view;
            }
            if (basinAlertPairList.isEmpty()) goto _L2; else goto _L1
_L1:
            view = (WeatherAlert)((Pair)basinAlertPairList.get(i)).second;
            if (view == null) goto _L4; else goto _L3
_L3:
            obj = view.getAlertIssueTime();
            obj1 = new SimpleDateFormat("yyyyMMddhhmm zzz", Locale.getDefault());
            view = viewgroup.getContext().getString(0x7f07030a);
            view = (new StringBuilder()).append(view).append(" ").toString();
            if (obj != null) goto _L6; else goto _L5
_L5:
            try
            {
                view = viewgroup.getContext().getString(0x7f0701eb);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                view = viewgroup.getContext().getString(0x7f0701eb);
            }
_L8:
            viewholderbasintitle.setData(inflater.getContext().getString(((Basin)((Pair)basinAlertPairList.get(i)).first).resourceId.intValue()), view);
            if (basinAlertPairList.size() == 1 && !flag)
            {
                ((ExpandableListView)viewgroup).expandGroup(i);
            }
_L2:
            return view1;
_L6:
            obj = ((SimpleDateFormat) (obj1)).parse((new StringBuilder()).append(obj).append(" GMT").toString());
            obj1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.getDefault()).getTime();
            obj1 = (new SimpleDateFormat("Z", Locale.getDefault())).format(((Date) (obj1)));
            view = (new StringBuilder()).append(view).append(DateUtil.getUserFormattedTime(((Date) (obj)).getTime(), ((String) (obj1)), viewgroup.getContext())).toString();
            view = (new StringBuilder()).append(view).append(' ').append(TimeZone.getDefault().getDisplayName(true, 0, Locale.getDefault())).toString();
            continue; /* Loop/switch isn't completed */
_L4:
            view = viewgroup.getContext().getString(0x7f0701eb);
            if (true) goto _L8; else goto _L7
_L7:
        }

        public boolean hasStableIds()
        {
            return true;
        }

        public boolean isChildSelectable(int i, int j)
        {
            return true;
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

        TropicalOutlookDetailsExpandableListAdapter(Collection collection, Context context)
        {
            basinAlertPairList = ImmutableList.copyOf(collection);
            inflater = LayoutInflater.from(context);
        }
    }

    private static final class ViewHolderBasinTitle
    {

        private final TextView basinTitle;
        private final TextView lastUpdated;

        public void setData(CharSequence charsequence, CharSequence charsequence1)
        {
            basinTitle.setText(charsequence);
            lastUpdated.setText(charsequence1);
        }

        ViewHolderBasinTitle(View view)
        {
            basinTitle = (TextView)view.findViewById(0x7f0d02c8);
            lastUpdated = (TextView)view.findViewById(0x7f0d02c9);
        }
    }

    private static final class ViewHolderContentTropicalOutlook
    {

        private final TextView tropicalOutlookContentTextView;

        public void setData(WeatherAlert weatheralert)
        {
            if (weatheralert != null)
            {
                StringBuilder stringbuilder = new StringBuilder();
                Iterator iterator = ((List)weatheralert.getParameters().get("MND")).iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    String s1 = (String)iterator.next();
                    if (!s1.isEmpty())
                    {
                        stringbuilder.append(s1);
                        stringbuilder.append('\n');
                    }
                } while (true);
                stringbuilder.append('\n');
                for (weatheralert = weatheralert.getWarningText().iterator(); weatheralert.hasNext();)
                {
                    String s = (String)weatheralert.next();
                    if (!s.isEmpty())
                    {
                        stringbuilder.append(s);
                    } else
                    {
                        stringbuilder.append("\n\n");
                    }
                }

                tropicalOutlookContentTextView.setText(stringbuilder.toString());
            }
        }

        ViewHolderContentTropicalOutlook(View view)
        {
            tropicalOutlookContentTextView = (TextView)view.findViewById(0x7f0d02c1);
        }
    }


    public static final String BASIN_GROUP_EXTRA = "basinGroup";
    private static final String TAG = "TropicalOutlookDetails";
    private static ObjectGraph testingGraph;
    private final AdHolder adHolder;
    private BasinGroup basinGroup;
    private final DfpAd dfpAd = DfpAd.builder().build();
    private ExpandableListView expandableListView;
    LocalyticsHandler localyticsHandler;
    MultiActivitySummaryManager multiActivitySummaryManager;
    NhcWeatherAlertFetcher nhcWeatherAlertFetcher;

    public TropicalOutlookDetails()
    {
        adHolder = new AdHolder(dfpAd);
    }

    private void handleIntent()
    {
        Intent intent = getIntent();
        if (intent != null)
        {
            addInitialTargetingToAd(dfpAd, intent);
            if (basinGroup != null)
            {
                setInitialData(basinGroup);
                return;
            }
        }
    }

    private void setActionBar()
    {
        ActionBar actionbar = getActionBar();
        if (actionbar != null)
        {
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setDisplayShowTitleEnabled(true);
            if (android.os.Build.VERSION.SDK_INT < 19)
            {
                actionbar.setDisplayShowTitleEnabled(false);
                actionbar.setDisplayShowTitleEnabled(true);
            }
        }
    }

    private void setInitialData(final BasinGroup basinGroup)
    {
        nhcWeatherAlertFetcher.refresh(false, new Receiver() {

            final TropicalOutlookDetails this$0;
            final BasinGroup val$basinGroup;

            public volatile void onCompletion(Object obj, Object obj1)
            {
                onCompletion((List)obj, obj1);
            }

            public void onCompletion(List list, Object obj)
            {
            /* block-local class not found */
            class _cls1 {}

                runOnUiThread(new _cls1(list));
            }

            public void onError(Throwable throwable, Object obj)
            {
                LogUtil.e("TropicalOutlookDetails", LoggingMetaTags.TWC_UI, "Failed to get Nhc details data", new Object[] {
                    throwable.getMessage()
                });
            }

            
            {
                this$0 = TropicalOutlookDetails.this;
                basinGroup = basingroup;
                super();
            }
        }, null);
    }

    static void setTestingGraph(ObjectGraph objectgraph)
    {
        testingGraph = objectgraph;
    }

    private void setTropicalOutlooksList(List list)
    {
        expandableListView.setAdapter(new TropicalOutlookDetailsExpandableListAdapter(list, this));
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Object obj;
        if (testingGraph == null)
        {
            bundle = FlagshipApplication.getInstance().getBaseObjectGraph();
        } else
        {
            bundle = testingGraph;
        }
        bundle.inject(this);
        setContentView(0x7f0300ae);
        obj = findViewById(0x7f0d02be);
        expandableListView = (ExpandableListView)findViewById(0x7f0d02c0);
        expandableListView.setOnGroupExpandListener(new android.widget.ExpandableListView.OnGroupExpandListener() {

            final TropicalOutlookDetails this$0;

            public void onGroupExpand(int i)
            {
                localyticsHandler.getTropicalOutlookSummaryRecorder().incrementValue(HurricaneCentralTag.OUTLOOKS_EXPANDED);
            }

            
            {
                this$0 = TropicalOutlookDetails.this;
                super();
            }
        });
        bundle = (ImageView)findViewById(0x7f0d02bf);
        dfpAd.init(((View) (obj)));
        adHolder.init("weather.hurricane.details");
        setActionBar();
        obj = getIntent().getExtras();
        if (obj == null) goto _L2; else goto _L1
_L1:
        basinGroup = (BasinGroup)((Bundle) (obj)).get("basinGroup");
        if (basinGroup == null) goto _L2; else goto _L3
_L3:
        if (basinGroup != BasinGroup.ATLANTIC && basinGroup != BasinGroup.ATLANTIC_ES) goto _L5; else goto _L4
_L4:
        Picasso.with(this).load(getString(0x7f0705b5)).placeholder(0x7f020450).into(bundle);
_L7:
        handleIntent();
_L2:
        return;
_L5:
        if (basinGroup == BasinGroup.PACIFIC)
        {
            Picasso.with(this).load(getString(0x7f0705b6)).placeholder(0x7f020450).into(bundle);
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected void onDestroy()
    {
        adHolder.destroy();
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            menuitem = NavUtils.getParentActivityIntent(this);
            break;
        }
        menuitem.addFlags(0x4000000);
        menuitem.putExtra("com.weather.moduleId", "tropical-outlook");
        startActivity(menuitem);
        finish();
        return true;
    }

    protected void onPause()
    {
        adHolder.pause();
        localyticsHandler.tagSummaryEvent(LocalyticsEvent.HC_TROPICAL_OUTLOOK);
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        adHolder.resume();
        localyticsHandler.tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.TROPICAL_OUTLOOK);
        localyticsHandler.getHurricaneCentralSummaryRecorder().recordResumeOnScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.TROPICAL_OUTLOOK);
        multiActivitySummaryManager.registerSummary(LocalyticsEvent.HURRICANE_CENTRAL_SUMMARY);
        if (basinGroup != null)
        {
            localyticsHandler.getTropicalOutlookSummaryRecorder().putValueIfAbsent(HurricaneCentralTag.OUTLOOK_BASIN, basinGroup.localyticsValue.getAttributeValue());
        }
    }

}
