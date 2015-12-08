// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.feed;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.weather.Weather.app.VisibleView;
import com.weather.Weather.ui.Refreshable;
import com.weather.beacons.targeting.BeaconTargetingParam;
import com.weather.commons.analytics.feed.LocalyticsModuleHandler;
import com.weather.commons.config.ModuleConfig;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.lang.ref.WeakReference;
import java.util.EnumMap;
import java.util.Map;

public abstract class Module
    implements VisibleView, Refreshable
{

    protected static final String EMPTY_STRING = "";
    protected final String TAG = getClass().getSimpleName();
    private boolean active;
    protected final String adSlotName;
    public final Map adjacentAdParameters;
    private final Map beaconData = new EnumMap(com/weather/beacons/targeting/BeaconTargetingParam);
    protected final ModuleConfig config;
    protected Context context;
    private Object data;
    public final String description;
    private final String feedId;
    protected final Handler handler;
    private final String id;
    protected final boolean isHideable;
    private boolean isVisibleAfterBeingMoreThanHalfVisible;
    private final LocalyticsModuleHandler localyticsModuleHandler;
    private WeakReference viewReference;
    protected boolean visible;

    protected Module(Context context1, ModuleConfig moduleconfig, Handler handler1, LocalyticsModuleHandler localyticsmodulehandler)
    {
        viewReference = new WeakReference(null);
        config = (ModuleConfig)Preconditions.checkNotNull(moduleconfig);
        localyticsModuleHandler = (LocalyticsModuleHandler)Preconditions.checkNotNull(localyticsmodulehandler);
        context = (Context)Preconditions.checkNotNull(context1);
        id = moduleconfig.id;
        description = moduleconfig.description;
        adjacentAdParameters = ImmutableMap.copyOf(moduleconfig.adjacentAdParameters);
        adSlotName = moduleconfig.adSlotName;
        isHideable = moduleconfig.isHideable;
        feedId = moduleconfig.getFeedId();
        handler = handler1;
        boolean flag;
        if (!isHideable)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        active = flag;
    }

    protected abstract View createView(ViewGroup viewgroup);

    public void destroy()
    {
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (this == obj)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (getClass() == obj.getClass())
                {
                    obj = (Module)obj;
                    flag = flag1;
                    if (isHideable == ((Module) (obj)).isHideable)
                    {
                        flag = flag1;
                        if (adSlotName.equals(((Module) (obj)).adSlotName))
                        {
                            return id.equals(((Module) (obj)).id);
                        }
                    }
                }
            }
        }
        return flag;
    }

    protected void fireBeacon()
    {
    }

    public String getFeedId()
    {
        return feedId;
    }

    public String getId()
    {
        return id;
    }

    public View getView(ViewGroup viewgroup)
    {
        View view1 = (View)viewReference.get();
        View view = view1;
        if (view1 == null)
        {
            view = createView(viewgroup);
            view.setTag(new WeakReference(this));
            viewReference = new WeakReference(view);
            updateUi(data);
        }
        return view;
    }

    public int hashCode()
    {
        int j = id.hashCode();
        int i;
        if (isHideable)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return (j * 31 + i) * 31 + adSlotName.hashCode();
    }

    public void init(int i)
    {
        beaconData.put(BeaconTargetingParam.CARD_POSITION, Integer.toString(i));
    }

    public boolean isActive()
    {
        return active;
    }

    public boolean isMoreThanHalfVisible()
    {
        if (visible)
        {
            return isViewMoreThenHalfVisible();
        } else
        {
            return false;
        }
    }

    public boolean isViewMoreThenHalfVisible()
    {
        boolean flag1 = false;
        View view = (View)viewReference.get();
        boolean flag = flag1;
        if (view != null)
        {
            flag = flag1;
            if (view.getParent() instanceof ViewGroup)
            {
                Rect rect = new Rect();
                ((ViewGroup)view.getParent()).getHitRect(rect);
                flag = flag1;
                if (view.getLocalVisibleRect(rect))
                {
                    flag = flag1;
                    if (rect.height() > view.getHeight() / 2)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public void markModuleInFeed()
    {
        if (active)
        {
            localyticsModuleHandler.recordInFeed();
            if (isVisibleAfterBeingMoreThanHalfVisible)
            {
                localyticsModuleHandler.viewIsMoreThanHalfVisible();
                fireBeacon();
            }
        }
    }

    public void modulePreviousItemMoreThenHalfVisible()
    {
    }

    public void modulePreviousItemNoMoreVisible()
    {
    }

    public void noLongerVisible()
    {
        visible = false;
        isVisibleAfterBeingMoreThanHalfVisible = false;
        localyticsModuleHandler.viewIsNotVisible();
        onNoLongerVisible();
    }

    protected void onNoLongerVisible()
    {
    }

    protected void onRecycle(View view)
    {
        LogUtil.d(TAG, LoggingMetaTags.TWC_UI, "onRecycle", new Object[0]);
    }

    protected void onScroll()
    {
    }

    protected void onSettle()
    {
    }

    public void pause()
    {
        LogUtil.v(TAG, LoggingMetaTags.TWC_UI, "pause id=%s, feedId=%s", new Object[] {
            id, feedId
        });
    }

    public void recycle(View view)
    {
        onRecycle(view);
    }

    public void resume()
    {
        LogUtil.v(TAG, LoggingMetaTags.TWC_UI, "resume id=%s, feedId=%s", new Object[] {
            id, feedId
        });
    }

    public void runRefresh()
    {
    }

    public void scrollingItemIsVisible()
    {
    }

    protected void setActive(boolean flag)
    {
        if (active == flag)
        {
            return;
        }
        if (flag)
        {
            localyticsModuleHandler.recordInFeed();
            if (isVisibleAfterBeingMoreThanHalfVisible)
            {
                localyticsModuleHandler.viewIsMoreThanHalfVisible();
                fireBeacon();
            }
        }
        active = flag;
    }

    protected void setModuleData(Object obj)
    {
        handler.post(new _cls1(obj));
    }

    protected void startActivity(Class class1)
    {
        class1 = new Intent(context, class1);
        if (feedId != null)
        {
            class1.putExtra("com.weather.fromFeed", feedId);
        }
        context.startActivity(class1);
    }

    protected abstract void updateUi(Object obj);

    public final void visibleItemIsScrolling()
    {
        onScroll();
    }

    public final void visibleItemIsSettled()
    {
        visible = true;
        if (!isVisibleAfterBeingMoreThanHalfVisible)
        {
            isVisibleAfterBeingMoreThanHalfVisible = isMoreThanHalfVisible();
            if (isVisibleAfterBeingMoreThanHalfVisible && active)
            {
                localyticsModuleHandler.viewIsMoreThanHalfVisible();
                fireBeacon();
            }
        }
        onSettle();
    }


/*
    static Object access$002(Module module, Object obj)
    {
        module.data = obj;
        return obj;
    }

*/


    /* member class not found */
    class _cls1 {}

}
