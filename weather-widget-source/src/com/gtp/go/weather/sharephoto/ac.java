// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.widget.ImageView;
import com.gtp.go.weather.sharephoto.award.o;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            UserPhotosActivity, z

class ac extends o
{

    final UserPhotosActivity a;

    private ac(UserPhotosActivity userphotosactivity)
    {
        a = userphotosactivity;
        super();
    }

    ac(UserPhotosActivity userphotosactivity, z z)
    {
        this(userphotosactivity);
    }

    public void a(boolean flag, int i)
    {
label0:
        {
            if (i != 0)
            {
                UserPhotosActivity.c(a).setVisibility(0);
                if (!flag)
                {
                    break label0;
                }
                UserPhotosActivity.c(a).setImageResource(0x7f0203d1);
            }
            return;
        }
        UserPhotosActivity.c(a).setImageResource(0x7f0203cf);
    }
}
