// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.preference;

import android.preference.Preference;
import java.util.Map;

// Referenced classes of package com.urbanairship.preference:
//            UAPreferenceAdapter

class eType
    implements android.preference.eChangeListener
{

    final UAPreferenceAdapter this$0;
    final eType val$preferenceType;

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        UAPreferenceAdapter.access$100(UAPreferenceAdapter.this).put(val$preferenceType, obj);
        return true;
    }

    eType()
    {
        this$0 = final_uapreferenceadapter;
        val$preferenceType = eType.this;
        super();
    }
}
