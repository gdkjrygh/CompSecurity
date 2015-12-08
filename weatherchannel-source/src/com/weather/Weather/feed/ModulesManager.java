// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.feed;

import android.content.Context;
import android.os.Handler;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.weather.Weather.ads.AdModule;
import com.weather.Weather.app.AdBaseModule;
import com.weather.Weather.ui.Refreshable;
import com.weather.ads2.config.AdSlot;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.config.ModulesConfig;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.system.TwcBus;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.Weather.feed:
//            ModulesFactory, FeedAdConfig, Module

public class ModulesManager
    implements Refreshable
{
    public static interface ModuleConfigOverride
    {

        public abstract Boolean isHideable(String s);
    }


    private static final String TAG = "ModulesManager";
    private final Supplier adConfigSupplier;
    private List adModules;
    private List adsInFeed;
    private boolean alive;
    private final List allModulesIncludingAds = new ArrayList();
    private final Context context;
    private final Supplier modulesConfigSupplier;
    private final ModulesFactory modulesFactory;
    private final List regularModules = new ArrayList();
    private final Handler updateHandler = new Handler();

    public ModulesManager(Context context1, Supplier supplier, Supplier supplier1, ModulesFactory modulesfactory)
    {
        adModules = ImmutableList.of();
        adsInFeed = ImmutableList.of();
        alive = true;
        context = (Context)Preconditions.checkNotNull(context1);
        modulesConfigSupplier = (Supplier)Preconditions.checkNotNull(supplier);
        adConfigSupplier = (Supplier)Preconditions.checkNotNull(supplier1);
        modulesFactory = (ModulesFactory)Preconditions.checkNotNull(modulesfactory);
    }

    private List createAdModules(FeedAdConfig feedadconfig)
    {
        Object obj = feedadconfig.getFeedAdSlots();
        feedadconfig = ImmutableList.builder();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = (AdSlot)((Iterator) (obj)).next();
            obj1 = (AdModule)modulesFactory.makeModule(context, updateHandler, ModuleConfig.createConfigForAd(((AdSlot) (obj1)).getSlotName()), null);
            if (obj1 != null)
            {
                feedadconfig.add(obj1);
            }
        } while (true);
        return feedadconfig.build();
    }

    private List decorateWithAdModules(List list)
    {
        FeedAdConfig feedadconfig = (FeedAdConfig)adConfigSupplier.get();
        if (adModules.isEmpty())
        {
            adModules = createAdModules(feedadconfig);
            if (adModules.isEmpty())
            {
                return list;
            }
        }
        ArrayList arraylist = new ArrayList(list);
        int l = feedadconfig.getInterval();
        int k = feedadconfig.getStartPosition();
        int j = 0;
        int i = 0;
        if (l > 0)
        {
            int i1 = list.size();
            k--;
            do
            {
                j = i;
                if (k >= i1 + i)
                {
                    break;
                }
                j = i;
                if (i >= adModules.size())
                {
                    break;
                }
                list = (AdModule)adModules.get(i);
                arraylist.add(k, list);
                boolean flag = false;
                if (k > 0)
                {
                    list.setExtraTargetingParameters(((Module)arraylist.get(k - 1)).adjacentAdParameters, false);
                    flag = true;
                }
                if (k < arraylist.size() - 1)
                {
                    list.setExtraTargetingParameters(((Module)arraylist.get(k + 1)).adjacentAdParameters, flag);
                }
                k += l + 1;
                i++;
            } while (true);
        }
        list = adModules.subList(0, j);
        unregisterModules(Collections2.filter(adsInFeed, Predicates.not(Predicates.in(list))));
        registerModules(Collections2.filter(list, Predicates.not(Predicates.in(adsInFeed))));
        adsInFeed = list;
        return arraylist;
    }

    private static void destroyModules(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); ((Module)iterable.next()).destroy()) { }
    }

    private static void pauseModules(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); ((Module)iterable.next()).pause()) { }
    }

    private static void registerModules(Iterable iterable)
    {
        Module module;
        for (iterable = iterable.iterator(); iterable.hasNext(); DataAccessLayer.BUS.register(module))
        {
            module = (Module)iterable.next();
            LogUtil.d("ModulesManager", LoggingMetaTags.TWC_UI, "register module: %s", new Object[] {
                module
            });
        }

    }

    private static void resumeModules(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); ((Module)iterable.next()).resume()) { }
    }

    private void setModules(Collection collection)
    {
        LogUtil.d("ModulesManager", LoggingMetaTags.TWC_UI, "setModules", new Object[0]);
        pauseModules(regularModules);
        unregisterModules(regularModules);
        destroyModules(regularModules);
        regularModules.clear();
        regularModules.addAll(collection);
        allModulesIncludingAds.clear();
        allModulesIncludingAds.addAll(decorateWithAdModules(regularModules));
        int i = 0;
        for (collection = allModulesIncludingAds.iterator(); collection.hasNext();)
        {
            ((Module)collection.next()).init(i);
            i++;
        }

        registerModules(regularModules);
        resumeModules();
    }

    private static void unregisterModules(Iterable iterable)
    {
        Module module;
        for (iterable = iterable.iterator(); iterable.hasNext(); DataAccessLayer.BUS.unregister(module))
        {
            module = (Module)iterable.next();
            LogUtil.d("ModulesManager", LoggingMetaTags.TWC_UI, "unregister module: %s", new Object[] {
                module
            });
        }

    }

    public void createAdViews(AbsListView abslistview, ListAdapter listadapter)
    {
        Preconditions.checkNotNull(abslistview);
        Preconditions.checkNotNull(listadapter);
        Object obj = getModules();
        int i = 0;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            if ((Module)((Iterator) (obj)).next() instanceof AdBaseModule)
            {
                listadapter.getView(i, null, abslistview);
            }
            i++;
        }

    }

    public void destroyModules()
    {
        if (!alive)
        {
            return;
        } else
        {
            alive = false;
            unregisterModules(regularModules);
            destroyModules(((Iterable) (regularModules)));
            unregisterModules(adsInFeed);
            destroyModules(((Iterable) (adModules)));
            return;
        }
    }

    public int getModulePosition(String s)
    {
        if (!"top".equals(s)) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return j;
_L2:
        int i = 1;
        Iterator iterator = allModulesIncludingAds.iterator();
label0:
        do
        {
label1:
            {
                if (!iterator.hasNext())
                {
                    break label1;
                }
                j = i;
                if (((Module)iterator.next()).getId().equals(s))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public List getModules()
    {
        if (!alive)
        {
            return ImmutableList.of();
        } else
        {
            return ImmutableList.copyOf(allModulesIncludingAds);
        }
    }

    public void pauseModules()
    {
        if (!alive)
        {
            return;
        } else
        {
            pauseModules(((Iterable) (regularModules)));
            pauseModules(((Iterable) (adModules)));
            return;
        }
    }

    public boolean refreshModulesList(ModuleConfigOverride moduleconfigoverride)
    {
        if (!alive)
        {
            return false;
        }
        ModulesConfig modulesconfig = (ModulesConfig)modulesConfigSupplier.get();
        moduleconfigoverride = modulesFactory.makeModules(context, updateHandler, modulesconfig, moduleconfigoverride);
        boolean flag;
        if (!moduleconfigoverride.equals(regularModules))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            setModules(moduleconfigoverride);
        }
        LogUtil.d("ModulesManager", LoggingMetaTags.TWC_UI, "refreshModulesList modulesChanged=%s, newModules.size()=%s", new Object[] {
            Boolean.valueOf(flag), Integer.valueOf(moduleconfigoverride.size())
        });
        return flag;
    }

    public void resumeModules()
    {
        if (!alive)
        {
            return;
        } else
        {
            resumeModules(((Iterable) (regularModules)));
            resumeModules(((Iterable) (adModules)));
            return;
        }
    }

    public void runRefresh()
    {
        if (alive)
        {
            Iterator iterator = regularModules.iterator();
            while (iterator.hasNext()) 
            {
                ((Module)iterator.next()).runRefresh();
            }
        }
    }
}
