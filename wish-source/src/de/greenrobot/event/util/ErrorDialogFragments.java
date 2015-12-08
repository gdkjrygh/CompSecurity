// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import de.greenrobot.event.EventBus;

// Referenced classes of package de.greenrobot.event.util:
//            ErrorDialogManager, ErrorDialogFragmentFactory, ErrorDialogConfig

public class ErrorDialogFragments
{
    public static class Honeycomb extends DialogFragment
        implements android.content.DialogInterface.OnClickListener
    {

        public void onClick(DialogInterface dialoginterface, int i)
        {
            ErrorDialogFragments.handleOnClick(dialoginterface, i, getActivity(), getArguments());
        }

        public Dialog onCreateDialog(Bundle bundle)
        {
            return ErrorDialogFragments.createDialog(getActivity(), getArguments(), this);
        }

        public Honeycomb()
        {
        }
    }

    public static class Support extends android.support.v4.app.DialogFragment
        implements android.content.DialogInterface.OnClickListener
    {

        public void onClick(DialogInterface dialoginterface, int i)
        {
            ErrorDialogFragments.handleOnClick(dialoginterface, i, getActivity(), getArguments());
        }

        public Dialog onCreateDialog(Bundle bundle)
        {
            return ErrorDialogFragments.createDialog(getActivity(), getArguments(), this);
        }

        public Support()
        {
        }
    }


    public static int ERROR_DIALOG_ICON = 0;
    public static Class EVENT_TYPE_ON_CLICK;

    public ErrorDialogFragments()
    {
    }

    public static Dialog createDialog(Context context, Bundle bundle, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        context = new android.app.AlertDialog.Builder(context);
        context.setTitle(bundle.getString("de.greenrobot.eventbus.errordialog.title"));
        context.setMessage(bundle.getString("de.greenrobot.eventbus.errordialog.message"));
        if (ERROR_DIALOG_ICON != 0)
        {
            context.setIcon(ERROR_DIALOG_ICON);
        }
        context.setPositiveButton(0x104000a, onclicklistener);
        return context.create();
    }

    public static void handleOnClick(DialogInterface dialoginterface, int i, Activity activity, Bundle bundle)
    {
        if (EVENT_TYPE_ON_CLICK != null)
        {
            try
            {
                dialoginterface = ((DialogInterface) (EVENT_TYPE_ON_CLICK.newInstance()));
            }
            // Misplaced declaration of an exception variable
            catch (DialogInterface dialoginterface)
            {
                throw new RuntimeException("Event cannot be constructed", dialoginterface);
            }
            ErrorDialogManager.factory.config.getEventBus().post(dialoginterface);
        }
        if (bundle.getBoolean("de.greenrobot.eventbus.errordialog.finish_after_dialog", false) && activity != null)
        {
            activity.finish();
        }
    }

}
