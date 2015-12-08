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

class this._cls1 extends CountDownTimer
{

    final y this$1;

    public void onFinish()
    {
        PopupActivity.access$12(_fld0).setVisibility(8);
        PopupActivity.access$13(_fld0).setVisibility(0);
    }

    public void onTick(long l)
    {
    }

    is._cls0(long l, long l1)
    {
        this$1 = this._cls1.this;
        super(l, l1);
    }

    // Unreferenced inner class com/nbcuni/nbc/thevoice/PopupActivity$6

/* anonymous class */
    class PopupActivity._cls6
        implements android.view.View.OnClickListener
    {

        final PopupActivity this$0;

        public void onClick(View view)
        {
            PopupActivity.access$12(PopupActivity.this).setVisibility(0);
            PopupActivity.access$13(PopupActivity.this).setVisibility(8);
            PopupActivity.access$14(PopupActivity.this, new PopupActivity._cls6._cls1(20000L, 2000L));
            PopupActivity.access$8(PopupActivity.this).start();
            PopupActivity.access$9().reload();
        }


            
            {
                this$0 = PopupActivity.this;
                super();
            }
    }

}
