// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.LocationSearchResult;

public final class ftn
{

    private final Context a;
    private final dal b;

    public ftn(Context context, dal dal1)
    {
        a = context;
        b = dal1;
    }

    private Spannable a(String s)
    {
        s = new SpannableString(s);
        s.setSpan(new dsj(hoq.a(a, 0x7f070697)), 0, s.length(), 17);
        return s;
    }

    private String b(RiderLocation riderlocation)
    {
        String s;
        int i;
        boolean flag;
        i = 0;
        flag = false;
        s = riderlocation.getTag();
        if (TextUtils.isEmpty(s) || !riderlocation.isEqualToLocationSearchResult(b.i(s))) goto _L2; else goto _L1
_L1:
label0:
        {
            if (!LocationSearchResult.isTagWork(s))
            {
                i = ((flag) ? 1 : 0);
                if (!LocationSearchResult.isTagHome(s))
                {
                    break label0;
                }
            }
            i = 1;
        }
        if (i == 0) goto _L4; else goto _L3
_L3:
        return s;
_L4:
        return null;
_L2:
        String as[] = LocationSearchResult.HOME_WORK_TAGS;
        int j = as.length;
label1:
        do
        {
label2:
            {
                if (i >= j)
                {
                    break label2;
                }
                s = as[i];
                LocationSearchResult locationsearchresult = b.i(s);
                if (locationsearchresult != null && riderlocation.isEqualToLocationSearchResult(locationsearchresult))
                {
                    break label1;
                }
                i++;
            }
        } while (true);
        if (true) goto _L3; else goto _L5
_L5:
        return null;
    }

    public final String a(RiderLocation riderlocation)
    {
        if (riderlocation == null)
        {
            return "";
        }
        String s = b(riderlocation);
        if (!TextUtils.isEmpty(s))
        {
            if (LocationSearchResult.isTagHome(s))
            {
                riderlocation = a.getResources().getString(0x7f07026c);
            } else
            {
                riderlocation = a.getResources().getString(0x7f070672);
            }
            return dtt.a(riderlocation);
        }
        s = riderlocation.getNickname();
        riderlocation = riderlocation.getDisplayAddressDescription();
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(s))
        {
            spannablestringbuilder.append(a(s));
            spannablestringbuilder.append(" ");
        }
        if (TextUtils.isEmpty(s) || !riderlocation.startsWith(s))
        {
            spannablestringbuilder.append(riderlocation);
        }
        return spannablestringbuilder.toString().trim();
    }
}
