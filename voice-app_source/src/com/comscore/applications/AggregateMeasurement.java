// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.applications;

import com.comscore.analytics.Core;
import com.comscore.measurement.Label;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.comscore.applications:
//            ApplicationMeasurement, EventType

public class AggregateMeasurement extends ApplicationMeasurement
{

    protected AggregateMeasurement(Core core, EventType eventtype, String s)
    {
        super(core, eventtype, s);
    }

    private Boolean a(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            if (!"0123456789".contains((new StringBuilder()).append("").append(s.charAt(i)).toString()))
            {
                return Boolean.valueOf(false);
            }
        }

        return Boolean.valueOf(true);
    }

    private Boolean b(String s)
    {
        if (s == null)
        {
            return Boolean.valueOf(false);
        }
        if (!s.contains(","))
        {
            return Boolean.valueOf(false);
        }
        if (!s.contains(" "))
        {
            return Boolean.valueOf(true);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    private Boolean b(String s, String s1)
    {
        return Boolean.valueOf(s.contains(s1));
    }

    private String c(String s, String s1)
    {
        s1 = new StringBuilder(s1);
        for (s = c(s).iterator(); s.hasNext();)
        {
            String s2 = (String)s.next();
            if (!s1.toString().contains(s2))
            {
                if (s1.toString().equals(""))
                {
                    s1.append(s2).append(":1");
                } else
                {
                    s1.append(";").append(s2).append(":1");
                }
            } else
            {
                String as[] = s1.toString().split(";");
                int i = 0;
                while (i < as.length) 
                {
                    if (as[i].contains(s2))
                    {
                        String as1[] = as[i].split(":");
                        int j = Integer.valueOf(as1[1]).intValue();
                        String s3 = (new StringBuilder()).append(as1[0]).append(":").append(Integer.valueOf(j + 1)).toString();
                        s1.replace(s1.indexOf(as[i]), s1.indexOf(as[i]) + as[i].length(), s3);
                    }
                    i++;
                }
            }
        }

        return s1.toString();
    }

    private List c(String s)
    {
        s = s.split(",");
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < s.length; i++)
        {
            arraylist.add(s[i]);
        }

        return arraylist;
    }

    public void aggregateLabels(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (Label)list.next();
            Object obj1 = (Label)a.get(((Label) (obj)).name);
            if (obj1 == null)
            {
                if (b(((Label) (obj)).value).booleanValue())
                {
                    obj1 = c(((Label) (obj)).value, "");
                    setLabel(((Label) (obj)).name, ((String) (obj1)), Boolean.valueOf(true));
                } else
                {
                    setLabel(((Label) (obj)));
                }
            } else
            if (a(((Label) (obj1)).value).booleanValue() && a(((Label) (obj)).value).booleanValue())
            {
                int i = Integer.valueOf(((Label) (obj1)).value).intValue();
                int j = Integer.valueOf(((Label) (obj)).value).intValue();
                setLabel(((Label) (obj1)).name, Integer.valueOf(j + i).toString(), Boolean.valueOf(true));
            } else
            if (b(((Label) (obj)).value).booleanValue())
            {
                obj1 = c(((Label) (obj)).value, ((Label) (obj1)).value);
                setLabel(((Label) (obj)).name, ((String) (obj1)), Boolean.valueOf(true));
            } else
            if (!b(((Label) (obj1)).value, ((Label) (obj)).value).booleanValue())
            {
                obj = (new StringBuilder()).append(((Label) (obj1)).value).append(",").append(((Label) (obj)).value).toString();
                setLabel(((Label) (obj1)).name, ((String) (obj)), Boolean.valueOf(true));
            }
        } while (true);
    }

    public void formatLists()
    {
        Object obj = new ArrayList();
        Iterator iterator = a.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Label label1 = (Label)iterator.next();
            if (b(label1.value).booleanValue())
            {
                ((ArrayList) (obj)).add(label1);
            }
        } while (true);
        Label label;
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); setLabel(label.name, c(label.value, ""), Boolean.valueOf(true)))
        {
            label = (Label)((Iterator) (obj)).next();
        }

    }

    public List getAggregateLabels()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = a.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Label label = (Label)iterator.next();
            if (label.aggregate.booleanValue())
            {
                arraylist.add(label);
            }
        } while (true);
        return arraylist;
    }
}
