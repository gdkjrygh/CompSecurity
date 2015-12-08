// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HourGroupUtil
{

    private static final String TWENTYFOURHOURS = "12:01am - 11:59pm";
    private static final Pattern sTimePattern = Pattern.compile("^(\\d{1,2}):(\\d{2,2})([AP]M)\\s*-\\s*(\\d{1,2}):(\\d{2,2})([AP]M)\\s*$");

    public HourGroupUtil()
    {
    }

    private static void populate(int i, ViewGroup viewgroup, com.walmart.android.data.WalmartStore.HoursOfOperation ahoursofoperation[])
    {
        if (i < ahoursofoperation.length)
        {
            setLine(viewgroup, ahoursofoperation[i]);
            if (i + 1 == ahoursofoperation.length)
            {
                ahoursofoperation = (android.view.ViewGroup.MarginLayoutParams)viewgroup.getLayoutParams();
                ahoursofoperation.setMargins(((android.view.ViewGroup.MarginLayoutParams) (ahoursofoperation)).leftMargin, ((android.view.ViewGroup.MarginLayoutParams) (ahoursofoperation)).topMargin, ((android.view.ViewGroup.MarginLayoutParams) (ahoursofoperation)).rightMargin, 0);
                viewgroup.setLayoutParams(ahoursofoperation);
            }
            return;
        } else
        {
            viewgroup.setVisibility(8);
            return;
        }
    }

    public static void populateHoursFields(ViewGroup viewgroup, com.walmart.android.data.WalmartStore.HoursOfOperation ahoursofoperation[])
    {
        populate(0, (ViewGroup)ViewUtil.findViewById(viewgroup, 0x7f1005b9), ahoursofoperation);
        populate(1, (ViewGroup)ViewUtil.findViewById(viewgroup, 0x7f1005ba), ahoursofoperation);
        populate(2, (ViewGroup)ViewUtil.findViewById(viewgroup, 0x7f1005bb), ahoursofoperation);
    }

    private static void setLine(View view, com.walmart.android.data.WalmartStore.HoursOfOperation hoursofoperation)
    {
        Object obj;
        String s1;
        String s2;
        TextView textview;
        boolean flag;
        flag = true;
        obj = view.getResources();
        s1 = ((Resources) (obj)).getString(0x7f09059f);
        obj = ((Resources) (obj)).getString(0x7f0905a0);
        s2 = hoursofoperation.getDay();
        textview = (TextView)ViewUtil.findViewById(view, 0x7f1005bc);
        if (!s1.equals(s2)) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        hoursofoperation = s2;
        if (!flag)
        {
            hoursofoperation = s1;
            ViewUtil.findViewById(view, 0x7f1005bd).setVisibility(8);
            ViewUtil.findViewById(view, 0x7f1005be).setVisibility(8);
            ViewUtil.findViewById(view, 0x7f1005bf).setVisibility(8);
        }
        textview.setText(hoursofoperation);
        return;
_L2:
        Matcher matcher;
        hoursofoperation = hoursofoperation.getTime();
        if ("12:01am - 11:59pm".equalsIgnoreCase(hoursofoperation) || ((String) (obj)).equalsIgnoreCase(hoursofoperation))
        {
            ((TextView)ViewUtil.findViewById(view, 0x7f1005bd)).setText(((CharSequence) (obj)));
            ViewUtil.findViewById(view, 0x7f1005be).setVisibility(8);
            ViewUtil.findViewById(view, 0x7f1005bf).setVisibility(8);
            continue; /* Loop/switch isn't completed */
        }
        matcher = sTimePattern.matcher(hoursofoperation);
        if (!matcher.matches())
        {
            break MISSING_BLOCK_LABEL_385;
        }
        hoursofoperation = "";
        if (Integer.parseInt(matcher.group(2)) != 0)
        {
            hoursofoperation = (new StringBuilder()).append(":").append(matcher.group(2)).toString();
        }
        String s = "";
        try
        {
            if (Integer.parseInt(matcher.group(5)) != 0)
            {
                s = (new StringBuilder()).append(":").append(matcher.group(5)).toString();
            }
            ((TextView)ViewUtil.findViewById(view, 0x7f1005bd)).setText(String.format(Locale.US, "%d%s %s", new Object[] {
                Integer.valueOf(Integer.parseInt(matcher.group(1))), hoursofoperation, matcher.group(3)
            }).toLowerCase(Locale.US));
            ((TextView)ViewUtil.findViewById(view, 0x7f1005bf)).setText(String.format(Locale.US, "%d%s %s", new Object[] {
                Integer.valueOf(Integer.parseInt(matcher.group(4))), s, matcher.group(6)
            }).toLowerCase(Locale.US));
        }
        // Misplaced declaration of an exception variable
        catch (com.walmart.android.data.WalmartStore.HoursOfOperation hoursofoperation)
        {
            flag = false;
        }
        continue; /* Loop/switch isn't completed */
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

}
