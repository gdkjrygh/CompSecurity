// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.locations;

import android.app.Activity;
import android.util.Log;
import com.weather.dal2.net.Receiver;

// Referenced classes of package com.weather.commons.locations:
//            SearchUtil

private final class activity
    implements android.widget.estionListener
{

    Activity activity;
    final Receiver receiver;
    final SearchUtil this$0;

    public boolean onSuggestionClick(int i)
    {
        Log.d("SearchUtil", (new StringBuilder()).append("onSuggestionClick position=").append(i).toString());
        setUpSearchViewAfterSuggestionIsClicked(i);
        return true;
    }

    public boolean onSuggestionSelect(int i)
    {
        return false;
    }

    (Activity activity1, Receiver receiver1)
    {
        this$0 = SearchUtil.this;
        super();
        receiver = receiver1;
        activity = activity1;
    }
}
