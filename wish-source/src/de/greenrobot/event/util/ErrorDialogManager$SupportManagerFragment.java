// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import de.greenrobot.event.EventBus;

// Referenced classes of package de.greenrobot.event.util:
//            ErrorDialogManager, ErrorDialogFragmentFactory, ErrorDialogConfig, ThrowableFailureEvent

public static class  extends Fragment
{

    protected Bundle argumentsForErrorDialog;
    private EventBus eventBus;
    private Object executionScope;
    protected boolean finishAfterDialog;
    private boolean skipRegisterOnNextResume;

    public static void attachTo(Activity activity, Object obj, boolean flag, Bundle bundle)
    {
        FragmentManager fragmentmanager = ((FragmentActivity)activity).getSupportFragmentManager();
          = ()fragmentmanager.findFragmentByTag("de.greenrobot.eventbus.error_dialog_manager");
        activity = ;
        if ( == null)
        {
            activity = new <init>();
            fragmentmanager.beginTransaction().add(activity, "de.greenrobot.eventbus.error_dialog_manager").commit();
            fragmentmanager.executePendingTransactions();
        }
        activity.finishAfterDialog = flag;
        activity.argumentsForErrorDialog = bundle;
        activity.executionScope = obj;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        eventBus = ErrorDialogManager.factory.config.getEventBus();
        eventBus.register(this);
        skipRegisterOnNextResume = true;
    }

    public void onEventMainThread(ThrowableFailureEvent throwablefailureevent)
    {
        if (ErrorDialogManager.access$000(executionScope, throwablefailureevent))
        {
            ErrorDialogManager.checkLogException(throwablefailureevent);
            FragmentManager fragmentmanager = getFragmentManager();
            fragmentmanager.executePendingTransactions();
            DialogFragment dialogfragment = (DialogFragment)fragmentmanager.findFragmentByTag("de.greenrobot.eventbus.error_dialog");
            if (dialogfragment != null)
            {
                dialogfragment.dismiss();
            }
            throwablefailureevent = (DialogFragment)ErrorDialogManager.factory.prepareErrorFragment(throwablefailureevent, finishAfterDialog, argumentsForErrorDialog);
            if (throwablefailureevent != null)
            {
                throwablefailureevent.show(fragmentmanager, "de.greenrobot.eventbus.error_dialog");
                return;
            }
        }
    }

    public void onPause()
    {
        eventBus.unregister(this);
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        if (skipRegisterOnNextResume)
        {
            skipRegisterOnNextResume = false;
            return;
        } else
        {
            eventBus = ErrorDialogManager.factory.config.getEventBus();
            eventBus.register(this);
            return;
        }
    }

    public ()
    {
    }
}
