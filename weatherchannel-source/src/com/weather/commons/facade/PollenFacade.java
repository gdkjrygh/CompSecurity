// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import android.content.Context;
import android.content.res.Resources;
import com.weather.dal2.data.PollenRecord;
import com.weather.dal2.dsx.Breathing;
import com.weather.util.app.AbstractTwcApplication;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.weather.commons.facade:
//            PollenData, PollenType

public class PollenFacade
{
    public static final class RelativePollen extends Enum
    {

        private static final RelativePollen $VALUES[];
        public static final RelativePollen DECREASE;
        public static final RelativePollen INCREASE;
        public static final RelativePollen SAME;

        public static RelativePollen valueOf(String s)
        {
            return (RelativePollen)Enum.valueOf(com/weather/commons/facade/PollenFacade$RelativePollen, s);
        }

        public static RelativePollen[] values()
        {
            return (RelativePollen[])$VALUES.clone();
        }

        static 
        {
            DECREASE = new RelativePollen("DECREASE", 0);
            SAME = new RelativePollen("SAME", 1);
            INCREASE = new RelativePollen("INCREASE", 2);
            $VALUES = (new RelativePollen[] {
                DECREASE, SAME, INCREASE
            });
        }

        private RelativePollen(String s, int i)
        {
            super(s, i);
        }
    }


    public static final int DEFAULT_BREATHING_INDEX = 10;
    private static final int DEFAULT_VALUE = 0;
    public static final int NULL_BREATHING_INDEX = -1;
    private com.weather.dal2.dsx.Breathing.BreathingDoc breathingDoc;
    private final Map breathingPhraseMap = Collections.unmodifiableMap(makeBreathingMap());
    private final Map moldPhraseMap = Collections.unmodifiableMap(makeMoldPhraseMap());
    private final List pollenDataList = new ArrayList(3);
    private com.weather.dal2.data.PollenRecord.PollenDoc pollenDoc;
    private final Map pollenPhraseMap = Collections.unmodifiableMap(makePollenPhraseMap());

    public PollenFacade(PollenRecord pollenrecord, Breathing breathing)
    {
        if (breathing != null)
        {
            breathingDoc = breathing.getBreathingDoc();
        }
        if (pollenrecord != null)
        {
            pollenDoc = pollenrecord.getPollenDoc();
            if (pollenDoc != null)
            {
                pollenrecord = pollenDoc.getTreePollen();
                if (pollenrecord != null && !pollenrecord.isEmpty())
                {
                    pollenrecord = new PollenData(PollenType.TREE, (com.weather.dal2.data.PollenRecord.PollenDoc.PollenDay)pollenrecord.get(0));
                    pollenDataList.add(pollenrecord);
                }
                pollenrecord = pollenDoc.getGrassPollen();
                if (pollenrecord != null && !pollenrecord.isEmpty())
                {
                    pollenrecord = new PollenData(PollenType.GRASS, (com.weather.dal2.data.PollenRecord.PollenDoc.PollenDay)pollenrecord.get(0));
                    pollenDataList.add(pollenrecord);
                }
                pollenrecord = pollenDoc.getWeedPollen();
                if (pollenrecord != null && !pollenrecord.isEmpty())
                {
                    pollenrecord = new PollenData(PollenType.WEED, (com.weather.dal2.data.PollenRecord.PollenDoc.PollenDay)pollenrecord.get(0));
                    pollenDataList.add(pollenrecord);
                }
            }
        }
    }

    private int getListSize(Collection collection)
    {
        if (collection == null || collection.isEmpty())
        {
            return -1;
        } else
        {
            return collection.size();
        }
    }

    public static int getPollenValue(List list, int i)
    {
        if (list != null && !list.isEmpty() && i < list.size() && i >= 0)
        {
            if ((list = ((com.weather.dal2.data.PollenRecord.PollenDoc.PollenDay)list.get(i)).getPollenIndexCode()) != null)
            {
                return list.intValue();
            }
        }
        return 0;
    }

    private Map makeBreathingMap()
    {
        HashMap hashmap = new HashMap();
        Resources resources = AbstractTwcApplication.getRootContext().getResources();
        hashmap.put(resources.getString(com.weather.commons.R.string.breathing_level__very_poor), resources.getString(com.weather.commons.R.string.breathing_very_poor));
        hashmap.put(resources.getString(com.weather.commons.R.string.breathing_level_poor), resources.getString(com.weather.commons.R.string.breathing_poor));
        hashmap.put(resources.getString(com.weather.commons.R.string.breathing_level_fair), resources.getString(com.weather.commons.R.string.breathing_fair));
        hashmap.put(resources.getString(com.weather.commons.R.string.breathing_level_good), resources.getString(com.weather.commons.R.string.breathing_good));
        hashmap.put(resources.getString(com.weather.commons.R.string.breathing_level_very_good), resources.getString(com.weather.commons.R.string.breathing_very_good));
        return hashmap;
    }

    private Map makeMoldPhraseMap()
    {
        HashMap hashmap = new HashMap();
        Resources resources = AbstractTwcApplication.getRootContext().getResources();
        hashmap.put(resources.getString(com.weather.commons.R.string.health_module_index_low), resources.getString(com.weather.commons.R.string.mold_low));
        hashmap.put(resources.getString(com.weather.commons.R.string.health_module_index_moderate), resources.getString(com.weather.commons.R.string.mold_moderate));
        hashmap.put(resources.getString(com.weather.commons.R.string.health_module_index_high), resources.getString(com.weather.commons.R.string.mold_high));
        hashmap.put(resources.getString(com.weather.commons.R.string.health_module_index_very_high), resources.getString(com.weather.commons.R.string.mold_very_high));
        return hashmap;
    }

    private Map makePollenPhraseMap()
    {
        HashMap hashmap = new HashMap();
        Resources resources = AbstractTwcApplication.getRootContext().getResources();
        hashmap.put(resources.getString(com.weather.commons.R.string.health_module_index_low), resources.getString(com.weather.commons.R.string.pollen_low));
        hashmap.put(resources.getString(com.weather.commons.R.string.health_module_index_moderate), resources.getString(com.weather.commons.R.string.pollen_moderate));
        hashmap.put(resources.getString(com.weather.commons.R.string.health_module_index_high), resources.getString(com.weather.commons.R.string.pollen_high));
        hashmap.put(resources.getString(com.weather.commons.R.string.health_module_index_very_high), resources.getString(com.weather.commons.R.string.pollen_very_high));
        return hashmap;
    }

    public com.weather.dal2.dsx.Breathing.BreathingDoc getBreathingDoc()
    {
        return breathingDoc;
    }

    public String getBreathingStatement(int i)
    {
        com.weather.dal2.dsx.Breathing.RelativeBreathing relativebreathing;
label0:
        {
            String s = "";
            if (breathingDoc == null)
            {
                relativebreathing = null;
            } else
            {
                relativebreathing = breathingDoc.getRelativeForecast(i);
            }
            if (relativebreathing != null)
            {
                if (relativebreathing != com.weather.dal2.dsx.Breathing.RelativeBreathing.WORSE)
                {
                    break label0;
                }
                s = AbstractTwcApplication.getRootContext().getString(com.weather.commons.R.string.breathing_statement_worse);
            }
            return s;
        }
        if (relativebreathing == com.weather.dal2.dsx.Breathing.RelativeBreathing.BETTER)
        {
            return AbstractTwcApplication.getRootContext().getString(com.weather.commons.R.string.breathing_statement_better);
        } else
        {
            return AbstractTwcApplication.getRootContext().getString(com.weather.commons.R.string.breathing_statement_same);
        }
    }

    public int getBreathingValueForDay(int i)
    {
        Object obj;
        if (breathingDoc != null)
        {
            obj = breathingDoc.getBreathingValue();
        } else
        {
            obj = null;
        }
        if (obj == null || ((List) (obj)).isEmpty())
        {
            return -1;
        }
        obj = ((com.weather.dal2.dsx.Breathing.BreathingDay)((List) (obj)).get(i)).getBreathingIndexCode();
        if (obj == null)
        {
            return 10;
        } else
        {
            return ((Integer) (obj)).intValue();
        }
    }

    public int getBreathingValueForToday()
    {
        return getBreathingValueForDay(0);
    }

    public String getDescription(String s, String s1)
    {
        Object obj;
        String s2;
        s2 = "";
        obj = null;
        if (s1 == null || s == null || s1.isEmpty() || s.isEmpty())
        {
            return AbstractTwcApplication.getRootContext().getString(com.weather.commons.R.string.lifestyle_no_data_short);
        }
        if (!s1.equalsIgnoreCase(AbstractTwcApplication.getRootContext().getString(com.weather.commons.R.string.pollen_breathing))) goto _L2; else goto _L1
_L1:
        obj = breathingPhraseMap;
_L4:
        String s3;
        s3 = s2;
        if (obj != null)
        {
            obj = ((Map) (obj)).entrySet().iterator();
            s1 = s2;
            do
            {
                s3 = s1;
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                if (s.equalsIgnoreCase((String)entry.getKey()))
                {
                    s1 = (String)entry.getValue();
                }
            } while (true);
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (s1.equalsIgnoreCase(AbstractTwcApplication.getRootContext().getString(com.weather.commons.R.string.pollen_mold)))
        {
            obj = moldPhraseMap;
        } else
        if (s1.equalsIgnoreCase(AbstractTwcApplication.getRootContext().getString(com.weather.commons.R.string.pollen_tab_title)))
        {
            obj = pollenPhraseMap;
        }
        if (true) goto _L4; else goto _L3
_L3:
        return s3;
    }

    public List getIndexSortedList()
    {
        List list = pollenDataList;
        Collections.sort(list, new Comparator() {

            final PollenFacade this$0;

            public int compare(PollenData pollendata, PollenData pollendata1)
            {
                byte byte0 = 0;
                int i;
                int j;
                if (pollendata.getPollenDay().getPollenIndexCode() == null)
                {
                    i = 0;
                } else
                {
                    i = pollendata.getPollenDay().getPollenIndexCode().intValue();
                }
                if (pollendata1.getPollenDay().getPollenIndexCode() == null)
                {
                    j = 0;
                } else
                {
                    j = pollendata1.getPollenDay().getPollenIndexCode().intValue();
                }
                if (i > j)
                {
                    byte0 = -1;
                } else
                if (i >= j)
                {
                    return 1;
                }
                return byte0;
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((PollenData)obj, (PollenData)obj1);
            }

            
            {
                this$0 = PollenFacade.this;
                super();
            }
        });
        return list;
    }

    public int getMaxPollenIconType(int i, boolean flag)
    {
        int j = 0;
        int k = 0;
        if (pollenDoc == null || i < 0 || i >= getListSize(pollenDoc.getGrassPollen()) || getMaxPollenIndexForGivenDay(i) == 0)
        {
            return 0;
        }
        if (getMaxPollenIndexForGivenDay(i) == getPollenValue(pollenDoc.getTreePollen(), i))
        {
            j = com.weather.commons.R.drawable.tree_icon_dark;
            k = com.weather.commons.R.drawable.tree_icon_light;
        } else
        if (getMaxPollenIndexForGivenDay(i) == getPollenValue(pollenDoc.getGrassPollen(), i))
        {
            j = com.weather.commons.R.drawable.grass_icon_dark;
            k = com.weather.commons.R.drawable.grass_icon_light;
        } else
        if (getMaxPollenIndexForGivenDay(i) == getPollenValue(pollenDoc.getWeedPollen(), i))
        {
            j = com.weather.commons.R.drawable.weed_icon_dark;
            k = com.weather.commons.R.drawable.weed_icon_light;
        }
        if (flag)
        {
            return k;
        } else
        {
            return j;
        }
    }

    public int getMaxPollenIndexForGivenDay(int i)
    {
        if (pollenDoc != null)
        {
            int j = getPollenValue(pollenDoc.getTreePollen(), i);
            int k = getPollenValue(pollenDoc.getGrassPollen(), i);
            i = getPollenValue(pollenDoc.getWeedPollen(), i);
            if (Math.max(j, k) > k)
            {
                return Math.max(j, i);
            } else
            {
                return Math.max(k, i);
            }
        } else
        {
            return 0;
        }
    }

    public String getMaxPollenLabelForGivenDay(int i)
    {
        if (pollenDoc == null)
        {
            return "";
        }
        String s;
        if (getMaxPollenIndexForGivenDay(i) == getPollenValue(pollenDoc.getGrassPollen(), i))
        {
            s = getPollenPhrase(pollenDoc.getGrassPollen(), i);
        } else
        if (getMaxPollenIndexForGivenDay(i) == getPollenValue(pollenDoc.getTreePollen(), i))
        {
            s = getPollenPhrase(pollenDoc.getTreePollen(), i);
        } else
        {
            s = getPollenPhrase(pollenDoc.getWeedPollen(), i);
        }
        return s.toUpperCase(Locale.getDefault());
    }

    public int getMoldCount()
    {
        if (pollenDoc == null || pollenDoc.getMoldCount() == null)
        {
            return -1;
        }
        int i = pollenDoc.getMoldCount().intValue();
        if (i < 0 || i > 4)
        {
            return -1;
        }
        if (i == 0)
        {
            return 0;
        } else
        {
            return i * 2 + 1;
        }
    }

    public String getMoldPhrase(Context context, int i)
    {
        context = context.getResources();
        if (i < 0 || i > 10)
        {
            return context.getString(com.weather.commons.R.string.health_module_no_data);
        }
        if (i == 0)
        {
            return context.getString(com.weather.commons.R.string.flu_module_none);
        }
        if (i > 0 && i <= 3)
        {
            return context.getString(com.weather.commons.R.string.health_module_index_low);
        }
        if (i > 3 && i <= 5)
        {
            return context.getString(com.weather.commons.R.string.health_module_index_moderate);
        }
        if (i > 5 && i <= 7)
        {
            return context.getString(com.weather.commons.R.string.health_module_index_high);
        } else
        {
            return context.getString(com.weather.commons.R.string.health_module_index_very_high);
        }
    }

    public com.weather.dal2.data.PollenRecord.PollenDoc getPollenDoc()
    {
        return pollenDoc;
    }

    public String getPollenPhrase(List list, int i)
    {
        if (list == null || list.isEmpty() || i >= list.size() || i < 0)
        {
            return "";
        }
        list = ((com.weather.dal2.data.PollenRecord.PollenDoc.PollenDay)list.get(i)).getPollenIndexPhrase();
        if (list == null)
        {
            return "";
        } else
        {
            return list.toUpperCase(Locale.getDefault());
        }
    }

    public RelativePollen getRelativeForecast()
    {
        int i = 0;
        int k = getMaxPollenIndexForGivenDay(0);
        int j;
        if (pollenDoc != null)
        {
            i = getListSize(pollenDoc.getGrassPollen());
        }
        for (j = 1; j == 0 || j < i; j++)
        {
            int l = getMaxPollenIndexForGivenDay(j);
            if (l < k)
            {
                return RelativePollen.INCREASE;
            }
            if (l > k)
            {
                return RelativePollen.DECREASE;
            }
        }

        return RelativePollen.SAME;
    }
}
