// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collection;

// Referenced classes of package com.facebook.widget:
//            PickerFragment

class  extends 
{

    private String selectedId;
    final PickerFragment this$0;

    public void clear()
    {
        selectedId = null;
    }

    public Collection getSelectedIds()
    {
        return Arrays.asList(new String[] {
            selectedId
        });
    }

    boolean isEmpty()
    {
        return selectedId == null;
    }

    boolean isSelected(String s)
    {
        return selectedId != null && s != null && selectedId.equals(s);
    }

    void readSelectionFromBundle(Bundle bundle, String s)
    {
        if (bundle != null)
        {
            selectedId = bundle.getString(s);
        }
    }

    void saveSelectionToBundle(Bundle bundle, String s)
    {
        if (!TextUtils.isEmpty(selectedId))
        {
            bundle.putString(s, selectedId);
        }
    }

    boolean shouldShowCheckBoxIfUnselected()
    {
        return false;
    }

    void toggleSelection(String s)
    {
        if (selectedId != null && selectedId.equals(s))
        {
            selectedId = null;
            return;
        } else
        {
            selectedId = s;
            return;
        }
    }

    ()
    {
        this$0 = PickerFragment.this;
        super(PickerFragment.this);
    }
}
