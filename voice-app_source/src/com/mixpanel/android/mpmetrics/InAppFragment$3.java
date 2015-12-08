// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.MotionEvent;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            InAppFragment, InAppNotification, MixpanelAPI

class this._cls0
    implements android.view.OnGestureListener
{

    final InAppFragment this$0;

    public boolean onDown(MotionEvent motionevent)
    {
        return true;
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (f1 > 0.0F)
        {
            InAppFragment.access$0(InAppFragment.this);
        }
        return true;
    }

    public void onLongPress(MotionEvent motionevent)
    {
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return false;
    }

    public void onShowPress(MotionEvent motionevent)
    {
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        motionevent = InAppFragment.access$2(InAppFragment.this).getInAppNotification();
        Object obj = motionevent.getCallToActionUrl();
        if (obj != null && ((String) (obj)).length() > 0)
        {
            try
            {
                obj = Uri.parse(((String) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                Log.i("MixpanelAPI.InAppFrag", "Can't parse notification URI, will not take any action", motionevent);
                return true;
            }
            try
            {
                Intent intent = new Intent("android.intent.action.VIEW", ((Uri) (obj)));
                InAppFragment.access$4(InAppFragment.this).startActivity(intent);
                InAppFragment.access$5(InAppFragment.this).getPeople().trackNotification("$campaign_open", motionevent);
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                Log.i("MixpanelAPI.InAppFrag", (new StringBuilder("User doesn't have an activity for notification URI ")).append(obj).toString());
            }
        }
        InAppFragment.access$0(InAppFragment.this);
        return true;
    }

    le()
    {
        this$0 = InAppFragment.this;
        super();
    }
}
