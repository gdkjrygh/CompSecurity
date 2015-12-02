// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.support.v4.content.ContextCompat;

// Referenced classes of package android.support.v4.app:
//            ActivityCompat21, FragmentActivity

public class ActivityCompat extends ContextCompat
{

    public static void finishAfterTransition(Activity activity)
    {
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                ActivityCompat21.finishAfterTransition(activity);
                if (FragmentActivity.a == 0)
                {
                    break label0;
                }
            }
            activity.finish();
        }
    }
}
