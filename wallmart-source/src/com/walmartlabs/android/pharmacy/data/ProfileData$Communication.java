// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.data;

import android.text.TextUtils;

// Referenced classes of package com.walmartlabs.android.pharmacy.data:
//            ProfileData

public static class 
{

    public static final int BUSSINES_TYPE = 2;
    public static final int HOME_TYPE = 1;
    public static final int MOBILE_TYPE = 0;
    public static final int NONE_TYPE = -1;
    public String cellPhone;
    public String homePhone;
    public boolean textMessageNotifications;
    public String workPhone;

    public  copy()
    {
          = new <init>();
        .cellPhone = cellPhone;
        .homePhone = homePhone;
        .workPhone = workPhone;
        .textMessageNotifications = textMessageNotifications;
        return ;
    }

    public int determinePreferredPhoneType()
    {
        if (!TextUtils.isEmpty(cellPhone))
        {
            return 0;
        }
        if (!TextUtils.isEmpty(homePhone))
        {
            return 1;
        }
        return TextUtils.isEmpty(workPhone) ? -1 : 2;
    }

    public String getPhoneNumber(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return cellPhone;

        case 1: // '\001'
            return homePhone;

        case 2: // '\002'
            return workPhone;
        }
    }

    public void setPhoneNumber(int i, String s)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            cellPhone = s;
            return;

        case 1: // '\001'
            homePhone = s;
            return;

        case 2: // '\002'
            workPhone = s;
            break;
        }
    }

    public ()
    {
    }
}
