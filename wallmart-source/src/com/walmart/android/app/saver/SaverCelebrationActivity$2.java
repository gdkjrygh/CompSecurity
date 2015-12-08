// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.widget.CompoundButton;
import com.walmart.android.util.SharedPreferencesUtil;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverCelebrationActivity

class this._cls0
    implements android.widget.ngeListener
{

    final SaverCelebrationActivity this$0;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        compoundbutton = SaverCelebrationActivity.this;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        SharedPreferencesUtil.setSaverShowCelebration(compoundbutton, flag);
    }

    ()
    {
        this$0 = SaverCelebrationActivity.this;
        super();
    }
}
