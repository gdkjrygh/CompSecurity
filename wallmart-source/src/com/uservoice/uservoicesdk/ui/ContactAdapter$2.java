// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.view.View;
import android.widget.AdapterView;
import com.uservoice.uservoicesdk.model.CustomField;
import com.walmartlabs.ui.FloatLabel;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            ContactAdapter

class val.title
    implements android.widget.mSelectedListener
{

    final ContactAdapter this$0;
    final CustomField val$customField;
    final FloatLabel val$title;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        ContactAdapter.access$102(ContactAdapter.this, (String)val$customField.getPredefinedValues().get(i));
        ContactAdapter.access$000(ContactAdapter.this).put(val$customField.getName(), ContactAdapter.access$100(ContactAdapter.this));
        val$title.show();
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    er()
    {
        this$0 = final_contactadapter;
        val$customField = customfield;
        val$title = FloatLabel.this;
        super();
    }
}
