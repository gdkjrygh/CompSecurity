// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.pollen;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.weather.Weather.feed.Module;
import com.weather.commons.analytics.feed.LocalyticsModuleHandler;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.facade.PollenData;
import com.weather.commons.facade.PollenFacade;
import com.weather.commons.facade.PollenType;
import com.weather.util.config.ConfigException;
import java.util.List;

// Referenced classes of package com.weather.Weather.pollen:
//            AllergyType

public class AllergyMapModule extends Module
{

    AllergyType allergyType;
    ConfigurationManagers configurationManagers;
    private ImageView imageView;
    Picasso picasso;

    protected AllergyMapModule(Context context, ModuleConfig moduleconfig, Handler handler, LocalyticsModuleHandler localyticsmodulehandler)
    {
        super(context, moduleconfig, handler, localyticsmodulehandler);
    }

    protected View createView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(context).inflate(0x7f030011, viewgroup, false);
        imageView = (ImageView)viewgroup.findViewById(0x7f0d0063);
        return viewgroup;
    }

    public void onReceivePollenData(PollenFacade pollenfacade)
    {
        setModuleData(pollenfacade);
    }

    protected void updateUi(PollenFacade pollenfacade)
    {
        if (pollenfacade != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        FlagshipConfig flagshipconfig = configurationManagers.getFlagshipConfig();
        if (AllergyType.POLLEN != allergyType) goto _L4; else goto _L3
_L3:
        pollenfacade = pollenfacade.getIndexSortedList();
        if (pollenfacade.isEmpty()) goto _L1; else goto _L5
_L5:
        pollenfacade = (PollenData)pollenfacade.get(0);
        if (pollenfacade.getType() != PollenType.TREE) goto _L7; else goto _L6
_L6:
        pollenfacade = flagshipconfig.treePollenMapUrl;
_L8:
        picasso.load(pollenfacade).into(imageView);
        return;
_L7:
label0:
        {
            if (pollenfacade.getType() != PollenType.GRASS)
            {
                break label0;
            }
            pollenfacade = flagshipconfig.grassPollenMapUrl;
        }
          goto _L8
        try
        {
            pollenfacade = flagshipconfig.weedPollenMapUrl;
        }
        // Misplaced declaration of an exception variable
        catch (PollenFacade pollenfacade)
        {
            throw new IllegalStateException("Unable to get flagship config", pollenfacade);
        }
          goto _L8
_L4:
label1:
        {
            if (AllergyType.BREATHING != allergyType)
            {
                break label1;
            }
            pollenfacade = flagshipconfig.breathingMapUrl;
        }
          goto _L8
        pollenfacade = flagshipconfig.moldMapUrl;
          goto _L8
    }

    protected volatile void updateUi(Object obj)
    {
        updateUi((PollenFacade)obj);
    }
}
