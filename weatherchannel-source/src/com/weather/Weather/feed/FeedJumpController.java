// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.feed;

import android.os.Bundle;
import android.widget.ListView;
import com.google.common.base.Preconditions;
import com.weather.Weather.ads.AdModule;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.weather.Weather.feed:
//            ModulesManager, ListAutoScroller, Module

public class FeedJumpController
{

    public static final String MODULE_HIDEABLE_EXTRA = "com.weather.isHideable";
    public static final String MODULE_ID_EXTRA = "com.weather.moduleId";
    static final String SCROLL_POSITION_EXTRA = "com.weather.scrollPosition";
    private static final String TAG = "FeedJumpController";
    private Boolean isModuleHideable;
    private final ListAutoScroller listAutoScroller;
    private final ListView moduleListView;
    private String moduleToJumpTo;
    private final ModulesManager modulesManager;
    private int positionToScrollTo;

    public FeedJumpController(ModulesManager modulesmanager, ListAutoScroller listautoscroller, ListView listview)
    {
        positionToScrollTo = -1;
        moduleListView = listview;
        modulesManager = (ModulesManager)Preconditions.checkNotNull(modulesmanager);
        listAutoScroller = (ListAutoScroller)Preconditions.checkNotNull(listautoscroller);
    }

    private int getOffset(int i, int j, int k)
    {
        if (i < j - 1)
        {
            return k;
        } else
        {
            return 0;
        }
    }

    private void jumpToModule(String s, Map map, int i)
    {
        int j = modulesManager.getModulePosition(s);
        LogUtil.d("FeedJumpController", LoggingMetaTags.TWC_UI, "jumpToModule: moduleName=%s, modulePosition=%s", new Object[] {
            s, Integer.valueOf(j)
        });
        jumpToPosition((moduleListView.getHeaderViewsCount() + j) - 1, map, i);
    }

    private void jumpToPosition(int i, Map map, int j)
    {
        if (i >= 0)
        {
            int k = getOffset(i, moduleListView.getCount(), j);
            LogUtil.d("FeedJumpController", LoggingMetaTags.TWC_UI, "jumpToPosition: position=%s, offset=%s", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            });
            List list = modulesManager.getModules();
            setAdTargeting(i - 1, map, list);
            setAdTargeting(i + 1, map, list);
            listAutoScroller.setSelectionFromTop(i, k);
        }
    }

    private void setAdTargeting(int i, Map map, List list)
    {
        i -= moduleListView.getHeaderViewsCount();
        Preconditions.checkNotNull(map);
        if (i >= 0 && i < list.size() && (list.get(i) instanceof AdModule))
        {
            ((AdModule)list.get(i)).setSingleUseAdParameters(map);
        }
    }

    public ModulesManager.ModuleConfigOverride getConfigOverride()
    {
    /* block-local class not found */
    class SingleModuleOverride {}

        return new SingleModuleOverride(moduleToJumpTo, isModuleHideable);
    }

    public boolean jump(Map map, int i)
    {
        if (positionToScrollTo != -1)
        {
            jumpToPosition(positionToScrollTo, map, i);
            return true;
        }
        if (moduleToJumpTo != null)
        {
            jumpToModule(moduleToJumpTo, map, i);
            return true;
        } else
        {
            return false;
        }
    }

    public void resetJumpVariables()
    {
        positionToScrollTo = -1;
        moduleToJumpTo = null;
        isModuleHideable = null;
    }

    public void saveInstanceState(Bundle bundle)
    {
        int k = moduleListView.getFirstVisiblePosition();
        int l = moduleListView.getLastVisiblePosition();
        byte byte0 = -1;
        int i = k;
        do
        {
label0:
            {
                int j = byte0;
                if (i <= l)
                {
                    Object obj = moduleListView.getItemAtPosition(i);
                    if (!(obj instanceof Module))
                    {
                        break label0;
                    }
                    obj = (Module)obj;
                    if (!((Module) (obj)).isMoreThanHalfVisible())
                    {
                        break label0;
                    }
                    bundle.putString("com.weather.moduleId", ((Module) (obj)).getId());
                    LogUtil.d("FeedJumpController", LoggingMetaTags.TWC_UI, "Saving feed instance state to module '%s'", new Object[] {
                        ((Module) (obj)).getId()
                    });
                    j = i;
                }
                if (j == -1)
                {
                    bundle.putInt("com.weather.scrollPosition", (k + l) / 2);
                }
                return;
            }
            i++;
        } while (true);
    }

    public void setJumpVariables(Bundle bundle)
    {
        if (bundle == null)
        {
            resetJumpVariables();
        } else
        {
            positionToScrollTo = bundle.getInt("com.weather.scrollPosition", -1);
            moduleToJumpTo = bundle.getString("com.weather.moduleId");
            if (bundle.containsKey("com.weather.isHideable"))
            {
                bundle = Boolean.valueOf(bundle.getBoolean("com.weather.isHideable", false));
            } else
            {
                bundle = null;
            }
            isModuleHideable = bundle;
        }
        LogUtil.d("FeedJumpController", LoggingMetaTags.TWC_UI, "setJumpPositionFromBundle positionToScrollTo=%s, moduleToJumpTo=%s, isModuleHideable=%s", new Object[] {
            Integer.valueOf(positionToScrollTo), moduleToJumpTo, isModuleHideable
        });
    }
}
