// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.walmart.android.utils.ViewUtil;
import java.util.List;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverNearbyCompetitorsPresenter

private static class mCompetitors extends PagerAdapter
{

    private final Activity mActivity;
    private final List mCompetitors;

    private String fixCompetitorAddress(com.walmart.android.service.saver.petitors petitors)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (!TextUtils.isEmpty(petitors.petitors))
        {
            stringbuilder.append(petitors.petitors);
        }
        if (!TextUtils.isEmpty(petitors.petitors))
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(petitors.petitors);
        }
        if (!TextUtils.isEmpty(petitors.petitors) || !TextUtils.isEmpty(petitors.petitors))
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(", ");
            }
            if (!TextUtils.isEmpty(petitors.petitors))
            {
                stringbuilder.append(petitors.petitors);
            }
            if (!TextUtils.isEmpty(petitors.petitors))
            {
                if (!TextUtils.isEmpty(petitors.petitors))
                {
                    stringbuilder.append(" ");
                }
                stringbuilder.append(petitors.petitors);
            }
        }
        return stringbuilder.toString();
    }

    private String fixCompetitorName(String s)
    {
        String s1 = s;
        Object obj = s1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        s = s.split(" ");
        obj = s1;
        if (s.length <= 2)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        int i;
        try
        {
            Integer.parseInt(s[s.length - 1]);
            obj = new StringBuilder();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return s1;
        }
        i = 0;
        if (i >= s.length - 1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((StringBuilder) (obj)).append(s[i]);
        ((StringBuilder) (obj)).append(" ");
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_44;
_L1:
        obj = ((StringBuilder) (obj)).toString().trim();
        return ((String) (obj));
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
    }

    public int getCount()
    {
        return mCompetitors.size();
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        com.walmart.android.service.saver.petitors petitors = (com.walmart.android.service.saver.petitors)mCompetitors.get(i);
        ViewGroup viewgroup1 = (ViewGroup)ViewUtil.inflate(mActivity, 0x7f04015c, viewgroup, false);
        ViewUtil.setTextHideIfEmpty(0x7f1004c4, viewgroup1, fixCompetitorName(petitors.ompetitorName));
        ViewUtil.setTextHideIfEmpty(0x7f1004c5, viewgroup1, fixCompetitorAddress(petitors));
        viewgroup.addView(viewgroup1);
        return viewgroup1;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    public (Activity activity, List list)
    {
        mActivity = activity;
        mCompetitors = list;
    }
}
