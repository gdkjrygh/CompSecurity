// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.video;

import android.app.ActionBar;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.widget.ImageView;
import com.google.common.base.Preconditions;
import com.weather.Weather.app.BaseWeatherFragment;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.Weather.app.SessionMBaseActivity;
import com.weather.Weather.hurricane.HurricaneCentralActivity;
import com.weather.Weather.video2.VideoFragment;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.LocalyticsVideo2DetailRecorder;
import com.weather.commons.analytics.LocalyticsVideo2SummaryRecorder;
import com.weather.commons.analytics.LocalyticsVideoDetailRecorder;
import com.weather.commons.analytics.LocalyticsVideoSummaryRecorder;
import com.weather.commons.analytics.MultiActivitySummaryManager;
import com.weather.commons.analytics.feed.LocalyticsMainFeedTag;
import com.weather.commons.analytics.feed.MainFeedSummaryRecorder;
import com.weather.commons.analytics.hurricane.HurricaneCentralSummaryRecorder;
import com.weather.commons.locations.LocationUtils;
import com.weather.commons.video2.VideoUtil;
import com.weather.commons.video2.dsx.VideoValidation;
import com.weather.util.device.LocaleUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.parsing.Validation;
import com.weather.util.parsing.ValidationException;
import dagger.ObjectGraph;
import java.util.Map;

// Referenced classes of package com.weather.Weather.video:
//            VideoFragment

public class VideoActivity extends SessionMBaseActivity
{

    public static final String ID_QS_KEY = "id";
    public static final String PLAYLIST_QS_KEY = "pl";
    private static final String TAG = "VideoActivity";
    private static final boolean USE_IMA = VideoUtil.useImaVideoFeature();
    public static final String VIDEO_ASSET_QUERY_LIST_EXTRA = "com.weather.Weather.video.VideoActivity.videoAssetQuery";
    public static final String VIDEO_DMA_EXTRA = "com.weather.Weather.video.VideoActivity.dma";
    private static final String VIDEO_FRAGMENT_TAG = "com.weather.Weather.video.VideoFragment";
    public static final String VIDEO_FROM_MODULE_ID_EXTRA = "com.weather.Weather.video.VideoActivity.fromModuleId";
    public static final String VIDEO_PLAYLIST_OR_COLLECTION_EXTRA = "com.weather.Weather.video.VideoActivity.playlist";
    public static final String VIDEO_PREVIOUS_SCREEN = "com.weather.Weather.video.VideoActivity.previous_screen";
    public static final String VIDEO_REQUESTED_EXTRA = "com.weather.Weather.video.VideoActivity.requested";
    private static ObjectGraph testObjectGraph;
    private ActionBar actionBar;
    LocalyticsHandler localyticsHandler;
    MultiActivitySummaryManager multiActivitySummaryManager;
    private String previousScreen;
    private long timeSpentInVideosStart;
    private BaseWeatherFragment videoFragment;

    public VideoActivity()
    {
    }

    private void convertUriQueryStringToExtras(Intent intent)
    {
        Object obj;
        boolean flag1;
        boolean flag2;
        flag1 = false;
        flag2 = false;
        obj = LocationUtils.getViewIntentUri(intent);
        if (obj == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        String s = ((Uri) (obj)).getQueryParameter("id");
        flag = flag2;
        if (s != null)
        {
            try
            {
                String s1 = Validation.validateUuid("id", s);
                LogUtil.w("VideoActivity", LoggingMetaTags.TWC_DEEPLINK, "found intent uri id=%s", new Object[] {
                    s1
                });
                intent.putExtra("com.weather.Weather.video.VideoActivity.requested", s1);
            }
            catch (ValidationException validationexception)
            {
                LogUtil.w("VideoActivity", LoggingMetaTags.TWC_DEEPLINK, "Validation failed for video ID, ignoring id=%s", new Object[] {
                    s
                });
                flag = flag2;
                continue; /* Loop/switch isn't completed */
            }
            flag = true;
        }
_L6:
        obj = ((Uri) (obj)).getQueryParameter("pl");
        flag1 = flag;
        if (obj == null) goto _L2; else goto _L3
_L3:
        s = VideoValidation.validatePlaylistOrCollectionId("pl", ((String) (obj)));
        LogUtil.w("VideoActivity", LoggingMetaTags.TWC_DEEPLINK, "found intent uri for playlist pl=%s", new Object[] {
            s
        });
        intent.putExtra("com.weather.Weather.video.VideoActivity.playlist", s);
        flag1 = true;
_L2:
        if (flag1)
        {
            if (!USE_IMA)
            {
                break; /* Loop/switch isn't completed */
            }
            localyticsHandler.getLocalyticsVideo2DetailRecorder().recordVideoDeeplink();
            localyticsHandler.getLocalyticsVideo2SummaryRecorder().recordVideoDeeplink();
        }
        return;
        intent;
        LogUtil.w("VideoActivity", LoggingMetaTags.TWC_DEEPLINK, "Validation failed for video playlist id, ignoring pl=%s", new Object[] {
            obj
        });
        flag1 = flag;
        if (true) goto _L2; else goto _L4
_L4:
        localyticsHandler.getLocalyticsVideoDetailRecorder().recordVideoDeeplink();
        localyticsHandler.getLocalyticsVideoSummaryRecorder().recordVideoDeeplink();
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void createFragment()
    {
        Object obj;
        if (VideoUtil.useImaVideoFeature())
        {
            obj = new VideoFragment();
        } else
        {
            obj = new com.weather.Weather.video.VideoFragment();
        }
        videoFragment = ((BaseWeatherFragment) (obj));
        obj = getIntent();
        convertUriQueryStringToExtras(((Intent) (obj)));
        LogUtil.d("VideoActivity", LoggingMetaTags.TWC_VIDEOS, "starting fragment: extras=%s", new Object[] {
            ((Intent) (obj)).getExtras()
        });
        videoFragment.setArguments(((Intent) (obj)).getExtras());
        getFragmentManager().beginTransaction().add(0x7f0d0332, videoFragment, "com.weather.Weather.video.VideoFragment").commit();
    }

    static void setTestObjectGraph(ObjectGraph objectgraph)
    {
        testObjectGraph = objectgraph;
    }

    private void trackOnPause()
    {
        if (!USE_IMA) goto _L2; else goto _L1
_L1:
        localyticsHandler.getLocalyticsVideo2DetailRecorder().recordTimeSpentInVideos(timeSpentInVideosStart);
_L4:
        LogUtil.d("VideoActivity", LoggingMetaTags.TWC_VIDEOS, "Tagging Events: trackOnPause prevScreen %s", new Object[] {
            previousScreen
        });
        localyticsHandler.tagSummaryEvent(LocalyticsEvent.VIDEO_DETAILS);
        return;
_L2:
        LocalyticsVideoDetailRecorder localyticsvideodetailrecorder = localyticsHandler.getLocalyticsVideoDetailRecorder();
        if (!localyticsvideodetailrecorder.getAttributesMap().isEmpty())
        {
            localyticsvideodetailrecorder.recordTimeSpentInVideos(timeSpentInVideosStart);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void trackOnResume()
    {
        LogUtil.d("VideoActivity", LoggingMetaTags.TWC_VIDEOS, "Tagging Events: trackOnResume", new Object[0]);
        if (USE_IMA)
        {
            LocalyticsHandler.getInstance().getLocalyticsVideo2SummaryRecorder().recordVideoResume();
            LocalyticsHandler.getInstance().getLocalyticsVideo2DetailRecorder().recordVideoResume();
            return;
        } else
        {
            LocalyticsHandler.getInstance().getLocalyticsVideoSummaryRecorder().recordVideoResume();
            LocalyticsHandler.getInstance().getLocalyticsVideoDetailRecorder().recordVideoResume();
            return;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        Iterable iterable;
        boolean flag;
        if (configuration.orientation == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        iterable = LoggingMetaTags.TWC_VIDEOS;
        if (flag)
        {
            configuration = "landscape";
        } else
        {
            configuration = "portrait";
        }
        LogUtil.d("VideoActivity", iterable, "orientation changed to %s", new Object[] {
            configuration
        });
        if (!flag) goto _L2; else goto _L1
_L1:
        if (actionBar != null)
        {
            actionBar.hide();
        }
        if (USE_IMA)
        {
            localyticsHandler.getLocalyticsVideo2SummaryRecorder().recordFullScreen();
        } else
        {
            localyticsHandler.getLocalyticsVideoSummaryRecorder().recordFullScreen();
        }
_L4:
        videoFragment.setOrientation(this, flag);
        return;
_L2:
        if (actionBar != null)
        {
            actionBar.show();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onCreate(Bundle bundle)
    {
        boolean flag = true;
        super.onCreate(bundle);
        Object obj;
        if (testObjectGraph == null)
        {
            obj = FlagshipApplication.getInstance().getBaseObjectGraph();
        } else
        {
            obj = testObjectGraph;
        }
        ((ObjectGraph) (obj)).inject(this);
        setContentView(0x7f0300c2);
        actionBar = getActionBar();
        if (actionBar != null)
        {
            if (LocaleUtil.isDeviceInGermanyGerman())
            {
                obj = (ImageView)findViewById(0x102002c);
                if (obj != null)
                {
                    ((ImageView) (obj)).setPadding(getResources().getDimensionPixelOffset(0x7f0a0068), 0, getResources().getDimensionPixelOffset(0x7f0a0069), 0);
                }
                actionBar.setLogo(0x7f02008a);
                actionBar.setTitle("");
            }
            actionBar.setDisplayShowTitleEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        if (bundle != null)
        {
            previousScreen = bundle.getString("com.weather.Weather.video.VideoActivity.previous_screen");
            LogUtil.d("VideoActivity", LoggingMetaTags.TWC_VIDEOS, "Tagging Events: previousScreen retrieved save %s", new Object[] {
                previousScreen
            });
        }
        if (getIntent() != null)
        {
            previousScreen = getIntent().getStringExtra("com.weather.Weather.video.VideoActivity.previous_screen");
            LogUtil.d("VideoActivity", LoggingMetaTags.TWC_VIDEOS, "Tagging Events: previousScreen from intent retrieved save %s", new Object[] {
                previousScreen
            });
        }
        Preconditions.checkNotNull(findViewById(0x7f0d0332));
        if (bundle != null)
        {
            flag = false;
        }
        if (flag)
        {
            createFragment();
        } else
        {
            videoFragment = (BaseWeatherFragment)getFragmentManager().findFragmentByTag("com.weather.Weather.video.VideoFragment");
            if (videoFragment == null)
            {
                createFragment();
                return;
            }
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        LogUtil.d("VideoActivity", LoggingMetaTags.TWC_VIDEOS, "starting fragment onNewIntent: extras=%s", new Object[] {
            intent.getExtras()
        });
        setIntent(intent);
        convertUriQueryStringToExtras(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            break;
        }
        if (wasCreatedFromHurricaneCentralFeed())
        {
            menuitem = new Intent(this, com/weather/Weather/hurricane/HurricaneCentralActivity);
            menuitem.putExtra("com.weather.moduleId", "hurricanes_bulletins");
        } else
        {
            onReturnToMainFeed();
            menuitem = NavUtils.getParentActivityIntent(this);
            menuitem.putExtra("com.weather.moduleId", "video");
        }
        menuitem.addFlags(0x4000000);
        startActivity(menuitem);
        finish();
        return true;
    }

    protected void onPause()
    {
        trackOnPause();
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        timeSpentInVideosStart = System.currentTimeMillis();
        localyticsHandler.tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.VIDEO_DETAILS);
        if (wasCreatedFromHurricaneCentralFeed())
        {
            localyticsHandler.getHurricaneCentralSummaryRecorder().recordResumeOnScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.VIDEO_DETAILS);
            multiActivitySummaryManager.registerSummary(LocalyticsEvent.HURRICANE_CENTRAL_SUMMARY);
        }
        boolean flag;
        if (getResources().getConfiguration().orientation == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        if (actionBar != null)
        {
            actionBar.hide();
        }
        if (USE_IMA)
        {
            localyticsHandler.getLocalyticsVideo2SummaryRecorder().recordFullScreen();
        } else
        {
            localyticsHandler.getLocalyticsVideoSummaryRecorder().recordFullScreen();
        }
_L4:
        videoFragment.setOrientation(this, flag);
        trackOnResume();
        return;
_L2:
        if (actionBar != null)
        {
            actionBar.show();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onReturnToMainFeed()
    {
        localyticsHandler.getMainFeedSummaryRecorder().putValue(LocalyticsMainFeedTag.PREVIOUS_SCREEN, com.weather.commons.analytics.LocalyticsTags.ScreenName.VIDEO_DETAILS.getName());
    }

}
