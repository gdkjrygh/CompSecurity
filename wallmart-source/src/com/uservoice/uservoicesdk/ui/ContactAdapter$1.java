// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.view.View;
import android.widget.EditText;
import com.uservoice.uservoicesdk.model.CustomField;
import java.util.Map;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            ContactAdapter

class val.field
    implements android.view.eListener
{

    final ContactAdapter this$0;
    final CustomField val$customField;
    final EditText val$field;

    public void onFocusChange(View view, boolean flag)
    {
        if (!flag)
        {
            ContactAdapter.access$000(ContactAdapter.this).put(val$customField.getName(), val$field.getText().toString());
        }
    }

    ()
    {
        this$0 = final_contactadapter;
        val$customField = customfield;
        val$field = EditText.this;
        super();
    }
}
