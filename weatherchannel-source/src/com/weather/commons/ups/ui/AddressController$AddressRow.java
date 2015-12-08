// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.view.View;
import android.widget.SearchView;
import android.widget.Spinner;
import com.google.common.base.Preconditions;
import com.weather.util.ui.ValueAdapterSupport;
import java.util.Map;

// Referenced classes of package com.weather.commons.ups.ui:
//            AddressController

private static final class esource
{

    private final SearchView address;
    private final ValueAdapterSupport addressTypeAdapterSupport;
    private final View deleteBtn;
    private final View layout;
    private final Spinner spinner;

    rd getAddressRecord()
    {
        return new rd((String)addressTypeAdapterSupport.getSelectedItem(), (String)address.getTag(), null);
    }

    public boolean isVisible()
    {
        return layout.getVisibility() == 0;
    }

    public void setFrom(layout layout1)
    {
        String s = layout1.address.getQuery().toString();
        address.setQuery(s, true);
        address.setTag(s);
        layout1 = (String)layout1.addressTypeAdapterSupport.getSelectedItem();
        if (layout1 != null)
        {
            addressTypeAdapterSupport.selectItem(layout1);
        }
    }

    public void setVisible(boolean flag)
    {
        View view = layout;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
        if (!flag)
        {
            address.setQuery("", true);
            address.setTag(null);
            address.clearFocus();
        }
    }

    public boolean validateInput()
    {
        return !isVisible() || !address.getQuery().toString().isEmpty();
    }





    rd(View view, Spinner spinner1, SearchView searchview, View view1, Map map)
    {
        layout = (View)Preconditions.checkNotNull(view);
        spinner = (Spinner)Preconditions.checkNotNull(spinner1);
        address = (SearchView)Preconditions.checkNotNull(searchview);
        deleteBtn = (View)Preconditions.checkNotNull(view1);
        addressTypeAdapterSupport = new ValueAdapterSupport(spinner1, map, null, com.weather.commons.essRow.addressTypeAdapterSupport);
        addressTypeAdapterSupport.setDropDownViewResource(0x1090009);
    }
}
