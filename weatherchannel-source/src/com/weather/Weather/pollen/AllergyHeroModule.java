// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.pollen;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.LevelListDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.weather.Weather.feed.Module;
import com.weather.Weather.ui.DialView;
import com.weather.commons.analytics.feed.LocalyticsModuleHandler;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.facade.PollenData;
import com.weather.commons.facade.PollenFacade;
import com.weather.commons.facade.PollenType;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.weather.Weather.pollen:
//            AllergyType

public class AllergyHeroModule extends Module
{

    private DialView allergyDial;
    AllergyType allergyType;
    private TextView pollenContributor;
    private LinearLayout pollenDetailsLayout;
    private TextView primaryDesc;

    protected AllergyHeroModule(Context context, ModuleConfig moduleconfig, Handler handler, LocalyticsModuleHandler localyticsmodulehandler)
    {
        super(context, moduleconfig, handler, localyticsmodulehandler);
    }

    private CharSequence getSecondaryDescription(List list)
    {
        list = (PollenData)list.get(0);
        if (PollenType.TREE == list.getType())
        {
            String s = list.getPollenDay().getPollenTreeType();
            list = s;
            if ("Not Available".equals(s))
            {
                list = "";
            }
            return context.getResources().getString(0x7f070240, new Object[] {
                list
            });
        }
        if (PollenType.GRASS == list.getType())
        {
            return context.getResources().getString(0x7f070243);
        }
        if (PollenType.WEED == list.getType())
        {
            return context.getResources().getString(0x7f070255);
        } else
        {
            return context.getResources().getString(0x7f07017e);
        }
    }

    private void setDialColorAndLabel(int i, String s)
    {
        Resources resources = context.getResources();
        String s1;
        if (i < 0)
        {
            s1 = resources.getString(0x7f070158);
            i = 0x7f0b0051;
        } else
        if (i == 0)
        {
            s1 = resources.getString(0x7f070113);
            i = 0x7f0b0051;
        } else
        if (i > 0 && i <= 3)
        {
            s1 = resources.getString(0x7f070153);
            i = 0x7f0b0053;
        } else
        if (i > 3 && i <= 5)
        {
            s1 = resources.getString(0x7f070154);
            i = 0x7f0b0054;
        } else
        if (i > 5 && i <= 7)
        {
            s1 = resources.getString(0x7f070152);
            i = 0x7f0b0052;
        } else
        {
            s1 = resources.getString(0x7f070157);
            i = 0x7f0b0055;
        }
        if (s != null)
        {
            allergyDial.setText(s.toUpperCase(Locale.getDefault()));
        } else
        {
            allergyDial.setText(s1);
        }
        allergyDial.setColor(resources.getColor(i));
    }

    private void setPollenDetailsLayout(PollenFacade pollenfacade)
    {
        pollenDetailsLayout.setVisibility(0);
    /* block-local class not found */
    class PollenRow {}

        ImmutableList immutablelist = ImmutableList.of(new PollenRow((ImageView)pollenDetailsLayout.findViewById(0x7f0d0051), (TextView)pollenDetailsLayout.findViewById(0x7f0d0052), (TextView)pollenDetailsLayout.findViewById(0x7f0d0053), pollenDetailsLayout.findViewById(0x7f0d0054)), new PollenRow((ImageView)pollenDetailsLayout.findViewById(0x7f0d0056), (TextView)pollenDetailsLayout.findViewById(0x7f0d0057), (TextView)pollenDetailsLayout.findViewById(0x7f0d0058), pollenDetailsLayout.findViewById(0x7f0d0059)), new PollenRow((ImageView)pollenDetailsLayout.findViewById(0x7f0d005b), (TextView)pollenDetailsLayout.findViewById(0x7f0d005c), (TextView)pollenDetailsLayout.findViewById(0x7f0d005d), pollenDetailsLayout.findViewById(0x7f0d005e)));
        int i = 0;
        Iterator iterator = immutablelist.iterator();
        do
        {
            Object obj;
            PollenRow pollenrow;
label0:
            {
                if (iterator.hasNext())
                {
                    pollenrow = (PollenRow)iterator.next();
                    obj = pollenfacade.getIndexSortedList();
                    if (obj == null || ((List) (obj)).isEmpty() || ((List) (obj)).size() <= i)
                    {
                        obj = null;
                    } else
                    {
                        obj = (PollenData)((List) (obj)).get(i);
                        i++;
                    }
                    if (obj != null)
                    {
                        break label0;
                    }
                }
                return;
            }
            pollenrow.pollenTypeIcon.setImageResource(((PollenData) (obj)).getType().getTypeIconId());
            pollenrow.pollenType.setText(((PollenData) (obj)).getType().getPollenType());
            int j;
            if (((PollenData) (obj)).getPollenDay().getPollenIndexCode() == null)
            {
                j = 0;
            } else
            {
                j = ((PollenData) (obj)).getPollenDay().getPollenIndexCode().intValue();
            }
            ((LevelListDrawable)pollenrow.pollenIndicator.getBackground()).setLevel(j);
            if (j == 0)
            {
                pollenrow.pollenDesc.setText(context.getResources().getString(0x7f070113));
            } else
            {
                pollenrow.pollenDesc.setText(((PollenData) (obj)).getPollenDay().getPollenIndexPhrase());
            }
        } while (true);
    }

    protected View createView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(context).inflate(0x7f03000f, viewgroup, false);
        pollenDetailsLayout = (LinearLayout)viewgroup.findViewById(0x7f0d004f);
        allergyDial = (DialView)viewgroup.findViewById(0x7f0d004c);
        primaryDesc = (TextView)viewgroup.findViewById(0x7f0d004d);
        pollenContributor = (TextView)viewgroup.findViewById(0x7f0d004e);
        return viewgroup;
    }

    public void onReceivePollenData(PollenFacade pollenfacade)
    {
        setModuleData(pollenfacade);
    }

    protected void updateUi(PollenFacade pollenfacade)
    {
        List list;
        List list1;
        list1 = null;
        list = null;
        if (pollenfacade != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        com.weather.dal2.dsx.Breathing.BreathingDoc breathingdoc;
        com.weather.dal2.data.PollenRecord.PollenDoc pollendoc;
        int i;
        pollendoc = pollenfacade.getPollenDoc();
        breathingdoc = pollenfacade.getBreathingDoc();
        if (AllergyType.POLLEN != allergyType || pollendoc == null)
        {
            break; /* Loop/switch isn't completed */
        }
        int j = pollenfacade.getMaxPollenIndexForGivenDay(0);
        list1 = pollenfacade.getIndexSortedList();
        if (list1.isEmpty())
        {
            continue; /* Loop/switch isn't completed */
        }
        primaryDesc.setText(context.getResources().getText(0x7f07023f));
        primaryDesc.setVisibility(0);
        pollenContributor.setVisibility(0);
        pollenContributor.setText(getSecondaryDescription(list1));
        setPollenDetailsLayout(pollenfacade);
        pollenfacade = list;
        i = j;
        if (j != 0)
        {
            i = j * 2 + 1;
            pollenfacade = list;
        }
_L5:
        setDialColorAndLabel(i, pollenfacade);
        if (i != -1)
        {
            allergyDial.setProgress((float)i / 10F);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (AllergyType.BREATHING != allergyType)
        {
            continue; /* Loop/switch isn't completed */
        }
        primaryDesc.setText(context.getResources().getText(0x7f07006a));
        if (breathingdoc == null) goto _L1; else goto _L4
_L4:
        i = pollenfacade.getBreathingValueForToday();
        pollenfacade = list1;
        int k = i;
        if (i != -1)
        {
            k = 10 - i;
            i = k;
            if (k == 0)
            {
                i = k + 1;
            }
            list = breathingdoc.getBreathingValue();
            pollenfacade = list1;
            k = i;
            if (list != null)
            {
                pollenfacade = list1;
                k = i;
                if (!list.isEmpty())
                {
                    pollenfacade = ((com.weather.dal2.dsx.Breathing.BreathingDay)breathingdoc.getBreathingValue().get(0)).getBreathingIndexPhrase();
                    k = i;
                }
            }
        }
        pollenContributor.setVisibility(8);
        pollenDetailsLayout.setVisibility(8);
        i = k;
          goto _L5
        if (pollendoc == null) goto _L1; else goto _L6
_L6:
        i = pollenfacade.getMoldCount();
        primaryDesc.setText(context.getResources().getText(0x7f0701b6));
        pollenContributor.setVisibility(8);
        pollenDetailsLayout.setVisibility(8);
        pollenfacade = list;
          goto _L5
    }

    protected volatile void updateUi(Object obj)
    {
        updateUi((PollenFacade)obj);
    }
}
