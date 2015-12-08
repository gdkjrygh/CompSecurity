// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.developer;

import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import java.util.List;

// Referenced classes of package com.contextlogic.wish.ui.fragment.developer:
//            DeveloperHelper

static final class val.serverPathText
    implements android.widget.SelectedListener
{

    final EditText val$serverPathText;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (i > 0)
        {
            val$serverPathText.setText((CharSequence)DeveloperHelper.getServerItems().get(i));
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    (EditText edittext)
    {
        val$serverPathText = edittext;
        super();
    }
}
