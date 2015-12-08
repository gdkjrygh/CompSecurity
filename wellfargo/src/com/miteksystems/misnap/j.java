// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.widget.ImageView;

// Referenced classes of package com.miteksystems.misnap:
//            b

final class j
{

    private static j b;
    public int a;
    private int c[];
    private int d[];
    private int e[];
    private int f[];
    private int g[];

    private j()
    {
        a = 30;
        c = (new int[] {
            R.drawable.bug_animation_01, R.drawable.bug_animation_02, R.drawable.bug_animation_03, R.drawable.bug_animation_04, R.drawable.bug_animation_05, R.drawable.bug_animation_06, R.drawable.bug_animation_07, R.drawable.bug_animation_08, R.drawable.bug_animation_09, R.drawable.bug_animation_10, 
            R.drawable.bug_animation_11, R.drawable.bug_animation_12, R.drawable.bug_animation_13, R.drawable.bug_animation_14, R.drawable.bug_animation_15, R.drawable.bug_animation_16, R.drawable.bug_animation_17, R.drawable.bug_animation_18, R.drawable.bug_animation_19, R.drawable.bug_animation_20, 
            R.drawable.bug_animation_21, R.drawable.bug_animation_22, R.drawable.bug_animation_23, R.drawable.bug_animation_24, R.drawable.bug_animation_25, R.drawable.bug_animation_26, R.drawable.bug_animation_27, R.drawable.bug_animation_28, R.drawable.bug_animation_29, R.drawable.bug_animation_30, 
            R.drawable.bug_animation_31, R.drawable.bug_animation_32, R.drawable.bug_animation_33, R.drawable.bug_animation_34, R.drawable.bug_animation_35, R.drawable.bug_animation_36, R.drawable.bug_animation_37, R.drawable.bug_animation_38, R.drawable.bug_animation_39, R.drawable.bug_animation_40
        });
        d = (new int[] {
            R.drawable.bug_animation_40
        });
        e = (new int[] {
            R.drawable.gauge_open_01, R.drawable.gauge_open_02, R.drawable.gauge_open_03, R.drawable.gauge_open_04, R.drawable.gauge_open_05, R.drawable.gauge_open_06, R.drawable.gauge_open_07_08, R.drawable.gauge_open_07_08, R.drawable.gauge_open_09, R.drawable.gauge_open_10, 
            R.drawable.gauge_open_11, R.drawable.gauge_open_12, R.drawable.gauge_open_13, R.drawable.gauge_open_14, R.drawable.gauge_open_15, R.drawable.gauge_open_16, R.drawable.gauge_open_17, R.drawable.gauge_open_18, R.drawable.gauge_open_19, R.drawable.gauge_open_20, 
            R.drawable.gauge_open_21, R.drawable.gauge_open_22, R.drawable.gauge_open_23_27, R.drawable.gauge_open_23_27, R.drawable.gauge_open_23_27, R.drawable.gauge_open_23_27, R.drawable.gauge_open_23_27, R.drawable.gauge_open_28, R.drawable.gauge_open_29_32, R.drawable.gauge_open_29_32, 
            R.drawable.gauge_open_29_32, R.drawable.gauge_open_29_32, R.drawable.gauge_open_33, R.drawable.gauge_open_34_37, R.drawable.gauge_open_34_37, R.drawable.gauge_open_34_37, R.drawable.gauge_open_34_37, R.drawable.gauge_open_38, R.drawable.gauge_open_39_40, R.drawable.gauge_open_39_40
        });
        f = (new int[] {
            R.drawable.gauge_open_39_40, R.drawable.gauge_open_39_40, R.drawable.gauge_open_38, R.drawable.gauge_open_34_37, R.drawable.gauge_open_34_37, R.drawable.gauge_open_34_37, R.drawable.gauge_open_34_37, R.drawable.gauge_open_33, R.drawable.gauge_open_29_32, R.drawable.gauge_open_29_32, 
            R.drawable.gauge_open_29_32, R.drawable.gauge_open_29_32, R.drawable.gauge_open_28, R.drawable.gauge_open_23_27, R.drawable.gauge_open_23_27, R.drawable.gauge_open_23_27, R.drawable.gauge_open_23_27, R.drawable.gauge_open_23_27, R.drawable.gauge_open_22, R.drawable.gauge_open_21, 
            R.drawable.gauge_open_20, R.drawable.gauge_open_19, R.drawable.gauge_open_18, R.drawable.gauge_open_17, R.drawable.gauge_open_16, R.drawable.gauge_open_15, R.drawable.gauge_open_14, R.drawable.gauge_open_13, R.drawable.gauge_open_12, R.drawable.gauge_open_11, 
            R.drawable.gauge_open_10, R.drawable.gauge_open_09, R.drawable.gauge_open_07_08, R.drawable.gauge_open_07_08, R.drawable.gauge_open_06, R.drawable.gauge_open_05, R.drawable.gauge_open_04, R.drawable.gauge_open_03, R.drawable.gauge_open_02, R.drawable.gauge_open_01
        });
        g = (new int[] {
            R.drawable.gauge_finish_00, R.drawable.gauge_finish_01, R.drawable.gauge_finish_02, R.drawable.gauge_finish_03, R.drawable.gauge_finish_04, R.drawable.gauge_finish_05
        });
    }

    static j a()
    {
        if (b == null)
        {
            b = new j();
        }
        return b;
    }

    final b a(ImageView imageview)
    {
        return new b(imageview, c, 25);
    }

    final b b(ImageView imageview)
    {
        return new b(imageview, d, 1);
    }

    final b c(ImageView imageview)
    {
        return new b(imageview, e, 30);
    }

    final b d(ImageView imageview)
    {
        return new b(imageview, g, 25);
    }

    final b e(ImageView imageview)
    {
        return new b(imageview, f, 40);
    }
}
