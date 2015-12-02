// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.model;

import com.ubercab.ui.collection.model.DividerViewModel;
import com.ubercab.ui.collection.model.ViewModel;

// Referenced classes of package com.ubercab.rds.feature.model:
//            Shape_ContactViewModel

public abstract class ContactViewModel extends ViewModel
{

    public ContactViewModel()
    {
    }

    public static ContactViewModel create()
    {
        return new Shape_ContactViewModel();
    }

    public abstract android.view.View.OnClickListener getClickListener();

    public abstract DividerViewModel getDividerViewModel();

    public abstract boolean getIsUnread();

    public abstract String getLastActionTime();

    public abstract String getMessageTitle();

    public abstract String getStatus();

    public abstract String getTime();

    public abstract String getTripDate();

    public abstract String getTripUuid();

    public abstract ContactViewModel setClickListener(android.view.View.OnClickListener onclicklistener);

    public abstract ContactViewModel setDividerViewModel(DividerViewModel dividerviewmodel);

    public abstract ContactViewModel setIsUnread(boolean flag);

    public abstract ContactViewModel setLastActionTime(String s);

    public abstract ContactViewModel setMessageTitle(String s);

    public abstract ContactViewModel setStatus(String s);

    public abstract ContactViewModel setTime(String s);

    public abstract ContactViewModel setTripDate(String s);

    public abstract ContactViewModel setTripUuid(String s);
}
