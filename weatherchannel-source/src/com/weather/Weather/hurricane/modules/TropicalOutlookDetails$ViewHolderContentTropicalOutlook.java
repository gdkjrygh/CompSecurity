// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane.modules;

import android.view.View;
import android.widget.TextView;
import com.weather.commons.facade.WeatherAlert;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.weather.Weather.hurricane.modules:
//            TropicalOutlookDetails

private static final class tropicalOutlookContentTextView
{

    private final TextView tropicalOutlookContentTextView;

    public void setData(WeatherAlert weatheralert)
    {
        if (weatheralert != null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            Iterator iterator = ((List)weatheralert.getParameters().get("MND")).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s1 = (String)iterator.next();
                if (!s1.isEmpty())
                {
                    stringbuilder.append(s1);
                    stringbuilder.append('\n');
                }
            } while (true);
            stringbuilder.append('\n');
            for (weatheralert = weatheralert.getWarningText().iterator(); weatheralert.hasNext();)
            {
                String s = (String)weatheralert.next();
                if (!s.isEmpty())
                {
                    stringbuilder.append(s);
                } else
                {
                    stringbuilder.append("\n\n");
                }
            }

            tropicalOutlookContentTextView.setText(stringbuilder.toString());
        }
    }

    (View view)
    {
        tropicalOutlookContentTextView = (TextView)view.findViewById(0x7f0d02c1);
    }
}
