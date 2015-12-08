// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            PublishPhotoActivity

class v
    implements TextWatcher
{

    final PublishPhotoActivity a;

    v(PublishPhotoActivity publishphotoactivity)
    {
        a = publishphotoactivity;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        int i = editable.length();
        PublishPhotoActivity.e(a).setText(String.valueOf(80 - i));
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
