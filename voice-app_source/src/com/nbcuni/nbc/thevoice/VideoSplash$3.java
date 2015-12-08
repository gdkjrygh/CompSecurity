// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.media.MediaPlayer;
import android.os.Handler;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            VideoSplash

class this._cls0
    implements android.media.PreparedListener
{

    final VideoSplash this$0;

    public void onPrepared(MediaPlayer mediaplayer)
    {
        int i = mediaplayer.getDuration();
        (new Handler()).postDelayed(new Runnable() {

            final VideoSplash._cls3 this$1;

            public void run()
            {
                finish();
                overridePendingTransition(0x7f040003, 0x7f040004);
            }

            
            {
                this$1 = VideoSplash._cls3.this;
                super();
            }
        }, i - 500);
    }


    _cls1.this._cls1()
    {
        this$0 = VideoSplash.this;
        super();
    }
}
