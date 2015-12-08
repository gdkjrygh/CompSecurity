// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.os.CountDownTimer;
import android.view.View;
import android.webkit.WebView;
import android.widget.RelativeLayout;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            PopupActivity

class this._cls0
    implements android.view.ener
{

    final PopupActivity this$0;

    public void onClick(View view)
    {
        PopupActivity.access$12(PopupActivity.this).setVisibility(0);
        PopupActivity.access$13(PopupActivity.this).setVisibility(8);
        PopupActivity.access$14(PopupActivity.this, new CountDownTimer(20000L, 2000L) {

            final PopupActivity._cls6 this$1;

            public void onFinish()
            {
                PopupActivity.access$12(this$0).setVisibility(8);
                PopupActivity.access$13(this$0).setVisibility(0);
            }

            public void onTick(long l)
            {
            }

            
            {
                this$1 = PopupActivity._cls6.this;
                super(l, l1);
            }
        });
        PopupActivity.access$8(PopupActivity.this).start();
        PopupActivity.access$9().reload();
    }


    _cls1.this._cls1()
    {
        this$0 = PopupActivity.this;
        super();
    }
}
