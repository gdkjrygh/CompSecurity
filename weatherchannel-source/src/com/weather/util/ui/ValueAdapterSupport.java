// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.ui;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ValueAdapterSupport
{
    private static final class DisplayItem
    {

        private final String text;
        private final Object value;

        public String toString()
        {
            return text;
        }


        private DisplayItem(String s, Object obj)
        {
            text = (String)Preconditions.checkNotNull(s);
            value = obj;
        }

    }


    private final ArrayAdapter adapter;
    private final AdapterView adapterView;
    private final List displayList;
    private final String header;
    private final Map valueMap;

    public ValueAdapterSupport(AdapterView adapterview, Map map, String s, int i)
    {
        adapterView = (AdapterView)Preconditions.checkNotNull(adapterview);
        header = s;
        valueMap = ImmutableMap.copyOf(map);
        displayList = new ArrayList(map.size() + 1);
        resetListFilteringOut(Collections.emptyList());
        adapter = new ArrayAdapter(adapterview.getContext(), i, displayList);
        adapterview.setAdapter(adapter);
    }

    private void resetListFilteringOut(Collection collection)
    {
        displayList.clear();
        if (header != null)
        {
            displayList.add(new DisplayItem(header, null));
        }
        Iterator iterator = valueMap.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (!collection.contains(entry.getKey()))
            {
                displayList.add(new DisplayItem((String)entry.getValue(), entry.getKey()));
            }
        } while (true);
    }

    public Object getSelectedItem()
    {
        DisplayItem displayitem = (DisplayItem)adapterView.getSelectedItem();
        if (displayitem == null)
        {
            return null;
        } else
        {
            return displayitem.value;
        }
    }

    public void resetFilteringOut(Collection collection)
    {
        Object obj = getSelectedItem();
        resetListFilteringOut(collection);
        adapter.notifyDataSetChanged();
        if (obj != null)
        {
            selectItem(obj);
        }
    }

    public void selectItem(Object obj)
    {
        int i = 0;
        Iterator iterator = displayList.iterator();
        do
        {
label0:
            {
                if (iterator.hasNext())
                {
                    if (!obj.equals(((DisplayItem)iterator.next()).value))
                    {
                        break label0;
                    }
                    adapterView.setSelection(i);
                }
                return;
            }
            i++;
        } while (true);
    }

    public void selectPosition(int i)
    {
        adapterView.setSelection(i);
    }

    public void setDropDownViewResource(int i)
    {
        adapter.setDropDownViewResource(i);
    }
}
