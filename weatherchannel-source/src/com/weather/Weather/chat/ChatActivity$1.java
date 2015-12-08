// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.chat;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

// Referenced classes of package com.weather.Weather.chat:
//            ChatActivity

class val.lineLimit
    implements TextWatcher
{

    private int beforeCursorPosition;
    private String text;
    final ChatActivity this$0;
    final int val$lineLimit;

    public void afterTextChanged(Editable editable)
    {
        if (ChatActivity.access$300(ChatActivity.this).getLineCount() > val$lineLimit)
        {
            ChatActivity.access$300(ChatActivity.this).removeTextChangedListener(this);
            ChatActivity.access$300(ChatActivity.this).setText(text);
            ChatActivity.access$300(ChatActivity.this).setSelection(beforeCursorPosition);
            ChatActivity.access$300(ChatActivity.this).addTextChangedListener(this);
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        text = charsequence.toString();
        beforeCursorPosition = i;
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    ()
    {
        this$0 = final_chatactivity;
        val$lineLimit = I.this;
        super();
    }
}
